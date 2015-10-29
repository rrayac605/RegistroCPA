/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain;

import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.base.BaseDTO;

public class CedulaRemuneracionesDTO extends BaseDTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2943030729392815393L;

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

	private List<DetPagosOtrosEmpleadDTO> ndtB1DetPagosOtrosEmpleadList;

	private List<DetFondoAhorroDTO> ndtB1DetFondoAhorroList;

	private PatronDictamenDTO cveIdPatronDictamen;

	private RemuneracionesDTO cveIdRemuneraciones;

	private EstadoAtestiguamientoDTO cveIdEstadoAtestiguamiento;

	private AtestiguamientoDTO cveIdAtestiguamiento;

	private List<DetOtrosIngXsalarioDTO> ndtB1DetOtrosIngXsalarioList;

	private List<DetOtrosPagXseparacDTO> ndtB1DetOtrosPagXseparacList;
	
	private RemuneracionesDTO cveIdRemuneracionPadre; 
	
    private Integer nombreCampoAseveracion;
    
    private Integer tipoConcepto;
	
	public CedulaRemuneracionesDTO() {
	}

	public CedulaRemuneracionesDTO(Long cveIdB1CedRemunera) {
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

	public List<DetPagosOtrosEmpleadDTO> getNdtB1DetPagosOtrosEmpleadList() {
		return ndtB1DetPagosOtrosEmpleadList;
	}

	public void setNdtB1DetPagosOtrosEmpleadList(
			List<DetPagosOtrosEmpleadDTO> ndtB1DetPagosOtrosEmpleadList) {
		this.ndtB1DetPagosOtrosEmpleadList = ndtB1DetPagosOtrosEmpleadList;
	}

	public List<DetFondoAhorroDTO> getNdtB1DetFondoAhorroList() {
		return ndtB1DetFondoAhorroList;
	}

	public void setNdtB1DetFondoAhorroList(
			List<DetFondoAhorroDTO> ndtB1DetFondoAhorroList) {
		this.ndtB1DetFondoAhorroList = ndtB1DetFondoAhorroList;
	}

	public PatronDictamenDTO getCveIdPatronDictamen() {
		return cveIdPatronDictamen;
	}

	public void setCveIdPatronDictamen(PatronDictamenDTO cveIdPatronDictamen) {
		this.cveIdPatronDictamen = cveIdPatronDictamen;
	}

	public RemuneracionesDTO getCveIdRemuneraciones() {
		return cveIdRemuneraciones;
	}

	public void setCveIdRemuneraciones(RemuneracionesDTO cveIdRemuneraciones) {
		this.cveIdRemuneraciones = cveIdRemuneraciones;
	}

	public EstadoAtestiguamientoDTO getCveIdEstadoAtestiguamiento() {
		return cveIdEstadoAtestiguamiento;
	}

	public void setCveIdEstadoAtestiguamiento(
			EstadoAtestiguamientoDTO cveIdEstadoAtestiguamiento) {
		this.cveIdEstadoAtestiguamiento = cveIdEstadoAtestiguamiento;
	}

	public AtestiguamientoDTO getCveIdAtestiguamiento() {
		return cveIdAtestiguamiento;
	}

	public void setCveIdAtestiguamiento(AtestiguamientoDTO cveIdAtestiguamiento) {
		this.cveIdAtestiguamiento = cveIdAtestiguamiento;
	}

	public List<DetOtrosIngXsalarioDTO> getNdtB1DetOtrosIngXsalarioList() {
		return ndtB1DetOtrosIngXsalarioList;
	}

	public void setNdtB1DetOtrosIngXsalarioList(
			List<DetOtrosIngXsalarioDTO> ndtB1DetOtrosIngXsalarioList) {
		this.ndtB1DetOtrosIngXsalarioList = ndtB1DetOtrosIngXsalarioList;
	}

	public List<DetOtrosPagXseparacDTO> getNdtB1DetOtrosPagXseparacList() {
		return ndtB1DetOtrosPagXseparacList;
	}

	public void setNdtB1DetOtrosPagXseparacList(
			List<DetOtrosPagXseparacDTO> ndtB1DetOtrosPagXseparacList) {
		this.ndtB1DetOtrosPagXseparacList = ndtB1DetOtrosPagXseparacList;
	}

	public RemuneracionesDTO getCveIdRemuneracionPadre() {
		return cveIdRemuneracionPadre;
	}

	public void setCveIdRemuneracionPadre(RemuneracionesDTO cveIdRemuneracionPadre) {
		this.cveIdRemuneracionPadre = cveIdRemuneracionPadre;
	}

	public Integer getNombreCampoAseveracion() {
		return nombreCampoAseveracion;
	}

	public void setNombreCampoAseveracion(Integer nombreCampoAseveracion) {
		this.nombreCampoAseveracion = nombreCampoAseveracion;
	}

	public Integer getTipoConcepto() {
		return tipoConcepto;
	}

	public void setTipoConcepto(Integer tipoConcepto) {
		this.tipoConcepto = tipoConcepto;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (cveIdB1CedRemunera != null ? cveIdB1CedRemunera.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof CedulaRemuneracionesDTO)) {
			return false;
		}
		CedulaRemuneracionesDTO other = (CedulaRemuneracionesDTO) object;
		if ((this.cveIdB1CedRemunera == null && other.cveIdB1CedRemunera != null)
				|| (this.cveIdB1CedRemunera != null && !this.cveIdB1CedRemunera
						.equals(other.cveIdB1CedRemunera))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "mx.gob.imss.cit.dictamen.model.NdtB1CedulaRemuneracionesDO[ cveIdB1CedRemunera="
				+ cveIdB1CedRemunera + " ]";
	}
}
