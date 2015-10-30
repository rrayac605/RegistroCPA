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
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "NDT_B1_CEDULA_REMUNERACIONES")
@NamedQueries({
    @NamedQuery(name = "NdtB1CedulaRemuneracionesDO.findAll", query = "SELECT n FROM NdtB1CedulaRemuneracionesDO n"),
    @NamedQuery(name = "NdtB1CedulaRemuneracionesDO.findByCveIdB1CedRemunera", query = "SELECT n FROM NdtB1CedulaRemuneracionesDO n WHERE n.cveIdB1CedRemunera = :cveIdB1CedRemunera"),
    @NamedQuery(name = "NdtB1CedulaRemuneracionesDO.findByIndFijoVariable", query = "SELECT n FROM NdtB1CedulaRemuneracionesDO n WHERE n.indFijoVariable = :indFijoVariable"),
    @NamedQuery(name = "NdtB1CedulaRemuneracionesDO.findByIndIntegraSbc", query = "SELECT n FROM NdtB1CedulaRemuneracionesDO n WHERE n.indIntegraSbc = :indIntegraSbc"),
    @NamedQuery(name = "NdtB1CedulaRemuneracionesDO.findByImpImportePagado", query = "SELECT n FROM NdtB1CedulaRemuneracionesDO n WHERE n.impImportePagado = :impImportePagado"),
    @NamedQuery(name = "NdtB1CedulaRemuneracionesDO.findByPorFahorroApopat", query = "SELECT n FROM NdtB1CedulaRemuneracionesDO n WHERE n.porFahorroApopat = :porFahorroApopat"),
    @NamedQuery(name = "NdtB1CedulaRemuneracionesDO.findByPorFahorroApoobr", query = "SELECT n FROM NdtB1CedulaRemuneracionesDO n WHERE n.porFahorroApoobr = :porFahorroApoobr"),
    @NamedQuery(name = "NdtB1CedulaRemuneracionesDO.findByFecRegistroAlta", query = "SELECT n FROM NdtB1CedulaRemuneracionesDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtB1CedulaRemuneracionesDO.findByFecRegistroBaja", query = "SELECT n FROM NdtB1CedulaRemuneracionesDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtB1CedulaRemuneracionesDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtB1CedulaRemuneracionesDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado"),
    @NamedQuery(name = "NdtB1CedulaRemuneracionesDO.findByCveIdUsuario", query = "SELECT n FROM NdtB1CedulaRemuneracionesDO n WHERE n.cveIdUsuario = :cveIdUsuario")})
