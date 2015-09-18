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
@Table(name = "NDT_A9_2_OBRAS_SUBCONTRATA")
@NamedQueries({
    @NamedQuery(name = "NdtA92ObrasSubcontrataDO.findAll", query = "SELECT n FROM NdtA92ObrasSubcontrataDO n"),
    @NamedQuery(name = "NdtA92ObrasSubcontrataDO.findByCveIdA92ObrasSubcontrata", query = "SELECT n FROM NdtA92ObrasSubcontrataDO n WHERE n.cveIdA92ObrasSubcontrata = :cveIdA92ObrasSubcontrata"),
    @NamedQuery(name = "NdtA92ObrasSubcontrataDO.findByNomNombreRazonsocial", query = "SELECT n FROM NdtA92ObrasSubcontrataDO n WHERE n.nomNombreRazonsocial = :nomNombreRazonsocial"),
    @NamedQuery(name = "NdtA92ObrasSubcontrataDO.findByRfc", query = "SELECT n FROM NdtA92ObrasSubcontrataDO n WHERE n.rfc = :rfc"),
    @NamedQuery(name = "NdtA92ObrasSubcontrataDO.findByRegPatronal", query = "SELECT n FROM NdtA92ObrasSubcontrataDO n WHERE n.regPatronal = :regPatronal"),
    @NamedQuery(name = "NdtA92ObrasSubcontrataDO.findByNumRegObraImss", query = "SELECT n FROM NdtA92ObrasSubcontrataDO n WHERE n.numRegObraImss = :numRegObraImss"),
    @NamedQuery(name = "NdtA92ObrasSubcontrataDO.findByNumRegObraImssSubcontra", query = "SELECT n FROM NdtA92ObrasSubcontrataDO n WHERE n.numRegObraImssSubcontra = :numRegObraImssSubcontra"),
    @NamedQuery(name = "NdtA92ObrasSubcontrataDO.findByDesFaseConstruccion", query = "SELECT n FROM NdtA92ObrasSubcontrataDO n WHERE n.desFaseConstruccion = :desFaseConstruccion"),
    @NamedQuery(name = "NdtA92ObrasSubcontrataDO.findByNumSuperficieM2", query = "SELECT n FROM NdtA92ObrasSubcontrataDO n WHERE n.numSuperficieM2 = :numSuperficieM2"),
    @NamedQuery(name = "NdtA92ObrasSubcontrataDO.findByImpContratado", query = "SELECT n FROM NdtA92ObrasSubcontrataDO n WHERE n.impContratado = :impContratado"),
    @NamedQuery(name = "NdtA92ObrasSubcontrataDO.findByFecDelEjecucion", query = "SELECT n FROM NdtA92ObrasSubcontrataDO n WHERE n.fecDelEjecucion = :fecDelEjecucion"),
    @NamedQuery(name = "NdtA92ObrasSubcontrataDO.findByFecAlEjecucion", query = "SELECT n FROM NdtA92ObrasSubcontrataDO n WHERE n.fecAlEjecucion = :fecAlEjecucion"),
    @NamedQuery(name = "NdtA92ObrasSubcontrataDO.findByNumTrabajadoresParticipantes", query = "SELECT n FROM NdtA92ObrasSubcontrataDO n WHERE n.numTrabajadoresParticipantes = :numTrabajadoresParticipantes"),
    @NamedQuery(name = "NdtA92ObrasSubcontrataDO.findByCveIdUsuario", query = "SELECT n FROM NdtA92ObrasSubcontrataDO n WHERE n.cveIdUsuario = :cveIdUsuario"),
    @NamedQuery(name = "NdtA92ObrasSubcontrataDO.findByFecRegistroAlta", query = "SELECT n FROM NdtA92ObrasSubcontrataDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtA92ObrasSubcontrataDO.findByFecRegistroBaja", query = "SELECT n FROM NdtA92ObrasSubcontrataDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtA92ObrasSubcontrataDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtA92ObrasSubcontrataDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdtA92ObrasSubcontrataDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_A9_2_OBRAS_SUBCONTRATA", nullable = false, precision = 22, scale = 0)
    @SequenceGenerator(name = "NdtA92ObrasSubcontrata_Id_Seq_Gen", sequenceName = "SEQ_NDTA92OBRASSUBCONTRATA")
    @GeneratedValue(generator = "NdtA92ObrasSubcontrata_Id_Seq_Gen")
    private Long cveIdA92ObrasSubcontrata;
    @Size(max = 255)
    @Column(name = "NOM_NOMBRE_RAZONSOCIAL", length = 255)
    private String nomNombreRazonsocial;
    @Size(max = 13)
    @Column(name = "RFC", length = 13)
    private String rfc;
    @Size(max = 11)
    @Column(name = "REG_PATRONAL", length = 11)
    private String regPatronal;
    @Size(max = 20)
    @Column(name = "NUM_REG_OBRA_IMSS", length = 20)
    private String numRegObraImss;
    @Size(max = 20)
    @Column(name = "NUM_REG_OBRA_IMSS_SUBCONTRA", length = 20)
    private String numRegObraImssSubcontra;
    @Size(max = 255)
    @Column(name = "DES_FASE_CONSTRUCCION", length = 255)
    private String desFaseConstruccion;
    @Column(name = "NUM_SUPERFICIE_M2")
    private Long numSuperficieM2;
    @Column(name = "IMP_CONTRATADO", precision = 15, scale = 2)
    private Long impContratado;
    @Column(name = "FEC_DEL_EJECUCION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecDelEjecucion;
    @Column(name = "FEC_AL_EJECUCION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecAlEjecucion;
    @Column(name = "NUM_TRABAJADORES_PARTICIPANTES")
    private Integer numTrabajadoresParticipantes;
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

    public String getNomNombreRazonsocial() {
        return nomNombreRazonsocial;
    }

    public void setNomNombreRazonsocial(String nomNombreRazonsocial) {
        this.nomNombreRazonsocial = nomNombreRazonsocial;
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

    public String getNumRegObraImss() {
        return numRegObraImss;
    }

    public void setNumRegObraImss(String numRegObraImss) {
        this.numRegObraImss = numRegObraImss;
    }

    public String getNumRegObraImssSubcontra() {
        return numRegObraImssSubcontra;
    }

    public void setNumRegObraImssSubcontra(String numRegObraImssSubcontra) {
        this.numRegObraImssSubcontra = numRegObraImssSubcontra;
    }

    public String getDesFaseConstruccion() {
        return desFaseConstruccion;
    }

    public void setDesFaseConstruccion(String desFaseConstruccion) {
        this.desFaseConstruccion = desFaseConstruccion;
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

    public Date getFecDelEjecucion() {
        return fecDelEjecucion;
    }

    public void setFecDelEjecucion(Date fecDelEjecucion) {
        this.fecDelEjecucion = fecDelEjecucion;
    }

    public Date getFecAlEjecucion() {
        return fecAlEjecucion;
    }

    public void setFecAlEjecucion(Date fecAlEjecucion) {
        this.fecAlEjecucion = fecAlEjecucion;
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

    public NdtPatronDictamenDO getCveIdPatronDictamen() {
        return cveIdPatronDictamen;
    }

    public void setCveIdPatronDictamen(NdtPatronDictamenDO cveIdPatronDictamen) {
        this.cveIdPatronDictamen = cveIdPatronDictamen;
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
        return "mx.gob.imss.cit.dictamen.model.NdtA92ObrasSubcontrataDO[ cveIdA92ObrasSubcontrata=" + cveIdA92ObrasSubcontrata + " ]";
    }
    
}
