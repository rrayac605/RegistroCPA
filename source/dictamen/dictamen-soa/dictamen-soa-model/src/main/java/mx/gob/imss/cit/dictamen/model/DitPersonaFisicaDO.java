package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DIT_PERSONA_FISICA database table.
 * 
 */
@Entity
@Table(name="DIT_PERSONA_FISICA")
@NamedQuery(name="DitPersonaFisicaDO.findAll", query="SELECT d FROM DitPersonaFisicaDO d")
public class DitPersonaFisicaDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_PERSONA_FISICA")
	private long cveIdPersonaFisica;

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

	@Column(name="NOMBRE_COMERCIAL")
	private String nombreComercial;

	private String rfc;

	//bi-directional many-to-one association to DitDatosCertificadoFielDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersonaFisica")
	private List<DitDatosCertificadoFielDO> ditDatosCertificadoFiels;

	//bi-directional many-to-one association to DitDatosPersonaSatDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersonaFisica")
	private List<DitDatosPersonaSatDO> ditDatosPersonaSats;

	//bi-directional many-to-one association to DitPatronSujetoObligadoDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersonaFisica")
	private List<DitPatronSujetoObligadoDO> ditPatronSujetoObligados;

	//bi-directional many-to-one association to DitPersonafDomFiscalDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersonaFisica")
	private List<DitPersonafDomFiscalDO> ditPersonafDomFiscals;

	//bi-directional many-to-one association to DitPersonaDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA")
	private DitPersonaDO ditPersona;

	//bi-directional many-to-one association to DitRepresentanteLegalDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersonaFisica")
	private List<DitRepresentanteLegalDO> ditRepresentanteLegals;

	//bi-directional many-to-one association to DitSituacionSatDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersonaFisica")
	private List<DitSituacionSatDO> ditSituacionSats;

	//bi-directional many-to-one association to DitSocioDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPersonaFisica")
	private List<DitSocioDO> ditSocios;

	public DitPersonaFisicaDO() {
	}

	public long getCveIdPersonaFisica() {
		return this.cveIdPersonaFisica;
	}

	public void setCveIdPersonaFisica(long cveIdPersonaFisica) {
		this.cveIdPersonaFisica = cveIdPersonaFisica;
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

	public List<DitPatronSujetoObligadoDO> getDitPatronSujetoObligados() {
		return this.ditPatronSujetoObligados;
	}

	public void setDitPatronSujetoObligados(List<DitPatronSujetoObligadoDO> ditPatronSujetoObligados) {
		this.ditPatronSujetoObligados = ditPatronSujetoObligados;
	}

	public List<DitPersonafDomFiscalDO> getDitPersonafDomFiscals() {
		return this.ditPersonafDomFiscals;
	}

	public void setDitPersonafDomFiscals(List<DitPersonafDomFiscalDO> ditPersonafDomFiscals) {
		this.ditPersonafDomFiscals = ditPersonafDomFiscals;
	}

	public DitPersonaDO getDitPersona() {
		return this.ditPersona;
	}

	public void setDitPersona(DitPersonaDO ditPersona) {
		this.ditPersona = ditPersona;
	}

	public List<DitRepresentanteLegalDO> getDitRepresentanteLegals() {
		return this.ditRepresentanteLegals;
	}

	public void setDitRepresentanteLegals(List<DitRepresentanteLegalDO> ditRepresentanteLegals) {
		this.ditRepresentanteLegals = ditRepresentanteLegals;
	}

	public List<DitSituacionSatDO> getDitSituacionSats() {
		return this.ditSituacionSats;
	}

	public void setDitSituacionSats(List<DitSituacionSatDO> ditSituacionSats) {
		this.ditSituacionSats = ditSituacionSats;
	}

	public List<DitSocioDO> getDitSocios() {
		return this.ditSocios;
	}

	public void setDitSocios(List<DitSocioDO> ditSocios) {
		this.ditSocios = ditSocios;
	}

}