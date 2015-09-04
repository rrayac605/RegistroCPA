package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.math.BigDecimal;
import java.util.Date;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class R2DespachoTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3934817132152649134L;

	private long cveIdCpaDespacho;

	private String cargoQueDesempena;

	private String cveIdUsuario;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private Date fechaSolicitudR2;

	private BigDecimal indTipoCpa;

	private BigDecimal numTrabajadoresContratados;

	private String numTramiteNotaria;

	private String urlAcuseNotaria;

	private PatronSujetoObligadoTO ditPatronSujetoObligado;

	private TramiteTO ditTramite;

	private DespachoTO ndcDespacho;

	private ContadorPublicoTO ndtContadorPublicoAut;

	/**
	 * @return the cveIdCpaDespacho
	 */
	public long getCveIdCpaDespacho() {
		return cveIdCpaDespacho;
	}

	/**
	 * @param cveIdCpaDespacho the cveIdCpaDespacho to set
	 */
	public void setCveIdCpaDespacho(long cveIdCpaDespacho) {
		this.cveIdCpaDespacho = cveIdCpaDespacho;
	}

	/**
	 * @return the cargoQueDesempena
	 */
	public String getCargoQueDesempena() {
		return cargoQueDesempena;
	}

	/**
	 * @param cargoQueDesempena the cargoQueDesempena to set
	 */
	public void setCargoQueDesempena(String cargoQueDesempena) {
		this.cargoQueDesempena = cargoQueDesempena;
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
	 * @return the fechaSolicitudR2
	 */
	public Date getFechaSolicitudR2() {
		return fechaSolicitudR2 != null ? (Date) fechaSolicitudR2.clone() : null;
	}

	/**
	 * @param fechaSolicitudR2 the fechaSolicitudR2 to set
	 */
	public void setFechaSolicitudR2(Date fechaSolicitudR2) {
		this.fechaSolicitudR2 = fechaSolicitudR2;
	}

	/**
	 * @return the indTipoCpa
	 */
	public BigDecimal getIndTipoCpa() {
		return indTipoCpa;
	}

	/**
	 * @param indTipoCpa the indTipoCpa to set
	 */
	public void setIndTipoCpa(BigDecimal indTipoCpa) {
		this.indTipoCpa = indTipoCpa;
	}

	/**
	 * @return the numTrabajadoresContratados
	 */
	public BigDecimal getNumTrabajadoresContratados() {
		return numTrabajadoresContratados;
	}

	/**
	 * @param numTrabajadoresContratados the numTrabajadoresContratados to set
	 */
	public void setNumTrabajadoresContratados(BigDecimal numTrabajadoresContratados) {
		this.numTrabajadoresContratados = numTrabajadoresContratados;
	}

	/**
	 * @return the numTramiteNotaria
	 */
	public String getNumTramiteNotaria() {
		return numTramiteNotaria;
	}

	/**
	 * @param numTramiteNotaria the numTramiteNotaria to set
	 */
	public void setNumTramiteNotaria(String numTramiteNotaria) {
		this.numTramiteNotaria = numTramiteNotaria;
	}

	/**
	 * @return the urlAcuseNotaria
	 */
	public String getUrlAcuseNotaria() {
		return urlAcuseNotaria;
	}

	/**
	 * @param urlAcuseNotaria the urlAcuseNotaria to set
	 */
	public void setUrlAcuseNotaria(String urlAcuseNotaria) {
		this.urlAcuseNotaria = urlAcuseNotaria;
	}

	/**
	 * @return the ditPatronSujetoObligado
	 */
	public PatronSujetoObligadoTO getDitPatronSujetoObligado() {
		return ditPatronSujetoObligado;
	}

	/**
	 * @param ditPatronSujetoObligado the ditPatronSujetoObligado to set
	 */
	public void setDitPatronSujetoObligado(
			PatronSujetoObligadoTO ditPatronSujetoObligado) {
		this.ditPatronSujetoObligado = ditPatronSujetoObligado;
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
	 * @return the ndcDespacho
	 */
	public DespachoTO getNdcDespacho() {
		return ndcDespacho;
	}

	/**
	 * @param ndcDespacho the ndcDespacho to set
	 */
	public void setNdcDespacho(DespachoTO ndcDespacho) {
		this.ndcDespacho = ndcDespacho;
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
