package mx.gob.imss.cit.dictamen.commons.to.sat.domicilio;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class SubdelegacionTO extends BaseTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -947433437518635171L;
	private String clave;
	private DelegacionTO delegacion;
	private String descripcion;
	private Long id;
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public DelegacionTO getDelegacion() {
		return delegacion;
	}
	public void setDelegacion(DelegacionTO delegacion) {
		this.delegacion = delegacion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clave == null) ? 0 : clave.hashCode());
		result = prime * result + ((delegacion == null) ? 0 : delegacion.hashCode());
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		SubdelegacionTO other = (SubdelegacionTO) obj;
		if (clave == null) {
			if (other.clave != null)
				return false;
		} else if (!clave.equals(other.clave))
			return false;
		if (delegacion == null) {
			if (other.delegacion != null)
				return false;
		} else if (!delegacion.equals(other.delegacion))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
