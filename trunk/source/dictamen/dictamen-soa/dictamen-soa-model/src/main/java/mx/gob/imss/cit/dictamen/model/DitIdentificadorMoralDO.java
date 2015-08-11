package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the DIT_IDENTIFICADOR_MORAL database table.
 * 
 */
@Entity
@Table(name="DIT_IDENTIFICADOR_MORAL")
@NamedQuery(name="DitIdentificadorMoralDO.findAll", query="SELECT d FROM DitIdentificadorMoralDO d")
public class DitIdentificadorMoralDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_IDENTIFICADOR_MORAL")
	private long cveIdIdentificadorMoral;

	@Column(name="CVE_ID_TIPO_IDENTIFICADOR")
	private BigDecimal cveIdTipoIdentificador;

	@Column(name="CVE_IDENTIFICADORA")
	private String cveIdentificadora;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="IND_VIGENTE")
	private BigDecimal indVigente;

	//bi-directional many-to-one association to DitPersonaMoralDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA_MORAL")
	private DitPersonaMoralDO ditPersonaMoral;

	public DitIdentificadorMoralDO() {
	}

	public long getCveIdIdentificadorMoral() {
		return this.cveIdIdentificadorMoral;
	}

	public void setCveIdIdentificadorMoral(long cveIdIdentificadorMoral) {
		this.cveIdIdentificadorMoral = cveIdIdentificadorMoral;
	}

	public BigDecimal getCveIdTipoIdentificador() {
		return this.cveIdTipoIdentificador;
	}

	public void setCveIdTipoIdentificador(BigDecimal cveIdTipoIdentificador) {
		this.cveIdTipoIdentificador = cveIdTipoIdentificador;
	}

	public String getCveIdentificadora() {
		return this.cveIdentificadora;
	}

	public void setCveIdentificadora(String cveIdentificadora) {
		this.cveIdentificadora = cveIdentificadora;
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

	public BigDecimal getIndVigente() {
		return this.indVigente;
	}

	public void setIndVigente(BigDecimal indVigente) {
		this.indVigente = indVigente;
	}

	public DitPersonaMoralDO getDitPersonaMoral() {
		return this.ditPersonaMoral;
	}

	public void setDitPersonaMoral(DitPersonaMoralDO ditPersonaMoral) {
		this.ditPersonaMoral = ditPersonaMoral;
	}

}