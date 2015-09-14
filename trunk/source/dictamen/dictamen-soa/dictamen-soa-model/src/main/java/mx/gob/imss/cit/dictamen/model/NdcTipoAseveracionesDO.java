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
@Table(name = "NDC_TIPO_ASEVERACIONES")
@NamedQueries({
    @NamedQuery(name = "NdcTipoAseveraciones.findAll", query = "SELECT n FROM NdcTipoAseveracionesDO n"),
    @NamedQuery(name = "NdcTipoAseveraciones.findByCveIdTipoAseveracion", query = "SELECT n FROM NdcTipoAseveracionesDO n WHERE n.cveIdTipoAseveracion = :cveIdTipoAseveracion"),
    @NamedQuery(name = "NdcTipoAseveraciones.findByDesTipoAseveracion", query = "SELECT n FROM NdcTipoAseveracionesDO n WHERE n.desTipoAseveracion = :desTipoAseveracion"),
    @NamedQuery(name = "NdcTipoAseveraciones.findByFecRegistroAlta", query = "SELECT n FROM NdcTipoAseveracionesDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdcTipoAseveraciones.findByFecRegistroBaja", query = "SELECT n FROM NdcTipoAseveracionesDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdcTipoAseveraciones.findByFecRegistroActualizado", query = "SELECT n FROM NdcTipoAseveracionesDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdcTipoAseveracionesDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_TIPO_ASEVERACION", nullable = false, precision = 22, scale = 0)
    private Long cveIdTipoAseveracion;
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
    @OneToMany(mappedBy = "cveIdTipoAseveracion", fetch = FetchType.LAZY)
    private List<NdtBitCargaAseveracionesDO> ndtBitCargaAseveracionesList;

    public NdcTipoAseveracionesDO() {
    }

    public NdcTipoAseveracionesDO(Long cveIdTipoAseveracion) {
        this.cveIdTipoAseveracion = cveIdTipoAseveracion;
    }

    public Long getCveIdTipoAseveracion() {
        return cveIdTipoAseveracion;
    }

    public void setCveIdTipoAseveracion(Long cveIdTipoAseveracion) {
        this.cveIdTipoAseveracion = cveIdTipoAseveracion;
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

    public List<NdtBitCargaAseveracionesDO> getNdtBitCargaAseveracionesList() {
        return ndtBitCargaAseveracionesList;
    }

    public void setNdtBitCargaAseveracionesList(List<NdtBitCargaAseveracionesDO> ndtBitCargaAseveracionesList) {
        this.ndtBitCargaAseveracionesList = ndtBitCargaAseveracionesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdTipoAseveracion != null ? cveIdTipoAseveracion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdcTipoAseveracionesDO)) {
            return false;
        }
        NdcTipoAseveracionesDO other = (NdcTipoAseveracionesDO) object;
        if ((this.cveIdTipoAseveracion == null && other.cveIdTipoAseveracion != null) || (this.cveIdTipoAseveracion != null && !this.cveIdTipoAseveracion.equals(other.cveIdTipoAseveracion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdcTipoAseveraciones[ cveIdTipoAseveracion=" + cveIdTipoAseveracion + " ]";
    }
    
}
