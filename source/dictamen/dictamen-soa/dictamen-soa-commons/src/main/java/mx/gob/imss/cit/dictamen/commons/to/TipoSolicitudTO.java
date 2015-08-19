package mx.gob.imss.cit.dictamen.commons.to;

import java.util.Date;
import java.util.List;

public class TipoSolicitudTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2181056723321544698L;

	private long cveIdTipoSolicitud;

	private String desTipoSolicitud;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private List<SolicitudTO> ditSolicituds;

	/**
	 * @return the cveIdTipoSolicitud
	 */
	public long getCveIdTipoSolicitud() {
		return cveIdTipoSolicitud;
	}

	/**
	 * @param cveIdTipoSolicitud the cveIdTipoSolicitud to set
	 */
	public void setCveIdTipoSolicitud(long cveIdTipoSolicitud) {
		this.cveIdTipoSolicitud = cveIdTipoSolicitud;
	}

	/**
	 * @return the desTipoSolicitud
	 */
	public String getDesTipoSolicitud() {
		return desTipoSolicitud;
	}

	/**
	 * @param desTipoSolicitud the desTipoSolicitud to set
	 */
	public void setDesTipoSolicitud(String desTipoSolicitud) {
		this.desTipoSolicitud = desTipoSolicitud;
	}

	/**
	 * @return the fecRegistroActualizado
	 */
	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado != null ? (Date) fecRegistroActualizado.clone() : null;
	}

	/**
	 * @param fecRegistroActualizado the fecRegistroActualizado to set
	 */
	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}

	/**
	 * @return the fecRegistroAlta
	 */
	public Date getFecRegistroAlta() {
		return fecRegistroAlta != null ? (Date) fecRegistroAlta.clone() : null;
	}

	/**
	 * @param fecRegistroAlta the fecRegistroAlta to set
	 */
	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}

	/**
	 * @return the fecRegistroBaja
	 */
	public Date getFecRegistroBaja() {
		return fecRegistroBaja != null ? (Date) fecRegistroBaja.clone() : null;
	}

	/**
	 * @param fecRegistroBaja the fecRegistroBaja to set
	 */
	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}

	/**
	 * @return the ditSolicituds
	 */
	public List<SolicitudTO> getDitSolicituds() {
		return ditSolicituds;
	}

	/**
	 * @param ditSolicituds the ditSolicituds to set
	 */
	public void setDitSolicituds(List<SolicitudTO> ditSolicituds) {
		this.ditSolicituds = ditSolicituds;
	}


	
	
	
}
