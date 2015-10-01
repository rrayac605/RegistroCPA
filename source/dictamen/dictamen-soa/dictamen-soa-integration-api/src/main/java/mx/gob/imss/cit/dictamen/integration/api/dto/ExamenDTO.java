package mx.gob.imss.cit.dictamen.integration.api.dto;

import java.util.List;

import mx.gob.imss.cit.dictamen.integration.api.dto.base.BaseDTO;

public class ExamenDTO extends BaseDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3901424321125859112L;
	private Long clave;
	private String nombre;
	private List<RubroDTO> rubros;
	private String estado;
	
	public Long getClave() {
		return clave;
	}
	public void setClave(Long long1) {
		this.clave = long1;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<RubroDTO> getRubros() {
		return rubros;
	}
	public void setRubros(List<RubroDTO> rubros) {
		this.rubros = rubros;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clave == null) ? 0 : clave.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((rubros == null) ? 0 : rubros.hashCode());
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
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (rubros == null) {
			if (other.rubros != null)
				return false;
		} else if (!rubros.equals(other.rubros))
			return false;
		return true;
	}
	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
