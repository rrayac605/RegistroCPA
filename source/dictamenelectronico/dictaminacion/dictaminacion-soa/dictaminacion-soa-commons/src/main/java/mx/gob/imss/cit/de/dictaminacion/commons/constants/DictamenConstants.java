package mx.gob.imss.cit.de.dictaminacion.commons.constants;


/**
 * The Class PortalConstants.
 */
public final class DictamenConstants {

	/**
	 * Instantiates a new portal constants.
	 */
	private DictamenConstants() {
		
	}
	
	//constantes para propiedades
	public static final String CONFIG_FILE="dictamen-config";
	public static final String EXCEPTION_FILE="exception-service-config";

	public static final String CONFIG_KEY_BOVEDA_ENDPOINT="bovedaws.endpoint";
	public static final String CONFIG_KEY_BOVEDA_NAMESPACE="bovedaws.namespace";
	public static final String CONFIG_KEY_BOVEDA_SERVICE="bovedaws.service";
	
	public static final String CONFIG_KEY_BDTU_ENDPOINT="bdtu.endpoint";
	public static final String CONFIG_KEY_BDTU_NAMESPACE="bdtu.namespace";
	public static final String CONFIG_KEY_BDTU_SERVICE="bdtu.service";
	
	public static final String CONFIG_KEY_AWS_BUCKET="aws.bucket";
	public static final String CONFIG_KEY_AWS_SUCCESS_ACTION_ESTATUS="aws.success_action_status";
	public static final String CONFIG_KEY_AWS_CONTENT_TYPE="aws.content-type";
	public static final String CONFIG_KEY_AWS_X_AMZ_META_UUID="aws.x-amz-meta-uuid";
	public static final String CONFIG_KEY_AWS_X_AMZ_META_TAG="aws.x-amz-meta-tag";
	public static final String CONFIG_KEY_AWS_X_AMZ_CREDENTIAL="aws.x-amz-credential";
	public static final String CONFIG_KEY_AWS_X_AMZ_ALGORITHM="aws.x-amz-algorithm";
	public static final String CONFIG_KEY_AWS_URL="aws.url";
	public static final String CONFIG_KEY_AWS_SECRET_KEY="aws.aws_secret_key";	
	public static final String CONFIG_KEY_AWS_RUTA_BASE="aws.ruta_base";	
	public static final String CONFIG_KEY_AWS_ACL="aws.acl";	
	public static final String CONFIG_KEY_AWS_ACCESS_KEY_ID="aws.awsAccessKeyId";	
	
	public static final String CONFIG_KEY_URL_APPLET_FIEL="firma.URL_APPLET_FIEL";	
	public static final String CONFIG_KEY_FIEL_ARCHIVE="firma.FIEL_ARCHIVE";	
	public static final String CONFIG_KEY_FIEL_CODE="firma.FIEL_CODE";	
	public static final String CONFIG_KEY_FIEL_CODEBASE="firma.FIEL_CODEBASE";	
	public static final String CONFIG_KEY_FIEL_PARAM_OPTION="firma.FIEL_PARAM_OPTION";	
	public static final String CONFIG_KEY_FIEL_PARAM_URL_WS_FE="firma.FIEL_PARAM_URL_WS_FE";	
	public static final String CONFIG_KEY_FIEL_PARAM_URL_WS_AUTH="firma.FIEL_PARAM_URL_WS_AUTH";


	public static final String CARACTER_SLASH="/";
	public static final String CARACTER_SPACE=" ";
	public static final String CARACTER_SALTO="\n";
	public static final String CARACTER_VACIO="";
	
	public static final String SEPARADOR_PARAM_ARCHIVO="#";
	public static final String SEPARADOR_PARAM_CLAVE="-";
	public static final int PROFUNDIDAD_MAPEO=4;
	public static final String ENCODING_UTF8="UTF-8";
	public static final String ALGORITHM_HMACSHA1="HmacSHA1";
	
	public static final String ESTADO_ACTIVO="1";
	public static final String ESTADO_INACTIVO="2";
	
	
	
	
	
}