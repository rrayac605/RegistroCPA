package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the DIT_PERSONAM_DOM database table.
 * 
 */
@Entity
@Table(name="DIT_PERSONAM_DOM")
@NamedQuery(name="DitPersonamDomDO.findAll", query="SELECT d FROM DitPersonamDomDO d")
public class DitPersonamDomDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_PERSONAM_DOM")
	private long cveIdPersonamDom;

	@Column(name="CVE_ID_MEDIO_DISTRIBUCION")
	private BigDecimal cveIdMedioDistribucion;

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

	//bi-directional many-to-one association to DitPersonaMoralDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA_MORAL")
	private DitPersonaMoralDO ditPersonaMoral;

	public DitPersonamDomDO() {
	}

	public long getCveIdPersonamDom() {
		return this.cveIdPersonamDom;
	}

	public void setCveIdPersonamDom(long cveIdPersonamDom) {
		this.cveIdPersonamDom = cveIdPersonamDom;
	}

	public BigDecimal getCveIdMedioDistribucion() {
		return this.cveIdMedioDistribucion;
	}

	public void setCveIdMedioDistribucion(BigDecimal cveIdMedioDistribucion) {
		this.cveIdMedioDistribucion = cveIdMedioDistribucion;
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

	public DitPersonaMoralDO getDitPersonaMoral() {
		return this.ditPersonaMoral;
	}

	public void setDitPersonaMoral(DitPersonaMoralDO ditPersonaMoral) {
		this.ditPersonaMoral = ditPersonaMoral;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cveIdMedioDistribucion == null) ? 0 : cveIdMedioDistribucion.hashCode());
		result = prime * result + (int) (cveIdPersonamDom ^ (cveIdPersonamDom >>> 32));
		result = prime * result + ((cveIdTipoDomicilio == null) ? 0 : cveIdTipoDomicilio.hashCode());
		result = prime * result + ((desSectorDistribucion == null) ? 0 : desSectorDistribucion.hashCode());
		result = prime * result + ((dgDomicilioGeografico == null) ? 0 : dgDomicilioGeografico.hashCode());
		result = prime * result + ((ditPersonaMoral == null) ? 0 : ditPersonaMoral.hashCode());
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
		DitPersonamDomDO other = (DitPersonamDomDO) obj;
		if (cveIdMedioDistribucion == null) {
			if (other.cveIdMedioDistribucion != null)
				return false;
		} else if (!cveIdMedioDistribucion.equals(other.cveIdMedioDistribucion))
			return false;
		if (cveIdPersonamDom != other.cveIdPersonamDom)
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
		if (ditPersonaMoral == null) {
			if (other.ditPersonaMoral != null)
				return false;
		} else if (!ditPersonaMoral.equals(other.ditPersonaMoral))
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