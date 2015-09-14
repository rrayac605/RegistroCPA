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
    @NamedQuery(name = "NdtCpaTramite.findAll", query = "SELECT n FROM NdtCpaTramiteDO n"),
    @NamedQuery(name = "NdtCpaTramite.findByCveIdCpaTramite", query = "SELECT n FROM NdtCpaTramiteDO n WHERE n.cveIdCpaTramite = :cveIdCpaTramite"),
    @NamedQuery(name = "NdtCpaTramite.findByFecSolicitudMovimiento", query = "SELECT n FROM NdtCpaTramiteDO n WHERE n.fecSolicitudMovimiento = :fecSolicitudMovimiento"),
    @NamedQuery(name = "NdtCpaTramite.findByFecAutorizacionMovimiento", query = "SELECT n FROM NdtCpaTramiteDO n WHERE n.fecAutorizacionMovimiento = :fecAutorizacionMovimiento"),
    @NamedQuery(name = "NdtCpaTramite.findByUrlAcuseNotaria", query = "SELECT n FROM NdtCpaTramiteDO n WHERE n.urlAcuseNotaria = :urlAcuseNotaria"),
    @NamedQuery(name = "NdtCpaTramite.findByNumTramiteNotaria", query = "SELECT n FROM NdtCpaTramiteDO n WHERE n.numTramiteNotaria = :numTramiteNotaria"),
    @NamedQuery(name = "NdtCpaTramite.findByFecRegistroAlta", query = "SELECT n FROM NdtCpaTramiteDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtCpaTramite.findByFecRegistroBaja", query = "SELECT n FROM NdtCpaTramiteDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtCpaTramite.findByFecRegistroActualizado", query = "SELECT n FROM NdtCpaTramiteDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado"),
    @NamedQuery(name = "NdtCpaTramite.findByCveIdUsuario", query = "SELECT n FROM NdtCpaTramiteDO n WHERE n.cveIdUsuario = :cveIdUsuario")})
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
    private List<NdtCpaAcreditacionDO> ndtCpaAcreditacionList;
    @OneToMany(mappedBy = "cveIdCpaTramite", fetch = FetchType.LAZY)
    private List<NdtDocumentoProbatorioDO> ndtDocumentoProbatorioList;
    @OneToMany(mappedBy = "cveIdCpaTramite", fetch = FetchType.LAZY)
    private List<NdtR3ColegioDO> ndtR3ColegioList;
    @OneToMany(mappedBy = "cveIdCpaTramite", fetch = FetchType.LAZY)
    private List<NdtR2DespachoDO> ndtR2DespachoList;
    @OneToMany(mappedBy = "cveIdCpaTramite", fetch = FetchType.LAZY)
    private List<NdtCpaEstatusDO> ndtCpaEstatusList;
    @OneToMany(mappedBy = "cveIdCpaTramite", fetch = FetchType.LAZY)
    private List<NdtR1DatosPersonalesDO> ndtR1DatosPersonalesList;

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

    public List<NdtCpaAcreditacionDO> getNdtCpaAcreditacionList() {
        return ndtCpaAcreditacionList;
    }

    public void setNdtCpaAcreditacionList(List<NdtCpaAcreditacionDO> ndtCpaAcreditacionList) {
        this.ndtCpaAcreditacionList = ndtCpaAcreditacionList;
    }

    public List<NdtDocumentoProbatorioDO> getNdtDocumentoProbatorioList() {
        return ndtDocumentoProbatorioList;
    }

    public void setNdtDocumentoProbatorioList(List<NdtDocumentoProbatorioDO> ndtDocumentoProbatorioList) {
        this.ndtDocumentoProbatorioList = ndtDocumentoProbatorioList;
    }

    public List<NdtR3ColegioDO> getNdtR3ColegioList() {
        return ndtR3ColegioList;
    }

    public void setNdtR3ColegioList(List<NdtR3ColegioDO> ndtR3ColegioList) {
        this.ndtR3ColegioList = ndtR3ColegioList;
    }

    public List<NdtR2DespachoDO> getNdtR2DespachoList() {
        return ndtR2DespachoList;
    }

    public void setNdtR2DespachoList(List<NdtR2DespachoDO> ndtR2DespachoList) {
        this.ndtR2DespachoList = ndtR2DespachoList;
    }

    public List<NdtCpaEstatusDO> getNdtCpaEstatusList() {
        return ndtCpaEstatusList;
    }

    public void setNdtCpaEstatusList(List<NdtCpaEstatusDO> ndtCpaEstatusList) {
        this.ndtCpaEstatusList = ndtCpaEstatusList;
    }

    public List<NdtR1DatosPersonalesDO> getNdtR1DatosPersonalesList() {
        return ndtR1DatosPersonalesList;
    }

    public void setNdtR1DatosPersonalesList(List<NdtR1DatosPersonalesDO> ndtR1DatosPersonalesList) {
        this.ndtR1DatosPersonalesList = ndtR1DatosPersonalesList;
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
        return "mx.gob.imss.cit.dictamen.model.NdtCpaTramite[ cveIdCpaTramite=" + cveIdCpaTramite + " ]";
    }
    
}
