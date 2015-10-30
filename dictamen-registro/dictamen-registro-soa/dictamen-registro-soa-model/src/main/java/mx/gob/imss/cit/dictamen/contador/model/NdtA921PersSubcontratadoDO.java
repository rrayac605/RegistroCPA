/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.contador.model;

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
@Table(name = "NDT_A9_2_1_PERS_SUBCONTRATADO")
@NamedQueries({
    @NamedQuery(name = "NdtA921PersSubcontratadoDO.findAll", query = "SELECT n FROM NdtA921PersSubcontratadoDO n"),
    @NamedQuery(name = "NdtA921PersSubcontratadoDO.findByCveIdA921PersSubcontrata", query = "SELECT n FROM NdtA921PersSubcontratadoDO n WHERE n.cveIdA921PersSubcontrata = :cveIdA921PersSubcontrata"),
    @NamedQuery(name = "NdtA921PersSubcontratadoDO.findByNumRegObraImss", query = "SELECT n FROM NdtA921PersSubcontratadoDO n WHERE n.numRegObraImss = :numRegObraImss"),
    @NamedQuery(name = "NdtA921PersSubcontratadoDO.findByNomPrimerApellido", query = "SELECT n FROM NdtA921PersSubcontratadoDO n WHERE n.nomPrimerApellido = :nomPrimerApellido"),
    @NamedQuery(name = "NdtA921PersSubcontratadoDO.findByNomSegundoApellido", query = "SELECT n FROM NdtA921PersSubcontratadoDO n WHERE n.nomSegundoApellido = :nomSegundoApellido"),
    @NamedQuery(name = "NdtA921PersSubcontratadoDO.findByNomNombre", query = "SELECT n FROM NdtA921PersSubcontratadoDO n WHERE n.nomNombre = :nomNombre"),
    @NamedQuery(name = "NdtA921PersSubcontratadoDO.findByNumNss", query = "SELECT n FROM NdtA921PersSubcontratadoDO n WHERE n.numNss = :numNss"),
    @NamedQuery(name = "NdtA921PersSubcontratadoDO.findByCveUsuario", query = "SELECT n FROM NdtA921PersSubcontratadoDO n WHERE n.cveUsuario = :cveUsuario"),
    @NamedQuery(name = "NdtA921PersSubcontratadoDO.findByFecRegistroAlta", query = "SELECT n FROM NdtA921PersSubcontratadoDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtA921PersSubcontratadoDO.findByFecRegistroBaja", query = "SELECT n FROM NdtA921PersSubcontratadoDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtA921PersSubcontratadoDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtA921PersSubcontratadoDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdtA921PersSubcontratadoDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_A9_2_1_PERS_SUBCONTRATA", nullable = false, precision = 22, scale = 0)
    @SequenceGenerator(name = "NdtA921PersSubcontratado_Id_Seq_Gen", sequenceName = "SEQ_NDTA921PERSSUBCONTRATADO", allocationSize=1)
    @GeneratedValue(generator = "NdtA921PersSubcontratado_Id_Seq_Gen")
    private Long cveIdA921PersSubcontrata;
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
    @Column(name = "CVE_USUARIO", length = 20)
    private String cveUsuario;
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

    public NdtA921PersSubcontratadoDO() {
    }

    public NdtA921PersSubcontratadoDO(Long cveIdA921PersSubcontrata) {
        this.cveIdA921PersSubcontrata = cveIdA921PersSubcontrata;
    }

    public Long getCveIdA921PersSubcontrata() {
        return cveIdA921PersSubcontrata;
    }

    public void setCveIdA921PersSubcontrata(Long cveIdA921PersSubcontrata) {
        this.cveIdA921PersSubcontrata = cveIdA921PersSubcontrata;
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

    public String getCveUsuario() {
        return cveUsuario;
    }

    public void setCveUsuario(String cveUsuario) {
        this.cveUsuario = cveUsuario;
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
        hash += (cveIdA921PersSubcontrata != null ? cveIdA921PersSubcontrata.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtA921PersSubcontratadoDO)) {
            return false;
        }
        NdtA921PersSubcontratadoDO other = (NdtA921PersSubcontratadoDO) object;
        if ((this.cveIdA921PersSubcontrata == null && other.cveIdA921PersSubcontrata != null) || (this.cveIdA921PersSubcontrata != null && !this.cveIdA921PersSubcontrata.equals(other.cveIdA921PersSubcontrata))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtA921PersSubcontratadoDO[ cveIdA921PersSubcontrata=" + cveIdA921PersSubcontrata + " ]";
    }
    
}
