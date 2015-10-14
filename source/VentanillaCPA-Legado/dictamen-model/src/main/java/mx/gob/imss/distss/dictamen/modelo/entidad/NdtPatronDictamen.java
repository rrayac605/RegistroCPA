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
@Table(name="NDT_PATRON_DICTAMEN")
@NamedQuery(name="NdtPatronDictamen.findAll", query="SELECT n FROM NdtPatronDictamen n")
public class NdtPatronDictamen implements Serializable {
	
	private static final long serialVersionUID = -2136017102765286277L;
	
	@Id
	@Column(name="CVE_ID_PATRON_DICTAMEN", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtPatronDictamen_Id_Seq_Gen", sequenceName = "SEQ_NDTPATRONDICTAMEN")
    @GeneratedValue(generator = "NdtPatronDictamen_Id_Seq_Gen")
	private Long cveIdPatronDictamen;

	@Column(name="CVE_ID_PATRON_SUJETO_OBLIGADO")
	private Long cveIdPatronSujetoObligado;

	@Column(name="CVE_ID_PERSONA_MORAL")
	private Long cveIdPersonaMoral;

	@Column(name="CVE_ID_SUBDELEGACION")
	private Long cveIdSubdelegacion;

	@Column(name="CVE_ID_TRAMITE")
	private Long cveIdTramite;

	@Column(name="CVE_ID_USUARIO", length=20)
	private String cveIdUsuario;

	@Column(name="DES_NOMBRE_RAZON_SOCIAL", length=255)
	private String desNombreRazonSocial;

	@Column(name="DES_NUMERO_FOLIO_DICTAMEN", length=50)
	private String desNumeroFolioDictamen;

	@Column(name="DES_RFC", length=50)
	private String desRfc;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_AUTORIZADO")
	private Date fecRegistroAutorizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="IND_PATRON_CONSTRUCCION", precision=1)
	private Long indPatronConstruccion;

	@Column(name="IND_PATRON_EMPRESA_VALUADA", precision=1)
	private Long indPatronEmpresaValuada;

	@Column(name="IND_PATRON_OBLIGADO")
	private Long indPatronObligado;

	@Column(name="IND_REALIZO_ACT_CONSTRUCCION", precision=1)
	private Long indRealizoActConstruccion;

	@Column(name="NUM_NUMERO_TRABAJADORES")
	private Long numNumeroTrabajadores;

	@Column(name="NUM_REGISTRO_PATRONALES")
	private Long numRegistroPatronales;

	//bi-directional many-to-one association to NdtA1PercepTrabajador
	@OneToMany(mappedBy="ndtPatronDictamen")
	private List<NdtA1PercepTrabajador> listNdtA1PercepTrabajadors;

	//bi-directional many-to-one association to NdtA2OtraPrestOtorgada
	@OneToMany(mappedBy="ndtPatronDictamen")
	private List<NdtA2OtraPrestOtorgada> listNdtA2OtraPrestOtorgadas;

	//bi-directional many-to-one association to NdtA3CuotaObreroPatronal
	@OneToMany(mappedBy="ndtPatronDictamen")
	private List<NdtA3CuotaObreroPatronal> listNdtA3CuotaObreroPatronals;

	//bi-directional many-to-one association to NdtA4PagoPersonaFisica
	@OneToMany(mappedBy="ndtPatronDictamen")
	private List<NdtA4PagoPersonaFisica> listNdtA4PagoPersonaFisicas;

	//bi-directional many-to-one association to NdtA51PersonalProporcionad
	@OneToMany(mappedBy="ndtPatronDictamen")
	private List<NdtA51PersonalProporcionad> listNdtA51PersonalProporcionads;

	//bi-directional many-to-one association to NdtA5PrestadoraServicios
	@OneToMany(mappedBy="ndtPatronDictamen")
	private List<NdtA5PrestadoraServicios> listNdtA5PrestadoraServicios;

	//bi-directional many-to-one association to NdtA61PersonalProporcionad
	@OneToMany(mappedBy="ndtPatronDictamen")
	private List<NdtA61PersonalProporcionad> listNdtA61PersonalProporcionads;

	//bi-directional many-to-one association to NdtA6SubcontratacionSp
	@OneToMany(mappedBy="ndtPatronDictamen")
	private List<NdtA6SubcontratacionSp> listNdtA6SubcontratacionSps;

	//bi-directional many-to-one association to NdtA71CeProceso
	@OneToMany(mappedBy="ndtPatronDictamen")
	private List<NdtA71CeProceso> listNdtA71CeProcesos;

