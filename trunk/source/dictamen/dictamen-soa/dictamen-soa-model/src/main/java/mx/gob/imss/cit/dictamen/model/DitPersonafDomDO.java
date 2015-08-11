package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the DIT_PERSONAF_DOM database table.
 * 
 */
@Entity
@Table(name="DIT_PERSONAF_DOM")
@NamedQuery(name="DitPersonafDomDO.findAll", query="SELECT d FROM DitPersonafDomDO d")
public class DitPersonafDomDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_PERSONAF_DOM")
	private long cveIdPersonafDom;

	@Column(name="CVE_ID_TIPO_DOMICILIO")
	private BigDecimal cveIdTipoDomicilio;

	@Column(name="DES_SECTOR_DISTRIBUCION")
	private String desSectorDistribucion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-one association to DgDomicilioGeograficoDO
	@ManyToOne
	@JoinColumn(name="DOMICILIO_ID")
	private DgDomicilioGeograficoDO dgDomicilioGeografico;

	//bi-directional many-to-one association to DitPersonaDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA")
	private DitPersonaDO ditPersona;

	public DitPersonafDomDO() {
	}

	public long getCveIdPersonafDom() {
		return this.cveIdPersonafDom;
	}

	public void setCveIdPersonafDom(long cveIdPersonafDom) {
		this.cveIdPersonafDom = cveIdPersonafDom;
	}

	public BigDecimal getCveIdTipoDomicilio() {
		return this.cveIdTipoDomicilio;
	}

	public void setCveIdTipoDomicilio(BigDecimal cveIdTipoDomicilio) {
		this.cveIdTipoDomicilio = cveIdTipoDomicilio;
	}

	public String getDesSectorDistribucion() {
		return this.desSectorDistribucion;
	}

	public void setDesSectorDistribucion(String desSectorDistribucion) {
		this.desSectorDistribucion = desSectorDistribucion;
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

	public DgDomicilioGeograficoDO getDgDomicilioGeografico() {
		return this.dgDomicilioGeografico;
	}

	public void setDgDomicilioGeografico(DgDomicilioGeograficoDO dgDomicilioGeografico) {
		this.dgDomicilioGeografico = dgDomicilioGeografico;
	}

	public DitPersonaDO getDitPersona() {
		return this.ditPersona;
	}

	public void setDitPersona(DitPersonaDO ditPersona) {
		this.ditPersona = ditPersona;
	}

}