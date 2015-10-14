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
@Table(name="NDT_A1_PERCEP_TRABAJADOR")
@NamedQuery(name="NdtA1PercepTrabajador.findAll", query="SELECT n FROM NdtA1PercepTrabajador n")
public class NdtA1PercepTrabajador implements Serializable {
	
	private static final long serialVersionUID = -1993897149497521298L;
	
	@Id
	@Column(name="CVE_ID_A1_PERCEPTRAB", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtA1PercepTrabajador_Id_Seq_Gen", sequenceName = "SEQ_NDTA1PERCEPTRABAJADOR")
    @GeneratedValue(generator = "NdtA1PercepTrabajador_Id_Seq_Gen")
	private Long cveIdA1Perceptrab;

	@Column(name="CURP_TRABAJADOR", length=18)
	private String curpTrabajador;

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

	@Column(name="IMP_AYUDA_ANTEOJOS", precision=14, scale=2)
	private Long impAyudaAnteojos;

	@Column(name="IMP_AYUDA_ESCOLAR", precision=14, scale=2)
	private Long impAyudaEscolar;

	@Column(name="IMP_AYUDA_GF", precision=14, scale=2)
	private Long impAyudaGf;

	@Column(name="IMP_AYUDA_RENTA", precision=14, scale=2)
	private Long impAyudaRenta;

	@Column(name="IMP_AYUDA_TRANSPORTE", precision=14, scale=2)
	private Long impAyudaTransporte;

	@Column(name="IMP_BECA_TRABAJADOR_HIJO", precision=14, scale=2)
	private Long impBecaTrabajadorHijo;

	@Column(name="IMP_CAJA_AHORRO", precision=14, scale=2)
	private Long impCajaAhorro;

	@Column(name="IMP_CONTRIBUCION_PATRON", precision=14, scale=2)
	private Long impContribucionPatron;

	@Column(name="IMP_CUOTA_SINDICAL", precision=14, scale=2)
	private Long impCuotaSindical;

	@Column(name="IMP_FONDO_AHORRO", precision=14, scale=2)
	private Long impFondoAhorro;

	@Column(name="IMP_GRATIFICACIONES", precision=14, scale=2)
	private Long impGratificaciones;

	@Column(name="IMP_JUB_PEN_RETIRO", precision=14, scale=2)
	private Long impJubPenRetiro;

	@Column(name="IMP_OTROS_INGRESOS_XSALARIO", precision=14, scale=2)
	private Long impOtrosIngresosXsalario;

	@Column(name="IMP_OTROS_PAGOS_XSEPARACION", precision=14, scale=2)
	private Long impOtrosPagosXseparacion;

	@Column(name="IMP_PAGO_OTRO_EMPLEADOR", precision=14, scale=2)
	private Long impPagoOtroEmpleador;

	@Column(name="IMP_PREMIO_ASISTENCIA", precision=14, scale=2)
	private Long impPremioAsistencia;

	@Column(name="IMP_PREMIO_PUNTUALIDAD", precision=14, scale=2)
	private Long impPremioPuntualidad;

	@Column(name="IMP_PRIMA_DOMINICAL", precision=14, scale=2)
	private Long impPrimaDominical;

	@Column(name="IMP_PRIMA_SEGURO_VIDA", precision=14, scale=2)
	private Long impPrimaSeguroVida;

	@Column(name="IMP_PRIMA_VACACIONAL", precision=14, scale=2)
	private Long impPrimaVacacional;

	@Column(name="IMP_PTU", precision=14, scale=2)
	private Long impPtu;

	@Column(name="IMP_REEMBOLSO_GM", precision=14, scale=2)
	private Long impReembolsoGm;

	@Column(name="IMP_SEGURO_GMM", precision=14, scale=2)
	private Long impSeguroGmm;

	@Column(name="IMP_SUBSIDIO_INCAPACIDAD", precision=14, scale=2)
	private Long impSubsidioIncapacidad;

	@Column(name="IMP_SUELDOS_SALARIOS", precision=14, scale=2)
	private Long impSueldosSalarios;

	@Column(name="IMP_TIEMPO_EXTRA", precision=14, scale=2)
	private Long impTiempoExtra;

	@Column(name="IMP_TOTAL", precision=14, scale=2)
	private Long impTotal;

	@Column(name="IMP_VALES_DESPENSA", precision=14, scale=2)
	private Long impValesDespensa;

	@Column(name="IMP_VALES_GASOLINA", precision=14, scale=2)
	private Long impValesGasolina;

	@Column(name="IMP_VALES_RESTAURANT", precision=14, scale=2)
	private Long impValesRestaurant;

	@Column(name="IMP_VALES_ROPA", precision=14, scale=2)
	private Long impValesRopa;

	@Column(name="IMP_VIATICOS", precision=14, scale=2)
	private Long impViaticos;

	@Column(name="NOM_NOMBRE_TRABAJADOR", length=100)
	private String nomNombreTrabajador;

	@Column(name="NOM_PRIMER_APELLIDO_TRABAJADOR", length=100)
	private String nomPrimerApellidoTrabajador;

	@Column(name="NOM_SEGUNDO_AELLIDO_TRABAJADOR", length=100)
	private String nomSegundoAellidoTrabajador;

	@Column(name="NUM_NSS_TRABAJADOR", length=11)
	private String numNssTrabajador;

	@Column(name="REG_PATRONAL", length=13)
	private String regPatronal;

	@Column(name="RFC_TRABAJADOR", length=13)
	private String rfcTrabajador;

	//bi-directional many-to-one association to NdtPatronDictamen
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_PATRON_DICTAMEN")
	private NdtPatronDictamen ndtPatronDictamen;

	public NdtA1PercepTrabajador() {
	}

	public Long getCveIdA1Perceptrab() {
		return cveIdA1Perceptrab;
	}

	public void setCveIdA1Perceptrab(Long cveIdA1Perceptrab) {
		this.cveIdA1Perceptrab = cveIdA1Perceptrab;
	}

	public String getCurpTrabajador() {
		return curpTrabajador;
	}

	public void setCurpTrabajador(String curpTrabajador) {
		this.curpTrabajador = curpTrabajador;
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

	public Long getImpAyudaAnteojos() {
		return impAyudaAnteojos;
	}

	public void setImpAyudaAnteojos(Long impAyudaAnteojos) {
		this.impAyudaAnteojos = impAyudaAnteojos;
	}

	public Long getImpAyudaEscolar() {
		return impAyudaEscolar;
	}

	public void setImpAyudaEscolar(Long impAyudaEscolar) {
		this.impAyudaEscolar = impAyudaEscolar;
	}

	public Long getImpAyudaGf() {
		return impAyudaGf;
	}

	public void setImpAyudaGf(Long impAyudaGf) {
		this.impAyudaGf = impAyudaGf;
	}

	public Long getImpAyudaRenta() {
		return impAyudaRenta;
	}

	public void setImpAyudaRenta(Long impAyudaRenta) {
		this.impAyudaRenta = impAyudaRenta;
	}

	public Long getImpAyudaTransporte() {
		return impAyudaTransporte;
	}

	public void setImpAyudaTransporte(Long impAyudaTransporte) {
		this.impAyudaTransporte = impAyudaTransporte;
	}

	public Long getImpBecaTrabajadorHijo() {
		return impBecaTrabajadorHijo;
	}

	public void setImpBecaTrabajadorHijo(Long impBecaTrabajadorHijo) {
		this.impBecaTrabajadorHijo = impBecaTrabajadorHijo;
	}

	public Long getImpCajaAhorro() {
		return impCajaAhorro;
	}

	public void setImpCajaAhorro(Long impCajaAhorro) {
		this.impCajaAhorro = impCajaAhorro;
	}

	public Long getImpContribucionPatron() {
		return impContribucionPatron;
	}

	public void setImpContribucionPatron(Long impContribucionPatron) {
		this.impContribucionPatron = impContribucionPatron;
	}

	public Long getImpCuotaSindical() {
		return impCuotaSindical;
	}

	public void setImpCuotaSindical(Long impCuotaSindical) {
		this.impCuotaSindical = impCuotaSindical;
	}

	public Long getImpFondoAhorro() {
		return impFondoAhorro;
	}

	public void setImpFondoAhorro(Long impFondoAhorro) {
		this.impFondoAhorro = impFondoAhorro;
	}

	public Long getImpGratificaciones() {
		return impGratificaciones;
	}

	public void setImpGratificaciones(Long impGratificaciones) {
		this.impGratificaciones = impGratificaciones;
	}

	public Long getImpJubPenRetiro() {
		return impJubPenRetiro;
	}

	public void setImpJubPenRetiro(Long impJubPenRetiro) {
		this.impJubPenRetiro = impJubPenRetiro;
	}

	public Long getImpOtrosIngresosXsalario() {
		return impOtrosIngresosXsalario;
	}

	public void setImpOtrosIngresosXsalario(Long impOtrosIngresosXsalario) {
		this.impOtrosIngresosXsalario = impOtrosIngresosXsalario;
	}

	public Long getImpOtrosPagosXseparacion() {
		return impOtrosPagosXseparacion;
	}

	public void setImpOtrosPagosXseparacion(Long impOtrosPagosXseparacion) {
		this.impOtrosPagosXseparacion = impOtrosPagosXseparacion;
	}

	public Long getImpPagoOtroEmpleador() {
		return impPagoOtroEmpleador;
	}

	public void setImpPagoOtroEmpleador(Long impPagoOtroEmpleador) {
		this.impPagoOtroEmpleador = impPagoOtroEmpleador;
	}

	public Long getImpPremioAsistencia() {
		return impPremioAsistencia;
	}

	public void setImpPremioAsistencia(Long impPremioAsistencia) {
		this.impPremioAsistencia = impPremioAsistencia;
	}

	public Long getImpPremioPuntualidad() {
		return impPremioPuntualidad;
	}

	public void setImpPremioPuntualidad(Long impPremioPuntualidad) {
		this.impPremioPuntualidad = impPremioPuntualidad;
	}

	public Long getImpPrimaDominical() {
		return impPrimaDominical;
	}

	public void setImpPrimaDominical(Long impPrimaDominical) {
		this.impPrimaDominical = impPrimaDominical;
	}

	public Long getImpPrimaSeguroVida() {
		return impPrimaSeguroVida;
	}

	public void setImpPrimaSeguroVida(Long impPrimaSeguroVida) {
		this.impPrimaSeguroVida = impPrimaSeguroVida;
	}

	public Long getImpPrimaVacacional() {
		return impPrimaVacacional;
	}

	public void setImpPrimaVacacional(Long impPrimaVacacional) {
		this.impPrimaVacacional = impPrimaVacacional;
	}

	public Long getImpPtu() {
		return impPtu;
	}

	public void setImpPtu(Long impPtu) {
		this.impPtu = impPtu;
	}

	public Long getImpReembolsoGm() {
		return impReembolsoGm;
	}

	public void setImpReembolsoGm(Long impReembolsoGm) {
		this.impReembolsoGm = impReembolsoGm;
	}

	public Long getImpSeguroGmm() {
		return impSeguroGmm;
	}

	public void setImpSeguroGmm(Long impSeguroGmm) {
		this.impSeguroGmm = impSeguroGmm;
	}

	public Long getImpSubsidioIncapacidad() {
		return impSubsidioIncapacidad;
	}

	public void setImpSubsidioIncapacidad(Long impSubsidioIncapacidad) {
		this.impSubsidioIncapacidad = impSubsidioIncapacidad;
	}

	public Long getImpSueldosSalarios() {
		return impSueldosSalarios;
	}

	public void setImpSueldosSalarios(Long impSueldosSalarios) {
		this.impSueldosSalarios = impSueldosSalarios;
	}

	public Long getImpTiempoExtra() {
		return impTiempoExtra;
	}

	public void setImpTiempoExtra(Long impTiempoExtra) {
		this.impTiempoExtra = impTiempoExtra;
	}

	public Long getImpTotal() {
		return impTotal;
	}

	public void setImpTotal(Long impTotal) {
		this.impTotal = impTotal;
	}

	public Long getImpValesDespensa() {
		return impValesDespensa;
	}

	public void setImpValesDespensa(Long impValesDespensa) {
		this.impValesDespensa = impValesDespensa;
	}

	public Long getImpValesGasolina() {
		return impValesGasolina;
	}

	public void setImpValesGasolina(Long impValesGasolina) {
		this.impValesGasolina = impValesGasolina;
	}

	public Long getImpValesRestaurant() {
		return impValesRestaurant;
	}

	public void setImpValesRestaurant(Long impValesRestaurant) {
		this.impValesRestaurant = impValesRestaurant;
	}

	public Long getImpValesRopa() {
		return impValesRopa;
	}

	public void setImpValesRopa(Long impValesRopa) {
		this.impValesRopa = impValesRopa;
	}

	public Long getImpViaticos() {
		return impViaticos;
	}

	public void setImpViaticos(Long impViaticos) {
		this.impViaticos = impViaticos;
	}

	public String getNomNombreTrabajador() {
		return nomNombreTrabajador;
	}

	public void setNomNombreTrabajador(String nomNombreTrabajador) {
		this.nomNombreTrabajador = nomNombreTrabajador;
	}

	public String getNomPrimerApellidoTrabajador() {
		return nomPrimerApellidoTrabajador;
	}

	public void setNomPrimerApellidoTrabajador(String nomPrimerApellidoTrabajador) {
		this.nomPrimerApellidoTrabajador = nomPrimerApellidoTrabajador;
	}

	public String getNomSegundoAellidoTrabajador() {
		return nomSegundoAellidoTrabajador;
	}

	public void setNomSegundoAellidoTrabajador(String nomSegundoAellidoTrabajador) {
		this.nomSegundoAellidoTrabajador = nomSegundoAellidoTrabajador;
	}

	public String getNumNssTrabajador() {
		return numNssTrabajador;
	}

	public void setNumNssTrabajador(String numNssTrabajador) {
		this.numNssTrabajador = numNssTrabajador;
	}

	public String getRegPatronal() {
		return regPatronal;
	}

	public void setRegPatronal(String regPatronal) {
		this.regPatronal = regPatronal;
	}

	public String getRfcTrabajador() {
		return rfcTrabajador;
	}

	public void setRfcTrabajador(String rfcTrabajador) {
		this.rfcTrabajador = rfcTrabajador;
	}

	public NdtPatronDictamen getNdtPatronDictamen() {
		return ndtPatronDictamen;
	}

	public void setNdtPatronDictamen(NdtPatronDictamen ndtPatronDictamen) {
		this.ndtPatronDictamen = ndtPatronDictamen;
	}

}