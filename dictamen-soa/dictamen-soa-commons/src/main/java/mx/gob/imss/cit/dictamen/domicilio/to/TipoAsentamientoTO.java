package mx.gob.imss.cit.dictamen.domicilio.to;

import mx.gob.imss.cit.dictamen.commons.to.BaseTO;

public class TipoAsentamientoTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long clave;
	private String descripcion;
	
	/**
	 * @return the clave
	 */
	public Long getClave() {
		return clave;
	}
	/**
	 * @param clave the clave to set
	 */
	public void setClave(Long clave) {
		this.clave = clave;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clave == null) ? 0 : clave.hashCode());
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
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
		TipoAsentamientoTO other = (TipoAsentamientoTO) obj;
		if (clave == null) {
			if (other.clave != null)
				return false;
		} else if (!clave.equals(other.clave))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		return true;
	}
	
}
