/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.ventanilla.model;

import java.io.Serializable;
import java.util.Date;

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
@Table(name = "NDT_A4_PAGO_PERSONA_FISICA")
@NamedQueries({
    @NamedQuery(name = "NdtA4PagoPersonaFisicaDO.findAll", query = "SELECT n FROM NdtA4PagoPersonaFisicaDO n"),
    @NamedQuery(name = "NdtA4PagoPersonaFisicaDO.findByCveIdA4Pagospersonasfisicas", query = "SELECT n FROM NdtA4PagoPersonaFisicaDO n WHERE n.cveIdA4Pagospersonasfisicas = :cveIdA4Pagospersonasfisicas"),
    @NamedQuery(name = "NdtA4PagoPersonaFisicaDO.findByRfcPf", query = "SELECT n FROM NdtA4PagoPersonaFisicaDO n WHERE n.rfcPf = :rfcPf"),
    @NamedQuery(name = "NdtA4PagoPersonaFisicaDO.findByCurpPf", query = "SELECT n FROM NdtA4PagoPersonaFisicaDO n WHERE n.curpPf = :curpPf"),
    @NamedQuery(name = "NdtA4PagoPersonaFisicaDO.findByNomPrimerApellidoPf", query = "SELECT n FROM NdtA4PagoPersonaFisicaDO n WHERE n.nomPrimerApellidoPf = :nomPrimerApellidoPf"),
    @NamedQuery(name = "NdtA4PagoPersonaFisicaDO.findByNomSegundoApellidoPf", query = "SELECT n FROM NdtA4PagoPersonaFisicaDO n WHERE n.nomSegundoApellidoPf = :nomSegundoApellidoPf"),
    @NamedQuery(name = "NdtA4PagoPersonaFisicaDO.findByNomNombrePf", query = "SELECT n FROM NdtA4PagoPersonaFisicaDO n WHERE n.nomNombrePf = :nomNombrePf"),
    @NamedQuery(name = "NdtA4PagoPersonaFisicaDO.findByNumMesesOpero", query = "SELECT n FROM NdtA4PagoPersonaFisicaDO n WHERE n.numMesesOpero = :numMesesOpero"),
    @NamedQuery(name = "NdtA4PagoPersonaFisicaDO.findByImpMontoOperaciones", query = "SELECT n FROM NdtA4PagoPersonaFisicaDO n WHERE n.impMontoOperaciones = :impMontoOperaciones"),
    @NamedQuery(name = "NdtA4PagoPersonaFisicaDO.findByCveIdUsuario", query = "SELECT n FROM NdtA4PagoPersonaFisicaDO n WHERE n.cveIdUsuario = :cveIdUsuario"),
    @NamedQuery(name = "NdtA4PagoPersonaFisicaDO.findByFecRegistroAlta", query = "SELECT n FROM NdtA4PagoPersonaFisicaDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtA4PagoPersonaFisicaDO.findByFecRegistroBaja", query = "SELECT n FROM NdtA4PagoPersonaFisicaDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtA4PagoPersonaFisicaDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtA4PagoPersonaFisicaDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdtA4PagoPersonaFisicaDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_A4_PAGOSPERSONASFISICAS", nullable = false, precision = 22, scale = 0)
    @SequenceGenerator(name = "NdtA4PagoPersonaFisica_Id_Seq_Gen", sequenceName = "SEQ_NDTA4PAGOPERSONAFISICA", allocationSize=1)
    @GeneratedValue(generator = "NdtA4PagoPersonaFisica_Id_Seq_Gen")
    private Long cveIdA4Pagospersonasfisicas;
    @Size(max = 13)
    @Column(name = "RFC_PF", length = 13)
    private String rfcPf;
    @Size(max = 18)
    @Column(name = "CURP_PF", length = 18)
    private String curpPf;
    @Size(max = 100)
    @Column(name = "NOM_PRIMER_APELLIDO_PF", length = 100)
    private String nomPrimerApellidoPf;
    @Size(max = 100)
    @Column(name = "NOM_SEGUNDO_APELLIDO_PF", length = 100)
    private String nomSegundoApellidoPf;
    @Size(max = 100)
    @Column(name = "NOM_NOMBRE_PF", length = 100)
    private String nomNombrePf;
    @Column(name = "NUM_MESES_OPERO")
    private Integer numMesesOpero;
    @Column(name = "IMP_MONTO_OPERACIONES", precision = 14, scale = 2)
    private Long impMontoOperaciones;
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
    @JoinColumn(name = "CVE_ID_PATRON_ASOCIADO", referencedColumnName = "CVE_ID_PATRON_ASOCIADO")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtPatronAsociadoDO cveIdPatronAsociado;

    public NdtA4PagoPersonaFisicaDO() {
    }

    public NdtA4PagoPersonaFisicaDO(Long cveIdA4Pagospersonasfisicas) {
        this.cveIdA4Pagospersonasfisicas = cveIdA4Pagospersonasfisicas;
    }

    public Long getCveIdA4Pagospersonasfisicas() {
        return cveIdA4Pagospersonasfisicas;
    }

    public void setCveIdA4Pagospersonasfisicas(Long cveIdA4Pagospersonasfisicas) {
        this.cveIdA4Pagospersonasfisicas = cveIdA4Pagospersonasfisicas;
    }

    public String getRfcPf() {
        return rfcPf;
    }

    public void setRfcPf(String rfcPf) {
        this.rfcPf = rfcPf;
    }

    public String getCurpPf() {
        return curpPf;
    }

    public void setCurpPf(String curpPf) {
        this.curpPf = curpPf;
    }

    public String getNomPrimerApellidoPf() {
        return nomPrimerApellidoPf;
    }

    public void setNomPrimerApellidoPf(String nomPrimerApellidoPf) {
        this.nomPrimerApellidoPf = nomPrimerApellidoPf;
    }

    public String getNomSegundoApellidoPf() {
        return nomSegundoApellidoPf;
    }

    public void setNomSegundoApellidoPf(String nomSegundoApellidoPf) {
        this.nomSegundoApellidoPf = nomSegundoApellidoPf;
    }

    public String getNomNombrePf() {
        return nomNombrePf;
    }

    public void setNomNombrePf(String nomNombrePf) {
        this.nomNombrePf = nomNombrePf;
    }

    public Integer getNumMesesOpero() {
        return numMesesOpero;
    }

    public void setNumMesesOpero(Integer numMesesOpero) {
        this.numMesesOpero = numMesesOpero;
    }

    public Long getImpMontoOperaciones() {
        return impMontoOperaciones;
    }

    public void setImpMontoOperaciones(Long impMontoOperaciones) {
        this.impMontoOperaciones = impMontoOperaciones;
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

    public NdtPatronAsociadoDO getCveIdPatronAsociado() {
        return cveIdPatronAsociado;
    }

    public void setCveIdPatronAsociado(NdtPatronAsociadoDO cveIdPatronAsociado) {
        this.cveIdPatronAsociado = cveIdPatronAsociado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdA4Pagospersonasfisicas != null ? cveIdA4Pagospersonasfisicas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtA4PagoPersonaFisicaDO)) {
            return false;
        }
        NdtA4PagoPersonaFisicaDO other = (NdtA4PagoPersonaFisicaDO) object;
        if ((this.cveIdA4Pagospersonasfisicas == null && other.cveIdA4Pagospersonasfisicas != null) || (this.cveIdA4Pagospersonasfisicas != null && !this.cveIdA4Pagospersonasfisicas.equals(other.cveIdA4Pagospersonasfisicas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtA4PagoPersonaFisicaDO[ cveIdA4Pagospersonasfisicas=" + cveIdA4Pagospersonasfisicas + " ]";
    }
    
}
