/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.io.Serializable;
import java.util.Date;

public class DetPagosOtrosEmpleadTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5453327232243776230L;
	private Long cveIdA1DetPagosOtrosEmpl;
	private String desConcepto;
	private Short indFijaVariable;
	private Short indIntegraSbc;
	private Long impImportePagado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private Date fecRegistroActualizado;
	private CedulaRemuneracionesTO cedulaRemuneraciones;

	public DetPagosOtrosEmpleadTO() {
	}

	public DetPagosOtrosEmpleadTO(Long cveIdA1DetPagosOtrosEmpl) {
		this.cveIdA1DetPagosOtrosEmpl = cveIdA1DetPagosOtrosEmpl;
	}

	public Long getCveIdA1DetPagosOtrosEmpl() {
		return cveIdA1DetPagosOtrosEmpl;
	}

	public void setCveIdA1DetPagosOtrosEmpl(Long cveIdA1DetPagosOtrosEmpl) {
		this.cveIdA1DetPagosOtrosEmpl = cveIdA1DetPagosOtrosEmpl;
	}

	public String getDesConcepto() {
		return desConcepto;
	}

	public void setDesConcepto(String desConcepto) {
		this.desConcepto = desConcepto;
	}

	public Short getIndFijaVariable() {
		return indFijaVariable;
	}

	public void setIndFijaVariable(Short indFijaVariable) {
		this.indFijaVariable = indFijaVariable;
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

	public CedulaRemuneracionesTO getCedulaRemuneraciones() {
		return cedulaRemuneraciones;
	}

	public void setCedulaRemuneraciones(
			CedulaRemuneracionesTO cedulaRemuneraciones) {
		this.cedulaRemuneraciones = cedulaRemuneraciones;
	}
}
