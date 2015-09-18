/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;

import java.math.BigInteger;
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
    @NamedQuery(name = "NdtPatronDictamenDO.findByCveIdUsuario", query = "SELECT n FROM NdtPatronDictamenDO n WHERE n.cveIdUsuario = :cveIdUsuario")})
public class NdtPatronDictamenDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_PATRON_DICTAMEN", nullable = false, precision = 22, scale = 0)
    @SequenceGenerator(name = "NdtPatronDictamen_Id_Seq_Gen", sequenceName = "SEQ_NDTPATRONDICTAMEN")
    @GeneratedValue(generator = "NdtPatronDictamen_Id_Seq_Gen")
    private Long cveIdPatronDictamen;
    @Size(max = 50)
    @Column(name = "DES_RFC", length = 50)
    private String desRfc;
    @Size(max = 255)
    @Column(name = "DES_NOMBRE_RAZON_SOCIAL", length = 255)
    private String desNombreRazonSocial;
    @Column(name = "NUM_NUMERO_TRABAJADORES")
    private BigInteger numNumeroTrabajadores;
    @Column(name = "NUM_REGISTRO_PATRONALES")
    private BigInteger numRegistroPatronales;
    @Column(name = "IND_PATRON_OBLIGADO")
    private BigInteger indPatronObligado;
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
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtA51PersonalProporcionadDO> ndtA51PersonalProporcionadDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtCargaAseveracionesDO> ndtCargaAseveracionesDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtA71CeProcesoDO> ndtA71CeProcesoDODOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtA92ObrasSubcontrataDO> ndtA92ObrasSubcontrataDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtA73CeMaquinariaDO> ndtA73CeMaquinariaDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtA5PrestadoraServiciosDO> ndtA5PrestadoraServiciosDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtA76CeActCompDO> ndtA76CeActCompDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtAtestiguamientoPreguntasDO> ndtAtestiguamientoPreguntasDOList;
    @JoinColumn(name = "CVE_ID_TIPO_DICTAMEN", referencedColumnName = "CVE_ID_TIPO_DICTAMEN")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcTipoDictamenDO cveIdTipoDictamen;
    @JoinColumn(name = "CVE_ID_EJER_FISCAL", referencedColumnName = "CVE_ID_EJER_FISCAL")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcEjercicioFiscalDO cveIdEjerFiscal;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtA3CuotaObreroPatronalDO> ndtA3CuotaObreroPatronalDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtA74CeTransporteDO> ndtA74CeTransporteDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtA8BalanzaComprobacionDO> ndtA8BalanzaComprobacionDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtNotasDictamenDO> ndtNotasDictamenDOList;
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
    private List<NdtPatronDictamenCpaDO> ndtPatronDictamenCpaDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtA1PercepTrabajadorDO> ndtA1PercepTrabajadorDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtA75CePersonalDO> ndtA75CePersonalDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtA911PersonalObraDO> ndtA911PersonalObraDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtB2CedulaPrestacionesDO> ndtB2CedulaPrestacionesDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtA91ObrasConstruccionDO> ndtA91ObrasConstruccionDOList;
    @OneToMany(mappedBy = "cveIdPatronDictamen", fetch = FetchType.LAZY)
    private List<NdtA921PersSubcontratadoDO> ndtA921PersSubcontratadoDOList;

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

    public BigInteger getNumNumeroTrabajadores() {
        return numNumeroTrabajadores;
    }

    public void setNumNumeroTrabajadores(BigInteger numNumeroTrabajadores) {
        this.numNumeroTrabajadores = numNumeroTrabajadores;
    }

    public BigInteger getNumRegistroPatronales() {
        return numRegistroPatronales;
    }

    public void setNumRegistroPatronales(BigInteger numRegistroPatronales) {
        this.numRegistroPatronales = numRegistroPatronales;
    }

    public BigInteger getIndPatronObligado() {
        return indPatronObligado;
    }

    public void setIndPatronObligado(BigInteger indPatronObligado) {
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

    public List<NdtCargaAseveracionesDO> getNdtCargaAseveracionesDOList() {
        return ndtCargaAseveracionesDOList;
    }

    public void setNdtCargaAseveracionesDOList(List<NdtCargaAseveracionesDO> ndtCargaAseveracionesDOList) {
        this.ndtCargaAseveracionesDOList = ndtCargaAseveracionesDOList;
    }

    public List<NdtA71CeProcesoDO> getNdtA71CeProcesoDODOList() {
        return ndtA71CeProcesoDODOList;
    }

    public void setNdtA71CeProcesoDODOList(List<NdtA71CeProcesoDO> ndtA71CeProcesoDODOList) {
        this.ndtA71CeProcesoDODOList = ndtA71CeProcesoDODOList;
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

    public List<NdtAtestiguamientoPreguntasDO> getNdtAtestiguamientoPreguntasDOList() {
        return ndtAtestiguamientoPreguntasDOList;
    }

    public void setNdtAtestiguamientoPreguntasDOList(List<NdtAtestiguamientoPreguntasDO> ndtAtestiguamientoPreguntasDOList) {
        this.ndtAtestiguamientoPreguntasDOList = ndtAtestiguamientoPreguntasDOList;
    }

    public NdcTipoDictamenDO getCveIdTipoDictamen() {
        return cveIdTipoDictamen;
    }

    public void setCveIdTipoDictamen(NdcTipoDictamenDO cveIdTipoDictamen) {
        this.cveIdTipoDictamen = cveIdTipoDictamen;
    }

    public NdcEjercicioFiscalDO getCveIdEjerFiscal() {
        return cveIdEjerFiscal;
    }

    public void setCveIdEjerFiscal(NdcEjercicioFiscalDO cveIdEjerFiscal) {
        this.cveIdEjerFiscal = cveIdEjerFiscal;
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

    public List<NdtA8BalanzaComprobacionDO> getNdtA8BalanzaComprobacionDOList() {
        return ndtA8BalanzaComprobacionDOList;
    }

    public void setNdtA8BalanzaComprobacionDOList(List<NdtA8BalanzaComprobacionDO> ndtA8BalanzaComprobacionDOList) {
        this.ndtA8BalanzaComprobacionDOList = ndtA8BalanzaComprobacionDOList;
    }

    public List<NdtNotasDictamenDO> getNdtNotasDictamenDOList() {
        return ndtNotasDictamenDOList;
    }

    public void setNdtNotasDictamenDOList(List<NdtNotasDictamenDO> ndtNotasDictamenDOList) {
        this.ndtNotasDictamenDOList = ndtNotasDictamenDOList;
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

    public List<NdtPatronDictamenCpaDO> getNdtPatronDictamenCpaDOList() {
        return ndtPatronDictamenCpaDOList;
    }

    public void setNdtPatronDictamenCpaDOList(List<NdtPatronDictamenCpaDO> ndtPatronDictamenCpaDOList) {
        this.ndtPatronDictamenCpaDOList = ndtPatronDictamenCpaDOList;
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
    
}
