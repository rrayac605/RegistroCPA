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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cveIdPersonafDom ^ (cveIdPersonafDom >>> 32));
		result = prime * result + ((cveIdTipoDomicilio == null) ? 0 : cveIdTipoDomicilio.hashCode());
		result = prime * result + ((desSectorDistribucion == null) ? 0 : desSectorDistribucion.hashCode());
		result = prime * result + ((dgDomicilioGeografico == null) ? 0 : dgDomicilioGeografico.hashCode());
		result = prime * result + ((ditPersona == null) ? 0 : ditPersona.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DitPersonafDomDO other = (DitPersonafDomDO) obj;
		if (cveIdPersonafDom != other.cveIdPersonafDom)
			return false;
		if (cveIdTipoDomicilio == null) {
			if (other.cveIdTipoDomicilio != null)
				return false;
		} else if (!cveIdTipoDomicilio.equals(other.cveIdTipoDomicilio))
			return false;
		if (desSectorDistribucion == null) {
			if (other.desSectorDistribucion != null)
				return false;
		} else if (!desSectorDistribucion.equals(other.desSectorDistribucion))
			return false;
		if (dgDomicilioGeografico == null) {
			if (other.dgDomicilioGeografico != null)
				return false;
		} else if (!dgDomicilioGeografico.equals(other.dgDomicilioGeografico))
			return false;
		if (ditPersona == null) {
			if (other.ditPersona != null)
				return false;
		} else if (!ditPersona.equals(other.ditPersona))
			return false;
		if (fecRegistroActualizado == null) {
			if (other.fecRegistroActualizado != null)
				return false;
		} else if (!fecRegistroActualizado.equals(other.fecRegistroActualizado))
			return false;
		if (fecRegistroAlta == null) {
			if (other.fecRegistroAlta != null)
				return false;
		} else if (!fecRegistroAlta.equals(other.fecRegistroAlta))
			return false;
		if (fecRegistroBaja == null) {
			if (other.fecRegistroBaja != null)
				return false;
		} else if (!fecRegistroBaja.equals(other.fecRegistroBaja))
			return false;
		return true;
	}
	
	

}