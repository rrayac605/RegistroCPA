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
@Table(name="NDT_A7_1_CE_PROCESO")
@NamedQuery(name="NdtA71CeProceso.findAll", query="SELECT n FROM NdtA71CeProceso n")
public class NdtA71CeProceso implements Serializable {
	
	private static final long serialVersionUID = 4944914453843982692L;
	
	@Id
	@Column(name="CVE_ID_A7_1_CE_PROCESO", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtA71CeProceso_Id_Seq_Gen", sequenceName = "SEQ_NDTA71CEPROCESO")
    @GeneratedValue(generator = "NdtA71CeProceso_Id_Seq_Gen")
	private Long cveIdA71CeProceso;

	@Column(name="CVE_ID_USUARIO", length=20)
	private String cveIdUsuario;

	@Column(name="DES_PROCESO_FINAL_XCT", length=1000)
	private String desProcesoFinalXct;

	@Column(name="DES_PROCESO_INICIAL_XCT", length=1000)
	private String desProcesoInicialXct;

	@Column(name="DES_PROCESO_INTERMEDIO_XCT", length=1000)
	private String desProcesoIntermedioXct;

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

	public NdtA71CeProceso() {
	}

	public Long getCveIdA71CeProceso() {
		return cveIdA71CeProceso;
	}

	public void setCveIdA71CeProceso(Long cveIdA71CeProceso) {
		this.cveIdA71CeProceso = cveIdA71CeProceso;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public String getDesProcesoFinalXct() {
		return desProcesoFinalXct;
	}

	public void setDesProcesoFinalXct(String desProcesoFinalXct) {
		this.desProcesoFinalXct = desProcesoFinalXct;
	}

	public String getDesProcesoInicialXct() {
		return desProcesoInicialXct;
	}

	public void setDesProcesoInicialXct(String desProcesoInicialXct) {
		this.desProcesoInicialXct = desProcesoInicialXct;
	}

	public String getDesProcesoIntermedioXct() {
		return desProcesoIntermedioXct;
	}

	public void setDesProcesoIntermedioXct(String desProcesoIntermedioXct) {
		this.desProcesoIntermedioXct = desProcesoIntermedioXct;
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