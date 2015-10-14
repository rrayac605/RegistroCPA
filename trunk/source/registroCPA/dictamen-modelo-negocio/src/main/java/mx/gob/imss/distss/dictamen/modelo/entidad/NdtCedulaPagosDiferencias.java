package mx.gob.imss.distss.dictamen.modelo.entidad;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="NDT_CEDULA_PAGOS_DIFERENCIAS")
@NamedQuery(name="NdtCedulaPagosDiferencias.findAll", query="SELECT n FROM NdtCedulaPagosDiferencias n")
public class NdtCedulaPagosDiferencias implements Serializable {
	
	private static final long serialVersionUID = 3749818433678073614L;
	
	@Id
	@Column(name="CVE_ID_CEDULA_PAGOS", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtCedulaPagosDiferencias_Id_Seq_Gen", sequenceName = "SEQ_NDTCEDULAPAGOSDIFERENCIAS")
    @GeneratedValue(generator = "NdtCedulaPagosDiferencias_Id_Seq_Gen")
	private Long cveIdCedulaPagos;

	@Column(name="CVE_ID_USUARIO", length=20)
	private String cveIdUsuario;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="IMP_ACTUALIZACION_COP", precision=15, scale=2)
	private Long impActualizacionCop;

	@Column(name="IMP_ACTUALIZACION_RCV", precision=15, scale=2)
	private Long impActualizacionRcv;

	@Column(name="IMP_CV_OBR", precision=15, scale=2)
	private Long impCvObr;

	@Column(name="IMP_CV_PAT", precision=15, scale=2)
	private Long impCvPat;

	@Column(name="IMP_EM_CF", precision=15, scale=2)
	private Long impEmCf;

	@Column(name="IMP_EM_EXCEDENTE_OBR", precision=15, scale=2)
	private Long impEmExcedenteObr;

	@Column(name="IMP_EM_EXCEDENTE_PAT", precision=15, scale=2)
	private Long impEmExcedentePat;

	@Column(name="IMP_EM_GMP_OBR", precision=15, scale=2)
	private Long impEmGmpObr;

	@Column(name="IMP_EM_GMP_PAT", precision=15, scale=2)
	private Long impEmGmpPat;

	@Column(name="IMP_EM_PD_OBR", precision=15, scale=2)
	private Long impEmPdObr;

	@Column(name="IMP_EM_PD_PAT", precision=15, scale=2)
	private Long impEmPdPat;

	@Column(name="IMP_GUARDERIAS_PS", precision=15, scale=2)
	private Long impGuarderiasPs;

	@Column(name="IMP_IV_OBR", precision=15, scale=2)
	private Long impIvObr;

	@Column(name="IMP_IV_PAT", precision=15, scale=2)
	private Long impIvPat;

	@Column(name="IMP_RECARGOS_COP", precision=15, scale=2)
	private Long impRecargosCop;

	@Column(name="IMP_RECARGOS_RCV", precision=15, scale=2)
	private Long impRecargosRcv;

	@Column(name="IMP_RETIRO", precision=15, scale=2)
	private Long impRetiro;

	@Column(name="IMP_RIESGO_TRABAJO", precision=15, scale=2)
	private Long impRiesgoTrabajo;

	@Column(name="IMP_SUBTOTAL_COP", precision=15, scale=2)
	private Long impSubtotalCop;

	@Column(name="IMP_SUBTOTAL_RCV", precision=15, scale=2)
	private Long impSubtotalRcv;

	@Column(name="IMP_SUERTE_PRINCIPAL_COP", precision=15, scale=2)
	private Long impSuertePrincipalCop;

	@Column(name="IMP_SUERTE_PRINCIPAL_RCV", precision=15, scale=2)
	private Long impSuertePrincipalRcv;

	@Column(name="IMP_TOTAL_COP", precision=15, scale=2)
	private Long impTotalCop;

	@Column(name="IMP_TOTAL_RCV", precision=15, scale=2)
	private Long impTotalRcv;

	@Column(name="NUM_COTIZANTES_REPORTADOS")
	private Long numCotizantesReportados;

	@Column(name="REG_PATRONAL", length=11)
	private String regPatronal;

	//bi-directional many-to-one association to NdtPatronDictamen
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_PATRON_DICTAMEN")
	private NdtPatronDictamen ndtPatronDictamen;

	public NdtCedulaPagosDiferencias() {
	}

	public Long getCveIdCedulaPagos() {
		return cveIdCedulaPagos;
	}

	public void setCveIdCedulaPagos(Long cveIdCedulaPagos) {
		this.cveIdCedulaPagos = cveIdCedulaPagos;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado;
	}

	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
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

	public Long getImpActualizacionCop() {
		return impActualizacionCop;
	}

	public void setImpActualizacionCop(Long impActualizacionCop) {
		this.impActualizacionCop = impActualizacionCop;
	}

	public Long getImpActualizacionRcv() {
		return impActualizacionRcv;
	}

	public void setImpActualizacionRcv(Long impActualizacionRcv) {
		this.impActualizacionRcv = impActualizacionRcv;
	}

	public Long getImpCvObr() {
		return impCvObr;
	}

