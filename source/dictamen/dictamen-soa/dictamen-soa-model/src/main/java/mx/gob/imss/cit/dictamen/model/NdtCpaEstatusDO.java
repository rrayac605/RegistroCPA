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
import javax.persistence.GenerationType;
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
@Table(name = "NDT_CPA_ESTATUS")
@NamedQueries({
    @NamedQuery(name = "NdtCpaEstatusDO.findAll", query = "SELECT n FROM NdtCpaEstatusDO n"),
    @NamedQuery(name = "NdtCpaEstatusDO.findByCveIdEstatusCpa", query = "SELECT n FROM NdtCpaEstatusDO n WHERE n.cveIdEstatusCpa = :cveIdEstatusCpa"),
    @NamedQuery(name = "NdtCpaEstatusDO.findByFecAutorizacionRechazo", query = "SELECT n FROM NdtCpaEstatusDO n WHERE n.fecAutorizacionRechazo = :fecAutorizacionRechazo"),
    @NamedQuery(name = "NdtCpaEstatusDO.findByFecBaja", query = "SELECT n FROM NdtCpaEstatusDO n WHERE n.fecBaja = :fecBaja"),
    @NamedQuery(name = "NdtCpaEstatusDO.findByDesComentarios", query = "SELECT n FROM NdtCpaEstatusDO n WHERE n.desComentarios = :desComentarios"),
    @NamedQuery(name = "NdtCpaEstatusDO.findByFecFallecimiento", query = "SELECT n FROM NdtCpaEstatusDO n WHERE n.fecFallecimiento = :fecFallecimiento"),
    @NamedQuery(name = "NdtCpaEstatusDO.findByFecRegistroAlta", query = "SELECT n FROM NdtCpaEstatusDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtCpaEstatusDO.findByFecRegistroBaja", query = "SELECT n FROM NdtCpaEstatusDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtCpaEstatusDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtCpaEstatusDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado"),
    @NamedQuery(name = "NdtCpaEstatusDO.findByCveIdUsuario", query = "SELECT n FROM NdtCpaEstatusDO n WHERE n.cveIdUsuario = :cveIdUsuario")})
public class NdtCpaEstatusDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_ESTATUS_CPA", nullable = false, precision = 22, scale = 0)
    @SequenceGenerator( allocationSize=1,name = "NdtCpaEstatus_Id_Seq_Gen", sequenceName = "SEQ_NDTCPAESTATUS")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NdtCpaEstatus_Id_Seq_Gen")
    private Long cveIdEstatusCpa;
    @Column(name = "FEC_AUTORIZACION_RECHAZO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecAutorizacionRechazo;
    @Column(name = "FEC_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecBaja;
    @Size(max = 1000)
    @Column(name = "DES_COMENTARIOS", length = 1000)
    private String desComentarios;
    @Column(name = "FEC_FALLECIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecFallecimiento;
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
    @JoinColumn(name = "CVE_ID_CPA", referencedColumnName = "CVE_ID_CPA")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtContadorPublicoAutDO cveIdCpa;
    @JoinColumn(name = "CVE_ID_ESTADO_CPA", referencedColumnName = "CVE_ID_ESTADO_CPA")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcEstadoCpaDO cveIdEstadoCpa;

    public NdtCpaEstatusDO() {
    }

    public NdtCpaEstatusDO(Long cveIdEstatusCpa) {
        this.cveIdEstatusCpa = cveIdEstatusCpa;
    }

    public Long getCveIdEstatusCpa() {
        return cveIdEstatusCpa;
    }

    public void setCveIdEstatusCpa(Long cveIdEstatusCpa) {
        this.cveIdEstatusCpa = cveIdEstatusCpa;
    }

    public Date getFecAutorizacionRechazo() {
        return fecAutorizacionRechazo;
    }

    public void setFecAutorizacionRechazo(Date fecAutorizacionRechazo) {
        this.fecAutorizacionRechazo = fecAutorizacionRechazo;
    }

    public Date getFecBaja() {
        return fecBaja;
    }

    public void setFecBaja(Date fecBaja) {
        this.fecBaja = fecBaja;
    }

    public String getDesComentarios() {
        return desComentarios;
    }

    public void setDesComentarios(String desComentarios) {
        this.desComentarios = desComentarios;
    }

    public Date getFecFallecimiento() {
        return fecFallecimiento;
    }

    public void setFecFallecimiento(Date fecFallecimiento) {
        this.fecFallecimiento = fecFallecimiento;
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

    public NdcEstadoCpaDO getCveIdEstadoCpa() {
        return cveIdEstadoCpa;
    }

    public void setCveIdEstadoCpa(NdcEstadoCpaDO cveIdEstadoCpa) {
        this.cveIdEstadoCpa = cveIdEstadoCpa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdEstatusCpa != null ? cveIdEstatusCpa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtCpaEstatusDO)) {
            return false;
        }
        NdtCpaEstatusDO other = (NdtCpaEstatusDO) object;
        if ((this.cveIdEstatusCpa == null && other.cveIdEstatusCpa != null) || (this.cveIdEstatusCpa != null && !this.cveIdEstatusCpa.equals(other.cveIdEstatusCpa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtCpaEstatusDO[ cveIdEstatusCpa=" + cveIdEstatusCpa + " ]";
    }
    
}
