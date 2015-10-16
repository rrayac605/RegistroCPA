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
@Table(name="NDT_A4_PAGO_PERSONA_FISICA")
@NamedQuery(name="NdtA4PagoPersonaFisica.findAll", query="SELECT n FROM NdtA4PagoPersonaFisica n")
public class NdtA4PagoPersonaFisica implements Serializable {
	
	private static final long serialVersionUID = -2703186988609354842L;
	
	@Id
	@Column(name="CVE_ID_A4_PAGOSPERSONASFISICAS", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtA4PagoPersonaFisica_Id_Seq_Gen", sequenceName = "SEQ_NDTA4PAGOPERSONAFISICA")
    @GeneratedValue(generator = "NdtA4PagoPersonaFisica_Id_Seq_Gen")
	private Long cveIdA4Pagospersonasfisicas;

	@Column(name="CURP_PF", length=18)
	private String curpPf;

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

	@Column(name="IMP_MONTO_OPERACIONES", precision=14, scale=2)
	private Long impMontoOperaciones;

	@Column(name="NOM_NOMBRE_PF", length=100)
	private String nomNombrePf;

	@Column(name="NOM_PRIMER_APELLIDO_PF", length=100)
	private String nomPrimerApellidoPf;

	@Column(name="NOM_SEGUNDO_APELLIDO_PF", length=100)
	private String nomSegundoApellidoPf;

	@Column(name="NUM_MESES_OPERO", precision=6)
	private Long numMesesOpero;

	@Column(name="RFC_PF", length=13)
	private String rfcPf;

	//bi-directional many-to-one association to NdtPatronDictamen
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_PATRON_DICTAMEN")
	private NdtPatronDictamen ndtPatronDictamen;

	public NdtA4PagoPersonaFisica() {
	}

	public Long getCveIdA4Pagospersonasfisicas() {
		return cveIdA4Pagospersonasfisicas;
	}

	public void setCveIdA4Pagospersonasfisicas(Long cveIdA4Pagospersonasfisicas) {
		this.cveIdA4Pagospersonasfisicas = cveIdA4Pagospersonasfisicas;
	}

	public String getCurpPf() {
		return curpPf;
	}

	public void setCurpPf(String curpPf) {
		this.curpPf = curpPf;
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

	public Long getImpMontoOperaciones() {
		return impMontoOperaciones;
	}

	public void setImpMontoOperaciones(Long impMontoOperaciones) {
		this.impMontoOperaciones = impMontoOperaciones;
	}

	public String getNomNombrePf() {
		return nomNombrePf;
	}

	public void setNomNombrePf(String nomNombrePf) {
		this.nomNombrePf = nomNombrePf;
	}

	public String getNomPrimerApellidoPf() {
		return nomPrimerApellidoPf;
	}

	public void setNomPrimerApellidoPf(String nomPrimerApellidoPf) {
		this.nomPrimerApellidoPf = nomPrimerApellidoPf;
	}

	public String getNomSegundoApellidoPf() {
		return nomSegundoApellidoPf;
	}

	public void setNomSegundoApellidoPf(String nomSegundoApellidoPf) {
		this.nomSegundoApellidoPf = nomSegundoApellidoPf;
	}

	public Long getNumMesesOpero() {
		return numMesesOpero;
	}

	public void setNumMesesOpero(Long numMesesOpero) {
		this.numMesesOpero = numMesesOpero;
	}

	public String getRfcPf() {
		return rfcPf;
	}

	public void setRfcPf(String rfcPf) {
		this.rfcPf = rfcPf;
	}

	public NdtPatronDictamen getNdtPatronDictamen() {
		return ndtPatronDictamen;
	}

	public void setNdtPatronDictamen(NdtPatronDictamen ndtPatronDictamen) {
		this.ndtPatronDictamen = ndtPatronDictamen;
	}

}