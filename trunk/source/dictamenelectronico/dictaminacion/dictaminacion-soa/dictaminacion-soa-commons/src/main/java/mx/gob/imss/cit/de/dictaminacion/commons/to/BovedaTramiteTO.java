package mx.gob.imss.cit.de.dictaminacion.commons.to;

import java.util.List;

import mx.gob.imss.cit.de.dictaminacion.commons.to.base.BaseTO;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class BovedaTramiteTO  extends BaseTO{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7632940575113673784L;
	private List<BovedaActorTO> actores;
	private String fecha;
	private String folioTramite;
	private String org;
	private String tramite;
	private String zona;
	
	public List<BovedaActorTO> getActores() {
		return actores;
	}
	public void setActores(List<BovedaActorTO> actores) {
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

