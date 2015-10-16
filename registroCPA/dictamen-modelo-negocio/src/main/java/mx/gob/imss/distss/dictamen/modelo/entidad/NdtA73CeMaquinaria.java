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
@Table(name="NDT_A7_3_CE_MAQUINARIA")
@NamedQuery(name="NdtA73CeMaquinaria.findAll", query="SELECT n FROM NdtA73CeMaquinaria n")
public class NdtA73CeMaquinaria implements Serializable {
	
	private static final long serialVersionUID = 8273417592624650067L;
	
	@Id
	@Column(name="CVE_ID_A7_3_CE_MAQUINARIA", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtA73CeMaquinaria_Id_Seq_Gen", sequenceName = "SEQ_NDTA73CEMAQUINARIA")
    @GeneratedValue(generator = "NdtA73CeMaquinaria_Id_Seq_Gen")
	private Long cveIdA73CeMaquinaria;

	@Column(name="CVE_ID_USUARIO", length=20)
	private String cveIdUsuario;

	@Column(name="DES_CAPACIDAD_POTENCIA", length=20)
	private String desCapacidadPotencia;

	@Column(name="DES_TIPO_MOTOR", length=50)
	private String desTipoMotor;

	@Column(name="DES_TIPO_USO", length=20)
	private String desTipoUso;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="NOM_MAQUINARIA", length=100)
	private String nomMaquinaria;

	@Column(name="NUM_UNIDAD", precision=6)
	private Long numUnidad;

	@Column(name="REG_PATRONAL", length=11)
	private String regPatronal;

	//bi-directional many-to-one association to NdtPatronDictamen
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_PATRON_DICTAMEN")
	private NdtPatronDictamen ndtPatronDictamen;

	public NdtA73CeMaquinaria() {
	}

	public Long getCveIdA73CeMaquinaria() {
		return cveIdA73CeMaquinaria;
	}

	public void setCveIdA73CeMaquinaria(Long cveIdA73CeMaquinaria) {
		this.cveIdA73CeMaquinaria = cveIdA73CeMaquinaria;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public String getDesCapacidadPotencia() {
		return desCapacidadPotencia;
	}

	public void setDesCapacidadPotencia(String desCapacidadPotencia) {
		this.desCapacidadPotencia = desCapacidadPotencia;
	}

	public String getDesTipoMotor() {
		return desTipoMotor;
	}

	public void setDesTipoMotor(String desTipoMotor) {
		this.desTipoMotor = desTipoMotor;
	}

	public String getDesTipoUso() {
		return desTipoUso;
	}

	public void setDesTipoUso(String desTipoUso) {
		this.desTipoUso = desTipoUso;
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

	public String getNomMaquinaria() {
		return nomMaquinaria;
	}

	public void setNomMaquinaria(String nomMaquinaria) {
		this.nomMaquinaria = nomMaquinaria;
	}

	public Long getNumUnidad() {
		return numUnidad;
	}

	public void setNumUnidad(Long numUnidad) {
		this.numUnidad = numUnidad;
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