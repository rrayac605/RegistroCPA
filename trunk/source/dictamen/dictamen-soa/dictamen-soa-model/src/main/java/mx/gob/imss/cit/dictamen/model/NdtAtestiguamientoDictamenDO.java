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
@Table(name = "NDT_ATESTIGUAMIENTO_DICTAMEN")
@NamedQueries({
    @NamedQuery(name = "NdtAtestiguamientoDictamenDO.findAll", query = "SELECT n FROM NdtAtestiguamientoDictamenDO n"),
    @NamedQuery(name = "NdtAtestiguamientoDictamenDO.findByCveIdAtestigDictamen", query = "SELECT n FROM NdtAtestiguamientoDictamenDO n WHERE n.cveIdAtestigDictamen = :cveIdAtestigDictamen"),
    @NamedQuery(name = "NdtAtestiguamientoDictamenDO.findByCveIdDictamen", query = "SELECT n FROM NdtAtestiguamientoDictamenDO n WHERE n.cveIdDictamen = :cveIdDictamen"),
    @NamedQuery(name = "NdtAtestiguamientoDictamenDO.findByFecRegistroAlta", query = "SELECT n FROM NdtAtestiguamientoDictamenDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtAtestiguamientoDictamenDO.findByFecRegistroBaja", query = "SELECT n FROM NdtAtestiguamientoDictamenDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtAtestiguamientoDictamenDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtAtestiguamientoDictamenDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado"),
    @NamedQuery(name = "NdtAtestiguamientoDictamenDO.findByCveIdUsuario", query = "SELECT n FROM NdtAtestiguamientoDictamenDO n WHERE n.cveIdUsuario = :cveIdUsuario")})
public class NdtAtestiguamientoDictamenDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_ATESTIG_DICTAMEN", nullable = false, precision = 22, scale = 0)
    private Long cveIdAtestigDictamen;
    @Column(name = "CVE_ID_DICTAMEN")
    private Long cveIdDictamen;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @Size(max = 20)
    @Column(name = "CVE_ID_USUARIO", length = 20)
    private String cveIdUsuario;
    @JoinColumn(name = "CVE_ID_PATRON_DICTAMEN", referencedColumnName = "CVE_ID_PATRON_DICTAMEN")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtPatronDictamenDO cveIdPatronDictamen;
    @JoinColumn(name = "CVE_ID_ATESTIGUAMIENTO", referencedColumnName = "CVE_ID_ATESTIGUAMIENTO")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcAtestiguamientoDO cveIdAtestiguamiento;
    @OneToMany(mappedBy = "cveIdAtestigDictamen", fetch = FetchType.LAZY)
    private List<NdtRubroAtestiguamientoDictDO> ndtRubroAtestiguamientoDictDOList;

    public NdtAtestiguamientoDictamenDO() {
    }

    public NdtAtestiguamientoDictamenDO(Long cveIdAtestigDictamen) {
        this.cveIdAtestigDictamen = cveIdAtestigDictamen;
    }

    public Long getCveIdAtestigDictamen() {
        return cveIdAtestigDictamen;
    }

    public void setCveIdAtestigDictamen(Long cveIdAtestigDictamen) {
        this.cveIdAtestigDictamen = cveIdAtestigDictamen;
    }

    public Long getCveIdDictamen() {
        return cveIdDictamen;
    }

    public void setCveIdDictamen(Long cveIdDictamen) {
        this.cveIdDictamen = cveIdDictamen;
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

    public String getCveIdUsuario() {
        return cveIdUsuario;
    }

    public void setCveIdUsuario(String cveIdUsuario) {
        this.cveIdUsuario = cveIdUsuario;
    }

    public NdtPatronDictamenDO getCveIdPatronDictamen() {
        return cveIdPatronDictamen;
    }

    public void setCveIdPatronDictamen(NdtPatronDictamenDO cveIdPatronDictamen) {
        this.cveIdPatronDictamen = cveIdPatronDictamen;
    }

    public NdcAtestiguamientoDO getCveIdAtestiguamiento() {
        return cveIdAtestiguamiento;
    }

    public void setCveIdAtestiguamiento(NdcAtestiguamientoDO cveIdAtestiguamiento) {
        this.cveIdAtestiguamiento = cveIdAtestiguamiento;
    }

    public List<NdtRubroAtestiguamientoDictDO> getNdtRubroAtestiguamientoDictDOList() {
        return ndtRubroAtestiguamientoDictDOList;
    }

    public void setNdtRubroAtestiguamientoDictDOList(List<NdtRubroAtestiguamientoDictDO> ndtRubroAtestiguamientoDictDOList) {
        this.ndtRubroAtestiguamientoDictDOList = ndtRubroAtestiguamientoDictDOList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdAtestigDictamen != null ? cveIdAtestigDictamen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtAtestiguamientoDictamenDO)) {
            return false;
        }
        NdtAtestiguamientoDictamenDO other = (NdtAtestiguamientoDictamenDO) object;
        if ((this.cveIdAtestigDictamen == null && other.cveIdAtestigDictamen != null) || (this.cveIdAtestigDictamen != null && !this.cveIdAtestigDictamen.equals(other.cveIdAtestigDictamen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.dos.NdtAtestiguamientoDictamenDO[ cveIdAtestigDictamen=" + cveIdAtestigDictamen + " ]";
    }
    
}
