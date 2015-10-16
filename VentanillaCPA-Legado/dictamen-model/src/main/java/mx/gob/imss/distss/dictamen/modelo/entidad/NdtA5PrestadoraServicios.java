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
@Table(name="NDT_A5_PRESTADORA_SERVICIOS")
@NamedQuery(name="NdtA5PrestadoraServicios.findAll", query="SELECT n FROM NdtA5PrestadoraServicios n")
public class NdtA5PrestadoraServicios implements Serializable {
	
	private static final long serialVersionUID = 6843156689616952138L;
	
	@Id
	@Column(name="CVE_ID_A5_PRESTADORA_SERVICIOS", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtA5PrestadoraServicio_Id_Seq_Gen", sequenceName = "SEQ_NDTA5PRESTADORASERVICIOS")
    @GeneratedValue(generator = "NdtA5PrestadoraServicio_Id_Seq_Gen")
	private Long cveIdA5PrestadoraServicios;

	@Column(name="CVE_ID_USUARIO", length=20)
	private String cveIdUsuario;

	@Column(name="DES_FOLIO_SIPRESS", length=30)
	private String desFolioSipress;

	@Column(name="DES_OBJETO_CONTRATO", length=3000)
	private String desObjetoContrato;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_CONCLUSION_CONTRATO")
	private Date fecConclusionContrato;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_INICIO_CONTRATO")
	private Date fecInicioContrato;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="IMP_COSTO_ANUAL_NOMINA", precision=14, scale=2)
	private Long impCostoAnualNomina;

	@Column(name="IND_ELEMENTOS_PSP", length=2)
	private String indElementosPsp;

	@Column(name="IND_RESPONSABLE_DIRECCION", length=2)
	private String indResponsableDireccion;

	@Column(name="NOM_NOMBRE_RAZONSOCIAL_BEN", length=300)
	private String nomNombreRazonsocialBen;

	@Column(name="NUM_TRABAJADORES", precision=6)
	private Long numTrabajadores;

	@Column(name="REG_PATRONAL_BENEFICIARIO", length=13)
	private String regPatronalBeneficiario;

	@Column(name="RFC_BENEFICIARIO", length=13)
	private String rfcBeneficiario;

	//bi-directional many-to-one association to NdtPatronDictamen
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_PATRON_DICTAMEN")
	private NdtPatronDictamen ndtPatronDictamen;

	public NdtA5PrestadoraServicios() {
	}

	public Long getCveIdA5PrestadoraServicios() {
		return cveIdA5PrestadoraServicios;
	}

	public void setCveIdA5PrestadoraServicios(Long cveIdA5PrestadoraServicios) {
		this.cveIdA5PrestadoraServicios = cveIdA5PrestadoraServicios;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public String getDesFolioSipress() {
		return desFolioSipress;
	}

	public void setDesFolioSipress(String desFolioSipress) {
		this.desFolioSipress = desFolioSipress;
	}

	public String getDesObjetoContrato() {
		return desObjetoContrato;
	}

	public void setDesObjetoContrato(String desObjetoContrato) {
		this.desObjetoContrato = desObjetoContrato;
	}

	public Date getFecConclusionContrato() {
		return fecConclusionContrato;
	}

	public void setFecConclusionContrato(Date fecConclusionContrato) {
		this.fecConclusionContrato = fecConclusionContrato;
	}

	public Date getFecInicioContrato() {
		return fecInicioContrato;
	}

	public void setFecInicioContrato(Date fecInicioContrato) {
		this.fecInicioContrato = fecInicioContrato;
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

	public Long getImpCostoAnualNomina() {
		return impCostoAnualNomina;
	}

	public void setImpCostoAnualNomina(Long impCostoAnualNomina) {
		this.impCostoAnualNomina = impCostoAnualNomina;
	}

	public String getIndElementosPsp() {
		return indElementosPsp;
	}

	public void setIndElementosPsp(String indElementosPsp) {
		this.indElementosPsp = indElementosPsp;
	}

	public String getIndResponsableDireccion() {
		return indResponsableDireccion;
	}

	public void setIndResponsableDireccion(String indResponsableDireccion) {
		this.indResponsableDireccion = indResponsableDireccion;
	}

	public String getNomNombreRazonsocialBen() {
		return nomNombreRazonsocialBen;
	}

	public void setNomNombreRazonsocialBen(String nomNombreRazonsocialBen) {
		this.nomNombreRazonsocialBen = nomNombreRazonsocialBen;
	}

	public Long getNumTrabajadores() {
		return numTrabajadores;
	}

	public void setNumTrabajadores(Long numTrabajadores) {
		this.numTrabajadores = numTrabajadores;
	}

	public String getRegPatronalBeneficiario() {
		return regPatronalBeneficiario;
	}

	public void setRegPatronalBeneficiario(String regPatronalBeneficiario) {
		this.regPatronalBeneficiario = regPatronalBeneficiario;
	}

	public String getRfcBeneficiario() {
		return rfcBeneficiario;
	}

	public void setRfcBeneficiario(String rfcBeneficiario) {
		this.rfcBeneficiario = rfcBeneficiario;
	}

	public NdtPatronDictamen getNdtPatronDictamen() {
		return ndtPatronDictamen;
	}

	public void setNdtPatronDictamen(NdtPatronDictamen ndtPatronDictamen) {
		this.ndtPatronDictamen = ndtPatronDictamen;
	}

}