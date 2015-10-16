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
@Table(name="NDT_A7_4_CE_TRANSPORTE")
@NamedQuery(name="NdtA74CeTransporte.findAll", query="SELECT n FROM NdtA74CeTransporte n")
public class NdtA74CeTransporte implements Serializable {
	
	private static final long serialVersionUID = -2147727881019538277L;
	
	@Id
	@Column(name="CVE_ID_A7_4_CE_TRANSPORTE", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtA74CeTransporte_Id_Seq_Gen", sequenceName = "SEQ_NDTA74CETRANSPORTE")
    @GeneratedValue(generator = "NdtA74CeTransporte_Id_Seq_Gen")
	private Long cveIdA74CeTransporte;

	@Column(name="CVE_ID_USUARIO", length=20)
	private String cveIdUsuario;

	@Column(name="DES_CAPACIDAD_POTENCIA", length=20)
	private String desCapacidadPotencia;

	@Column(name="DES_TIPO_COMBUSTIBLE", length=50)
	private String desTipoCombustible;

	@Column(name="DES_TIPO_USO", length=30)
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

	@Column(name="NOM_TRANSPORTE", length=100)
	private String nomTransporte;

	@Column(name="NUM_UNIDAD", precision=6)
	private Long numUnidad;

	@Column(name="REG_PATRONAL", length=11)
	private String regPatronal;

	//bi-directional many-to-one association to NdtPatronDictamen
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_PATRON_DICTAMEN")
	private NdtPatronDictamen ndtPatronDictamen;

	public NdtA74CeTransporte() {
	}

	public Long getCveIdA74CeTransporte() {
		return cveIdA74CeTransporte;
	}

	public void setCveIdA74CeTransporte(Long cveIdA74CeTransporte) {
		this.cveIdA74CeTransporte = cveIdA74CeTransporte;
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

	public String getDesTipoCombustible() {
		return desTipoCombustible;
	}

	public void setDesTipoCombustible(String desTipoCombustible) {
		this.desTipoCombustible = desTipoCombustible;
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

	public String getNomTransporte() {
		return nomTransporte;
	}

	public void setNomTransporte(String nomTransporte) {
		this.nomTransporte = nomTransporte;
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