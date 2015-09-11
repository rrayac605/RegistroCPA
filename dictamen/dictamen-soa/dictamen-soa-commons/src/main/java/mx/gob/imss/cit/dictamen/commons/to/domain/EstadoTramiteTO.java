package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class EstadoTramiteTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4794547069302354611L;

	private long cveIdEstadoTramite;

	private String desEstadoTramite;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private String refSigla;

	private List<TramiteTO> ditTramites;

	/**
	 * @return the cveIdEstadoTramite
	 */
	public long getCveIdEstadoTramite() {
		return cveIdEstadoTramite;
	}

	/**
	 * @param cveIdEstadoTramite the cveIdEstadoTramite to set
	 */
	public void setCveIdEstadoTramite(long cveIdEstadoTramite) {
		this.cveIdEstadoTramite = cveIdEstadoTramite;
	}

	/**
	 * @return the desEstadoTramite
	 */
	public String getDesEstadoTramite() {
		return desEstadoTramite;
	}

	/**
	 * @param desEstadoTramite the desEstadoTramite to set
	 */
	public void setDesEstadoTramite(String desEstadoTramite) {
		this.desEstadoTramite = desEstadoTramite;
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
	 * @return the refSigla
	 */
	public String getRefSigla() {
		return refSigla;
	}

	/**
	 * @param refSigla the refSigla to set
	 */
	public void setRefSigla(String refSigla) {
		this.refSigla = refSigla;
	}

	/**
	 * @return the ditTramites
	 */
	public List<TramiteTO> getDitTramites() {
		return ditTramites;
	}

	/**
	 * @param ditTramites the ditTramites to set
	 */
	public void setDitTramites(List<TramiteTO> ditTramites) {
		this.ditTramites = ditTramites;
	}

	
	
}
