package mx.gob.imss.cit.dictamen.contador.commons.to.domain;

import java.io.Serializable;

public class GeneracionTramiteSolicitudTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -72090790551906913L;
	public long getIdSolicitud() {
		return idSolicitud;
	}
	public void setIdSolicitud(long idSolicitud) {
		this.idSolicitud = idSolicitud;
	}
	public long getIdTramite() {
		return idTramite;
	}
	public void setIdTramite(long idTramite) {
		this.idTramite = idTramite;
	}
	private long idSolicitud;
	private long idTramite;

}
