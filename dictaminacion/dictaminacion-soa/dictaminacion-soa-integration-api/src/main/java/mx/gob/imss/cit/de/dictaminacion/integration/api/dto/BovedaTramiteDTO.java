package mx.gob.imss.cit.de.dictaminacion.integration.api.dto;

import java.util.List;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.base.BaseDTO;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class BovedaTramiteDTO extends BaseDTO{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<BovedaActorDTO> actores;
	private String fecha;
	private String folioTramite;
	private String org;
	private String tramite;
	private String zona;
	
	public List<BovedaActorDTO> getActores() {
		return actores;
	}
	public void setActores(List<BovedaActorDTO> actores) {
		this.actores = actores;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getFolioTramite() {
		return folioTramite;
	}
	public void setFolioTramite(String folioTramite) {
		this.folioTramite = folioTramite;
	}
	public String getOrg() {
		return org;
	}
	public void setOrg(String org) {
		this.org = org;
	}
	public String getTramite() {
		return tramite;
	}
	public void setTramite(String tramite) {
		this.tramite = tramite;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}		
}