	//bi-directional many-to-one association to NdtA72CeBien
	@OneToMany(mappedBy="ndtPatronDictamen")
	private List<NdtA72CeBien> listNdtA72CeBiens;

	//bi-directional many-to-one association to NdtA73CeMaquinaria
	@OneToMany(mappedBy="ndtPatronDictamen")
	private List<NdtA73CeMaquinaria> listNdtA73CeMaquinarias;

	//bi-directional many-to-one association to NdtA74CeTransporte
	@OneToMany(mappedBy="ndtPatronDictamen")
	private List<NdtA74CeTransporte> listNdtA74CeTransportes;

	//bi-directional many-to-one association to NdtA75CePersonal
	@OneToMany(mappedBy="ndtPatronDictamen")
	private List<NdtA75CePersonal> listNdtA75CePersonals;

	//bi-directional many-to-one association to NdtA76CeActComp
	@OneToMany(mappedBy="ndtPatronDictamen")
	private List<NdtA76CeActComp> listNdtA76CeActComps;

	//bi-directional many-to-one association to NdtA8BalanzaComprobacion
	@OneToMany(mappedBy="ndtPatronDictamen")
	private List<NdtA8BalanzaComprobacion> listNdtA8BalanzaComprobacions;

	//bi-directional many-to-one association to NdtA911PersonalObra
	@OneToMany(mappedBy="ndtPatronDictamen")
	private List<NdtA911PersonalObra> listNdtA911PersonalObras;

	//bi-directional many-to-one association to NdtA91ObrasConstruccion
	@OneToMany(mappedBy="ndtPatronDictamen")
	private List<NdtA91ObrasConstruccion> listNdtA91ObrasConstruccions;

	//bi-directional many-to-one association to NdtA921PersSubcontratado
	@OneToMany(mappedBy="ndtPatronDictamen")
	private List<NdtA921PersSubcontratado> listNdtA921PersSubcontratados;

	//bi-directional many-to-one association to NdtA92ObrasSubcontrata
	@OneToMany(mappedBy="ndtPatronDictamen")
	private List<NdtA92ObrasSubcontrata> listNdtA92ObrasSubcontratas;

	//bi-directional many-to-one association to NdtB1CedulaRemuneraciones
	@OneToMany(mappedBy="ndtPatronDictamen")
	private List<NdtB1CedulaRemuneraciones> listNdtB1CedulaRemuneraciones;

	//bi-directional many-to-one association to NdtB2CedulaPrestaciones
	@OneToMany(mappedBy="ndtPatronDictamen")
	private List<NdtB2CedulaPrestaciones> listNdtB2CedulaPrestaciones;

	//bi-directional many-to-one association to NdtCargaAseveraciones
	@OneToMany(mappedBy="ndtPatronDictamen")
	private List<NdtCargaAseveraciones> listNdtCargaAseveraciones;

	//bi-directional many-to-one association to NdtCedulaPagosDiferencias
	@OneToMany(mappedBy="ndtPatronDictamen")
	private List<NdtCedulaPagosDiferencias> listNdtCedulaPagosDiferencias;

	//bi-directional many-to-one association to NdtModeloOpinion
	@OneToMany(mappedBy="ndtPatronDictamen")
	private List<NdtModeloOpinion> listNdtModeloOpinions;

	//bi-directional many-to-one association to NdtNotasDictamen
	@OneToMany(mappedBy="ndtPatronDictamen")
	private List<NdtNotasDictamen> listNdtNotasDictamens;

	//bi-directional many-to-one association to NdcEjercicioFiscal
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_EJER_FISCAL")
	private NdcEjercicioFiscal ndcEjercicioFiscal;

	//bi-directional many-to-one association to NdcTipoDictamen
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_TIPO_DICTAMEN")
	private NdcTipoDictamen ndcTipoDictamen;

	//bi-directional many-to-one association to NdtPatronDictamenCpa
	@OneToMany(mappedBy="ndtPatronDictamen")
	private List<NdtPatronDictamenCpa> listNdtPatronDictamenCpas;

	//bi-directional many-to-one association to NdtAtestiguamientoDictamen
	@OneToMany(mappedBy="ndtPatronDictamen")
	private List<NdtAtestiguamientoDictamen> listNdtAtestiguamientoDictamens;

	public NdtPatronDictamen() {
	}

	public Long getCveIdPatronDictamen() {
		return cveIdPatronDictamen;
	}

	public void setCveIdPatronDictamen(Long cveIdPatronDictamen) {
		this.cveIdPatronDictamen = cveIdPatronDictamen;
	}

	public Long getCveIdPatronSujetoObligado() {
		return cveIdPatronSujetoObligado;
	}

