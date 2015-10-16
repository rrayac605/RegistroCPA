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
@Table(name="NDT_A9_1_1_PERSONAL_OBRA")
@NamedQuery(name="NdtA911PersonalObra.findAll", query="SELECT n FROM NdtA911PersonalObra n")
public class NdtA911PersonalObra implements Serializable {
	
	private static final long serialVersionUID = -6910194479637861919L;
	
	@Id
	@Column(name="CVE_ID_A9_1_1_PERSONAL_OBRA", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtA911PersonalObra_Id_Seq_Gen", sequenceName = "SEQ_NDTA911PERSONALOBRA")
    @GeneratedValue(generator = "NdtA911PersonalObra_Id_Seq_Gen")
	private Long cveIdA911PersonalObra;

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

	@Column(name="NOM_NOMBRE", length=100)
	private String nomNombre;

	@Column(name="NOM_PRIMER_APELLIDO", length=100)
	private String nomPrimerApellido;

	@Column(name="NOM_SEGUNDO_APELLIDO", length=100)
	private String nomSegundoApellido;

	@Column(name="NUM_NSS", length=11)
	private String numNss;

	@Column(name="NUM_REG_OBRA_IMSS", precision=15)
	private Long numRegObraImss;

	//bi-directional many-to-one association to NdtPatronDictamen
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_PATRON_DICTAMEN")
	private NdtPatronDictamen ndtPatronDictamen;

	public NdtA911PersonalObra() {
	}

	public Long getCveIdA911PersonalObra() {
		return cveIdA911PersonalObra;
	}

	public void setCveIdA911PersonalObra(Long cveIdA911PersonalObra) {
		this.cveIdA911PersonalObra = cveIdA911PersonalObra;
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

	public String getNomNombre() {
		return nomNombre;
	}

	public void setNomNombre(String nomNombre) {
		this.nomNombre = nomNombre;
	}

	public String getNomPrimerApellido() {
		return nomPrimerApellido;
	}

	public void setNomPrimerApellido(String nomPrimerApellido) {
		this.nomPrimerApellido = nomPrimerApellido;
	}

	public String getNomSegundoApellido() {
		return nomSegundoApellido;
	}

	public void setNomSegundoApellido(String nomSegundoApellido) {
		this.nomSegundoApellido = nomSegundoApellido;
	}

	public String getNumNss() {
		return numNss;
	}

	public void setNumNss(String numNss) {
		this.numNss = numNss;
	}

	public Long getNumRegObraImss() {
		return numRegObraImss;
	}

	public void setNumRegObraImss(Long numRegObraImss) {
		this.numRegObraImss = numRegObraImss;
	}

	public NdtPatronDictamen getNdtPatronDictamen() {
		return ndtPatronDictamen;
	}

	public void setNdtPatronDictamen(NdtPatronDictamen ndtPatronDictamen) {
		this.ndtPatronDictamen = ndtPatronDictamen;
	}

}