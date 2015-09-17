/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author ajfuentes
 */
@Entity
@Table(name = "NDT_BITACORA_ERRORES")
@NamedQueries({
    @NamedQuery(name = "NdtBitacoraErroresDO.findAll", query = "SELECT n FROM NdtBitacoraErroresDO n"),
    @NamedQuery(name = "NdtBitacoraErroresDO.findByCveIdBitErrores", query = "SELECT n FROM NdtBitacoraErroresDO n WHERE n.cveIdBitErrores = :cveIdBitErrores"),
    @NamedQuery(name = "NdtBitacoraErroresDO.findByDesErrores", query = "SELECT n FROM NdtBitacoraErroresDO n WHERE n.desErrores = :desErrores"),
    @NamedQuery(name = "NdtBitacoraErroresDO.findByFecRegistroAlta", query = "SELECT n FROM NdtBitacoraErroresDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtBitacoraErroresDO.findByFecRegistroBaja", query = "SELECT n FROM NdtBitacoraErroresDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtBitacoraErroresDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtBitacoraErroresDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdtBitacoraErroresDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_BIT_ERRORES", nullable = false, precision = 22, scale = 0)
    private Long cveIdBitErrores;
    @Size(max = 3000)
    @Column(name = "DES_ERRORES", length = 3000)
    private String desErrores;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @JoinColumn(name = "CVE_ID_BITACORA_CARGA_ASEV", referencedColumnName = "CVE_ID_BITACORA_CARGA_ASEV")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtCargaAseveracionesDO cveIdBitacoraCargaAsev;

    public NdtBitacoraErroresDO() {
    }

    public NdtBitacoraErroresDO(Long cveIdBitErrores) {
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

    public NdtCargaAseveracionesDO getCveIdBitacoraCargaAsev() {
        return cveIdBitacoraCargaAsev;
    }

    public void setCveIdBitacoraCargaAsev(NdtCargaAseveracionesDO cveIdBitacoraCargaAsev) {
        this.cveIdBitacoraCargaAsev = cveIdBitacoraCargaAsev;
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
        if (!(object instanceof NdtBitacoraErroresDO)) {
            return false;
        }
        NdtBitacoraErroresDO other = (NdtBitacoraErroresDO) object;
        if ((this.cveIdBitErrores == null && other.cveIdBitErrores != null) || (this.cveIdBitErrores != null && !this.cveIdBitErrores.equals(other.cveIdBitErrores))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtBitacoraErroresDO[ cveIdBitErrores=" + cveIdBitErrores + " ]";
    }
    
}
