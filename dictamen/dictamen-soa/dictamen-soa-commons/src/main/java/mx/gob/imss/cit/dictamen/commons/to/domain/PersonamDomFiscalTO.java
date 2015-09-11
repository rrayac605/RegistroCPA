package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.Date;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class PersonamDomFiscalTO extends BaseTO {


	/**
	 * 
	 */
	private static final long serialVersionUID = 5459242935659477518L;

	private long cveIdPmdomFiscal;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private DomicilioSatTO ditDomicilioSat;

	private PersonaMoralTO ditPersonaMoral;

	/**
	 * @return the cveIdPmdomFiscal
	 */
	public long getCveIdPmdomFiscal() {
		return cveIdPmdomFiscal;
	}

	/**
	 * @param cveIdPmdomFiscal the cveIdPmdomFiscal to set
	 */
	public void setCveIdPmdomFiscal(long cveIdPmdomFiscal) {
		this.cveIdPmdomFiscal = cveIdPmdomFiscal;
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
	 * @return the ditPersonaMoral
	 */
	public PersonaMoralTO getDitPersonaMoral() {
		return ditPersonaMoral;
	}

	/**
	 * @param ditPersonaMoral the ditPersonaMoral to set
	 */
	public void setDitPersonaMoral(PersonaMoralTO ditPersonaMoral) {
		this.ditPersonaMoral = ditPersonaMoral;
	}


}
