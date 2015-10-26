package mx.gob.imss.cit.de.dictaminacion.commons.enums;

public enum TipoTramiteEnum {
	TRAMITE_DICTAMEN(90l),
	
	;
	
	/**
	 * Constructor interno
	 * 
	 * @param id
	 */
	private TipoTramiteEnum(Long id) {
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
