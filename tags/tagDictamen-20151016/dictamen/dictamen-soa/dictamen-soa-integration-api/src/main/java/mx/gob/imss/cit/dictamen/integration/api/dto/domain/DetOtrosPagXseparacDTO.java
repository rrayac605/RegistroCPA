/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.integration.api.dto.domain;

import java.util.Date;

import mx.gob.imss.cit.dictamen.integration.api.dto.base.BaseDTO;

public class DetOtrosPagXseparacDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8658044926126990801L;
	private Long cveIdA1DetOtrosPagXsepar;
	private String desConcepto;
	private Short indFijaVariable;
	private Short indIntegraSbc;
	private Long impImportePagado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private Date fecRegistroActualizado;
	private CedulaRemuneracionesDTO cveIdB1CedRemunera;

	public DetOtrosPagXseparacDTO() {
	}

	public DetOtrosPagXseparacDTO(Long cveIdA1DetOtrosPagXsepar) {
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

	public CedulaRemuneracionesDTO getCveIdB1CedRemunera() {
		return cveIdB1CedRemunera;
	}

	public void setCveIdB1CedRemunera(CedulaRemuneracionesDTO cveIdB1CedRemunera) {
		this.cveIdB1CedRemunera = cveIdB1CedRemunera;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (cveIdA1DetOtrosPagXsepar != null ? cveIdA1DetOtrosPagXsepar
				.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof DetOtrosPagXseparacDTO)) {
			return false;
		}
		DetOtrosPagXseparacDTO other = (DetOtrosPagXseparacDTO) object;
		if ((this.cveIdA1DetOtrosPagXsepar == null && other.cveIdA1DetOtrosPagXsepar != null)
				|| (this.cveIdA1DetOtrosPagXsepar != null && !this.cveIdA1DetOtrosPagXsepar
						.equals(other.cveIdA1DetOtrosPagXsepar))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "mx.gob.imss.cit.dictamen.model.NdtB1DetOtrosPagXseparacDO[ cveIdA1DetOtrosPagXsepar="
				+ cveIdA1DetOtrosPagXsepar + " ]";
	}
}
