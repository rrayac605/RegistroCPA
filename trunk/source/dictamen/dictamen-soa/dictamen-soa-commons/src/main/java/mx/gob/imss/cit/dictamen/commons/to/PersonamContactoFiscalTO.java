package mx.gob.imss.cit.dictamen.commons.to;

import java.math.BigDecimal;
import java.util.Date;

public class PersonamContactoFiscalTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8387173281307447389L;

	private long cveIdPmcontFiscal;

	private BigDecimal cveIdFormaContacto;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private PersonaMoralTO ditPersonaMoral;

	/**
	 * @return the cveIdPmcontFiscal
	 */
	public long getCveIdPmcontFiscal() {
		return cveIdPmcontFiscal;
	}

	/**
	 * @param cveIdPmcontFiscal the cveIdPmcontFiscal to set
	 */
	public void setCveIdPmcontFiscal(long cveIdPmcontFiscal) {
		this.cveIdPmcontFiscal = cveIdPmcontFiscal;
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
