package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the DIT_PERSONAF_DOM_FISCAL database table.
 * 
 */
@Entity
@Table(name="DIT_PERSONAF_DOM_FISCAL")
@NamedQuery(name="DitPersonafDomFiscalDO.findAll", query="SELECT d FROM DitPersonafDomFiscalDO d")
public class DitPersonafDomFiscalDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_PFDOM_FISCAL")
	private long cveIdPfdomFiscal;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-one association to DitDomicilioSatDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_DOMICILIO")
	private DitDomicilioSatDO ditDomicilioSat;

	//bi-directional many-to-one association to DitPersonaFisicaDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA_FISICA")
	private DitPersonaFisicaDO ditPersonaFisica;

	public DitPersonafDomFiscalDO() {
	}

	public long getCveIdPfdomFiscal() {
		return this.cveIdPfdomFiscal;
	}

	public void setCveIdPfdomFiscal(long cveIdPfdomFiscal) {
		this.cveIdPfdomFiscal = cveIdPfdomFiscal;
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

	public DitDomicilioSatDO getDitDomicilioSat() {
		return this.ditDomicilioSat;
	}

	public void setDitDomicilioSat(DitDomicilioSatDO ditDomicilioSat) {
		this.ditDomicilioSat = ditDomicilioSat;
	}

	public DitPersonaFisicaDO getDitPersonaFisica() {
		return this.ditPersonaFisica;
	}

	public void setDitPersonaFisica(DitPersonaFisicaDO ditPersonaFisica) {
		this.ditPersonaFisica = ditPersonaFisica;
	}

}