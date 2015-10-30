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
@Table(name = "NDC_ESTADO_DICTAMEN")
@NamedQueries({
    @NamedQuery(name = "NdcEstadoDictamenDO.findAll", query = "SELECT n FROM NdcEstadoDictamenDO n"),
    @NamedQuery(name = "NdcEstadoDictamenDO.findByCveIdEstadoDictamen", query = "SELECT n FROM NdcEstadoDictamenDO n WHERE n.cveIdEstadoDictamen = :cveIdEstadoDictamen"),
    @NamedQuery(name = "NdcEstadoDictamenDO.findByDesEstadoDictamen", query = "SELECT n FROM NdcEstadoDictamenDO n WHERE n.desEstadoDictamen = :desEstadoDictamen"),
    @NamedQuery(name = "NdcEstadoDictamenDO.findByFecRegistroAlta", query = "SELECT n FROM NdcEstadoDictamenDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdcEstadoDictamenDO.findByFecRegistroBaja", query = "SELECT n FROM NdcEstadoDictamenDO n WHERE n.fecRegistroBaja = :fecRegistroBaja")})
public class NdcEstadoDictamenDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_ESTADO_DICTAMEN", nullable = false, precision = 22, scale = 0)
    private Long cveIdEstadoDictamen;
    @Size(max = 100)
    @Column(name = "DES_ESTADO_DICTAMEN", length = 100)
    private String desEstadoDictamen;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @OneToMany(mappedBy = "cveIdEstadoDictamen", fetch = FetchType.LAZY)
    private List<NdtPatronDictamenDO> ndtPatronDictamenDOList;
    @OneToMany(mappedBy = "cveIdEstadoDictamen", fetch = FetchType.LAZY)
    private List<NdtDictamenEstadosDO> ndtDictamenEstadosDOList;

    public NdcEstadoDictamenDO() {
    }

    public NdcEstadoDictamenDO(Long cveIdEstadoDictamen) {
        this.cveIdEstadoDictamen = cveIdEstadoDictamen;
    }

    public Long getCveIdEstadoDictamen() {
        return cveIdEstadoDictamen;
    }

    public void setCveIdEstadoDictamen(Long cveIdEstadoDictamen) {
        this.cveIdEstadoDictamen = cveIdEstadoDictamen;
    }

    public String getDesEstadoDictamen() {
        return desEstadoDictamen;
    }

    public void setDesEstadoDictamen(String desEstadoDictamen) {
        this.desEstadoDictamen = desEstadoDictamen;
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

    public List<NdtPatronDictamenDO> getNdtPatronDictamenDOList() {
        return ndtPatronDictamenDOList;
    }

    public void setNdtPatronDictamenDOList(List<NdtPatronDictamenDO> ndtPatronDictamenDOList) {
        this.ndtPatronDictamenDOList = ndtPatronDictamenDOList;
    }

    public List<NdtDictamenEstadosDO> getNdtDictamenEstadosDOList() {
        return ndtDictamenEstadosDOList;
    }

    public void setNdtDictamenEstadosDOList(List<NdtDictamenEstadosDO> ndtDictamenEstadosDOList) {
        this.ndtDictamenEstadosDOList = ndtDictamenEstadosDOList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdEstadoDictamen != null ? cveIdEstadoDictamen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdcEstadoDictamenDO)) {
            return false;
        }
        NdcEstadoDictamenDO other = (NdcEstadoDictamenDO) object;
        if ((this.cveIdEstadoDictamen == null && other.cveIdEstadoDictamen != null) || (this.cveIdEstadoDictamen != null && !this.cveIdEstadoDictamen.equals(other.cveIdEstadoDictamen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdcEstadoDictamenDO[ cveIdEstadoDictamen=" + cveIdEstadoDictamen + " ]";
    }
    
}
