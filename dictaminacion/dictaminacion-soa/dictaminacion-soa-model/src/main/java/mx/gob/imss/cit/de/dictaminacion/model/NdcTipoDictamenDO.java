/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.de.dictaminacion.model;

import java.io.Serializable;

import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
@Table(name = "NDC_TIPO_DICTAMEN")
@NamedQueries({
    @NamedQuery(name = "NdcTipoDictamenDO.findAll", query = "SELECT n FROM NdcTipoDictamenDO n"),
    @NamedQuery(name = "NdcTipoDictamenDO.findByCveIdTipoDictamen", query = "SELECT n FROM NdcTipoDictamenDO n WHERE n.cveIdTipoDictamen = :cveIdTipoDictamen"),
    @NamedQuery(name = "NdcTipoDictamenDO.findByDesTipoDictamen", query = "SELECT n FROM NdcTipoDictamenDO n WHERE n.desTipoDictamen = :desTipoDictamen"),
    @NamedQuery(name = "NdcTipoDictamenDO.findByFecRegistroAlta", query = "SELECT n FROM NdcTipoDictamenDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdcTipoDictamenDO.findByFecRegistroBaja", query = "SELECT n FROM NdcTipoDictamenDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdcTipoDictamenDO.findByFecRegistroActualizado", query = "SELECT n FROM NdcTipoDictamenDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdcTipoDictamenDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_TIPO_DICTAMEN", nullable = false, precision = 22, scale = 0)
    private Long cveIdTipoDictamen;
    @Size(max = 50)
    @Column(name = "DES_TIPO_DICTAMEN", length = 50)
    private String desTipoDictamen;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @OneToMany(mappedBy = "cveIdTipoDictamen", fetch = FetchType.LAZY)
    private List<NdtPatronDictamenDO> ndtPatronDictamenDOList;

    public NdcTipoDictamenDO() {
    }

    public NdcTipoDictamenDO(Long cveIdTipoDictamen) {
        this.cveIdTipoDictamen = cveIdTipoDictamen;
    }

    public Long getCveIdTipoDictamen() {
        return cveIdTipoDictamen;
    }

    public void setCveIdTipoDictamen(Long cveIdTipoDictamen) {
        this.cveIdTipoDictamen = cveIdTipoDictamen;
    }

    public String getDesTipoDictamen() {
        return desTipoDictamen;
    }

    public void setDesTipoDictamen(String desTipoDictamen) {
        this.desTipoDictamen = desTipoDictamen;
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

    public List<NdtPatronDictamenDO> getNdtPatronDictamenDOList() {
        return ndtPatronDictamenDOList;
    }

    public void setNdtPatronDictamenDOList(List<NdtPatronDictamenDO> ndtPatronDictamenDOList) {
        this.ndtPatronDictamenDOList = ndtPatronDictamenDOList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdTipoDictamen != null ? cveIdTipoDictamen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdcTipoDictamenDO)) {
            return false;
        }
        NdcTipoDictamenDO other = (NdcTipoDictamenDO) object;
        if ((this.cveIdTipoDictamen == null && other.cveIdTipoDictamen != null) || (this.cveIdTipoDictamen != null && !this.cveIdTipoDictamen.equals(other.cveIdTipoDictamen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdcTipoDictamenDO[ cveIdTipoDictamen=" + cveIdTipoDictamen + " ]";
    }
    
}
