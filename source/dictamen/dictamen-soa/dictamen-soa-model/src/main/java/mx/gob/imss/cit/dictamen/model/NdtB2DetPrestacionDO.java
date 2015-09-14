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
@Table(name = "NDT_B2_DET_PRESTACION")
@NamedQueries({
    @NamedQuery(name = "NdtB2DetPrestacion.findAll", query = "SELECT n FROM NdtB2DetPrestacionDO n"),
    @NamedQuery(name = "NdtB2DetPrestacion.findByCveIdA1DetPrestacion", query = "SELECT n FROM NdtB2DetPrestacionDO n WHERE n.cveIdA1DetPrestacion = :cveIdA1DetPrestacion"),
    @NamedQuery(name = "NdtB2DetPrestacion.findByDesConcepto", query = "SELECT n FROM NdtB2DetPrestacionDO n WHERE n.desConcepto = :desConcepto"),
    @NamedQuery(name = "NdtB2DetPrestacion.findByImpConcepto", query = "SELECT n FROM NdtB2DetPrestacionDO n WHERE n.impConcepto = :impConcepto")})
public class NdtB2DetPrestacionDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_A1_DET_PRESTACION", nullable = false, precision = 22, scale = 0)
    private Long cveIdA1DetPrestacion;
    @Size(max = 100)
    @Column(name = "DES_CONCEPTO", length = 100)
    private String desConcepto;
    @Column(name = "IMP_CONCEPTO", precision = 14, scale = 2)
    private Long impConcepto;
    @JoinColumn(name = "CVE_ID_B1_RESPUESTA_ATESTIGUAM", referencedColumnName = "CVE_ID_B1_RESPUESTA_ATESTIGUAM")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtB1RespuestaAtestiguamienDO cveIdB1RespuestaAtestiguam;

    public NdtB2DetPrestacionDO() {
    }

    public NdtB2DetPrestacionDO(Long cveIdA1DetPrestacion) {
        this.cveIdA1DetPrestacion = cveIdA1DetPrestacion;
    }

    public Long getCveIdA1DetPrestacion() {
        return cveIdA1DetPrestacion;
    }

    public void setCveIdA1DetPrestacion(Long cveIdA1DetPrestacion) {
        this.cveIdA1DetPrestacion = cveIdA1DetPrestacion;
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
        hash += (cveIdA1DetPrestacion != null ? cveIdA1DetPrestacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtB2DetPrestacionDO)) {
            return false;
        }
        NdtB2DetPrestacionDO other = (NdtB2DetPrestacionDO) object;
        if ((this.cveIdA1DetPrestacion == null && other.cveIdA1DetPrestacion != null) || (this.cveIdA1DetPrestacion != null && !this.cveIdA1DetPrestacion.equals(other.cveIdA1DetPrestacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtB2DetPrestacion[ cveIdA1DetPrestacion=" + cveIdA1DetPrestacion + " ]";
    }
    
}
