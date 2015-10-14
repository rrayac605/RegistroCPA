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
@Table(name="NDT_A7_6_CE_ACT_COMP")
@NamedQuery(name="NdtA76CeActComp.findAll", query="SELECT n FROM NdtA76CeActComp n")
public class NdtA76CeActComp implements Serializable {
	
	private static final long serialVersionUID = -4258313616741795132L;
	
	@Id
	@Column(name="CVE_ID_A7_6_CE_ACT_COMP", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtA76CeActComp_Id_Seq_Gen", sequenceName = "SEQ_NDTA76CEACTCOMP")
    @GeneratedValue(generator = "NdtA76CeActComp_Id_Seq_Gen")
	private Long cveIdA76CeActComp;

	@Column(name="CVE_ID_USUARIO", length=20)
	private String cveIdUsuario;

	@Column(name="DES_TIPO_DISTRIBUCION", length=20)
	private String desTipoDistribucion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="IND_AC_SERV_ALMACENAJE", length=2)
	private String indAcServAlmacenaje;

	@Column(name="IND_AC_SERV_INSTALACION", length=2)
	private String indAcServInstalacion;

	@Column(name="IND_OTORGA_SGMM", length=2)
	private String indOtorgaSgmm;

	@Column(name="IND_PRESENTO_ESCRITO", length=2)
	private String indPresentoEscrito;

	@Column(name="REG_PATRONAL", length=13)
	private String regPatronal;

	//bi-directional many-to-one association to NdtPatronDictamen
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_PATRON_DICTAMEN")
	private NdtPatronDictamen ndtPatronDictamen;

	public NdtA76CeActComp() {
	}

	public Long getCveIdA76CeActComp() {
		return cveIdA76CeActComp;
	}

	public void setCveIdA76CeActComp(Long cveIdA76CeActComp) {
		this.cveIdA76CeActComp = cveIdA76CeActComp;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public String getDesTipoDistribucion() {
		return desTipoDistribucion;
	}

	public void setDesTipoDistribucion(String desTipoDistribucion) {
		this.desTipoDistribucion = desTipoDistribucion;
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

	public String getIndAcServAlmacenaje() {
		return indAcServAlmacenaje;
	}

	public void setIndAcServAlmacenaje(String indAcServAlmacenaje) {
		this.indAcServAlmacenaje = indAcServAlmacenaje;
	}

	public String getIndAcServInstalacion() {
		return indAcServInstalacion;
	}

	public void setIndAcServInstalacion(String indAcServInstalacion) {
		this.indAcServInstalacion = indAcServInstalacion;
	}

	public String getIndOtorgaSgmm() {
		return indOtorgaSgmm;
	}

	public void setIndOtorgaSgmm(String indOtorgaSgmm) {
		this.indOtorgaSgmm = indOtorgaSgmm;
	}

	public String getIndPresentoEscrito() {
		return indPresentoEscrito;
	}

	public void setIndPresentoEscrito(String indPresentoEscrito) {
		this.indPresentoEscrito = indPresentoEscrito;
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