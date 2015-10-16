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
@Table(name="NDT_A9_2_1_PERS_SUBCONTRATADO")
@NamedQuery(name="NdtA921PersSubcontratado.findAll", query="SELECT n FROM NdtA921PersSubcontratado n")
public class NdtA921PersSubcontratado implements Serializable {
	
	private static final long serialVersionUID = -6202813756980043969L;
	
	@Id
	@Column(name="CVE_ID_A9_2_1_PERS_SUBCONTRATA", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtA921PersSubcontratado_Id_Seq_Gen", sequenceName = "SEQ_NDTA921PERSSUBCONTRATADO")
    @GeneratedValue(generator = "NdtA921PersSubcontratado_Id_Seq_Gen")
	private Long cveIdA921PersSubcontrata;

	@Column(name="CVE_USUARIO", length=20)
	private String cveUsuario;

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

	public NdtA921PersSubcontratado() {
	}

	public Long getCveIdA921PersSubcontrata() {
		return cveIdA921PersSubcontrata;
	}

	public void setCveIdA921PersSubcontrata(Long cveIdA921PersSubcontrata) {
		this.cveIdA921PersSubcontrata = cveIdA921PersSubcontrata;
	}

	public String getCveUsuario() {
		return cveUsuario;
	}

	public void setCveUsuario(String cveUsuario) {
		this.cveUsuario = cveUsuario;
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