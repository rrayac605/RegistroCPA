package mx.gob.imss.distss.dictamen.modelo.entidad;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="DIT_PERSONAM_DOM_FISCAL")
@NamedQuery(name="DitPersonamDomFiscal.findAll", query="SELECT d FROM DitPersonamDomFiscal d")
public class DitPersonamDomFiscal implements Serializable {
	
	private static final long serialVersionUID = 1657092169468751605L;
	
	@Id
	@Column(name="CVE_ID_PMDOM_FISCAL", unique=true, nullable=false)
	private Long cveIdPmdomFiscal;

	@Column(name="CVE_ID_PERSONA_MORAL", nullable=false)
	private Long cveIdPersonaMoral;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-one association to DitDomicilioSat
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_DOMICILIO", nullable=false)
	private DitDomicilioSat ditDomicilioSat;

	public DitPersonamDomFiscal() {
	}

	public Long getCveIdPmdomFiscal() {
		return cveIdPmdomFiscal;
	}

	public void setCveIdPmdomFiscal(Long cveIdPmdomFiscal) {
		this.cveIdPmdomFiscal = cveIdPmdomFiscal;
	}

	public Long getCveIdPersonaMoral() {
		return cveIdPersonaMoral;
	}

	public void setCveIdPersonaMoral(Long cveIdPersonaMoral) {
		this.cveIdPersonaMoral = cveIdPersonaMoral;
	}

	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado;
	}

	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}

	public Date getFecRegistroAlta() {
		return fecRegistroAlta;
	}

	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}

	public Date getFecRegistroBaja() {
		return fecRegistroBaja;
	}

	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}

	public DitDomicilioSat getDitDomicilioSat() {
		return ditDomicilioSat;
	}

	public void setDitDomicilioSat(DitDomicilioSat ditDomicilioSat) {
		this.ditDomicilioSat = ditDomicilioSat;
	}

}
