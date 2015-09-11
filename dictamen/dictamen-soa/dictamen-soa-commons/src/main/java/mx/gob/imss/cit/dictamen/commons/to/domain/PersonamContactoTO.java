package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.math.BigDecimal;
import java.util.Date;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class PersonamContactoTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5980057452959509365L;

	private long cveIdPersonamContacto;

	private BigDecimal cveIdFormaContacto;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private PersonaMoralTO ditPersonaMoral;

	/**
	 * @return the cveIdPersonamContacto
	 */
	public long getCveIdPersonamContacto() {
		return cveIdPersonamContacto;
	}

	/**
	 * @param cveIdPersonamContacto the cveIdPersonamContacto to set
	 */
	public void setCveIdPersonamContacto(long cveIdPersonamContacto) {
		this.cveIdPersonamContacto = cveIdPersonamContacto;
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
