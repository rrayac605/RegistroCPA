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
@Table(name = "NDT_A5_PRESTADORA_SERVICIOS")
@NamedQueries({
    @NamedQuery(name = "NdtA5PrestadoraServicios.findAll", query = "SELECT n FROM NdtA5PrestadoraServiciosDO n"),
    @NamedQuery(name = "NdtA5PrestadoraServicios.findByCveIdA5PrestadoraServicios", query = "SELECT n FROM NdtA5PrestadoraServiciosDO n WHERE n.cveIdA5PrestadoraServicios = :cveIdA5PrestadoraServicios"),
    @NamedQuery(name = "NdtA5PrestadoraServicios.findByNomNombreRazonsocialBen", query = "SELECT n FROM NdtA5PrestadoraServiciosDO n WHERE n.nomNombreRazonsocialBen = :nomNombreRazonsocialBen"),
    @NamedQuery(name = "NdtA5PrestadoraServicios.findByRfcBeneficiario", query = "SELECT n FROM NdtA5PrestadoraServiciosDO n WHERE n.rfcBeneficiario = :rfcBeneficiario"),
    @NamedQuery(name = "NdtA5PrestadoraServicios.findByRegPatronalBeneficiario", query = "SELECT n FROM NdtA5PrestadoraServiciosDO n WHERE n.regPatronalBeneficiario = :regPatronalBeneficiario"),
    @NamedQuery(name = "NdtA5PrestadoraServicios.findByFecVigenciaInicioContrato", query = "SELECT n FROM NdtA5PrestadoraServiciosDO n WHERE n.fecVigenciaInicioContrato = :fecVigenciaInicioContrato"),
    @NamedQuery(name = "NdtA5PrestadoraServicios.findByFecVigenciaFinalContrato", query = "SELECT n FROM NdtA5PrestadoraServiciosDO n WHERE n.fecVigenciaFinalContrato = :fecVigenciaFinalContrato"),
    @NamedQuery(name = "NdtA5PrestadoraServicios.findByNumTrabajadores", query = "SELECT n FROM NdtA5PrestadoraServiciosDO n WHERE n.numTrabajadores = :numTrabajadores"),
    @NamedQuery(name = "NdtA5PrestadoraServicios.findByIndElementosPsp", query = "SELECT n FROM NdtA5PrestadoraServiciosDO n WHERE n.indElementosPsp = :indElementosPsp"),
    @NamedQuery(name = "NdtA5PrestadoraServicios.findByIndResponsableDireccion", query = "SELECT n FROM NdtA5PrestadoraServiciosDO n WHERE n.indResponsableDireccion = :indResponsableDireccion"),
    @NamedQuery(name = "NdtA5PrestadoraServicios.findByImpCostoAnualNomina", query = "SELECT n FROM NdtA5PrestadoraServiciosDO n WHERE n.impCostoAnualNomina = :impCostoAnualNomina"),
    @NamedQuery(name = "NdtA5PrestadoraServicios.findByFolioSipress", query = "SELECT n FROM NdtA5PrestadoraServiciosDO n WHERE n.folioSipress = :folioSipress"),
    @NamedQuery(name = "NdtA5PrestadoraServicios.findByCveIdUsuario", query = "SELECT n FROM NdtA5PrestadoraServiciosDO n WHERE n.cveIdUsuario = :cveIdUsuario"),
    @NamedQuery(name = "NdtA5PrestadoraServicios.findByFecRegistroAlta", query = "SELECT n FROM NdtA5PrestadoraServiciosDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtA5PrestadoraServicios.findByFecRegistroBaja", query = "SELECT n FROM NdtA5PrestadoraServiciosDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtA5PrestadoraServicios.findByFecRegistroActualizado", query = "SELECT n FROM NdtA5PrestadoraServiciosDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado"),
    @NamedQuery(name = "NdtA5PrestadoraServicios.findByDesOtroEspecifique", query = "SELECT n FROM NdtA5PrestadoraServiciosDO n WHERE n.desOtroEspecifique = :desOtroEspecifique")})
