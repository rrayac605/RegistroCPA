package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.math.BigDecimal;
import java.util.Date;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class IdentificadorMoralTO extends BaseTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6043163862157514942L;

	private long cveIdIdentificadorMoral;

	private BigDecimal cveIdTipoIdentificador;

	private String cveIdentificadora;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private BigDecimal indVigente;

	private PersonaMoralTO ditPersonaMoral;

	/**
	 * @return the cveIdIdentificadorMoral
	 */
	public long getCveIdIdentificadorMoral() {
		return cveIdIdentificadorMoral;
	}

	/**
	 * @param cveIdIdentificadorMoral the cveIdIdentificadorMoral to set
	 */
	public void setCveIdIdentificadorMoral(long cveIdIdentificadorMoral) {
		this.cveIdIdentificadorMoral = cveIdIdentificadorMoral;
	}

	/**
	 * @return the cveIdTipoIdentificador
	 */
	public BigDecimal getCveIdTipoIdentificador() {
		return cveIdTipoIdentificador;
	}

	/**
	 * @param cveIdTipoIdentificador the cveIdTipoIdentificador to set
	 */
	public void setCveIdTipoIdentificador(BigDecimal cveIdTipoIdentificador) {
		this.cveIdTipoIdentificador = cveIdTipoIdentificador;
	}

	/**
	 * @return the cveIdentificadora
	 */
	public String getCveIdentificadora() {
		return cveIdentificadora;
	}

	/**
	 * @param cveIdentificadora the cveIdentificadora to set
	 */
	public void setCveIdentificadora(String cveIdentificadora) {
		this.cveIdentificadora = cveIdentificadora;
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
	 * @return the indVigente
	 */
	public BigDecimal getIndVigente() {
		return indVigente;
	}

	/**
	 * @param indVigente the indVigente to set
	 */
	public void setIndVigente(BigDecimal indVigente) {
		this.indVigente = indVigente;
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
