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
@Table(name = "NDT_PATRON_DICTAMEN")
@NamedQueries({
    @NamedQuery(name = "NdtPatronDictamenDO.findAll", query = "SELECT n FROM NdtPatronDictamenDO n"),
    @NamedQuery(name = "NdtPatronDictamenDO.findByCveIdPatronDictamen", query = "SELECT n FROM NdtPatronDictamenDO n WHERE n.cveIdPatronDictamen = :cveIdPatronDictamen"),
    @NamedQuery(name = "NdtPatronDictamenDO.findByDesRfc", query = "SELECT n FROM NdtPatronDictamenDO n WHERE n.desRfc = :desRfc"),
    @NamedQuery(name = "NdtPatronDictamenDO.findByDesNombreRazonSocial", query = "SELECT n FROM NdtPatronDictamenDO n WHERE n.desNombreRazonSocial = :desNombreRazonSocial"),
    @NamedQuery(name = "NdtPatronDictamenDO.findByNumNumeroTrabajadores", query = "SELECT n FROM NdtPatronDictamenDO n WHERE n.numNumeroTrabajadores = :numNumeroTrabajadores"),
    @NamedQuery(name = "NdtPatronDictamenDO.findByNumRegistroPatronales", query = "SELECT n FROM NdtPatronDictamenDO n WHERE n.numRegistroPatronales = :numRegistroPatronales"),
    @NamedQuery(name = "NdtPatronDictamenDO.findByIndPatronObligado", query = "SELECT n FROM NdtPatronDictamenDO n WHERE n.indPatronObligado = :indPatronObligado"),
    @NamedQuery(name = "NdtPatronDictamenDO.findByIndPatronConstruccion", query = "SELECT n FROM NdtPatronDictamenDO n WHERE n.indPatronConstruccion = :indPatronConstruccion"),
    @NamedQuery(name = "NdtPatronDictamenDO.findByIndRealizoActConstruccion", query = "SELECT n FROM NdtPatronDictamenDO n WHERE n.indRealizoActConstruccion = :indRealizoActConstruccion"),
    @NamedQuery(name = "NdtPatronDictamenDO.findByIndPatronEmpresaValuada", query = "SELECT n FROM NdtPatronDictamenDO n WHERE n.indPatronEmpresaValuada = :indPatronEmpresaValuada"),
    @NamedQuery(name = "NdtPatronDictamenDO.findByDesNumeroFolioDictamen", query = "SELECT n FROM NdtPatronDictamenDO n WHERE n.desNumeroFolioDictamen = :desNumeroFolioDictamen"),
    @NamedQuery(name = "NdtPatronDictamenDO.findByFecRegistroAlta", query = "SELECT n FROM NdtPatronDictamenDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtPatronDictamenDO.findByFecRegistroBaja", query = "SELECT n FROM NdtPatronDictamenDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtPatronDictamenDO.findByFecRegistroAutorizado", query = "SELECT n FROM NdtPatronDictamenDO n WHERE n.fecRegistroAutorizado = :fecRegistroAutorizado"),
    @NamedQuery(name = "NdtPatronDictamenDO.findByCveIdUsuario", query = "SELECT n FROM NdtPatronDictamenDO n WHERE n.cveIdUsuario = :cveIdUsuario"),
    @NamedQuery(name = "NdtPatronDictamenDO.findByRfcPatronAndIdContador", query = "SELECT n FROM NdtPatronDictamenDO n,NdtPatronDictamenCpaDO c WHERE n.cveIdPatronDictamen=c.cveIdPatronDictamen.cveIdPatronDictamen and n.desRfc = :desRfc and c.cveIdCpa.cveIdCpa=:idContador")})
