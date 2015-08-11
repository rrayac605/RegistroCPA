package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DIT_PERSONA_MORAL database table.
 * 
 */
@Entity
@Table(name="DIT_PERSONA_MORAL")
@NamedQuery(name="DitPersonaMoralDO.findAll", query="SELECT d FROM DitPersonaMoralDO d")
public class DitPersonaMoralDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_PERSONA_MORAL")
	private long cveIdPersonaMoral;

	@Column(name="DENOMINACION_RAZON_SOCIAL")
	private String denominacionRazonSocial;

	@Column(name="DES_CAMARA_ORGANIZACION")
	private String desCamaraOrganizacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="IND_ACREDITADO")
	private BigDecimal indAcreditado;

	@Column(name="IND_CONCURSO_MER")
	private BigDecimal indConcursoMer;

	@Column(name="NOMBRE_COMERCIAL")
	private String nombreComercial;

	private String rfc;

	//bi-directional many-to-one association to DitActaConstitutivaDO
	@OneToMany(mappedBy="ditPersonaMoral")
	private List<DitActaConstitutivaDO> ditActaConstitutivas;

	//bi-directional many-to-one association to DitDatosCertificadoFielDO
	@OneToMany(mappedBy="ditPersonaMoral")
	private List<DitDatosCertificadoFielDO> ditDatosCertificadoFiels;

	//bi-directional many-to-one association to DitDatosPersonaSatDO
	@OneToMany(mappedBy="ditPersonaMoral")
	private List<DitDatosPersonaSatDO> ditDatosPersonaSats;

	//bi-directional many-to-one association to DitHistEstadoPersonaMoralDO
	@OneToMany(mappedBy="ditPersonaMoral")
	private List<DitHistEstadoPersonaMoralDO> ditHistEstadoPersonaMorals;

	//bi-directional many-to-one association to DitIdentificadorMoralDO
	@OneToMany(mappedBy="ditPersonaMoral")
	private List<DitIdentificadorMoralDO> ditIdentificadorMorals;

	//bi-directional many-to-one association to DitPatronSujetoObligadoDO
	@OneToMany(mappedBy="ditPersonaMoral")
	private List<DitPatronSujetoObligadoDO> ditPatronSujetoObligados;

	//bi-directional many-to-one association to DitPersonamContactoDO
	@OneToMany(mappedBy="ditPersonaMoral")
	private List<DitPersonamContactoDO> ditPersonamContactos;

	//bi-directional many-to-one association to DitPersonamContactoFiscalDO
	@OneToMany(mappedBy="ditPersonaMoral")
	private List<DitPersonamContactoFiscalDO> ditPersonamContactoFiscals;

	//bi-directional many-to-one association to DitPersonamDomDO
	@OneToMany(mappedBy="ditPersonaMoral")
	private List<DitPersonamDomDO> ditPersonamDoms;

	//bi-directional many-to-one association to DitPersonamDomFiscalDO
	@OneToMany(mappedBy="ditPersonaMoral")
	private List<DitPersonamDomFiscalDO> ditPersonamDomFiscals;

	//bi-directional many-to-one association to DicTipoSociedadDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_TIPO_SOCIEDAD")
	private DicTipoSociedadDO dicTipoSociedad;

	//bi-directional many-to-one association to DitRepresentanteLegalDO
	@OneToMany(mappedBy="ditPersonaMoral")
	private List<DitRepresentanteLegalDO> ditRepresentanteLegals;

	//bi-directional many-to-one association to DitSindicatoDO
	@OneToMany(mappedBy="ditPersonaMoral")
	private List<DitSindicatoDO> ditSindicatos;

	//bi-directional many-to-one association to DitSituacionSatDO
	@OneToMany(mappedBy="ditPersonaMoral")
	private List<DitSituacionSatDO> ditSituacionSats;

	//bi-directional many-to-one association to DitSocioDO
	@OneToMany(mappedBy="ditPersonaMoral1")
	private List<DitSocioDO> ditSocios1;

	//bi-directional many-to-one association to DitSocioDO
	@OneToMany(mappedBy="ditPersonaMoral2")
	private List<DitSocioDO> ditSocios2;

	//bi-directional many-to-many association to DitTramiteDO
	@ManyToMany(mappedBy="ditPersonaMorals")
	private List<DitTramiteDO> ditTramites;

	//bi-directional many-to-one association to NdtAsociacionDO
	@OneToMany(mappedBy="ditPersonaMoral")
	private List<NdtAsociacionDO> ndtAsociacions;

	//bi-directional many-to-one association to NdtColegioContadorDO
	@OneToMany(mappedBy="ditPersonaMoral")
	private List<NdtColegioContadorDO> ndtColegioContadors;

	public DitPersonaMoralDO() {
	}

	public long getCveIdPersonaMoral() {
		return this.cveIdPersonaMoral;
	}

	public void setCveIdPersonaMoral(long cveIdPersonaMoral) {
		this.cveIdPersonaMoral = cveIdPersonaMoral;
	}

	public String getDenominacionRazonSocial() {
		return this.denominacionRazonSocial;
	}

	public void setDenominacionRazonSocial(String denominacionRazonSocial) {
		this.denominacionRazonSocial = denominacionRazonSocial;
	}

	public String getDesCamaraOrganizacion() {
		return this.desCamaraOrganizacion;
	}

	public void setDesCamaraOrganizacion(String desCamaraOrganizacion) {
		this.desCamaraOrganizacion = desCamaraOrganizacion;
	}

	public Date getFecRegistroActualizado() {
		return this.fecRegistroActualizado;
	}

	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}

	public Date getFecRegistroAlta() {
		return this.fecRegistroAlta;
	}

	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}

	public Date getFecRegistroBaja() {
		return this.fecRegistroBaja;
	}

	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}

	public BigDecimal getIndAcreditado() {
		return this.indAcreditado;
	}

	public void setIndAcreditado(BigDecimal indAcreditado) {
		this.indAcreditado = indAcreditado;
	}

	public BigDecimal getIndConcursoMer() {
		return this.indConcursoMer;
	}

	public void setIndConcursoMer(BigDecimal indConcursoMer) {
		this.indConcursoMer = indConcursoMer;
	}

	public String getNombreComercial() {
		return this.nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public String getRfc() {
		return this.rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public List<DitActaConstitutivaDO> getDitActaConstitutivas() {
		return this.ditActaConstitutivas;
	}

	public void setDitActaConstitutivas(List<DitActaConstitutivaDO> ditActaConstitutivas) {
		this.ditActaConstitutivas = ditActaConstitutivas;
	}
	public List<DitDatosCertificadoFielDO> getDitDatosCertificadoFiels() {
		return this.ditDatosCertificadoFiels;
	}

	public void setDitDatosCertificadoFiels(List<DitDatosCertificadoFielDO> ditDatosCertificadoFiels) {
		this.ditDatosCertificadoFiels = ditDatosCertificadoFiels;
	}

	public List<DitDatosPersonaSatDO> getDitDatosPersonaSats() {
		return this.ditDatosPersonaSats;
	}

	public void setDitDatosPersonaSats(List<DitDatosPersonaSatDO> ditDatosPersonaSats) {
		this.ditDatosPersonaSats = ditDatosPersonaSats;
	}

	public List<DitHistEstadoPersonaMoralDO> getDitHistEstadoPersonaMorals() {
		return this.ditHistEstadoPersonaMorals;
	}

	public void setDitHistEstadoPersonaMorals(List<DitHistEstadoPersonaMoralDO> ditHistEstadoPersonaMorals) {
		this.ditHistEstadoPersonaMorals = ditHistEstadoPersonaMorals;
	}

	public List<DitIdentificadorMoralDO> getDitIdentificadorMorals() {
		return this.ditIdentificadorMorals;
	}

	public void setDitIdentificadorMorals(List<DitIdentificadorMoralDO> ditIdentificadorMorals) {
		this.ditIdentificadorMorals = ditIdentificadorMorals;
	}

	public List<DitPatronSujetoObligadoDO> getDitPatronSujetoObligados() {
		return this.ditPatronSujetoObligados;
	}

	public void setDitPatronSujetoObligados(List<DitPatronSujetoObligadoDO> ditPatronSujetoObligados) {
		this.ditPatronSujetoObligados = ditPatronSujetoObligados;
	}

	public List<DitPersonamContactoDO> getDitPersonamContactos() {
		return this.ditPersonamContactos;
	}

	public void setDitPersonamContactos(List<DitPersonamContactoDO> ditPersonamContactos) {
		this.ditPersonamContactos = ditPersonamContactos;
	}

	public List<DitPersonamContactoFiscalDO> getDitPersonamContactoFiscals() {
		return this.ditPersonamContactoFiscals;
	}

	public void setDitPersonamContactoFiscals(List<DitPersonamContactoFiscalDO> ditPersonamContactoFiscals) {
		this.ditPersonamContactoFiscals = ditPersonamContactoFiscals;
	}

	public List<DitPersonamDomDO> getDitPersonamDoms() {
		return this.ditPersonamDoms;
	}

	public void setDitPersonamDoms(List<DitPersonamDomDO> ditPersonamDoms) {
		this.ditPersonamDoms = ditPersonamDoms;
	}public List<DitPersonamDomFiscalDO> getDitPersonamDomFiscals() {
		return this.ditPersonamDomFiscals;
	}

	public void setDitPersonamDomFiscals(List<DitPersonamDomFiscalDO> ditPersonamDomFiscals) {
		this.ditPersonamDomFiscals = ditPersonamDomFiscals;
	}
	
	public DicTipoSociedadDO getDicTipoSociedad() {
		return this.dicTipoSociedad;
	}

	public void setDicTipoSociedad(DicTipoSociedadDO dicTipoSociedad) {
		this.dicTipoSociedad = dicTipoSociedad;
	}

	public List<DitRepresentanteLegalDO> getDitRepresentanteLegals() {
		return this.ditRepresentanteLegals;
	}

	public void setDitRepresentanteLegals(List<DitRepresentanteLegalDO> ditRepresentanteLegals) {
		this.ditRepresentanteLegals = ditRepresentanteLegals;
	}public List<DitSindicatoDO> getDitSindicatos() {
		return this.ditSindicatos;
	}

	public void setDitSindicatos(List<DitSindicatoDO> ditSindicatos) {
		this.ditSindicatos = ditSindicatos;
	}

	public List<DitSituacionSatDO> getDitSituacionSats() {
		return this.ditSituacionSats;
	}

	public void setDitSituacionSats(List<DitSituacionSatDO> ditSituacionSats) {
		this.ditSituacionSats = ditSituacionSats;
	}

	public List<DitSocioDO> getDitSocios1() {
		return this.ditSocios1;
	}

	public void setDitSocios1(List<DitSocioDO> ditSocios1) {
		this.ditSocios1 = ditSocios1;
	}

	public List<DitSocioDO> getDitSocios2() {
		return this.ditSocios2;
	}

	public void setDitSocios2(List<DitSocioDO> ditSocios2) {
		this.ditSocios2 = ditSocios2;
	}

	public List<DitTramiteDO> getDitTramites() {
		return this.ditTramites;
	}

	public void setDitTramites(List<DitTramiteDO> ditTramites) {
		this.ditTramites = ditTramites;
	}

	public List<NdtAsociacionDO> getNdtAsociacions() {
		return this.ndtAsociacions;
	}

	public void setNdtAsociacions(List<NdtAsociacionDO> ndtAsociacions) {
		this.ndtAsociacions = ndtAsociacions;
	}

	public List<NdtColegioContadorDO> getNdtColegioContadors() {
		return this.ndtColegioContadors;
	}

	public void setNdtColegioContadors(List<NdtColegioContadorDO> ndtColegioContadors) {
		this.ndtColegioContadors = ndtColegioContadors;
	}
	
}