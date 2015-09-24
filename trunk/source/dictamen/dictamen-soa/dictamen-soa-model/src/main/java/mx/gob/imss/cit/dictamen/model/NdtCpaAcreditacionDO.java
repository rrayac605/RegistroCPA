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
@Table(name = "NDT_CPA_ACREDITACION")
@NamedQueries({
    @NamedQuery(name = "NdtCpaAcreditacionDO.findAll", query = "SELECT n FROM NdtCpaAcreditacionDO n"),
    @NamedQuery(name = "NdtCpaAcreditacionDO.findByCveIdAcreditacion", query = "SELECT n FROM NdtCpaAcreditacionDO n WHERE n.cveIdAcreditacion = :cveIdAcreditacion"),
    @NamedQuery(name = "NdtCpaAcreditacionDO.findByIndAcredMembresia", query = "SELECT n FROM NdtCpaAcreditacionDO n WHERE n.indAcredMembresia = :indAcredMembresia"),
    @NamedQuery(name = "NdtCpaAcreditacionDO.findByFecAcreditacionCp", query = "SELECT n FROM NdtCpaAcreditacionDO n WHERE n.fecAcreditacionCp = :fecAcreditacionCp"),
    @NamedQuery(name = "NdtCpaAcreditacionDO.findByFecPresentacionAcreditacion", query = "SELECT n FROM NdtCpaAcreditacionDO n WHERE n.fecPresentacionAcreditacion = :fecPresentacionAcreditacion"),
    @NamedQuery(name = "NdtCpaAcreditacionDO.findByFecDocumento1", query = "SELECT n FROM NdtCpaAcreditacionDO n WHERE n.fecDocumento1 = :fecDocumento1"),
    @NamedQuery(name = "NdtCpaAcreditacionDO.findByFecDocumento2", query = "SELECT n FROM NdtCpaAcreditacionDO n WHERE n.fecDocumento2 = :fecDocumento2"),
    @NamedQuery(name = "NdtCpaAcreditacionDO.findByFecRegistroAlta", query = "SELECT n FROM NdtCpaAcreditacionDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtCpaAcreditacionDO.findByFecRegistroBaja", query = "SELECT n FROM NdtCpaAcreditacionDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtCpaAcreditacionDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtCpaAcreditacionDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado"),
    @NamedQuery(name = "NdtCpaAcreditacionDO.findByCveIdUsuario", query = "SELECT n FROM NdtCpaAcreditacionDO n WHERE n.cveIdUsuario = :cveIdUsuario")})
public class NdtCpaAcreditacionDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_ACREDITACION", nullable = false, precision = 22, scale = 0)
    private Long cveIdAcreditacion;
    @Column(name = "IND_ACRED_MEMBRESIA")
    private Integer indAcredMembresia;
    @Column(name = "FEC_ACREDITACION_CP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecAcreditacionCp;
    @Column(name = "FEC_PRESENTACION_ACREDITACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecPresentacionAcreditacion;
    @Column(name = "FEC_DOCUMENTO1")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecDocumento1;
    @Column(name = "FEC_DOCUMENTO2")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecDocumento2;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @Size(max = 18)
    @Column(name = "CVE_ID_USUARIO", length = 18)
    private String cveIdUsuario;
    @JoinColumn(name = "CVE_ID_CPA_TRAMITE", referencedColumnName = "CVE_ID_CPA_TRAMITE")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtCpaTramiteDO cveIdCpaTramite;
    @JoinColumn(name = "CVE_ID_CPA", referencedColumnName = "CVE_ID_CPA", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private NdtContadorPublicoAutDO cveIdCpa;
    @JoinColumn(name = "CVE_ID_COLEGIO", referencedColumnName = "CVE_ID_COLEGIO")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtColegioDO cveIdColegio;

    public NdtCpaAcreditacionDO() {
    }

    public NdtCpaAcreditacionDO(Long cveIdAcreditacion) {
        this.cveIdAcreditacion = cveIdAcreditacion;
    }

    public Long getCveIdAcreditacion() {
        return cveIdAcreditacion;
    }

    public void setCveIdAcreditacion(Long cveIdAcreditacion) {
        this.cveIdAcreditacion = cveIdAcreditacion;
    }

    public Integer getIndAcredMembresia() {
        return indAcredMembresia;
    }

    public void setIndAcredMembresia(Integer indAcredMembresia) {
        this.indAcredMembresia = indAcredMembresia;
    }

    public Date getFecAcreditacionCp() {
        return fecAcreditacionCp;
    }

    public void setFecAcreditacionCp(Date fecAcreditacionCp) {
        this.fecAcreditacionCp = fecAcreditacionCp;
    }

    public Date getFecPresentacionAcreditacion() {
        return fecPresentacionAcreditacion;
    }

    public void setFecPresentacionAcreditacion(Date fecPresentacionAcreditacion) {
        this.fecPresentacionAcreditacion = fecPresentacionAcreditacion;
    }

    public Date getFecDocumento1() {
        return fecDocumento1;
    }

    public void setFecDocumento1(Date fecDocumento1) {
        this.fecDocumento1 = fecDocumento1;
    }

    public Date getFecDocumento2() {
        return fecDocumento2;
    }

    public void setFecDocumento2(Date fecDocumento2) {
        this.fecDocumento2 = fecDocumento2;
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

    public NdtCpaTramiteDO getCveIdCpaTramite() {
        return cveIdCpaTramite;
    }

    public void setCveIdCpaTramite(NdtCpaTramiteDO cveIdCpaTramite) {
        this.cveIdCpaTramite = cveIdCpaTramite;
    }

    public NdtContadorPublicoAutDO getCveIdCpa() {
        return cveIdCpa;
    }

    public void setCveIdCpa(NdtContadorPublicoAutDO cveIdCpa) {
        this.cveIdCpa = cveIdCpa;
    }

    public NdtColegioDO getCveIdColegio() {
        return cveIdColegio;
    }

    public void setCveIdColegio(NdtColegioDO cveIdColegio) {
        this.cveIdColegio = cveIdColegio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdAcreditacion != null ? cveIdAcreditacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtCpaAcreditacionDO)) {
            return false;
        }
        NdtCpaAcreditacionDO other = (NdtCpaAcreditacionDO) object;
        if ((this.cveIdAcreditacion == null && other.cveIdAcreditacion != null) || (this.cveIdAcreditacion != null && !this.cveIdAcreditacion.equals(other.cveIdAcreditacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtCpaAcreditacionDO[ cveIdAcreditacion=" + cveIdAcreditacion + " ]";
    }
    
}
