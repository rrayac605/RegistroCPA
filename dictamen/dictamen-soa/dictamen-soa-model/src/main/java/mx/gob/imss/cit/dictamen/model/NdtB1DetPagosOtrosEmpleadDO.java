/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
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
@Table(name = "NDT_B1_DET_PAGOS_OTROS_EMPLEAD")
@NamedQueries({
    @NamedQuery(name = "NdtB1DetPagosOtrosEmpleadDO.findAll", query = "SELECT n FROM NdtB1DetPagosOtrosEmpleadDO n"),
    @NamedQuery(name = "NdtB1DetPagosOtrosEmpleadDO.findByCveIdA1DetPagosOtrosEmpl", query = "SELECT n FROM NdtB1DetPagosOtrosEmpleadDO n WHERE n.cveIdA1DetPagosOtrosEmpl = :cveIdA1DetPagosOtrosEmpl"),
    @NamedQuery(name = "NdtB1DetPagosOtrosEmpleadDO.findByDesConcepto", query = "SELECT n FROM NdtB1DetPagosOtrosEmpleadDO n WHERE n.desConcepto = :desConcepto"),
    @NamedQuery(name = "NdtB1DetPagosOtrosEmpleadDO.findByIndFijaVariable", query = "SELECT n FROM NdtB1DetPagosOtrosEmpleadDO n WHERE n.indFijaVariable = :indFijaVariable"),
    @NamedQuery(name = "NdtB1DetPagosOtrosEmpleadDO.findByIndIntegraSbc", query = "SELECT n FROM NdtB1DetPagosOtrosEmpleadDO n WHERE n.indIntegraSbc = :indIntegraSbc"),
    @NamedQuery(name = "NdtB1DetPagosOtrosEmpleadDO.findByImpImportePagado", query = "SELECT n FROM NdtB1DetPagosOtrosEmpleadDO n WHERE n.impImportePagado = :impImportePagado"),
    @NamedQuery(name = "NdtB1DetPagosOtrosEmpleadDO.findByFecRegistroAlta", query = "SELECT n FROM NdtB1DetPagosOtrosEmpleadDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtB1DetPagosOtrosEmpleadDO.findByFecRegistroBaja", query = "SELECT n FROM NdtB1DetPagosOtrosEmpleadDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtB1DetPagosOtrosEmpleadDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtB1DetPagosOtrosEmpleadDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdtB1DetPagosOtrosEmpleadDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_A1_DET_PAGOS_OTROS_EMPL", nullable = false, precision = 22, scale = 0)
    @SequenceGenerator(name = "NdtB1DetPagosOtrosEmplead_Id_Seq_Gen", sequenceName = "SEQ_NDTB1DETPAGOSOTROSEMPLEAD", allocationSize=1)
    @GeneratedValue(generator = "NdtB1DetPagosOtrosEmplead_Id_Seq_Gen")
    private Long cveIdA1DetPagosOtrosEmpl;
    @Size(max = 50)
    @Column(name = "DES_CONCEPTO", length = 50)
    private String desConcepto;
    @Column(name = "IND_FIJA_VARIABLE")
    private Short indFijaVariable;
    @Column(name = "IND_INTEGRA_SBC")
    private Short indIntegraSbc;
    @Column(name = "IMP_IMPORTE_PAGADO", precision = 13, scale = 2)
    private Long impImportePagado;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @JoinColumn(name = "CVE_ID_B1_CED_REMUNERA", referencedColumnName = "CVE_ID_B1_CED_REMUNERA")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtB1CedulaRemuneracionesDO cveIdB1CedRemunera;

    public NdtB1DetPagosOtrosEmpleadDO() {
    }

    public NdtB1DetPagosOtrosEmpleadDO(Long cveIdA1DetPagosOtrosEmpl) {
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

    public Short getIndFijaVariable() {
        return indFijaVariable;
    }

    public void setIndFijaVariable(Short indFijaVariable) {
        this.indFijaVariable = indFijaVariable;
    }

    public Short getIndIntegraSbc() {
        return indIntegraSbc;
    }

    public void setIndIntegraSbc(Short indIntegraSbc) {
        this.indIntegraSbc = indIntegraSbc;
    }

    public Long getImpImportePagado() {
        return impImportePagado;
    }

    public void setImpImportePagado(Long impImportePagado) {
        this.impImportePagado = impImportePagado;
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

    public NdtB1CedulaRemuneracionesDO getCveIdB1CedRemunera() {
        return cveIdB1CedRemunera;
    }

    public void setCveIdB1CedRemunera(NdtB1CedulaRemuneracionesDO cveIdB1CedRemunera) {
        this.cveIdB1CedRemunera = cveIdB1CedRemunera;
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
        if (!(object instanceof NdtB1DetPagosOtrosEmpleadDO)) {
            return false;
        }
        NdtB1DetPagosOtrosEmpleadDO other = (NdtB1DetPagosOtrosEmpleadDO) object;
        if ((this.cveIdA1DetPagosOtrosEmpl == null && other.cveIdA1DetPagosOtrosEmpl != null) || (this.cveIdA1DetPagosOtrosEmpl != null && !this.cveIdA1DetPagosOtrosEmpl.equals(other.cveIdA1DetPagosOtrosEmpl))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtB1DetPagosOtrosEmpleadDO[ cveIdA1DetPagosOtrosEmpl=" + cveIdA1DetPagosOtrosEmpl + " ]";
    }
    
}
