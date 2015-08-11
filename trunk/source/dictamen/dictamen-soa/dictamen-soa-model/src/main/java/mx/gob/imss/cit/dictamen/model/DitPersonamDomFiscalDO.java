package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the DIT_PERSONAM_DOM_FISCAL database table.
 * 
 */
@Entity
@Table(name="DIT_PERSONAM_DOM_FISCAL")
@NamedQuery(name="DitPersonamDomFiscalDO.findAll", query="SELECT d FROM DitPersonamDomFiscalDO d")
public class DitPersonamDomFiscalDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_PMDOM_FISCAL")
	private long cveIdPmdomFiscal;

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

	//bi-directional many-to-one association to DitPersonaMoralDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA_MORAL")
	private DitPersonaMoralDO ditPersonaMoral;

	public DitPersonamDomFiscalDO() {
	}

	public long getCveIdPmdomFiscal() {
		return this.cveIdPmdomFiscal;
	}

	public void setCveIdPmdomFiscal(long cveIdPmdomFiscal) {
		this.cveIdPmdomFiscal = cveIdPmdomFiscal;
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

	public DitPersonaMoralDO getDitPersonaMoral() {
		return this.ditPersonaMoral;
	}

	public void setDitPersonaMoral(DitPersonaMoralDO ditPersonaMoral) {
		this.ditPersonaMoral = ditPersonaMoral;
	}

}