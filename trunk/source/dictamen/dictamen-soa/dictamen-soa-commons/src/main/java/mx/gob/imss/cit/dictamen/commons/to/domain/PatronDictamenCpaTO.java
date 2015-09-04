package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.Date;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class PatronDictamenCpaTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9220011322311216827L;

	private long cveIdPatronCpaDictamen;

	private String cveIdUsuario;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;


	private Date fecRegistroBaja;


	private Date fecSolicitudPatronCpa;


	private ContadorPublicoTO ndtContadorPublicoAut;


	private PatronDictamenTO ndtPatronDictamen;


	/**
	 * @return the cveIdPatronCpaDictamen
	 */
	public long getCveIdPatronCpaDictamen() {
		return cveIdPatronCpaDictamen;
	}


	/**
	 * @param cveIdPatronCpaDictamen the cveIdPatronCpaDictamen to set
	 */
	public void setCveIdPatronCpaDictamen(long cveIdPatronCpaDictamen) {
		this.cveIdPatronCpaDictamen = cveIdPatronCpaDictamen;
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
	 * @return the fecSolicitudPatronCpa
	 */
	public Date getFecSolicitudPatronCpa() {
		return fecSolicitudPatronCpa != null ? (Date) fecSolicitudPatronCpa.clone() : null;
	}


	/**
	 * @param fecSolicitudPatronCpa the fecSolicitudPatronCpa to set
	 */
	public void setFecSolicitudPatronCpa(Date fecSolicitudPatronCpa) {
		this.fecSolicitudPatronCpa = fecSolicitudPatronCpa;
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


	/**
	 * @return the ndtPatronDictamen
	 */
	public PatronDictamenTO getNdtPatronDictamen() {
		return ndtPatronDictamen;
	}


	/**
	 * @param ndtPatronDictamen the ndtPatronDictamen to set
	 */
	public void setNdtPatronDictamen(PatronDictamenTO ndtPatronDictamen) {
		this.ndtPatronDictamen = ndtPatronDictamen;
	}
	
	

}
