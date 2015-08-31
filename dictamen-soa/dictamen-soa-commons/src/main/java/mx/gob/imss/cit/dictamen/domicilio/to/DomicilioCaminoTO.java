package mx.gob.imss.cit.dictamen.domicilio.to;

import mx.gob.imss.cit.dictamen.commons.to.BaseTO;

public class DomicilioCaminoTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cadenamiento;
	private String destino;
	private TipoMargenTO margen;
	private String nombreVialidad;
	private String origen;
	private TipoTerminoGeneralTO terminoGeneral;
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
	 * @return the margen
	 */
	public TipoMargenTO getMargen() {
		return margen;
	}
	/**
	 * @param margen the margen to set
	 */
	public void setMargen(TipoMargenTO margen) {
		this.margen = margen;
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
		return origen;
	}
	/**
	 * @param origen the origen to set
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
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
		result = prime * result + ((cadenamiento == null) ? 0 : cadenamiento.hashCode());
		result = prime * result + ((destino == null) ? 0 : destino.hashCode());
		result = prime * result + ((margen == null) ? 0 : margen.hashCode());
		result = prime * result + ((nombreVialidad == null) ? 0 : nombreVialidad.hashCode());
		result = prime * result + ((origen == null) ? 0 : origen.hashCode());
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
		DomicilioCaminoTO other = (DomicilioCaminoTO) obj;
		if (cadenamiento == null) {
			if (other.cadenamiento != null)
				return false;
		} else if (!cadenamiento.equals(other.cadenamiento))
			return false;
		if (destino == null) {
			if (other.destino != null)
				return false;
		} else if (!destino.equals(other.destino))
			return false;
		if (margen == null) {
			if (other.margen != null)
				return false;
		} else if (!margen.equals(other.margen))
			return false;
		if (nombreVialidad == null) {
			if (other.nombreVialidad != null)
				return false;
		} else if (!nombreVialidad.equals(other.nombreVialidad))
			return false;
		if (origen == null) {
			if (other.origen != null)
				return false;
		} else if (!origen.equals(other.origen))
			return false;
		if (terminoGeneral == null) {
			if (other.terminoGeneral != null)
				return false;
		} else if (!terminoGeneral.equals(other.terminoGeneral))
			return false;
		return true;
	}
	
	
}
