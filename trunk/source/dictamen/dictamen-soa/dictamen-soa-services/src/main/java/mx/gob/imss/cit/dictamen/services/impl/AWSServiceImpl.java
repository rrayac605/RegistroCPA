/**
 * 
 */
package mx.gob.imss.cit.dictamen.services.impl;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import mx.gob.imss.cit.dictamen.commons.enums.DictamenExceptionCodeEnum;
import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.AWSPolicyTO;
import mx.gob.imss.cit.dictamen.commons.util.FechasUtils;
import mx.gob.imss.cit.dictamen.services.AWSService;
import mx.gob.imss.cit.dictamen.services.constants.DictamenServicesConstants;
import mx.gob.imss.cit.dictamen.services.util.DictamenExceptionBuilder;
import mx.gob.imss.cit.dictamen.services.util.PropertiesConfigUtils;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;

/**
 * @author ajfuentes
 * 
 * http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-HTTPPOSTForms.html
 * 
 */
public class AWSServiceImpl implements AWSService {
	
	
	private static final Logger LOG=Logger.getLogger(AWSServiceImpl.class);

	private static final String POLICY_TEMPLATE = "{"
			+ " \"expiration\": \"#EXPIRATION#\","
			+ "  \"conditions\": [{\"bucket\": \"#BUCKET#\"}, [\"starts-with\", \"$key\", \"#KEY#\"],"
			+ "    {\"acl\": \"#ACL#\"},"
			+ "    {\"success_action_status\": \"#SUCCESS_ACTION_ESTATUS#\"},"
			+ "    [\"starts-with\", \"$Content-Type\", \"#CONTENT_TYPE#\"],"
			+ "    {\"x-amz-meta-uuid\": \"#X_AMZ_META_UUID#\"},"
			+ "    [\"starts-with\", \"$x-amz-meta-tag\", \"#X_AMZ_META_TAG#\"],"
			+ "    {\"x-amz-credential\": \"#X_AMZ_CREDENTIAL#\"},"
			+ "    {\"x-amz-algorithm\": \"#X_AMZ_ALGORITHM#\"},"
			+ "    {\"x-amz-date\": \"#X_AMZ_DATE#\" }" + "  ]" + "}";
	
	

	@Override
	public AWSPolicyTO getAwsPoliciyEncrypted(String rfcContador,String rfcPatron) throws DictamenException{
		AWSPolicyTO awsPolicyTO = new AWSPolicyTO();
		Date fechaFirma=new Date();
		String awsSecretKey=null;
		StringBuilder rutaDestino=null;
		 try {
			 
			awsSecretKey = PropertiesConfigUtils.getPropertyConfig(DictamenServicesConstants.CONFIG_KEY_AWS_SECRET_KEY);
			
			rutaDestino = new StringBuilder(PropertiesConfigUtils.getPropertyConfig(DictamenServicesConstants.CONFIG_KEY_AWS_RUTA_BASE));
			rutaDestino.append(DictamenServicesConstants.CARACTER_SLASH);
			rutaDestino.append(rfcContador);
			rutaDestino.append(DictamenServicesConstants.CARACTER_SLASH);
			rutaDestino.append(rfcPatron);
			rutaDestino.append(DictamenServicesConstants.CARACTER_SLASH);
			
			
			awsPolicyTO.setExpiration(FechasUtils.dateToString_yyyy_MM_dd_T_HH_mm_ss_Z(FechasUtils.agregaDias(fechaFirma, 1)));	
			awsPolicyTO.setBucket(PropertiesConfigUtils.getPropertyConfig(DictamenServicesConstants.CONFIG_KEY_AWS_BUCKET));
			awsPolicyTO.setSuccessActionStatus(PropertiesConfigUtils.getPropertyConfig(DictamenServicesConstants.CONFIG_KEY_AWS_SUCCESS_ACTION_ESTATUS));
			awsPolicyTO.setContentType(PropertiesConfigUtils.getPropertyConfig(DictamenServicesConstants.CONFIG_KEY_AWS_CONTENT_TYPE));
			awsPolicyTO.setxAmzMetaUuid(PropertiesConfigUtils.getPropertyConfig(DictamenServicesConstants.CONFIG_KEY_AWS_X_AMZ_META_UUID));
			awsPolicyTO.setxAmzMetaTag(PropertiesConfigUtils.getPropertyConfig(DictamenServicesConstants.CONFIG_KEY_AWS_X_AMZ_META_TAG));
			awsPolicyTO.setxAmzCredential(PropertiesConfigUtils.getPropertyConfig(DictamenServicesConstants.CONFIG_KEY_AWS_X_AMZ_CREDENTIAL));
			awsPolicyTO.setxAmzAlgorithm(PropertiesConfigUtils.getPropertyConfig(DictamenServicesConstants.CONFIG_KEY_AWS_X_AMZ_ALGORITHM));
			awsPolicyTO.setxAmzDate(FechasUtils.dateToString_yyyy_MM_dd_T_HH_mm_ss_Z(fechaFirma));
			awsPolicyTO.setUrl(PropertiesConfigUtils.getPropertyConfig(DictamenServicesConstants.CONFIG_KEY_AWS_URL));
			awsPolicyTO.setKey(rutaDestino.toString());			
			
			String policy=POLICY_TEMPLATE;
			policy.replaceAll("#EXPIRATION#", awsPolicyTO.getExpiration())
			.replaceAll("#BUCKET#", awsPolicyTO.getBucket())
			.replaceAll("#KEY#", awsPolicyTO.getKey())
			.replaceAll("#SUCCESS_ACTION_ESTATUS#", awsPolicyTO.getSuccessActionStatus())
			.replaceAll("#CONTENT_TYPE#", awsPolicyTO.getContentType())
			.replaceAll("#X_AMZ_META_UUID#", awsPolicyTO.getxAmzMetaUuid())
			.replaceAll("#X_AMZ_META_TAG#", awsPolicyTO.getxAmzMetaTag())
			.replaceAll("#X_AMZ_CREDENTIAL#", awsPolicyTO.getxAmzCredential())
			.replaceAll("#X_AMZ_ALGORITHM#", awsPolicyTO.getxAmzAlgorithm())
			.replaceAll("#X_AMZ_DATE#", awsPolicyTO.getxAmzDate());
			
			
			Mac hmac = Mac.getInstance(DictamenServicesConstants.ALGORITHM_HMACSHA1);
			hmac.init(new SecretKeySpec(awsSecretKey.getBytes(DictamenServicesConstants.ENCODING_UTF8), DictamenServicesConstants.ALGORITHM_HMACSHA1));			
			String policy64=Base64.encodeBase64String(policy.getBytes(DictamenServicesConstants.ENCODING_UTF8));
			String signature = Base64.encodeBase64String( hmac.doFinal(policy64.getBytes(DictamenServicesConstants.ENCODING_UTF8)));
			
			awsPolicyTO.setPolicy(policy64);
			awsPolicyTO.setSignature(signature);
			
		} catch (UnsupportedEncodingException e) {
			LOG.error(e.getMessage(), e);
			throw DictamenExceptionBuilder.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_AWS_OBTENER_POLITICA);
		} catch (NoSuchAlgorithmException e) {
			LOG.error(e.getMessage(), e);
			throw DictamenExceptionBuilder.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_AWS_OBTENER_POLITICA);
		} catch (InvalidKeyException e) {
			LOG.error(e.getMessage(), e);
			throw DictamenExceptionBuilder.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_AWS_OBTENER_POLITICA);
		}

		return awsPolicyTO;
	}


}
