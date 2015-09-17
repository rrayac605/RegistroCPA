/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;

import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "NDT_CPA_TRAMITE")
@NamedQueries({
    @NamedQuery(name = "NdtCpaTramiteDO.findAll", query = "SELECT n FROM NdtCpaTramiteDO n"),
    @NamedQuery(name = "NdtCpaTramiteDO.findByCveIdCpaTramite", query = "SELECT n FROM NdtCpaTramiteDO n WHERE n.cveIdCpaTramite = :cveIdCpaTramite"),
    @NamedQuery(name = "NdtCpaTramiteDO.findByFecSolicitudMovimiento", query = "SELECT n FROM NdtCpaTramiteDO n WHERE n.fecSolicitudMovimiento = :fecSolicitudMovimiento"),
    @NamedQuery(name = "NdtCpaTramiteDO.findByFecAutorizacionMovimiento", query = "SELECT n FROM NdtCpaTramiteDO n WHERE n.fecAutorizacionMovimiento = :fecAutorizacionMovimiento"),
    @NamedQuery(name = "NdtCpaTramiteDO.findByUrlAcuseNotaria", query = "SELECT n FROM NdtCpaTramiteDO n WHERE n.urlAcuseNotaria = :urlAcuseNotaria"),
    @NamedQuery(name = "NdtCpaTramiteDO.findByNumTramiteNotaria", query = "SELECT n FROM NdtCpaTramiteDO n WHERE n.numTramiteNotaria = :numTramiteNotaria"),
    @NamedQuery(name = "NdtCpaTramiteDO.findByFecRegistroAlta", query = "SELECT n FROM NdtCpaTramiteDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtCpaTramiteDO.findByFecRegistroBaja", query = "SELECT n FROM NdtCpaTramiteDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtCpaTramiteDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtCpaTramiteDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado"),
    @NamedQuery(name = "NdtCpaTramiteDO.findByCveIdUsuario", query = "SELECT n FROM NdtCpaTramiteDO n WHERE n.cveIdUsuario = :cveIdUsuario")})