	public void setCveIdPatronSujetoObligado(Long cveIdPatronSujetoObligado) {
		this.cveIdPatronSujetoObligado = cveIdPatronSujetoObligado;
	}

	public Long getCveIdPersonaMoral() {
		return cveIdPersonaMoral;
	}

	public void setCveIdPersonaMoral(Long cveIdPersonaMoral) {
		this.cveIdPersonaMoral = cveIdPersonaMoral;
	}

	public Long getCveIdSubdelegacion() {
		return cveIdSubdelegacion;
	}

	public void setCveIdSubdelegacion(Long cveIdSubdelegacion) {
		this.cveIdSubdelegacion = cveIdSubdelegacion;
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

	public String getDesNombreRazonSocial() {
		return desNombreRazonSocial;
	}

	public void setDesNombreRazonSocial(String desNombreRazonSocial) {
		this.desNombreRazonSocial = desNombreRazonSocial;
	}

	public String getDesNumeroFolioDictamen() {
		return desNumeroFolioDictamen;
	}

	public void setDesNumeroFolioDictamen(String desNumeroFolioDictamen) {
		this.desNumeroFolioDictamen = desNumeroFolioDictamen;
	}

	public String getDesRfc() {
		return desRfc;
	}

	public void setDesRfc(String desRfc) {
		this.desRfc = desRfc;
	}

	public Date getFecRegistroAlta() {
		return fecRegistroAlta;
	}

	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}

	public Date getFecRegistroAutorizado() {
		return fecRegistroAutorizado;
	}

	public void setFecRegistroAutorizado(Date fecRegistroAutorizado) {
		this.fecRegistroAutorizado = fecRegistroAutorizado;
	}

