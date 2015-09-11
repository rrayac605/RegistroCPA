package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.math.BigDecimal;
import java.util.Date;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class PersonamDomTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1459542377788417875L;

	private long cveIdPersonamDom;

	private BigDecimal cveIdMedioDistribucion;

	private BigDecimal cveIdTipoDomicilio;

	private String desSectorDistribucion;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private DomicilioGeograficoTO dgDomicilioGeografico;

	private PersonaMoralTO ditPersonaMoral;

	/**
	 * @return the cveIdPersonamDom
	 */
	public long getCveIdPersonamDom() {
		return cveIdPersonamDom;
	}

	/**
	 * @param cveIdPersonamDom the cveIdPersonamDom to set
	 */
	public void setCveIdPersonamDom(long cveIdPersonamDom) {
		this.cveIdPersonamDom = cveIdPersonamDom;
	}

	/**
	 * @return the cveIdMedioDistribucion
	 */
	public BigDecimal getCveIdMedioDistribucion() {
		return cveIdMedioDistribucion;
	}

	/**
	 * @param cveIdMedioDistribucion the cveIdMedioDistribucion to set
	 */
	public void setCveIdMedioDistribucion(BigDecimal cveIdMedioDistribucion) {
		this.cveIdMedioDistribucion = cveIdMedioDistribucion;
	}

	/**
	 * @return the cveIdTipoDomicilio
	 */
	public BigDecimal getCveIdTipoDomicilio() {
		return cveIdTipoDomicilio;
	}

	/**
	 * @param cveIdTipoDomicilio the cveIdTipoDomicilio to set
	 */
	public void setCveIdTipoDomicilio(BigDecimal cveIdTipoDomicilio) {
		this.cveIdTipoDomicilio = cveIdTipoDomicilio;
	}

	/**
	 * @return the desSectorDistribucion
	 */
	public String getDesSectorDistribucion() {
		return desSectorDistribucion;
	}

	/**
	 * @param desSectorDistribucion the desSectorDistribucion to set
	 */
	public void setDesSectorDistribucion(String desSectorDistribucion) {
		this.desSectorDistribucion = desSectorDistribucion;
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
