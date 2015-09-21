package mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class TipoDocumentoProbatorioTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String descripcion;
	private Integer idTipoDocumetoProbatorio;
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the idTipoDocumetoProbatorio
	 */
	public Integer getIdTipoDocumetoProbatorio() {
		return idTipoDocumetoProbatorio;
	}
	/**
	 * @param idTipoDocumetoProbatorio the idTipoDocumetoProbatorio to set
	 */
	public void setIdTipoDocumetoProbatorio(Integer idTipoDocumetoProbatorio) {
		this.idTipoDocumetoProbatorio = idTipoDocumetoProbatorio;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((idTipoDocumetoProbatorio == null) ? 0 : idTipoDocumetoProbatorio.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoDocumentoProbatorioTO other = (TipoDocumentoProbatorioTO) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (idTipoDocumetoProbatorio == null) {
			if (other.idTipoDocumetoProbatorio != null)
				return false;
		} else if (!idTipoDocumetoProbatorio.equals(other.idTipoDocumetoProbatorio))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TipoDocumentoProbatorioTo [descripcion=" + descripcion + ", idTipoDocumetoProbatorio="
				+ idTipoDocumetoProbatorio + "]";
	}
	
}