	public Date getFecRegistroBaja() {
		return fecRegistroBaja;
	}

	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}

	public Long getIndPatronConstruccion() {
		return indPatronConstruccion;
	}

	public void setIndPatronConstruccion(Long indPatronConstruccion) {
		this.indPatronConstruccion = indPatronConstruccion;
	}

	public Long getIndPatronEmpresaValuada() {
		return indPatronEmpresaValuada;
	}

	public void setIndPatronEmpresaValuada(Long indPatronEmpresaValuada) {
		this.indPatronEmpresaValuada = indPatronEmpresaValuada;
	}

	public Long getIndPatronObligado() {
		return indPatronObligado;
	}

	public void setIndPatronObligado(Long indPatronObligado) {
		this.indPatronObligado = indPatronObligado;
	}

	public Long getIndRealizoActConstruccion() {
		return indRealizoActConstruccion;
	}

	public void setIndRealizoActConstruccion(Long indRealizoActConstruccion) {
		this.indRealizoActConstruccion = indRealizoActConstruccion;
	}

	public Long getNumNumeroTrabajadores() {
		return numNumeroTrabajadores;
	}

	public void setNumNumeroTrabajadores(Long numNumeroTrabajadores) {
		this.numNumeroTrabajadores = numNumeroTrabajadores;
	}

	public Long getNumRegistroPatronales() {
		return numRegistroPatronales;
	}

	public void setNumRegistroPatronales(Long numRegistroPatronales) {
		this.numRegistroPatronales = numRegistroPatronales;
	}

	public List<NdtA1PercepTrabajador> getListNdtA1PercepTrabajadors() {
		return listNdtA1PercepTrabajadors;
	}

	public void setListNdtA1PercepTrabajadors(List<NdtA1PercepTrabajador> listNdtA1PercepTrabajadors) {
		this.listNdtA1PercepTrabajadors = listNdtA1PercepTrabajadors;
	}

	public List<NdtA2OtraPrestOtorgada> getListNdtA2OtraPrestOtorgadas() {
		return listNdtA2OtraPrestOtorgadas;
	}

	public void setListNdtA2OtraPrestOtorgadas(List<NdtA2OtraPrestOtorgada> listNdtA2OtraPrestOtorgadas) {
		this.listNdtA2OtraPrestOtorgadas = listNdtA2OtraPrestOtorgadas;
	}

	public List<NdtA3CuotaObreroPatronal> getListNdtA3CuotaObreroPatronals() {
		return listNdtA3CuotaObreroPatronals;
	}

	public void setListNdtA3CuotaObreroPatronals(List<NdtA3CuotaObreroPatronal> listNdtA3CuotaObreroPatronals) {
		this.listNdtA3CuotaObreroPatronals = listNdtA3CuotaObreroPatronals;
	}

	public List<NdtA4PagoPersonaFisica> getListNdtA4PagoPersonaFisicas() {
		return listNdtA4PagoPersonaFisicas;
	}

	public void setListNdtA4PagoPersonaFisicas(List<NdtA4PagoPersonaFisica> listNdtA4PagoPersonaFisicas) {
		this.listNdtA4PagoPersonaFisicas = listNdtA4PagoPersonaFisicas;
	}

	public List<NdtA51PersonalProporcionad> getListNdtA51PersonalProporcionads() {
		return listNdtA51PersonalProporcionads;
	}

	public void setListNdtA51PersonalProporcionads(List<NdtA51PersonalProporcionad> listNdtA51PersonalProporcionads) {
		this.listNdtA51PersonalProporcionads = listNdtA51PersonalProporcionads;
	}

	public List<NdtA5PrestadoraServicios> getListNdtA5PrestadoraServicios() {
		return listNdtA5PrestadoraServicios;
	}

	public void setListNdtA5PrestadoraServicios(List<NdtA5PrestadoraServicios> listNdtA5PrestadoraServicios) {
		this.listNdtA5PrestadoraServicios = listNdtA5PrestadoraServicios;
	}

	public List<NdtA61PersonalProporcionad> getListNdtA61PersonalProporcionads() {
		return listNdtA61PersonalProporcionads;
	}

	public void setListNdtA61PersonalProporcionads(List<NdtA61PersonalProporcionad> listNdtA61PersonalProporcionads) {
		this.listNdtA61PersonalProporcionads = listNdtA61PersonalProporcionads;
	}

	public List<NdtA6SubcontratacionSp> getListNdtA6SubcontratacionSps() {
		return listNdtA6SubcontratacionSps;
	}

	public void setListNdtA6SubcontratacionSps(List<NdtA6SubcontratacionSp> listNdtA6SubcontratacionSps) {
		this.listNdtA6SubcontratacionSps = listNdtA6SubcontratacionSps;
	}

	public List<NdtA71CeProceso> getListNdtA71CeProcesos() {
		return listNdtA71CeProcesos;
	}

	public void setListNdtA71CeProcesos(List<NdtA71CeProceso> listNdtA71CeProcesos) {
		this.listNdtA71CeProcesos = listNdtA71CeProcesos;
	}

	public List<NdtA72CeBien> getListNdtA72CeBiens() {
		return listNdtA72CeBiens;
	}

	public void setListNdtA72CeBiens(List<NdtA72CeBien> listNdtA72CeBiens) {
		this.listNdtA72CeBiens = listNdtA72CeBiens;
	}

	public List<NdtA73CeMaquinaria> getListNdtA73CeMaquinarias() {
		return listNdtA73CeMaquinarias;
	}

	public void setListNdtA73CeMaquinarias(List<NdtA73CeMaquinaria> listNdtA73CeMaquinarias) {
		this.listNdtA73CeMaquinarias = listNdtA73CeMaquinarias;
	}

	public List<NdtA74CeTransporte> getListNdtA74CeTransportes() {
		return listNdtA74CeTransportes;
	}

	public void setListNdtA74CeTransportes(List<NdtA74CeTransporte> listNdtA74CeTransportes) {
		this.listNdtA74CeTransportes = listNdtA74CeTransportes;
	}

	public List<NdtA75CePersonal> getListNdtA75CePersonals() {
		return listNdtA75CePersonals;
	}

	public void setListNdtA75CePersonals(List<NdtA75CePersonal> listNdtA75CePersonals) {
		this.listNdtA75CePersonals = listNdtA75CePersonals;
	}

	public List<NdtA76CeActComp> getListNdtA76CeActComps() {
		return listNdtA76CeActComps;
	}

	public void setListNdtA76CeActComps(List<NdtA76CeActComp> listNdtA76CeActComps) {
		this.listNdtA76CeActComps = listNdtA76CeActComps;
	}

	public List<NdtA8BalanzaComprobacion> getListNdtA8BalanzaComprobacions() {
		return listNdtA8BalanzaComprobacions;
	}

	public void setListNdtA8BalanzaComprobacions(List<NdtA8BalanzaComprobacion> listNdtA8BalanzaComprobacions) {
		this.listNdtA8BalanzaComprobacions = listNdtA8BalanzaComprobacions;
	}

	public List<NdtA911PersonalObra> getListNdtA911PersonalObras() {
		return listNdtA911PersonalObras;
	}

	public void setListNdtA911PersonalObras(List<NdtA911PersonalObra> listNdtA911PersonalObras) {
		this.listNdtA911PersonalObras = listNdtA911PersonalObras;
	}

	public List<NdtA91ObrasConstruccion> getListNdtA91ObrasConstruccions() {
		return listNdtA91ObrasConstruccions;
	}

	public void setListNdtA91ObrasConstruccions(List<NdtA91ObrasConstruccion> listNdtA91ObrasConstruccions) {
		this.listNdtA91ObrasConstruccions = listNdtA91ObrasConstruccions;
	}

	public List<NdtA921PersSubcontratado> getListNdtA921PersSubcontratados() {
		return listNdtA921PersSubcontratados;
	}

	public void setListNdtA921PersSubcontratados(List<NdtA921PersSubcontratado> listNdtA921PersSubcontratados) {
		this.listNdtA921PersSubcontratados = listNdtA921PersSubcontratados;
	}

	public List<NdtA92ObrasSubcontrata> getListNdtA92ObrasSubcontratas() {
		return listNdtA92ObrasSubcontratas;
	}

	public void setListNdtA92ObrasSubcontratas(List<NdtA92ObrasSubcontrata> listNdtA92ObrasSubcontratas) {
		this.listNdtA92ObrasSubcontratas = listNdtA92ObrasSubcontratas;
	}

	public List<NdtB1CedulaRemuneraciones> getListNdtB1CedulaRemuneraciones() {
		return listNdtB1CedulaRemuneraciones;
	}

	public void setListNdtB1CedulaRemuneraciones(List<NdtB1CedulaRemuneraciones> listNdtB1CedulaRemuneraciones) {
		this.listNdtB1CedulaRemuneraciones = listNdtB1CedulaRemuneraciones;
	}

	public List<NdtB2CedulaPrestaciones> getListNdtB2CedulaPrestaciones() {
		return listNdtB2CedulaPrestaciones;
	}

	public void setListNdtB2CedulaPrestaciones(List<NdtB2CedulaPrestaciones> listNdtB2CedulaPrestaciones) {
		this.listNdtB2CedulaPrestaciones = listNdtB2CedulaPrestaciones;
	}

	public List<NdtCargaAseveraciones> getListNdtCargaAseveraciones() {
		return listNdtCargaAseveraciones;
	}

	public void setListNdtCargaAseveraciones(List<NdtCargaAseveraciones> listNdtCargaAseveraciones) {
		this.listNdtCargaAseveraciones = listNdtCargaAseveraciones;
	}

	public List<NdtCedulaPagosDiferencias> getListNdtCedulaPagosDiferencias() {
		return listNdtCedulaPagosDiferencias;
	}

	public void setListNdtCedulaPagosDiferencias(List<NdtCedulaPagosDiferencias> listNdtCedulaPagosDiferencias) {
		this.listNdtCedulaPagosDiferencias = listNdtCedulaPagosDiferencias;
	}

	public List<NdtModeloOpinion> getListNdtModeloOpinions() {
		return listNdtModeloOpinions;
	}

	public void setListNdtModeloOpinions(List<NdtModeloOpinion> listNdtModeloOpinions) {
		this.listNdtModeloOpinions = listNdtModeloOpinions;
	}

	public List<NdtNotasDictamen> getListNdtNotasDictamens() {
		return listNdtNotasDictamens;
	}

	public void setListNdtNotasDictamens(List<NdtNotasDictamen> listNdtNotasDictamens) {
		this.listNdtNotasDictamens = listNdtNotasDictamens;
	}

	public NdcEjercicioFiscal getNdcEjercicioFiscal() {
		return ndcEjercicioFiscal;
	}

	public void setNdcEjercicioFiscal(NdcEjercicioFiscal ndcEjercicioFiscal) {
		this.ndcEjercicioFiscal = ndcEjercicioFiscal;
	}

	public NdcTipoDictamen getNdcTipoDictamen() {
		return ndcTipoDictamen;
	}

	public void setNdcTipoDictamen(NdcTipoDictamen ndcTipoDictamen) {
		this.ndcTipoDictamen = ndcTipoDictamen;
	}

	public List<NdtPatronDictamenCpa> getListNdtPatronDictamenCpas() {
		return listNdtPatronDictamenCpas;
	}

	public void setListNdtPatronDictamenCpas(List<NdtPatronDictamenCpa> listNdtPatronDictamenCpas) {
		this.listNdtPatronDictamenCpas = listNdtPatronDictamenCpas;
	}

	public List<NdtAtestiguamientoDictamen> getListNdtAtestiguamientoDictamens() {
		return listNdtAtestiguamientoDictamens;
	}

	public void setListNdtAtestiguamientoDictamens(List<NdtAtestiguamientoDictamen> listNdtAtestiguamientoDictamens) {
		this.listNdtAtestiguamientoDictamens = listNdtAtestiguamientoDictamens;
	}

}