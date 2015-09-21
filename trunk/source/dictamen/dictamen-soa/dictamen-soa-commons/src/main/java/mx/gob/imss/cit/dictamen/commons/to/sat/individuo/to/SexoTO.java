package mx.gob.imss.cit.dictamen.commons.to.sat.individuo.to;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class SexoTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String descripcion;
	private String genero;
	private Integer idSexo;
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Integer getIdSexo() {
		return idSexo;
	}
	public void setIdSexo(Integer idSexo) {
		this.idSexo = idSexo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + ((idSexo == null) ? 0 : idSexo.hashCode());
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
		SexoTO other = (SexoTO) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (idSexo == null) {
			if (other.idSexo != null)
				return false;
		} else if (!idSexo.equals(other.idSexo))
			return false;
		return true;
	}
	
	
}
