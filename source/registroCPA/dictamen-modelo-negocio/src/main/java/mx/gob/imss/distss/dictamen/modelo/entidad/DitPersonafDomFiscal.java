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
@Table(name="DIT_PERSONAF_DOM_FISCAL")
@NamedQuery(name="DitPersonafDomFiscal.findAll", query="SELECT d FROM DitPersonafDomFiscal d")
public class DitPersonafDomFiscal implements Serializable {
	
	private static final long serialVersionUID = 1049024690178781250L;
	
	@Id
	@Column(name="CVE_ID_PFDOM_FISCAL", unique=true, nullable=false)
	private Long cveIdPfdomFiscal;

	@Column(name="CVE_ID_PERSONA_FISICA", nullable=false)
	private Long cveIdPersonaFisica;

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

	public DitPersonafDomFiscal() {
	}

	public Long getCveIdPfdomFiscal() {
		return cveIdPfdomFiscal;
	}

	public void setCveIdPfdomFiscal(Long cveIdPfdomFiscal) {
		this.cveIdPfdomFiscal = cveIdPfdomFiscal;
	}

	public Long getCveIdPersonaFisica() {
		return cveIdPersonaFisica;
	}

	public void setCveIdPersonaFisica(Long cveIdPersonaFisica) {
		this.cveIdPersonaFisica = cveIdPersonaFisica;
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
