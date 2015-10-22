package mx.gob.imss.cit.dictamen.contador.commons.to.domain;

import java.io.Serializable;


public class FirmaElectronicaTO implements Serializable {
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fiel == null) ? 0 : fiel.hashCode());
		result = prime * result + ((fielArchive == null) ? 0 : fielArchive.hashCode());
		result = prime * result + ((fielCode == null) ? 0 : fielCode.hashCode());
		result = prime * result + ((fielCodebase == null) ? 0 : fielCodebase.hashCode());
		result = prime * result + ((fielParamOption == null) ? 0 : fielParamOption.hashCode());
		result = prime * result + ((fielParamUrlWsAuth == null) ? 0 : fielParamUrlWsAuth.hashCode());
		result = prime * result + ((fielParamUrlWsFe == null) ? 0 : fielParamUrlWsFe.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FirmaElectronicaTO other = (FirmaElectronicaTO) obj;
		if (fiel == null) {
			if (other.fiel != null)
				return false;
		} else if (!fiel.equals(other.fiel))
			return false;
		if (fielArchive == null) {
			if (other.fielArchive != null)
				return false;
		} else if (!fielArchive.equals(other.fielArchive))
			return false;
		if (fielCode == null) {
			if (other.fielCode != null)
				return false;
		} else if (!fielCode.equals(other.fielCode))
			return false;
		if (fielCodebase == null) {
			if (other.fielCodebase != null)
				return false;
		} else if (!fielCodebase.equals(other.fielCodebase))
			return false;
		if (fielParamOption == null) {
			if (other.fielParamOption != null)
				return false;
		} else if (!fielParamOption.equals(other.fielParamOption))
			return false;
		if (fielParamUrlWsAuth == null) {
			if (other.fielParamUrlWsAuth != null)
				return false;
		} else if (!fielParamUrlWsAuth.equals(other.fielParamUrlWsAuth))
			return false;
		if (fielParamUrlWsFe == null) {
			if (other.fielParamUrlWsFe != null)
				return false;
		} else if (!fielParamUrlWsFe.equals(other.fielParamUrlWsFe))
			return false;
		return true;
	}

	
}
