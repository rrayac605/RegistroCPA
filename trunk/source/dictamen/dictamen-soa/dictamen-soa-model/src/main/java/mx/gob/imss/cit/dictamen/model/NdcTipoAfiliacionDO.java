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
@Table(name = "NDC_TIPO_AFILIACION")
@NamedQueries({
    @NamedQuery(name = "NdcTipoAfiliacion.findAll", query = "SELECT n FROM NdcTipoAfiliacionDO n"),
    @NamedQuery(name = "NdcTipoAfiliacion.findByCveIdTipoAfiliacion", query = "SELECT n FROM NdcTipoAfiliacionDO n WHERE n.cveIdTipoAfiliacion = :cveIdTipoAfiliacion"),
    @NamedQuery(name = "NdcTipoAfiliacion.findByDesTipoAfiliacion", query = "SELECT n FROM NdcTipoAfiliacionDO n WHERE n.desTipoAfiliacion = :desTipoAfiliacion"),
    @NamedQuery(name = "NdcTipoAfiliacion.findByFecRegistroAlta", query = "SELECT n FROM NdcTipoAfiliacionDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdcTipoAfiliacion.findByFecRegistroBaja", query = "SELECT n FROM NdcTipoAfiliacionDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdcTipoAfiliacion.findByFecRegistroActualizado", query = "SELECT n FROM NdcTipoAfiliacionDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdcTipoAfiliacionDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_TIPO_AFILIACION", nullable = false, precision = 22, scale = 0)
    private Long cveIdTipoAfiliacion;
    @Size(max = 50)
    @Column(name = "DES_TIPO_AFILIACION", length = 50)
    private String desTipoAfiliacion;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @OneToMany(mappedBy = "cveIdTipoAfiliacion", fetch = FetchType.LAZY)
    private List<NdtPatronDictamenDO> ndtPatronDictamenList;

    public NdcTipoAfiliacionDO() {
    }

    public NdcTipoAfiliacionDO(Long cveIdTipoAfiliacion) {
        this.cveIdTipoAfiliacion = cveIdTipoAfiliacion;
    }

    public Long getCveIdTipoAfiliacion() {
        return cveIdTipoAfiliacion;
    }

    public void setCveIdTipoAfiliacion(Long cveIdTipoAfiliacion) {
        this.cveIdTipoAfiliacion = cveIdTipoAfiliacion;
    }

    public String getDesTipoAfiliacion() {
        return desTipoAfiliacion;
    }

    public void setDesTipoAfiliacion(String desTipoAfiliacion) {
        this.desTipoAfiliacion = desTipoAfiliacion;
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

    public List<NdtPatronDictamenDO> getNdtPatronDictamenList() {
        return ndtPatronDictamenList;
    }

    public void setNdtPatronDictamenList(List<NdtPatronDictamenDO> ndtPatronDictamenList) {
        this.ndtPatronDictamenList = ndtPatronDictamenList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdTipoAfiliacion != null ? cveIdTipoAfiliacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdcTipoAfiliacionDO)) {
            return false;
        }
        NdcTipoAfiliacionDO other = (NdcTipoAfiliacionDO) object;
        if ((this.cveIdTipoAfiliacion == null && other.cveIdTipoAfiliacion != null) || (this.cveIdTipoAfiliacion != null && !this.cveIdTipoAfiliacion.equals(other.cveIdTipoAfiliacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdcTipoAfiliacion[ cveIdTipoAfiliacion=" + cveIdTipoAfiliacion + " ]";
    }
    
}
