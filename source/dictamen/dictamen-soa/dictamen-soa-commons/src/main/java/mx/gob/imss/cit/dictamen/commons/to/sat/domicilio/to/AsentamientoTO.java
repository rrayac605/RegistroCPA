package mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class AsentamientoTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String clave;
	private CodigoPostalTO codigoPostal;
	private LocalidadTO localidad;
	private MunicipioTO municipio;
	private String nombre;
	private Long periodo;
	private TipoAsentamientoTO tipoAsentamineto;
	/**
	 * @return the clave
	 */
	public String getClave() {
		return clave;
	}
	/**
	 * @param clave the clave to set
	 */
	public void setClave(String clave) {
		this.clave = clave;
	}
	/**
	 * @return the codigoPostal
	 */
	public CodigoPostalTO getCodigoPostal() {
		return codigoPostal;
	}
	/**
	 * @param codigoPostal the codigoPostal to set
	 */
	public void setCodigoPostal(CodigoPostalTO codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	/**
	 * @return the localidad
	 */
	public LocalidadTO getLocalidad() {
		return localidad;
	}
	/**
	 * @param localidad the localidad to set
	 */
	public void setLocalidad(LocalidadTO localidad) {
		this.localidad = localidad;
	}
	/**
	 * @return the municipio
	 */
	public MunicipioTO getMunicipio() {
		return municipio;
	}
	/**
	 * @param municipio the municipio to set
	 */
	public void setMunicipio(MunicipioTO municipio) {
		this.municipio = municipio;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the periodo
	 */
	public Long getPeriodo() {
		return periodo;
	}
	/**
	 * @param periodo the periodo to set
	 */
	public void setPeriodo(Long periodo) {
		this.periodo = periodo;
	}
	/**
	 * @return the tipoAsentamineto
	 */
	public TipoAsentamientoTO getTipoAsentamineto() {
		return tipoAsentamineto;
	}
	/**
	 * @param tipoAsentamineto the tipoAsentamineto to set
	 */
	public void setTipoAsentamineto(TipoAsentamientoTO tipoAsentamineto) {
		this.tipoAsentamineto = tipoAsentamineto;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clave == null) ? 0 : clave.hashCode());
		result = prime * result + ((codigoPostal == null) ? 0 : codigoPostal.hashCode());
		result = prime * result + ((localidad == null) ? 0 : localidad.hashCode());
		result = prime * result + ((municipio == null) ? 0 : municipio.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((periodo == null) ? 0 : periodo.hashCode());
		result = prime * result + ((tipoAsentamineto == null) ? 0 : tipoAsentamineto.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AsentamientoTO other = (AsentamientoTO) obj;
		if (clave == null) {
			if (other.clave != null)
				return false;
		} else if (!clave.equals(other.clave))
			return false;
		if (codigoPostal == null) {
			if (other.codigoPostal != null)
				return false;
		} else if (!codigoPostal.equals(other.codigoPostal))
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
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (periodo == null) {
			if (other.periodo != null)
				return false;
		} else if (!periodo.equals(other.periodo))
			return false;
		if (tipoAsentamineto == null) {
			if (other.tipoAsentamineto != null)
				return false;
		} else if (!tipoAsentamineto.equals(other.tipoAsentamineto))
			return false;
		return true;
	}

}
