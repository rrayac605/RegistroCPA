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
  ERROR_SERVICIO_CUESTIONARIO_OBTENER(5),
  ERROR_SERVICIO_AWS_OBTENER_POLITICA(6),
  ERROR_SERVICIO_FIRMA_ELECTRONICA(7),
  ERROR_SERVICIO_CONSULTA_SAT_RFC(8),
  ERROR_SERVICIO_DATOS_PATRONALES_PARAM_NULL(9),
  ERROR_SERVICIO_DATOS_PATRONALES_GUARDAR(10),
  ERROR_KEY_GENERATOR_GET_KEY(11)

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

