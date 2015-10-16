package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;

public class CatalogoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8467651294510346986L;
	
	private String clave;
	
	private String descripcion;
	
	public CatalogoDTO(String clave, String descripcion) {
		super();
		this.clave = clave;
		this.descripcion = descripcion;
	}
	
	public CatalogoDTO() {
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
