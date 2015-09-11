package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class PatronGeneralTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3993116516483347489L;

	private long cveIdPatronGeneral;

	private BigDecimal cveIdTipoRegPatron;

	private String digVer;

	private Date fecRegistroActualizado;

	private BigDecimal porAusentismo;

	private String regPatron;

	private PatronGeneralTO ditPatronGeneral;

	private List<PatronGeneralTO> ditPatronGenerals;

	private PatronSujetoObligadoTO ditPatronSujetoObligado;

	/**
	 * @return the cveIdPatronGeneral
	 */
	public long getCveIdPatronGeneral() {
		return cveIdPatronGeneral;
	}

	/**
	 * @param cveIdPatronGeneral the cveIdPatronGeneral to set
	 */
	public void setCveIdPatronGeneral(long cveIdPatronGeneral) {
		this.cveIdPatronGeneral = cveIdPatronGeneral;
	}

	/**
	 * @return the cveIdTipoRegPatron
	 */
	public BigDecimal getCveIdTipoRegPatron() {
		return cveIdTipoRegPatron;
	}

	/**
	 * @param cveIdTipoRegPatron the cveIdTipoRegPatron to set
	 */
	public void setCveIdTipoRegPatron(BigDecimal cveIdTipoRegPatron) {
		this.cveIdTipoRegPatron = cveIdTipoRegPatron;
	}

	/**
	 * @return the digVer
	 */
	public String getDigVer() {
		return digVer;
	}

	/**
	 * @param digVer the digVer to set
	 */
	public void setDigVer(String digVer) {
		this.digVer = digVer;
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
	 * @return the porAusentismo
	 */
	public BigDecimal getPorAusentismo() {
		return porAusentismo;
	}

	/**
	 * @param porAusentismo the porAusentismo to set
	 */
	public void setPorAusentismo(BigDecimal porAusentismo) {
		this.porAusentismo = porAusentismo;
	}

	/**
	 * @return the regPatron
	 */
	public String getRegPatron() {
		return regPatron;
	}

	/**
	 * @param regPatron the regPatron to set
	 */
	public void setRegPatron(String regPatron) {
		this.regPatron = regPatron;
	}

	/**
	 * @return the ditPatronGeneral
	 */
	public PatronGeneralTO getDitPatronGeneral() {
		return ditPatronGeneral;
	}

	/**
	 * @param ditPatronGeneral the ditPatronGeneral to set
	 */
	public void setDitPatronGeneral(PatronGeneralTO ditPatronGeneral) {
		this.ditPatronGeneral = ditPatronGeneral;
	}

	/**
	 * @return the ditPatronGenerals
	 */
	public List<PatronGeneralTO> getDitPatronGenerals() {
		return ditPatronGenerals;
	}

	/**
	 * @param ditPatronGenerals the ditPatronGenerals to set
	 */
	public void setDitPatronGenerals(List<PatronGeneralTO> ditPatronGenerals) {
		this.ditPatronGenerals = ditPatronGenerals;
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

	
	
}
