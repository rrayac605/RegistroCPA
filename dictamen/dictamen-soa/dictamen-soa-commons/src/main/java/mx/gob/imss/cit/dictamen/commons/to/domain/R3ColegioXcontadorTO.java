package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.Date;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class R3ColegioXcontadorTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4685287693310574267L;

	private long cveIdColegioCpa;

	private String cveIdUsuario;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private Date fecSolicitudR3;

	private String numTramiteNotaria;

	private String urlAcuseNotaria;

	private TramiteTO ditTramite;

	private ColegioTO ndcColegio;

	private ContadorPublicoTO ndtContadorPublicoAut;

	/**
	 * @return the cveIdColegioCpa
	 */
	public long getCveIdColegioCpa() {
		return cveIdColegioCpa;
	}

	/**
	 * @param cveIdColegioCpa the cveIdColegioCpa to set
	 */
	public void setCveIdColegioCpa(long cveIdColegioCpa) {
		this.cveIdColegioCpa = cveIdColegioCpa;
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
	 * @return the fecSolicitudR3
	 */
	public Date getFecSolicitudR3() {
		return fecSolicitudR3 != null ? (Date) fecSolicitudR3.clone() : null;
	}

	/**
	 * @param fecSolicitudR3 the fecSolicitudR3 to set
	 */
	public void setFecSolicitudR3(Date fecSolicitudR3) {
		this.fecSolicitudR3 = fecSolicitudR3;
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
	 * @return the ndcColegio
	 */
	public ColegioTO getNdcColegio() {
		return ndcColegio;
	}

	/**
	 * @param ndcColegio the ndcColegio to set
	 */
	public void setNdcColegio(ColegioTO ndcColegio) {
		this.ndcColegio = ndcColegio;
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
