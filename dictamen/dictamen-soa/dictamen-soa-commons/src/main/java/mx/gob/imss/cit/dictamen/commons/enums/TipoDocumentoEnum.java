package mx.gob.imss.cit.dictamen.commons.enums;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public enum TipoDocumentoEnum {
	TIPO_DOCUMENTO_ASEVERACIONES(1l),
	TIPO_DOCUMENTO_CEDULAS(2l),
	;
	
	/**
	 * Constructor interno
	 * 
	 * @param id
	 */
	private TipoDocumentoEnum(Long id) {
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

