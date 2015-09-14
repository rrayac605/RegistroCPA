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
@Table(name = "NDC_TIPO_CONSUMO_TRANSPORTE")
@NamedQueries({
    @NamedQuery(name = "NdcTipoConsumoTransporte.findAll", query = "SELECT n FROM NdcTipoConsumoTransporteDO n"),
    @NamedQuery(name = "NdcTipoConsumoTransporte.findByCveIdTipoConsumoTransporte", query = "SELECT n FROM NdcTipoConsumoTransporteDO n WHERE n.cveIdTipoConsumoTransporte = :cveIdTipoConsumoTransporte"),
    @NamedQuery(name = "NdcTipoConsumoTransporte.findByDesTipoConsumo", query = "SELECT n FROM NdcTipoConsumoTransporteDO n WHERE n.desTipoConsumo = :desTipoConsumo"),
    @NamedQuery(name = "NdcTipoConsumoTransporte.findByFecRegistroAlta", query = "SELECT n FROM NdcTipoConsumoTransporteDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdcTipoConsumoTransporte.findByFecRegistroBaja", query = "SELECT n FROM NdcTipoConsumoTransporteDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdcTipoConsumoTransporte.findByFecRegistroActualizado", query = "SELECT n FROM NdcTipoConsumoTransporteDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdcTipoConsumoTransporteDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_TIPO_CONSUMO_TRANSPORTE", nullable = false, precision = 22, scale = 0)
    private Long cveIdTipoConsumoTransporte;
    @Size(max = 20)
    @Column(name = "DES_TIPO_CONSUMO", length = 20)
    private String desTipoConsumo;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @OneToMany(mappedBy = "cveIdTipoConsumoTransporte", fetch = FetchType.LAZY)
    private List<NdtA74CeTransporteDO> ndtA74CeTransporteList;

    public NdcTipoConsumoTransporteDO() {
    }

    public NdcTipoConsumoTransporteDO(Long cveIdTipoConsumoTransporte) {
        this.cveIdTipoConsumoTransporte = cveIdTipoConsumoTransporte;
    }

    public Long getCveIdTipoConsumoTransporte() {
        return cveIdTipoConsumoTransporte;
    }

    public void setCveIdTipoConsumoTransporte(Long cveIdTipoConsumoTransporte) {
        this.cveIdTipoConsumoTransporte = cveIdTipoConsumoTransporte;
    }

    public String getDesTipoConsumo() {
        return desTipoConsumo;
    }

    public void setDesTipoConsumo(String desTipoConsumo) {
        this.desTipoConsumo = desTipoConsumo;
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

    public List<NdtA74CeTransporteDO> getNdtA74CeTransporteList() {
        return ndtA74CeTransporteList;
    }

    public void setNdtA74CeTransporteList(List<NdtA74CeTransporteDO> ndtA74CeTransporteList) {
        this.ndtA74CeTransporteList = ndtA74CeTransporteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdTipoConsumoTransporte != null ? cveIdTipoConsumoTransporte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdcTipoConsumoTransporteDO)) {
            return false;
        }
        NdcTipoConsumoTransporteDO other = (NdcTipoConsumoTransporteDO) object;
        if ((this.cveIdTipoConsumoTransporte == null && other.cveIdTipoConsumoTransporte != null) || (this.cveIdTipoConsumoTransporte != null && !this.cveIdTipoConsumoTransporte.equals(other.cveIdTipoConsumoTransporte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdcTipoConsumoTransporte[ cveIdTipoConsumoTransporte=" + cveIdTipoConsumoTransporte + " ]";
    }
    
}
