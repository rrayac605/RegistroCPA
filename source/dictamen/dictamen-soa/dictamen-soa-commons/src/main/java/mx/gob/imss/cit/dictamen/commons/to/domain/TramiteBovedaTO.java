package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.List;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class TramiteBovedaTO {
	private List<ActorBovedaTO> actores;
	private String fecha;
	private String folioTramite;
	private String org;
	private String tramite;
	private String zona;
	
	public List<ActorBovedaTO> getActores() {
		return actores;
	}
	public void setActores(List<ActorBovedaTO> actores) {
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

