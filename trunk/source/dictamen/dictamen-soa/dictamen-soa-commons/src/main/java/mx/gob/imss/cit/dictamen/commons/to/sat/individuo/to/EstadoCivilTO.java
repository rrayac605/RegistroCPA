package mx.gob.imss.cit.dictamen.commons.to.sat.individuo.to;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class EstadoCivilTO extends BaseTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String descripcion;
	private Integer idEstadoCivil;
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getIdEstadoCivil() {
		return idEstadoCivil;
	}
	public void setIdEstadoCivil(Integer idEstadoCivil) {
		this.idEstadoCivil = idEstadoCivil;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((idEstadoCivil == null) ? 0 : idEstadoCivil.hashCode());
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
		EstadoCivilTO other = (EstadoCivilTO) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (idEstadoCivil == null) {
			if (other.idEstadoCivil != null)
				return false;
		} else if (!idEstadoCivil.equals(other.idEstadoCivil))
			return false;
		return true;
	}
	
	
	
}
