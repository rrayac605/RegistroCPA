package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class RegBajaReactivTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1794049815218156582L;

	private long cveIdCpaRegistro;

	private String cveIdUsuario;

	private String desComentarios;

	private Date fecAutorizacionMovimiento;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private Date fecSolicitudMovimiento;

	private List<DoctosProbCpaTO> ndtDoctosProbCpas;

	private TramiteTO ditTramite;

	private EstadoCpaTO ndcEstadoCpa;

	private ContadorPublicoTO ndtContadorPublicoAut;

	/**
	 * @return the cveIdCpaRegistro
	 */
	public long getCveIdCpaRegistro() {
		return cveIdCpaRegistro;
	}

	/**
	 * @param cveIdCpaRegistro the cveIdCpaRegistro to set
	 */
	public void setCveIdCpaRegistro(long cveIdCpaRegistro) {
		this.cveIdCpaRegistro = cveIdCpaRegistro;
	}

	/**
	 * @return the cveIdUsuario
	 */
	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	/**
	 * @param cveIdUsuario the cveIdUsuario to set
	 */
	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	/**
	 * @return the desComentarios
	 */
	public String getDesComentarios() {
		return desComentarios;
	}

	/**
	 * @param desComentarios the desComentarios to set
	 */
	public void setDesComentarios(String desComentarios) {
		this.desComentarios = desComentarios;
	}

	/**
	 * @return the fecAutorizacionMovimiento
	 */
	public Date getFecAutorizacionMovimiento() {
		return fecAutorizacionMovimiento != null ? (Date) fecAutorizacionMovimiento.clone() : null;
	}

	/**
	 * @param fecAutorizacionMovimiento the fecAutorizacionMovimiento to set
	 */
	public void setFecAutorizacionMovimiento(Date fecAutorizacionMovimiento) {
		this.fecAutorizacionMovimiento = fecAutorizacionMovimiento;
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
	 * @return the fecSolicitudMovimiento
	 */
	public Date getFecSolicitudMovimiento() {
		return fecSolicitudMovimiento != null ? (Date) fecSolicitudMovimiento.clone() : null;
	}

	/**
	 * @param fecSolicitudMovimiento the fecSolicitudMovimiento to set
	 */
	public void setFecSolicitudMovimiento(Date fecSolicitudMovimiento) {
		this.fecSolicitudMovimiento = fecSolicitudMovimiento;
	}

	/**
	 * @return the ndtDoctosProbCpas
	 */
	public List<DoctosProbCpaTO> getNdtDoctosProbCpas() {
		return ndtDoctosProbCpas;
	}

	/**
	 * @param ndtDoctosProbCpas the ndtDoctosProbCpas to set
	 */
	public void setNdtDoctosProbCpas(List<DoctosProbCpaTO> ndtDoctosProbCpas) {
		this.ndtDoctosProbCpas = ndtDoctosProbCpas;
	}

	/**
	 * @return the ditTramite
	 */
	public TramiteTO getDitTramite() {
		return ditTramite;
	}

	/**
	 * @param ditTramite the ditTramite to set
	 */
	public void setDitTramite(TramiteTO ditTramite) {
		this.ditTramite = ditTramite;
	}

	/**
	 * @return the ndcEstadoCpa
	 */
	public EstadoCpaTO getNdcEstadoCpa() {
		return ndcEstadoCpa;
	}

	/**
	 * @param ndcEstadoCpa the ndcEstadoCpa to set
	 */
	public void setNdcEstadoCpa(EstadoCpaTO ndcEstadoCpa) {
		this.ndcEstadoCpa = ndcEstadoCpa;
	}

	/**
	 * @return the ndtContadorPublicoAut
	 */
	public ContadorPublicoTO getNdtContadorPublicoAut() {
		return ndtContadorPublicoAut;
	}

	/**
	 * @param ndtContadorPublicoAut the ndtContadorPublicoAut to set
	 */
	public void setNdtContadorPublicoAut(ContadorPublicoTO ndtContadorPublicoAut) {
		this.ndtContadorPublicoAut = ndtContadorPublicoAut;
	}

	
}
