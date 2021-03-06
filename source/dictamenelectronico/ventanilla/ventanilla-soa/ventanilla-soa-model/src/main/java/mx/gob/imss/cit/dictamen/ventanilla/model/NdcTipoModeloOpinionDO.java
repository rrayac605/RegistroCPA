/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.ventanilla.model;

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
@Table(name = "NDC_TIPO_MODELO_OPINION")
@NamedQueries({
    @NamedQuery(name = "NdcTipoModeloOpinionDO.findAll", query = "SELECT n FROM NdcTipoModeloOpinionDO n"),
    @NamedQuery(name = "NdcTipoModeloOpinionDO.findByCveIdTipoOpinion", query = "SELECT n FROM NdcTipoModeloOpinionDO n WHERE n.cveIdTipoOpinion = :cveIdTipoOpinion"),
    @NamedQuery(name = "NdcTipoModeloOpinionDO.findByDesModeloOpinion", query = "SELECT n FROM NdcTipoModeloOpinionDO n WHERE n.desModeloOpinion = :desModeloOpinion"),
    @NamedQuery(name = "NdcTipoModeloOpinionDO.findByFecRegistroAlta", query = "SELECT n FROM NdcTipoModeloOpinionDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdcTipoModeloOpinionDO.findByFecRegistroBaja", query = "SELECT n FROM NdcTipoModeloOpinionDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdcTipoModeloOpinionDO.findByFecRegistroActualizado", query = "SELECT n FROM NdcTipoModeloOpinionDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdcTipoModeloOpinionDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_TIPO_OPINION", nullable = false, precision = 22, scale = 0)
    private Long cveIdTipoOpinion;
    @Size(max = 50)
    @Column(name = "DES_MODELO_OPINION", length = 50)
    private String desModeloOpinion;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @OneToMany(mappedBy = "cveIdTipoOpinion", fetch = FetchType.LAZY)
    private List<NdtModeloOpinionDO> ndtModeloOpinionDOList;

    public NdcTipoModeloOpinionDO() {
    }

    public NdcTipoModeloOpinionDO(Long cveIdTipoOpinion) {
        this.cveIdTipoOpinion = cveIdTipoOpinion;
    }

    public Long getCveIdTipoOpinion() {
        return cveIdTipoOpinion;
    }

    public void setCveIdTipoOpinion(Long cveIdTipoOpinion) {
        this.cveIdTipoOpinion = cveIdTipoOpinion;
    }

    public String getDesModeloOpinion() {
        return desModeloOpinion;
    }

    public void setDesModeloOpinion(String desModeloOpinion) {
        this.desModeloOpinion = desModeloOpinion;
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

    public List<NdtModeloOpinionDO> getNdtModeloOpinionDOList() {
        return ndtModeloOpinionDOList;
    }

    public void setNdtModeloOpinionDOList(List<NdtModeloOpinionDO> ndtModeloOpinionDOList) {
        this.ndtModeloOpinionDOList = ndtModeloOpinionDOList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdTipoOpinion != null ? cveIdTipoOpinion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdcTipoModeloOpinionDO)) {
            return false;
        }
        NdcTipoModeloOpinionDO other = (NdcTipoModeloOpinionDO) object;
        if ((this.cveIdTipoOpinion == null && other.cveIdTipoOpinion != null) || (this.cveIdTipoOpinion != null && !this.cveIdTipoOpinion.equals(other.cveIdTipoOpinion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdcTipoModeloOpinionDO[ cveIdTipoOpinion=" + cveIdTipoOpinion + " ]";
    }
    
}
