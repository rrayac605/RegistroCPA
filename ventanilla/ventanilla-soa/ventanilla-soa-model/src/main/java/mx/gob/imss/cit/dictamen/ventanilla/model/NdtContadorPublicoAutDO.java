/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.ventanilla.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "NDT_CONTADOR_PUBLICO_AUT")
@NamedQueries({
    @NamedQuery(name = "NdtContadorPublicoAutDO.findAll", query = "SELECT n FROM NdtContadorPublicoAutDO n"),
    @NamedQuery(name = "NdtContadorPublicoAutDO.findByCveIdCpa", query = "SELECT n FROM NdtContadorPublicoAutDO n WHERE n.cveIdCpa = :cveIdCpa"),
    @NamedQuery(name = "NdtContadorPublicoAutDO.findByNumRegistroCpa", query = "SELECT n FROM NdtContadorPublicoAutDO n WHERE n.numRegistroCpa = :numRegistroCpa"),
    @NamedQuery(name = "NdtContadorPublicoAutDO.findByFecRegistroAlta", query = "SELECT n FROM NdtContadorPublicoAutDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtContadorPublicoAutDO.findByFecRegistroBaja", query = "SELECT n FROM NdtContadorPublicoAutDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtContadorPublicoAutDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtContadorPublicoAutDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado"),
    @NamedQuery(name = "NdtContadorPublicoAutDO.findByCveIdUsuario", query = "SELECT n FROM NdtContadorPublicoAutDO n WHERE n.cveIdUsuario = :cveIdUsuario")})
public class NdtContadorPublicoAutDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_CPA", nullable = false, precision = 22, scale = 0)
    @SequenceGenerator(name = "NdtContadorPublicoAut_Id_Seq_Gen", sequenceName = "SEQ_NDTCONTADORPUBLICOAUT", allocationSize=1)
    @GeneratedValue(generator = "NdtContadorPublicoAut_Id_Seq_Gen")
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
    private List<NdtCpaTramiteDO> ndtCpaTramiteDOList;
    @JoinColumn(name = "CVE_ID_ESTADO_CPA", referencedColumnName = "CVE_ID_ESTADO_CPA")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcEstadoCpaDO cveIdEstadoCpa;
    @Column(name = "CVE_ID_PERSONA")
    private Long cveIdPersona;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cveIdCpa", fetch = FetchType.LAZY)
    private List<NdtCpaAcreditacionDO> ndtCpaAcreditacionDOList;
    @OneToMany(mappedBy = "cveIdCpa", fetch = FetchType.LAZY)
    private List<NdtDocumentoProbatorioDO> ndtDocumentoProbatorioDOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cveIdCpa", fetch = FetchType.LAZY)
    private List<NdtR3ColegioDO> ndtR3ColegioDOList;
    @OneToMany(mappedBy = "cveIdCpa", fetch = FetchType.LAZY)
    private List<NdtPatronDictamenCpaDO> ndtPatronDictamenCpaDOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cveIdCpa", fetch = FetchType.LAZY)
    private List<NdtR2DespachoDO> ndtR2DespachoDOList;
    @OneToMany(mappedBy = "cveIdCpa", fetch = FetchType.LAZY)
    private List<NdtCpaEstatusDO> ndtCpaEstatusDOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cveIdCpa", fetch = FetchType.LAZY)
    private List<NdtR1DatosPersonalesDO> ndtR1DatosPersonalesDOList;

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

    public List<NdtCpaTramiteDO> getNdtCpaTramiteDOList() {
        return ndtCpaTramiteDOList;
    }

    public void setNdtCpaTramiteDOList(List<NdtCpaTramiteDO> ndtCpaTramiteDOList) {
        this.ndtCpaTramiteDOList = ndtCpaTramiteDOList;
    }

    public NdcEstadoCpaDO getCveIdEstadoCpa() {
        return cveIdEstadoCpa;
    }

    public void setCveIdEstadoCpa(NdcEstadoCpaDO cveIdEstadoCpa) {
        this.cveIdEstadoCpa = cveIdEstadoCpa;
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

    public List<NdtPatronDictamenCpaDO> getNdtPatronDictamenCpaDOList() {
        return ndtPatronDictamenCpaDOList;
    }

    public void setNdtPatronDictamenCpaDOList(List<NdtPatronDictamenCpaDO> ndtPatronDictamenCpaDOList) {
        this.ndtPatronDictamenCpaDOList = ndtPatronDictamenCpaDOList;
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
        return "mx.gob.imss.cit.dictamen.model.NdtContadorPublicoAutDO[ cveIdCpa=" + cveIdCpa + " ]";
    }

	/**
	 * @return the cveIdPersona
	 */
	public Long getCveIdPersona() {
		return cveIdPersona;
	}

	/**
	 * @param cveIdPersona the cveIdPersona to set
	 */
	public void setCveIdPersona(Long cveIdPersona) {
		this.cveIdPersona = cveIdPersona;
	}
    
}
