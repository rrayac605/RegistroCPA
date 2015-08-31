package mx.gob.imss.cit.dictamen.integration.api.exception;

/**
 * Clase con los códigos de errores para las excepciones
 * @author rgarcia
 *
 */
public enum DictamenNegocioExceptionCode
{

  /** Error desconocido */
  GENERIC_UNKNOWN_ERROR(0),
  /***
   * CATALOG NULO
   */
  CATALOG_ISNULL(1),
  
  /**
   * Paging Request Nulo
   */
  PAGING_REQUEST_ISNULL(2),
  
  /**
   * Errores de persistencia
   */
  PERSISTENCE_ERROR_GENERIC(3),
  PERSISTENCE_ERROR_NEW_OBJECT_FOUND_DURING_COMMIT(4),
  PERSISTENCE_ERROR_CATALOG_ALREADY_REGISTERED(5),
  PERSISTENCE_ERROR_CATALOG_NOT_FOUND(6),
  PERSISTENCE_ERROR_CATALOG_ALREADY_REGISTERED_WITH_ID_VISTA(7),
  PERSISTENCE_ERROR_WEEK_ALREADY_REGISTERED(8),

  /**
   * SynchronizeErrors
   */
  CANNOT_CONNECT_TO_SERVICE(500);
  
   ;
  /**
   * Constructor interno
   * 
   * @param id
   */
  private DictamenNegocioExceptionCode( int id )
  {
    this.id = id;
  }

  private int id;

  /**
   * @return the id
   */
  public int getId()
  {
    return id;
  }
  
}

