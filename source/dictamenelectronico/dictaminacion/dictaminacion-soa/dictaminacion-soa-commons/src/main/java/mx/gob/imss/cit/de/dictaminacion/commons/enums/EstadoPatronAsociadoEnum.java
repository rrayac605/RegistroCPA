/**
 * 
 */
package mx.gob.imss.cit.de.dictaminacion.commons.enums;

/**
 * @author ajfuentes
 * 
 */
public enum EstadoPatronAsociadoEnum {

	CORRECTO(1L,"Correcto"),
	INCORRECTO(2L,"Incorrecto"),

	
	
	;

	/**
	 * Constructor interno
	 * 
	 * @param id
	 */
	private EstadoPatronAsociadoEnum(Long id,String desc) {
		this.descripcion=desc;
		this.id = id;
	}

	private Long id;
	private String descripcion;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	public String getDescripcion() {
		return descripcion;
	}

}
