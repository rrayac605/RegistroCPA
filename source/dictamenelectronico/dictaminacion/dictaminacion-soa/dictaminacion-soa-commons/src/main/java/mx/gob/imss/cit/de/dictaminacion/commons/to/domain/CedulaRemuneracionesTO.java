/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.de.dictaminacion.commons.to.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class CedulaRemuneracionesTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2045441333164390384L;

	private Long cveIdB1CedRemunera;

	private Short indFijoVariable;

	private Short indIntegraSbc;

	private Long impImportePagado;

	private Integer porFahorroApopat;

	private Integer porFahorroApoobr;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private Date fecRegistroActualizado;

	private String cveIdUsuario;

	private List<DetPagosOtrosEmpleadTO> ndtB1DetPagosOtrosEmpleadList;

	private List<DetFondoAhorroTO> ndtB1DetFondoAhorroList;

	private PatronDictamenTO cveIdPatronDictamen;

	private RemuneracionesTO cveIdRemuneraciones;

	private EstadoAtestiguamientoTO cveIdEstadoAtestiguamiento;

	private AtestiguamientoTO cveIdAtestiguamiento;

	private List<DetOtrosIngXsalarioTO> ndtB1DetOtrosIngXsalarioList;

	private List<DetOtrosPagXseparacTO> ndtB1DetOtrosPagXseparacList;

	public CedulaRemuneracionesTO() {
	}

	public CedulaRemuneracionesTO(Long cveIdB1CedRemunera) {
		this.cveIdB1CedRemunera = cveIdB1CedRemunera;
	}

	public Long getCveIdB1CedRemunera() {
		return cveIdB1CedRemunera;
	}

	public void setCveIdB1CedRemunera(Long cveIdB1CedRemunera) {
		this.cveIdB1CedRemunera = cveIdB1CedRemunera;
	}

	public Short getIndFijoVariable() {
		return indFijoVariable;
	}

	public void setIndFijoVariable(Short indFijoVariable) {
		this.indFijoVariable = indFijoVariable;
	}

	public Short getIndIntegraSbc() {
		return indIntegraSbc;
	}

	public void setIndIntegraSbc(Short indIntegraSbc) {
		this.indIntegraSbc = indIntegraSbc;
	}

	public Long getImpImportePagado() {
		return impImportePagado;
	}

	public void setImpImportePagado(Long impImportePagado) {
		this.impImportePagado = impImportePagado;
	}

	public Integer getPorFahorroApopat() {
		return porFahorroApopat;
	}

	public void setPorFahorroApopat(Integer porFahorroApopat) {
		this.porFahorroApopat = porFahorroApopat;
	}

	public Integer getPorFahorroApoobr() {
		return porFahorroApoobr;
	}

	public void setPorFahorroApoobr(Integer porFahorroApoobr) {
		this.porFahorroApoobr = porFahorroApoobr;
	}

	public Date getFecRegistroAlta() {
		return fecRegistroAlta;
	}

	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}

	public Date getFecRegistroBaja() {
		return fecRegistroBaja;
	}

	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}

	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado;
	}

	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	/**
	 * @return the ndtB1DetPagosOtrosEmpleadList
	 */
	public List<DetPagosOtrosEmpleadTO> getNdtB1DetPagosOtrosEmpleadList() {
		return ndtB1DetPagosOtrosEmpleadList;
	}

	/**
	 * @param ndtB1DetPagosOtrosEmpleadList
	 *            the ndtB1DetPagosOtrosEmpleadList to set
	 */
	public void setNdtB1DetPagosOtrosEmpleadList(
			List<DetPagosOtrosEmpleadTO> ndtB1DetPagosOtrosEmpleadList) {
		this.ndtB1DetPagosOtrosEmpleadList = ndtB1DetPagosOtrosEmpleadList;
	}

	/**
	 * @return the ndtB1DetFondoAhorroList
	 */
	public List<DetFondoAhorroTO> getNdtB1DetFondoAhorroList() {
		return ndtB1DetFondoAhorroList;
	}

	/**
	 * @param ndtB1DetFondoAhorroList
	 *            the ndtB1DetFondoAhorroList to set
	 */
	public void setNdtB1DetFondoAhorroList(
			List<DetFondoAhorroTO> ndtB1DetFondoAhorroList) {
		this.ndtB1DetFondoAhorroList = ndtB1DetFondoAhorroList;
	}

	/**
	 * @return the cveIdPatronDictamen
	 */
	public PatronDictamenTO getCveIdPatronDictamen() {
		return cveIdPatronDictamen;
	}

	/**
	 * @param cveIdPatronDictamen
	 *            the cveIdPatronDictamen to set
	 */
	public void setCveIdPatronDictamen(PatronDictamenTO cveIdPatronDictamen) {
		this.cveIdPatronDictamen = cveIdPatronDictamen;
	}

	/**
	 * @return the cveIdRemuneraciones
	 */
	public RemuneracionesTO getCveIdRemuneraciones() {
		return cveIdRemuneraciones;
	}

	/**
	 * @param cveIdRemuneraciones
	 *            the cveIdRemuneraciones to set
	 */
	public void setCveIdRemuneraciones(RemuneracionesTO cveIdRemuneraciones) {
		this.cveIdRemuneraciones = cveIdRemuneraciones;
	}

	/**
	 * @return the cveIdEstadoAtestiguamiento
	 */
	public EstadoAtestiguamientoTO getCveIdEstadoAtestiguamiento() {
		return cveIdEstadoAtestiguamiento;
	}

	/**
	 * @param cveIdEstadoAtestiguamiento
	 *            the cveIdEstadoAtestiguamiento to set
	 */
	public void setCveIdEstadoAtestiguamiento(
			EstadoAtestiguamientoTO cveIdEstadoAtestiguamiento) {
		this.cveIdEstadoAtestiguamiento = cveIdEstadoAtestiguamiento;
	}

	/**
	 * @return the cveIdAtestiguamiento
	 */
	public AtestiguamientoTO getCveIdAtestiguamiento() {
		return cveIdAtestiguamiento;
	}

	/**
	 * @param cveIdAtestiguamiento
	 *            the cveIdAtestiguamiento to set
	 */
	public void setCveIdAtestiguamiento(AtestiguamientoTO cveIdAtestiguamiento) {
		this.cveIdAtestiguamiento = cveIdAtestiguamiento;
	}

	/**
	 * @return the ndtB1DetOtrosIngXsalarioList
	 */
	public List<DetOtrosIngXsalarioTO> getNdtB1DetOtrosIngXsalarioList() {
		return ndtB1DetOtrosIngXsalarioList;
	}

	/**
	 * @param ndtB1DetOtrosIngXsalarioList
	 *            the ndtB1DetOtrosIngXsalarioList to set
	 */
	public void setNdtB1DetOtrosIngXsalarioList(
			List<DetOtrosIngXsalarioTO> ndtB1DetOtrosIngXsalarioList) {
		this.ndtB1DetOtrosIngXsalarioList = ndtB1DetOtrosIngXsalarioList;
	}

	/**
	 * @return the ndtB1DetOtrosPagXseparacList
	 */
	public List<DetOtrosPagXseparacTO> getNdtB1DetOtrosPagXseparacList() {
		return ndtB1DetOtrosPagXseparacList;
	}

	/**
	 * @param ndtB1DetOtrosPagXseparacList
	 *            the ndtB1DetOtrosPagXseparacList to set
	 */
	public void setNdtB1DetOtrosPagXseparacList(
			List<DetOtrosPagXseparacTO> ndtB1DetOtrosPagXseparacList) {
		this.ndtB1DetOtrosPagXseparacList = ndtB1DetOtrosPagXseparacList;
	}
}
