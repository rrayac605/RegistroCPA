package mx.gob.imss.cit.dictamen.commons.enums;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public enum EstadoCargaDocumentoEnum {
	ESTATUS_VALIDADO(1),
	ESTATUS_CARGADO(2),
	;
	
	private EstadoCargaDocumentoEnum( int id )
	  {
	    this.id = id;
	  }

	  private int id;

	  public int getId()
	  {
	    return id;
	  }
}

