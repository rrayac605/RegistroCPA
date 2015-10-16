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
@Table(name="NDT_A3_CUOTA_OBRERO_PATRONAL")
@NamedQuery(name="NdtA3CuotaObreroPatronal.findAll", query="SELECT n FROM NdtA3CuotaObreroPatronal n")
public class NdtA3CuotaObreroPatronal implements Serializable {
	
	private static final long serialVersionUID = 5146980341396327704L;
	
	@Id
	@Column(name="CVE_ID_A3_CUOTA_OP", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtA3CuotaObreroPatronal_Id_Seq_Gen", sequenceName = "SEQ_NDTA3CUOTAOBREROPATRONAL")
    @GeneratedValue(generator = "NdtA3CuotaObreroPatronal_Id_Seq_Gen")
	private Long cveIdA3CuotaOp;

	@Column(name="CVE_ID_USUARIO", length=18)
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

	@Column(name="IMP_ACTUALIZACION_COP", precision=14, scale=2)
	private Long impActualizacionCop;

	@Column(name="IMP_ACTUALIZACION_RCV", precision=14, scale=2)
	private Long impActualizacionRcv;

	@Column(name="IMP_CV_OBRERO", precision=14, scale=2)
	private Long impCvObrero;

	@Column(name="IMP_CV_PATRON", precision=14, scale=2)
	private Long impCvPatron;

	@Column(name="IMP_EM_CUOTA_FIJA", precision=14, scale=2)
	private Long impEmCuotaFija;

	@Column(name="IMP_EM_EXCEDENTE_OBRERO", precision=14, scale=2)
	private Long impEmExcedenteObrero;

	@Column(name="IMP_EM_EXCEDENTE_PATRON", precision=14, scale=2)
	private Long impEmExcedentePatron;

	@Column(name="IMP_EM_GMP_OBRERO", precision=14, scale=2)
	private Long impEmGmpObrero;

	@Column(name="IMP_EM_GMP_PATRON", precision=14, scale=2)
	private Long impEmGmpPatron;

	@Column(name="IMP_EM_PRESTACION_OBRERO", precision=14, scale=2)
	private Long impEmPrestacionObrero;

	@Column(name="IMP_EM_PRESTACION_PATRON", precision=14, scale=2)
	private Long impEmPrestacionPatron;

	@Column(name="IMP_GUARDERIAS", precision=14, scale=2)
	private Long impGuarderias;

	@Column(name="IMP_INFONAVIT", precision=14, scale=2)
	private Long impInfonavit;

	@Column(name="IMP_IV_OBRERO", precision=14, scale=2)
	private Long impIvObrero;

	@Column(name="IMP_IV_PATRON", precision=14, scale=2)
	private Long impIvPatron;

	@Column(name="IMP_RECARGOS_COP", precision=14, scale=2)
	private Long impRecargosCop;

	@Column(name="IMP_RECARGOS_RCV", precision=14, scale=2)
	private Long impRecargosRcv;

	@Column(name="IMP_RETIRO", precision=14, scale=2)
	private Long impRetiro;

	@Column(name="IMP_RIESGO_TRABAJO", precision=14, scale=2)
	private Long impRiesgoTrabajo;

	@Column(name="IMP_SUERTE_COP", precision=14, scale=2)
	private Long impSuerteCop;

	@Column(name="IMP_SUERTE_RCV", precision=14, scale=2)
	private Long impSuerteRcv;

	@Column(name="IMP_TOTAL_COP", precision=14, scale=2)
	private Long impTotalCop;

	@Column(name="IMP_TOTAL_RCV", precision=14, scale=2)
	private Long impTotalRcv;

	@Column(name="NUM_COTIZANTES", precision=6)
	private Long numCotizantes;

	@Column(name="NUM_DIAS_AUSENTISMO", precision=6)
	private Long numDiasAusentismo;

	@Column(name="NUM_DIAS_COTIZADOS", precision=6)
	private Long numDiasCotizados;

	@Column(name="NUM_DIAS_INCAPACIDAD", precision=6)
	private Long numDiasIncapacidad;

	@Column(name="REG_PATRONAL", length=13)
	private String regPatronal;

	//bi-directional many-to-one association to NdtPatronDictamen
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_PATRON_DICTAMEN")
	private NdtPatronDictamen ndtPatronDictamen;

	public NdtA3CuotaObreroPatronal() {
	}

	public Long getCveIdA3CuotaOp() {
		return cveIdA3CuotaOp;
	}

	public void setCveIdA3CuotaOp(Long cveIdA3CuotaOp) {
		this.cveIdA3CuotaOp = cveIdA3CuotaOp;
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

	public Long getImpGuarderias() {
		return impGuarderias;
	}

	public void setImpGuarderias(Long impGuarderias) {
		this.impGuarderias = impGuarderias;
	}

	public Long getImpInfonavit() {
		return impInfonavit;
	}

	public void setImpInfonavit(Long impInfonavit) {
		this.impInfonavit = impInfonavit;
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

	public Long getImpSuerteCop() {
		return impSuerteCop;
	}

	public void setImpSuerteCop(Long impSuerteCop) {
		this.impSuerteCop = impSuerteCop;
	}

	public Long getImpSuerteRcv() {
		return impSuerteRcv;
	}

	public void setImpSuerteRcv(Long impSuerteRcv) {
		this.impSuerteRcv = impSuerteRcv;
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

	public Long getNumCotizantes() {
		return numCotizantes;
	}

	public void setNumCotizantes(Long numCotizantes) {
		this.numCotizantes = numCotizantes;
	}

	public Long getNumDiasAusentismo() {
		return numDiasAusentismo;
	}

	public void setNumDiasAusentismo(Long numDiasAusentismo) {
		this.numDiasAusentismo = numDiasAusentismo;
	}

	public Long getNumDiasCotizados() {
		return numDiasCotizados;
	}

	public void setNumDiasCotizados(Long numDiasCotizados) {
		this.numDiasCotizados = numDiasCotizados;
	}

	public Long getNumDiasIncapacidad() {
		return numDiasIncapacidad;
	}

	public void setNumDiasIncapacidad(Long numDiasIncapacidad) {
		this.numDiasIncapacidad = numDiasIncapacidad;
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