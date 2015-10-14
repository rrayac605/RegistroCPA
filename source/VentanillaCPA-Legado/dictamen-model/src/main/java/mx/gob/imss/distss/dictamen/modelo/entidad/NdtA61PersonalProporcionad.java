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
@Table(name="NDT_A6_1_PERSONAL_PROPORCIONAD")
@NamedQuery(name="NdtA61PersonalProporcionad.findAll", query="SELECT n FROM NdtA61PersonalProporcionad n")
public class NdtA61PersonalProporcionad implements Serializable {
	
	private static final long serialVersionUID = -819722598231116368L;
	
	@Id
	@Column(name="CVE_ID_A61_LISTADOPERSONAL", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtA61PersonalProporcionad_Id_Seq_Gen", sequenceName = "SEQ_NDTA61PERSONALPROPORCIONAD")
    @GeneratedValue(generator = "NdtA61PersonalProporcionad_Id_Seq_Gen")
	private Long cveIdA61Listadopersonal;

	@Column(name="CURP_TRAB", length=18)
	private String curpTrab;

	@Column(name="CVE_ID_USUARIO", length=20)
	private String cveIdUsuario;

	@Column(name="DES_FOLIO_SIPRESS", length=30)
	private String desFolioSipress;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="NOM_NOMBRE_TRAB", length=100)
	private String nomNombreTrab;

	@Column(name="NOM_PRIMER_APELLIDO_TRAB", length=100)
	private String nomPrimerApellidoTrab;

	@Column(name="NOM_SEGUNDO_APELLIDO_TRAB", length=100)
	private String nomSegundoApellidoTrab;

	@Column(name="NUM_NSS_TRAB", length=11)
	private String numNssTrab;

	@Column(name="RFC_TRAB", length=13)
	private String rfcTrab;

	//bi-directional many-to-one association to NdtPatronDictamen
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_PATRON_DICTAMEN")
	private NdtPatronDictamen ndtPatronDictamen;

	public NdtA61PersonalProporcionad() {
	}

	public Long getCveIdA61Listadopersonal() {
		return cveIdA61Listadopersonal;
	}

	public void setCveIdA61Listadopersonal(Long cveIdA61Listadopersonal) {
		this.cveIdA61Listadopersonal = cveIdA61Listadopersonal;
	}

	public String getCurpTrab() {
		return curpTrab;
	}

	public void setCurpTrab(String curpTrab) {
		this.curpTrab = curpTrab;
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

	public String getNomNombreTrab() {
		return nomNombreTrab;
	}

	public void setNomNombreTrab(String nomNombreTrab) {
		this.nomNombreTrab = nomNombreTrab;
	}

	public String getNomPrimerApellidoTrab() {
		return nomPrimerApellidoTrab;
	}

	public void setNomPrimerApellidoTrab(String nomPrimerApellidoTrab) {
		this.nomPrimerApellidoTrab = nomPrimerApellidoTrab;
	}

	public String getNomSegundoApellidoTrab() {
		return nomSegundoApellidoTrab;
	}

	public void setNomSegundoApellidoTrab(String nomSegundoApellidoTrab) {
		this.nomSegundoApellidoTrab = nomSegundoApellidoTrab;
	}

	public String getNumNssTrab() {
		return numNssTrab;
	}

	public void setNumNssTrab(String numNssTrab) {
		this.numNssTrab = numNssTrab;
	}

	public String getRfcTrab() {
		return rfcTrab;
	}

	public void setRfcTrab(String rfcTrab) {
		this.rfcTrab = rfcTrab;
	}

	public NdtPatronDictamen getNdtPatronDictamen() {
		return ndtPatronDictamen;
	}

	public void setNdtPatronDictamen(NdtPatronDictamen ndtPatronDictamen) {
		this.ndtPatronDictamen = ndtPatronDictamen;
	}

}