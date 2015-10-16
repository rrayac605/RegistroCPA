/**
 * 
 */
package mx.gob.imss.cit.dictamen.commons.enums;

/**
 * @author ajfuentes
 * 
 */
public enum EstadoDictamenEnum {

	EN_PROCESO(1L),
	FIRMADO(2L),
	NO_PRESENTADO(3L),
	PRESENTADO(4L),
	
	
	;

	/**
	 * Constructor interno
	 * 
	 * @param id
	 */
	private EstadoDictamenEnum(Long id) {
		this.id = id;
	}

	private Long id;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

}
