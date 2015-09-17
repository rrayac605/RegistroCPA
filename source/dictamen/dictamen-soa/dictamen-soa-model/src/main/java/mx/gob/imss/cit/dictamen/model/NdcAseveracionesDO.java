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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "NDC_ASEVERACIONES")
@NamedQueries({
    @NamedQuery(name = "NdcAseveracionesDO.findAll", query = "SELECT n FROM NdcAseveracionesDO n"),
    @NamedQuery(name = "NdcAseveracionesDO.findByCveIdAseveracion", query = "SELECT n FROM NdcAseveracionesDO n WHERE n.cveIdAseveracion = :cveIdAseveracion"),
    @NamedQuery(name = "NdcAseveracionesDO.findByDesTipoAseveracion", query = "SELECT n FROM NdcAseveracionesDO n WHERE n.desTipoAseveracion = :desTipoAseveracion"),
    @NamedQuery(name = "NdcAseveracionesDO.findByFecRegistroAlta", query = "SELECT n FROM NdcAseveracionesDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdcAseveracionesDO.findByFecRegistroBaja", query = "SELECT n FROM NdcAseveracionesDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdcAseveracionesDO.findByFecRegistroActualizado", query = "SELECT n FROM NdcAseveracionesDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdcAseveracionesDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SEQ_NDCTIPOASEVERACIONES")
    @NotNull
    @Column(name = "CVE_ID_ASEVERACION", nullable = false, precision = 22, scale = 0)
    private Long cveIdAseveracion;
    @Size(max = 50)
    @Column(name = "DES_TIPO_ASEVERACION", length = 50)
    private String desTipoAseveracion;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @OneToMany(mappedBy = "cveIdAseveracion", fetch = FetchType.LAZY)
    private List<NdtCargaAseveracionesDO> ndtCargaAseveracionesDOList;

    public NdcAseveracionesDO() {
    }

    public NdcAseveracionesDO(Long cveIdAseveracion) {
        this.cveIdAseveracion = cveIdAseveracion;
    }

    public Long getCveIdAseveracion() {
        return cveIdAseveracion;
    }

    public void setCveIdAseveracion(Long cveIdAseveracion) {
        this.cveIdAseveracion = cveIdAseveracion;
    }

    public String getDesTipoAseveracion() {
        return desTipoAseveracion;
    }

    public void setDesTipoAseveracion(String desTipoAseveracion) {
        this.desTipoAseveracion = desTipoAseveracion;
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

    public List<NdtCargaAseveracionesDO> getNdtCargaAseveracionesDOList() {
        return ndtCargaAseveracionesDOList;
    }

    public void setNdtCargaAseveracionesDOList(List<NdtCargaAseveracionesDO> ndtCargaAseveracionesDOList) {
        this.ndtCargaAseveracionesDOList = ndtCargaAseveracionesDOList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdAseveracion != null ? cveIdAseveracion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdcAseveracionesDO)) {
            return false;
        }
        NdcAseveracionesDO other = (NdcAseveracionesDO) object;
        if ((this.cveIdAseveracion == null && other.cveIdAseveracion != null) || (this.cveIdAseveracion != null && !this.cveIdAseveracion.equals(other.cveIdAseveracion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdcAseveracionesDO[ cveIdAseveracion=" + cveIdAseveracion + " ]";
    }
    
}
