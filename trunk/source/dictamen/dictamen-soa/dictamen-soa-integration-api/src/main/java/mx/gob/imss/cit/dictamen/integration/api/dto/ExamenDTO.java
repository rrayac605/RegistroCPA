package mx.gob.imss.cit.dictamen.integration.api.dto;

import java.util.List;

import mx.gob.imss.cit.dictamen.integration.api.dto.base.BaseDTO;

public class ExamenDTO extends BaseDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3901424321125859112L;
	private Integer clave;
	private String examen;
	private List<SeccionDTO> secciones;
	public Integer getClave() {
		return clave;
	}
	public void setClave(Integer clave) {
		this.clave = clave;
	}
	public String getExamen() {
		return examen;
	}
	public void setExamen(String examen) {
		this.examen = examen;
	}
	public List<SeccionDTO> getSecciones() {
		return secciones;
	}
	public void setSecciones(List<SeccionDTO> secciones) {
		this.secciones = secciones;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clave == null) ? 0 : clave.hashCode());
		result = prime * result + ((examen == null) ? 0 : examen.hashCode());
		result = prime * result + ((secciones == null) ? 0 : secciones.hashCode());
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
		ExamenDTO other = (ExamenDTO) obj;
		if (clave == null) {
			if (other.clave != null)
				return false;
		} else if (!clave.equals(other.clave))
			return false;
		if (examen == null) {
			if (other.examen != null)
				return false;
		} else if (!examen.equals(other.examen))
			return false;
		if (secciones == null) {
			if (other.secciones != null)
				return false;
		} else if (!secciones.equals(other.secciones))
			return false;
		return true;
	}
	
	
}
