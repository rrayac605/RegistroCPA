package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class DelegacionTO extends BaseTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8697483483519512883L;

	private long cveIdDelegacion;

	private String anioIniOper;

	private String claveDelegacion;

	private BigDecimal cveCiz;

	private String desDeleg;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private BigDecimal tipDelegacion;

	private DomicilioGeograficoTO dgDomicilioGeografico;

	private List<SubdelegacionTO> dicSubdelegacions;

	/**
	 * @return the cveIdDelegacion
	 */
	public long getCveIdDelegacion() {
		return cveIdDelegacion;
	}

	/**
	 * @param cveIdDelegacion the cveIdDelegacion to set
	 */
	public void setCveIdDelegacion(long cveIdDelegacion) {
		this.cveIdDelegacion = cveIdDelegacion;
	}

	/**
	 * @return the anioIniOper
	 */
	public String getAnioIniOper() {
		return anioIniOper;
	}

	/**
	 * @param anioIniOper the anioIniOper to set
	 */
	public void setAnioIniOper(String anioIniOper) {
		this.anioIniOper = anioIniOper;
	}

	/**
	 * @return the claveDelegacion
	 */
	public String getClaveDelegacion() {
		return claveDelegacion;
	}

	/**
	 * @param claveDelegacion the claveDelegacion to set
	 */
	public void setClaveDelegacion(String claveDelegacion) {
		this.claveDelegacion = claveDelegacion;
	}

	/**
	 * @return the cveCiz
	 */
	public BigDecimal getCveCiz() {
		return cveCiz;
	}

	/**
	 * @param cveCiz the cveCiz to set
	 */
	public void setCveCiz(BigDecimal cveCiz) {
		this.cveCiz = cveCiz;
	}

	/**
	 * @return the desDeleg
	 */
	public String getDesDeleg() {
		return desDeleg;
	}

	/**
	 * @param desDeleg the desDeleg to set
	 */
	public void setDesDeleg(String desDeleg) {
		this.desDeleg = desDeleg;
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
	 * @return the tipDelegacion
	 */
	public BigDecimal getTipDelegacion() {
		return tipDelegacion;
	}

	/**
	 * @param tipDelegacion the tipDelegacion to set
	 */
	public void setTipDelegacion(BigDecimal tipDelegacion) {
		this.tipDelegacion = tipDelegacion;
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
	 * @return the dicSubdelegacions
	 */
	public List<SubdelegacionTO> getDicSubdelegacions() {
		return dicSubdelegacions;
	}

	/**
	 * @param dicSubdelegacions the dicSubdelegacions to set
	 */
	public void setDicSubdelegacions(List<SubdelegacionTO> dicSubdelegacions) {
		this.dicSubdelegacions = dicSubdelegacions;
	}
	
	
	
}
