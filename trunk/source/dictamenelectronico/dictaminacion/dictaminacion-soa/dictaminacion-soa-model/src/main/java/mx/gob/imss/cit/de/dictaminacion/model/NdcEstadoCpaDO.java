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
@Table(name = "NDC_ESTADO_CPA")
@NamedQueries({
    @NamedQuery(name = "NdcEstadoCpaDO.findAll", query = "SELECT n FROM NdcEstadoCpaDO n"),
    @NamedQuery(name = "NdcEstadoCpaDO.findByCveIdEstadoCpa", query = "SELECT n FROM NdcEstadoCpaDO n WHERE n.cveIdEstadoCpa = :cveIdEstadoCpa"),
    @NamedQuery(name = "NdcEstadoCpaDO.findByDesEstadoCpa", query = "SELECT n FROM NdcEstadoCpaDO n WHERE n.desEstadoCpa = :desEstadoCpa"),
    @NamedQuery(name = "NdcEstadoCpaDO.findByFecRegistroAlta", query = "SELECT n FROM NdcEstadoCpaDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdcEstadoCpaDO.findByFecRegistroBaja", query = "SELECT n FROM NdcEstadoCpaDO n WHERE n.fecRegistroBaja = :fecRegistroBaja")})
public class NdcEstadoCpaDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_ESTADO_CPA", nullable = false, precision = 22, scale = 0)
    private Long cveIdEstadoCpa;
    @Size(max = 50)
    @Column(name = "DES_ESTADO_CPA", length = 50)
    private String desEstadoCpa;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @OneToMany(mappedBy = "cveIdEstadoCpa", fetch = FetchType.LAZY)
    private List<NdtContadorPublicoAutDO> ndtContadorPublicoAutDOList;
    @OneToMany(mappedBy = "cveIdEstadoCpa", fetch = FetchType.LAZY)
    private List<NdtCpaEstatusDO> ndtCpaEstatusDOList;

    public NdcEstadoCpaDO() {
    }

    public NdcEstadoCpaDO(Long cveIdEstadoCpa) {
        this.cveIdEstadoCpa = cveIdEstadoCpa;
    }

    public Long getCveIdEstadoCpa() {
        return cveIdEstadoCpa;
    }

    public void setCveIdEstadoCpa(Long cveIdEstadoCpa) {
        this.cveIdEstadoCpa = cveIdEstadoCpa;
    }

    public String getDesEstadoCpa() {
        return desEstadoCpa;
    }

    public void setDesEstadoCpa(String desEstadoCpa) {
        this.desEstadoCpa = desEstadoCpa;
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

    public List<NdtContadorPublicoAutDO> getNdtContadorPublicoAutDOList() {
        return ndtContadorPublicoAutDOList;
    }

    public void setNdtContadorPublicoAutDOList(List<NdtContadorPublicoAutDO> ndtContadorPublicoAutDOList) {
        this.ndtContadorPublicoAutDOList = ndtContadorPublicoAutDOList;
    }

    public List<NdtCpaEstatusDO> getNdtCpaEstatusDOList() {
        return ndtCpaEstatusDOList;
    }

    public void setNdtCpaEstatusDOList(List<NdtCpaEstatusDO> ndtCpaEstatusDOList) {
        this.ndtCpaEstatusDOList = ndtCpaEstatusDOList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdEstadoCpa != null ? cveIdEstadoCpa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdcEstadoCpaDO)) {
            return false;
        }
        NdcEstadoCpaDO other = (NdcEstadoCpaDO) object;
        if ((this.cveIdEstadoCpa == null && other.cveIdEstadoCpa != null) || (this.cveIdEstadoCpa != null && !this.cveIdEstadoCpa.equals(other.cveIdEstadoCpa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdcEstadoCpaDO[ cveIdEstadoCpa=" + cveIdEstadoCpa + " ]";
    }
    
}
