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
import javax.validation.constraints.Size;

/**
 *
 * @author ajfuentes
 */
@Entity
@Table(name = "NDT_B1_DET_OTROS_PAG_XSEPARAC")
@NamedQueries({
    @NamedQuery(name = "NdtB1DetOtrosPagXseparac.findAll", query = "SELECT n FROM NdtB1DetOtrosPagXseparacDO n"),
    @NamedQuery(name = "NdtB1DetOtrosPagXseparac.findByCveIdA1DetOtrosPagXsepar", query = "SELECT n FROM NdtB1DetOtrosPagXseparacDO n WHERE n.cveIdA1DetOtrosPagXsepar = :cveIdA1DetOtrosPagXsepar"),
    @NamedQuery(name = "NdtB1DetOtrosPagXseparac.findByDesConcepto", query = "SELECT n FROM NdtB1DetOtrosPagXseparacDO n WHERE n.desConcepto = :desConcepto"),
    @NamedQuery(name = "NdtB1DetOtrosPagXseparac.findByImpConcepto", query = "SELECT n FROM NdtB1DetOtrosPagXseparacDO n WHERE n.impConcepto = :impConcepto")})
public class NdtB1DetOtrosPagXseparacDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_A1_DET_OTROS_PAG_XSEPAR", nullable = false, precision = 22, scale = 0)
    private Long cveIdA1DetOtrosPagXsepar;
    @Size(max = 50)
    @Column(name = "DES_CONCEPTO", length = 50)
    private String desConcepto;
    @Column(name = "IMP_CONCEPTO", precision = 13, scale = 2)
    private Long impConcepto;
    @JoinColumn(name = "CVE_ID_B1_RESPUESTA_ATESTIGUAM", referencedColumnName = "CVE_ID_B1_RESPUESTA_ATESTIGUAM")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtB1RespuestaAtestiguamienDO cveIdB1RespuestaAtestiguam;

    public NdtB1DetOtrosPagXseparacDO() {
    }

    public NdtB1DetOtrosPagXseparacDO(Long cveIdA1DetOtrosPagXsepar) {
        this.cveIdA1DetOtrosPagXsepar = cveIdA1DetOtrosPagXsepar;
    }

    public Long getCveIdA1DetOtrosPagXsepar() {
        return cveIdA1DetOtrosPagXsepar;
    }

    public void setCveIdA1DetOtrosPagXsepar(Long cveIdA1DetOtrosPagXsepar) {
        this.cveIdA1DetOtrosPagXsepar = cveIdA1DetOtrosPagXsepar;
    }

    public String getDesConcepto() {
        return desConcepto;
    }

    public void setDesConcepto(String desConcepto) {
        this.desConcepto = desConcepto;
    }

    public Long getImpConcepto() {
        return impConcepto;
    }

    public void setImpConcepto(Long impConcepto) {
        this.impConcepto = impConcepto;
    }

    public NdtB1RespuestaAtestiguamienDO getCveIdB1RespuestaAtestiguam() {
        return cveIdB1RespuestaAtestiguam;
    }

    public void setCveIdB1RespuestaAtestiguam(NdtB1RespuestaAtestiguamienDO cveIdB1RespuestaAtestiguam) {
        this.cveIdB1RespuestaAtestiguam = cveIdB1RespuestaAtestiguam;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdA1DetOtrosPagXsepar != null ? cveIdA1DetOtrosPagXsepar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtB1DetOtrosPagXseparacDO)) {
            return false;
        }
        NdtB1DetOtrosPagXseparacDO other = (NdtB1DetOtrosPagXseparacDO) object;
        if ((this.cveIdA1DetOtrosPagXsepar == null && other.cveIdA1DetOtrosPagXsepar != null) || (this.cveIdA1DetOtrosPagXsepar != null && !this.cveIdA1DetOtrosPagXsepar.equals(other.cveIdA1DetOtrosPagXsepar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtB1DetOtrosPagXseparac[ cveIdA1DetOtrosPagXsepar=" + cveIdA1DetOtrosPagXsepar + " ]";
    }
    
}
