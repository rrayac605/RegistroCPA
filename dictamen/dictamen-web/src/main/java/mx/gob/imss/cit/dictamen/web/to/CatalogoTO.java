package mx.gob.imss.cit.dictamen.web.to;

import java.io.Serializable;

public class CatalogoTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8763079697294819438L;

	
	private Long id;
	
	private String descripcion;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	
	
	public CatalogoTO(Long id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
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
	
	
	
}
