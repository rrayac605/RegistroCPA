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
@Table(name="NDT_A6_SUBCONTRATACION_SP")
@NamedQuery(name="NdtA6SubcontratacionSp.findAll", query="SELECT n FROM NdtA6SubcontratacionSp n")
public class NdtA6SubcontratacionSp implements Serializable {
	
	private static final long serialVersionUID = 2510470013287742584L;
	
	@Id
	@Column(name="CVE_ID_A6_SUBCONTRATACION_SP", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtA6SubcontratacionSp_Id_Seq_Gen", sequenceName = "SEQ_NDTA6SUBCONTRATACIONSP")
    @GeneratedValue(generator = "NdtA6SubcontratacionSp_Id_Seq_Gen")
	private Long cveIdA6SubcontratacionSp;

	@Column(name="CVE_ID_USUARIO", length=20)
	private String cveIdUsuario;

	@Column(name="DES_FOLIO_SIPRESS", length=30)
	private String desFolioSipress;

	@Column(name="DES_OBJETO_CONTRATO_PSP", length=300)
	private String desObjetoContratoPsp;

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

	@Column(name="IND_ELEMENTOS_PSP", length=2)
	private String indElementosPsp;

	@Column(name="IND_RESPONSABLE_DIRECCION", length=2)
	private String indResponsableDireccion;

	@Column(name="NOM_NOMBRE_RAZONSOCIAL_PSP", length=100)
	private String nomNombreRazonsocialPsp;

	@Column(name="NUM_TRABAJADORES", precision=6)
	private Long numTrabajadores;

	@Column(name="REG_PATRONAL_PSP", length=13)
	private String regPatronalPsp;

	@Column(name="RFC_PSP", length=13)
	private String rfcPsp;

	//bi-directional many-to-one association to NdtPatronDictamen
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_PATRON_DICTAMEN")
	private NdtPatronDictamen ndtPatronDictamen;

	public NdtA6SubcontratacionSp() {
	}

	public Long getCveIdA6SubcontratacionSp() {
		return cveIdA6SubcontratacionSp;
	}

	public void setCveIdA6SubcontratacionSp(Long cveIdA6SubcontratacionSp) {
		this.cveIdA6SubcontratacionSp = cveIdA6SubcontratacionSp;
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

	public String getDesObjetoContratoPsp() {
		return desObjetoContratoPsp;
	}

	public void setDesObjetoContratoPsp(String desObjetoContratoPsp) {
		this.desObjetoContratoPsp = desObjetoContratoPsp;
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

	public String getNomNombreRazonsocialPsp() {
		return nomNombreRazonsocialPsp;
	}

	public void setNomNombreRazonsocialPsp(String nomNombreRazonsocialPsp) {
		this.nomNombreRazonsocialPsp = nomNombreRazonsocialPsp;
	}

	public Long getNumTrabajadores() {
		return numTrabajadores;
	}

	public void setNumTrabajadores(Long numTrabajadores) {
		this.numTrabajadores = numTrabajadores;
	}

	public String getRegPatronalPsp() {
		return regPatronalPsp;
	}

	public void setRegPatronalPsp(String regPatronalPsp) {
		this.regPatronalPsp = regPatronalPsp;
	}

	public String getRfcPsp() {
		return rfcPsp;
	}

	public void setRfcPsp(String rfcPsp) {
		this.rfcPsp = rfcPsp;
	}

	public NdtPatronDictamen getNdtPatronDictamen() {
		return ndtPatronDictamen;
	}

	public void setNdtPatronDictamen(NdtPatronDictamen ndtPatronDictamen) {
		this.ndtPatronDictamen = ndtPatronDictamen;
	}

}