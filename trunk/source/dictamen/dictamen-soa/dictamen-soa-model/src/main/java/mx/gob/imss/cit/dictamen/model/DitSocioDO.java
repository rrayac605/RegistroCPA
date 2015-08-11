package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the DIT_SOCIO database table.
 * 
 */
@Entity
@Table(name="DIT_SOCIO")
@NamedQuery(name="DitSocioDO.findAll", query="SELECT d FROM DitSocioDO d")
public class DitSocioDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_SOCIO")
	private long cveIdSocio;

	@Column(name="DES_DENOM_RAZON_SOCIAL")
	private String desDenomRazonSocial;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_CONTRATO")
	private Date fecContrato;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="IND_EXTRANJERO")
	private BigDecimal indExtranjero;

	@Column(name="IND_RESIDENCIA_EXTRANJERO")
	private BigDecimal indResidenciaExtranjero;

	@Column(name="IND_TIPO_SOCIO")
	private BigDecimal indTipoSocio;

	@Column(name="NOM_NOMBRE")
	private String nomNombre;

	@Column(name="NOM_PRIMER_APELLIDO")
	private String nomPrimerApellido;

	@Column(name="NOM_SEGUNDO_APELLIDO")
	private String nomSegundoApellido;

	@Column(name="NUM_INSTRUMENTO")
	private String numInstrumento;

	@Column(name="NUM_NOTARIA")
	private String numNotaria;

	//bi-directional many-to-one association to DgCatEstadoDO
	@ManyToOne
	@JoinColumn(name="CVE_ENT")
	private DgCatEstadoDO dgCatEstado;

	//bi-directional many-to-one association to DitPersonaFisicaDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA_FISICA")
	private DitPersonaFisicaDO ditPersonaFisica;

	//bi-directional many-to-one association to DitPersonaMoralDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PATRON")
	private DitPersonaMoralDO ditPersonaMoral1;

	//bi-directional many-to-one association to DitPersonaMoralDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA_MORAL")
	private DitPersonaMoralDO ditPersonaMoral2;

	public DitSocioDO() {
	}

	public long getCveIdSocio() {
		return this.cveIdSocio;
	}

	public void setCveIdSocio(long cveIdSocio) {
		this.cveIdSocio = cveIdSocio;
	}

	public String getDesDenomRazonSocial() {
		return this.desDenomRazonSocial;
	}

	public void setDesDenomRazonSocial(String desDenomRazonSocial) {
		this.desDenomRazonSocial = desDenomRazonSocial;
	}

	public Date getFecContrato() {
		return this.fecContrato;
	}

	public void setFecContrato(Date fecContrato) {
		this.fecContrato = fecContrato;
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

	public BigDecimal getIndExtranjero() {
		return this.indExtranjero;
	}

	public void setIndExtranjero(BigDecimal indExtranjero) {
		this.indExtranjero = indExtranjero;
	}

	public BigDecimal getIndResidenciaExtranjero() {
		return this.indResidenciaExtranjero;
	}

	public void setIndResidenciaExtranjero(BigDecimal indResidenciaExtranjero) {
		this.indResidenciaExtranjero = indResidenciaExtranjero;
	}

	public BigDecimal getIndTipoSocio() {
		return this.indTipoSocio;
	}

	public void setIndTipoSocio(BigDecimal indTipoSocio) {
		this.indTipoSocio = indTipoSocio;
	}

	public String getNomNombre() {
		return this.nomNombre;
	}

	public void setNomNombre(String nomNombre) {
		this.nomNombre = nomNombre;
	}

	public String getNomPrimerApellido() {
		return this.nomPrimerApellido;
	}

	public void setNomPrimerApellido(String nomPrimerApellido) {
		this.nomPrimerApellido = nomPrimerApellido;
	}

	public String getNomSegundoApellido() {
		return this.nomSegundoApellido;
	}

	public void setNomSegundoApellido(String nomSegundoApellido) {
		this.nomSegundoApellido = nomSegundoApellido;
	}

	public String getNumInstrumento() {
		return this.numInstrumento;
	}

	public void setNumInstrumento(String numInstrumento) {
		this.numInstrumento = numInstrumento;
	}

	public String getNumNotaria() {
		return this.numNotaria;
	}

	public void setNumNotaria(String numNotaria) {
		this.numNotaria = numNotaria;
	}

	public DgCatEstadoDO getDgCatEstado() {
		return this.dgCatEstado;
	}

	public void setDgCatEstado(DgCatEstadoDO dgCatEstado) {
		this.dgCatEstado = dgCatEstado;
	}

	public DitPersonaFisicaDO getDitPersonaFisica() {
		return this.ditPersonaFisica;
	}

	public void setDitPersonaFisica(DitPersonaFisicaDO ditPersonaFisica) {
		this.ditPersonaFisica = ditPersonaFisica;
	}

	public DitPersonaMoralDO getDitPersonaMoral1() {
		return this.ditPersonaMoral1;
	}

	public void setDitPersonaMoral1(DitPersonaMoralDO ditPersonaMoral1) {
		this.ditPersonaMoral1 = ditPersonaMoral1;
	}

	public DitPersonaMoralDO getDitPersonaMoral2() {
		return this.ditPersonaMoral2;
	}

	public void setDitPersonaMoral2(DitPersonaMoralDO ditPersonaMoral2) {
		this.ditPersonaMoral2 = ditPersonaMoral2;
	}

}