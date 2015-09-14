/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author ajfuentes
 */
@Entity
@Table(name = "NDT_MODELO_OPINION")
@NamedQueries({
    @NamedQuery(name = "NdtModeloOpinion.findAll", query = "SELECT n FROM NdtModeloOpinionDO n"),
    @NamedQuery(name = "NdtModeloOpinion.findByCveIdModeloOpinion", query = "SELECT n FROM NdtModeloOpinionDO n WHERE n.cveIdModeloOpinion = :cveIdModeloOpinion")})
public class NdtModeloOpinionDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_MODELO_OPINION", nullable = false, precision = 22, scale = 0)
    private Long cveIdModeloOpinion;
    @JoinColumn(name = "CVE_ID_PATRON_DICTAMEN", referencedColumnName = "CVE_ID_PATRON_DICTAMEN")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtPatronDictamenDO cveIdPatronDictamen;
    @JoinColumn(name = "CVE_ID_TIPO_MODELO", referencedColumnName = "CVE_ID_TIPO_MODELO")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcTipoModeloOpinionDO cveIdTipoModelo;

    public NdtModeloOpinionDO() {
    }

    public NdtModeloOpinionDO(Long cveIdModeloOpinion) {
        this.cveIdModeloOpinion = cveIdModeloOpinion;
    }

    public Long getCveIdModeloOpinion() {
        return cveIdModeloOpinion;
    }

    public void setCveIdModeloOpinion(Long cveIdModeloOpinion) {
        this.cveIdModeloOpinion = cveIdModeloOpinion;
    }

    public NdtPatronDictamenDO getCveIdPatronDictamen() {
        return cveIdPatronDictamen;
    }

    public void setCveIdPatronDictamen(NdtPatronDictamenDO cveIdPatronDictamen) {
        this.cveIdPatronDictamen = cveIdPatronDictamen;
    }

    public NdcTipoModeloOpinionDO getCveIdTipoModelo() {
        return cveIdTipoModelo;
    }

    public void setCveIdTipoModelo(NdcTipoModeloOpinionDO cveIdTipoModelo) {
        this.cveIdTipoModelo = cveIdTipoModelo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdModeloOpinion != null ? cveIdModeloOpinion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtModeloOpinionDO)) {
            return false;
        }
        NdtModeloOpinionDO other = (NdtModeloOpinionDO) object;
        if ((this.cveIdModeloOpinion == null && other.cveIdModeloOpinion != null) || (this.cveIdModeloOpinion != null && !this.cveIdModeloOpinion.equals(other.cveIdModeloOpinion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtModeloOpinion[ cveIdModeloOpinion=" + cveIdModeloOpinion + " ]";
    }
    
}
