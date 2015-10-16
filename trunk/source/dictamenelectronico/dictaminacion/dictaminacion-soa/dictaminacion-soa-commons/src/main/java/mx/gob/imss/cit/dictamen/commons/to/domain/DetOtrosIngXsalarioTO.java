/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.io.Serializable;
import java.util.Date;

public class DetOtrosIngXsalarioTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7921501480726608440L;
	private Long cveIdA1DetOtrosIngXsal;
	private String desConcepto;
	private Short indFijaVariable;
	private Short indIntegraSbc;
	private Long impImportePagado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private Date fecRegistroActualizado;
	private CedulaRemuneracionesTO cedulaRemuneraciones;

	public DetOtrosIngXsalarioTO() {
	}

	public DetOtrosIngXsalarioTO(Long cveIdA1DetOtrosIngXsal) {
		this.cveIdA1DetOtrosIngXsal = cveIdA1DetOtrosIngXsal;
	}

	public Long getCveIdA1DetOtrosIngXsal() {
		return cveIdA1DetOtrosIngXsal;
	}

	public void setCveIdA1DetOtrosIngXsal(Long cveIdA1DetOtrosIngXsal) {
		this.cveIdA1DetOtrosIngXsal = cveIdA1DetOtrosIngXsal;
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
