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
@Table(name = "NDC_STATUS_CARGA_ASEVERACIONES")
@NamedQueries({
    @NamedQuery(name = "NdcStatusCargaAseveracionesDO.findAll", query = "SELECT n FROM NdcStatusCargaAseveracionesDO n"),
    @NamedQuery(name = "NdcStatusCargaAseveracionesDO.findByCveIdStatusCarga", query = "SELECT n FROM NdcStatusCargaAseveracionesDO n WHERE n.cveIdStatusCarga = :cveIdStatusCarga"),
    @NamedQuery(name = "NdcStatusCargaAseveracionesDO.findByDesStatusCargaAseveraciones", query = "SELECT n FROM NdcStatusCargaAseveracionesDO n WHERE n.desStatusCargaAseveraciones = :desStatusCargaAseveraciones"),
    @NamedQuery(name = "NdcStatusCargaAseveracionesDO.findByFecRegistroAlta", query = "SELECT n FROM NdcStatusCargaAseveracionesDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdcStatusCargaAseveracionesDO.findByFecRegistroBaja", query = "SELECT n FROM NdcStatusCargaAseveracionesDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdcStatusCargaAseveracionesDO.findByFecRegistroActualizado", query = "SELECT n FROM NdcStatusCargaAseveracionesDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdcStatusCargaAseveracionesDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_STATUS_CARGA", nullable = false, precision = 22, scale = 0)
    private Long cveIdStatusCarga;
    @Size(max = 100)
    @Column(name = "DES_STATUS_CARGA_ASEVERACIONES", length = 100)
    private String desStatusCargaAseveraciones;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @OneToMany(mappedBy = "cveIdStatusCarga", fetch = FetchType.LAZY)
    private List<NdtCargaAseveracionesDO> ndtCargaAseveracionesDOList;

    public NdcStatusCargaAseveracionesDO() {
    }

    public NdcStatusCargaAseveracionesDO(Long cveIdStatusCarga) {
        this.cveIdStatusCarga = cveIdStatusCarga;
    }

    public Long getCveIdStatusCarga() {
        return cveIdStatusCarga;
    }

    public void setCveIdStatusCarga(Long cveIdStatusCarga) {
        this.cveIdStatusCarga = cveIdStatusCarga;
    }

    public String getDesStatusCargaAseveraciones() {
        return desStatusCargaAseveraciones;
    }

    public void setDesStatusCargaAseveraciones(String desStatusCargaAseveraciones) {
        this.desStatusCargaAseveraciones = desStatusCargaAseveraciones;
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
        hash += (cveIdStatusCarga != null ? cveIdStatusCarga.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdcStatusCargaAseveracionesDO)) {
            return false;
        }
        NdcStatusCargaAseveracionesDO other = (NdcStatusCargaAseveracionesDO) object;
        if ((this.cveIdStatusCarga == null && other.cveIdStatusCarga != null) || (this.cveIdStatusCarga != null && !this.cveIdStatusCarga.equals(other.cveIdStatusCarga))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdcStatusCargaAseveracionesDO[ cveIdStatusCarga=" + cveIdStatusCarga + " ]";
    }
    
}
