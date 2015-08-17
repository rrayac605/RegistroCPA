package mx.gob.imss.cit.dictamen.commons.to;

/**
 * Clase de to para la firma electronica
 * @author ajfuentes
 *
 */
public class FirmaElectronicaTO extends BaseTO{
	/**
	 * UID
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Cadena de firma electrónica
	 */
	private String fiel;
	/**
	 * Nombre de archivo jar de firma electrónica
	 */
	private String fielArchive;
	/**
	 * Nombre paquete de código 
	 */
	private String fielCode;
	/**
	 * Url de applet
	 */
	private String fielCodebase;
	/**
	 * Opción de applet para firma electronica
	 */
	private String fielParamOption;
	/**
	 * Url de servicio de firma electrónica
	 */
	private String fielParamUrlWsFe;
	/**
	 * Url de servicio de autenticación
	 */
	private String fielParamUrlWsAuth;

	/**
	 * Obtener cadena de firma electrónica
	 */
	public String getFiel() {
		return fiel;
	}
	/**
	 * Establecer cadena de firma electrónica
	 */
	public void setFiel(String fiel) {
		this.fiel = fiel;
	}
	/**
	 * Obtener nombre de archivo jar de firma electrónica
	 */
	public String getFielArchive() {
		return fielArchive;
	}
	/**
	 * Obtener nombre paquete de código 
	 */
	public String getFielCode() {
		return fielCode;
	}
	/**
	 * Obtener url de applet
	 */
	public String getFielCodebase() {
		return fielCodebase;
	}
	/**
	 * Obtener opción de applet para firma electronica
	 */
	public String getFielParamOption() {
		return fielParamOption;
	}
	/**
	 * Obtener url de servicio de firma electrónica
	 */
	public String getFielParamUrlWsFe() {
		return fielParamUrlWsFe;
	}
	/**
	 * Obtener url de servicio de autenticación
	 */
	public String getFielParamUrlWsAuth() {
		return fielParamUrlWsAuth;
	}
	/**
	 * @param fielArchive the fielArchive to set
	 */
	public void setFielArchive(String fielArchive) {
		this.fielArchive = fielArchive;
	}
	/**
	 * @param fielCode the fielCode to set
	 */
	public void setFielCode(String fielCode) {
		this.fielCode = fielCode;
	}
	/**
	 * @param fielCodebase the fielCodebase to set
	 */
	public void setFielCodebase(String fielCodebase) {
		this.fielCodebase = fielCodebase;
	}
	/**
	 * @param fielParamOption the fielParamOption to set
	 */
	public void setFielParamOption(String fielParamOption) {
		this.fielParamOption = fielParamOption;
	}
	/**
	 * @param fielParamUrlWsFe the fielParamUrlWsFe to set
	 */
	public void setFielParamUrlWsFe(String fielParamUrlWsFe) {
		this.fielParamUrlWsFe = fielParamUrlWsFe;
	}
	/**
	 * @param fielParamUrlWsAuth the fielParamUrlWsAuth to set
	 */
	public void setFielParamUrlWsAuth(String fielParamUrlWsAuth) {
		this.fielParamUrlWsAuth = fielParamUrlWsAuth;
	}


}
