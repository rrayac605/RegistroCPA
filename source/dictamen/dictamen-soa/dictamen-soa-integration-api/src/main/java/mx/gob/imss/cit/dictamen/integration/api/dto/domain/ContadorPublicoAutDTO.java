/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.integration.api.dto.domain;

import java.util.Date;

import mx.gob.imss.cit.dictamen.integration.api.dto.base.BaseDTO;

/**
 *
 * @author ajfuentes
 */
public class ContadorPublicoAutDTO  extends BaseDTO {
    private static final long serialVersionUID = 1L;

    private Long cveIdCpa;
    private Integer numRegistroCpa;
    private Date fecRegistroAlta;
    private Date fecRegistroBaja;
    private Date fecRegistroActualizado;
    private String cveIdUsuario;
   

    public ContadorPublicoAutDTO() {
    }

    public ContadorPublicoAutDTO(Long cveIdCpa) {
        this.cveIdCpa = cveIdCpa;
    }

    public Long getCveIdCpa() {
        return cveIdCpa;
    }

    public void setCveIdCpa(Long cveIdCpa) {
        this.cveIdCpa = cveIdCpa;
    }

    public Integer getNumRegistroCpa() {
        return numRegistroCpa;
    }

    public void setNumRegistroCpa(Integer numRegistroCpa) {
        this.numRegistroCpa = numRegistroCpa;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdCpa != null ? cveIdCpa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContadorPublicoAutDTO)) {
            return false;
        }
        ContadorPublicoAutDTO other = (ContadorPublicoAutDTO) object;
        if ((this.cveIdCpa == null && other.cveIdCpa != null) || (this.cveIdCpa != null && !this.cveIdCpa.equals(other.cveIdCpa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtContadorPublicoAutDO[ cveIdCpa=" + cveIdCpa + " ]";
    }
    
}
