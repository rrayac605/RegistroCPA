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
@Table(name = "NDT_A3_CUOTA_OBRERO_PATRONAL")
@NamedQueries({
    @NamedQuery(name = "NdtA3CuotaObreroPatronalDO.findAll", query = "SELECT n FROM NdtA3CuotaObreroPatronalDO n"),
    @NamedQuery(name = "NdtA3CuotaObreroPatronalDO.findByCveIdA3CuotaOp", query = "SELECT n FROM NdtA3CuotaObreroPatronalDO n WHERE n.cveIdA3CuotaOp = :cveIdA3CuotaOp"),
    @NamedQuery(name = "NdtA3CuotaObreroPatronalDO.findByRegPatronal", query = "SELECT n FROM NdtA3CuotaObreroPatronalDO n WHERE n.regPatronal = :regPatronal"),
    @NamedQuery(name = "NdtA3CuotaObreroPatronalDO.findByNumCotizantes", query = "SELECT n FROM NdtA3CuotaObreroPatronalDO n WHERE n.numCotizantes = :numCotizantes"),
    @NamedQuery(name = "NdtA3CuotaObreroPatronalDO.findByNumDiasCotizados", query = "SELECT n FROM NdtA3CuotaObreroPatronalDO n WHERE n.numDiasCotizados = :numDiasCotizados"),
    @NamedQuery(name = "NdtA3CuotaObreroPatronalDO.findByNumDiasAusentismo", query = "SELECT n FROM NdtA3CuotaObreroPatronalDO n WHERE n.numDiasAusentismo = :numDiasAusentismo"),
    @NamedQuery(name = "NdtA3CuotaObreroPatronalDO.findByNumDiasIncapacidad", query = "SELECT n FROM NdtA3CuotaObreroPatronalDO n WHERE n.numDiasIncapacidad = :numDiasIncapacidad"),
    @NamedQuery(name = "NdtA3CuotaObreroPatronalDO.findByImpEmCuotaFija", query = "SELECT n FROM NdtA3CuotaObreroPatronalDO n WHERE n.impEmCuotaFija = :impEmCuotaFija"),
    @NamedQuery(name = "NdtA3CuotaObreroPatronalDO.findByImpEmExcedenteObrero", query = "SELECT n FROM NdtA3CuotaObreroPatronalDO n WHERE n.impEmExcedenteObrero = :impEmExcedenteObrero"),
    @NamedQuery(name = "NdtA3CuotaObreroPatronalDO.findByImpEmExcedentePatron", query = "SELECT n FROM NdtA3CuotaObreroPatronalDO n WHERE n.impEmExcedentePatron = :impEmExcedentePatron"),
    @NamedQuery(name = "NdtA3CuotaObreroPatronalDO.findByImpEmPrestacionObrero", query = "SELECT n FROM NdtA3CuotaObreroPatronalDO n WHERE n.impEmPrestacionObrero = :impEmPrestacionObrero"),
    @NamedQuery(name = "NdtA3CuotaObreroPatronalDO.findByImpEmPrestacionPatron", query = "SELECT n FROM NdtA3CuotaObreroPatronalDO n WHERE n.impEmPrestacionPatron = :impEmPrestacionPatron"),
    @NamedQuery(name = "NdtA3CuotaObreroPatronalDO.findByImpEmGmpObrero", query = "SELECT n FROM NdtA3CuotaObreroPatronalDO n WHERE n.impEmGmpObrero = :impEmGmpObrero"),
    @NamedQuery(name = "NdtA3CuotaObreroPatronalDO.findByImpEmGmpPatron", query = "SELECT n FROM NdtA3CuotaObreroPatronalDO n WHERE n.impEmGmpPatron = :impEmGmpPatron"),
    @NamedQuery(name = "NdtA3CuotaObreroPatronalDO.findByImpRiesgoTrabajo", query = "SELECT n FROM NdtA3CuotaObreroPatronalDO n WHERE n.impRiesgoTrabajo = :impRiesgoTrabajo"),
    @NamedQuery(name = "NdtA3CuotaObreroPatronalDO.findByImpGuarderias", query = "SELECT n FROM NdtA3CuotaObreroPatronalDO n WHERE n.impGuarderias = :impGuarderias"),
    @NamedQuery(name = "NdtA3CuotaObreroPatronalDO.findByImpIvObrero", query = "SELECT n FROM NdtA3CuotaObreroPatronalDO n WHERE n.impIvObrero = :impIvObrero"),
    @NamedQuery(name = "NdtA3CuotaObreroPatronalDO.findByImpIvPatron", query = "SELECT n FROM NdtA3CuotaObreroPatronalDO n WHERE n.impIvPatron = :impIvPatron"),
    @NamedQuery(name = "NdtA3CuotaObreroPatronalDO.findByImpSuerteCop", query = "SELECT n FROM NdtA3CuotaObreroPatronalDO n WHERE n.impSuerteCop = :impSuerteCop"),
    @NamedQuery(name = "NdtA3CuotaObreroPatronalDO.findByImpActualizacionCop", query = "SELECT n FROM NdtA3CuotaObreroPatronalDO n WHERE n.impActualizacionCop = :impActualizacionCop"),
    @NamedQuery(name = "NdtA3CuotaObreroPatronalDO.findByImpRecargosCop", query = "SELECT n FROM NdtA3CuotaObreroPatronalDO n WHERE n.impRecargosCop = :impRecargosCop"),
    @NamedQuery(name = "NdtA3CuotaObreroPatronalDO.findByImpTotalCop", query = "SELECT n FROM NdtA3CuotaObreroPatronalDO n WHERE n.impTotalCop = :impTotalCop"),
    @NamedQuery(name = "NdtA3CuotaObreroPatronalDO.findByImpRetiro", query = "SELECT n FROM NdtA3CuotaObreroPatronalDO n WHERE n.impRetiro = :impRetiro"),
    @NamedQuery(name = "NdtA3CuotaObreroPatronalDO.findByImpCvObrero", query = "SELECT n FROM NdtA3CuotaObreroPatronalDO n WHERE n.impCvObrero = :impCvObrero"),
    @NamedQuery(name = "NdtA3CuotaObreroPatronalDO.findByImpCvPatron", query = "SELECT n FROM NdtA3CuotaObreroPatronalDO n WHERE n.impCvPatron = :impCvPatron"),
    @NamedQuery(name = "NdtA3CuotaObreroPatronalDO.findByImpSuerteRcv", query = "SELECT n FROM NdtA3CuotaObreroPatronalDO n WHERE n.impSuerteRcv = :impSuerteRcv"),
    @NamedQuery(name = "NdtA3CuotaObreroPatronalDO.findByImpActualizacionRcv", query = "SELECT n FROM NdtA3CuotaObreroPatronalDO n WHERE n.impActualizacionRcv = :impActualizacionRcv"),
    @NamedQuery(name = "NdtA3CuotaObreroPatronalDO.findByImpRecargosRcv", query = "SELECT n FROM NdtA3CuotaObreroPatronalDO n WHERE n.impRecargosRcv = :impRecargosRcv"),
    @NamedQuery(name = "NdtA3CuotaObreroPatronalDO.findByImpTotalRcv", query = "SELECT n FROM NdtA3CuotaObreroPatronalDO n WHERE n.impTotalRcv = :impTotalRcv"),
    @NamedQuery(name = "NdtA3CuotaObreroPatronalDO.findByImpInfonavit", query = "SELECT n FROM NdtA3CuotaObreroPatronalDO n WHERE n.impInfonavit = :impInfonavit"),
    @NamedQuery(name = "NdtA3CuotaObreroPatronalDO.findByCveIdUsuario", query = "SELECT n FROM NdtA3CuotaObreroPatronalDO n WHERE n.cveIdUsuario = :cveIdUsuario"),
    @NamedQuery(name = "NdtA3CuotaObreroPatronalDO.findByFecRegistroAlta", query = "SELECT n FROM NdtA3CuotaObreroPatronalDO n WHERE n.fecRegistroAlta = :fecRegistroAlta"),
    @NamedQuery(name = "NdtA3CuotaObreroPatronalDO.findByFecRegistroBaja", query = "SELECT n FROM NdtA3CuotaObreroPatronalDO n WHERE n.fecRegistroBaja = :fecRegistroBaja"),
    @NamedQuery(name = "NdtA3CuotaObreroPatronalDO.findByFecRegistroActualizado", query = "SELECT n FROM NdtA3CuotaObreroPatronalDO n WHERE n.fecRegistroActualizado = :fecRegistroActualizado")})