public class NdtCpaTramiteDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_CPA_TRAMITE", nullable = false, precision = 22, scale = 0)
    private Long cveIdCpaTramite;
    @Column(name = "FEC_SOLICITUD_MOVIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecSolicitudMovimiento;
    @Column(name = "FEC_AUTORIZACION_MOVIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecAutorizacionMovimiento;
    @Size(max = 300)
    @Column(name = "URL_ACUSE_NOTARIA", length = 300)
    private String urlAcuseNotaria;
    @Size(max = 70)
    @Column(name = "NUM_TRAMITE_NOTARIA", length = 70)
    private String numTramiteNotaria;
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
    @JoinColumn(name = "CVE_ID_CPA", referencedColumnName = "CVE_ID_CPA")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtContadorPublicoAutDO cveIdCpa;
    @OneToMany(mappedBy = "cveIdCpaTramite", fetch = FetchType.LAZY)
    private List<NdtCpaAcreditacionDO> ndtCpaAcreditacionDOList;
    @OneToMany(mappedBy = "cveIdCpaTramite", fetch = FetchType.LAZY)
    private List<NdtDocumentoProbatorioDO> ndtDocumentoProbatorioDOList;
    @OneToMany(mappedBy = "cveIdCpaTramite", fetch = FetchType.LAZY)
    private List<NdtR3ColegioDO> ndtR3ColegioDOList;
    @OneToMany(mappedBy = "cveIdCpaTramite", fetch = FetchType.LAZY)
    private List<NdtR2DespachoDO> ndtR2DespachoDOList;
    @OneToMany(mappedBy = "cveIdCpaTramite", fetch = FetchType.LAZY)
    private List<NdtCpaEstatusDO> ndtCpaEstatusDOList;
    @OneToMany(mappedBy = "cveIdCpaTramite", fetch = FetchType.LAZY)
    private List<NdtR1DatosPersonalesDO> ndtR1DatosPersonalesDOList;

    public NdtCpaTramiteDO() {
    }

    public NdtCpaTramiteDO(Long cveIdCpaTramite) {
        this.cveIdCpaTramite = cveIdCpaTramite;
    }

    public Long getCveIdCpaTramite() {
        return cveIdCpaTramite;
    }

    public void setCveIdCpaTramite(Long cveIdCpaTramite) {
        this.cveIdCpaTramite = cveIdCpaTramite;
    }

    public Date getFecSolicitudMovimiento() {
        return fecSolicitudMovimiento;
    }

    public void setFecSolicitudMovimiento(Date fecSolicitudMovimiento) {
        this.fecSolicitudMovimiento = fecSolicitudMovimiento;
    }

    public Date getFecAutorizacionMovimiento() {
        return fecAutorizacionMovimiento;
    }

    public void setFecAutorizacionMovimiento(Date fecAutorizacionMovimiento) {
        this.fecAutorizacionMovimiento = fecAutorizacionMovimiento;
    }

    public String getUrlAcuseNotaria() {
        return urlAcuseNotaria;
    }

    public void setUrlAcuseNotaria(String urlAcuseNotaria) {
        this.urlAcuseNotaria = urlAcuseNotaria;
    }

    public String getNumTramiteNotaria() {
        return numTramiteNotaria;
    }

    public void setNumTramiteNotaria(String numTramiteNotaria) {
        this.numTramiteNotaria = numTramiteNotaria;
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

    public NdtContadorPublicoAutDO getCveIdCpa() {
        return cveIdCpa;
    }

    public void setCveIdCpa(NdtContadorPublicoAutDO cveIdCpa) {
        this.cveIdCpa = cveIdCpa;
    }

    public List<NdtCpaAcreditacionDO> getNdtCpaAcreditacionDOList() {
        return ndtCpaAcreditacionDOList;
    }

    public void setNdtCpaAcreditacionDOList(List<NdtCpaAcreditacionDO> ndtCpaAcreditacionDOList) {
        this.ndtCpaAcreditacionDOList = ndtCpaAcreditacionDOList;
    }

    public List<NdtDocumentoProbatorioDO> getNdtDocumentoProbatorioDOList() {
        return ndtDocumentoProbatorioDOList;
    }

    public void setNdtDocumentoProbatorioDOList(List<NdtDocumentoProbatorioDO> ndtDocumentoProbatorioDOList) {
        this.ndtDocumentoProbatorioDOList = ndtDocumentoProbatorioDOList;
    }

    public List<NdtR3ColegioDO> getNdtR3ColegioDOList() {
        return ndtR3ColegioDOList;
    }

    public void setNdtR3ColegioDOList(List<NdtR3ColegioDO> ndtR3ColegioDOList) {
        this.ndtR3ColegioDOList = ndtR3ColegioDOList;
    }

    public List<NdtR2DespachoDO> getNdtR2DespachoDOList() {
        return ndtR2DespachoDOList;
    }

    public void setNdtR2DespachoDOList(List<NdtR2DespachoDO> ndtR2DespachoDOList) {
        this.ndtR2DespachoDOList = ndtR2DespachoDOList;
    }

    public List<NdtCpaEstatusDO> getNdtCpaEstatusDOList() {
        return ndtCpaEstatusDOList;
    }

    public void setNdtCpaEstatusDOList(List<NdtCpaEstatusDO> ndtCpaEstatusDOList) {
        this.ndtCpaEstatusDOList = ndtCpaEstatusDOList;
    }

    public List<NdtR1DatosPersonalesDO> getNdtR1DatosPersonalesDOList() {
        return ndtR1DatosPersonalesDOList;
    }

    public void setNdtR1DatosPersonalesDOList(List<NdtR1DatosPersonalesDO> ndtR1DatosPersonalesDOList) {
        this.ndtR1DatosPersonalesDOList = ndtR1DatosPersonalesDOList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdCpaTramite != null ? cveIdCpaTramite.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtCpaTramiteDO)) {
            return false;
        }
        NdtCpaTramiteDO other = (NdtCpaTramiteDO) object;
        if ((this.cveIdCpaTramite == null && other.cveIdCpaTramite != null) || (this.cveIdCpaTramite != null && !this.cveIdCpaTramite.equals(other.cveIdCpaTramite))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtCpaTramiteDO[ cveIdCpaTramite=" + cveIdCpaTramite + " ]";
    }
    
}
