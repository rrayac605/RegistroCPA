package mx.gob.imss.cit.dictamen.integration.api.dto.domain;

import java.util.Date;

import mx.gob.imss.cit.dictamen.integration.api.dto.base.BaseDTO;

public class DetPagosOtrosEmpleadDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5373317626247154535L;

	private Long cveIdA1DetPagosOtrosEmpl;
	private String desConcepto;
	private Short indFijaVariable;
	private Short indIntegraSbc;
	private Long impImportePagado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private Date fecRegistroActualizado;
	private CedulaRemuneracionesDTO cedulaRemuneraciones;

	/**
	 * @return the cveIdA1DetPagosOtrosEmpl
	 */
	public Long getCveIdA1DetPagosOtrosEmpl() {
		return cveIdA1DetPagosOtrosEmpl;
	}

	/**
	 * @param cveIdA1DetPagosOtrosEmpl
	 *            the cveIdA1DetPagosOtrosEmpl to set
	 */
	public void setCveIdA1DetPagosOtrosEmpl(Long cveIdA1DetPagosOtrosEmpl) {
		this.cveIdA1DetPagosOtrosEmpl = cveIdA1DetPagosOtrosEmpl;
	}

	/**
	 * @return the desConcepto
	 */
	public String getDesConcepto() {
		return desConcepto;
	}

	/**
	 * @param desConcepto
	 *            the desConcepto to set
	 */
	public void setDesConcepto(String desConcepto) {
		this.desConcepto = desConcepto;
	}

	/**
	 * @return the indFijaVariable
	 */
	public Short getIndFijaVariable() {
		return indFijaVariable;
	}

	/**
	 * @param indFijaVariable
	 *            the indFijaVariable to set
	 */
	public void setIndFijaVariable(Short indFijaVariable) {
		this.indFijaVariable = indFijaVariable;
	}

	/**
	 * @return the indIntegraSbc
	 */
	public Short getIndIntegraSbc() {
		return indIntegraSbc;
	}

	/**
	 * @param indIntegraSbc
	 *            the indIntegraSbc to set
	 */
	public void setIndIntegraSbc(Short indIntegraSbc) {
		this.indIntegraSbc = indIntegraSbc;
	}

	/**
	 * @return the impImportePagado
	 */
	public Long getImpImportePagado() {
		return impImportePagado;
	}

	/**
	 * @param impImportePagado
	 *            the impImportePagado to set
	 */
	public void setImpImportePagado(Long impImportePagado) {
		this.impImportePagado = impImportePagado;
	}

	/**
	 * @return the fecRegistroAlta
	 */
	public Date getFecRegistroAlta() {
		return fecRegistroAlta;
	}

	/**
	 * @param fecRegistroAlta
	 *            the fecRegistroAlta to set
	 */
	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}

	/**
	 * @return the fecRegistroBaja
	 */
	public Date getFecRegistroBaja() {
		return fecRegistroBaja;
	}

	/**
	 * @param fecRegistroBaja
	 *            the fecRegistroBaja to set
	 */
	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}

	/**
	 * @return the fecRegistroActualizado
	 */
	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado;
	}

	/**
	 * @param fecRegistroActualizado
	 *            the fecRegistroActualizado to set
	 */
	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}

	/**
	 * @return the cedulaRemuneraciones
	 */
	public CedulaRemuneracionesDTO getCedulaRemuneraciones() {
		return cedulaRemuneraciones;
	}

	/**
	 * @param cedulaRemuneraciones
	 *            the cedulaRemuneraciones to set
	 */
	public void setCedulaRemuneraciones(
			CedulaRemuneracionesDTO cedulaRemuneraciones) {
		this.cedulaRemuneraciones = cedulaRemuneraciones;
	}
}
