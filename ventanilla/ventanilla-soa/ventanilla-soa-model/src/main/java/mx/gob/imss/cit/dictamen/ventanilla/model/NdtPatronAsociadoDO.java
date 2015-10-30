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
@Table(name = "NDT_PATRON_ASOCIADO")
@NamedQueries({
    @NamedQuery(name = "NdtPatronAsociadoDO.findAll", query = "SELECT n FROM NdtPatronAsociadoDO n"),
    @NamedQuery(name = "NdtPatronAsociadoDO.findByCveIdPatronAsociado", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.cveIdPatronAsociado = :cveIdPatronAsociado"),
    @NamedQuery(name = "NdtPatronAsociadoDO.findByCveIdPatronSujetoObligado", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.cveIdPatronSujetoObligado = :cveIdPatronSujetoObligado"),
    @NamedQuery(name = "NdtPatronAsociadoDO.findByCveIdSubdelegacion", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.cveIdSubdelegacion = :cveIdSubdelegacion"),
    @NamedQuery(name = "NdtPatronAsociadoDO.findByCveIdDivisionAlcierreEjer", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.cveIdDivisionAlcierreEjer = :cveIdDivisionAlcierreEjer"),
    @NamedQuery(name = "NdtPatronAsociadoDO.findByCveIdGrupoAlcierreEjer", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.cveIdGrupoAlcierreEjer = :cveIdGrupoAlcierreEjer"),
    @NamedQuery(name = "NdtPatronAsociadoDO.findByNumTrabajadoresPromedio", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.numTrabajadoresPromedio = :numTrabajadoresPromedio"),
    @NamedQuery(name = "NdtPatronAsociadoDO.findByCveIdFraccionAlcierreEjer", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.cveIdFraccionAlcierreEjer = :cveIdFraccionAlcierreEjer"),
    @NamedQuery(name = "NdtPatronAsociadoDO.findByCveIdClaseAlcierreEjer", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.cveIdClaseAlcierreEjer = :cveIdClaseAlcierreEjer"),
    @NamedQuery(name = "NdtPatronAsociadoDO.findByCveIdActividadAlcierreEjer", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.cveIdActividadAlcierreEjer = :cveIdActividadAlcierreEjer"),
    @NamedQuery(name = "NdtPatronAsociadoDO.findByIndPatronConeldomfiscal", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.indPatronConeldomfiscal = :indPatronConeldomfiscal"),
    @NamedQuery(name = "NdtPatronAsociadoDO.findByDesRfcPatron", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.desRfcPatron = :desRfcPatron"),
    @NamedQuery(name = "NdtPatronAsociadoDO.findByCalleDomfiscal", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.calleDomfiscal = :calleDomfiscal"),
    @NamedQuery(name = "NdtPatronAsociadoDO.findByNumExteriorDomfiscal", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.numExteriorDomfiscal = :numExteriorDomfiscal"),
    @NamedQuery(name = "NdtPatronAsociadoDO.findByNumInteriorDomfiscal", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.numInteriorDomfiscal = :numInteriorDomfiscal"),
    @NamedQuery(name = "NdtPatronAsociadoDO.findByColoniaDomfiscal", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.coloniaDomfiscal = :coloniaDomfiscal"),
    @NamedQuery(name = "NdtPatronAsociadoDO.findByCodigopostalDomfiscal", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.codigopostalDomfiscal = :codigopostalDomfiscal"),
    @NamedQuery(name = "NdtPatronAsociadoDO.findByMunicipioDomfiscal", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.municipioDomfiscal = :municipioDomfiscal"),
    @NamedQuery(name = "NdtPatronAsociadoDO.findByEntidadDomfiscal", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.entidadDomfiscal = :entidadDomfiscal"),
    @NamedQuery(name = "NdtPatronAsociadoDO.findByDesNombreRazonsocialPatron", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.desNombreRazonsocialPatron = :desNombreRazonsocialPatron"),
    @NamedQuery(name = "NdtPatronAsociadoDO.findByTelefono", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.telefono = :telefono"),
    @NamedQuery(name = "NdtPatronAsociadoDO.findByCveIdUsuario", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.cveIdUsuario = :cveIdUsuario"),
    @NamedQuery(name = "NdtPatronAsociadoDO.findByFecRegistroAlta", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtPatronAsociadoDO.findByFecRegistroBaja", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtPatronAsociadoDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado"),
    @NamedQuery(name = "NdtPatronAsociadoDO.findByIdPatronDictamen", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.cveIdPatronDictamen.cveIdPatronDictamen = :cveIdPatronDictamen")})
public class NdtPatronAsociadoDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_PATRON_ASOCIADO", nullable = false, precision = 22, scale = 0)
    @SequenceGenerator(name = "NdtPatronAsociado_Id_Seq_Gen", sequenceName = "SEQ_NDTPATRONASOCIADO", allocationSize=1)
    @GeneratedValue(generator = "NdtPatronAsociado_Id_Seq_Gen")
    private Long cveIdPatronAsociado;
    @Column(name = "CVE_ID_PATRON_SUJETO_OBLIGADO")
    private Integer cveIdPatronSujetoObligado;
    @Column(name = "CVE_ID_SUBDELEGACION")
    private Integer cveIdSubdelegacion;
    @Size(max = 18)
    @Column(name = "CVE_ID_DIVISION_ALCIERRE_EJER", length = 18)
    private String cveIdDivisionAlcierreEjer;
    @Size(max = 18)
    @Column(name = "CVE_ID_GRUPO_ALCIERRE_EJER", length = 18)
    private String cveIdGrupoAlcierreEjer;
    @Column(name = "NUM_TRABAJADORES_PROMEDIO")
    private Integer numTrabajadoresPromedio;
    @Size(max = 18)
    @Column(name = "CVE_ID_FRACCION_ALCIERRE_EJER", length = 18)
    private String cveIdFraccionAlcierreEjer;
    @Size(max = 18)
    @Column(name = "CVE_ID_CLASE_ALCIERRE_EJER", length = 18)
    private String cveIdClaseAlcierreEjer;
    @Size(max = 18)
    @Column(name = "CVE_ID_ACTIVIDAD_ALCIERRE_EJER", length = 18)
    private String cveIdActividadAlcierreEjer;
    @Column(name = "IND_PATRON_CONELDOMFISCAL")
    private Short indPatronConeldomfiscal;
    @Size(max = 13)
    @Column(name = "DES_RFC_PATRON", length = 13)
    private String desRfcPatron;
    @Size(max = 100)
    @Column(name = "CALLE_DOMFISCAL", length = 100)
    private String calleDomfiscal;
    @Size(max = 10)
    @Column(name = "NUM_EXTERIOR_DOMFISCAL", length = 10)
    private String numExteriorDomfiscal;
    @Size(max = 10)
    @Column(name = "NUM_INTERIOR_DOMFISCAL", length = 10)
    private String numInteriorDomfiscal;
    @Size(max = 100)
    @Column(name = "COLONIA_DOMFISCAL", length = 100)
    private String coloniaDomfiscal;
    @Size(max = 5)
    @Column(name = "CODIGOPOSTAL_DOMFISCAL", length = 5)
    private String codigopostalDomfiscal;
    @Size(max = 100)
    @Column(name = "MUNICIPIO_DOMFISCAL", length = 100)
    private String municipioDomfiscal;
    @Size(max = 100)
    @Column(name = "ENTIDAD_DOMFISCAL", length = 100)
    private String entidadDomfiscal;
    @Size(max = 200)
    @Column(name = "DES_NOMBRE_RAZONSOCIAL_PATRON", length = 200)
    private String desNombreRazonsocialPatron;
    @Size(max = 15)
    @Column(name = "TELEFONO", length = 15)
    private String telefono;
    @Size(max = 18)
    @Column(name = "CVE_ID_USUARIO", length = 18)
    private String cveIdUsuario;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA51PersonalProporcionadDO> ndtA51PersonalProporcionadDOList;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA71CeProcesoDO> ndtA71CeProcesoDOList;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA92ObrasSubcontrataDO> ndtA92ObrasSubcontrataDOList;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA73CeMaquinariaDO> ndtA73CeMaquinariaDOList;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA5PrestadoraServiciosDO> ndtA5PrestadoraServiciosDOList;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA76CeActCompDO> ndtA76CeActCompDOList;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA3CuotaObreroPatronalDO> ndtA3CuotaObreroPatronalDOList;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA74CeTransporteDO> ndtA74CeTransporteDOList;
    @JoinColumn(name = "CVE_ID_PATRON_DICTAMEN", referencedColumnName = "CVE_ID_PATRON_DICTAMEN")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtPatronDictamenDO cveIdPatronDictamen;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA8BalanzaComprobacionDO> ndtA8BalanzaComprobacionDOList;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA2OtraPrestOtorgadaDO> ndtA2OtraPrestOtorgadaDOList;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA72CeBienDO> ndtA72CeBienDOList;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA6SubcontratacionSpDO> ndtA6SubcontratacionSpDOList;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA61PersonalProporcionadDO> ndtA61PersonalProporcionadDOList;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA4PagoPersonaFisicaDO> ndtA4PagoPersonaFisicaDOList;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtCedulaPagosDiferenciasDO> ndtCedulaPagosDiferenciasDOList;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA1PercepTrabajadorDO> ndtA1PercepTrabajadorDOList;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA75CePersonalDO> ndtA75CePersonalDOList;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA911PersonalObraDO> ndtA911PersonalObraDOList;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA91ObrasConstruccionDO> ndtA91ObrasConstruccionDOList;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA921PersSubcontratadoDO> ndtA921PersSubcontratadoDOList;

    public NdtPatronAsociadoDO() {
    }

    public NdtPatronAsociadoDO(Long cveIdPatronAsociado) {
        this.cveIdPatronAsociado = cveIdPatronAsociado;
    }

    public Long getCveIdPatronAsociado() {
        return cveIdPatronAsociado;
    }

    public void setCveIdPatronAsociado(Long cveIdPatronAsociado) {
        this.cveIdPatronAsociado = cveIdPatronAsociado;
    }

    public Integer getCveIdPatronSujetoObligado() {
        return cveIdPatronSujetoObligado;
    }

    public void setCveIdPatronSujetoObligado(Integer cveIdPatronSujetoObligado) {
        this.cveIdPatronSujetoObligado = cveIdPatronSujetoObligado;
    }

    public Integer getCveIdSubdelegacion() {
        return cveIdSubdelegacion;
    }

    public void setCveIdSubdelegacion(Integer cveIdSubdelegacion) {
        this.cveIdSubdelegacion = cveIdSubdelegacion;
    }

    public String getCveIdDivisionAlcierreEjer() {
        return cveIdDivisionAlcierreEjer;
    }

    public void setCveIdDivisionAlcierreEjer(String cveIdDivisionAlcierreEjer) {
        this.cveIdDivisionAlcierreEjer = cveIdDivisionAlcierreEjer;
    }

    public String getCveIdGrupoAlcierreEjer() {
        return cveIdGrupoAlcierreEjer;
    }

    public void setCveIdGrupoAlcierreEjer(String cveIdGrupoAlcierreEjer) {
        this.cveIdGrupoAlcierreEjer = cveIdGrupoAlcierreEjer;
    }

    public Integer getNumTrabajadoresPromedio() {
        return numTrabajadoresPromedio;
    }

    public void setNumTrabajadoresPromedio(Integer numTrabajadoresPromedio) {
        this.numTrabajadoresPromedio = numTrabajadoresPromedio;
    }

    public String getCveIdFraccionAlcierreEjer() {
        return cveIdFraccionAlcierreEjer;
    }

    public void setCveIdFraccionAlcierreEjer(String cveIdFraccionAlcierreEjer) {
        this.cveIdFraccionAlcierreEjer = cveIdFraccionAlcierreEjer;
    }

    public String getCveIdClaseAlcierreEjer() {
        return cveIdClaseAlcierreEjer;
    }

    public void setCveIdClaseAlcierreEjer(String cveIdClaseAlcierreEjer) {
        this.cveIdClaseAlcierreEjer = cveIdClaseAlcierreEjer;
    }

    public String getCveIdActividadAlcierreEjer() {
        return cveIdActividadAlcierreEjer;
    }

    public void setCveIdActividadAlcierreEjer(String cveIdActividadAlcierreEjer) {
        this.cveIdActividadAlcierreEjer = cveIdActividadAlcierreEjer;
    }

    public Short getIndPatronConeldomfiscal() {
        return indPatronConeldomfiscal;
    }

    public void setIndPatronConeldomfiscal(Short indPatronConeldomfiscal) {
        this.indPatronConeldomfiscal = indPatronConeldomfiscal;
    }

    public String getDesRfcPatron() {
        return desRfcPatron;
    }

    public void setDesRfcPatron(String desRfcPatron) {
        this.desRfcPatron = desRfcPatron;
    }

    public String getCalleDomfiscal() {
        return calleDomfiscal;
    }

    public void setCalleDomfiscal(String calleDomfiscal) {
        this.calleDomfiscal = calleDomfiscal;
    }

    public String getNumExteriorDomfiscal() {
        return numExteriorDomfiscal;
    }

    public void setNumExteriorDomfiscal(String numExteriorDomfiscal) {
        this.numExteriorDomfiscal = numExteriorDomfiscal;
    }

    public String getNumInteriorDomfiscal() {
        return numInteriorDomfiscal;
    }

    public void setNumInteriorDomfiscal(String numInteriorDomfiscal) {
        this.numInteriorDomfiscal = numInteriorDomfiscal;
    }

    public String getColoniaDomfiscal() {
        return coloniaDomfiscal;
    }

    public void setColoniaDomfiscal(String coloniaDomfiscal) {
        this.coloniaDomfiscal = coloniaDomfiscal;
    }

    public String getCodigopostalDomfiscal() {
        return codigopostalDomfiscal;
    }

    public void setCodigopostalDomfiscal(String codigopostalDomfiscal) {
        this.codigopostalDomfiscal = codigopostalDomfiscal;
    }

    public String getMunicipioDomfiscal() {
        return municipioDomfiscal;
    }

    public void setMunicipioDomfiscal(String municipioDomfiscal) {
        this.municipioDomfiscal = municipioDomfiscal;
    }

    public String getEntidadDomfiscal() {
        return entidadDomfiscal;
    }

    public void setEntidadDomfiscal(String entidadDomfiscal) {
        this.entidadDomfiscal = entidadDomfiscal;
    }

    public String getDesNombreRazonsocialPatron() {
        return desNombreRazonsocialPatron;
    }

    public void setDesNombreRazonsocialPatron(String desNombreRazonsocialPatron) {
        this.desNombreRazonsocialPatron = desNombreRazonsocialPatron;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCveIdUsuario() {
        return cveIdUsuario;
    }

    public void setCveIdUsuario(String cveIdUsuario) {
        this.cveIdUsuario = cveIdUsuario;
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

    public NdtPatronDictamenDO getCveIdPatronDictamen() {
        return cveIdPatronDictamen;
    }

    public void setCveIdPatronDictamen(NdtPatronDictamenDO cveIdPatronDictamen) {
        this.cveIdPatronDictamen = cveIdPatronDictamen;
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
        hash += (cveIdPatronAsociado != null ? cveIdPatronAsociado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtPatronAsociadoDO)) {
            return false;
        }
        NdtPatronAsociadoDO other = (NdtPatronAsociadoDO) object;
        if ((this.cveIdPatronAsociado == null && other.cveIdPatronAsociado != null) || (this.cveIdPatronAsociado != null && !this.cveIdPatronAsociado.equals(other.cveIdPatronAsociado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtPatronAsociadoDO[ cveIdPatronAsociado=" + cveIdPatronAsociado + " ]";
    }
    
}
