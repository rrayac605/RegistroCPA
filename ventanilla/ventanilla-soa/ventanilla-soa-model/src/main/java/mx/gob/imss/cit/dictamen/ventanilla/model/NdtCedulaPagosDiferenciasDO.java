/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.ventanilla.model;

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
@Table(name = "NDT_CEDULA_PAGOS_DIFERENCIAS")
@NamedQueries({
    @NamedQuery(name = "NdtCedulaPagosDiferenciasDO.findAll", query = "SELECT n FROM NdtCedulaPagosDiferenciasDO n"),
    @NamedQuery(name = "NdtCedulaPagosDiferenciasDO.findByCveIdCedulaPagos", query = "SELECT n FROM NdtCedulaPagosDiferenciasDO n WHERE n.cveIdCedulaPagos = :cveIdCedulaPagos"),
    @NamedQuery(name = "NdtCedulaPagosDiferenciasDO.findByRegPatronal", query = "SELECT n FROM NdtCedulaPagosDiferenciasDO n WHERE n.regPatronal = :regPatronal"),
    @NamedQuery(name = "NdtCedulaPagosDiferenciasDO.findByNumCotizantesReportados", query = "SELECT n FROM NdtCedulaPagosDiferenciasDO n WHERE n.numCotizantesReportados = :numCotizantesReportados"),
    @NamedQuery(name = "NdtCedulaPagosDiferenciasDO.findByImpEmCf", query = "SELECT n FROM NdtCedulaPagosDiferenciasDO n WHERE n.impEmCf = :impEmCf"),
    @NamedQuery(name = "NdtCedulaPagosDiferenciasDO.findByImpEmExcedentePat", query = "SELECT n FROM NdtCedulaPagosDiferenciasDO n WHERE n.impEmExcedentePat = :impEmExcedentePat"),
    @NamedQuery(name = "NdtCedulaPagosDiferenciasDO.findByImpEmExcedenteObr", query = "SELECT n FROM NdtCedulaPagosDiferenciasDO n WHERE n.impEmExcedenteObr = :impEmExcedenteObr"),
    @NamedQuery(name = "NdtCedulaPagosDiferenciasDO.findByImpEmPdPat", query = "SELECT n FROM NdtCedulaPagosDiferenciasDO n WHERE n.impEmPdPat = :impEmPdPat"),
    @NamedQuery(name = "NdtCedulaPagosDiferenciasDO.findByImpEmPdObr", query = "SELECT n FROM NdtCedulaPagosDiferenciasDO n WHERE n.impEmPdObr = :impEmPdObr"),
    @NamedQuery(name = "NdtCedulaPagosDiferenciasDO.findByImpEmGmpPat", query = "SELECT n FROM NdtCedulaPagosDiferenciasDO n WHERE n.impEmGmpPat = :impEmGmpPat"),
    @NamedQuery(name = "NdtCedulaPagosDiferenciasDO.findByImpEmGmpObr", query = "SELECT n FROM NdtCedulaPagosDiferenciasDO n WHERE n.impEmGmpObr = :impEmGmpObr"),
    @NamedQuery(name = "NdtCedulaPagosDiferenciasDO.findByImpRiesgoTrabajo", query = "SELECT n FROM NdtCedulaPagosDiferenciasDO n WHERE n.impRiesgoTrabajo = :impRiesgoTrabajo"),
    @NamedQuery(name = "NdtCedulaPagosDiferenciasDO.findByImpGuarderiasPs", query = "SELECT n FROM NdtCedulaPagosDiferenciasDO n WHERE n.impGuarderiasPs = :impGuarderiasPs"),
    @NamedQuery(name = "NdtCedulaPagosDiferenciasDO.findByImpIvPat", query = "SELECT n FROM NdtCedulaPagosDiferenciasDO n WHERE n.impIvPat = :impIvPat"),
    @NamedQuery(name = "NdtCedulaPagosDiferenciasDO.findByImpIvObr", query = "SELECT n FROM NdtCedulaPagosDiferenciasDO n WHERE n.impIvObr = :impIvObr"),
    @NamedQuery(name = "NdtCedulaPagosDiferenciasDO.findByImpSubtotalCop", query = "SELECT n FROM NdtCedulaPagosDiferenciasDO n WHERE n.impSubtotalCop = :impSubtotalCop"),
    @NamedQuery(name = "NdtCedulaPagosDiferenciasDO.findByImpSuertePrincipalCop", query = "SELECT n FROM NdtCedulaPagosDiferenciasDO n WHERE n.impSuertePrincipalCop = :impSuertePrincipalCop"),
    @NamedQuery(name = "NdtCedulaPagosDiferenciasDO.findByImpActualizacionCop", query = "SELECT n FROM NdtCedulaPagosDiferenciasDO n WHERE n.impActualizacionCop = :impActualizacionCop"),
    @NamedQuery(name = "NdtCedulaPagosDiferenciasDO.findByImpRecargosCop", query = "SELECT n FROM NdtCedulaPagosDiferenciasDO n WHERE n.impRecargosCop = :impRecargosCop"),
    @NamedQuery(name = "NdtCedulaPagosDiferenciasDO.findByImpTotalCop", query = "SELECT n FROM NdtCedulaPagosDiferenciasDO n WHERE n.impTotalCop = :impTotalCop"),
    @NamedQuery(name = "NdtCedulaPagosDiferenciasDO.findByImpRetiro", query = "SELECT n FROM NdtCedulaPagosDiferenciasDO n WHERE n.impRetiro = :impRetiro"),
    @NamedQuery(name = "NdtCedulaPagosDiferenciasDO.findByImpCvPat", query = "SELECT n FROM NdtCedulaPagosDiferenciasDO n WHERE n.impCvPat = :impCvPat"),
    @NamedQuery(name = "NdtCedulaPagosDiferenciasDO.findByImpCvObr", query = "SELECT n FROM NdtCedulaPagosDiferenciasDO n WHERE n.impCvObr = :impCvObr"),
    @NamedQuery(name = "NdtCedulaPagosDiferenciasDO.findByImpSubtotalRcv", query = "SELECT n FROM NdtCedulaPagosDiferenciasDO n WHERE n.impSubtotalRcv = :impSubtotalRcv"),
    @NamedQuery(name = "NdtCedulaPagosDiferenciasDO.findByImpSuertePrincipalRcv", query = "SELECT n FROM NdtCedulaPagosDiferenciasDO n WHERE n.impSuertePrincipalRcv = :impSuertePrincipalRcv"),
    @NamedQuery(name = "NdtCedulaPagosDiferenciasDO.findByImpActualizacionRcv", query = "SELECT n FROM NdtCedulaPagosDiferenciasDO n WHERE n.impActualizacionRcv = :impActualizacionRcv"),
    @NamedQuery(name = "NdtCedulaPagosDiferenciasDO.findByImpRecargosRcv", query = "SELECT n FROM NdtCedulaPagosDiferenciasDO n WHERE n.impRecargosRcv = :impRecargosRcv"),
    @NamedQuery(name = "NdtCedulaPagosDiferenciasDO.findByImpTotalRcv", query = "SELECT n FROM NdtCedulaPagosDiferenciasDO n WHERE n.impTotalRcv = :impTotalRcv"),
    @NamedQuery(name = "NdtCedulaPagosDiferenciasDO.findByFecRegistroAlta", query = "SELECT n FROM NdtCedulaPagosDiferenciasDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtCedulaPagosDiferenciasDO.findByFecRegistroBaja", query = "SELECT n FROM NdtCedulaPagosDiferenciasDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtCedulaPagosDiferenciasDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtCedulaPagosDiferenciasDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado"),
    @NamedQuery(name = "NdtCedulaPagosDiferenciasDO.findByCveIdUsuario", query = "SELECT n FROM NdtCedulaPagosDiferenciasDO n WHERE n.cveIdUsuario = :cveIdUsuario")})
public class NdtCedulaPagosDiferenciasDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_CEDULA_PAGOS", nullable = false, precision = 22, scale = 0)
    @SequenceGenerator(name = "NdtCedulaPagosDiferencias_Id_Seq_Gen", sequenceName = "SEQ_NDTCEDULAPAGOSDIFERENCIAS", allocationSize=1)
    @GeneratedValue(generator = "NdtCedulaPagosDiferencias_Id_Seq_Gen")
    private Long cveIdCedulaPagos;
    @Size(max = 11)
    @Column(name = "REG_PATRONAL", length = 11)
    private String regPatronal;
    @Column(name = "NUM_COTIZANTES_REPORTADOS")
    private Integer numCotizantesReportados;
    @Column(name = "IMP_EM_CF", precision = 15, scale = 2)
    private Long impEmCf;
    @Column(name = "IMP_EM_EXCEDENTE_PAT", precision = 15, scale = 2)
    private Long impEmExcedentePat;
    @Column(name = "IMP_EM_EXCEDENTE_OBR", precision = 15, scale = 2)
    private Long impEmExcedenteObr;
    @Column(name = "IMP_EM_PD_PAT", precision = 15, scale = 2)
    private Long impEmPdPat;
    @Column(name = "IMP_EM_PD_OBR", precision = 15, scale = 2)
    private Long impEmPdObr;
    @Column(name = "IMP_EM_GMP_PAT", precision = 15, scale = 2)
    private Long impEmGmpPat;
    @Column(name = "IMP_EM_GMP_OBR", precision = 15, scale = 2)
    private Long impEmGmpObr;
    @Column(name = "IMP_RIESGO_TRABAJO", precision = 15, scale = 2)
    private Long impRiesgoTrabajo;
    @Column(name = "IMP_GUARDERIAS_PS", precision = 15, scale = 2)
    private Long impGuarderiasPs;
    @Column(name = "IMP_IV_PAT", precision = 15, scale = 2)
    private Long impIvPat;
    @Column(name = "IMP_IV_OBR", precision = 15, scale = 2)
    private Long impIvObr;
    @Column(name = "IMP_SUBTOTAL_COP", precision = 15, scale = 2)
    private Long impSubtotalCop;
    @Column(name = "IMP_SUERTE_PRINCIPAL_COP", precision = 15, scale = 2)
    private Long impSuertePrincipalCop;
    @Column(name = "IMP_ACTUALIZACION_COP", precision = 15, scale = 2)
    private Long impActualizacionCop;
    @Column(name = "IMP_RECARGOS_COP", precision = 15, scale = 2)
    private Long impRecargosCop;
    @Column(name = "IMP_TOTAL_COP", precision = 15, scale = 2)
    private Long impTotalCop;
    @Column(name = "IMP_RETIRO", precision = 15, scale = 2)
    private Long impRetiro;
    @Column(name = "IMP_CV_PAT", precision = 15, scale = 2)
    private Long impCvPat;
    @Column(name = "IMP_CV_OBR", precision = 15, scale = 2)
    private Long impCvObr;
    @Column(name = "IMP_SUBTOTAL_RCV", precision = 15, scale = 2)
    private Long impSubtotalRcv;
    @Column(name = "IMP_SUERTE_PRINCIPAL_RCV", precision = 15, scale = 2)
    private Long impSuertePrincipalRcv;
    @Column(name = "IMP_ACTUALIZACION_RCV", precision = 15, scale = 2)
    private Long impActualizacionRcv;
    @Column(name = "IMP_RECARGOS_RCV", precision = 15, scale = 2)
    private Long impRecargosRcv;
    @Column(name = "IMP_TOTAL_RCV", precision = 15, scale = 2)
    private Long impTotalRcv;
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
    @JoinColumn(name = "CVE_ID_PATRON_DICTAMEN", referencedColumnName = "CVE_ID_PATRON_DICTAMEN")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtPatronDictamenDO cveIdPatronDictamen;
    @JoinColumn(name = "CVE_ID_PATRON_ASOCIADO", referencedColumnName = "CVE_ID_PATRON_ASOCIADO")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtPatronAsociadoDO cveIdPatronAsociado;

    public NdtCedulaPagosDiferenciasDO() {
    }

    public NdtCedulaPagosDiferenciasDO(Long cveIdCedulaPagos) {
        this.cveIdCedulaPagos = cveIdCedulaPagos;
    }

    public Long getCveIdCedulaPagos() {
        return cveIdCedulaPagos;
    }

    public void setCveIdCedulaPagos(Long cveIdCedulaPagos) {
        this.cveIdCedulaPagos = cveIdCedulaPagos;
    }

    public String getRegPatronal() {
        return regPatronal;
    }

    public void setRegPatronal(String regPatronal) {
        this.regPatronal = regPatronal;
    }

    public Integer getNumCotizantesReportados() {
        return numCotizantesReportados;
    }

    public void setNumCotizantesReportados(Integer numCotizantesReportados) {
        this.numCotizantesReportados = numCotizantesReportados;
    }

    public Long getImpEmCf() {
        return impEmCf;
    }

    public void setImpEmCf(Long impEmCf) {
        this.impEmCf = impEmCf;
    }

    public Long getImpEmExcedentePat() {
        return impEmExcedentePat;
    }

    public void setImpEmExcedentePat(Long impEmExcedentePat) {
        this.impEmExcedentePat = impEmExcedentePat;
    }

    public Long getImpEmExcedenteObr() {
        return impEmExcedenteObr;
    }

    public void setImpEmExcedenteObr(Long impEmExcedenteObr) {
        this.impEmExcedenteObr = impEmExcedenteObr;
    }

    public Long getImpEmPdPat() {
        return impEmPdPat;
    }

    public void setImpEmPdPat(Long impEmPdPat) {
        this.impEmPdPat = impEmPdPat;
    }

    public Long getImpEmPdObr() {
        return impEmPdObr;
    }

    public void setImpEmPdObr(Long impEmPdObr) {
        this.impEmPdObr = impEmPdObr;
    }

    public Long getImpEmGmpPat() {
        return impEmGmpPat;
    }

    public void setImpEmGmpPat(Long impEmGmpPat) {
        this.impEmGmpPat = impEmGmpPat;
    }

    public Long getImpEmGmpObr() {
        return impEmGmpObr;
    }

    public void setImpEmGmpObr(Long impEmGmpObr) {
        this.impEmGmpObr = impEmGmpObr;
    }

    public Long getImpRiesgoTrabajo() {
        return impRiesgoTrabajo;
    }

    public void setImpRiesgoTrabajo(Long impRiesgoTrabajo) {
        this.impRiesgoTrabajo = impRiesgoTrabajo;
    }

    public Long getImpGuarderiasPs() {
        return impGuarderiasPs;
    }

    public void setImpGuarderiasPs(Long impGuarderiasPs) {
        this.impGuarderiasPs = impGuarderiasPs;
    }

    public Long getImpIvPat() {
        return impIvPat;
    }

    public void setImpIvPat(Long impIvPat) {
        this.impIvPat = impIvPat;
    }

    public Long getImpIvObr() {
        return impIvObr;
    }

    public void setImpIvObr(Long impIvObr) {
        this.impIvObr = impIvObr;
    }

    public Long getImpSubtotalCop() {
        return impSubtotalCop;
    }

    public void setImpSubtotalCop(Long impSubtotalCop) {
        this.impSubtotalCop = impSubtotalCop;
    }

    public Long getImpSuertePrincipalCop() {
        return impSuertePrincipalCop;
    }

    public void setImpSuertePrincipalCop(Long impSuertePrincipalCop) {
        this.impSuertePrincipalCop = impSuertePrincipalCop;
    }

    public Long getImpActualizacionCop() {
        return impActualizacionCop;
    }

    public void setImpActualizacionCop(Long impActualizacionCop) {
        this.impActualizacionCop = impActualizacionCop;
    }

    public Long getImpRecargosCop() {
        return impRecargosCop;
    }

    public void setImpRecargosCop(Long impRecargosCop) {
        this.impRecargosCop = impRecargosCop;
    }

    public Long getImpTotalCop() {
        return impTotalCop;
    }

    public void setImpTotalCop(Long impTotalCop) {
        this.impTotalCop = impTotalCop;
    }

    public Long getImpRetiro() {
        return impRetiro;
    }

    public void setImpRetiro(Long impRetiro) {
        this.impRetiro = impRetiro;
    }

    public Long getImpCvPat() {
        return impCvPat;
    }

    public void setImpCvPat(Long impCvPat) {
        this.impCvPat = impCvPat;
    }

    public Long getImpCvObr() {
        return impCvObr;
    }

    public void setImpCvObr(Long impCvObr) {
        this.impCvObr = impCvObr;
    }

    public Long getImpSubtotalRcv() {
        return impSubtotalRcv;
    }

    public void setImpSubtotalRcv(Long impSubtotalRcv) {
        this.impSubtotalRcv = impSubtotalRcv;
    }

    public Long getImpSuertePrincipalRcv() {
        return impSuertePrincipalRcv;
    }

    public void setImpSuertePrincipalRcv(Long impSuertePrincipalRcv) {
        this.impSuertePrincipalRcv = impSuertePrincipalRcv;
    }

    public Long getImpActualizacionRcv() {
        return impActualizacionRcv;
    }

    public void setImpActualizacionRcv(Long impActualizacionRcv) {
        this.impActualizacionRcv = impActualizacionRcv;
    }

    public Long getImpRecargosRcv() {
        return impRecargosRcv;
    }

    public void setImpRecargosRcv(Long impRecargosRcv) {
        this.impRecargosRcv = impRecargosRcv;
    }

    public Long getImpTotalRcv() {
        return impTotalRcv;
    }

    public void setImpTotalRcv(Long impTotalRcv) {
        this.impTotalRcv = impTotalRcv;
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

    public NdtPatronDictamenDO getCveIdPatronDictamen() {
        return cveIdPatronDictamen;
    }

    public void setCveIdPatronDictamen(NdtPatronDictamenDO cveIdPatronDictamen) {
        this.cveIdPatronDictamen = cveIdPatronDictamen;
    }

    public NdtPatronAsociadoDO getCveIdPatronAsociado() {
        return cveIdPatronAsociado;
    }

    public void setCveIdPatronAsociado(NdtPatronAsociadoDO cveIdPatronAsociado) {
        this.cveIdPatronAsociado = cveIdPatronAsociado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveIdCedulaPagos != null ? cveIdCedulaPagos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtCedulaPagosDiferenciasDO)) {
            return false;
        }
        NdtCedulaPagosDiferenciasDO other = (NdtCedulaPagosDiferenciasDO) object;
        if ((this.cveIdCedulaPagos == null && other.cveIdCedulaPagos != null) || (this.cveIdCedulaPagos != null && !this.cveIdCedulaPagos.equals(other.cveIdCedulaPagos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtCedulaPagosDiferenciasDO[ cveIdCedulaPagos=" + cveIdCedulaPagos + " ]";
    }
    
}
