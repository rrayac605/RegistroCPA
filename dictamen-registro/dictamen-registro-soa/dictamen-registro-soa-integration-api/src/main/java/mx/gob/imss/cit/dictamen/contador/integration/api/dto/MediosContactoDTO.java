package mx.gob.imss.cit.dictamen.contador.integration.api.dto;

import java.io.Serializable;
import java.util.Date;

public class MediosContactoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5319551344619546592L;
	
	private Long idPersonaFContacto;
	private String descripcion;
	private Date fechaAlta;
	private Long medioContacto;
	
	/**
	 * @return the idPersonaFContacto
	 */
	public Long getIdPersonaFContacto() {
		return idPersonaFContacto;
	}
	/**
	 * @param idPersonaFContacto the idPersonaFContacto to set
	 */
	public void setIdPersonaFContacto(Long idPersonaFContacto) {
		this.idPersonaFContacto = idPersonaFContacto;
	}
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
	 * @return the fechaAlta
	 */
	public Date getFechaAlta() {
		return fechaAlta;
	}
	/**
	 * @param fechaAlta the fechaAlta to set
	 */
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	/**
	 * @return the medioContacto
	 */
	public Long getMedioContacto() {
		return medioContacto;
	}
	/**
	 * @param medioContacto the medioContacto to set
	 */
	public void setMedioContacto(Long medioContacto) {
		this.medioContacto = medioContacto;
	}

}
