package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the DIT_PERSONA_DOM_EXTRANJERO database table.
 * 
 */
@Entity
@Table(name="DIT_PERSONA_DOM_EXTRANJERO")
@NamedQuery(name="DitPersonaDomExtranjeroDO.findAll", query="SELECT d FROM DitPersonaDomExtranjeroDO d")
public class DitPersonaDomExtranjeroDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_DOM_PERSONA_EXTRANJERO")
	private long cveIdDomPersonaExtranjero;

	@Column(name="DES_CALLE")
	private String desCalle;

	@Column(name="DES_CIUDAD")
	private String desCiudad;

	@Column(name="DES_ENTIDAD")
	private String desEntidad;

	@Column(name="DES_LOCALIDAD")
	private String desLocalidad;

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

	@Column(name="NUM_EXT")
	private String numExt;

	@Column(name="NUM_INT")
	private String numInt;

	@Column(name="REF_CODIGO")
	private String refCodigo;

	//bi-directional many-to-one association to DitPersonaDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PERSONA")
	private DitPersonaDO ditPersona;

	public DitPersonaDomExtranjeroDO() {
	}

	public long getCveIdDomPersonaExtranjero() {
		return this.cveIdDomPersonaExtranjero;
	}

	public void setCveIdDomPersonaExtranjero(long cveIdDomPersonaExtranjero) {
		this.cveIdDomPersonaExtranjero = cveIdDomPersonaExtranjero;
	}

	public String getDesCalle() {
		return this.desCalle;
	}

	public void setDesCalle(String desCalle) {
		this.desCalle = desCalle;
	}

	public String getDesCiudad() {
		return this.desCiudad;
	}

	public void setDesCiudad(String desCiudad) {
		this.desCiudad = desCiudad;
	}

	public String getDesEntidad() {
		return this.desEntidad;
	}

	public void setDesEntidad(String desEntidad) {
		this.desEntidad = desEntidad;
	}

	public String getDesLocalidad() {
		return this.desLocalidad;
	}

	public void setDesLocalidad(String desLocalidad) {
		this.desLocalidad = desLocalidad;
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

	public String getNumExt() {
		return this.numExt;
	}

	public void setNumExt(String numExt) {
		this.numExt = numExt;
	}

	public String getNumInt() {
		return this.numInt;
	}

	public void setNumInt(String numInt) {
		this.numInt = numInt;
	}

	public String getRefCodigo() {
		return this.refCodigo;
	}

	public void setRefCodigo(String refCodigo) {
		this.refCodigo = refCodigo;
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
		result = prime * result + (int) (cveIdDomPersonaExtranjero ^ (cveIdDomPersonaExtranjero >>> 32));
		result = prime * result + ((desCalle == null) ? 0 : desCalle.hashCode());
		result = prime * result + ((desCiudad == null) ? 0 : desCiudad.hashCode());
		result = prime * result + ((desEntidad == null) ? 0 : desEntidad.hashCode());
		result = prime * result + ((desLocalidad == null) ? 0 : desLocalidad.hashCode());
		result = prime * result + ((desPais == null) ? 0 : desPais.hashCode());
		result = prime * result + ((ditPersona == null) ? 0 : ditPersona.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((numExt == null) ? 0 : numExt.hashCode());
		result = prime * result + ((numInt == null) ? 0 : numInt.hashCode());
		result = prime * result + ((refCodigo == null) ? 0 : refCodigo.hashCode());
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
		DitPersonaDomExtranjeroDO other = (DitPersonaDomExtranjeroDO) obj;
		if (cveIdDomPersonaExtranjero != other.cveIdDomPersonaExtranjero)
			return false;
		if (desCalle == null) {
			if (other.desCalle != null)
				return false;
		} else if (!desCalle.equals(other.desCalle))
			return false;
		if (desCiudad == null) {
			if (other.desCiudad != null)
				return false;
		} else if (!desCiudad.equals(other.desCiudad))
			return false;
		if (desEntidad == null) {
			if (other.desEntidad != null)
				return false;
		} else if (!desEntidad.equals(other.desEntidad))
			return false;
		if (desLocalidad == null) {
			if (other.desLocalidad != null)
				return false;
		} else if (!desLocalidad.equals(other.desLocalidad))
			return false;
		if (desPais == null) {
			if (other.desPais != null)
				return false;
		} else if (!desPais.equals(other.desPais))
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
		if (numExt == null) {
			if (other.numExt != null)
				return false;
		} else if (!numExt.equals(other.numExt))
			return false;
		if (numInt == null) {
			if (other.numInt != null)
				return false;
		} else if (!numInt.equals(other.numInt))
			return false;
		if (refCodigo == null) {
			if (other.refCodigo != null)
				return false;
		} else if (!refCodigo.equals(other.refCodigo))
			return false;
		return true;
	}
	
	

}