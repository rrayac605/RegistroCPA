package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the DIC_PAIS database table.
 * 
 */
@Entity
@Table(name="DIC_PAIS")
@NamedQuery(name="DicPaisDO.findAll", query="SELECT d FROM DicPaisDO d")
public class DicPaisDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_PAIS")
	private long cveIdPais;

	@Column(name="DES_NACIONALIDAD")
	private String desNacionalidad;

	@Column(name="DES_PAIS")
	private String desPais;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	private String siglas;

	
	public DicPaisDO() {
	}

	public long getCveIdPais() {
		return this.cveIdPais;
	}

	public void setCveIdPais(long cveIdPais) {
		this.cveIdPais = cveIdPais;
	}

	public String getDesNacionalidad() {
		return this.desNacionalidad;
	}

	public void setDesNacionalidad(String desNacionalidad) {
		this.desNacionalidad = desNacionalidad;
	}

	public String getDesPais() {
		return this.desPais;
	}

	public void setDesPais(String desPais) {
		this.desPais = desPais;
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

	public String getSiglas() {
		return this.siglas;
	}

	public void setSiglas(String siglas) {
		this.siglas = siglas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cveIdPais ^ (cveIdPais >>> 32));
		result = prime * result + ((desNacionalidad == null) ? 0 : desNacionalidad.hashCode());
		result = prime * result + ((desPais == null) ? 0 : desPais.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((siglas == null) ? 0 : siglas.hashCode());
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
		DicPaisDO other = (DicPaisDO) obj;
		if (cveIdPais != other.cveIdPais)
			return false;
		if (desNacionalidad == null) {
			if (other.desNacionalidad != null)
				return false;
		} else if (!desNacionalidad.equals(other.desNacionalidad))
			return false;
		if (desPais == null) {
			if (other.desPais != null)
				return false;
		} else if (!desPais.equals(other.desPais))
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
		if (siglas == null) {
			if (other.siglas != null)
				return false;
		} else if (!siglas.equals(other.siglas))
			return false;
		return true;
	}

}