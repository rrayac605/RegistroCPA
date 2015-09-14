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
@Table(name = "NDC_CLASE_OBRA")
@NamedQueries({
    @NamedQuery(name = "NdcClaseObra.findAll", query = "SELECT n FROM NdcClaseObraDO n"),
    @NamedQuery(name = "NdcClaseObra.findByCveIdClaseObra", query = "SELECT n FROM NdcClaseObraDO n WHERE n.cveIdClaseObra = :cveIdClaseObra"),
    @NamedQuery(name = "NdcClaseObra.findByDesClaseObra", query = "SELECT n FROM NdcClaseObraDO n WHERE n.desClaseObra = :desClaseObra"),
    @NamedQuery(name = "NdcClaseObra.findByFecRegistroAlta", query = "SELECT n FROM NdcClaseObraDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdcClaseObra.findByFecRegistroBaja", query = "SELECT n FROM NdcClaseObraDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdcClaseObra.findByFecRegistroActualizado", query = "SELECT n FROM NdcClaseObraDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdcClaseObraDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_CLASE_OBRA", nullable = false, precision = 22, scale = 0)
    private Long cveIdClaseObra;
    @Size(max = 100)
    @Column(name = "DES_CLASE_OBRA", length = 100)
    private String desClaseObra;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @OneToMany(mappedBy = "cveIdClaseObra", fetch = FetchType.LAZY)
    private List<NdtA91ObrasConstruccionDO> ndtA91ObrasConstruccionList;

    public NdcClaseObraDO() {
    }

    public NdcClaseObraDO(Long cveIdClaseObra) {
        this.cveIdClaseObra = cveIdClaseObra;
    }

    public Long getCveIdClaseObra() {
        return cveIdClaseObra;
    }

    public void setCveIdClaseObra(Long cveIdClaseObra) {
        this.cveIdClaseObra = cveIdClaseObra;
    }

    public String getDesClaseObra() {
        return desClaseObra;
    }

    public void setDesClaseObra(String desClaseObra) {
        this.desClaseObra = desClaseObra;
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

    public List<NdtA91ObrasConstruccionDO> getNdtA91ObrasConstruccionList() {
        return ndtA91ObrasConstruccionList;
    }

    public void setNdtA91ObrasConstruccionList(List<NdtA91ObrasConstruccionDO> ndtA91ObrasConstruccionList) {
        this.ndtA91ObrasConstruccionList = ndtA91ObrasConstruccionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdClaseObra != null ? cveIdClaseObra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdcClaseObraDO)) {
            return false;
        }
        NdcClaseObraDO other = (NdcClaseObraDO) object;
        if ((this.cveIdClaseObra == null && other.cveIdClaseObra != null) || (this.cveIdClaseObra != null && !this.cveIdClaseObra.equals(other.cveIdClaseObra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdcClaseObra[ cveIdClaseObra=" + cveIdClaseObra + " ]";
    }
    
}
