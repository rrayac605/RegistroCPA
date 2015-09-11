package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.math.BigDecimal;
import java.util.Date;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class FormaMigratoriaTO extends BaseTO {


	/**
	 * 
	 */
	private static final long serialVersionUID = -1964735732584321338L;


	private long cveIdFormaMigratoria;


	private BigDecimal cveIdDocumentoProbatorio;


	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private String numFormaMigratoria;

	private CalidadCaracMigratTO dicCalidadCaracMigrat;

	private TipoFormaTO dicTipoForma;

	private PersonaTO ditPersona;

	/**
	 * @return the cveIdFormaMigratoria
	 */
	public long getCveIdFormaMigratoria() {
		return cveIdFormaMigratoria;
	}

	/**
	 * @param cveIdFormaMigratoria the cveIdFormaMigratoria to set
	 */
	public void setCveIdFormaMigratoria(long cveIdFormaMigratoria) {
		this.cveIdFormaMigratoria = cveIdFormaMigratoria;
	}

	/**
	 * @return the cveIdDocumentoProbatorio
	 */
	public BigDecimal getCveIdDocumentoProbatorio() {
		return cveIdDocumentoProbatorio;
	}

	/**
	 * @param cveIdDocumentoProbatorio the cveIdDocumentoProbatorio to set
	 */
	public void setCveIdDocumentoProbatorio(BigDecimal cveIdDocumentoProbatorio) {
		this.cveIdDocumentoProbatorio = cveIdDocumentoProbatorio;
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
	 * @return the numFormaMigratoria
	 */
	public String getNumFormaMigratoria() {
		return numFormaMigratoria;
	}

	/**
	 * @param numFormaMigratoria the numFormaMigratoria to set
	 */
	public void setNumFormaMigratoria(String numFormaMigratoria) {
		this.numFormaMigratoria = numFormaMigratoria;
	}

	/**
	 * @return the dicCalidadCaracMigrat
	 */
	public CalidadCaracMigratTO getDicCalidadCaracMigrat() {
		return dicCalidadCaracMigrat;
	}

	/**
	 * @param dicCalidadCaracMigrat the dicCalidadCaracMigrat to set
	 */
	public void setDicCalidadCaracMigrat(CalidadCaracMigratTO dicCalidadCaracMigrat) {
		this.dicCalidadCaracMigrat = dicCalidadCaracMigrat;
	}

	/**
	 * @return the dicTipoForma
	 */
	public TipoFormaTO getDicTipoForma() {
		return dicTipoForma;
	}

	/**
	 * @param dicTipoForma the dicTipoForma to set
	 */
	public void setDicTipoForma(TipoFormaTO dicTipoForma) {
		this.dicTipoForma = dicTipoForma;
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
