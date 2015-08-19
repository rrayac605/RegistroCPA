package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DIT_DOMICILIO_SAT database table.
 * 
 */
@Entity
@Table(name="DIT_DOMICILIO_SAT")
@NamedQuery(name="DitDomicilioSatDO.findAll", query="SELECT d FROM DitDomicilioSatDO d")
public class DitDomicilioSatDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_DOMICILIO")
	private long cveIdDomicilio;

	private String calle;

	private String codigo;

	private String colonia;

	@Column(name="ENTIDAD_FEDERATIVA")
	private String entidadFederativa;

	@Column(name="ENTRE_CALLE_1")
	private String entreCalle1;

	@Column(name="ENTRE_CALLE_2")
	private String entreCalle2;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	private String inmueble;

	private String localidad;

	private String municipio;

	@Column(name="NUM_EXTERIOR")
	private String numExterior;

	@Column(name="NUM_INTERIOR")
	private String numInterior;

	private String referencia;

	private String vialidad;

	//bi-directional many-to-one association to DitPersonafDomFiscalDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditDomicilioSat")
	private List<DitPersonafDomFiscalDO> ditPersonafDomFiscals;

	//bi-directional many-to-one association to DitPersonamDomFiscalDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditDomicilioSat")
	private List<DitPersonamDomFiscalDO> ditPersonamDomFiscals;

	public DitDomicilioSatDO() {
	}

	public long getCveIdDomicilio() {
		return this.cveIdDomicilio;
	}

	public void setCveIdDomicilio(long cveIdDomicilio) {
		this.cveIdDomicilio = cveIdDomicilio;
	}

	public String getCalle() {
		return this.calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getColonia() {
		return this.colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getEntidadFederativa() {
		return this.entidadFederativa;
	}

	public void setEntidadFederativa(String entidadFederativa) {
		this.entidadFederativa = entidadFederativa;
	}

	public String getEntreCalle1() {
		return this.entreCalle1;
	}

	public void setEntreCalle1(String entreCalle1) {
		this.entreCalle1 = entreCalle1;
	}

	public String getEntreCalle2() {
		return this.entreCalle2;
	}

	public void setEntreCalle2(String entreCalle2) {
		this.entreCalle2 = entreCalle2;
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

	public String getInmueble() {
		return this.inmueble;
	}

	public void setInmueble(String inmueble) {
		this.inmueble = inmueble;
	}

	public String getLocalidad() {
		return this.localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getMunicipio() {
		return this.municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getNumExterior() {
		return this.numExterior;
	}

	public void setNumExterior(String numExterior) {
		this.numExterior = numExterior;
	}

	public String getNumInterior() {
		return this.numInterior;
	}

	public void setNumInterior(String numInterior) {
		this.numInterior = numInterior;
	}

	public String getReferencia() {
		return this.referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getVialidad() {
		return this.vialidad;
	}

	public void setVialidad(String vialidad) {
		this.vialidad = vialidad;
	}

	public List<DitPersonafDomFiscalDO> getDitPersonafDomFiscals() {
		return this.ditPersonafDomFiscals;
	}

	public void setDitPersonafDomFiscals(List<DitPersonafDomFiscalDO> ditPersonafDomFiscals) {
		this.ditPersonafDomFiscals = ditPersonafDomFiscals;
	}

	public List<DitPersonamDomFiscalDO> getDitPersonamDomFiscals() {
		return this.ditPersonamDomFiscals;
	}

	public void setDitPersonamDomFiscals(List<DitPersonamDomFiscalDO> ditPersonamDomFiscals) {
		this.ditPersonamDomFiscals = ditPersonamDomFiscals;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((calle == null) ? 0 : calle.hashCode());
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((colonia == null) ? 0 : colonia.hashCode());
		result = prime * result + (int) (cveIdDomicilio ^ (cveIdDomicilio >>> 32));
		result = prime * result + ((ditPersonafDomFiscals == null) ? 0 : ditPersonafDomFiscals.hashCode());
		result = prime * result + ((ditPersonamDomFiscals == null) ? 0 : ditPersonamDomFiscals.hashCode());
		result = prime * result + ((entidadFederativa == null) ? 0 : entidadFederativa.hashCode());
		result = prime * result + ((entreCalle1 == null) ? 0 : entreCalle1.hashCode());
		result = prime * result + ((entreCalle2 == null) ? 0 : entreCalle2.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((inmueble == null) ? 0 : inmueble.hashCode());
		result = prime * result + ((localidad == null) ? 0 : localidad.hashCode());
		result = prime * result + ((municipio == null) ? 0 : municipio.hashCode());
		result = prime * result + ((numExterior == null) ? 0 : numExterior.hashCode());
		result = prime * result + ((numInterior == null) ? 0 : numInterior.hashCode());
		result = prime * result + ((referencia == null) ? 0 : referencia.hashCode());
		result = prime * result + ((vialidad == null) ? 0 : vialidad.hashCode());
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
		DitDomicilioSatDO other = (DitDomicilioSatDO) obj;
		if (calle == null) {
			if (other.calle != null)
				return false;
		} else if (!calle.equals(other.calle))
			return false;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (colonia == null) {
			if (other.colonia != null)
				return false;
		} else if (!colonia.equals(other.colonia))
			return false;
		if (cveIdDomicilio != other.cveIdDomicilio)
			return false;
		if (ditPersonafDomFiscals == null) {
			if (other.ditPersonafDomFiscals != null)
				return false;
		} else if (!ditPersonafDomFiscals.equals(other.ditPersonafDomFiscals))
			return false;
		if (ditPersonamDomFiscals == null) {
			if (other.ditPersonamDomFiscals != null)
				return false;
		} else if (!ditPersonamDomFiscals.equals(other.ditPersonamDomFiscals))
			return false;
		if (entidadFederativa == null) {
			if (other.entidadFederativa != null)
				return false;
		} else if (!entidadFederativa.equals(other.entidadFederativa))
			return false;
		if (entreCalle1 == null) {
			if (other.entreCalle1 != null)
				return false;
		} else if (!entreCalle1.equals(other.entreCalle1))
			return false;
		if (entreCalle2 == null) {
			if (other.entreCalle2 != null)
				return false;
		} else if (!entreCalle2.equals(other.entreCalle2))
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
		if (inmueble == null) {
			if (other.inmueble != null)
				return false;
		} else if (!inmueble.equals(other.inmueble))
			return false;
		if (localidad == null) {
			if (other.localidad != null)
				return false;
		} else if (!localidad.equals(other.localidad))
			return false;
		if (municipio == null) {
			if (other.municipio != null)
				return false;
		} else if (!municipio.equals(other.municipio))
			return false;
		if (numExterior == null) {
			if (other.numExterior != null)
				return false;
		} else if (!numExterior.equals(other.numExterior))
			return false;
		if (numInterior == null) {
			if (other.numInterior != null)
				return false;
		} else if (!numInterior.equals(other.numInterior))
			return false;
		if (referencia == null) {
			if (other.referencia != null)
				return false;
		} else if (!referencia.equals(other.referencia))
			return false;
		if (vialidad == null) {
			if (other.vialidad != null)
				return false;
		} else if (!vialidad.equals(other.vialidad))
			return false;
		return true;
	}
	
	
	
}