public class NdtB1CedulaRemuneracionesDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_B1_CED_REMUNERA", nullable = false, precision = 22, scale = 0)
    @SequenceGenerator(name = "NdtB1CedulaRemuneraciones_Id_Seq_Gen", sequenceName = "SEQ_NDTB1CEDULAREMUNERACIONES", allocationSize=1)
    @GeneratedValue(generator = "NdtB1CedulaRemuneraciones_Id_Seq_Gen")
    private Long cveIdB1CedRemunera;
    @Column(name = "IND_FIJO_VARIABLE")
    private Short indFijoVariable;
    @Column(name = "IND_INTEGRA_SBC")
    private Short indIntegraSbc;
    @Column(name = "IMP_IMPORTE_PAGADO", precision = 15, scale = 2)
    private Long impImportePagado;
    @Column(name = "POR_FAHORRO_APOPAT")
    private Integer porFahorroApopat;
    @Column(name = "POR_FAHORRO_APOOBR")
    private Integer porFahorroApoobr;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @Size(max = 20)
    @Column(name = "CVE_ID_USUARIO", length = 20)
    private String cveIdUsuario;
    @OneToMany(mappedBy = "cveIdB1CedRemunera", fetch = FetchType.LAZY)
    private List<NdtB1DetPagosOtrosEmpleadDO> ndtB1DetPagosOtrosEmpleadDOList;
    @OneToMany(mappedBy = "cveIdB1CedRemunera", fetch = FetchType.LAZY)
    private List<NdtB1DetFondoAhorroDO> ndtB1DetFondoAhorroDOList;
    @JoinColumn(name = "CVE_ID_PATRON_DICTAMEN", referencedColumnName = "CVE_ID_PATRON_DICTAMEN")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtPatronDictamenDO cveIdPatronDictamen;
    @JoinColumn(name = "CVE_ID_REMUNERACIONES", referencedColumnName = "CVE_ID_REMUNERACIONES")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcRemuneracionesDO cveIdRemuneraciones;
    @JoinColumn(name = "CVE_ID_ESTADO_ATESTIGUAMIENTO", referencedColumnName = "CVE_ID_ESTADO_ATESTIGUAMIENTO")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcEstadoAtestiguamientoDO cveIdEstadoAtestiguamiento;
    @JoinColumn(name = "CVE_ID_ATESTIGUAMIENTO", referencedColumnName = "CVE_ID_ATESTIGUAMIENTO")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdcAtestiguamientoDO cveIdAtestiguamiento;
    @OneToMany(mappedBy = "cveIdB1CedRemunera", fetch = FetchType.LAZY)
    private List<NdtB1DetOtrosIngXsalarioDO> ndtB1DetOtrosIngXsalarioDOList;
    @OneToMany(mappedBy = "cveIdB1CedRemunera", fetch = FetchType.LAZY)
    private List<NdtB1DetOtrosPagXseparacDO> ndtB1DetOtrosPagXseparacDOList;

    public NdtB1CedulaRemuneracionesDO() {
    }

    public NdtB1CedulaRemuneracionesDO(Long cveIdB1CedRemunera) {
        this.cveIdB1CedRemunera = cveIdB1CedRemunera;
    }

    public Long getCveIdB1CedRemunera() {
        return cveIdB1CedRemunera;
    }

    public void setCveIdB1CedRemunera(Long cveIdB1CedRemunera) {
        this.cveIdB1CedRemunera = cveIdB1CedRemunera;
    }

    public Short getIndFijoVariable() {
        return indFijoVariable;
    }

    public void setIndFijoVariable(Short indFijoVariable) {
        this.indFijoVariable = indFijoVariable;
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

    public Integer getPorFahorroApopat() {
        return porFahorroApopat;
    }

    public void setPorFahorroApopat(Integer porFahorroApopat) {
        this.porFahorroApopat = porFahorroApopat;
    }

    public Integer getPorFahorroApoobr() {
        return porFahorroApoobr;
    }

    public void setPorFahorroApoobr(Integer porFahorroApoobr) {
        this.porFahorroApoobr = porFahorroApoobr;
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

    public String getCveIdUsuario() {
        return cveIdUsuario;
    }

    public void setCveIdUsuario(String cveIdUsuario) {
        this.cveIdUsuario = cveIdUsuario;
    }

    public List<NdtB1DetPagosOtrosEmpleadDO> getNdtB1DetPagosOtrosEmpleadDOList() {
        return ndtB1DetPagosOtrosEmpleadDOList;
    }

    public void setNdtB1DetPagosOtrosEmpleadDOList(List<NdtB1DetPagosOtrosEmpleadDO> ndtB1DetPagosOtrosEmpleadDOList) {
        this.ndtB1DetPagosOtrosEmpleadDOList = ndtB1DetPagosOtrosEmpleadDOList;
    }

    public List<NdtB1DetFondoAhorroDO> getNdtB1DetFondoAhorroDOList() {
        return ndtB1DetFondoAhorroDOList;
    }

    public void setNdtB1DetFondoAhorroDOList(List<NdtB1DetFondoAhorroDO> ndtB1DetFondoAhorroDOList) {
        this.ndtB1DetFondoAhorroDOList = ndtB1DetFondoAhorroDOList;
    }

    public NdtPatronDictamenDO getCveIdPatronDictamen() {
        return cveIdPatronDictamen;
    }

    public void setCveIdPatronDictamen(NdtPatronDictamenDO cveIdPatronDictamen) {
        this.cveIdPatronDictamen = cveIdPatronDictamen;
    }

    public NdcRemuneracionesDO getCveIdRemuneraciones() {
        return cveIdRemuneraciones;
    }

    public void setCveIdRemuneraciones(NdcRemuneracionesDO cveIdRemuneraciones) {
        this.cveIdRemuneraciones = cveIdRemuneraciones;
    }

    public NdcEstadoAtestiguamientoDO getCveIdEstadoAtestiguamiento() {
        return cveIdEstadoAtestiguamiento;
    }

    public void setCveIdEstadoAtestiguamiento(NdcEstadoAtestiguamientoDO cveIdEstadoAtestiguamiento) {
        this.cveIdEstadoAtestiguamiento = cveIdEstadoAtestiguamiento;
    }

    public NdcAtestiguamientoDO getCveIdAtestiguamiento() {
        return cveIdAtestiguamiento;
    }

    public void setCveIdAtestiguamiento(NdcAtestiguamientoDO cveIdAtestiguamiento) {
        this.cveIdAtestiguamiento = cveIdAtestiguamiento;
    }

    public List<NdtB1DetOtrosIngXsalarioDO> getNdtB1DetOtrosIngXsalarioDOList() {
        return ndtB1DetOtrosIngXsalarioDOList;
    }

    public void setNdtB1DetOtrosIngXsalarioDOList(List<NdtB1DetOtrosIngXsalarioDO> ndtB1DetOtrosIngXsalarioDOList) {
        this.ndtB1DetOtrosIngXsalarioDOList = ndtB1DetOtrosIngXsalarioDOList;
    }

    public List<NdtB1DetOtrosPagXseparacDO> getNdtB1DetOtrosPagXseparacDOList() {
        return ndtB1DetOtrosPagXseparacDOList;
    }

    public void setNdtB1DetOtrosPagXseparacDOList(List<NdtB1DetOtrosPagXseparacDO> ndtB1DetOtrosPagXseparacDOList) {
        this.ndtB1DetOtrosPagXseparacDOList = ndtB1DetOtrosPagXseparacDOList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdB1CedRemunera != null ? cveIdB1CedRemunera.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtB1CedulaRemuneracionesDO)) {
            return false;
        }
        NdtB1CedulaRemuneracionesDO other = (NdtB1CedulaRemuneracionesDO) object;
        if ((this.cveIdB1CedRemunera == null && other.cveIdB1CedRemunera != null) || (this.cveIdB1CedRemunera != null && !this.cveIdB1CedRemunera.equals(other.cveIdB1CedRemunera))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtB1CedulaRemuneracionesDO[ cveIdB1CedRemunera=" + cveIdB1CedRemunera + " ]";
    }
    
}
