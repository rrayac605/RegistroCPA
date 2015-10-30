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
@Table(name = "NDT_PATRON_DICTAMEN_CPA")
@NamedQueries({
    @NamedQuery(name = "NdtPatronDictamenCpaDO.findAll", query = "SELECT n FROM NdtPatronDictamenCpaDO n"),
    @NamedQuery(name = "NdtPatronDictamenCpaDO.findByCveIdPatronCpaDictamen", query = "SELECT n FROM NdtPatronDictamenCpaDO n WHERE n.cveIdPatronCpaDictamen = :cveIdPatronCpaDictamen"),
    @NamedQuery(name = "NdtPatronDictamenCpaDO.findByCveIdPatronDictamen", query = "SELECT n FROM NdtPatronDictamenCpaDO n WHERE n.cveIdPatronDictamen = :cveIdPatronDictamen"),
    @NamedQuery(name = "NdtPatronDictamenCpaDO.findByCveIdUsuario", query = "SELECT n FROM NdtPatronDictamenCpaDO n WHERE n.cveIdUsuario = :cveIdUsuario"),
    @NamedQuery(name = "NdtPatronDictamenCpaDO.findByFecRegistroAlta", query = "SELECT n FROM NdtPatronDictamenCpaDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtPatronDictamenCpaDO.findByFecRegistroBaja", query = "SELECT n FROM NdtPatronDictamenCpaDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtPatronDictamenCpaDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtPatronDictamenCpaDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdtPatronDictamenCpaDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_PATRON_CPA_DICTAMEN", nullable = false, precision = 22, scale = 0)
    @SequenceGenerator(name = "NdtPatronDictamenCpa_Id_Seq_Gen", sequenceName = "SEQ_NDTPATRONDICTAMENCPA", allocationSize=1)
    @GeneratedValue(generator = "NdtPatronDictamenCpa_Id_Seq_Gen")
    private Long cveIdPatronCpaDictamen;
    @JoinColumn(name = "CVE_ID_PATRON_DICTAMEN", referencedColumnName = "CVE_ID_PATRON_DICTAMEN")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtPatronDictamenDO cveIdPatronDictamen;
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
    @JoinColumn(name = "CVE_ID_CPA", referencedColumnName = "CVE_ID_CPA")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtContadorPublicoAutDO cveIdCpa;

    public NdtPatronDictamenCpaDO() {
    }

    public NdtPatronDictamenCpaDO(Long cveIdPatronCpaDictamen) {
        this.cveIdPatronCpaDictamen = cveIdPatronCpaDictamen;
    }

    public Long getCveIdPatronCpaDictamen() {
        return cveIdPatronCpaDictamen;
    }

    public void setCveIdPatronCpaDictamen(Long cveIdPatronCpaDictamen) {
        this.cveIdPatronCpaDictamen = cveIdPatronCpaDictamen;
    }

    public NdtPatronDictamenDO getCveIdPatronDictamen() {
        return cveIdPatronDictamen;
    }

    public void setCveIdPatronDictamen(NdtPatronDictamenDO cveIdPatronDictamen) {
        this.cveIdPatronDictamen = cveIdPatronDictamen;
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

    public NdtContadorPublicoAutDO getCveIdCpa() {
        return cveIdCpa;
    }

    public void setCveIdCpa(NdtContadorPublicoAutDO cveIdCpa) {
        this.cveIdCpa = cveIdCpa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdPatronCpaDictamen != null ? cveIdPatronCpaDictamen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtPatronDictamenCpaDO)) {
            return false;
        }
        NdtPatronDictamenCpaDO other = (NdtPatronDictamenCpaDO) object;
        if ((this.cveIdPatronCpaDictamen == null && other.cveIdPatronCpaDictamen != null) || (this.cveIdPatronCpaDictamen != null && !this.cveIdPatronCpaDictamen.equals(other.cveIdPatronCpaDictamen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtPatronDictamenCpaDO[ cveIdPatronCpaDictamen=" + cveIdPatronCpaDictamen + " ]";
    }
    
}
