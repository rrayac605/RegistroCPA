package mx.gob.imss.cit.dictamen.commons.to.sat.patronal;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class TipoSociedadTO extends BaseTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1565713906536836627L;
	private String descripcion;
	private String descripcionAbreviada;
	private Long idTipoSociedad;
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDescripcionAbreviada() {
		return descripcionAbreviada;
	}
	public void setDescripcionAbreviada(String descripcionAbreviada) {
		this.descripcionAbreviada = descripcionAbreviada;
	}
	public Long getIdTipoSociedad() {
		return idTipoSociedad;
	}
	public void setIdTipoSociedad(Long idTipoSociedad) {
		this.idTipoSociedad = idTipoSociedad;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((descripcionAbreviada == null) ? 0 : descripcionAbreviada.hashCode());
		result = prime * result + ((idTipoSociedad == null) ? 0 : idTipoSociedad.hashCode());
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
		TipoSociedadTO other = (TipoSociedadTO) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (descripcionAbreviada == null) {
			if (other.descripcionAbreviada != null)
				return false;
		} else if (!descripcionAbreviada.equals(other.descripcionAbreviada))
			return false;
		if (idTipoSociedad == null) {
			if (other.idTipoSociedad != null)
				return false;
		} else if (!idTipoSociedad.equals(other.idTipoSociedad))
			return false;
		return true;
	}
	
	
}
