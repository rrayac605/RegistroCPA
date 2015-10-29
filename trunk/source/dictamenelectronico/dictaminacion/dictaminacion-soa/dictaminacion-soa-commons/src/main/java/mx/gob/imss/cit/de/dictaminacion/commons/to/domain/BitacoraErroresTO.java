/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.de.dictaminacion.commons.to.domain;

import java.util.Date;

import mx.gob.imss.cit.de.dictaminacion.commons.to.base.BaseTO;

/**
 *
 * @author ajfuentes
 */
public class BitacoraErroresTO extends BaseTO {
    private static final long serialVersionUID = 1L;

    private Long cveIdBitErrores;
    private String desErrores;
    private Date fecRegistroAlta;
    private Date fecRegistroBaja;
    private Date fecRegistroActualizado;
    private CargaDocumentoTO cveIdBitacoraCargaAsev;

    public BitacoraErroresTO() {
    }

    public BitacoraErroresTO(Long cveIdBitErrores) {
        this.cveIdBitErrores = cveIdBitErrores;
    }

    public Long getCveIdBitErrores() {
        return cveIdBitErrores;
    }

    public void setCveIdBitErrores(Long cveIdBitErrores) {
        this.cveIdBitErrores = cveIdBitErrores;
    }

    public String getDesErrores() {
        return desErrores;
    }

    public void setDesErrores(String desErrores) {
        this.desErrores = desErrores;
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
        hash += (cveIdBitErrores != null ? cveIdBitErrores.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BitacoraErroresTO)) {
            return false;
        }
        BitacoraErroresTO other = (BitacoraErroresTO) object;
        if ((this.cveIdBitErrores == null && other.cveIdBitErrores != null) || (this.cveIdBitErrores != null && !this.cveIdBitErrores.equals(other.cveIdBitErrores))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtBitacoraErroresDO[ cveIdBitErrores=" + cveIdBitErrores + " ]";
    }

	public CargaDocumentoTO getCveIdBitacoraCargaAsev() {
		return cveIdBitacoraCargaAsev;
	}

	public void setCveIdBitacoraCargaAsev(CargaDocumentoTO cveIdBitacoraCargaAsev) {
		this.cveIdBitacoraCargaAsev = cveIdBitacoraCargaAsev;
	}
    
}
