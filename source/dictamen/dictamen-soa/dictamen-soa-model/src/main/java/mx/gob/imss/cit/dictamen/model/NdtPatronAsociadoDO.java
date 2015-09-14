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
@Table(name = "NDT_PATRON_ASOCIADO")
@NamedQueries({
    @NamedQuery(name = "NdtPatronAsociado.findAll", query = "SELECT n FROM NdtPatronAsociadoDO n"),
    @NamedQuery(name = "NdtPatronAsociado.findByCveIdPatronAsociado", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.cveIdPatronAsociado = :cveIdPatronAsociado"),
    @NamedQuery(name = "NdtPatronAsociado.findByNumTrabajadoresPromedio", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.numTrabajadoresPromedio = :numTrabajadoresPromedio"),
    @NamedQuery(name = "NdtPatronAsociado.findByIndPatronConeldomfiscal", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.indPatronConeldomfiscal = :indPatronConeldomfiscal"),
    @NamedQuery(name = "NdtPatronAsociado.findByDesRfcPatron", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.desRfcPatron = :desRfcPatron"),
    @NamedQuery(name = "NdtPatronAsociado.findByCalleDomfiscal", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.calleDomfiscal = :calleDomfiscal"),
    @NamedQuery(name = "NdtPatronAsociado.findByNumExteriorDomfiscal", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.numExteriorDomfiscal = :numExteriorDomfiscal"),
    @NamedQuery(name = "NdtPatronAsociado.findByNumInteriorDomfiscal", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.numInteriorDomfiscal = :numInteriorDomfiscal"),
    @NamedQuery(name = "NdtPatronAsociado.findByColoniaDomfiscal", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.coloniaDomfiscal = :coloniaDomfiscal"),
    @NamedQuery(name = "NdtPatronAsociado.findByCodigopostalDomfiscal", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.codigopostalDomfiscal = :codigopostalDomfiscal"),
    @NamedQuery(name = "NdtPatronAsociado.findByMunicipioDomfiscal", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.municipioDomfiscal = :municipioDomfiscal"),
    @NamedQuery(name = "NdtPatronAsociado.findByEntidadDomfiscal", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.entidadDomfiscal = :entidadDomfiscal"),
    @NamedQuery(name = "NdtPatronAsociado.findByDesNombreRazonsocialPatron", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.desNombreRazonsocialPatron = :desNombreRazonsocialPatron"),
    @NamedQuery(name = "NdtPatronAsociado.findByTelefono", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.telefono = :telefono"),
    @NamedQuery(name = "NdtPatronAsociado.findByCveIdUsuario", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.cveIdUsuario = :cveIdUsuario"),
    @NamedQuery(name = "NdtPatronAsociado.findByFecRegistroAlta", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtPatronAsociado.findByFecRegistroBaja", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtPatronAsociado.findByFecRegistroActualizado", query = "SELECT n FROM NdtPatronAsociadoDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdtPatronAsociadoDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_PATRON_ASOCIADO", nullable = false, precision = 22, scale = 0)
    private Long cveIdPatronAsociado;
    @Column(name = "NUM_TRABAJADORES_PROMEDIO")
    private Integer numTrabajadoresPromedio;
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
    private List<NdtA51PersonalProporcionadDO> ndtA51PersonalProporcionadList;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA71CeProcesoDO> ndtA71CeProcesoList;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA92ObrasSubcontrataDO> ndtA92ObrasSubcontrataList;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA73CeMaquinariaDO> ndtA73CeMaquinariaList;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA5PrestadoraServiciosDO> ndtA5PrestadoraServiciosList;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA76CeActCompDO> ndtA76CeActCompList;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA3CuotaObreroPatronalDO> ndtA3CuotaObreroPatronalList;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA74CeTransporteDO> ndtA74CeTransporteList;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtBitCargaAseveracionesDO> ndtBitCargaAseveracionesList;
    @JoinColumn(name = "CVE_ID_PATRON_DICTAMEN", referencedColumnName = "CVE_ID_PATRON_DICTAMEN")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtPatronDictamenDO cveIdPatronDictamen;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA8BalanzaComprobacionDO> ndtA8BalanzaComprobacionList;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA2OtraPrestOtorgadaDO> ndtA2OtraPrestOtorgadaList;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA72CeBienDO> ndtA72CeBienList;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA6SubcontratacionSpDO> ndtA6SubcontratacionSpList;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA61PersonalProporcionadDO> ndtA61PersonalProporcionadList;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA4PagoPersonaFisicaDO> ndtA4PagoPersonaFisicaList;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA1PercepTrabajadorDO> ndtA1PercepTrabajadorList;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA75CePersonalDO> ndtA75CePersonalList;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA911PersonalObraDO> ndtA911PersonalObraList;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA91ObrasConstruccionDO> ndtA91ObrasConstruccionList;
    @OneToMany(mappedBy = "cveIdPatronAsociado", fetch = FetchType.LAZY)
    private List<NdtA921PersSubcontratadoDO> ndtA921PersSubcontratadoList;

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

    public Integer getNumTrabajadoresPromedio() {
        return numTrabajadoresPromedio;
    }

    public void setNumTrabajadoresPromedio(Integer numTrabajadoresPromedio) {
        this.numTrabajadoresPromedio = numTrabajadoresPromedio;
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

    public List<NdtA51PersonalProporcionadDO> getNdtA51PersonalProporcionadList() {
        return ndtA51PersonalProporcionadList;
    }

    public void setNdtA51PersonalProporcionadList(List<NdtA51PersonalProporcionadDO> ndtA51PersonalProporcionadList) {
        this.ndtA51PersonalProporcionadList = ndtA51PersonalProporcionadList;
    }

    public List<NdtA71CeProcesoDO> getNdtA71CeProcesoList() {
        return ndtA71CeProcesoList;
    }

    public void setNdtA71CeProcesoList(List<NdtA71CeProcesoDO> ndtA71CeProcesoList) {
        this.ndtA71CeProcesoList = ndtA71CeProcesoList;
    }

    public List<NdtA92ObrasSubcontrataDO> getNdtA92ObrasSubcontrataList() {
        return ndtA92ObrasSubcontrataList;
    }

    public void setNdtA92ObrasSubcontrataList(List<NdtA92ObrasSubcontrataDO> ndtA92ObrasSubcontrataList) {
        this.ndtA92ObrasSubcontrataList = ndtA92ObrasSubcontrataList;
    }

    public List<NdtA73CeMaquinariaDO> getNdtA73CeMaquinariaList() {
        return ndtA73CeMaquinariaList;
    }

    public void setNdtA73CeMaquinariaList(List<NdtA73CeMaquinariaDO> ndtA73CeMaquinariaList) {
        this.ndtA73CeMaquinariaList = ndtA73CeMaquinariaList;
    }

    public List<NdtA5PrestadoraServiciosDO> getNdtA5PrestadoraServiciosList() {
        return ndtA5PrestadoraServiciosList;
    }

    public void setNdtA5PrestadoraServiciosList(List<NdtA5PrestadoraServiciosDO> ndtA5PrestadoraServiciosList) {
        this.ndtA5PrestadoraServiciosList = ndtA5PrestadoraServiciosList;
    }

    public List<NdtA76CeActCompDO> getNdtA76CeActCompList() {
        return ndtA76CeActCompList;
    }

    public void setNdtA76CeActCompList(List<NdtA76CeActCompDO> ndtA76CeActCompList) {
        this.ndtA76CeActCompList = ndtA76CeActCompList;
    }

    public List<NdtA3CuotaObreroPatronalDO> getNdtA3CuotaObreroPatronalList() {
        return ndtA3CuotaObreroPatronalList;
    }

    public void setNdtA3CuotaObreroPatronalList(List<NdtA3CuotaObreroPatronalDO> ndtA3CuotaObreroPatronalList) {
        this.ndtA3CuotaObreroPatronalList = ndtA3CuotaObreroPatronalList;
    }

    public List<NdtA74CeTransporteDO> getNdtA74CeTransporteList() {
        return ndtA74CeTransporteList;
    }

    public void setNdtA74CeTransporteList(List<NdtA74CeTransporteDO> ndtA74CeTransporteList) {
        this.ndtA74CeTransporteList = ndtA74CeTransporteList;
    }

    public List<NdtBitCargaAseveracionesDO> getNdtBitCargaAseveracionesList() {
        return ndtBitCargaAseveracionesList;
    }

    public void setNdtBitCargaAseveracionesList(List<NdtBitCargaAseveracionesDO> ndtBitCargaAseveracionesList) {
        this.ndtBitCargaAseveracionesList = ndtBitCargaAseveracionesList;
    }

    public NdtPatronDictamenDO getCveIdPatronDictamen() {
        return cveIdPatronDictamen;
    }

    public void setCveIdPatronDictamen(NdtPatronDictamenDO cveIdPatronDictamen) {
        this.cveIdPatronDictamen = cveIdPatronDictamen;
    }

    public List<NdtA8BalanzaComprobacionDO> getNdtA8BalanzaComprobacionList() {
        return ndtA8BalanzaComprobacionList;
    }

    public void setNdtA8BalanzaComprobacionList(List<NdtA8BalanzaComprobacionDO> ndtA8BalanzaComprobacionList) {
        this.ndtA8BalanzaComprobacionList = ndtA8BalanzaComprobacionList;
    }

    public List<NdtA2OtraPrestOtorgadaDO> getNdtA2OtraPrestOtorgadaList() {
        return ndtA2OtraPrestOtorgadaList;
    }

    public void setNdtA2OtraPrestOtorgadaList(List<NdtA2OtraPrestOtorgadaDO> ndtA2OtraPrestOtorgadaList) {
        this.ndtA2OtraPrestOtorgadaList = ndtA2OtraPrestOtorgadaList;
    }

    public List<NdtA72CeBienDO> getNdtA72CeBienList() {
        return ndtA72CeBienList;
    }

    public void setNdtA72CeBienList(List<NdtA72CeBienDO> ndtA72CeBienList) {
        this.ndtA72CeBienList = ndtA72CeBienList;
    }

    public List<NdtA6SubcontratacionSpDO> getNdtA6SubcontratacionSpList() {
        return ndtA6SubcontratacionSpList;
    }

    public void setNdtA6SubcontratacionSpList(List<NdtA6SubcontratacionSpDO> ndtA6SubcontratacionSpList) {
        this.ndtA6SubcontratacionSpList = ndtA6SubcontratacionSpList;
    }

    public List<NdtA61PersonalProporcionadDO> getNdtA61PersonalProporcionadList() {
        return ndtA61PersonalProporcionadList;
    }

    public void setNdtA61PersonalProporcionadList(List<NdtA61PersonalProporcionadDO> ndtA61PersonalProporcionadList) {
        this.ndtA61PersonalProporcionadList = ndtA61PersonalProporcionadList;
    }

    public List<NdtA4PagoPersonaFisicaDO> getNdtA4PagoPersonaFisicaList() {
        return ndtA4PagoPersonaFisicaList;
    }

    public void setNdtA4PagoPersonaFisicaList(List<NdtA4PagoPersonaFisicaDO> ndtA4PagoPersonaFisicaList) {
        this.ndtA4PagoPersonaFisicaList = ndtA4PagoPersonaFisicaList;
    }

    public List<NdtA1PercepTrabajadorDO> getNdtA1PercepTrabajadorList() {
        return ndtA1PercepTrabajadorList;
    }

    public void setNdtA1PercepTrabajadorList(List<NdtA1PercepTrabajadorDO> ndtA1PercepTrabajadorList) {
        this.ndtA1PercepTrabajadorList = ndtA1PercepTrabajadorList;
    }

    public List<NdtA75CePersonalDO> getNdtA75CePersonalList() {
        return ndtA75CePersonalList;
    }

    public void setNdtA75CePersonalList(List<NdtA75CePersonalDO> ndtA75CePersonalList) {
        this.ndtA75CePersonalList = ndtA75CePersonalList;
    }

    public List<NdtA911PersonalObraDO> getNdtA911PersonalObraList() {
        return ndtA911PersonalObraList;
    }

    public void setNdtA911PersonalObraList(List<NdtA911PersonalObraDO> ndtA911PersonalObraList) {
        this.ndtA911PersonalObraList = ndtA911PersonalObraList;
    }

    public List<NdtA91ObrasConstruccionDO> getNdtA91ObrasConstruccionList() {
        return ndtA91ObrasConstruccionList;
    }

    public void setNdtA91ObrasConstruccionList(List<NdtA91ObrasConstruccionDO> ndtA91ObrasConstruccionList) {
        this.ndtA91ObrasConstruccionList = ndtA91ObrasConstruccionList;
    }

    public List<NdtA921PersSubcontratadoDO> getNdtA921PersSubcontratadoList() {
        return ndtA921PersSubcontratadoList;
    }

    public void setNdtA921PersSubcontratadoList(List<NdtA921PersSubcontratadoDO> ndtA921PersSubcontratadoList) {
        this.ndtA921PersSubcontratadoList = ndtA921PersSubcontratadoList;
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
        return "mx.gob.imss.cit.dictamen.model.NdtPatronAsociado[ cveIdPatronAsociado=" + cveIdPatronAsociado + " ]";
    }
    
}