public class NdtA5PrestadoraServiciosDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_A5_PRESTADORA_SERVICIOS", nullable = false, precision = 22, scale = 0)
    private Long cveIdA5PrestadoraServicios;
    @Size(max = 300)
    @Column(name = "NOM_NOMBRE_RAZONSOCIAL_BEN", length = 300)
    private String nomNombreRazonsocialBen;
    @Size(max = 13)
    @Column(name = "RFC_BENEFICIARIO", length = 13)
    private String rfcBeneficiario;
    @Size(max = 13)
    @Column(name = "REG_PATRONAL_BENEFICIARIO", length = 13)
    private String regPatronalBeneficiario;
    @Column(name = "FEC_VIGENCIA_INICIO_CONTRATO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecVigenciaInicioContrato;
    @Column(name = "FEC_VIGENCIA_FINAL_CONTRATO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecVigenciaFinalContrato;
    @Column(name = "NUM_TRABAJADORES")
    private Integer numTrabajadores;
    @Column(name = "IND_ELEMENTOS_PSP")
    private Short indElementosPsp;
    @Column(name = "IND_RESPONSABLE_DIRECCION")
    private Short indResponsableDireccion;
    @Column(name = "IMP_COSTO_ANUAL_NOMINA", precision = 14, scale = 2)
    private Long impCostoAnualNomina;
    @Size(max = 30)
    @Column(name = "FOLIO_SIPRESS", length = 30)
    private String folioSipress;
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
    @Size(max = 18)
    @Column(name = "DES_OTRO_ESPECIFIQUE", length = 18)
    private String desOtroEspecifique;
    @JoinColumn(name = "CVE_ID_PATRON_ASOCIADO", referencedColumnName = "CVE_ID_PATRON_ASOCIADO")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtPatronAsociadoDO cveIdPatronAsociado;

    public NdtA5PrestadoraServiciosDO() {
    }

    public NdtA5PrestadoraServiciosDO(Long cveIdA5PrestadoraServicios) {
        this.cveIdA5PrestadoraServicios = cveIdA5PrestadoraServicios;
    }

    public Long getCveIdA5PrestadoraServicios() {
        return cveIdA5PrestadoraServicios;
    }

    public void setCveIdA5PrestadoraServicios(Long cveIdA5PrestadoraServicios) {
        this.cveIdA5PrestadoraServicios = cveIdA5PrestadoraServicios;
    }

    public String getNomNombreRazonsocialBen() {
        return nomNombreRazonsocialBen;
    }

    public void setNomNombreRazonsocialBen(String nomNombreRazonsocialBen) {
        this.nomNombreRazonsocialBen = nomNombreRazonsocialBen;
    }

    public String getRfcBeneficiario() {
        return rfcBeneficiario;
    }

    public void setRfcBeneficiario(String rfcBeneficiario) {
        this.rfcBeneficiario = rfcBeneficiario;
    }

    public String getRegPatronalBeneficiario() {
        return regPatronalBeneficiario;
    }

    public void setRegPatronalBeneficiario(String regPatronalBeneficiario) {
        this.regPatronalBeneficiario = regPatronalBeneficiario;
    }

    public Date getFecVigenciaInicioContrato() {
        return fecVigenciaInicioContrato;
    }

    public void setFecVigenciaInicioContrato(Date fecVigenciaInicioContrato) {
        this.fecVigenciaInicioContrato = fecVigenciaInicioContrato;
    }

    public Date getFecVigenciaFinalContrato() {
        return fecVigenciaFinalContrato;
    }

    public void setFecVigenciaFinalContrato(Date fecVigenciaFinalContrato) {
        this.fecVigenciaFinalContrato = fecVigenciaFinalContrato;
    }

    public Integer getNumTrabajadores() {
        return numTrabajadores;
    }

    public void setNumTrabajadores(Integer numTrabajadores) {
        this.numTrabajadores = numTrabajadores;
    }

    public Short getIndElementosPsp() {
        return indElementosPsp;
    }

    public void setIndElementosPsp(Short indElementosPsp) {
        this.indElementosPsp = indElementosPsp;
    }

    public Short getIndResponsableDireccion() {
        return indResponsableDireccion;
    }

    public void setIndResponsableDireccion(Short indResponsableDireccion) {
        this.indResponsableDireccion = indResponsableDireccion;
    }

    public Long getImpCostoAnualNomina() {
        return impCostoAnualNomina;
    }

    public void setImpCostoAnualNomina(Long impCostoAnualNomina) {
        this.impCostoAnualNomina = impCostoAnualNomina;
    }

    public String getFolioSipress() {
        return folioSipress;
    }

    public void setFolioSipress(String folioSipress) {
        this.folioSipress = folioSipress;
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

    public String getDesOtroEspecifique() {
        return desOtroEspecifique;
    }

    public void setDesOtroEspecifique(String desOtroEspecifique) {
        this.desOtroEspecifique = desOtroEspecifique;
    }

    public NdtPatronAsociadoDO getCveIdPatronAsociado() {
        return cveIdPatronAsociado;
    }

    public void setCveIdPatronAsociado(NdtPatronAsociadoDO cveIdPatronAsociado) {
        this.cveIdPatronAsociado = cveIdPatronAsociado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdA5PrestadoraServicios != null ? cveIdA5PrestadoraServicios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtA5PrestadoraServiciosDO)) {
            return false;
        }
        NdtA5PrestadoraServiciosDO other = (NdtA5PrestadoraServiciosDO) object;
        if ((this.cveIdA5PrestadoraServicios == null && other.cveIdA5PrestadoraServicios != null) || (this.cveIdA5PrestadoraServicios != null && !this.cveIdA5PrestadoraServicios.equals(other.cveIdA5PrestadoraServicios))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtA5PrestadoraServicios[ cveIdA5PrestadoraServicios=" + cveIdA5PrestadoraServicios + " ]";
    }
    
}
