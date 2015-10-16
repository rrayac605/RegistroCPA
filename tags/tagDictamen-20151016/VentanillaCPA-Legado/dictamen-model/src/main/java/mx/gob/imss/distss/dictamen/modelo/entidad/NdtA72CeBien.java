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
@Table(name="NDT_A7_2_CE_BIEN")
@NamedQuery(name="NdtA72CeBien.findAll", query="SELECT n FROM NdtA72CeBien n")
public class NdtA72CeBien implements Serializable {
	
	private static final long serialVersionUID = -6390997966073676431L;
	
	@Id
	@Column(name="CVE_ID_A7_2_CE_BIEN", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtA72CeBien_Id_Seq_Gen", sequenceName = "SEQ_NDTA72CEBIEN")
    @GeneratedValue(generator = "NdtA72CeBien_Id_Seq_Gen")
	private Long cveIdA72CeBien;

	@Column(name="CVE_ID_USUARIO", length=20)
	private String cveIdUsuario;

	@Column(name="DES_BIEN_ELABORADO_SP", length=1000)
	private String desBienElaboradoSp;

	@Column(name="DES_MATERIA_PRIMA_UTILIZADA", length=1000)
	private String desMateriaPrimaUtilizada;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="REG_PATRONAL", length=11)
	private String regPatronal;

	//bi-directional many-to-one association to NdtPatronDictamen
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_PATRON_DICTAMEN")
	private NdtPatronDictamen ndtPatronDictamen;

	public NdtA72CeBien() {
	}

	public Long getCveIdA72CeBien() {
		return cveIdA72CeBien;
	}

	public void setCveIdA72CeBien(Long cveIdA72CeBien) {
		this.cveIdA72CeBien = cveIdA72CeBien;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public String getDesBienElaboradoSp() {
		return desBienElaboradoSp;
	}

	public void setDesBienElaboradoSp(String desBienElaboradoSp) {
		this.desBienElaboradoSp = desBienElaboradoSp;
	}

	public String getDesMateriaPrimaUtilizada() {
		return desMateriaPrimaUtilizada;
	}

	public void setDesMateriaPrimaUtilizada(String desMateriaPrimaUtilizada) {
		this.desMateriaPrimaUtilizada = desMateriaPrimaUtilizada;
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