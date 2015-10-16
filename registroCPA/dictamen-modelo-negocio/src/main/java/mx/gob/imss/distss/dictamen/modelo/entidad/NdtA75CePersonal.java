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
@Table(name="NDT_A7_5_CE_PERSONAL")
@NamedQuery(name="NdtA75CePersonal.findAll", query="SELECT n FROM NdtA75CePersonal n")
public class NdtA75CePersonal implements Serializable {
	
	private static final long serialVersionUID = 8006679817167208357L;
	
	@Id
	@Column(name="CVE_ID_A7_5_CE_PERSONAL", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtA75CePersonal_Id_Seq_Gen", sequenceName = "SEQ_NDTA75CEPERSONAL")
    @GeneratedValue(generator = "NdtA75CePersonal_Id_Seq_Gen")
	private Long cveIdA75CePersonal;

	@Column(name="CVE_ID_USUARIO", length=20)
	private String cveIdUsuario;

	@Column(name="DES_TIPO_OFICIO_OCUPACION", length=50)
	private String desTipoOficioOcupacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="NUM_TRABAJADORES", precision=6)
	private Long numTrabajadores;

	@Column(name="REG_PATRONAL", length=11)
	private String regPatronal;

	//bi-directional many-to-one association to NdtPatronDictamen
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_PATRON_DICTAMEN")
	private NdtPatronDictamen ndtPatronDictamen;

	public NdtA75CePersonal() {
	}

	public Long getCveIdA75CePersonal() {
		return cveIdA75CePersonal;
	}

	public void setCveIdA75CePersonal(Long cveIdA75CePersonal) {
		this.cveIdA75CePersonal = cveIdA75CePersonal;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public String getDesTipoOficioOcupacion() {
		return desTipoOficioOcupacion;
	}

	public void setDesTipoOficioOcupacion(String desTipoOficioOcupacion) {
		this.desTipoOficioOcupacion = desTipoOficioOcupacion;
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

	public Long getNumTrabajadores() {
		return numTrabajadores;
	}

	public void setNumTrabajadores(Long numTrabajadores) {
		this.numTrabajadores = numTrabajadores;
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