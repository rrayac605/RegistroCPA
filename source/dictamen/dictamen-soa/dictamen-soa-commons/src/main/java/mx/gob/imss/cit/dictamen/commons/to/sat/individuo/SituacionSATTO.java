package mx.gob.imss.cit.dictamen.commons.to.sat.individuo;

import java.util.Date;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class SituacionSATTO extends BaseTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3290323181043175369L;
	private String situacionesSAT;
	private String descripcion;
	private Date fechaSituacion;
	private Long idSaturacionSAT;
	private PersonaTO persona;
	public String getSituacionesSAT() {
		return situacionesSAT;
	}
	public void setSituacionesSAT(String situacionesSAT) {
		this.situacionesSAT = situacionesSAT;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechaSituacion() {
		return fechaSituacion;
	}
	public void setFechaSituacion(Date fechaSituacion) {
		this.fechaSituacion = fechaSituacion;
	}
	public Long getIdSaturacionSAT() {
		return idSaturacionSAT;
	}
	public void setIdSaturacionSAT(Long idSaturacionSAT) {
		this.idSaturacionSAT = idSaturacionSAT;
	}
	public PersonaTO getPersona() {
		return persona;
	}
	public void setPersona(PersonaTO persona) {
		this.persona = persona;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((fechaSituacion == null) ? 0 : fechaSituacion.hashCode());
		result = prime * result + ((idSaturacionSAT == null) ? 0 : idSaturacionSAT.hashCode());
		result = prime * result + ((persona == null) ? 0 : persona.hashCode());
		result = prime * result + ((situacionesSAT == null) ? 0 : situacionesSAT.hashCode());
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
		SituacionSATTO other = (SituacionSATTO) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (fechaSituacion == null) {
			if (other.fechaSituacion != null)
				return false;
		} else if (!fechaSituacion.equals(other.fechaSituacion))
			return false;
		if (idSaturacionSAT == null) {
			if (other.idSaturacionSAT != null)
				return false;
		} else if (!idSaturacionSAT.equals(other.idSaturacionSAT))
			return false;
		if (persona == null) {
			if (other.persona != null)
				return false;
		} else if (!persona.equals(other.persona))
			return false;
		if (situacionesSAT == null) {
			if (other.situacionesSAT != null)
				return false;
		} else if (!situacionesSAT.equals(other.situacionesSAT))
			return false;
		return true;
	}
	
	

}
