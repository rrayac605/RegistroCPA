package mx.gob.imss.cit.dictamen.commons.enums;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public enum EstadoCargaDocumentoEnum {
	ESTATUS_VALIDADO(1L),
	ESTATUS_CARGADO(2L),
	;
	
	private EstadoCargaDocumentoEnum( Long id )
	  {
	    this.id = id;
	  }

	  private Long id;

	  public Long getId()
	  {
	    return id;
	  }
}

