package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DIT_PATRON_SUJETO_OBLIGADO database table.
 * 
 */
@Entity
@Table(name="DIT_PATRON_SUJETO_OBLIGADO")
@NamedQuery(name="DitPatronSujetoObligadoDO.findAll", query="SELECT d FROM DitPatronSujetoObligadoDO d")
public class DitPatronSujetoObligadoDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_PATRON_SUJETO_OBLIGADO")
	private long cveIdPatronSujetoObligado;

	@Column(name="CVE_ID_MODALIDAD")
	private BigDecimal cveIdModalidad;

	@Column(name="CVE_ID_TIPO_CONTRIB_MODALIDAD")
	private BigDecimal cveIdTipoContribModalidad;

	@Column(name="CVE_ID_TIPO_INTERESADO")
	private BigDecimal cveIdTipoInteresado;

	@Column(name="CVE_ID_TIPO_PAGO_MODALIDAD")
	private BigDecimal cveIdTipoPagoModalidad;

	@Column(name="DES_AFECTACION")
	private String desAfectacion;

	@Column(name="DES_NOMBRE_COMERCIAL")
	private String desNombreComercial;

	@Column(name="DES_USOS_BIENES")
	private String desUsosBienes;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="IND_MIGR_DOM")
	private BigDecimal indMigrDom;

	@Column(name="IND_PATRON_CONFIRMADO")
	private BigDecimal indPatronConfirmado;

	//bi-directional many-to-one association to DitPatronGeneralDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPatronSujetoObligado")
	private List<DitPatronGeneralDO> ditPatronGenerals;

	//bi-directional many-to-one association to DitPersonaFisicaDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA_FISICA")
	private DitPersonaFisicaDO ditPersonaFisica;

	//bi-directional many-to-one association to DitPersonaMoralDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA_MORAL")
	private DitPersonaMoralDO ditPersonaMoral;

	//bi-directional many-to-one association to DitRepresentanteLegalDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPatronSujetoObligado")
	private List<DitRepresentanteLegalDO> ditRepresentanteLegals;

	//bi-directional many-to-one association to NdtPatronDictamenDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPatronSujetoObligado")
	private List<NdtPatronDictamenDO> ndtPatronDictamens;

	//bi-directional many-to-one association to NdtR2DespachoDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditPatronSujetoObligado")
	private List<NdtR2DespachoDO> ndtR2Despachos;

	public DitPatronSujetoObligadoDO() {
	}

	public long getCveIdPatronSujetoObligado() {
		return this.cveIdPatronSujetoObligado;
	}

	public void setCveIdPatronSujetoObligado(long cveIdPatronSujetoObligado) {
		this.cveIdPatronSujetoObligado = cveIdPatronSujetoObligado;
	}

	public BigDecimal getCveIdModalidad() {
		return this.cveIdModalidad;
	}

	public void setCveIdModalidad(BigDecimal cveIdModalidad) {
		this.cveIdModalidad = cveIdModalidad;
	}

	public BigDecimal getCveIdTipoContribModalidad() {
		return this.cveIdTipoContribModalidad;
	}

	public void setCveIdTipoContribModalidad(BigDecimal cveIdTipoContribModalidad) {
		this.cveIdTipoContribModalidad = cveIdTipoContribModalidad;
	}

	public BigDecimal getCveIdTipoInteresado() {
		return this.cveIdTipoInteresado;
	}

	public void setCveIdTipoInteresado(BigDecimal cveIdTipoInteresado) {
		this.cveIdTipoInteresado = cveIdTipoInteresado;
	}

	public BigDecimal getCveIdTipoPagoModalidad() {
		return this.cveIdTipoPagoModalidad;
	}

	public void setCveIdTipoPagoModalidad(BigDecimal cveIdTipoPagoModalidad) {
		this.cveIdTipoPagoModalidad = cveIdTipoPagoModalidad;
	}

	public String getDesAfectacion() {
		return this.desAfectacion;
	}

	public void setDesAfectacion(String desAfectacion) {
		this.desAfectacion = desAfectacion;
	}

	public String getDesNombreComercial() {
		return this.desNombreComercial;
	}

	public void setDesNombreComercial(String desNombreComercial) {
		this.desNombreComercial = desNombreComercial;
	}

	public String getDesUsosBienes() {
		return this.desUsosBienes;
	}

	public void setDesUsosBienes(String desUsosBienes) {
		this.desUsosBienes = desUsosBienes;
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

	public BigDecimal getIndMigrDom() {
		return this.indMigrDom;
	}

	public void setIndMigrDom(BigDecimal indMigrDom) {
		this.indMigrDom = indMigrDom;
	}

	public BigDecimal getIndPatronConfirmado() {
		return this.indPatronConfirmado;
	}

	public void setIndPatronConfirmado(BigDecimal indPatronConfirmado) {
		this.indPatronConfirmado = indPatronConfirmado;
	}

	public List<DitPatronGeneralDO> getDitPatronGenerals() {
		return this.ditPatronGenerals;
	}

	public void setDitPatronGenerals(List<DitPatronGeneralDO> ditPatronGenerals) {
		this.ditPatronGenerals = ditPatronGenerals;
	}

	public DitPersonaFisicaDO getDitPersonaFisica() {
		return this.ditPersonaFisica;
	}

	public void setDitPersonaFisica(DitPersonaFisicaDO ditPersonaFisica) {
		this.ditPersonaFisica = ditPersonaFisica;
	}

	public DitPersonaMoralDO getDitPersonaMoral() {
		return this.ditPersonaMoral;
	}

	public void setDitPersonaMoral(DitPersonaMoralDO ditPersonaMoral) {
		this.ditPersonaMoral = ditPersonaMoral;
	}

	public List<DitRepresentanteLegalDO> getDitRepresentanteLegals() {
		return this.ditRepresentanteLegals;
	}

	public void setDitRepresentanteLegals(List<DitRepresentanteLegalDO> ditRepresentanteLegals) {
		this.ditRepresentanteLegals = ditRepresentanteLegals;
	}

	public List<NdtPatronDictamenDO> getNdtPatronDictamens() {
		return this.ndtPatronDictamens;
	}

	public void setNdtPatronDictamens(List<NdtPatronDictamenDO> ndtPatronDictamens) {
		this.ndtPatronDictamens = ndtPatronDictamens;
	}
	public List<NdtR2DespachoDO> getNdtR2Despachos() {
		return this.ndtR2Despachos;
	}

	public void setNdtR2Despachos(List<NdtR2DespachoDO> ndtR2Despachos) {
		this.ndtR2Despachos = ndtR2Despachos;
	}

}