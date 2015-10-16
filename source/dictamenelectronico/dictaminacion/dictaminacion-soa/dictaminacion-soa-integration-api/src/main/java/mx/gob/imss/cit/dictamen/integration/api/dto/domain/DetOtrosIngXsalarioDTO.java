/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.integration.api.dto.domain;

import java.util.Date;

import mx.gob.imss.cit.dictamen.integration.api.dto.base.BaseDTO;

public class DetOtrosIngXsalarioDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8600580202248019852L;
	private Long cveIdA1DetOtrosIngXsal;
	private String desConcepto;
	private Short indFijaVariable;
	private Short indIntegraSbc;
	private Long impImportePagado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private Date fecRegistroActualizado;
	private CedulaRemuneracionesDTO cedulaRemuneraciones;

	public DetOtrosIngXsalarioDTO() {
	}

	public DetOtrosIngXsalarioDTO(Long cveIdA1DetOtrosIngXsal) {
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

	public CedulaRemuneracionesDTO getCedulaRemuneraciones() {
		return cedulaRemuneraciones;
	}

	public void setCedulaRemuneraciones(
			CedulaRemuneracionesDTO cedulaRemuneraciones) {
		this.cedulaRemuneraciones = cedulaRemuneraciones;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (cveIdA1DetOtrosIngXsal != null ? cveIdA1DetOtrosIngXsal
				.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof DetOtrosIngXsalarioDTO)) {
			return false;
		}
		DetOtrosIngXsalarioDTO other = (DetOtrosIngXsalarioDTO) object;
		if ((this.cveIdA1DetOtrosIngXsal == null && other.cveIdA1DetOtrosIngXsal != null)
				|| (this.cveIdA1DetOtrosIngXsal != null && !this.cveIdA1DetOtrosIngXsal
						.equals(other.cveIdA1DetOtrosIngXsal))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "mx.gob.imss.cit.dictamen.model.NdtB1DetOtrosIngXsalarioDO[ cveIdA1DetOtrosIngXsal="
				+ cveIdA1DetOtrosIngXsal + " ]";
	}
}
