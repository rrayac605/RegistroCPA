package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.Date;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class PersonafDomFiscalTO extends BaseTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1236094916102684922L;

	private long cveIdPfdomFiscal;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private DomicilioSatTO ditDomicilioSat;

	private PersonaFisicaTO ditPersonaFisica;

	/**
	 * @return the cveIdPfdomFiscal
	 */
	public long getCveIdPfdomFiscal() {
		return cveIdPfdomFiscal;
	}

	/**
	 * @param cveIdPfdomFiscal the cveIdPfdomFiscal to set
	 */
	public void setCveIdPfdomFiscal(long cveIdPfdomFiscal) {
		this.cveIdPfdomFiscal = cveIdPfdomFiscal;
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
	 * @return the ditDomicilioSat
	 */
	public DomicilioSatTO getDitDomicilioSat() {
		return ditDomicilioSat;
	}

	/**
	 * @param ditDomicilioSat the ditDomicilioSat to set
	 */
	public void setDitDomicilioSat(DomicilioSatTO ditDomicilioSat) {
		this.ditDomicilioSat = ditDomicilioSat;
	}

	/**
	 * @return the ditPersonaFisica
	 */
	public PersonaFisicaTO getDitPersonaFisica() {
		return ditPersonaFisica;
	}

	/**
	 * @param ditPersonaFisica the ditPersonaFisica to set
	 */
	public void setDitPersonaFisica(PersonaFisicaTO ditPersonaFisica) {
		this.ditPersonaFisica = ditPersonaFisica;
	}	
	
	
	
}
