/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.de.dictaminacion.commons.to.domain;

import java.io.Serializable;
import java.util.Date;

public class CedulaPrestacionesTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -553369757880576777L;
	private Long cveIdCedulaPrestaciones;
	private String impImportePrestacion;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private Date fecRegistroActualizado;
	private String cveIdUsuario;
	private PatronDictamenTO cveIdPatronDictamen;
	private PrestacionesTO cveIdPrestaciones;
	private EstadoAtestiguamientoTO cveIdEstadoAtestiguamiento;
	private AtestiguamientoTO cveIdAtestiguamiento;

	public Long getCveIdCedulaPrestaciones() {
		return cveIdCedulaPrestaciones;
	}

	public void setCveIdCedulaPrestaciones(Long cveIdCedulaPrestaciones) {
		this.cveIdCedulaPrestaciones = cveIdCedulaPrestaciones;
	}

	public String getImpImportePrestacion() {
		return impImportePrestacion;
	}

	public void setImpImportePrestacion(String impImportePrestacion) {
		this.impImportePrestacion = impImportePrestacion;
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

	public PatronDictamenTO getCveIdPatronDictamen() {
		return cveIdPatronDictamen;
	}

	public void setCveIdPatronDictamen(PatronDictamenTO cveIdPatronDictamen) {
		this.cveIdPatronDictamen = cveIdPatronDictamen;
	}

	public PrestacionesTO getCveIdPrestaciones() {
		return cveIdPrestaciones;
	}

	public void setCveIdPrestaciones(PrestacionesTO cveIdPrestaciones) {
		this.cveIdPrestaciones = cveIdPrestaciones;
	}

	public EstadoAtestiguamientoTO getCveIdEstadoAtestiguamiento() {
		return cveIdEstadoAtestiguamiento;
	}

	public void setCveIdEstadoAtestiguamiento(
			EstadoAtestiguamientoTO cveIdEstadoAtestiguamiento) {
		this.cveIdEstadoAtestiguamiento = cveIdEstadoAtestiguamiento;
	}

	public AtestiguamientoTO getCveIdAtestiguamiento() {
		return cveIdAtestiguamiento;
	}

	public void setCveIdAtestiguamiento(AtestiguamientoTO cveIdAtestiguamiento) {
		this.cveIdAtestiguamiento = cveIdAtestiguamiento;
	}
}
