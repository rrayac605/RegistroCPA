package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the DIT_DATOS_PERSONA_SAT database table.
 * 
 */
@Entity
@Table(name="DIT_DATOS_PERSONA_SAT")
@NamedQuery(name="DitDatosPersonaSatDO.findAll", query="SELECT d FROM DitDatosPersonaSatDO d")
public class DitDatosPersonaSatDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_DATOS_SAT")
	private long cveIdDatosSat;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_CONSTITUCION")
	private Date fecConstitucion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_INICIO_OPERACIONES")
	private Date fecInicioOperaciones;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-one association to DitPersonaFisicaDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA_FISICA")
	private DitPersonaFisicaDO ditPersonaFisica;

	//bi-directional many-to-one association to DitPersonaMoralDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA_MORAL")
	private DitPersonaMoralDO ditPersonaMoral;

	public DitDatosPersonaSatDO() {
	}

	public long getCveIdDatosSat() {
		return this.cveIdDatosSat;
	}

	public void setCveIdDatosSat(long cveIdDatosSat) {
		this.cveIdDatosSat = cveIdDatosSat;
	}

	public Date getFecConstitucion() {
		return this.fecConstitucion;
	}

	public void setFecConstitucion(Date fecConstitucion) {
		this.fecConstitucion = fecConstitucion;
	}

	public Date getFecInicioOperaciones() {
		return this.fecInicioOperaciones;
	}

	public void setFecInicioOperaciones(Date fecInicioOperaciones) {
		this.fecInicioOperaciones = fecInicioOperaciones;
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
		result = prime * result + (int) (cveIdDatosSat ^ (cveIdDatosSat >>> 32));
		result = prime * result + ((ditPersonaFisica == null) ? 0 : ditPersonaFisica.hashCode());
		result = prime * result + ((ditPersonaMoral == null) ? 0 : ditPersonaMoral.hashCode());
		result = prime * result + ((fecConstitucion == null) ? 0 : fecConstitucion.hashCode());
		result = prime * result + ((fecInicioOperaciones == null) ? 0 : fecInicioOperaciones.hashCode());
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
		DitDatosPersonaSatDO other = (DitDatosPersonaSatDO) obj;
		if (cveIdDatosSat != other.cveIdDatosSat)
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
		if (fecConstitucion == null) {
			if (other.fecConstitucion != null)
				return false;
		} else if (!fecConstitucion.equals(other.fecConstitucion))
			return false;
		if (fecInicioOperaciones == null) {
			if (other.fecInicioOperaciones != null)
				return false;
		} else if (!fecInicioOperaciones.equals(other.fecInicioOperaciones))
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