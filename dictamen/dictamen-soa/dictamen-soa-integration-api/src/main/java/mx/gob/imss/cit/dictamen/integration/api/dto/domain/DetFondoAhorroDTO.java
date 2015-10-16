/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.integration.api.dto.domain;

import java.util.Date;

import mx.gob.imss.cit.dictamen.integration.api.dto.base.BaseDTO;

public class DetFondoAhorroDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3401569657983534662L;
	private Long cveIdB1DetFondoAhorro;
	private Long impImportePagado;
	private Integer porPorcentajeAportacion;
	private Integer indTipoAportacion;
	private String cveIdUsuario;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private Date fecRegistroActualizado;
	private CedulaRemuneracionesDTO cedRemunera;

	public DetFondoAhorroDTO() {
	}

	public DetFondoAhorroDTO(Long cveIdB1DetFondoAhorro) {
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

	public CedulaRemuneracionesDTO getCedRemunera() {
		return cedRemunera;
	}

	public void setCedRemunera(CedulaRemuneracionesDTO cedRemunera) {
		this.cedRemunera = cedRemunera;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (cveIdB1DetFondoAhorro != null ? cveIdB1DetFondoAhorro
				.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof DetFondoAhorroDTO)) {
			return false;
		}
		DetFondoAhorroDTO other = (DetFondoAhorroDTO) object;
		if ((this.cveIdB1DetFondoAhorro == null && other.cveIdB1DetFondoAhorro != null)
				|| (this.cveIdB1DetFondoAhorro != null && !this.cveIdB1DetFondoAhorro
						.equals(other.cveIdB1DetFondoAhorro))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "mx.gob.imss.cit.dictamen.model.NdtB1DetFondoAhorroDO[ cveIdB1DetFondoAhorro="
				+ cveIdB1DetFondoAhorro + " ]";
	}
}
