package mx.gob.imss.cit.dictamen.commons.to.sat.derechohabiente;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class NivelAtencionTO extends BaseTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6827387745733126769L;
	private String descripcion;
	private Long idNivelAtencion;
	
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Long getIdNivelAtencion() {
		return idNivelAtencion;
	}
	public void setIdNivelAtencion(Long idNivelAtencion) {
		this.idNivelAtencion = idNivelAtencion;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((idNivelAtencion == null) ? 0 : idNivelAtencion.hashCode());
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
		NivelAtencionTO other = (NivelAtencionTO) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (idNivelAtencion == null) {
			if (other.idNivelAtencion != null)
				return false;
		} else if (!idNivelAtencion.equals(other.idNivelAtencion))
			return false;
		return true;
	}
	
	
}
