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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "NDT_A6_SUBCONTRATACION_SP")
@NamedQueries({
    @NamedQuery(name = "NdtA6SubcontratacionSpDO.findAll", query = "SELECT n FROM NdtA6SubcontratacionSpDO n"),
    @NamedQuery(name = "NdtA6SubcontratacionSpDO.findByCveIdA6SubcontratacionSp", query = "SELECT n FROM NdtA6SubcontratacionSpDO n WHERE n.cveIdA6SubcontratacionSp = :cveIdA6SubcontratacionSp"),
    @NamedQuery(name = "NdtA6SubcontratacionSpDO.findByNomNombreRazonsocialPsp", query = "SELECT n FROM NdtA6SubcontratacionSpDO n WHERE n.nomNombreRazonsocialPsp = :nomNombreRazonsocialPsp"),
    @NamedQuery(name = "NdtA6SubcontratacionSpDO.findByRfcPsp", query = "SELECT n FROM NdtA6SubcontratacionSpDO n WHERE n.rfcPsp = :rfcPsp"),
    @NamedQuery(name = "NdtA6SubcontratacionSpDO.findByRegPatronalPsp", query = "SELECT n FROM NdtA6SubcontratacionSpDO n WHERE n.regPatronalPsp = :regPatronalPsp"),
    @NamedQuery(name = "NdtA6SubcontratacionSpDO.findByDesObjetoContratoPsp", query = "SELECT n FROM NdtA6SubcontratacionSpDO n WHERE n.desObjetoContratoPsp = :desObjetoContratoPsp"),
    @NamedQuery(name = "NdtA6SubcontratacionSpDO.findByFecInicioContrato", query = "SELECT n FROM NdtA6SubcontratacionSpDO n WHERE n.fecInicioContrato = :fecInicioContrato"),
    @NamedQuery(name = "NdtA6SubcontratacionSpDO.findByFecConclusionContrato", query = "SELECT n FROM NdtA6SubcontratacionSpDO n WHERE n.fecConclusionContrato = :fecConclusionContrato"),
    @NamedQuery(name = "NdtA6SubcontratacionSpDO.findByNumTrabajadores", query = "SELECT n FROM NdtA6SubcontratacionSpDO n WHERE n.numTrabajadores = :numTrabajadores"),
    @NamedQuery(name = "NdtA6SubcontratacionSpDO.findByIndElementosPsp", query = "SELECT n FROM NdtA6SubcontratacionSpDO n WHERE n.indElementosPsp = :indElementosPsp"),
    @NamedQuery(name = "NdtA6SubcontratacionSpDO.findByIndResponsableDireccion", query = "SELECT n FROM NdtA6SubcontratacionSpDO n WHERE n.indResponsableDireccion = :indResponsableDireccion"),
    @NamedQuery(name = "NdtA6SubcontratacionSpDO.findByDesFolioSipress", query = "SELECT n FROM NdtA6SubcontratacionSpDO n WHERE n.desFolioSipress = :desFolioSipress"),
    @NamedQuery(name = "NdtA6SubcontratacionSpDO.findByCveIdUsuario", query = "SELECT n FROM NdtA6SubcontratacionSpDO n WHERE n.cveIdUsuario = :cveIdUsuario"),
    @NamedQuery(name = "NdtA6SubcontratacionSpDO.findByFecRegistroAlta", query = "SELECT n FROM NdtA6SubcontratacionSpDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtA6SubcontratacionSpDO.findByFecRegistroBaja", query = "SELECT n FROM NdtA6SubcontratacionSpDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtA6SubcontratacionSpDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtA6SubcontratacionSpDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdtA6SubcontratacionSpDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_A6_SUBCONTRATACION_SP", nullable = false, precision = 22, scale = 0)
    @SequenceGenerator( allocationSize=1,name = "NdtA6SubcontratacionSp_Id_Seq_Gen", sequenceName = "SEQ_NDTA6SUBCONTRATACIONSP")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NdtA6SubcontratacionSp_Id_Seq_Gen")
    private Long cveIdA6SubcontratacionSp;
    @Size(max = 100)
    @Column(name = "NOM_NOMBRE_RAZONSOCIAL_PSP", length = 100)
    private String nomNombreRazonsocialPsp;
    @Size(max = 13)
    @Column(name = "RFC_PSP", length = 13)
    private String rfcPsp;
    @Size(max = 13)
    @Column(name = "REG_PATRONAL_PSP", length = 13)
    private String regPatronalPsp;
    @Size(max = 300)
    @Column(name = "DES_OBJETO_CONTRATO_PSP", length = 300)
    private String desObjetoContratoPsp;
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

    public NdtA6SubcontratacionSpDO() {
    }

    public NdtA6SubcontratacionSpDO(Long cveIdA6SubcontratacionSp) {
        this.cveIdA6SubcontratacionSp = cveIdA6SubcontratacionSp;
    }

    public Long getCveIdA6SubcontratacionSp() {
        return cveIdA6SubcontratacionSp;
    }

    public void setCveIdA6SubcontratacionSp(Long cveIdA6SubcontratacionSp) {
        this.cveIdA6SubcontratacionSp = cveIdA6SubcontratacionSp;
    }

    public String getNomNombreRazonsocialPsp() {
        return nomNombreRazonsocialPsp;
    }

    public void setNomNombreRazonsocialPsp(String nomNombreRazonsocialPsp) {
        this.nomNombreRazonsocialPsp = nomNombreRazonsocialPsp;
    }

    public String getRfcPsp() {
        return rfcPsp;
    }

    public void setRfcPsp(String rfcPsp) {
        this.rfcPsp = rfcPsp;
    }

    public String getRegPatronalPsp() {
        return regPatronalPsp;
    }

    public void setRegPatronalPsp(String regPatronalPsp) {
        this.regPatronalPsp = regPatronalPsp;
    }

    public String getDesObjetoContratoPsp() {
        return desObjetoContratoPsp;
    }

    public void setDesObjetoContratoPsp(String desObjetoContratoPsp) {
        this.desObjetoContratoPsp = desObjetoContratoPsp;
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
        hash += (cveIdA6SubcontratacionSp != null ? cveIdA6SubcontratacionSp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtA6SubcontratacionSpDO)) {
            return false;
        }
        NdtA6SubcontratacionSpDO other = (NdtA6SubcontratacionSpDO) object;
        if ((this.cveIdA6SubcontratacionSp == null && other.cveIdA6SubcontratacionSp != null) || (this.cveIdA6SubcontratacionSp != null && !this.cveIdA6SubcontratacionSp.equals(other.cveIdA6SubcontratacionSp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtA6SubcontratacionSpDO[ cveIdA6SubcontratacionSp=" + cveIdA6SubcontratacionSp + " ]";
    }
    
}
