package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.math.BigDecimal;
import java.util.Date;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class PersonafContactoTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3521085276642694282L;

	private long cveIdPersonafContacto;

	private BigDecimal cveIdFormaContacto;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private PersonaTO ditPersona;

	/**
	 * @return the cveIdPersonafContacto
	 */
	public long getCveIdPersonafContacto() {
		return cveIdPersonafContacto;
	}

	/**
	 * @param cveIdPersonafContacto the cveIdPersonafContacto to set
	 */
	public void setCveIdPersonafContacto(long cveIdPersonafContacto) {
		this.cveIdPersonafContacto = cveIdPersonafContacto;
	}

	/**
	 * @return the cveIdFormaContacto
	 */
	public BigDecimal getCveIdFormaContacto() {
		return cveIdFormaContacto;
	}

	/**
	 * @param cveIdFormaContacto the cveIdFormaContacto to set
	 */
	public void setCveIdFormaContacto(BigDecimal cveIdFormaContacto) {
		this.cveIdFormaContacto = cveIdFormaContacto;
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
