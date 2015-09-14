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
@Table(name = "NDC_CUESTIONARIO")
@NamedQueries({
    @NamedQuery(name = "NdcCuestionario.findAll", query = "SELECT n FROM NdcCuestionarioDO n"),
    @NamedQuery(name = "NdcCuestionario.findByCveIdCuestionario", query = "SELECT n FROM NdcCuestionarioDO n WHERE n.cveIdCuestionario = :cveIdCuestionario"),
    @NamedQuery(name = "NdcCuestionario.findByDesCuestionario", query = "SELECT n FROM NdcCuestionarioDO n WHERE n.desCuestionario = :desCuestionario"),
    @NamedQuery(name = "NdcCuestionario.findByFecRegistroAlta", query = "SELECT n FROM NdcCuestionarioDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdcCuestionario.findByFecRegistroActualizado", query = "SELECT n FROM NdcCuestionarioDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado"),
    @NamedQuery(name = "NdcCuestionario.findByFecRegistroBaja", query = "SELECT n FROM NdcCuestionarioDO n WHERE n.fecRegistroBaja = :fecRegistroBaja")})
public class NdcCuestionarioDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_CUESTIONARIO", nullable = false, precision = 22, scale = 0)
    private Long cveIdCuestionario;
    @Size(max = 100)
    @Column(name = "DES_CUESTIONARIO", length = 100)
    private String desCuestionario;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @OneToMany(mappedBy = "cveIdCuestionario", fetch = FetchType.LAZY)
    private List<NdcRubroDO> ndcRubroList;

    public NdcCuestionarioDO() {
    }

    public NdcCuestionarioDO(Long cveIdCuestionario) {
        this.cveIdCuestionario = cveIdCuestionario;
    }

    public Long getCveIdCuestionario() {
        return cveIdCuestionario;
    }

    public void setCveIdCuestionario(Long cveIdCuestionario) {
        this.cveIdCuestionario = cveIdCuestionario;
    }

    public String getDesCuestionario() {
        return desCuestionario;
    }

    public void setDesCuestionario(String desCuestionario) {
        this.desCuestionario = desCuestionario;
    }

    public Date getFecRegistroAlta() {
        return fecRegistroAlta;
    }

    public void setFecRegistroAlta(Date fecRegistroAlta) {
        this.fecRegistroAlta = fecRegistroAlta;
    }

    public Date getFecRegistroActualizado() {
        return fecRegistroActualizado;
    }

    public void setFecRegistroActualizado(Date fecRegistroActualizado) {
        this.fecRegistroActualizado = fecRegistroActualizado;
    }

    public Date getFecRegistroBaja() {
        return fecRegistroBaja;
    }

    public void setFecRegistroBaja(Date fecRegistroBaja) {
        this.fecRegistroBaja = fecRegistroBaja;
    }

    public List<NdcRubroDO> getNdcRubroList() {
        return ndcRubroList;
    }

    public void setNdcRubroList(List<NdcRubroDO> ndcRubroList) {
        this.ndcRubroList = ndcRubroList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdCuestionario != null ? cveIdCuestionario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdcCuestionarioDO)) {
            return false;
        }
        NdcCuestionarioDO other = (NdcCuestionarioDO) object;
        if ((this.cveIdCuestionario == null && other.cveIdCuestionario != null) || (this.cveIdCuestionario != null && !this.cveIdCuestionario.equals(other.cveIdCuestionario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdcCuestionario[ cveIdCuestionario=" + cveIdCuestionario + " ]";
    }
    
}
