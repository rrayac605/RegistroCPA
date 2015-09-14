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
@Table(name = "NDC_TIPO_CONVENIO_COTIZACION")
@NamedQueries({
    @NamedQuery(name = "NdcTipoConvenioCotizacion.findAll", query = "SELECT n FROM NdcTipoConvenioCotizacionDO n"),
    @NamedQuery(name = "NdcTipoConvenioCotizacion.findByCveIdTipoConvenioCot", query = "SELECT n FROM NdcTipoConvenioCotizacionDO n WHERE n.cveIdTipoConvenioCot = :cveIdTipoConvenioCot"),
    @NamedQuery(name = "NdcTipoConvenioCotizacion.findByDesTipoConvenioCot", query = "SELECT n FROM NdcTipoConvenioCotizacionDO n WHERE n.desTipoConvenioCot = :desTipoConvenioCot"),
    @NamedQuery(name = "NdcTipoConvenioCotizacion.findByFecRegistroAlta", query = "SELECT n FROM NdcTipoConvenioCotizacionDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdcTipoConvenioCotizacion.findByFecRegistroBaja", query = "SELECT n FROM NdcTipoConvenioCotizacionDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdcTipoConvenioCotizacion.findByFecRegistroActualizado", query = "SELECT n FROM NdcTipoConvenioCotizacionDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdcTipoConvenioCotizacionDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_TIPO_CONVENIO_COT", nullable = false, precision = 22, scale = 0)
    private Long cveIdTipoConvenioCot;
    @Size(max = 50)
    @Column(name = "DES_TIPO_CONVENIO_COT", length = 50)
    private String desTipoConvenioCot;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @OneToMany(mappedBy = "cveIdTipoConvenioCot", fetch = FetchType.LAZY)
    private List<NdtPatronDictamenDO> ndtPatronDictamenList;

    public NdcTipoConvenioCotizacionDO() {
    }

    public NdcTipoConvenioCotizacionDO(Long cveIdTipoConvenioCot) {
        this.cveIdTipoConvenioCot = cveIdTipoConvenioCot;
    }

    public Long getCveIdTipoConvenioCot() {
        return cveIdTipoConvenioCot;
    }

    public void setCveIdTipoConvenioCot(Long cveIdTipoConvenioCot) {
        this.cveIdTipoConvenioCot = cveIdTipoConvenioCot;
    }

    public String getDesTipoConvenioCot() {
        return desTipoConvenioCot;
    }

    public void setDesTipoConvenioCot(String desTipoConvenioCot) {
        this.desTipoConvenioCot = desTipoConvenioCot;
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
        hash += (cveIdTipoConvenioCot != null ? cveIdTipoConvenioCot.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdcTipoConvenioCotizacionDO)) {
            return false;
        }
        NdcTipoConvenioCotizacionDO other = (NdcTipoConvenioCotizacionDO) object;
        if ((this.cveIdTipoConvenioCot == null && other.cveIdTipoConvenioCot != null) || (this.cveIdTipoConvenioCot != null && !this.cveIdTipoConvenioCot.equals(other.cveIdTipoConvenioCot))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdcTipoConvenioCotizacion[ cveIdTipoConvenioCot=" + cveIdTipoConvenioCot + " ]";
    }
    
}
