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
@Table(name="NDT_A2_OTRA_PREST_OTORGADA")
@NamedQuery(name="NdtA2OtraPrestOtorgada.findAll", query="SELECT n FROM NdtA2OtraPrestOtorgada n")
public class NdtA2OtraPrestOtorgada implements Serializable {
	
	private static final long serialVersionUID = 1682555627916204930L;
	
	@Id
	@Column(name="CVE_ID_A2_OTRASPRESOTORGADAS", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtA2OtraPrestOtorgada_Id_Seq_Gen", sequenceName = "SEQ_NDTA2OTRAPRESTOTORGADA")
    @GeneratedValue(generator = "NdtA2OtraPrestOtorgada_Id_Seq_Gen")
	private Long cveIdA2Otraspresotorgadas;

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

	@Column(name="IMP_ALIMENTACION", precision=14, scale=2)
	private Long impAlimentacion;

	@Column(name="IMP_APORTACION_ADICIONAL_RCV", precision=14, scale=2)
	private Long impAportacionAdicionalRcv;

	@Column(name="IMP_CUOTA_OBRERA", precision=14, scale=2)
	private Long impCuotaObrera;

	@Column(name="IMP_CUOTA_PATRONAL_INFONAVIT", precision=14, scale=2)
	private Long impCuotaPatronalInfonavit;

	@Column(name="IMP_FONDO_PENSIONES", precision=14, scale=2)
	private Long impFondoPensiones;

	@Column(name="IMP_GASTOS_PREVISION_SOCIAL", precision=14, scale=2)
	private Long impGastosPrevisionSocial;

	@Column(name="IMP_HABITACION", precision=14, scale=2)
	private Long impHabitacion;

	@Column(name="IMP_INSTRUMENTOS_TRABAJO", precision=14, scale=2)
	private Long impInstrumentosTrabajo;

	@Column(name="IMP_OTRAS_PRESTACIONES", precision=14, scale=2)
	private Long impOtrasPrestaciones;

	@Column(name="IMP_TOTAL", precision=14, scale=2)
	private Long impTotal;

	//bi-directional many-to-one association to NdtPatronDictamen
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_PATRON_DICTAMEN")
	private NdtPatronDictamen ndtPatronDictamen;

	public NdtA2OtraPrestOtorgada() {
	}

	public Long getCveIdA2Otraspresotorgadas() {
		return cveIdA2Otraspresotorgadas;
	}

	public void setCveIdA2Otraspresotorgadas(Long cveIdA2Otraspresotorgadas) {
		this.cveIdA2Otraspresotorgadas = cveIdA2Otraspresotorgadas;
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

	public Long getImpAlimentacion() {
		return impAlimentacion;
	}

	public void setImpAlimentacion(Long impAlimentacion) {
		this.impAlimentacion = impAlimentacion;
	}

	public Long getImpAportacionAdicionalRcv() {
		return impAportacionAdicionalRcv;
	}

	public void setImpAportacionAdicionalRcv(Long impAportacionAdicionalRcv) {
		this.impAportacionAdicionalRcv = impAportacionAdicionalRcv;
	}

	public Long getImpCuotaObrera() {
		return impCuotaObrera;
	}

	public void setImpCuotaObrera(Long impCuotaObrera) {
		this.impCuotaObrera = impCuotaObrera;
	}

	public Long getImpCuotaPatronalInfonavit() {
		return impCuotaPatronalInfonavit;
	}

	public void setImpCuotaPatronalInfonavit(Long impCuotaPatronalInfonavit) {
		this.impCuotaPatronalInfonavit = impCuotaPatronalInfonavit;
	}

	public Long getImpFondoPensiones() {
		return impFondoPensiones;
	}

	public void setImpFondoPensiones(Long impFondoPensiones) {
		this.impFondoPensiones = impFondoPensiones;
	}

	public Long getImpGastosPrevisionSocial() {
		return impGastosPrevisionSocial;
	}

	public void setImpGastosPrevisionSocial(Long impGastosPrevisionSocial) {
		this.impGastosPrevisionSocial = impGastosPrevisionSocial;
	}

	public Long getImpHabitacion() {
		return impHabitacion;
	}

	public void setImpHabitacion(Long impHabitacion) {
		this.impHabitacion = impHabitacion;
	}

	public Long getImpInstrumentosTrabajo() {
		return impInstrumentosTrabajo;
	}

	public void setImpInstrumentosTrabajo(Long impInstrumentosTrabajo) {
		this.impInstrumentosTrabajo = impInstrumentosTrabajo;
	}

	public Long getImpOtrasPrestaciones() {
		return impOtrasPrestaciones;
	}

	public void setImpOtrasPrestaciones(Long impOtrasPrestaciones) {
		this.impOtrasPrestaciones = impOtrasPrestaciones;
	}

	public Long getImpTotal() {
		return impTotal;
	}

	public void setImpTotal(Long impTotal) {
		this.impTotal = impTotal;
	}

	public NdtPatronDictamen getNdtPatronDictamen() {
		return ndtPatronDictamen;
	}

	public void setNdtPatronDictamen(NdtPatronDictamen ndtPatronDictamen) {
		this.ndtPatronDictamen = ndtPatronDictamen;
	}

}