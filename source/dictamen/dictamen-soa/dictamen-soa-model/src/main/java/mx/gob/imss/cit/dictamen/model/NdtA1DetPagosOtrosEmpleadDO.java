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
@Table(name = "NDT_A1_DET_PAGOS_OTROS_EMPLEAD")
@NamedQueries({
    @NamedQuery(name = "NdtA1DetPagosOtrosEmplead.findAll", query = "SELECT n FROM NdtA1DetPagosOtrosEmpleadDO n"),
    @NamedQuery(name = "NdtA1DetPagosOtrosEmplead.findByCveIdA1DetPagosOtrosEmpl", query = "SELECT n FROM NdtA1DetPagosOtrosEmpleadDO n WHERE n.cveIdA1DetPagosOtrosEmpl = :cveIdA1DetPagosOtrosEmpl"),
    @NamedQuery(name = "NdtA1DetPagosOtrosEmplead.findByDesConcepto", query = "SELECT n FROM NdtA1DetPagosOtrosEmpleadDO n WHERE n.desConcepto = :desConcepto"),
    @NamedQuery(name = "NdtA1DetPagosOtrosEmplead.findByImpConcepto", query = "SELECT n FROM NdtA1DetPagosOtrosEmpleadDO n WHERE n.impConcepto = :impConcepto"),
    @NamedQuery(name = "NdtA1DetPagosOtrosEmplead.findByIndTipoRemuneracionFija", query = "SELECT n FROM NdtA1DetPagosOtrosEmpleadDO n WHERE n.indTipoRemuneracionFija = :indTipoRemuneracionFija"),
    @NamedQuery(name = "NdtA1DetPagosOtrosEmplead.findByIndIntegradoSbc", query = "SELECT n FROM NdtA1DetPagosOtrosEmpleadDO n WHERE n.indIntegradoSbc = :indIntegradoSbc"),
    @NamedQuery(name = "NdtA1DetPagosOtrosEmplead.findByCveIdA1Perceptrab", query = "SELECT n FROM NdtA1DetPagosOtrosEmpleadDO n WHERE n.cveIdA1Perceptrab = :cveIdA1Perceptrab")})
public class NdtA1DetPagosOtrosEmpleadDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_A1_DET_PAGOS_OTROS_EMPL", nullable = false, precision = 22, scale = 0)
    private Long cveIdA1DetPagosOtrosEmpl;
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

    public NdtA1DetPagosOtrosEmpleadDO() {
    }

    public NdtA1DetPagosOtrosEmpleadDO(Long cveIdA1DetPagosOtrosEmpl) {
        this.cveIdA1DetPagosOtrosEmpl = cveIdA1DetPagosOtrosEmpl;
    }

    public Long getCveIdA1DetPagosOtrosEmpl() {
        return cveIdA1DetPagosOtrosEmpl;
    }

    public void setCveIdA1DetPagosOtrosEmpl(Long cveIdA1DetPagosOtrosEmpl) {
        this.cveIdA1DetPagosOtrosEmpl = cveIdA1DetPagosOtrosEmpl;
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
        hash += (cveIdA1DetPagosOtrosEmpl != null ? cveIdA1DetPagosOtrosEmpl.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtA1DetPagosOtrosEmpleadDO)) {
            return false;
        }
        NdtA1DetPagosOtrosEmpleadDO other = (NdtA1DetPagosOtrosEmpleadDO) object;
        if ((this.cveIdA1DetPagosOtrosEmpl == null && other.cveIdA1DetPagosOtrosEmpl != null) || (this.cveIdA1DetPagosOtrosEmpl != null && !this.cveIdA1DetPagosOtrosEmpl.equals(other.cveIdA1DetPagosOtrosEmpl))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtA1DetPagosOtrosEmplead[ cveIdA1DetPagosOtrosEmpl=" + cveIdA1DetPagosOtrosEmpl + " ]";
    }
    
}
