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
@Table(name = "NDC_TIPO_OFICIO")
@NamedQueries({
    @NamedQuery(name = "NdcTipoOficio.findAll", query = "SELECT n FROM NdcTipoOficioDO n"),
    @NamedQuery(name = "NdcTipoOficio.findByCveIdTipoOficio", query = "SELECT n FROM NdcTipoOficioDO n WHERE n.cveIdTipoOficio = :cveIdTipoOficio"),
    @NamedQuery(name = "NdcTipoOficio.findByDesTipoOficio", query = "SELECT n FROM NdcTipoOficioDO n WHERE n.desTipoOficio = :desTipoOficio"),
    @NamedQuery(name = "NdcTipoOficio.findByFecRegistroAlta", query = "SELECT n FROM NdcTipoOficioDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdcTipoOficio.findByFecRegistroBaja", query = "SELECT n FROM NdcTipoOficioDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdcTipoOficio.findByFecRegistroActualizado", query = "SELECT n FROM NdcTipoOficioDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdcTipoOficioDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_TIPO_OFICIO", nullable = false, precision = 22, scale = 0)
    private Long cveIdTipoOficio;
    @Size(max = 20)
    @Column(name = "DES_TIPO_OFICIO", length = 20)
    private String desTipoOficio;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @OneToMany(mappedBy = "cveIdTipoOficio", fetch = FetchType.LAZY)
    private List<NdtA75CePersonalDO> ndtA75CePersonalList;

    public NdcTipoOficioDO() {
    }

    public NdcTipoOficioDO(Long cveIdTipoOficio) {
        this.cveIdTipoOficio = cveIdTipoOficio;
    }

    public Long getCveIdTipoOficio() {
        return cveIdTipoOficio;
    }

    public void setCveIdTipoOficio(Long cveIdTipoOficio) {
        this.cveIdTipoOficio = cveIdTipoOficio;
    }

    public String getDesTipoOficio() {
        return desTipoOficio;
    }

    public void setDesTipoOficio(String desTipoOficio) {
        this.desTipoOficio = desTipoOficio;
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

    public List<NdtA75CePersonalDO> getNdtA75CePersonalList() {
        return ndtA75CePersonalList;
    }

    public void setNdtA75CePersonalList(List<NdtA75CePersonalDO> ndtA75CePersonalList) {
        this.ndtA75CePersonalList = ndtA75CePersonalList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdTipoOficio != null ? cveIdTipoOficio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdcTipoOficioDO)) {
            return false;
        }
        NdcTipoOficioDO other = (NdcTipoOficioDO) object;
        if ((this.cveIdTipoOficio == null && other.cveIdTipoOficio != null) || (this.cveIdTipoOficio != null && !this.cveIdTipoOficio.equals(other.cveIdTipoOficio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdcTipoOficio[ cveIdTipoOficio=" + cveIdTipoOficio + " ]";
    }
    
}
