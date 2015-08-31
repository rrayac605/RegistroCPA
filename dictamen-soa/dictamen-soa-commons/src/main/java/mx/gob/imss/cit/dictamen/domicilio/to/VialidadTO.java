package mx.gob.imss.cit.dictamen.domicilio.to;

import mx.gob.imss.cit.dictamen.commons.to.BaseTO;

public class VialidadTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer clave;
	private String nombre;
	private TipoVialidadTO tipovialidad;
	
	public Integer getClave() {
		return clave;
	}
	public void setClave(Integer clave) {
		this.clave = clave;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public TipoVialidadTO getTipovialidad() {
		return tipovialidad;
	}
	public void setTipovialidad(TipoVialidadTO tipovialidad) {
		this.tipovialidad = tipovialidad;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clave == null) ? 0 : clave.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((tipovialidad == null) ? 0 : tipovialidad.hashCode());
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
		VialidadTO other = (VialidadTO) obj;
		if (clave == null) {
			if (other.clave != null)
				return false;
		} else if (!clave.equals(other.clave))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (tipovialidad == null) {
			if (other.tipovialidad != null)
				return false;
		} else if (!tipovialidad.equals(other.tipovialidad))
			return false;
		return true;
	}
	
}
