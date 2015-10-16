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
@Table(name="NDT_CPA_TRAMITE")
@NamedQuery(name="NdtCpaTramite.findAll", query="SELECT n FROM NdtCpaTramite n")
public class NdtCpaTramite implements Serializable {
	
	private static final long serialVersionUID = 7901179946709236338L;
	
	@Id
	@Column(name="CVE_ID_CPA_TRAMITE", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtCpaTramite_Id_Seq_Gen", sequenceName = "SEQ_NDTCPATRAMITE")
    @GeneratedValue(generator = "NdtCpaTramite_Id_Seq_Gen")
	private Long cveIdCpaTramite;

	@Column(name="CVE_ID_TRAMITE")
	private Long cveIdTramite;

	@Column(name="CVE_ID_USUARIO", length=18)
	private String cveIdUsuario;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_AUTORIZACION_MOVIMIENTO")
	private Date fecAutorizacionMovimiento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_SOLICITUD_MOVIMIENTO")
	private Date fecSolicitudMovimiento;

	@Column(name="NUM_TRAMITE_NOTARIA", length=70)
	private String numTramiteNotaria;

	@Column(name="URL_ACUSE_NOTARIA", length=300)
	private String urlAcuseNotaria;
	
	@Column(name="RECIBO_NOTARIA", length=100)
	private String reciboNotaria;

	//bi-directional many-to-one association to NdtCpaAcreditacion
	@OneToMany(mappedBy="ndtCpaTramite")
	private List<NdtCpaAcreditacion> listNdtCpaAcreditacions;

	//bi-directional many-to-one association to NdtCpaEstatus
	@OneToMany(mappedBy="ndtCpaTramite")
	private List<NdtCpaEstatus> listNdtCpaEstatus;

	//bi-directional many-to-one association to NdtContadorPublicoAut
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_CPA")
	private NdtContadorPublicoAut ndtContadorPublicoAut;

	//bi-directional many-to-one association to NdtDocumentoProbatorio
	@OneToMany(mappedBy="ndtCpaTramite")
	private List<NdtDocumentoProbatorio> listNdtDocumentoProbatorios;

	//bi-directional many-to-one association to NdtR1DatosPersonales
	@OneToMany(mappedBy="ndtCpaTramite")
	private List<NdtR1DatosPersonales> listNdtR1DatosPersonales;

	//bi-directional many-to-one association to NdtR2Despacho
	@OneToMany(mappedBy="ndtCpaTramite")
	private List<NdtR2Despacho> listNdtR2Despachos;

	//bi-directional many-to-one association to NdtR3Colegio
	@OneToMany(mappedBy="ndtCpaTramite")
	private List<NdtR3Colegio> listNdtR3Colegios;

	public NdtCpaTramite() {
	}

	public Long getCveIdCpaTramite() {
		return cveIdCpaTramite;
	}

	public void setCveIdCpaTramite(Long cveIdCpaTramite) {
		this.cveIdCpaTramite = cveIdCpaTramite;
	}

	public Long getCveIdTramite() {
		return cveIdTramite;
	}

	public void setCveIdTramite(Long cveIdTramite) {
		this.cveIdTramite = cveIdTramite;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public Date getFecAutorizacionMovimiento() {
		return fecAutorizacionMovimiento;
	}

	public void setFecAutorizacionMovimiento(Date fecAutorizacionMovimiento) {
		this.fecAutorizacionMovimiento = fecAutorizacionMovimiento;
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

	public Date getFecSolicitudMovimiento() {
		return fecSolicitudMovimiento;
	}

	public void setFecSolicitudMovimiento(Date fecSolicitudMovimiento) {
		this.fecSolicitudMovimiento = fecSolicitudMovimiento;
	}

	public String getNumTramiteNotaria() {
		return numTramiteNotaria;
	}

	public void setNumTramiteNotaria(String numTramiteNotaria) {
		this.numTramiteNotaria = numTramiteNotaria;
	}

	public String getUrlAcuseNotaria() {
		return urlAcuseNotaria;
	}

	public void setUrlAcuseNotaria(String urlAcuseNotaria) {
		this.urlAcuseNotaria = urlAcuseNotaria;
	}

	public String getReciboNotaria() {
		return reciboNotaria;
	}

	public void setReciboNotaria(String reciboNotaria) {
		this.reciboNotaria = reciboNotaria;
	}

	public List<NdtCpaAcreditacion> getListNdtCpaAcreditacions() {
		return listNdtCpaAcreditacions;
	}

	public void setListNdtCpaAcreditacions(List<NdtCpaAcreditacion> listNdtCpaAcreditacions) {
		this.listNdtCpaAcreditacions = listNdtCpaAcreditacions;
	}

	public List<NdtCpaEstatus> getListNdtCpaEstatus() {
		return listNdtCpaEstatus;
	}

	public void setListNdtCpaEstatus(List<NdtCpaEstatus> listNdtCpaEstatus) {
		this.listNdtCpaEstatus = listNdtCpaEstatus;
	}

	public NdtContadorPublicoAut getNdtContadorPublicoAut() {
		return ndtContadorPublicoAut;
	}

	public void setNdtContadorPublicoAut(NdtContadorPublicoAut ndtContadorPublicoAut) {
		this.ndtContadorPublicoAut = ndtContadorPublicoAut;
	}

	public List<NdtDocumentoProbatorio> getListNdtDocumentoProbatorios() {
		return listNdtDocumentoProbatorios;
	}

	public void setListNdtDocumentoProbatorios(List<NdtDocumentoProbatorio> listNdtDocumentoProbatorios) {
		this.listNdtDocumentoProbatorios = listNdtDocumentoProbatorios;
	}

	public List<NdtR1DatosPersonales> getListNdtR1DatosPersonales() {
		return listNdtR1DatosPersonales;
	}

	public void setListNdtR1DatosPersonales(List<NdtR1DatosPersonales> listNdtR1DatosPersonales) {
		this.listNdtR1DatosPersonales = listNdtR1DatosPersonales;
	}

	public List<NdtR2Despacho> getListNdtR2Despachos() {
		return listNdtR2Despachos;
	}

	public void setListNdtR2Despachos(List<NdtR2Despacho> listNdtR2Despachos) {
		this.listNdtR2Despachos = listNdtR2Despachos;
	}

	public List<NdtR3Colegio> getListNdtR3Colegios() {
		return listNdtR3Colegios;
	}

	public void setListNdtR3Colegios(List<NdtR3Colegio> listNdtR3Colegios) {
		this.listNdtR3Colegios = listNdtR3Colegios;
	}

}