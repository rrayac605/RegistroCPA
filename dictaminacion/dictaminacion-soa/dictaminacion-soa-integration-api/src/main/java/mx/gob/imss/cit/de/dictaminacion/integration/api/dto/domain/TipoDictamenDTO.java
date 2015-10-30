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
public class TipoDictamenDTO extends BaseDTO {
    private static final long serialVersionUID = 1L;

    private Long cveIdTipoDictamen;
    private String desTipoDictamen;
    private Date fecRegistroAlta;
    private Date fecRegistroBaja;
    private Date fecRegistroActualizado;

    public TipoDictamenDTO() {
    }

    public TipoDictamenDTO(Long cveIdTipoDictamen) {
        this.cveIdTipoDictamen = cveIdTipoDictamen;
    }

    public Long getCveIdTipoDictamen() {
        return cveIdTipoDictamen;
    }

    public void setCveIdTipoDictamen(Long cveIdTipoDictamen) {
        this.cveIdTipoDictamen = cveIdTipoDictamen;
    }

    public String getDesTipoDictamen() {
        return desTipoDictamen;
    }

    public void setDesTipoDictamen(String desTipoDictamen) {
        this.desTipoDictamen = desTipoDictamen;
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
        hash += (cveIdTipoDictamen != null ? cveIdTipoDictamen.hashCode() : 0);
        return hash;
    }


    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.integration.api.dto.domain.TipoDictamenDTO[ cveIdTipoDictamen=" + cveIdTipoDictamen + " ]";
    }
    
}
