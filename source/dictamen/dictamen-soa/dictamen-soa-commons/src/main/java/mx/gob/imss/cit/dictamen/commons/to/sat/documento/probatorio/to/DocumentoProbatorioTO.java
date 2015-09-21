package mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.to;

import java.util.Arrays;
import java.util.Date;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.enums.EstadoAdministracionEnum;
import mx.gob.imss.cit.dictamen.commons.to.sat.individuo.to.PersonaTO;

public class DocumentoProbatorioTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cifrado;
	private byte[] digitalizacion;
	private DocumentoPorTipoTO documentoPorTipo;
	private EstadoAdministracionEnum estadoAdministracionAnteriorDocto;
	private EstadoAdministracionEnum estadoAdministracioDocto;
	private Date fechaExpedicion;
	private Integer documentoProbatorio;
	private PersonaTO persona;
	/**
	 * @return the cifrado
	 */
	public String getCifrado() {
		return cifrado;
	}
	/**
	 * @param cifrado the cifrado to set
	 */
	public void setCifrado(String cifrado) {
		this.cifrado = cifrado;
	}
	/**
	 * @return the digitalizacion
	 */
	public byte[] getDigitalizacion() {
		return digitalizacion;
	}
	/**
	 * @param digitalizacion the digitalizacion to set
	 */
	public void setDigitalizacion(byte[] digitalizacion) {
		this.digitalizacion = digitalizacion;
	}
	/**
	 * @return the documentoPorTipo
	 */
	public DocumentoPorTipoTO getDocumentoPorTipo() {
		return documentoPorTipo;
	}
	/**
	 * @param documentoPorTipo the documentoPorTipo to set
	 */
	public void setDocumentoPorTipo(DocumentoPorTipoTO documentoPorTipo) {
		this.documentoPorTipo = documentoPorTipo;
	}
	/**
	 * @return the estadoAdministracionAnteriorDocto
	 */
	public EstadoAdministracionEnum getEstadoAdministracionAnteriorDocto() {
		return estadoAdministracionAnteriorDocto;
	}
	/**
	 * @param estadoAdministracionAnteriorDocto the estadoAdministracionAnteriorDocto to set
	 */
	public void setEstadoAdministracionAnteriorDocto(EstadoAdministracionEnum estadoAdministracionAnteriorDocto) {
		this.estadoAdministracionAnteriorDocto = estadoAdministracionAnteriorDocto;
	}
	/**
	 * @return the estadoAdministracioDocto
	 */
	public EstadoAdministracionEnum getEstadoAdministracioDocto() {
		return estadoAdministracioDocto;
	}
	/**
	 * @param estadoAdministracioDocto the estadoAdministracioDocto to set
	 */
	public void setEstadoAdministracioDocto(EstadoAdministracionEnum estadoAdministracioDocto) {
		this.estadoAdministracioDocto = estadoAdministracioDocto;
	}
	/**
	 * @return the fechaExpedicion
	 */
	public Date getFechaExpedicion() {
		return fechaExpedicion;
	}
	/**
	 * @param fechaExpedicion the fechaExpedicion to set
	 */
	public void setFechaExpedicion(Date fechaExpedicion) {
		this.fechaExpedicion = fechaExpedicion;
	}
	/**
	 * @return the documentoProbatorio
	 */
	public Integer getDocumentoProbatorio() {
		return documentoProbatorio;
	}
	/**
	 * @param documentoProbatorio the documentoProbatorio to set
	 */
	public void setDocumentoProbatorio(Integer documentoProbatorio) {
		this.documentoProbatorio = documentoProbatorio;
	}
	/**
	 * @return the persona
	 */
	public PersonaTO getPersona() {
		return persona;
	}
	/**
	 * @param persona the persona to set
	 */
	public void setPersona(PersonaTO persona) {
		this.persona = persona;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cifrado == null) ? 0 : cifrado.hashCode());
		result = prime * result + Arrays.hashCode(digitalizacion);
		result = prime * result + ((documentoPorTipo == null) ? 0 : documentoPorTipo.hashCode());
		result = prime * result + ((documentoProbatorio == null) ? 0 : documentoProbatorio.hashCode());
		result = prime * result + ((estadoAdministracioDocto == null) ? 0 : estadoAdministracioDocto.hashCode());
		result = prime * result
				+ ((estadoAdministracionAnteriorDocto == null) ? 0 : estadoAdministracionAnteriorDocto.hashCode());
		result = prime * result + ((fechaExpedicion == null) ? 0 : fechaExpedicion.hashCode());
		result = prime * result + ((persona == null) ? 0 : persona.hashCode());
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
		DocumentoProbatorioTO other = (DocumentoProbatorioTO) obj;
		if (cifrado == null) {
			if (other.cifrado != null)
				return false;
		} else if (!cifrado.equals(other.cifrado))
			return false;
		if (!Arrays.equals(digitalizacion, other.digitalizacion))
			return false;
		if (documentoPorTipo == null) {
			if (other.documentoPorTipo != null)
				return false;
		} else if (!documentoPorTipo.equals(other.documentoPorTipo))
			return false;
		if (documentoProbatorio == null) {
			if (other.documentoProbatorio != null)
				return false;
		} else if (!documentoProbatorio.equals(other.documentoProbatorio))
			return false;
		if (estadoAdministracioDocto != other.estadoAdministracioDocto)
			return false;
		if (estadoAdministracionAnteriorDocto != other.estadoAdministracionAnteriorDocto)
			return false;
		if (fechaExpedicion == null) {
			if (other.fechaExpedicion != null)
				return false;
		} else if (!fechaExpedicion.equals(other.fechaExpedicion))
			return false;
		if (persona == null) {
			if (other.persona != null)
				return false;
		} else if (!persona.equals(other.persona))
			return false;
		return true;
	}
	
	
}
