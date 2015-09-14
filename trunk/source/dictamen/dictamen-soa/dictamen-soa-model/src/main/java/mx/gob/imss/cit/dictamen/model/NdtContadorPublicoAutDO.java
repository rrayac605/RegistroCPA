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
import javax.persistence.CascadeType;
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
@Table(name = "NDT_CONTADOR_PUBLICO_AUT")
@NamedQueries({
    @NamedQuery(name = "NdtContadorPublicoAut.findAll", query = "SELECT n FROM NdtContadorPublicoAutDO n"),
    @NamedQuery(name = "NdtContadorPublicoAut.findByCveIdCpa", query = "SELECT n FROM NdtContadorPublicoAutDO n WHERE n.cveIdCpa = :cveIdCpa"),
    @NamedQuery(name = "NdtContadorPublicoAut.findByNumRegistroCpa", query = "SELECT n FROM NdtContadorPublicoAutDO n WHERE n.numRegistroCpa = :numRegistroCpa"),
    @NamedQuery(name = "NdtContadorPublicoAut.findByFecRegistroAlta", query = "SELECT n FROM NdtContadorPublicoAutDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtContadorPublicoAut.findByFecRegistroBaja", query = "SELECT n FROM NdtContadorPublicoAutDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtContadorPublicoAut.findByFecRegistroActualizado", query = "SELECT n FROM NdtContadorPublicoAutDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado"),
    @NamedQuery(name = "NdtContadorPublicoAut.findByCveIdUsuario", query = "SELECT n FROM NdtContadorPublicoAutDO n WHERE n.cveIdUsuario = :cveIdUsuario")})
public class NdtContadorPublicoAutDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_CPA", nullable = false, precision = 22, scale = 0)
    private Long cveIdCpa;
    @Column(name = "NUM_REGISTRO_CPA")
    private Integer numRegistroCpa;
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
    @OneToMany(mappedBy = "cveIdCpa", fetch = FetchType.LAZY)
    private List<NdtCpaTramiteDO> ndtCpaTramiteList;
    @JoinColumn(name = "CVE_ID_ESTADO_CPA", referencedColumnName = "CVE_ID_ESTADO_CPA")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcEstadoCpaDO cveIdEstadoCpa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cveIdCpa", fetch = FetchType.LAZY)
    private List<NdtCpaAcreditacionDO> ndtCpaAcreditacionList;
    @OneToMany(mappedBy = "cveIdCpa", fetch = FetchType.LAZY)
    private List<NdtDocumentoProbatorioDO> ndtDocumentoProbatorioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cveIdCpa", fetch = FetchType.LAZY)
    private List<NdtR3ColegioDO> ndtR3ColegioList;
    @OneToMany(mappedBy = "cveIdCpa", fetch = FetchType.LAZY)
    private List<NdtPatronDictamenCpaDO> ndtPatronDictamenCpaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cveIdCpa", fetch = FetchType.LAZY)
    private List<NdtR2DespachoDO> ndtR2DespachoList;
    @OneToMany(mappedBy = "cveIdCpa", fetch = FetchType.LAZY)
    private List<NdtCpaEstatusDO> ndtCpaEstatusList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cveIdCpa", fetch = FetchType.LAZY)
    private List<NdtR1DatosPersonalesDO> ndtR1DatosPersonalesList;

    public NdtContadorPublicoAutDO() {
    }

    public NdtContadorPublicoAutDO(Long cveIdCpa) {
        this.cveIdCpa = cveIdCpa;
    }

    public Long getCveIdCpa() {
        return cveIdCpa;
    }

    public void setCveIdCpa(Long cveIdCpa) {
        this.cveIdCpa = cveIdCpa;
    }

    public Integer getNumRegistroCpa() {
        return numRegistroCpa;
    }

    public void setNumRegistroCpa(Integer numRegistroCpa) {
        this.numRegistroCpa = numRegistroCpa;
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

    public List<NdtCpaTramiteDO> getNdtCpaTramiteList() {
        return ndtCpaTramiteList;
    }

    public void setNdtCpaTramiteList(List<NdtCpaTramiteDO> ndtCpaTramiteList) {
        this.ndtCpaTramiteList = ndtCpaTramiteList;
    }

    public NdcEstadoCpaDO getCveIdEstadoCpa() {
        return cveIdEstadoCpa;
    }

    public void setCveIdEstadoCpa(NdcEstadoCpaDO cveIdEstadoCpa) {
        this.cveIdEstadoCpa = cveIdEstadoCpa;
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

    public List<NdtPatronDictamenCpaDO> getNdtPatronDictamenCpaList() {
        return ndtPatronDictamenCpaList;
    }

    public void setNdtPatronDictamenCpaList(List<NdtPatronDictamenCpaDO> ndtPatronDictamenCpaList) {
        this.ndtPatronDictamenCpaList = ndtPatronDictamenCpaList;
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
        hash += (cveIdCpa != null ? cveIdCpa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtContadorPublicoAutDO)) {
            return false;
        }
        NdtContadorPublicoAutDO other = (NdtContadorPublicoAutDO) object;
        if ((this.cveIdCpa == null && other.cveIdCpa != null) || (this.cveIdCpa != null && !this.cveIdCpa.equals(other.cveIdCpa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtContadorPublicoAut[ cveIdCpa=" + cveIdCpa + " ]";
    }
    
}
