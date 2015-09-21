package mx.gob.imss.cit.dictamen.commons.to.sat.domicilio;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class DomicilioCarreteraTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TipoAdministracionTO administracion;
	private String cadenamiento;
	private Integer codigoCarretera;
	private TipoDerechoTransitoTO derechoTransito;
	private String destino;
	private String nombreVialidad;
	private String Origen;
	private TipoTerminoGeneralTO terminoGeneral;
	/**
	 * @return the administracion
	 */
	public TipoAdministracionTO getAdministracion() {
		return administracion;
	}
	/**
	 * @param administracion the administracion to set
	 */
	public void setAdministracion(TipoAdministracionTO administracion) {
		this.administracion = administracion;
	}
	/**
	 * @return the cadenamiento
	 */
	public String getCadenamiento() {
		return cadenamiento;
	}
	/**
	 * @param cadenamiento the cadenamiento to set
	 */
	public void setCadenamiento(String cadenamiento) {
		this.cadenamiento = cadenamiento;
	}
	/**
	 * @return the codigoCarretera
	 */
	public Integer getCodigoCarretera() {
		return codigoCarretera;
	}
	/**
	 * @param codigoCarretera the codigoCarretera to set
	 */
	public void setCodigoCarretera(Integer codigoCarretera) {
		this.codigoCarretera = codigoCarretera;
	}
	/**
	 * @return the derechoTransito
	 */
	public TipoDerechoTransitoTO getDerechoTransito() {
		return derechoTransito;
	}
	/**
	 * @param derechoTransito the derechoTransito to set
	 */
	public void setDerechoTransito(TipoDerechoTransitoTO derechoTransito) {
		this.derechoTransito = derechoTransito;
	}
	/**
	 * @return the destino
	 */
	public String getDestino() {
		return destino;
	}
	/**
	 * @param destino the destino to set
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}
	/**
	 * @return the nombreVialidad
	 */
	public String getNombreVialidad() {
		return nombreVialidad;
	}
	/**
	 * @param nombreVialidad the nombreVialidad to set
	 */
	public void setNombreVialidad(String nombreVialidad) {
		this.nombreVialidad = nombreVialidad;
	}
	/**
	 * @return the origen
	 */
	public String getOrigen() {
		return Origen;
	}
	/**
	 * @param origen the origen to set
	 */
	public void setOrigen(String origen) {
		Origen = origen;
	}
	/**
	 * @return the terminoGeneral
	 */
	public TipoTerminoGeneralTO getTerminoGeneral() {
		return terminoGeneral;
	}
	/**
	 * @param terminoGeneral the terminoGeneral to set
	 */
	public void setTerminoGeneral(TipoTerminoGeneralTO terminoGeneral) {
		this.terminoGeneral = terminoGeneral;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Origen == null) ? 0 : Origen.hashCode());
		result = prime * result + ((administracion == null) ? 0 : administracion.hashCode());
		result = prime * result + ((cadenamiento == null) ? 0 : cadenamiento.hashCode());
		result = prime * result + ((codigoCarretera == null) ? 0 : codigoCarretera.hashCode());
		result = prime * result + ((derechoTransito == null) ? 0 : derechoTransito.hashCode());
		result = prime * result + ((destino == null) ? 0 : destino.hashCode());
		result = prime * result + ((nombreVialidad == null) ? 0 : nombreVialidad.hashCode());
		result = prime * result + ((terminoGeneral == null) ? 0 : terminoGeneral.hashCode());
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
		DomicilioCarreteraTO other = (DomicilioCarreteraTO) obj;
		if (Origen == null) {
			if (other.Origen != null)
				return false;
		} else if (!Origen.equals(other.Origen))
			return false;
		if (administracion == null) {
			if (other.administracion != null)
				return false;
		} else if (!administracion.equals(other.administracion))
			return false;
		if (cadenamiento == null) {
			if (other.cadenamiento != null)
				return false;
		} else if (!cadenamiento.equals(other.cadenamiento))
			return false;
		if (codigoCarretera == null) {
			if (other.codigoCarretera != null)
				return false;
		} else if (!codigoCarretera.equals(other.codigoCarretera))
			return false;
		if (derechoTransito == null) {
			if (other.derechoTransito != null)
				return false;
		} else if (!derechoTransito.equals(other.derechoTransito))
			return false;
		if (destino == null) {
			if (other.destino != null)
				return false;
		} else if (!destino.equals(other.destino))
			return false;
		if (nombreVialidad == null) {
			if (other.nombreVialidad != null)
				return false;
		} else if (!nombreVialidad.equals(other.nombreVialidad))
			return false;
		if (terminoGeneral == null) {
			if (other.terminoGeneral != null)
				return false;
		} else if (!terminoGeneral.equals(other.terminoGeneral))
			return false;
		return true;
	}
	
	
}
