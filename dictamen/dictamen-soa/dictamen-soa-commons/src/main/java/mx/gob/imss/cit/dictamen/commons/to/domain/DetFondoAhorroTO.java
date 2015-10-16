/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.io.Serializable;
import java.util.Date;

public class DetFondoAhorroTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8308763679445199870L;
	private Long cveIdB1DetFondoAhorro;
	private Long impImportePagado;
	private Integer porPorcentajeAportacion;
	private Integer indTipoAportacion;
	private String cveIdUsuario;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private Date fecRegistroActualizado;
	private CedulaRemuneracionesTO cedRemunera;

	public DetFondoAhorroTO() {
	}

	public DetFondoAhorroTO(Long cveIdB1DetFondoAhorro) {
		this.cveIdB1DetFondoAhorro = cveIdB1DetFondoAhorro;
	}

	public Long getCveIdB1DetFondoAhorro() {
		return cveIdB1DetFondoAhorro;
	}

	public void setCveIdB1DetFondoAhorro(Long cveIdB1DetFondoAhorro) {
		this.cveIdB1DetFondoAhorro = cveIdB1DetFondoAhorro;
	}

	public Long getImpImportePagado() {
		return impImportePagado;
	}

	public void setImpImportePagado(Long impImportePagado) {
		this.impImportePagado = impImportePagado;
	}

	public Integer getPorPorcentajeAportacion() {
		return porPorcentajeAportacion;
	}

	public void setPorPorcentajeAportacion(Integer porPorcentajeAportacion) {
		this.porPorcentajeAportacion = porPorcentajeAportacion;
	}

	public Integer getIndTipoAportacion() {
		return indTipoAportacion;
	}

	public void setIndTipoAportacion(Integer indTipoAportacion) {
		this.indTipoAportacion = indTipoAportacion;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
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

	public CedulaRemuneracionesTO getCedRemunera() {
		return cedRemunera;
	}

	public void setCedRemunera(CedulaRemuneracionesTO cedRemunera) {
		this.cedRemunera = cedRemunera;
	}
}
