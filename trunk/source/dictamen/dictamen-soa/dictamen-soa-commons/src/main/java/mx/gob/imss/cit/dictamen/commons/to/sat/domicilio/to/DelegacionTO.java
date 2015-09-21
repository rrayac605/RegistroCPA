package mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.to;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class DelegacionTO extends BaseTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6618328637828950333L;
	private Integer ciz;
	private String clave;
	private String descripcion;
	private Long id;
	public Integer getCiz() {
		return ciz;
	}
	public void setCiz(Integer ciz) {
		this.ciz = ciz;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
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
		result = prime * result + ((ciz == null) ? 0 : ciz.hashCode());
		result = prime * result + ((clave == null) ? 0 : clave.hashCode());
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
		DelegacionTO other = (DelegacionTO) obj;
		if (ciz == null) {
			if (other.ciz != null)
				return false;
		} else if (!ciz.equals(other.ciz))
			return false;
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
