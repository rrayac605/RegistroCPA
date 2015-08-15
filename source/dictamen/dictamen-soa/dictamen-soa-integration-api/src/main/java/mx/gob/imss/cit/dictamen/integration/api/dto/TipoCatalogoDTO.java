package mx.gob.imss.cit.dictamen.integration.api.dto;



/**
 * Clase padre de TO que implementa serializable.
 * 
 * @author ajfuentes
 */
public class TipoCatalogoDTO extends BaseDTO {

    /** Serial Version. */
	private static final long serialVersionUID = 1L;

	Long id;
	
	String clave;
	
	String descripcion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
