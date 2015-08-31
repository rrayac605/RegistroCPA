package mx.gob.imss.cit.dictamen.commons.to;

import java.util.Date;
import java.util.List;

public class EstadoSolicitudTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2311889797473392993L;

	private long cveIdEstadoSolicitud;

	private String desEstadoSolicitud;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private List<SolicitudTO> ditSolicituds;

	/**
	 * @return the cveIdEstadoSolicitud
	 */
	public long getCveIdEstadoSolicitud() {
		return cveIdEstadoSolicitud;
	}

	/**
	 * @param cveIdEstadoSolicitud the cveIdEstadoSolicitud to set
	 */
	public void setCveIdEstadoSolicitud(long cveIdEstadoSolicitud) {
		this.cveIdEstadoSolicitud = cveIdEstadoSolicitud;
	}

	/**
	 * @return the desEstadoSolicitud
	 */
	public String getDesEstadoSolicitud() {
		return desEstadoSolicitud;
	}

	/**
	 * @param desEstadoSolicitud the desEstadoSolicitud to set
	 */
	public void setDesEstadoSolicitud(String desEstadoSolicitud) {
		this.desEstadoSolicitud = desEstadoSolicitud;
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
