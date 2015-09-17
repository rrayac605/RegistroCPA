/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
    @NamedQuery(name = "NdtA5PrestadoraServiciosDO.findAll", query = "SELECT n FROM NdtA5PrestadoraServiciosDO n"),
    @NamedQuery(name = "NdtA5PrestadoraServiciosDO.findByCveIdA5PrestadoraServicios", query = "SELECT n FROM NdtA5PrestadoraServiciosDO n WHERE n.cveIdA5PrestadoraServicios = :cveIdA5PrestadoraServicios"),
    @NamedQuery(name = "NdtA5PrestadoraServiciosDO.findByNomNombreRazonsocialBen", query = "SELECT n FROM NdtA5PrestadoraServiciosDO n WHERE n.nomNombreRazonsocialBen = :nomNombreRazonsocialBen"),
    @NamedQuery(name = "NdtA5PrestadoraServiciosDO.findByRfcBeneficiario", query = "SELECT n FROM NdtA5PrestadoraServiciosDO n WHERE n.rfcBeneficiario = :rfcBeneficiario"),
    @NamedQuery(name = "NdtA5PrestadoraServiciosDO.findByRegPatronalBeneficiario", query = "SELECT n FROM NdtA5PrestadoraServiciosDO n WHERE n.regPatronalBeneficiario = :regPatronalBeneficiario"),
    @NamedQuery(name = "NdtA5PrestadoraServiciosDO.findByDesObjetoContrato", query = "SELECT n FROM NdtA5PrestadoraServiciosDO n WHERE n.desObjetoContrato = :desObjetoContrato"),
    @NamedQuery(name = "NdtA5PrestadoraServiciosDO.findByFecInicioContrato", query = "SELECT n FROM NdtA5PrestadoraServiciosDO n WHERE n.fecInicioContrato = :fecInicioContrato"),
    @NamedQuery(name = "NdtA5PrestadoraServiciosDO.findByFecConclusionContrato", query = "SELECT n FROM NdtA5PrestadoraServiciosDO n WHERE n.fecConclusionContrato = :fecConclusionContrato"),
    @NamedQuery(name = "NdtA5PrestadoraServiciosDO.findByNumTrabajadores", query = "SELECT n FROM NdtA5PrestadoraServiciosDO n WHERE n.numTrabajadores = :numTrabajadores"),
    @NamedQuery(name = "NdtA5PrestadoraServiciosDO.findByIndElementosPsp", query = "SELECT n FROM NdtA5PrestadoraServiciosDO n WHERE n.indElementosPsp = :indElementosPsp"),
    @NamedQuery(name = "NdtA5PrestadoraServiciosDO.findByIndResponsableDireccion", query = "SELECT n FROM NdtA5PrestadoraServiciosDO n WHERE n.indResponsableDireccion = :indResponsableDireccion"),
    @NamedQuery(name = "NdtA5PrestadoraServiciosDO.findByImpCostoAnualNomina", query = "SELECT n FROM NdtA5PrestadoraServiciosDO n WHERE n.impCostoAnualNomina = :impCostoAnualNomina"),
    @NamedQuery(name = "NdtA5PrestadoraServiciosDO.findByDesFolioSipress", query = "SELECT n FROM NdtA5PrestadoraServiciosDO n WHERE n.desFolioSipress = :desFolioSipress"),
    @NamedQuery(name = "NdtA5PrestadoraServiciosDO.findByCveIdUsuario", query = "SELECT n FROM NdtA5PrestadoraServiciosDO n WHERE n.cveIdUsuario = :cveIdUsuario"),
    @NamedQuery(name = "NdtA5PrestadoraServiciosDO.findByFecRegistroAlta", query = "SELECT n FROM NdtA5PrestadoraServiciosDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtA5PrestadoraServiciosDO.findByFecRegistroBaja", query = "SELECT n FROM NdtA5PrestadoraServiciosDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtA5PrestadoraServiciosDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtA5PrestadoraServiciosDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdtA5PrestadoraServiciosDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_A5_PRESTADORA_SERVICIOS", nullable = false, precision = 22, scale = 0)
    private BigDecimal cveIdA5PrestadoraServicios;
    @Size(max = 300)
    @Column(name = "NOM_NOMBRE_RAZONSOCIAL_BEN", length = 300)
    private String nomNombreRazonsocialBen;
    @Size(max = 13)
    @Column(name = "RFC_BENEFICIARIO", length = 13)
    private String rfcBeneficiario;
    @Size(max = 13)
    @Column(name = "REG_PATRONAL_BENEFICIARIO", length = 13)
    private String regPatronalBeneficiario;
    @Size(max = 3000)
    @Column(name = "DES_OBJETO_CONTRATO", length = 3000)
    private String desObjetoContrato;
    @Column(name = "FEC_INICIO_CONTRATO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecInicioContrato;
    @Column(name = "FEC_CONCLUSION_CONTRATO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecConclusionContrato;
    @Column(name = "NUM_TRABAJADORES")
    private Integer numTrabajadores;
    @Size(max = 2)
    @Column(name = "IND_ELEMENTOS_PSP", length = 2)
    private String indElementosPsp;
    @Size(max = 2)
    @Column(name = "IND_RESPONSABLE_DIRECCION", length = 2)
    private String indResponsableDireccion;
    @Column(name = "IMP_COSTO_ANUAL_NOMINA", precision = 14, scale = 2)
    private BigDecimal impCostoAnualNomina;
    @Size(max = 30)
    @Column(name = "DES_FOLIO_SIPRESS", length = 30)
    private String desFolioSipress;
    @Size(max = 20)
    @Column(name = "CVE_ID_USUARIO", length = 20)
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
    @JoinColumn(name = "CVE_ID_PATRON_DICTAMEN", referencedColumnName = "CVE_ID_PATRON_DICTAMEN")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtPatronDictamenDO cveIdPatronDictamen;

    public NdtA5PrestadoraServiciosDO() {
    }

    public NdtA5PrestadoraServiciosDO(BigDecimal cveIdA5PrestadoraServicios) {
        this.cveIdA5PrestadoraServicios = cveIdA5PrestadoraServicios;
    }

    public BigDecimal getCveIdA5PrestadoraServicios() {
        return cveIdA5PrestadoraServicios;
    }

    public void setCveIdA5PrestadoraServicios(BigDecimal cveIdA5PrestadoraServicios) {
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

    public String getDesObjetoContrato() {
        return desObjetoContrato;
    }

    public void setDesObjetoContrato(String desObjetoContrato) {
        this.desObjetoContrato = desObjetoContrato;
    }

    public Date getFecInicioContrato() {
        return fecInicioContrato;
    }

    public void setFecInicioContrato(Date fecInicioContrato) {
        this.fecInicioContrato = fecInicioContrato;
    }

    public Date getFecConclusionContrato() {
        return fecConclusionContrato;
    }

    public void setFecConclusionContrato(Date fecConclusionContrato) {
        this.fecConclusionContrato = fecConclusionContrato;
    }

    public Integer getNumTrabajadores() {
        return numTrabajadores;
    }

    public void setNumTrabajadores(Integer numTrabajadores) {
        this.numTrabajadores = numTrabajadores;
    }

    public String getIndElementosPsp() {
        return indElementosPsp;
    }

    public void setIndElementosPsp(String indElementosPsp) {
        this.indElementosPsp = indElementosPsp;
    }

    public String getIndResponsableDireccion() {
        return indResponsableDireccion;
    }

    public void setIndResponsableDireccion(String indResponsableDireccion) {
        this.indResponsableDireccion = indResponsableDireccion;
    }

    public BigDecimal getImpCostoAnualNomina() {
        return impCostoAnualNomina;
    }

    public void setImpCostoAnualNomina(BigDecimal impCostoAnualNomina) {
        this.impCostoAnualNomina = impCostoAnualNomina;
    }

    public String getDesFolioSipress() {
        return desFolioSipress;
    }

    public void setDesFolioSipress(String desFolioSipress) {
        this.desFolioSipress = desFolioSipress;
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

    public NdtPatronDictamenDO getCveIdPatronDictamen() {
        return cveIdPatronDictamen;
    }

    public void setCveIdPatronDictamen(NdtPatronDictamenDO cveIdPatronDictamen) {
        this.cveIdPatronDictamen = cveIdPatronDictamen;
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
        return "mx.gob.imss.cit.dictamen.model.NdtA5PrestadoraServiciosDO[ cveIdA5PrestadoraServicios=" + cveIdA5PrestadoraServicios + " ]";
    }
    
}