	public void setImpCvObr(Long impCvObr) {
		this.impCvObr = impCvObr;
	}

	public Long getImpCvPat() {
		return impCvPat;
	}

	public void setImpCvPat(Long impCvPat) {
		this.impCvPat = impCvPat;
	}

	public Long getImpEmCf() {
		return impEmCf;
	}

	public void setImpEmCf(Long impEmCf) {
		this.impEmCf = impEmCf;
	}

	public Long getImpEmExcedenteObr() {
		return impEmExcedenteObr;
	}

	public void setImpEmExcedenteObr(Long impEmExcedenteObr) {
		this.impEmExcedenteObr = impEmExcedenteObr;
	}

	public Long getImpEmExcedentePat() {
		return impEmExcedentePat;
	}

	public void setImpEmExcedentePat(Long impEmExcedentePat) {
		this.impEmExcedentePat = impEmExcedentePat;
	}

	public Long getImpEmGmpObr() {
		return impEmGmpObr;
	}

	public void setImpEmGmpObr(Long impEmGmpObr) {
		this.impEmGmpObr = impEmGmpObr;
	}

	public Long getImpEmGmpPat() {
		return impEmGmpPat;
	}

	public void setImpEmGmpPat(Long impEmGmpPat) {
		this.impEmGmpPat = impEmGmpPat;
	}

	public Long getImpEmPdObr() {
		return impEmPdObr;
	}

	public void setImpEmPdObr(Long impEmPdObr) {
		this.impEmPdObr = impEmPdObr;
	}

	public Long getImpEmPdPat() {
		return impEmPdPat;
	}

	public void setImpEmPdPat(Long impEmPdPat) {
		this.impEmPdPat = impEmPdPat;
	}

	public Long getImpGuarderiasPs() {
		return impGuarderiasPs;
	}

	public void setImpGuarderiasPs(Long impGuarderiasPs) {
		this.impGuarderiasPs = impGuarderiasPs;
	}

	public Long getImpIvObr() {
		return impIvObr;
	}

	public void setImpIvObr(Long impIvObr) {
		this.impIvObr = impIvObr;
	}

	public Long getImpIvPat() {
		return impIvPat;
	}

	public void setImpIvPat(Long impIvPat) {
		this.impIvPat = impIvPat;
	}

	public Long getImpRecargosCop() {
		return impRecargosCop;
	}

	public void setImpRecargosCop(Long impRecargosCop) {
		this.impRecargosCop = impRecargosCop;
	}

	public Long getImpRecargosRcv() {
		return impRecargosRcv;
	}

	public void setImpRecargosRcv(Long impRecargosRcv) {
		this.impRecargosRcv = impRecargosRcv;
	}

	public Long getImpRetiro() {
		return impRetiro;
	}

	public void setImpRetiro(Long impRetiro) {
		this.impRetiro = impRetiro;
	}

	public Long getImpRiesgoTrabajo() {
		return impRiesgoTrabajo;
	}

	public void setImpRiesgoTrabajo(Long impRiesgoTrabajo) {
		this.impRiesgoTrabajo = impRiesgoTrabajo;
	}

	public Long getImpSubtotalCop() {
		return impSubtotalCop;
	}

	public void setImpSubtotalCop(Long impSubtotalCop) {
		this.impSubtotalCop = impSubtotalCop;
	}

	public Long getImpSubtotalRcv() {
		return impSubtotalRcv;
	}

	public void setImpSubtotalRcv(Long impSubtotalRcv) {
		this.impSubtotalRcv = impSubtotalRcv;
	}

	public Long getImpSuertePrincipalCop() {
		return impSuertePrincipalCop;
	}

	public void setImpSuertePrincipalCop(Long impSuertePrincipalCop) {
		this.impSuertePrincipalCop = impSuertePrincipalCop;
	}

	public Long getImpSuertePrincipalRcv() {
		return impSuertePrincipalRcv;
	}

	public void setImpSuertePrincipalRcv(Long impSuertePrincipalRcv) {
		this.impSuertePrincipalRcv = impSuertePrincipalRcv;
	}

	public Long getImpTotalCop() {
		return impTotalCop;
	}

	public void setImpTotalCop(Long impTotalCop) {
		this.impTotalCop = impTotalCop;
	}

	public Long getImpTotalRcv() {
		return impTotalRcv;
	}

	public void setImpTotalRcv(Long impTotalRcv) {
		this.impTotalRcv = impTotalRcv;
	}

	public Long getNumCotizantesReportados() {
		return numCotizantesReportados;
	}

	public void setNumCotizantesReportados(Long numCotizantesReportados) {
		this.numCotizantesReportados = numCotizantesReportados;
	}

	public String getRegPatronal() {
		return regPatronal;
	}

	public void setRegPatronal(String regPatronal) {
		this.regPatronal = regPatronal;
	}

	public NdtPatronDictamen getNdtPatronDictamen() {
		return ndtPatronDictamen;
	}

	public void setNdtPatronDictamen(NdtPatronDictamen ndtPatronDictamen) {
		this.ndtPatronDictamen = ndtPatronDictamen;
	}

}
