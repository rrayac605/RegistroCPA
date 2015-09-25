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
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
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
@Table(name = "NDT_CARGA_ASEVERACIONES")
@NamedQueries({
    @NamedQuery(name = "NdtCargaAseveracionesDO.findAll", query = "SELECT n FROM NdtCargaAseveracionesDO n"),
    @NamedQuery(name = "NdtCargaAseveracionesDO.findByCveIdBitacoraCargaAsev", query = "SELECT n FROM NdtCargaAseveracionesDO n WHERE n.cveIdBitacoraCargaAsev = :cveIdBitacoraCargaAsev"),
    @NamedQuery(name = "NdtCargaAseveracionesDO.findByCveIdPatronDictamen", query = "SELECT n FROM NdtCargaAseveracionesDO n WHERE n.cveIdPatronDictamen = :cveIdPatronDictamen"),
    @NamedQuery(name = "NdtCargaAseveracionesDO.findByCveIdAseveracion", query = "SELECT n FROM NdtCargaAseveracionesDO n WHERE n.cveIdAseveracion = :cveIdAseveracion"),
    @NamedQuery(name = "NdtCargaAseveracionesDO.findByFecFechaCarga", query = "SELECT n FROM NdtCargaAseveracionesDO n WHERE n.fecFechaCarga = :fecFechaCarga"),
    @NamedQuery(name = "NdtCargaAseveracionesDO.findByCveIdStatusCarga", query = "SELECT n FROM NdtCargaAseveracionesDO n WHERE n.cveIdStatusCarga = :cveIdStatusCarga"),
    @NamedQuery(name = "NdtCargaAseveracionesDO.findByFecRegistroAlta", query = "SELECT n FROM NdtCargaAseveracionesDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtCargaAseveracionesDO.findByFecRegistroBaja", query = "SELECT n FROM NdtCargaAseveracionesDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtCargaAseveracionesDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtCargaAseveracionesDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado"),
    @NamedQuery(name = "NdtCargaAseveracionesDO.findByCveIdUsuario", query = "SELECT n FROM NdtCargaAseveracionesDO n WHERE n.cveIdUsuario = :cveIdUsuario")})
public class NdtCargaAseveracionesDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_BITACORA_CARGA_ASEV", nullable = false, precision = 22, scale = 0)
    @SequenceGenerator(name = "NdtCargaAseveraciones_Id_Seq_Gen", sequenceName = "SEQ_NDTCARGAASEVERACIONES", allocationSize=1)
    @GeneratedValue(generator = "NdtCargaAseveraciones_Id_Seq_Gen")
    private Long cveIdBitacoraCargaAsev;
    @Column(name = "CVE_ID_PATRON_DICTAMEN")
    private Integer cveIdPatronDictamen;
    @Column(name = "CVE_ID_ASEVERACION")
    private Integer cveIdAseveracion;
    @Column(name = "FEC_FECHA_CARGA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecFechaCarga;
    @JoinColumn(name = "CVE_ID_STATUS_CARGA", referencedColumnName = "CVE_ID_STATUS_CARGA", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private NdcStatusCargaAseveracionesDO cveIdStatusCarga;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @Size(max = 20)
    @Column(name = "CVE_ID_USUARIO", length = 20)
    private String cveIdUsuario;

    public NdtCargaAseveracionesDO() {
    }

    public NdtCargaAseveracionesDO(Long cveIdBitacoraCargaAsev) {
        this.cveIdBitacoraCargaAsev = cveIdBitacoraCargaAsev;
    }

    public Long getCveIdBitacoraCargaAsev() {
        return cveIdBitacoraCargaAsev;
    }

    public void setCveIdBitacoraCargaAsev(Long cveIdBitacoraCargaAsev) {
        this.cveIdBitacoraCargaAsev = cveIdBitacoraCargaAsev;
    }

    public Integer getCveIdPatronDictamen() {
        return cveIdPatronDictamen;
    }

    public void setCveIdPatronDictamen(Integer cveIdPatronDictamen) {
        this.cveIdPatronDictamen = cveIdPatronDictamen;
    }

    public Integer getCveIdAseveracion() {
        return cveIdAseveracion;
    }

    public void setCveIdAseveracion(Integer cveIdAseveracion) {
        this.cveIdAseveracion = cveIdAseveracion;
    }

    public Date getFecFechaCarga() {
        return fecFechaCarga;
    }

    public void setFecFechaCarga(Date fecFechaCarga) {
        this.fecFechaCarga = fecFechaCarga;
    }

    public NdcStatusCargaAseveracionesDO getCveIdStatusCarga() {
        return cveIdStatusCarga;
    }

    public void setCveIdStatusCarga(NdcStatusCargaAseveracionesDO cveIdStatusCarga) {
        this.cveIdStatusCarga = cveIdStatusCarga;
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
        hash += (cveIdBitacoraCargaAsev != null ? cveIdBitacoraCargaAsev.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtCargaAseveracionesDO)) {
            return false;
        }
        NdtCargaAseveracionesDO other = (NdtCargaAseveracionesDO) object;
        if ((this.cveIdBitacoraCargaAsev == null && other.cveIdBitacoraCargaAsev != null) || (this.cveIdBitacoraCargaAsev != null && !this.cveIdBitacoraCargaAsev.equals(other.cveIdBitacoraCargaAsev))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtCargaAseveracionesDO[ cveIdBitacoraCargaAsev=" + cveIdBitacoraCargaAsev + " ]";
    }
    
}
