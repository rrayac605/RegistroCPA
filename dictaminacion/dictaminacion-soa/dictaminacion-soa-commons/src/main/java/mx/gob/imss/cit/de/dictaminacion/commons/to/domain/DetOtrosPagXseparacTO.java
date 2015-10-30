/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.de.dictaminacion.commons.to.domain;

import java.io.Serializable;
import java.util.Date;

public class DetOtrosPagXseparacTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7229134851608357249L;
	private Long cveIdA1DetOtrosPagXsepar;
	private String desConcepto;
	private Short indFijaVariable;
	private Short indIntegraSbc;
	private Long impImportePagado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private Date fecRegistroActualizado;
	private CedulaRemuneracionesTO cveIdB1CedRemunera;

	public DetOtrosPagXseparacTO() {
	}

	public DetOtrosPagXseparacTO(Long cveIdA1DetOtrosPagXsepar) {
		this.cveIdA1DetOtrosPagXsepar = cveIdA1DetOtrosPagXsepar;
	}

	public Long getCveIdA1DetOtrosPagXsepar() {
		return cveIdA1DetOtrosPagXsepar;
	}

	public void setCveIdA1DetOtrosPagXsepar(Long cveIdA1DetOtrosPagXsepar) {
		this.cveIdA1DetOtrosPagXsepar = cveIdA1DetOtrosPagXsepar;
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

	public CedulaRemuneracionesTO getCveIdB1CedRemunera() {
		return cveIdB1CedRemunera;
	}

	public void setCveIdB1CedRemunera(CedulaRemuneracionesTO cveIdB1CedRemunera) {
		this.cveIdB1CedRemunera = cveIdB1CedRemunera;
	}
}
