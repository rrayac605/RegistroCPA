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
@Table(name = "NDC_TIPO_MODELO_OPINION")
@NamedQueries({
    @NamedQuery(name = "NdcTipoModeloOpinion.findAll", query = "SELECT n FROM NdcTipoModeloOpinionDO n"),
    @NamedQuery(name = "NdcTipoModeloOpinion.findByCveIdTipoModelo", query = "SELECT n FROM NdcTipoModeloOpinionDO n WHERE n.cveIdTipoModelo = :cveIdTipoModelo"),
    @NamedQuery(name = "NdcTipoModeloOpinion.findByDesModeloOpinion", query = "SELECT n FROM NdcTipoModeloOpinionDO n WHERE n.desModeloOpinion = :desModeloOpinion"),
    @NamedQuery(name = "NdcTipoModeloOpinion.findByFecRegistroAlta", query = "SELECT n FROM NdcTipoModeloOpinionDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdcTipoModeloOpinion.findByFecRegistroBaja", query = "SELECT n FROM NdcTipoModeloOpinionDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdcTipoModeloOpinion.findByFecRegistroActualizado", query = "SELECT n FROM NdcTipoModeloOpinionDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdcTipoModeloOpinionDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_TIPO_MODELO", nullable = false, precision = 22, scale = 0)
    private Long cveIdTipoModelo;
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
    @OneToMany(mappedBy = "cveIdTipoModelo", fetch = FetchType.LAZY)
    private List<NdtModeloOpinionDO> ndtModeloOpinionList;

    public NdcTipoModeloOpinionDO() {
    }

    public NdcTipoModeloOpinionDO(Long cveIdTipoModelo) {
        this.cveIdTipoModelo = cveIdTipoModelo;
    }

    public Long getCveIdTipoModelo() {
        return cveIdTipoModelo;
    }

    public void setCveIdTipoModelo(Long cveIdTipoModelo) {
        this.cveIdTipoModelo = cveIdTipoModelo;
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

    public List<NdtModeloOpinionDO> getNdtModeloOpinionList() {
        return ndtModeloOpinionList;
    }

    public void setNdtModeloOpinionList(List<NdtModeloOpinionDO> ndtModeloOpinionList) {
        this.ndtModeloOpinionList = ndtModeloOpinionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdTipoModelo != null ? cveIdTipoModelo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdcTipoModeloOpinionDO)) {
            return false;
        }
        NdcTipoModeloOpinionDO other = (NdcTipoModeloOpinionDO) object;
        if ((this.cveIdTipoModelo == null && other.cveIdTipoModelo != null) || (this.cveIdTipoModelo != null && !this.cveIdTipoModelo.equals(other.cveIdTipoModelo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdcTipoModeloOpinion[ cveIdTipoModelo=" + cveIdTipoModelo + " ]";
    }
    
}
