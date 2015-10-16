/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.de.dictaminacion.commons.to.domain;

import java.io.Serializable;
import java.util.Date;

public class CedulaPagosDiferenciasTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2623844135343557329L;
	private Long cveIdCedulaPagos;
	private String regPatronal;
	private Integer numCotizantesReportados;
	private Long impEmCf;
	private Long impEmExcedentePat;
	private Long impEmExcedenteObr;
	private Long impEmPdPat;
	private Long impEmPdObr;
	private Long impEmGmpPat;
	private Long impEmGmpObr;
	private Long impRiesgoTrabajo;
	private Long impGuarderiasPs;
	private Long impIvPat;
	private Long impIvObr;
	private Long impSubtotalCop;
	private Long impSuertePrincipalCop;
	private Long impActualizacionCop;
	private Long impRecargosCop;
	private Long impTotalCop;
	private Long impRetiro;
	private Long impCvPat;
	private Long impCvObr;
	private Long impSubtotalRcv;
	private Long impSuertePrincipalRcv;
	private Long impActualizacionRcv;
	private Long impRecargosRcv;
	private Long impTotalRcv;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private Date fecRegistroActualizado;
	private String cveIdUsuario;
	private PatronDictamenTO cveIdPatronDictamen;
	private PatronAsociadoTO cveIdPatronAsociado;

	public CedulaPagosDiferenciasTO() {
	}

	public CedulaPagosDiferenciasTO(Long cveIdCedulaPagos) {
		this.cveIdCedulaPagos = cveIdCedulaPagos;
	}

	public Long getCveIdCedulaPagos() {
		return cveIdCedulaPagos;
	}

	public void setCveIdCedulaPagos(Long cveIdCedulaPagos) {
		this.cveIdCedulaPagos = cveIdCedulaPagos;
	}

	public String getRegPatronal() {
		return regPatronal;
	}

	public void setRegPatronal(String regPatronal) {
		this.regPatronal = regPatronal;
	}

	public Integer getNumCotizantesReportados() {
		return numCotizantesReportados;
	}

	public void setNumCotizantesReportados(Integer numCotizantesReportados) {
		this.numCotizantesReportados = numCotizantesReportados;
	}

	public Long getImpEmCf() {
		return impEmCf;
	}

	public void setImpEmCf(Long impEmCf) {
		this.impEmCf = impEmCf;
	}

	public Long getImpEmExcedentePat() {
		return impEmExcedentePat;
	}

	public void setImpEmExcedentePat(Long impEmExcedentePat) {
		this.impEmExcedentePat = impEmExcedentePat;
	}

	public Long getImpEmExcedenteObr() {
		return impEmExcedenteObr;
	}

	public void setImpEmExcedenteObr(Long impEmExcedenteObr) {
		this.impEmExcedenteObr = impEmExcedenteObr;
	}

	public Long getImpEmPdPat() {
		return impEmPdPat;
	}

	public void setImpEmPdPat(Long impEmPdPat) {
		this.impEmPdPat = impEmPdPat;
	}

	public Long getImpEmPdObr() {
		return impEmPdObr;
	}

	public void setImpEmPdObr(Long impEmPdObr) {
		this.impEmPdObr = impEmPdObr;
	}

	public Long getImpEmGmpPat() {
		return impEmGmpPat;
	}

	public void setImpEmGmpPat(Long impEmGmpPat) {
		this.impEmGmpPat = impEmGmpPat;
	}

	public Long getImpEmGmpObr() {
		return impEmGmpObr;
	}

	public void setImpEmGmpObr(Long impEmGmpObr) {
		this.impEmGmpObr = impEmGmpObr;
	}

	public Long getImpRiesgoTrabajo() {
		return impRiesgoTrabajo;
	}

	public void setImpRiesgoTrabajo(Long impRiesgoTrabajo) {
		this.impRiesgoTrabajo = impRiesgoTrabajo;
	}

	public Long getImpGuarderiasPs() {
		return impGuarderiasPs;
	}

	public void setImpGuarderiasPs(Long impGuarderiasPs) {
		this.impGuarderiasPs = impGuarderiasPs;
	}

	public Long getImpIvPat() {
		return impIvPat;
	}

	public void setImpIvPat(Long impIvPat) {
		this.impIvPat = impIvPat;
	}

	public Long getImpIvObr() {
		return impIvObr;
	}

	public void setImpIvObr(Long impIvObr) {
		this.impIvObr = impIvObr;
	}

	public Long getImpSubtotalCop() {
		return impSubtotalCop;
	}

	public void setImpSubtotalCop(Long impSubtotalCop) {
		this.impSubtotalCop = impSubtotalCop;
	}

	public Long getImpSuertePrincipalCop() {
		return impSuertePrincipalCop;
	}

	public void setImpSuertePrincipalCop(Long impSuertePrincipalCop) {
		this.impSuertePrincipalCop = impSuertePrincipalCop;
	}

	public Long getImpActualizacionCop() {
		return impActualizacionCop;
	}

	public void setImpActualizacionCop(Long impActualizacionCop) {
		this.impActualizacionCop = impActualizacionCop;
	}

	public Long getImpRecargosCop() {
		return impRecargosCop;
	}

	public void setImpRecargosCop(Long impRecargosCop) {
		this.impRecargosCop = impRecargosCop;
	}

	public Long getImpTotalCop() {
		return impTotalCop;
	}

	public void setImpTotalCop(Long impTotalCop) {
		this.impTotalCop = impTotalCop;
	}

	public Long getImpRetiro() {
		return impRetiro;
	}

	public void setImpRetiro(Long impRetiro) {
		this.impRetiro = impRetiro;
	}

	public Long getImpCvPat() {
		return impCvPat;
	}

	public void setImpCvPat(Long impCvPat) {
		this.impCvPat = impCvPat;
	}

	public Long getImpCvObr() {
		return impCvObr;
	}

	public void setImpCvObr(Long impCvObr) {
		this.impCvObr = impCvObr;
	}

	public Long getImpSubtotalRcv() {
		return impSubtotalRcv;
	}

	public void setImpSubtotalRcv(Long impSubtotalRcv) {
		this.impSubtotalRcv = impSubtotalRcv;
	}

	public Long getImpSuertePrincipalRcv() {
		return impSuertePrincipalRcv;
	}

	public void setImpSuertePrincipalRcv(Long impSuertePrincipalRcv) {
		this.impSuertePrincipalRcv = impSuertePrincipalRcv;
	}

	public Long getImpActualizacionRcv() {
		return impActualizacionRcv;
	}

	public void setImpActualizacionRcv(Long impActualizacionRcv) {
		this.impActualizacionRcv = impActualizacionRcv;
	}

	public Long getImpRecargosRcv() {
		return impRecargosRcv;
	}

	public void setImpRecargosRcv(Long impRecargosRcv) {
		this.impRecargosRcv = impRecargosRcv;
	}

	public Long getImpTotalRcv() {
		return impTotalRcv;
	}

	public void setImpTotalRcv(Long impTotalRcv) {
		this.impTotalRcv = impTotalRcv;
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

	public PatronAsociadoTO getCveIdPatronAsociado() {
		return cveIdPatronAsociado;
	}

	public void setCveIdPatronAsociado(PatronAsociadoTO cveIdPatronAsociado) {
		this.cveIdPatronAsociado = cveIdPatronAsociado;
	}

}
