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
@Table(name = "NDT_A9_2_OBRAS_SUBCONTRATA")
@NamedQueries({
    @NamedQuery(name = "NdtA92ObrasSubcontrata.findAll", query = "SELECT n FROM NdtA92ObrasSubcontrataDO n"),
    @NamedQuery(name = "NdtA92ObrasSubcontrata.findByCveIdA92ObrasSubcontrata", query = "SELECT n FROM NdtA92ObrasSubcontrataDO n WHERE n.cveIdA92ObrasSubcontrata = :cveIdA92ObrasSubcontrata"),
    @NamedQuery(name = "NdtA92ObrasSubcontrata.findByRfc", query = "SELECT n FROM NdtA92ObrasSubcontrataDO n WHERE n.rfc = :rfc"),
    @NamedQuery(name = "NdtA92ObrasSubcontrata.findByRegPatronal", query = "SELECT n FROM NdtA92ObrasSubcontrataDO n WHERE n.regPatronal = :regPatronal"),
    @NamedQuery(name = "NdtA92ObrasSubcontrata.findByNomNombreRazonsocial", query = "SELECT n FROM NdtA92ObrasSubcontrataDO n WHERE n.nomNombreRazonsocial = :nomNombreRazonsocial"),
    @NamedQuery(name = "NdtA92ObrasSubcontrata.findByDesFaseConstruccion", query = "SELECT n FROM NdtA92ObrasSubcontrataDO n WHERE n.desFaseConstruccion = :desFaseConstruccion"),
    @NamedQuery(name = "NdtA92ObrasSubcontrata.findByNumRegObraImssSubcontrata", query = "SELECT n FROM NdtA92ObrasSubcontrataDO n WHERE n.numRegObraImssSubcontrata = :numRegObraImssSubcontrata"),
    @NamedQuery(name = "NdtA92ObrasSubcontrata.findByNumSuperficieM2", query = "SELECT n FROM NdtA92ObrasSubcontrataDO n WHERE n.numSuperficieM2 = :numSuperficieM2"),
    @NamedQuery(name = "NdtA92ObrasSubcontrata.findByImpContratado", query = "SELECT n FROM NdtA92ObrasSubcontrataDO n WHERE n.impContratado = :impContratado"),
    @NamedQuery(name = "NdtA92ObrasSubcontrata.findByFecInicioEjecucion", query = "SELECT n FROM NdtA92ObrasSubcontrataDO n WHERE n.fecInicioEjecucion = :fecInicioEjecucion"),
    @NamedQuery(name = "NdtA92ObrasSubcontrata.findByFecFinEjecucion", query = "SELECT n FROM NdtA92ObrasSubcontrataDO n WHERE n.fecFinEjecucion = :fecFinEjecucion"),
    @NamedQuery(name = "NdtA92ObrasSubcontrata.findByNumTrabajadoresParticipantes", query = "SELECT n FROM NdtA92ObrasSubcontrataDO n WHERE n.numTrabajadoresParticipantes = :numTrabajadoresParticipantes"),
    @NamedQuery(name = "NdtA92ObrasSubcontrata.findByCveIdUsuario", query = "SELECT n FROM NdtA92ObrasSubcontrataDO n WHERE n.cveIdUsuario = :cveIdUsuario"),
    @NamedQuery(name = "NdtA92ObrasSubcontrata.findByFecRegistroAlta", query = "SELECT n FROM NdtA92ObrasSubcontrataDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtA92ObrasSubcontrata.findByFecRegistroBaja", query = "SELECT n FROM NdtA92ObrasSubcontrataDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtA92ObrasSubcontrata.findByFecRegistroActualizado", query = "SELECT n FROM NdtA92ObrasSubcontrataDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdtA92ObrasSubcontrataDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_A9_2_OBRAS_SUBCONTRATA", nullable = false, precision = 22, scale = 0)
    private Long cveIdA92ObrasSubcontrata;
    @Size(max = 13)
    @Column(name = "RFC", length = 13)
    private String rfc;
    @Size(max = 11)
    @Column(name = "REG_PATRONAL", length = 11)
    private String regPatronal;
    @Size(max = 255)
    @Column(name = "NOM_NOMBRE_RAZONSOCIAL", length = 255)
    private String nomNombreRazonsocial;
    @Size(max = 255)
    @Column(name = "DES_FASE_CONSTRUCCION", length = 255)
    private String desFaseConstruccion;
    @Size(max = 18)
    @Column(name = "NUM_REG_OBRA_IMSS_SUBCONTRATA", length = 18)
    private String numRegObraImssSubcontrata;
    @Column(name = "NUM_SUPERFICIE_M2")
    private Long numSuperficieM2;
    @Column(name = "IMP_CONTRATADO", precision = 15, scale = 2)
    private Long impContratado;
    @Column(name = "FEC_INICIO_EJECUCION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecInicioEjecucion;
    @Column(name = "FEC_FIN_EJECUCION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecFinEjecucion;
    @Column(name = "NUM_TRABAJADORES_PARTICIPANTES")
    private Integer numTrabajadoresParticipantes;
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
    @JoinColumn(name = "CVE_ID_PATRON_ASOCIADO", referencedColumnName = "CVE_ID_PATRON_ASOCIADO")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtPatronAsociadoDO cveIdPatronAsociado;

    public NdtA92ObrasSubcontrataDO() {
    }

    public NdtA92ObrasSubcontrataDO(Long cveIdA92ObrasSubcontrata) {
        this.cveIdA92ObrasSubcontrata = cveIdA92ObrasSubcontrata;
    }

    public Long getCveIdA92ObrasSubcontrata() {
        return cveIdA92ObrasSubcontrata;
    }

    public void setCveIdA92ObrasSubcontrata(Long cveIdA92ObrasSubcontrata) {
        this.cveIdA92ObrasSubcontrata = cveIdA92ObrasSubcontrata;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getRegPatronal() {
        return regPatronal;
    }

    public void setRegPatronal(String regPatronal) {
        this.regPatronal = regPatronal;
    }

    public String getNomNombreRazonsocial() {
        return nomNombreRazonsocial;
    }

    public void setNomNombreRazonsocial(String nomNombreRazonsocial) {
        this.nomNombreRazonsocial = nomNombreRazonsocial;
    }

    public String getDesFaseConstruccion() {
        return desFaseConstruccion;
    }

    public void setDesFaseConstruccion(String desFaseConstruccion) {
        this.desFaseConstruccion = desFaseConstruccion;
    }

    public String getNumRegObraImssSubcontrata() {
        return numRegObraImssSubcontrata;
    }

    public void setNumRegObraImssSubcontrata(String numRegObraImssSubcontrata) {
        this.numRegObraImssSubcontrata = numRegObraImssSubcontrata;
    }

    public Long getNumSuperficieM2() {
        return numSuperficieM2;
    }

    public void setNumSuperficieM2(Long numSuperficieM2) {
        this.numSuperficieM2 = numSuperficieM2;
    }

    public Long getImpContratado() {
        return impContratado;
    }

    public void setImpContratado(Long impContratado) {
        this.impContratado = impContratado;
    }

    public Date getFecInicioEjecucion() {
        return fecInicioEjecucion;
    }

    public void setFecInicioEjecucion(Date fecInicioEjecucion) {
        this.fecInicioEjecucion = fecInicioEjecucion;
    }

    public Date getFecFinEjecucion() {
        return fecFinEjecucion;
    }

    public void setFecFinEjecucion(Date fecFinEjecucion) {
        this.fecFinEjecucion = fecFinEjecucion;
    }

    public Integer getNumTrabajadoresParticipantes() {
        return numTrabajadoresParticipantes;
    }

    public void setNumTrabajadoresParticipantes(Integer numTrabajadoresParticipantes) {
        this.numTrabajadoresParticipantes = numTrabajadoresParticipantes;
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

    public NdtPatronAsociadoDO getCveIdPatronAsociado() {
        return cveIdPatronAsociado;
    }

    public void setCveIdPatronAsociado(NdtPatronAsociadoDO cveIdPatronAsociado) {
        this.cveIdPatronAsociado = cveIdPatronAsociado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdA92ObrasSubcontrata != null ? cveIdA92ObrasSubcontrata.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtA92ObrasSubcontrataDO)) {
            return false;
        }
        NdtA92ObrasSubcontrataDO other = (NdtA92ObrasSubcontrataDO) object;
        if ((this.cveIdA92ObrasSubcontrata == null && other.cveIdA92ObrasSubcontrata != null) || (this.cveIdA92ObrasSubcontrata != null && !this.cveIdA92ObrasSubcontrata.equals(other.cveIdA92ObrasSubcontrata))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtA92ObrasSubcontrata[ cveIdA92ObrasSubcontrata=" + cveIdA92ObrasSubcontrata + " ]";
    }
    
}
