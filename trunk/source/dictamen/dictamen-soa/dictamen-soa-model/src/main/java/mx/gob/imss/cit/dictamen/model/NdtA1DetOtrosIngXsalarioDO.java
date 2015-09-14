/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;

import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "NDT_A1_DET_OTROS_ING_XSALARIO")
@NamedQueries({
    @NamedQuery(name = "NdtA1DetOtrosIngXsalario.findAll", query = "SELECT n FROM NdtA1DetOtrosIngXsalarioDO n"),
    @NamedQuery(name = "NdtA1DetOtrosIngXsalario.findByCveIdA1DetOtrosIngXsal", query = "SELECT n FROM NdtA1DetOtrosIngXsalarioDO n WHERE n.cveIdA1DetOtrosIngXsal = :cveIdA1DetOtrosIngXsal"),
    @NamedQuery(name = "NdtA1DetOtrosIngXsalario.findByDesConcepto", query = "SELECT n FROM NdtA1DetOtrosIngXsalarioDO n WHERE n.desConcepto = :desConcepto"),
    @NamedQuery(name = "NdtA1DetOtrosIngXsalario.findByImpConcepto", query = "SELECT n FROM NdtA1DetOtrosIngXsalarioDO n WHERE n.impConcepto = :impConcepto"),
    @NamedQuery(name = "NdtA1DetOtrosIngXsalario.findByIndTipoRemuneracionFija", query = "SELECT n FROM NdtA1DetOtrosIngXsalarioDO n WHERE n.indTipoRemuneracionFija = :indTipoRemuneracionFija"),
    @NamedQuery(name = "NdtA1DetOtrosIngXsalario.findByIndIntegradoSbc", query = "SELECT n FROM NdtA1DetOtrosIngXsalarioDO n WHERE n.indIntegradoSbc = :indIntegradoSbc"),
    @NamedQuery(name = "NdtA1DetOtrosIngXsalario.findByCveIdA1Perceptrab", query = "SELECT n FROM NdtA1DetOtrosIngXsalarioDO n WHERE n.cveIdA1Perceptrab = :cveIdA1Perceptrab")})
public class NdtA1DetOtrosIngXsalarioDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_A1_DET_OTROS_ING_XSAL", nullable = false, precision = 22, scale = 0)
    private Long cveIdA1DetOtrosIngXsal;
    @Size(max = 50)
    @Column(name = "DES_CONCEPTO", length = 50)
    private String desConcepto;
    @Column(name = "IMP_CONCEPTO", precision = 14, scale = 2)
    private Long impConcepto;
    @Column(name = "IND_TIPO_REMUNERACION_FIJA")
    private Short indTipoRemuneracionFija;
    @Column(name = "IND_INTEGRADO_SBC")
    private Short indIntegradoSbc;
    @Column(name = "CVE_ID_A1_PERCEPTRAB")
    private BigInteger cveIdA1Perceptrab;

    public NdtA1DetOtrosIngXsalarioDO() {
    }

    public NdtA1DetOtrosIngXsalarioDO(Long cveIdA1DetOtrosIngXsal) {
        this.cveIdA1DetOtrosIngXsal = cveIdA1DetOtrosIngXsal;
    }

    public Long getCveIdA1DetOtrosIngXsal() {
        return cveIdA1DetOtrosIngXsal;
    }

    public void setCveIdA1DetOtrosIngXsal(Long cveIdA1DetOtrosIngXsal) {
        this.cveIdA1DetOtrosIngXsal = cveIdA1DetOtrosIngXsal;
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

    public Short getIndTipoRemuneracionFija() {
        return indTipoRemuneracionFija;
    }

    public void setIndTipoRemuneracionFija(Short indTipoRemuneracionFija) {
        this.indTipoRemuneracionFija = indTipoRemuneracionFija;
    }

    public Short getIndIntegradoSbc() {
        return indIntegradoSbc;
    }

    public void setIndIntegradoSbc(Short indIntegradoSbc) {
        this.indIntegradoSbc = indIntegradoSbc;
    }

    public BigInteger getCveIdA1Perceptrab() {
        return cveIdA1Perceptrab;
    }

    public void setCveIdA1Perceptrab(BigInteger cveIdA1Perceptrab) {
        this.cveIdA1Perceptrab = cveIdA1Perceptrab;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdA1DetOtrosIngXsal != null ? cveIdA1DetOtrosIngXsal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtA1DetOtrosIngXsalarioDO)) {
            return false;
        }
        NdtA1DetOtrosIngXsalarioDO other = (NdtA1DetOtrosIngXsalarioDO) object;
        if ((this.cveIdA1DetOtrosIngXsal == null && other.cveIdA1DetOtrosIngXsal != null) || (this.cveIdA1DetOtrosIngXsal != null && !this.cveIdA1DetOtrosIngXsal.equals(other.cveIdA1DetOtrosIngXsal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtA1DetOtrosIngXsalario[ cveIdA1DetOtrosIngXsal=" + cveIdA1DetOtrosIngXsal + " ]";
    }
    
}
