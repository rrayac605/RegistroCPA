package mx.gob.imss.cit.de.dictaminacion.integration.api.dto;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.base.BaseDTO;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class BovedaActorDTO extends BaseDTO{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String isOwner;
	private String org;
	private String rol;
	private String tipoId;
	private String zona;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIsOwner() {
		return isOwner;
	}
	public void setIsOwner(String isOwner) {
		this.isOwner = isOwner;
	}
	public String getOrg() {
		return org;
	}
	public void setOrg(String org) {
		this.org = org;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getTipoId() {
		return tipoId;
	}
	public void setTipoId(String tipoId) {
		this.tipoId = tipoId;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}	
}

