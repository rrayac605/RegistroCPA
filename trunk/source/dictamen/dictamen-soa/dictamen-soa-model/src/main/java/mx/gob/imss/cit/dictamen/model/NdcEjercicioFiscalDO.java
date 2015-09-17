/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "NDC_EJERCICIO_FISCAL")
@NamedQueries({
    @NamedQuery(name = "NdcEjercicioFiscalDO.findAll", query = "SELECT n FROM NdcEjercicioFiscalDO n"),
    @NamedQuery(name = "NdcEjercicioFiscalDO.findByCveIdEjerFiscal", query = "SELECT n FROM NdcEjercicioFiscalDO n WHERE n.cveIdEjerFiscal = :cveIdEjerFiscal"),
    @NamedQuery(name = "NdcEjercicioFiscalDO.findByDesEjerFiscal", query = "SELECT n FROM NdcEjercicioFiscalDO n WHERE n.desEjerFiscal = :desEjerFiscal"),
    @NamedQuery(name = "NdcEjercicioFiscalDO.findByFecRegistroAlta", query = "SELECT n FROM NdcEjercicioFiscalDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdcEjercicioFiscalDO.findByFecRegistroBaja", query = "SELECT n FROM NdcEjercicioFiscalDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdcEjercicioFiscalDO.findByFecRegistroActualizado", query = "SELECT n FROM NdcEjercicioFiscalDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdcEjercicioFiscalDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_EJER_FISCAL", nullable = false, precision = 22, scale = 0)
    private BigDecimal cveIdEjerFiscal;
    @Size(max = 20)
    @Column(name = "DES_EJER_FISCAL", length = 20)
    private String desEjerFiscal;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @OneToMany(mappedBy = "cveIdEjerFiscal", fetch = FetchType.LAZY)
    private List<NdtPatronDictamenDO> ndtPatronDictamenDOList;

    public NdcEjercicioFiscalDO() {
    }

    public NdcEjercicioFiscalDO(BigDecimal cveIdEjerFiscal) {
        this.cveIdEjerFiscal = cveIdEjerFiscal;
    }

    public BigDecimal getCveIdEjerFiscal() {
        return cveIdEjerFiscal;
    }

    public void setCveIdEjerFiscal(BigDecimal cveIdEjerFiscal) {
        this.cveIdEjerFiscal = cveIdEjerFiscal;
    }

    public String getDesEjerFiscal() {
        return desEjerFiscal;
    }

    public void setDesEjerFiscal(String desEjerFiscal) {
        this.desEjerFiscal = desEjerFiscal;
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

    public List<NdtPatronDictamenDO> getNdtPatronDictamenDOList() {
        return ndtPatronDictamenDOList;
    }

    public void setNdtPatronDictamenDOList(List<NdtPatronDictamenDO> ndtPatronDictamenDOList) {
        this.ndtPatronDictamenDOList = ndtPatronDictamenDOList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdEjerFiscal != null ? cveIdEjerFiscal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdcEjercicioFiscalDO)) {
            return false;
        }
        NdcEjercicioFiscalDO other = (NdcEjercicioFiscalDO) object;
        if ((this.cveIdEjerFiscal == null && other.cveIdEjerFiscal != null) || (this.cveIdEjerFiscal != null && !this.cveIdEjerFiscal.equals(other.cveIdEjerFiscal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdcEjercicioFiscalDO[ cveIdEjerFiscal=" + cveIdEjerFiscal + " ]";
    }
    
}
