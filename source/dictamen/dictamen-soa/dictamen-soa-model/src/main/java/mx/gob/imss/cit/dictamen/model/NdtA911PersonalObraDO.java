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
@Table(name = "NDT_A9_1_1_PERSONAL_OBRA")
@NamedQueries({
    @NamedQuery(name = "NdtA911PersonalObraDO.findAll", query = "SELECT n FROM NdtA911PersonalObraDO n"),
    @NamedQuery(name = "NdtA911PersonalObraDO.findByCveIdA911PersonalObra", query = "SELECT n FROM NdtA911PersonalObraDO n WHERE n.cveIdA911PersonalObra = :cveIdA911PersonalObra"),
    @NamedQuery(name = "NdtA911PersonalObraDO.findByNumRegObraImss", query = "SELECT n FROM NdtA911PersonalObraDO n WHERE n.numRegObraImss = :numRegObraImss"),
    @NamedQuery(name = "NdtA911PersonalObraDO.findByNomPrimerApellido", query = "SELECT n FROM NdtA911PersonalObraDO n WHERE n.nomPrimerApellido = :nomPrimerApellido"),
    @NamedQuery(name = "NdtA911PersonalObraDO.findByNomSegundoApellido", query = "SELECT n FROM NdtA911PersonalObraDO n WHERE n.nomSegundoApellido = :nomSegundoApellido"),
    @NamedQuery(name = "NdtA911PersonalObraDO.findByNomNombre", query = "SELECT n FROM NdtA911PersonalObraDO n WHERE n.nomNombre = :nomNombre"),
    @NamedQuery(name = "NdtA911PersonalObraDO.findByNumNss", query = "SELECT n FROM NdtA911PersonalObraDO n WHERE n.numNss = :numNss"),
    @NamedQuery(name = "NdtA911PersonalObraDO.findByCveIdUsuario", query = "SELECT n FROM NdtA911PersonalObraDO n WHERE n.cveIdUsuario = :cveIdUsuario"),
    @NamedQuery(name = "NdtA911PersonalObraDO.findByFecRegistroAlta", query = "SELECT n FROM NdtA911PersonalObraDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtA911PersonalObraDO.findByFecRegistroBaja", query = "SELECT n FROM NdtA911PersonalObraDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtA911PersonalObraDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtA911PersonalObraDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdtA911PersonalObraDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_A9_1_1_PERSONAL_OBRA", nullable = false, precision = 22, scale = 0)
    @SequenceGenerator(name = "NdtA911PersonalObra_Id_Seq_Gen", sequenceName = "SEQ_NDTA911PERSONALOBRA")
    @GeneratedValue(generator = "NdtA911PersonalObra_Id_Seq_Gen")
    private Long cveIdA911PersonalObra;
    @Column(name = "NUM_REG_OBRA_IMSS")
    private Long numRegObraImss;
    @Size(max = 100)
    @Column(name = "NOM_PRIMER_APELLIDO", length = 100)
    private String nomPrimerApellido;
    @Size(max = 100)
    @Column(name = "NOM_SEGUNDO_APELLIDO", length = 100)
    private String nomSegundoApellido;
    @Size(max = 100)
    @Column(name = "NOM_NOMBRE", length = 100)
    private String nomNombre;
    @Size(max = 11)
    @Column(name = "NUM_NSS", length = 11)
    private String numNss;
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

    public NdtA911PersonalObraDO() {
    }

    public NdtA911PersonalObraDO(Long cveIdA911PersonalObra) {
        this.cveIdA911PersonalObra = cveIdA911PersonalObra;
    }

    public Long getCveIdA911PersonalObra() {
        return cveIdA911PersonalObra;
    }

    public void setCveIdA911PersonalObra(Long cveIdA911PersonalObra) {
        this.cveIdA911PersonalObra = cveIdA911PersonalObra;
    }

    public Long getNumRegObraImss() {
        return numRegObraImss;
    }

    public void setNumRegObraImss(Long numRegObraImss) {
        this.numRegObraImss = numRegObraImss;
    }

    public String getNomPrimerApellido() {
        return nomPrimerApellido;
    }

    public void setNomPrimerApellido(String nomPrimerApellido) {
        this.nomPrimerApellido = nomPrimerApellido;
    }

    public String getNomSegundoApellido() {
        return nomSegundoApellido;
    }

    public void setNomSegundoApellido(String nomSegundoApellido) {
        this.nomSegundoApellido = nomSegundoApellido;
    }

    public String getNomNombre() {
        return nomNombre;
    }

    public void setNomNombre(String nomNombre) {
        this.nomNombre = nomNombre;
    }

    public String getNumNss() {
        return numNss;
    }

    public void setNumNss(String numNss) {
        this.numNss = numNss;
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
        hash += (cveIdA911PersonalObra != null ? cveIdA911PersonalObra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtA911PersonalObraDO)) {
            return false;
        }
        NdtA911PersonalObraDO other = (NdtA911PersonalObraDO) object;
        if ((this.cveIdA911PersonalObra == null && other.cveIdA911PersonalObra != null) || (this.cveIdA911PersonalObra != null && !this.cveIdA911PersonalObra.equals(other.cveIdA911PersonalObra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtA911PersonalObraDO[ cveIdA911PersonalObra=" + cveIdA911PersonalObra + " ]";
    }
    
}
