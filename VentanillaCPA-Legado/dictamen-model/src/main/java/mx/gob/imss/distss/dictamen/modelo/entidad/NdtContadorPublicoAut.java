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
@Table(name="NDT_CONTADOR_PUBLICO_AUT")
@NamedQuery(name="NdtContadorPublicoAut.findAll", query="SELECT n FROM NdtContadorPublicoAut n")
public class NdtContadorPublicoAut implements Serializable {
	
	private static final long serialVersionUID = -8172597617634598294L;
	
	@Id
	@Column(name="CVE_ID_CPA", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtContadorPublicoAut_Id_Seq_Gen", sequenceName = "SEQ_NDTCONTADORPUBLICOAUT")
    @GeneratedValue(generator = "NdtContadorPublicoAut_Id_Seq_Gen")
	private Long cveIdCpa;

	@Column(name="CVE_ID_PERSONA")
	private Long cveIdPersona;

	@Column(name="CVE_ID_USUARIO", length=18)
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

	@Column(name="NUM_REGISTRO_CPA", precision=5)
	private Long numRegistroCpa;

	//bi-directional many-to-one association to NdcEstadoCpa
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_ESTADO_CPA")
	private NdcEstadoCpa ndcEstadoCpa;

	//bi-directional many-to-one association to NdtCpaAcreditacion
	@OneToMany(mappedBy="ndtContadorPublicoAut")
	private List<NdtCpaAcreditacion> listNdtCpaAcreditacions;

	//bi-directional many-to-one association to NdtCpaEstatus
	@OneToMany(mappedBy="ndtContadorPublicoAut")
	private List<NdtCpaEstatus> listNdtCpaEstatus;

	//bi-directional many-to-one association to NdtCpaTramite
	@OneToMany(mappedBy="ndtContadorPublicoAut")
	private List<NdtCpaTramite> listNdtCpaTramites;

	//bi-directional many-to-one association to NdtDocumentoProbatorio
	@OneToMany(mappedBy="ndtContadorPublicoAut")
	private List<NdtDocumentoProbatorio> listNdtDocumentoProbatorios;

	//bi-directional many-to-one association to NdtPatronDictamenCpa
	@OneToMany(mappedBy="ndtContadorPublicoAut")
	private List<NdtPatronDictamenCpa> listNdtPatronDictamenCpas;

	//bi-directional many-to-one association to NdtR1DatosPersonales
	@OneToMany(mappedBy="ndtContadorPublicoAut")
	private List<NdtR1DatosPersonales> listNdtR1DatosPersonales;

	//bi-directional many-to-one association to NdtR2Despacho
	@OneToMany(mappedBy="ndtContadorPublicoAut")
	private List<NdtR2Despacho> listNdtR2Despachos;

	//bi-directional many-to-one association to NdtR3Colegio
	@OneToMany(mappedBy="ndtContadorPublicoAut")
	private List<NdtR3Colegio> listNdtR3Colegios;

	public NdtContadorPublicoAut() {
	}

	public Long getCveIdCpa() {
		return cveIdCpa;
	}

	public void setCveIdCpa(Long cveIdCpa) {
		this.cveIdCpa = cveIdCpa;
	}

	public Long getCveIdPersona() {
		return cveIdPersona;
	}

	public void setCveIdPersona(Long cveIdPersona) {
		this.cveIdPersona = cveIdPersona;
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

	public Long getNumRegistroCpa() {
		return numRegistroCpa;
	}

	public void setNumRegistroCpa(Long numRegistroCpa) {
		this.numRegistroCpa = numRegistroCpa;
	}

	public NdcEstadoCpa getNdcEstadoCpa() {
		return ndcEstadoCpa;
	}

	public void setNdcEstadoCpa(NdcEstadoCpa ndcEstadoCpa) {
		this.ndcEstadoCpa = ndcEstadoCpa;
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

	public List<NdtCpaTramite> getListNdtCpaTramites() {
		return listNdtCpaTramites;
	}

	public void setListNdtCpaTramites(List<NdtCpaTramite> listNdtCpaTramites) {
		this.listNdtCpaTramites = listNdtCpaTramites;
	}

	public List<NdtDocumentoProbatorio> getListNdtDocumentoProbatorios() {
		return listNdtDocumentoProbatorios;
	}

	public void setListNdtDocumentoProbatorios(List<NdtDocumentoProbatorio> listNdtDocumentoProbatorios) {
		this.listNdtDocumentoProbatorios = listNdtDocumentoProbatorios;
	}

	public List<NdtPatronDictamenCpa> getListNdtPatronDictamenCpas() {
		return listNdtPatronDictamenCpas;
	}

	public void setListNdtPatronDictamenCpas(List<NdtPatronDictamenCpa> listNdtPatronDictamenCpas) {
		this.listNdtPatronDictamenCpas = listNdtPatronDictamenCpas;
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