public class NdtA3CuotaObreroPatronalDO implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_ID_A3_CUOTA_OP", nullable = false, precision = 22, scale = 0)
    @SequenceGenerator(name = "NdtA3CuotaObreroPatronal_Id_Seq_Gen", sequenceName = "SEQ_NDTA3CUOTAOBREROPATRONAL", allocationSize=1)
    @GeneratedValue(generator = "NdtA3CuotaObreroPatronal_Id_Seq_Gen")
    private Long cveIdA3CuotaOp;
    @Size(max = 13)
    @Column(name = "REG_PATRONAL", length = 13)
    private String regPatronal;
    @Column(name = "NUM_COTIZANTES")
    private Integer numCotizantes;
    @Column(name = "NUM_DIAS_COTIZADOS")
    private Integer numDiasCotizados;
    @Column(name = "NUM_DIAS_AUSENTISMO")
    private Integer numDiasAusentismo;
    @Column(name = "NUM_DIAS_INCAPACIDAD")
    private Integer numDiasIncapacidad;
    @Column(name = "IMP_EM_CUOTA_FIJA", precision = 14, scale = 2)
    private Long impEmCuotaFija;
    @Column(name = "IMP_EM_EXCEDENTE_OBRERO", precision = 14, scale = 2)
    private Long impEmExcedenteObrero;
    @Column(name = "IMP_EM_EXCEDENTE_PATRON", precision = 14, scale = 2)
    private Long impEmExcedentePatron;
    @Column(name = "IMP_EM_PRESTACION_OBRERO", precision = 14, scale = 2)
    private Long impEmPrestacionObrero;
    @Column(name = "IMP_EM_PRESTACION_PATRON", precision = 14, scale = 2)
    private Long impEmPrestacionPatron;
    @Column(name = "IMP_EM_GMP_OBRERO", precision = 14, scale = 2)
    private Long impEmGmpObrero;
    @Column(name = "IMP_EM_GMP_PATRON", precision = 14, scale = 2)
    private Long impEmGmpPatron;
    @Column(name = "IMP_RIESGO_TRABAJO", precision = 14, scale = 2)
    private Long impRiesgoTrabajo;
    @Column(name = "IMP_GUARDERIAS", precision = 14, scale = 2)
    private Long impGuarderias;
    @Column(name = "IMP_IV_OBRERO", precision = 14, scale = 2)
    private Long impIvObrero;
    @Column(name = "IMP_IV_PATRON", precision = 14, scale = 2)
    private Long impIvPatron;
    @Column(name = "IMP_SUERTE_COP", precision = 14, scale = 2)
    private Long impSuerteCop;
    @Column(name = "IMP_ACTUALIZACION_COP", precision = 14, scale = 2)
    private Long impActualizacionCop;
    @Column(name = "IMP_RECARGOS_COP", precision = 14, scale = 2)
    private Long impRecargosCop;
    @Column(name = "IMP_TOTAL_COP", precision = 14, scale = 2)
    private Long impTotalCop;
    @Column(name = "IMP_RETIRO", precision = 14, scale = 2)
    private Long impRetiro;
    @Column(name = "IMP_CV_OBRERO", precision = 14, scale = 2)
    private Long impCvObrero;
    @Column(name = "IMP_CV_PATRON", precision = 14, scale = 2)
    private Long impCvPatron;
    @Column(name = "IMP_SUERTE_RCV", precision = 14, scale = 2)
    private Long impSuerteRcv;
    @Column(name = "IMP_ACTUALIZACION_RCV", precision = 14, scale = 2)
    private Long impActualizacionRcv;
    @Column(name = "IMP_RECARGOS_RCV", precision = 14, scale = 2)
    private Long impRecargosRcv;
    @Column(name = "IMP_TOTAL_RCV", precision = 14, scale = 2)
    private Long impTotalRcv;
    @Column(name = "IMP_INFONAVIT", precision = 14, scale = 2)
    private Long impInfonavit;
    @Size(max = 18)
    @Column(name = "CVE_ID_USUARIO", length = 18)
    private String cveIdUsuario;
    @Column(name = "FEC_REGISTRO_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroAlta;
    @Column(name = "FEC_REGISTRO_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroBaja;
    @Column(name = "FEC_REGISTRO_ACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistroActualizado;
    @JoinColumn(name = "CVE_ID_PATRON_DICTAMEN", referencedColumnName = "CVE_ID_PATRON_DICTAMEN")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtPatronDictamenDO cveIdPatronDictamen;
    @JoinColumn(name = "CVE_ID_PATRON_ASOCIADO", referencedColumnName = "CVE_ID_PATRON_ASOCIADO")
    @ManyToOne(fetch = FetchType.LAZY)
    private NdtPatronAsociadoDO cveIdPatronAsociado;

    public NdtA3CuotaObreroPatronalDO() {
    }

    public NdtA3CuotaObreroPatronalDO(Long cveIdA3CuotaOp) {
        this.cveIdA3CuotaOp = cveIdA3CuotaOp;
    }

    public Long getCveIdA3CuotaOp() {
        return cveIdA3CuotaOp;
    }

    public void setCveIdA3CuotaOp(Long cveIdA3CuotaOp) {
        this.cveIdA3CuotaOp = cveIdA3CuotaOp;
    }

    public String getRegPatronal() {
        return regPatronal;
    }

    public void setRegPatronal(String regPatronal) {
        this.regPatronal = regPatronal;
    }

    public Integer getNumCotizantes() {
        return numCotizantes;
    }

    public void setNumCotizantes(Integer numCotizantes) {
        this.numCotizantes = numCotizantes;
    }

    public Integer getNumDiasCotizados() {
        return numDiasCotizados;
    }

    public void setNumDiasCotizados(Integer numDiasCotizados) {
        this.numDiasCotizados = numDiasCotizados;
    }

    public Integer getNumDiasAusentismo() {
        return numDiasAusentismo;
    }

    public void setNumDiasAusentismo(Integer numDiasAusentismo) {
        this.numDiasAusentismo = numDiasAusentismo;
    }

    public Integer getNumDiasIncapacidad() {
        return numDiasIncapacidad;
    }

    public void setNumDiasIncapacidad(Integer numDiasIncapacidad) {
        this.numDiasIncapacidad = numDiasIncapacidad;
    }

    public Long getImpEmCuotaFija() {
        return impEmCuotaFija;
    }

    public void setImpEmCuotaFija(Long impEmCuotaFija) {
        this.impEmCuotaFija = impEmCuotaFija;
    }

    public Long getImpEmExcedenteObrero() {
        return impEmExcedenteObrero;
    }

    public void setImpEmExcedenteObrero(Long impEmExcedenteObrero) {
        this.impEmExcedenteObrero = impEmExcedenteObrero;
    }

    public Long getImpEmExcedentePatron() {
        return impEmExcedentePatron;
    }

    public void setImpEmExcedentePatron(Long impEmExcedentePatron) {
        this.impEmExcedentePatron = impEmExcedentePatron;
    }

    public Long getImpEmPrestacionObrero() {
        return impEmPrestacionObrero;
    }

    public void setImpEmPrestacionObrero(Long impEmPrestacionObrero) {
        this.impEmPrestacionObrero = impEmPrestacionObrero;
    }

    public Long getImpEmPrestacionPatron() {
        return impEmPrestacionPatron;
    }

    public void setImpEmPrestacionPatron(Long impEmPrestacionPatron) {
        this.impEmPrestacionPatron = impEmPrestacionPatron;
    }

    public Long getImpEmGmpObrero() {
        return impEmGmpObrero;
    }

    public void setImpEmGmpObrero(Long impEmGmpObrero) {
        this.impEmGmpObrero = impEmGmpObrero;
    }

    public Long getImpEmGmpPatron() {
        return impEmGmpPatron;
    }

    public void setImpEmGmpPatron(Long impEmGmpPatron) {
        this.impEmGmpPatron = impEmGmpPatron;
    }

    public Long getImpRiesgoTrabajo() {
        return impRiesgoTrabajo;
    }

    public void setImpRiesgoTrabajo(Long impRiesgoTrabajo) {
        this.impRiesgoTrabajo = impRiesgoTrabajo;
    }

    public Long getImpGuarderias() {
        return impGuarderias;
    }

    public void setImpGuarderias(Long impGuarderias) {
        this.impGuarderias = impGuarderias;
    }

    public Long getImpIvObrero() {
        return impIvObrero;
    }

    public void setImpIvObrero(Long impIvObrero) {
        this.impIvObrero = impIvObrero;
    }

    public Long getImpIvPatron() {
        return impIvPatron;
    }

    public void setImpIvPatron(Long impIvPatron) {
        this.impIvPatron = impIvPatron;
    }

    public Long getImpSuerteCop() {
        return impSuerteCop;
    }

    public void setImpSuerteCop(Long impSuerteCop) {
        this.impSuerteCop = impSuerteCop;
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

    public Long getImpCvObrero() {
        return impCvObrero;
    }

    public void setImpCvObrero(Long impCvObrero) {
        this.impCvObrero = impCvObrero;
    }

    public Long getImpCvPatron() {
        return impCvPatron;
    }

    public void setImpCvPatron(Long impCvPatron) {
        this.impCvPatron = impCvPatron;
    }

    public Long getImpSuerteRcv() {
        return impSuerteRcv;
    }

    public void setImpSuerteRcv(Long impSuerteRcv) {
        this.impSuerteRcv = impSuerteRcv;
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

    public Long getImpInfonavit() {
        return impInfonavit;
    }

    public void setImpInfonavit(Long impInfonavit) {
        this.impInfonavit = impInfonavit;
    }

    public String getCveIdUsuario() {
        return cveIdUsuario;
    }

    public void setCveIdUsuario(String cveIdUsuario) {
        this.cveIdUsuario = cveIdUsuario;
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
        hash += (cveIdA3CuotaOp != null ? cveIdA3CuotaOp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NdtA3CuotaObreroPatronalDO)) {
            return false;
        }
        NdtA3CuotaObreroPatronalDO other = (NdtA3CuotaObreroPatronalDO) object;
        if ((this.cveIdA3CuotaOp == null && other.cveIdA3CuotaOp != null) || (this.cveIdA3CuotaOp != null && !this.cveIdA3CuotaOp.equals(other.cveIdA3CuotaOp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.imss.cit.dictamen.model.NdtA3CuotaObreroPatronalDO[ cveIdA3CuotaOp=" + cveIdA3CuotaOp + " ]";
    }
    
}