public class NdtPatronDictamenDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_PATRON_DICTAMEN", nullable = false, precision = 22, scale = 0)
    @SequenceGenerator(name = "NdtPatronDictamen_Id_Seq_Gen", sequenceName = "SEQ_NDTPATRONDICTAMEN", allocationSize=1)
    @GeneratedValue(generator = "NdtPatronDictamen_Id_Seq_Gen")
    private Long cveIdPatronDictamen;
    @Size(max = 50)
    @Column(name = "DES_RFC", length = 50)
    private String desRfc;
    @Size(max = 255)
    @Column(name = "DES_NOMBRE_RAZON_SOCIAL", length = 255)
    private String desNombreRazonSocial;
    @Column(name = "NUM_NUMERO_TRABAJADORES")
    private Integer numNumeroTrabajadores;
    @Column(name = "NUM_REGISTRO_PATRONALES")
    private Integer numRegistroPatronales;
    @Column(name = "IND_PATRON_OBLIGADO")
    private Integer indPatronObligado;
    @Column(name = "IND_PATRON_CONSTRUCCION")
    private Short indPatronConstruccion;
    @Column(name = "IND_REALIZO_ACT_CONSTRUCCION")
    private Short indRealizoActConstruccion;
    @Column(name = "IND_PATRON_EMPRESA_VALUADA")
    private Short indPatronEmpresaValuada;
    @Size(max = 50)
    @Column(name = "DES_NUMERO_FOLIO_DICTAMEN", length = 50)
    private String desNumeroFolioDictamen;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "FEC_REGISTRO_AUTORIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAutorizado;
    @Size(max = 20)
    @Column(name = "CVE_ID_USUARIO", length = 20)
    private String cveIdUsuario;
    @Column(name = "CVE_ID_PERSONA_MORAL")
    private Long cveIdPersonaMoral;
    @Column(name = "CVE_ID_PATRON_SUJETO_OBLIGADO")
    private Long cveIdPatronSujetoObligado;
    @Column(name = "CVE_ID_SUBDELEGACION")
    private Long cveIdSubdelegacion;
    @Column(name = "CVE_ID_TRAMITE")
    private Long cveIdTramite;
    
  
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtA51PersonalProporcionadDO> ndtA51PersonalProporcionadDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtA71CeProcesoDO> ndtA71CeProcesoDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtA92ObrasSubcontrataDO> ndtA92ObrasSubcontrataDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtA73CeMaquinariaDO> ndtA73CeMaquinariaDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtA5PrestadoraServiciosDO> ndtA5PrestadoraServiciosDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtA76CeActCompDO> ndtA76CeActCompDOList;
    @JoinColumn(name = "CVE_ID_TIPO_DICTAMEN", referencedColumnName = "CVE_ID_TIPO_DICTAMEN")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcTipoDictamenDO cveIdTipoDictamen;
    @JoinColumn(name = "CVE_ID_ESTADO_DICTAMEN", referencedColumnName = "CVE_ID_ESTADO_DICTAMEN")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcEstadoDictamenDO cveIdEstadoDictamen;
    @JoinColumn(name = "CVE_ID_EJER_FISCAL", referencedColumnName = "CVE_ID_EJER_FISCAL")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcEjercicioFiscalDO cveIdEjerFiscal;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtAtestiguamientoDictamenDO> ndtAtestiguamientoDictamenDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtA3CuotaObreroPatronalDO> ndtA3CuotaObreroPatronalDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtA74CeTransporteDO> ndtA74CeTransporteDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtPatronAsociadoDO> ndtPatronAsociadoList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtA8BalanzaComprobacionDO> ndtA8BalanzaComprobacionDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtA2OtraPrestOtorgadaDO> ndtA2OtraPrestOtorgadaDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtA72CeBienDO> ndtA72CeBienDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtModeloOpinionDO> ndtModeloOpinionDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtB1CedulaRemuneracionesDO> ndtB1CedulaRemuneracionesDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtA6SubcontratacionSpDO> ndtA6SubcontratacionSpDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtA61PersonalProporcionadDO> ndtA61PersonalProporcionadDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtA4PagoPersonaFisicaDO> ndtA4PagoPersonaFisicaDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtCedulaPagosDiferenciasDO> ndtCedulaPagosDiferenciasDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtA1PercepTrabajadorDO> ndtA1PercepTrabajadorDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtA75CePersonalDO> ndtA75CePersonalDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtA911PersonalObraDO> ndtA911PersonalObraDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtB2CedulaPrestacionesDO> ndtB2CedulaPrestacionesDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtCargaDocumentoDO> ndtCargaDocumentoDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtA91ObrasConstruccionDO> ndtA91ObrasConstruccionDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtA921PersSubcontratadoDO> ndtA921PersSubcontratadoDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtDictamenEstadosDO> ndtDictamenEstadosDOList;

    public NdtPatronDictamenDO() {
    }

    public NdtPatronDictamenDO(Long cveIdPatronDictamen) {
        this.cveIdPatronDictamen = cveIdPatronDictamen;
    }

    public Long getCveIdPatronDictamen() {
        return cveIdPatronDictamen;
    }

    public void setCveIdPatronDictamen(Long cveIdPatronDictamen) {
        this.cveIdPatronDictamen = cveIdPatronDictamen;
    }

    public String getDesRfc() {
        return desRfc;
    }

    public void setDesRfc(String desRfc) {
        this.desRfc = desRfc;
    }

    public String getDesNombreRazonSocial() {
        return desNombreRazonSocial;
    }

    public void setDesNombreRazonSocial(String desNombreRazonSocial) {
        this.desNombreRazonSocial = desNombreRazonSocial;
    }

    public Integer getNumNumeroTrabajadores() {
        return numNumeroTrabajadores;
    }

    public void setNumNumeroTrabajadores(Integer numNumeroTrabajadores) {
        this.numNumeroTrabajadores = numNumeroTrabajadores;
    }

    public Integer getNumRegistroPatronales() {
        return numRegistroPatronales;
    }

    public void setNumRegistroPatronales(Integer numRegistroPatronales) {
        this.numRegistroPatronales = numRegistroPatronales;
    }

    public Integer getIndPatronObligado() {
        return indPatronObligado;
    }

    public void setIndPatronObligado(Integer indPatronObligado) {
        this.indPatronObligado = indPatronObligado;
    }

    public Short getIndPatronConstruccion() {
        return indPatronConstruccion;
    }

    public void setIndPatronConstruccion(Short indPatronConstruccion) {
        this.indPatronConstruccion = indPatronConstruccion;
    }

    public Short getIndRealizoActConstruccion() {
        return indRealizoActConstruccion;
    }

    public void setIndRealizoActConstruccion(Short indRealizoActConstruccion) {
        this.indRealizoActConstruccion = indRealizoActConstruccion;
    }

    public Short getIndPatronEmpresaValuada() {
        return indPatronEmpresaValuada;
    }

    public void setIndPatronEmpresaValuada(Short indPatronEmpresaValuada) {
        this.indPatronEmpresaValuada = indPatronEmpresaValuada;
    }

    public String getDesNumeroFolioDictamen() {
        return desNumeroFolioDictamen;
    }

    public void setDesNumeroFolioDictamen(String desNumeroFolioDictamen) {
        this.desNumeroFolioDictamen = desNumeroFolioDictamen;
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

    public Date getFecRegistroAutorizado() {
        return fecRegistroAutorizado;
    }

    public void setFecRegistroAutorizado(Date fecRegistroAutorizado) {
        this.fecRegistroAutorizado = fecRegistroAutorizado;
    }

    public String getCveIdUsuario() {
        return cveIdUsuario;
    }

    public void setCveIdUsuario(String cveIdUsuario) {
        this.cveIdUsuario = cveIdUsuario;
    }

    public List<NdtA51PersonalProporcionadDO> getNdtA51PersonalProporcionadDOList() {
        return ndtA51PersonalProporcionadDOList;
    }

    public void setNdtA51PersonalProporcionadDOList(List<NdtA51PersonalProporcionadDO> ndtA51PersonalProporcionadDOList) {
        this.ndtA51PersonalProporcionadDOList = ndtA51PersonalProporcionadDOList;
    }

    public List<NdtA71CeProcesoDO> getNdtA71CeProcesoDOList() {
        return ndtA71CeProcesoDOList;
    }

    public void setNdtA71CeProcesoDOList(List<NdtA71CeProcesoDO> ndtA71CeProcesoDOList) {
        this.ndtA71CeProcesoDOList = ndtA71CeProcesoDOList;
    }

    public List<NdtA92ObrasSubcontrataDO> getNdtA92ObrasSubcontrataDOList() {
        return ndtA92ObrasSubcontrataDOList;
    }

    public void setNdtA92ObrasSubcontrataDOList(List<NdtA92ObrasSubcontrataDO> ndtA92ObrasSubcontrataDOList) {
        this.ndtA92ObrasSubcontrataDOList = ndtA92ObrasSubcontrataDOList;
    }

    public List<NdtA73CeMaquinariaDO> getNdtA73CeMaquinariaDOList() {
        return ndtA73CeMaquinariaDOList;
    }

    public void setNdtA73CeMaquinariaDOList(List<NdtA73CeMaquinariaDO> ndtA73CeMaquinariaDOList) {
        this.ndtA73CeMaquinariaDOList = ndtA73CeMaquinariaDOList;
    }

    public List<NdtA5PrestadoraServiciosDO> getNdtA5PrestadoraServiciosDOList() {
        return ndtA5PrestadoraServiciosDOList;
    }

    public void setNdtA5PrestadoraServiciosDOList(List<NdtA5PrestadoraServiciosDO> ndtA5PrestadoraServiciosDOList) {
        this.ndtA5PrestadoraServiciosDOList = ndtA5PrestadoraServiciosDOList;
    }

    public List<NdtA76CeActCompDO> getNdtA76CeActCompDOList() {
        return ndtA76CeActCompDOList;
    }

    public void setNdtA76CeActCompDOList(List<NdtA76CeActCompDO> ndtA76CeActCompDOList) {
        this.ndtA76CeActCompDOList = ndtA76CeActCompDOList;
    }

    public NdcTipoDictamenDO getCveIdTipoDictamen() {
        return cveIdTipoDictamen;
    }

    public void setCveIdTipoDictamen(NdcTipoDictamenDO cveIdTipoDictamen) {
        this.cveIdTipoDictamen = cveIdTipoDictamen;
    }

    public NdcEstadoDictamenDO getCveIdEstadoDictamen() {
        return cveIdEstadoDictamen;
    }

    public void setCveIdEstadoDictamen(NdcEstadoDictamenDO cveIdEstadoDictamen) {
        this.cveIdEstadoDictamen = cveIdEstadoDictamen;
    }

    public NdcEjercicioFiscalDO getCveIdEjerFiscal() {
        return cveIdEjerFiscal;
    }

    public void setCveIdEjerFiscal(NdcEjercicioFiscalDO cveIdEjerFiscal) {
        this.cveIdEjerFiscal = cveIdEjerFiscal;
    }

    public List<NdtAtestiguamientoDictamenDO> getNdtAtestiguamientoDictamenDOList() {
        return ndtAtestiguamientoDictamenDOList;
    }

    public void setNdtAtestiguamientoDictamenDOList(List<NdtAtestiguamientoDictamenDO> ndtAtestiguamientoDictamenDOList) {
        this.ndtAtestiguamientoDictamenDOList = ndtAtestiguamientoDictamenDOList;
    }

    public List<NdtA3CuotaObreroPatronalDO> getNdtA3CuotaObreroPatronalDOList() {
        return ndtA3CuotaObreroPatronalDOList;
    }

    public void setNdtA3CuotaObreroPatronalDOList(List<NdtA3CuotaObreroPatronalDO> ndtA3CuotaObreroPatronalDOList) {
        this.ndtA3CuotaObreroPatronalDOList = ndtA3CuotaObreroPatronalDOList;
    }

    public List<NdtA74CeTransporteDO> getNdtA74CeTransporteDOList() {
        return ndtA74CeTransporteDOList;
    }

    public void setNdtA74CeTransporteDOList(List<NdtA74CeTransporteDO> ndtA74CeTransporteDOList) {
        this.ndtA74CeTransporteDOList = ndtA74CeTransporteDOList;
    }

    public List<NdtPatronAsociadoDO> getNdtPatronAsociadoList() {
        return ndtPatronAsociadoList;
    }

    public void setNdtPatronAsociadoList(List<NdtPatronAsociadoDO> ndtPatronAsociadoList) {
        this.ndtPatronAsociadoList = ndtPatronAsociadoList;
    }

    public List<NdtA8BalanzaComprobacionDO> getNdtA8BalanzaComprobacionDOList() {
        return ndtA8BalanzaComprobacionDOList;
    }

    public void setNdtA8BalanzaComprobacionDOList(List<NdtA8BalanzaComprobacionDO> ndtA8BalanzaComprobacionDOList) {
        this.ndtA8BalanzaComprobacionDOList = ndtA8BalanzaComprobacionDOList;
    }

    public List<NdtA2OtraPrestOtorgadaDO> getNdtA2OtraPrestOtorgadaDOList() {
        return ndtA2OtraPrestOtorgadaDOList;
    }

    public void setNdtA2OtraPrestOtorgadaDOList(List<NdtA2OtraPrestOtorgadaDO> ndtA2OtraPrestOtorgadaDOList) {
        this.ndtA2OtraPrestOtorgadaDOList = ndtA2OtraPrestOtorgadaDOList;
    }

    public List<NdtA72CeBienDO> getNdtA72CeBienDOList() {
        return ndtA72CeBienDOList;
    }

    public void setNdtA72CeBienDOList(List<NdtA72CeBienDO> ndtA72CeBienDOList) {
        this.ndtA72CeBienDOList = ndtA72CeBienDOList;
    }

    public List<NdtModeloOpinionDO> getNdtModeloOpinionDOList() {
        return ndtModeloOpinionDOList;
    }

    public void setNdtModeloOpinionDOList(List<NdtModeloOpinionDO> ndtModeloOpinionDOList) {
        this.ndtModeloOpinionDOList = ndtModeloOpinionDOList;
    }

    public List<NdtB1CedulaRemuneracionesDO> getNdtB1CedulaRemuneracionesDOList() {
        return ndtB1CedulaRemuneracionesDOList;
    }

    public void setNdtB1CedulaRemuneracionesDOList(List<NdtB1CedulaRemuneracionesDO> ndtB1CedulaRemuneracionesDOList) {
        this.ndtB1CedulaRemuneracionesDOList = ndtB1CedulaRemuneracionesDOList;
    }

    public List<NdtA6SubcontratacionSpDO> getNdtA6SubcontratacionSpDOList() {
        return ndtA6SubcontratacionSpDOList;
    }

    public void setNdtA6SubcontratacionSpDOList(List<NdtA6SubcontratacionSpDO> ndtA6SubcontratacionSpDOList) {
        this.ndtA6SubcontratacionSpDOList = ndtA6SubcontratacionSpDOList;
    }

    public List<NdtA61PersonalProporcionadDO> getNdtA61PersonalProporcionadDOList() {
        return ndtA61PersonalProporcionadDOList;
    }

    public void setNdtA61PersonalProporcionadDOList(List<NdtA61PersonalProporcionadDO> ndtA61PersonalProporcionadDOList) {
        this.ndtA61PersonalProporcionadDOList = ndtA61PersonalProporcionadDOList;
    }

    public List<NdtA4PagoPersonaFisicaDO> getNdtA4PagoPersonaFisicaDOList() {
        return ndtA4PagoPersonaFisicaDOList;
    }

    public void setNdtA4PagoPersonaFisicaDOList(List<NdtA4PagoPersonaFisicaDO> ndtA4PagoPersonaFisicaDOList) {
        this.ndtA4PagoPersonaFisicaDOList = ndtA4PagoPersonaFisicaDOList;
    }

    public List<NdtCedulaPagosDiferenciasDO> getNdtCedulaPagosDiferenciasDOList() {
        return ndtCedulaPagosDiferenciasDOList;
    }

    public void setNdtCedulaPagosDiferenciasDOList(List<NdtCedulaPagosDiferenciasDO> ndtCedulaPagosDiferenciasDOList) {
        this.ndtCedulaPagosDiferenciasDOList = ndtCedulaPagosDiferenciasDOList;
    }

    public List<NdtA1PercepTrabajadorDO> getNdtA1PercepTrabajadorDOList() {
        return ndtA1PercepTrabajadorDOList;
    }

    public void setNdtA1PercepTrabajadorDOList(List<NdtA1PercepTrabajadorDO> ndtA1PercepTrabajadorDOList) {
        this.ndtA1PercepTrabajadorDOList = ndtA1PercepTrabajadorDOList;
    }

    public List<NdtA75CePersonalDO> getNdtA75CePersonalDOList() {
        return ndtA75CePersonalDOList;
    }

    public void setNdtA75CePersonalDOList(List<NdtA75CePersonalDO> ndtA75CePersonalDOList) {
        this.ndtA75CePersonalDOList = ndtA75CePersonalDOList;
    }

    public List<NdtA911PersonalObraDO> getNdtA911PersonalObraDOList() {
        return ndtA911PersonalObraDOList;
    }

    public void setNdtA911PersonalObraDOList(List<NdtA911PersonalObraDO> ndtA911PersonalObraDOList) {
        this.ndtA911PersonalObraDOList = ndtA911PersonalObraDOList;
    }

    public List<NdtB2CedulaPrestacionesDO> getNdtB2CedulaPrestacionesDOList() {
        return ndtB2CedulaPrestacionesDOList;
    }

    public void setNdtB2CedulaPrestacionesDOList(List<NdtB2CedulaPrestacionesDO> ndtB2CedulaPrestacionesDOList) {
        this.ndtB2CedulaPrestacionesDOList = ndtB2CedulaPrestacionesDOList;
    }

    public List<NdtCargaDocumentoDO> getNdtCargaDocumentoDOList() {
        return ndtCargaDocumentoDOList;
    }

    public void setNdtCargaDocumentoDOList(List<NdtCargaDocumentoDO> ndtCargaDocumentoDOList) {
        this.ndtCargaDocumentoDOList = ndtCargaDocumentoDOList;
    }

    public List<NdtA91ObrasConstruccionDO> getNdtA91ObrasConstruccionDOList() {
        return ndtA91ObrasConstruccionDOList;
    }

    public void setNdtA91ObrasConstruccionDOList(List<NdtA91ObrasConstruccionDO> ndtA91ObrasConstruccionDOList) {
        this.ndtA91ObrasConstruccionDOList = ndtA91ObrasConstruccionDOList;
    }

    public List<NdtA921PersSubcontratadoDO> getNdtA921PersSubcontratadoDOList() {
        return ndtA921PersSubcontratadoDOList;
    }

    public void setNdtA921PersSubcontratadoDOList(List<NdtA921PersSubcontratadoDO> ndtA921PersSubcontratadoDOList) {
        this.ndtA921PersSubcontratadoDOList = ndtA921PersSubcontratadoDOList;
    }

    public List<NdtDictamenEstadosDO> getNdtDictamenEstadosDOList() {
        return ndtDictamenEstadosDOList;
    }

    public void setNdtDictamenEstadosDOList(List<NdtDictamenEstadosDO> ndtDictamenEstadosDOList) {
        this.ndtDictamenEstadosDOList = ndtDictamenEstadosDOList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdPatronDictamen != null ? cveIdPatronDictamen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtPatronDictamenDO)) {
            return false;
        }
        NdtPatronDictamenDO other = (NdtPatronDictamenDO) object;
        if ((this.cveIdPatronDictamen == null && other.cveIdPatronDictamen != null) || (this.cveIdPatronDictamen != null && !this.cveIdPatronDictamen.equals(other.cveIdPatronDictamen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtPatronDictamenDO[ cveIdPatronDictamen=" + cveIdPatronDictamen + " ]";
    }

	/**
	 * @return the cveIdPersonaMoral
	 */
	public Long getCveIdPersonaMoral() {
		return cveIdPersonaMoral;
	}

	/**
	 * @param cveIdPersonaMoral the cveIdPersonaMoral to set
	 */
	public void setCveIdPersonaMoral(Long cveIdPersonaMoral) {
		this.cveIdPersonaMoral = cveIdPersonaMoral;
	}

	/**
	 * @return the cveIdPatronSujetoObligado
	 */
	public Long getCveIdPatronSujetoObligado() {
		return cveIdPatronSujetoObligado;
	}

	/**
	 * @param cveIdPatronSujetoObligado the cveIdPatronSujetoObligado to set
	 */
	public void setCveIdPatronSujetoObligado(Long cveIdPatronSujetoObligado) {
		this.cveIdPatronSujetoObligado = cveIdPatronSujetoObligado;
	}

	/**
	 * @return the cveIdSubdelegacion
	 */
	public Long getCveIdSubdelegacion() {
		return cveIdSubdelegacion;
	}

	/**
	 * @param cveIdSubdelegacion the cveIdSubdelegacion to set
	 */
	public void setCveIdSubdelegacion(Long cveIdSubdelegacion) {
		this.cveIdSubdelegacion = cveIdSubdelegacion;
	}

	/**
	 * @return the cveIdTramite
	 */
	public Long getCveIdTramite() {
		return cveIdTramite;
	}

	/**
	 * @param cveIdTramite the cveIdTramite to set
	 */
	public void setCveIdTramite(Long cveIdTramite) {
		this.cveIdTramite = cveIdTramite;
	}
    
}
