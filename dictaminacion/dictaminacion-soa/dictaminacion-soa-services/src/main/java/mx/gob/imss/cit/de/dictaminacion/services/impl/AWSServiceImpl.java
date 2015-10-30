/**
 * 
 */
package mx.gob.imss.cit.de.dictaminacion.services.impl;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.ejb.Stateless;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;

import mx.gob.imss.cit.de.dictaminacion.commons.constants.DictamenConstants;
import mx.gob.imss.cit.de.dictaminacion.commons.enums.DictamenExceptionCodeEnum;
import mx.gob.imss.cit.de.dictaminacion.commons.exception.DictamenException;
import mx.gob.imss.cit.de.dictaminacion.commons.to.AWSPolicyTO;
import mx.gob.imss.cit.de.dictaminacion.commons.util.FechasUtils;
import mx.gob.imss.cit.de.dictaminacion.services.AWSService;
import mx.gob.imss.cit.de.dictaminacion.services.util.DictamenExceptionBuilder;
import mx.gob.imss.cit.de.dictaminacion.services.util.PropertiesConfigUtils;

/**
 * @author ajfuentes
 * 
 * http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-HTTPPOSTForms.html
 * 
 */

@Stateless
public class AWSServiceImpl implements AWSService {
	
	private static final Logger LOG=Logger.getLogger(AWSServiceImpl.class);
	
	private static final String X_AMZ_DATE = "#X_AMZ_DATE#";

	private static final String X_AMZ_ALGORITHM = "#X_AMZ_ALGORITHM#";

	private static final String X_AMZ_CREDENTIAL = "#X_AMZ_CREDENTIAL#";

	private static final String X_AMZ_META_TAG = "#X_AMZ_META_TAG#";

	private static final String X_AMZ_META_UUID = "#X_AMZ_META_UUID#";

	private static final String CONTENT_TYPE = "#CONTENT_TYPE#";

	private static final String SUCCESS_ACTION_ESTATUS = "#SUCCESS_ACTION_ESTATUS#";

	private static final String ACL = "#ACL#";

	private static final String KEY = "#KEY#";

	private static final String BUCKET = "#BUCKET#";

	private static final String EXPIRATION = "#EXPIRATION#";

	private static String POLICY_TEMPLATE="{ \"expiration\": \"#EXPIRATION#\",\n" +
											"  \"conditions\": [\n" +
											"    {\"bucket\": \"#BUCKET#\"},\n" +
											"    [\"starts-with\", \"$key\", \"#KEY#\"],\n" +
											"    {\"acl\": \"#ACL#\"},\n" +
											"    {\"success_action_status\": \"#SUCCESS_ACTION_ESTATUS#\"},\n" +
											"    [\"starts-with\", \"$Content-Type\", \"#CONTENT_TYPE#\"],\n" +
											"    {\"x-amz-meta-uuid\": \"#X_AMZ_META_UUID#\"},\n" +
											"    [\"starts-with\", \"$x-amz-meta-tag\", \"#X_AMZ_META_TAG#\"],\n" +
											"\n" +
											"    {\"x-amz-credential\": \"#X_AMZ_CREDENTIAL#\"},\n" +
											"    {\"x-amz-algorithm\": \"#X_AMZ_ALGORITHM#\"},\n" +
											"    {\"x-amz-date\": \"#X_AMZ_DATE#\" },\n" +
											"    [\"starts-with\", \"$javax.faces.ViewState\", \"\"]\n" +
											"  ]\n" +
											"}";	

