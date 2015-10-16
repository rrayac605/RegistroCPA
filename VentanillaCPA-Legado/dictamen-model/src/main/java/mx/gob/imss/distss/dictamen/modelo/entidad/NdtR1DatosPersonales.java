package mx.gob.imss.distss.dictamen.modelo.entidad;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="NDT_R1_DATOS_PERSONALES")
@NamedQuery(name="NdtR1DatosPersonales.findAll", query="SELECT n FROM NdtR1DatosPersonales n")
public class NdtR1DatosPersonales implements Serializable {
	
	private static final long serialVersionUID = 2124713699050068964L;
	
	@Id
	@Column(name="CVE_ID_R1_DATOS_PERSONALES", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtR1DatosPersonales_Id_Seq_Gen", sequenceName = "SEQ_NDTR1DATOSPERSONALES")
    @GeneratedValue(generator = "NdtR1DatosPersonales_Id_Seq_Gen")
	private Long cveIdR1DatosPersonales;

	@Column(name="CEDULA_PROFESIONAL", length=10)
	private String cedulaProfesional;

	@Column(name="CVE_ID_PFDOM_FISCAL")
	private Long cveIdPfdomFiscal;

	@Column(name="CVE_ID_SUBDELEGACION")
	private Long cveIdSubdelegacion;

	@Column(name="CVE_ID_USUARIO", length=18)
	private String cveIdUsuario;

	@Column(name="DES_TITULO_EXPEDIDO_POR", length=100)
	private String desTituloExpedidoPor;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_EXPEDICION_CEDPROF")
	private Date fecExpedicionCedprof;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-one association to NdtContadorPublicoAut
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_CPA", nullable=false)
	private NdtContadorPublicoAut ndtContadorPublicoAut;

	//bi-directional many-to-one association to NdtCpaTramite
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_CPA_TRAMITE")
	private NdtCpaTramite ndtCpaTramite;

	//bi-directional many-to-one association to NdtR1Formacontacto
	@OneToMany(mappedBy="ndtR1DatosPersonales")
	private List<NdtR1Formacontacto> listNdtR1Formacontactos;

	public NdtR1DatosPersonales() {
	}

	public Long getCveIdR1DatosPersonales() {
		return cveIdR1DatosPersonales;
	}

	public void setCveIdR1DatosPersonales(Long cveIdR1DatosPersonales) {
		this.cveIdR1DatosPersonales = cveIdR1DatosPersonales;
	}

	public String getCedulaProfesional() {
		return cedulaProfesional;
	}

	public void setCedulaProfesional(String cedulaProfesional) {
		this.cedulaProfesional = cedulaProfesional;
	}

	public Long getCveIdPfdomFiscal() {
		return cveIdPfdomFiscal;
	}

	public void setCveIdPfdomFiscal(Long cveIdPfdomFiscal) {
		this.cveIdPfdomFiscal = cveIdPfdomFiscal;
	}

	public Long getCveIdSubdelegacion() {
		return cveIdSubdelegacion;
	}

	public void setCveIdSubdelegacion(Long cveIdSubdelegacion) {
		this.cveIdSubdelegacion = cveIdSubdelegacion;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public String getDesTituloExpedidoPor() {
		return desTituloExpedidoPor;
	}

	public void setDesTituloExpedidoPor(String desTituloExpedidoPor) {
		this.desTituloExpedidoPor = desTituloExpedidoPor;
	}

	public Date getFecExpedicionCedprof() {
		return fecExpedicionCedprof;
	}

	public void setFecExpedicionCedprof(Date fecExpedicionCedprof) {
		this.fecExpedicionCedprof = fecExpedicionCedprof;
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

	public NdtContadorPublicoAut getNdtContadorPublicoAut() {
		return ndtContadorPublicoAut;
	}

	public void setNdtContadorPublicoAut(NdtContadorPublicoAut ndtContadorPublicoAut) {
		this.ndtContadorPublicoAut = ndtContadorPublicoAut;
	}

	public NdtCpaTramite getNdtCpaTramite() {
		return ndtCpaTramite;
	}

	public void setNdtCpaTramite(NdtCpaTramite ndtCpaTramite) {
		this.ndtCpaTramite = ndtCpaTramite;
	}

	public List<NdtR1Formacontacto> getListNdtR1Formacontactos() {
		return listNdtR1Formacontactos;
	}

	public void setListNdtR1Formacontactos(List<NdtR1Formacontacto> listNdtR1Formacontactos) {
		this.listNdtR1Formacontactos = listNdtR1Formacontactos;
	}

}