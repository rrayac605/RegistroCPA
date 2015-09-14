package mx.gob.imss.cit.dictamen.integration.api.dto;

import java.util.List;

import mx.gob.imss.cit.dictamen.integration.api.dto.base.BaseDTO;

public class SeccionDTO extends BaseDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9131772946363586700L;
	private Integer clave;
	private String seccion;
	private Boolean habilitaSeccion;
	private List<PreguntaDTO> preguntas;
	
	public Integer getClave() {
		return clave;
	}
	public void setClave(Integer clave) {
		this.clave = clave;
	}
	public String getSeccion() {
		return seccion;
	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	public Boolean getHabilitaSeccion() {
		return habilitaSeccion;
	}
	public void setHabilitaSeccion(Boolean habilitaSeccion) {
		this.habilitaSeccion = habilitaSeccion;
	}
	public List<PreguntaDTO> getPreguntas() {
		return preguntas;
	}
	public void setPreguntas(List<PreguntaDTO> preguntas) {
		this.preguntas = preguntas;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clave == null) ? 0 : clave.hashCode());
		result = prime * result + ((habilitaSeccion == null) ? 0 : habilitaSeccion.hashCode());
		result = prime * result + ((preguntas == null) ? 0 : preguntas.hashCode());
		result = prime * result + ((seccion == null) ? 0 : seccion.hashCode());
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
		SeccionDTO other = (SeccionDTO) obj;
		if (clave == null) {
			if (other.clave != null)
				return false;
		} else if (!clave.equals(other.clave))
			return false;
		if (habilitaSeccion == null) {
			if (other.habilitaSeccion != null)
				return false;
		} else if (!habilitaSeccion.equals(other.habilitaSeccion))
			return false;
		if (preguntas == null) {
			if (other.preguntas != null)
				return false;
		} else if (!preguntas.equals(other.preguntas))
			return false;
		if (seccion == null) {
			if (other.seccion != null)
				return false;
		} else if (!seccion.equals(other.seccion))
			return false;
		return true;
	}
	
	
	

}
