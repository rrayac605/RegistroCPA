package mx.gob.imss.cit.dictamen.commons.to.sat.derechohabiente.to;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class ClavePresupuestalTO extends BaseTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4712519606450589899L;
	private String clavePresupuestal;
	private String clavePresupuestalRecortada;
	private String descripcion;
	private Long idClavePresupuestal;
	public String getClavePresupuestal() {
		return clavePresupuestal;
	}
	public void setClavePresupuestal(String clavePresupuestal) {
		this.clavePresupuestal = clavePresupuestal;
	}
	public String getClavePresupuestalRecortada() {
		return clavePresupuestalRecortada;
	}
	public void setClavePresupuestalRecortada(String clavePresupuestalRecortada) {
		this.clavePresupuestalRecortada = clavePresupuestalRecortada;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Long getIdClavePresupuestal() {
		return idClavePresupuestal;
	}
	public void setIdClavePresupuestal(Long idClavePresupuestal) {
		this.idClavePresupuestal = idClavePresupuestal;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clavePresupuestal == null) ? 0 : clavePresupuestal.hashCode());
		result = prime * result + ((clavePresupuestalRecortada == null) ? 0 : clavePresupuestalRecortada.hashCode());
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((idClavePresupuestal == null) ? 0 : idClavePresupuestal.hashCode());
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
		ClavePresupuestalTO other = (ClavePresupuestalTO) obj;
		if (clavePresupuestal == null) {
			if (other.clavePresupuestal != null)
				return false;
		} else if (!clavePresupuestal.equals(other.clavePresupuestal))
			return false;
		if (clavePresupuestalRecortada == null) {
			if (other.clavePresupuestalRecortada != null)
				return false;
		} else if (!clavePresupuestalRecortada.equals(other.clavePresupuestalRecortada))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (idClavePresupuestal == null) {
			if (other.idClavePresupuestal != null)
				return false;
		} else if (!idClavePresupuestal.equals(other.idClavePresupuestal))
			return false;
		return true;
	}
	
	
	
}
