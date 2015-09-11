package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.math.BigDecimal;
import java.util.Date;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class R1DomFiscalTO extends BaseTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3932386770350461051L;

	private long cveIdR1DomFiscal;

	private String cedulaProfesional;

	private String curp;

	private BigDecimal cveIdCpa;

	private String cveIdUsuario;

	private String desTituloExpedidoPor;

	private Date fecExpedicionCedprof;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private Date fecSolicitudR1;

	private DomicilioGeograficoTO dgDomicilioGeografico;

	private SubdelegacionTO dicSubdelegacion;

	private TramiteTO ditTramite;

	/**
	 * @return the cveIdR1DomFiscal
	 */
	public long getCveIdR1DomFiscal() {
		return cveIdR1DomFiscal;
	}

	/**
	 * @param cveIdR1DomFiscal the cveIdR1DomFiscal to set
	 */
	public void setCveIdR1DomFiscal(long cveIdR1DomFiscal) {
		this.cveIdR1DomFiscal = cveIdR1DomFiscal;
	}

	/**
	 * @return the cedulaProfesional
	 */
	public String getCedulaProfesional() {
		return cedulaProfesional;
	}

	/**
	 * @param cedulaProfesional the cedulaProfesional to set
	 */
	public void setCedulaProfesional(String cedulaProfesional) {
		this.cedulaProfesional = cedulaProfesional;
	}

	/**
	 * @return the curp
	 */
	public String getCurp() {
		return curp;
	}

	/**
	 * @param curp the curp to set
	 */
	public void setCurp(String curp) {
		this.curp = curp;
	}

	/**
	 * @return the cveIdCpa
	 */
	public BigDecimal getCveIdCpa() {
		return cveIdCpa;
	}

	/**
	 * @param cveIdCpa the cveIdCpa to set
	 */
	public void setCveIdCpa(BigDecimal cveIdCpa) {
		this.cveIdCpa = cveIdCpa;
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
	 * @return the desTituloExpedidoPor
	 */
	public String getDesTituloExpedidoPor() {
		return desTituloExpedidoPor;
	}

	/**
	 * @param desTituloExpedidoPor the desTituloExpedidoPor to set
	 */
	public void setDesTituloExpedidoPor(String desTituloExpedidoPor) {
		this.desTituloExpedidoPor = desTituloExpedidoPor;
	}

	/**
	 * @return the fecExpedicionCedprof
	 */
	public Date getFecExpedicionCedprof() {
		return fecExpedicionCedprof != null ? (Date) fecExpedicionCedprof.clone() : null;		
	}

	/**
	 * @param fecExpedicionCedprof the fecExpedicionCedprof to set
	 */
	public void setFecExpedicionCedprof(Date fecExpedicionCedprof) {
		this.fecExpedicionCedprof = fecExpedicionCedprof;
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
	 * @return the fecSolicitudR1
	 */
	public Date getFecSolicitudR1() {
		return fecSolicitudR1 != null ? (Date) fecSolicitudR1.clone() : null;
	}

	/**
	 * @param fecSolicitudR1 the fecSolicitudR1 to set
	 */
	public void setFecSolicitudR1(Date fecSolicitudR1) {
		this.fecSolicitudR1 = fecSolicitudR1;
	}

	/**
	 * @return the dgDomicilioGeografico
	 */
	public DomicilioGeograficoTO getDgDomicilioGeografico() {
		return dgDomicilioGeografico;
	}

	/**
	 * @param dgDomicilioGeografico the dgDomicilioGeografico to set
	 */
	public void setDgDomicilioGeografico(DomicilioGeograficoTO dgDomicilioGeografico) {
		this.dgDomicilioGeografico = dgDomicilioGeografico;
	}

	/**
	 * @return the dicSubdelegacion
	 */
	public SubdelegacionTO getDicSubdelegacion() {
		return dicSubdelegacion;
	}

	/**
	 * @param dicSubdelegacion the dicSubdelegacion to set
	 */
	public void setDicSubdelegacion(SubdelegacionTO dicSubdelegacion) {
		this.dicSubdelegacion = dicSubdelegacion;
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

}
