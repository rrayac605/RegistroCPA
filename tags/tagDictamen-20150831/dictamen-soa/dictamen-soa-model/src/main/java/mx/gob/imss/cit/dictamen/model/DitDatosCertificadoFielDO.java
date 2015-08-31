package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the DIT_DATOS_CERTIFICADO_FIEL database table.
 * 
 */
@Entity
@Table(name="DIT_DATOS_CERTIFICADO_FIEL")
@NamedQuery(name="DitDatosCertificadoFielDO.findAll", query="SELECT d FROM DitDatosCertificadoFielDO d")
public class DitDatosCertificadoFielDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_DATOS_CERT_FIEL")
	private long cveIdDatosCertFiel;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_FIN_VIGENCIA")
	private Date fecFinVigencia;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_INI_VIGENCIA")
	private Date fecIniVigencia;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="NUM_SERIAL")
	private String numSerial;

	//bi-directional many-to-one association to DitPersonaFisicaDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA_FISICA")
	private DitPersonaFisicaDO ditPersonaFisica;

	//bi-directional many-to-one association to DitPersonaMoralDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA_MORAL")
	private DitPersonaMoralDO ditPersonaMoral;

	public DitDatosCertificadoFielDO() {
	}

	public long getCveIdDatosCertFiel() {
		return this.cveIdDatosCertFiel;
	}

	public void setCveIdDatosCertFiel(long cveIdDatosCertFiel) {
		this.cveIdDatosCertFiel = cveIdDatosCertFiel;
	}

	public Date getFecFinVigencia() {
		return this.fecFinVigencia;
	}

	public void setFecFinVigencia(Date fecFinVigencia) {
		this.fecFinVigencia = fecFinVigencia;
	}

	public Date getFecIniVigencia() {
		return this.fecIniVigencia;
	}

	public void setFecIniVigencia(Date fecIniVigencia) {
		this.fecIniVigencia = fecIniVigencia;
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

	public String getNumSerial() {
		return this.numSerial;
	}

	public void setNumSerial(String numSerial) {
		this.numSerial = numSerial;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cveIdDatosCertFiel ^ (cveIdDatosCertFiel >>> 32));
		result = prime * result + ((ditPersonaFisica == null) ? 0 : ditPersonaFisica.hashCode());
		result = prime * result + ((ditPersonaMoral == null) ? 0 : ditPersonaMoral.hashCode());
		result = prime * result + ((fecFinVigencia == null) ? 0 : fecFinVigencia.hashCode());
		result = prime * result + ((fecIniVigencia == null) ? 0 : fecIniVigencia.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((numSerial == null) ? 0 : numSerial.hashCode());
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
		DitDatosCertificadoFielDO other = (DitDatosCertificadoFielDO) obj;
		if (cveIdDatosCertFiel != other.cveIdDatosCertFiel)
			return false;
		if (ditPersonaFisica == null) {
			if (other.ditPersonaFisica != null)
				return false;
		} else if (!ditPersonaFisica.equals(other.ditPersonaFisica))
			return false;
		if (ditPersonaMoral == null) {
			if (other.ditPersonaMoral != null)
				return false;
		} else if (!ditPersonaMoral.equals(other.ditPersonaMoral))
			return false;
		if (fecFinVigencia == null) {
			if (other.fecFinVigencia != null)
				return false;
		} else if (!fecFinVigencia.equals(other.fecFinVigencia))
			return false;
		if (fecIniVigencia == null) {
			if (other.fecIniVigencia != null)
				return false;
		} else if (!fecIniVigencia.equals(other.fecIniVigencia))
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
		if (numSerial == null) {
			if (other.numSerial != null)
				return false;
		} else if (!numSerial.equals(other.numSerial))
			return false;
		return true;
	}
	
	

}