	@Override
	public AWSPolicyTO getAwsPoliciyEncrypted(Date fechaFirma,String rutaDestino) throws DictamenException{
		AWSPolicyTO awsPolicyTO = new AWSPolicyTO();
		
		String awsSecretKey=null;

		 try {
			 
			awsSecretKey = PropertiesConfigUtils.getPropertyConfig(DictamenConstants.CONFIG_KEY_AWS_SECRET_KEY);
			
			awsPolicyTO.setExpiration(FechasUtils.dateToString_yyyy_MM_dd_T_HH_mm_ss_Z(fechaFirma));	
			awsPolicyTO.setAcl(PropertiesConfigUtils.getPropertyConfig(DictamenConstants.CONFIG_KEY_AWS_ACL));
			awsPolicyTO.setBucket(PropertiesConfigUtils.getPropertyConfig(DictamenConstants.CONFIG_KEY_AWS_BUCKET));
			awsPolicyTO.setAwsAccessKeyId(PropertiesConfigUtils.getPropertyConfig(DictamenConstants.CONFIG_KEY_AWS_ACCESS_KEY_ID));
			awsPolicyTO.setSuccessActionStatus(PropertiesConfigUtils.getPropertyConfig(DictamenConstants.CONFIG_KEY_AWS_SUCCESS_ACTION_ESTATUS));
			awsPolicyTO.setContentType(PropertiesConfigUtils.getPropertyConfig(DictamenConstants.CONFIG_KEY_AWS_CONTENT_TYPE));
			awsPolicyTO.setXamzMetaUuid(PropertiesConfigUtils.getPropertyConfig(DictamenConstants.CONFIG_KEY_AWS_X_AMZ_META_UUID));
			awsPolicyTO.setXamzMetaTag(PropertiesConfigUtils.getPropertyConfig(DictamenConstants.CONFIG_KEY_AWS_X_AMZ_META_TAG));
			awsPolicyTO.setXamzCredential(PropertiesConfigUtils.getPropertyConfig(DictamenConstants.CONFIG_KEY_AWS_X_AMZ_CREDENTIAL));
			awsPolicyTO.setXamzAlgorithm(PropertiesConfigUtils.getPropertyConfig(DictamenConstants.CONFIG_KEY_AWS_X_AMZ_ALGORITHM));
			awsPolicyTO.setXamzDate(FechasUtils.dateToString_yyyyMMddTHHmmssZ(fechaFirma));
			awsPolicyTO.setUrl(PropertiesConfigUtils.getPropertyConfig(DictamenConstants.CONFIG_KEY_AWS_URL));
		
			awsPolicyTO.setKey(rutaDestino);			
			
			String policy=POLICY_TEMPLATE.replaceAll(DictamenConstants.CARACTER_SALTO, DictamenConstants.CARACTER_VACIO);
			policy=policy.replaceAll(EXPIRATION, awsPolicyTO.getExpiration())
						.replaceAll(BUCKET, awsPolicyTO.getBucket())
						.replaceAll(KEY, awsPolicyTO.getKey())
						.replaceAll(ACL, awsPolicyTO.getAcl())
						.replaceAll(SUCCESS_ACTION_ESTATUS, awsPolicyTO.getSuccessActionStatus())
						.replaceAll(CONTENT_TYPE, awsPolicyTO.getContentType())
						.replaceAll(X_AMZ_META_UUID, awsPolicyTO.getXamzMetaUuid())
						.replaceAll(X_AMZ_META_TAG, awsPolicyTO.getXamzMetaTag())
						.replaceAll(X_AMZ_CREDENTIAL, awsPolicyTO.getXamzCredential())
						.replaceAll(X_AMZ_ALGORITHM, awsPolicyTO.getXamzAlgorithm())
						.replaceAll(X_AMZ_DATE, awsPolicyTO.getXamzDate());
			LOG.debug(policy);
			
			Mac hmac = Mac.getInstance(DictamenConstants.ALGORITHM_HMACSHA1);
			hmac.init(new SecretKeySpec(awsSecretKey.getBytes(DictamenConstants.ENCODING_UTF8), DictamenConstants.ALGORITHM_HMACSHA1));			
			String policy64=Base64.encodeBase64String(policy.getBytes(DictamenConstants.ENCODING_UTF8));
			String signature = Base64.encodeBase64String( hmac.doFinal(policy64.getBytes(DictamenConstants.ENCODING_UTF8)));
			
			awsPolicyTO.setPolicy(policy64);
			awsPolicyTO.setSignature(signature);
			
		} catch (UnsupportedEncodingException e) {
			LOG.error(e.getMessage(), e);
			throw DictamenExceptionBuilder.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_AWS_OBTENER_POLITICA,e);
		} catch (NoSuchAlgorithmException e) {
			LOG.error(e.getMessage(), e);
			throw DictamenExceptionBuilder.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_AWS_OBTENER_POLITICA,e);
		} catch (InvalidKeyException e) {
			LOG.error(e.getMessage(), e);
			throw DictamenExceptionBuilder.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_AWS_OBTENER_POLITICA,e);
		}

		return awsPolicyTO;
	}


}
