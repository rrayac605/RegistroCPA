package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the DIT_REPRESENTANTE_LEGAL database table.
 * 
 */
@Entity
@Table(name="DIT_REPRESENTANTE_LEGAL")
@NamedQuery(name="DitRepresentanteLegalDO.findAll", query="SELECT d FROM DitRepresentanteLegalDO d")
public class DitRepresentanteLegalDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_REPRESENTANTE_LEGAL")
	private long cveIdRepresentanteLegal;

	@Column(name="CVE_ID_MANDATO")
	private BigDecimal cveIdMandato;

	@Column(name="CVE_ID_TIPO_PODER")
	private BigDecimal cveIdTipoPoder;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="IND_ACT_ADMON_DOMINIO")
	private BigDecimal indActAdmonDominio;

	@Column(name="IND_ESTATUS")
	private BigDecimal indEstatus;

	private String rupa;

	//bi-directional many-to-one association to DitPatronSujetoObligadoDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PATRON_SUJETO_OBLIGADO")
	private DitPatronSujetoObligadoDO ditPatronSujetoObligado;

	//bi-directional many-to-one association to DitPersonaDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA")
	private DitPersonaDO ditPersona;

	//bi-directional many-to-one association to DitPersonaFisicaDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA_FISICA")
	private DitPersonaFisicaDO ditPersonaFisica;

	//bi-directional many-to-one association to DitPersonaMoralDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA_MORAL")
	private DitPersonaMoralDO ditPersonaMoral;

	public DitRepresentanteLegalDO() {
	}

	public long getCveIdRepresentanteLegal() {
		return this.cveIdRepresentanteLegal;
	}

	public void setCveIdRepresentanteLegal(long cveIdRepresentanteLegal) {
		this.cveIdRepresentanteLegal = cveIdRepresentanteLegal;
	}

	public BigDecimal getCveIdMandato() {
		return this.cveIdMandato;
	}

	public void setCveIdMandato(BigDecimal cveIdMandato) {
		this.cveIdMandato = cveIdMandato;
	}

	public BigDecimal getCveIdTipoPoder() {
		return this.cveIdTipoPoder;
	}

	public void setCveIdTipoPoder(BigDecimal cveIdTipoPoder) {
		this.cveIdTipoPoder = cveIdTipoPoder;
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

	public BigDecimal getIndActAdmonDominio() {
		return this.indActAdmonDominio;
	}

	public void setIndActAdmonDominio(BigDecimal indActAdmonDominio) {
		this.indActAdmonDominio = indActAdmonDominio;
	}

	public BigDecimal getIndEstatus() {
		return this.indEstatus;
	}

	public void setIndEstatus(BigDecimal indEstatus) {
		this.indEstatus = indEstatus;
	}

	public String getRupa() {
		return this.rupa;
	}

	public void setRupa(String rupa) {
		this.rupa = rupa;
	}

	public DitPatronSujetoObligadoDO getDitPatronSujetoObligado() {
		return this.ditPatronSujetoObligado;
	}

	public void setDitPatronSujetoObligado(DitPatronSujetoObligadoDO ditPatronSujetoObligado) {
		this.ditPatronSujetoObligado = ditPatronSujetoObligado;
	}

	public DitPersonaDO getDitPersona() {
		return this.ditPersona;
	}

	public void setDitPersona(DitPersonaDO ditPersona) {
		this.ditPersona = ditPersona;
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

}