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
@Table(name = "NDT_COLEGIO")
@NamedQueries({
    @NamedQuery(name = "NdtColegio.findAll", query = "SELECT n FROM NdtColegioDO n"),
    @NamedQuery(name = "NdtColegio.findByCveIdColegio", query = "SELECT n FROM NdtColegioDO n WHERE n.cveIdColegio = :cveIdColegio"),
    @NamedQuery(name = "NdtColegio.findByCveIdUsuario", query = "SELECT n FROM NdtColegioDO n WHERE n.cveIdUsuario = :cveIdUsuario"),
    @NamedQuery(name = "NdtColegio.findByFecRegistroAlta", query = "SELECT n FROM NdtColegioDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtColegio.findByFecRegistroBaja", query = "SELECT n FROM NdtColegioDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtColegio.findByFecRegistroActualizado", query = "SELECT n FROM NdtColegioDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdtColegioDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_COLEGIO", nullable = false, precision = 22, scale = 0)
    private Long cveIdColegio;
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
    @OneToMany(mappedBy = "cveIdColegio", fetch = FetchType.LAZY)
    private List<NdtCpaAcreditacionDO> ndtCpaAcreditacionList;
    @OneToMany(mappedBy = "cveIdColegio", fetch = FetchType.LAZY)
    private List<NdtR3ColegioDO> ndtR3ColegioList;

    public NdtColegioDO() {
    }

    public NdtColegioDO(Long cveIdColegio) {
        this.cveIdColegio = cveIdColegio;
    }

    public Long getCveIdColegio() {
        return cveIdColegio;
    }

    public void setCveIdColegio(Long cveIdColegio) {
        this.cveIdColegio = cveIdColegio;
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

    public List<NdtCpaAcreditacionDO> getNdtCpaAcreditacionList() {
        return ndtCpaAcreditacionList;
    }

    public void setNdtCpaAcreditacionList(List<NdtCpaAcreditacionDO> ndtCpaAcreditacionList) {
        this.ndtCpaAcreditacionList = ndtCpaAcreditacionList;
    }

    public List<NdtR3ColegioDO> getNdtR3ColegioList() {
        return ndtR3ColegioList;
    }

    public void setNdtR3ColegioList(List<NdtR3ColegioDO> ndtR3ColegioList) {
        this.ndtR3ColegioList = ndtR3ColegioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdColegio != null ? cveIdColegio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtColegioDO)) {
            return false;
        }
        NdtColegioDO other = (NdtColegioDO) object;
        if ((this.cveIdColegio == null && other.cveIdColegio != null) || (this.cveIdColegio != null && !this.cveIdColegio.equals(other.cveIdColegio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtColegio[ cveIdColegio=" + cveIdColegio + " ]";
    }
    
}
