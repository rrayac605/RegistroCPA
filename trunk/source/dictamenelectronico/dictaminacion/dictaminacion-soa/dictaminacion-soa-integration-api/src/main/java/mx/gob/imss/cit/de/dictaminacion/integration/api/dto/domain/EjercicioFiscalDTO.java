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
public class EjercicioFiscalDTO extends BaseDTO {
    private static final long serialVersionUID = 1L;
   
    private Long cveIdEjerFiscal;
    private String desEjerFiscal;
    private Date fecRegistroAlta;
    private Date fecRegistroBaja;
    private Date fecRegistroActualizado;


    public EjercicioFiscalDTO() {
    }

    public EjercicioFiscalDTO(Long cveIdEjerFiscal) {
        this.cveIdEjerFiscal = cveIdEjerFiscal;
    }

    public Long getCveIdEjerFiscal() {
        return cveIdEjerFiscal;
    }

    public void setCveIdEjerFiscal(Long cveIdEjerFiscal) {
        this.cveIdEjerFiscal = cveIdEjerFiscal;
    }

    public String getDesEjerFiscal() {
        return desEjerFiscal;
    }

    public void setDesEjerFiscal(String desEjerFiscal) {
        this.desEjerFiscal = desEjerFiscal;
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
        hash += (cveIdEjerFiscal != null ? cveIdEjerFiscal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EjercicioFiscalDTO)) {
            return false;
        }
        EjercicioFiscalDTO other = (EjercicioFiscalDTO) object;
        if ((this.cveIdEjerFiscal == null && other.cveIdEjerFiscal != null) || (this.cveIdEjerFiscal != null && !this.cveIdEjerFiscal.equals(other.cveIdEjerFiscal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdcEjercicioFiscalDO[ cveIdEjerFiscal=" + cveIdEjerFiscal + " ]";
    }
    
}
