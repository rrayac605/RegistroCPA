package mx.gob.imss.cit.dictamen.commons.enums;

/**
 * Clase con los códigos de errores para las excepciones
 * @author ajfuentes
 *
 */
public enum DictamenExceptionCodeEnum
{

  ERROR_DESCONOCIDO(0),
  ERROR_PERSISTENCIA(1),  
  ERROR_SERVICIO_BOVEDA_OBTENER_DOCUMENTO(2),
  ERROR_SERVICIO_BOVEDA_ELIMINAR_DOCUMENTO(3),
  ERROR_SERVICIO_BOVEDA_AGREGAR_ACTOR(4),
  ERROR_SERVICIO_BDTU_CUESTIONARIO_OBTENER(4),

   ;
  /**
   * Constructor interno
   * 
   * @param id
   */
  private DictamenExceptionCodeEnum( int id )
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

