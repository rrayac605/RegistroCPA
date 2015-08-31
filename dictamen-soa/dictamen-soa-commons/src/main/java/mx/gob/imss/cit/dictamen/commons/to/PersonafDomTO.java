package mx.gob.imss.cit.dictamen.commons.to;

import java.math.BigDecimal;
import java.util.Date;

public class PersonafDomTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9172086200884740297L;

	private long cveIdPersonafDom;

	private BigDecimal cveIdTipoDomicilio;

	private String desSectorDistribucion;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private DomicilioGeograficoTO dgDomicilioGeografico;

	private PersonaTO ditPersona;

	/**
	 * @return the cveIdPersonafDom
	 */
	public long getCveIdPersonafDom() {
		return cveIdPersonafDom;
	}

	/**
	 * @param cveIdPersonafDom the cveIdPersonafDom to set
	 */
	public void setCveIdPersonafDom(long cveIdPersonafDom) {
		this.cveIdPersonafDom = cveIdPersonafDom;
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
	 * @return the ditPersona
	 */
	public PersonaTO getDitPersona() {
		return ditPersona;
	}

	/**
	 * @param ditPersona the ditPersona to set
	 */
	public void setDitPersona(PersonaTO ditPersona) {
		this.ditPersona = ditPersona;
	}
	
	
}
