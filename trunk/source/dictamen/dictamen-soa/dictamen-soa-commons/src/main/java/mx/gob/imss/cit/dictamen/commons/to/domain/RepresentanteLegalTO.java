package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.math.BigDecimal;
import java.util.Date;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class RepresentanteLegalTO extends BaseTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6905474357289998174L;

	private long cveIdRepresentanteLegal;

	private BigDecimal cveIdMandato;

	private BigDecimal cveIdTipoPoder;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private BigDecimal indActAdmonDominio;

	private BigDecimal indEstatus;

	private String rupa;

	private PatronSujetoObligadoTO ditPatronSujetoObligado;

	private PersonaTO ditPersona;

	private PersonaFisicaTO ditPersonaFisica;

	private PersonaMoralTO ditPersonaMoral;

	/**
	 * @return the cveIdRepresentanteLegal
	 */
	public long getCveIdRepresentanteLegal() {
		return cveIdRepresentanteLegal;
	}

	/**
	 * @param cveIdRepresentanteLegal the cveIdRepresentanteLegal to set
	 */
	public void setCveIdRepresentanteLegal(long cveIdRepresentanteLegal) {
		this.cveIdRepresentanteLegal = cveIdRepresentanteLegal;
	}

	/**
	 * @return the cveIdMandato
	 */
	public BigDecimal getCveIdMandato() {
		return cveIdMandato;
	}

	/**
	 * @param cveIdMandato the cveIdMandato to set
	 */
	public void setCveIdMandato(BigDecimal cveIdMandato) {
		this.cveIdMandato = cveIdMandato;
	}

	/**
	 * @return the cveIdTipoPoder
	 */
	public BigDecimal getCveIdTipoPoder() {
		return cveIdTipoPoder;
	}

	/**
	 * @param cveIdTipoPoder the cveIdTipoPoder to set
	 */
	public void setCveIdTipoPoder(BigDecimal cveIdTipoPoder) {
		this.cveIdTipoPoder = cveIdTipoPoder;
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
	 * @return the indActAdmonDominio
	 */
	public BigDecimal getIndActAdmonDominio() {
		return indActAdmonDominio;
	}

	/**
	 * @param indActAdmonDominio the indActAdmonDominio to set
	 */
	public void setIndActAdmonDominio(BigDecimal indActAdmonDominio) {
		this.indActAdmonDominio = indActAdmonDominio;
	}

	/**
	 * @return the indEstatus
	 */
	public BigDecimal getIndEstatus() {
		return indEstatus;
	}

	/**
	 * @param indEstatus the indEstatus to set
	 */
	public void setIndEstatus(BigDecimal indEstatus) {
		this.indEstatus = indEstatus;
	}

	/**
	 * @return the rupa
	 */
	public String getRupa() {
		return rupa;
	}

	/**
	 * @param rupa the rupa to set
	 */
	public void setRupa(String rupa) {
		this.rupa = rupa;
	}

	/**
	 * @return the ditPatronSujetoObligado
	 */
	public PatronSujetoObligadoTO getDitPatronSujetoObligado() {
		return ditPatronSujetoObligado;
	}

	/**
	 * @param ditPatronSujetoObligado the ditPatronSujetoObligado to set
	 */
	public void setDitPatronSujetoObligado(
			PatronSujetoObligadoTO ditPatronSujetoObligado) {
		this.ditPatronSujetoObligado = ditPatronSujetoObligado;
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
