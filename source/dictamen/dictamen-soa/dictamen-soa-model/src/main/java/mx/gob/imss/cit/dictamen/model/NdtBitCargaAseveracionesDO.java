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

/**
 *
 * @author ajfuentes
 */
@Entity
@Table(name = "NDT_BIT_CARGA_ASEVERACIONES")
@NamedQueries({
    @NamedQuery(name = "NdtBitCargaAseveraciones.findAll", query = "SELECT n FROM NdtBitCargaAseveracionesDO n"),
    @NamedQuery(name = "NdtBitCargaAseveraciones.findByCveIdBitacoraCargaAsev", query = "SELECT n FROM NdtBitCargaAseveracionesDO n WHERE n.cveIdBitacoraCargaAsev = :cveIdBitacoraCargaAsev"),
    @NamedQuery(name = "NdtBitCargaAseveraciones.findByFechaDeCarga", query = "SELECT n FROM NdtBitCargaAseveracionesDO n WHERE n.fechaDeCarga = :fechaDeCarga"),
    @NamedQuery(name = "NdtBitCargaAseveraciones.findByFecRegistroAlta", query = "SELECT n FROM NdtBitCargaAseveracionesDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtBitCargaAseveraciones.findByFecRegistroBaja", query = "SELECT n FROM NdtBitCargaAseveracionesDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtBitCargaAseveraciones.findByFecRegistroActualizado", query = "SELECT n FROM NdtBitCargaAseveracionesDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdtBitCargaAseveracionesDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_BITACORA_CARGA_ASEV", nullable = false, precision = 22, scale = 0)
    private Long cveIdBitacoraCargaAsev;
    @Column(name = "FECHA_DE_CARGA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDeCarga;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @JoinColumn(name = "CVE_ID_PATRON_ASOCIADO", referencedColumnName = "CVE_ID_PATRON_ASOCIADO")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtPatronAsociadoDO cveIdPatronAsociado;
    @JoinColumn(name = "CVE_ID_TIPO_ASEVERACION", referencedColumnName = "CVE_ID_TIPO_ASEVERACION")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcTipoAseveracionesDO cveIdTipoAseveracion;
    @JoinColumn(name = "CVE_ID_STATUS_CARGAASEV", referencedColumnName = "CVE_ID_STATUS_CARGAASEV")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcStatusCargaAseveracionesDO cveIdStatusCargaasev;

    public NdtBitCargaAseveracionesDO() {
    }

    public NdtBitCargaAseveracionesDO(Long cveIdBitacoraCargaAsev) {
        this.cveIdBitacoraCargaAsev = cveIdBitacoraCargaAsev;
    }

    public Long getCveIdBitacoraCargaAsev() {
        return cveIdBitacoraCargaAsev;
    }

    public void setCveIdBitacoraCargaAsev(Long cveIdBitacoraCargaAsev) {
        this.cveIdBitacoraCargaAsev = cveIdBitacoraCargaAsev;
    }

    public Date getFechaDeCarga() {
        return fechaDeCarga;
    }

    public void setFechaDeCarga(Date fechaDeCarga) {
        this.fechaDeCarga = fechaDeCarga;
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

    public NdtPatronAsociadoDO getCveIdPatronAsociado() {
        return cveIdPatronAsociado;
    }

    public void setCveIdPatronAsociado(NdtPatronAsociadoDO cveIdPatronAsociado) {
        this.cveIdPatronAsociado = cveIdPatronAsociado;
    }

    public NdcTipoAseveracionesDO getCveIdTipoAseveracion() {
        return cveIdTipoAseveracion;
    }

    public void setCveIdTipoAseveracion(NdcTipoAseveracionesDO cveIdTipoAseveracion) {
        this.cveIdTipoAseveracion = cveIdTipoAseveracion;
    }

    public NdcStatusCargaAseveracionesDO getCveIdStatusCargaasev() {
        return cveIdStatusCargaasev;
    }

    public void setCveIdStatusCargaasev(NdcStatusCargaAseveracionesDO cveIdStatusCargaasev) {
        this.cveIdStatusCargaasev = cveIdStatusCargaasev;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdBitacoraCargaAsev != null ? cveIdBitacoraCargaAsev.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtBitCargaAseveracionesDO)) {
            return false;
        }
        NdtBitCargaAseveracionesDO other = (NdtBitCargaAseveracionesDO) object;
        if ((this.cveIdBitacoraCargaAsev == null && other.cveIdBitacoraCargaAsev != null) || (this.cveIdBitacoraCargaAsev != null && !this.cveIdBitacoraCargaAsev.equals(other.cveIdBitacoraCargaAsev))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtBitCargaAseveraciones[ cveIdBitacoraCargaAsev=" + cveIdBitacoraCargaAsev + " ]";
    }
    
}
