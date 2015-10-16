/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain;

import java.util.Date;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.base.BaseDTO;

/**
 *
 * @author ajfuentes
 */
public class PatronAsociadoDTO extends BaseDTO {
    private static final long serialVersionUID = 1L;

    private PatronDictamenDTO cveIdPatronDictamen;
    private Long cveIdPatronAsociado;
    private Integer cveIdPatronSujetoObligado;
 
	private Integer cveIdSubdelegacion;
    private String cveIdDivisionAlcierreEjer;
    private String cveIdGrupoAlcierreEjer;
    private Integer numTrabajadoresPromedio;
    private String cveIdFraccionAlcierreEjer;
    private String cveIdClaseAlcierreEjer;
    private String cveIdActividadAlcierreEjer;
    private Short indPatronConeldomfiscal;
    private String desRfcPatron;
    private String calleDomfiscal;
    private String numExteriorDomfiscal;
    private String numInteriorDomfiscal;
    private String coloniaDomfiscal;
    private String codigopostalDomfiscal;
    private String municipioDomfiscal;
    private String entidadDomfiscal;
    private String desNombreRazonsocialPatron;
    private String telefono;
    private String cveIdUsuario;
    private Date fecRegistroAlta;
    private Date fecRegistroBaja;
    private Date fecRegistroActualizado;
  

    public PatronAsociadoDTO() {
    }

    
    public PatronDictamenDTO getCveIdPatronDictamen() {
 		return cveIdPatronDictamen;
 	}

 	public void setCveIdPatronDictamen(PatronDictamenDTO cveIdPatronDictamen) {
 		this.cveIdPatronDictamen = cveIdPatronDictamen;
 	}

    public PatronAsociadoDTO(Long cveIdPatronAsociado) {
        this.cveIdPatronAsociado = cveIdPatronAsociado;
    }

    public Long getCveIdPatronAsociado() {
        return cveIdPatronAsociado;
    }

    public void setCveIdPatronAsociado(Long cveIdPatronAsociado) {
        this.cveIdPatronAsociado = cveIdPatronAsociado;
    }

    public Integer getCveIdPatronSujetoObligado() {
        return cveIdPatronSujetoObligado;
    }

    public void setCveIdPatronSujetoObligado(Integer cveIdPatronSujetoObligado) {
        this.cveIdPatronSujetoObligado = cveIdPatronSujetoObligado;
    }

    public Integer getCveIdSubdelegacion() {
        return cveIdSubdelegacion;
    }

    public void setCveIdSubdelegacion(Integer cveIdSubdelegacion) {
        this.cveIdSubdelegacion = cveIdSubdelegacion;
    }

    public String getCveIdDivisionAlcierreEjer() {
        return cveIdDivisionAlcierreEjer;
    }

    public void setCveIdDivisionAlcierreEjer(String cveIdDivisionAlcierreEjer) {
        this.cveIdDivisionAlcierreEjer = cveIdDivisionAlcierreEjer;
    }

    public String getCveIdGrupoAlcierreEjer() {
        return cveIdGrupoAlcierreEjer;
    }

    public void setCveIdGrupoAlcierreEjer(String cveIdGrupoAlcierreEjer) {
        this.cveIdGrupoAlcierreEjer = cveIdGrupoAlcierreEjer;
    }

    public Integer getNumTrabajadoresPromedio() {
        return numTrabajadoresPromedio;
    }

    public void setNumTrabajadoresPromedio(Integer numTrabajadoresPromedio) {
        this.numTrabajadoresPromedio = numTrabajadoresPromedio;
    }

    public String getCveIdFraccionAlcierreEjer() {
        return cveIdFraccionAlcierreEjer;
    }

    public void setCveIdFraccionAlcierreEjer(String cveIdFraccionAlcierreEjer) {
        this.cveIdFraccionAlcierreEjer = cveIdFraccionAlcierreEjer;
    }

    public String getCveIdClaseAlcierreEjer() {
        return cveIdClaseAlcierreEjer;
    }

    public void setCveIdClaseAlcierreEjer(String cveIdClaseAlcierreEjer) {
        this.cveIdClaseAlcierreEjer = cveIdClaseAlcierreEjer;
    }

    public String getCveIdActividadAlcierreEjer() {
        return cveIdActividadAlcierreEjer;
    }

    public void setCveIdActividadAlcierreEjer(String cveIdActividadAlcierreEjer) {
        this.cveIdActividadAlcierreEjer = cveIdActividadAlcierreEjer;
    }

    public Short getIndPatronConeldomfiscal() {
        return indPatronConeldomfiscal;
    }

    public void setIndPatronConeldomfiscal(Short indPatronConeldomfiscal) {
        this.indPatronConeldomfiscal = indPatronConeldomfiscal;
    }

    public String getDesRfcPatron() {
        return desRfcPatron;
    }

    public void setDesRfcPatron(String desRfcPatron) {
        this.desRfcPatron = desRfcPatron;
    }

    public String getCalleDomfiscal() {
        return calleDomfiscal;
    }

    public void setCalleDomfiscal(String calleDomfiscal) {
        this.calleDomfiscal = calleDomfiscal;
    }

    public String getNumExteriorDomfiscal() {
        return numExteriorDomfiscal;
    }

    public void setNumExteriorDomfiscal(String numExteriorDomfiscal) {
        this.numExteriorDomfiscal = numExteriorDomfiscal;
    }

    public String getNumInteriorDomfiscal() {
        return numInteriorDomfiscal;
    }

    public void setNumInteriorDomfiscal(String numInteriorDomfiscal) {
        this.numInteriorDomfiscal = numInteriorDomfiscal;
    }

    public String getColoniaDomfiscal() {
        return coloniaDomfiscal;
    }

    public void setColoniaDomfiscal(String coloniaDomfiscal) {
        this.coloniaDomfiscal = coloniaDomfiscal;
    }

    public String getCodigopostalDomfiscal() {
        return codigopostalDomfiscal;
    }

    public void setCodigopostalDomfiscal(String codigopostalDomfiscal) {
        this.codigopostalDomfiscal = codigopostalDomfiscal;
    }

    public String getMunicipioDomfiscal() {
        return municipioDomfiscal;
    }

    public void setMunicipioDomfiscal(String municipioDomfiscal) {
        this.municipioDomfiscal = municipioDomfiscal;
    }

    public String getEntidadDomfiscal() {
        return entidadDomfiscal;
    }

    public void setEntidadDomfiscal(String entidadDomfiscal) {
        this.entidadDomfiscal = entidadDomfiscal;
    }

    public String getDesNombreRazonsocialPatron() {
        return desNombreRazonsocialPatron;
    }

    public void setDesNombreRazonsocialPatron(String desNombreRazonsocialPatron) {
        this.desNombreRazonsocialPatron = desNombreRazonsocialPatron;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdPatronAsociado != null ? cveIdPatronAsociado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PatronAsociadoDTO)) {
            return false;
        }
        PatronAsociadoDTO other = (PatronAsociadoDTO) object;
        if ((this.cveIdPatronAsociado == null && other.cveIdPatronAsociado != null) || (this.cveIdPatronAsociado != null && !this.cveIdPatronAsociado.equals(other.cveIdPatronAsociado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PatronDictamenDTO[ cveIdPatronAsociado=" + cveIdPatronAsociado + " ]";
    }
    
}
