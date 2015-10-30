package mx.gob.imss.cit.dictamen.contador.commons.to.domain;

import java.io.Serializable;

public class TramiteSolicitudTO implements Serializable{

	private static final long serialVersionUID = -5570685891152085076L;
   
	public Long getIdTipoTramite() {
		return idTipoTramite;
	}
	public void setIdTipoTramite(Long idTipoTramite) {
		this.idTipoTramite = idTipoTramite;
	}
	public String getIdTipoSolicitud() {
		return idTipoSolicitud;
	}
	public void setIdTipoSolicitud(String idTipoSolicitud) {
		this.idTipoSolicitud = idTipoSolicitud;
	}
	public String getNss() {
		return nss;
	}
	public void setNss(String nss) {
		this.nss = nss;
	}
	public Long getIdAsignacionNss() {
		return idAsignacionNss;
	}
	public void setIdAsignacionNss(Long idAsignacionNss) {
		this.idAsignacionNss = idAsignacionNss;
	}
	private Long idTipoTramite;
    private String idTipoSolicitud;
    private String nss;
    private Long idAsignacionNss;
    
}
