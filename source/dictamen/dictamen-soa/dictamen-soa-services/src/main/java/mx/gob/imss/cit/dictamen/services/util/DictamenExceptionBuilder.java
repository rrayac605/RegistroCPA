/**
 * 
 */
package mx.gob.imss.cit.dictamen.services.util;

import java.util.Date;

import mx.gob.imss.cit.dictamen.commons.enums.DictamenExceptionCodeEnum;
import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;

/**
 * Clase que crea las excepciones de tipo DictamenException
 * 
 * @author ajfuentes
 */
public final class DictamenExceptionBuilder
{

  
  private static final String PREFIJO_MENSAJE_EXCEPCION = "message.";

  private DictamenExceptionBuilder(){
  }

  /**
   * Genera una excepciÃ³n SolicitudPensionServiciosNegocioException con el cÃ³digo de error indicado
   * 
   * @param bookingExceptionCode CÃ³digo de Error
   * @return ExcepciÃ³n SolicitudPensionServiciosNegocioException
   */
  public static DictamenException build( DictamenExceptionCodeEnum code )
  {
    return build( code.getId(), null, null );
  }

  /**
   * Genera una excepciÃ³n SolicitudPensionServiciosNegocioException con el cÃ³digo de error indicado
   * 
   * @param code CÃ³digo de Error
   * @return ExcepciÃ³n SolicitudPensionServiciosNegocioException
   */
  public static DictamenException build( int code )
  {
    return build( code, null, null );
  }

  /**
   * Genera una excepciÃ³n SolicitudPensionServiciosNegocioException con el cÃ³digo de error indicado, anexa los parÃ¡metros
   * 
   * @param code CÃ³digo de Error
   * @param args ParÃ¡metros
   * @return ExcepciÃ³n SolicitudPensionServiciosNegocioException
   */
  public static DictamenException build( int code, Object[] args )
  {
    return build( code, null, args );
  }

  /**
   * Genera una excepciÃ³n SolicitudPensionServiciosNegocioException con el cÃ³digo de error indicado, anexa los parÃ¡metros
   * 
   * @param code CÃ³digo de Error
   * @param args ParÃ¡metros
   * @return ExcepciÃ³n SolicitudPensionServiciosNegocioException
   */
  public static DictamenException build( DictamenExceptionCodeEnum code, Object[] args )
  {
    return build( code.getId(), null, args );
  }

  /**
   * Genera una excepciÃ³n SolicitudPensionServiciosNegocioException con el cÃ³digo de error indicado, agrega la causa de error
   * 
   * @param code CÃ³digo de Error
   * @param cause Causa de error
   * @return ExcepciÃ³n SolicitudPensionServiciosNegocioException
   */
  public static DictamenException build( int code, Throwable cause )
  {
    return build( code, cause, null );
  }

  /**
   * Genera una excepciÃ³n SolicitudPensionServiciosNegocioException con el cÃ³digo de error indicado, agrega la causa de error
   * 
   * @param code CÃ³digo de Error
   * @param cause Causa de error
   * @return ExcepciÃ³n SolicitudPensionServiciosNegocioException
   */
  public static DictamenException build( DictamenExceptionCodeEnum code, Throwable cause )
  {
    return build( code.getId(), cause, null );
  }

  /**
   * Genera una excepciÃ³n SolicitudPensionServiciosNegocioException con el cÃ³digo de error indicado, agrega la causa de error, agrega los
   * parÃ¡metros de
   * 
   * @param code CÃ³digo de Error
   * @param cause Causa de error
   * @param args ParÃ¡metros
   * @return ExcepciÃ³n SolicitudPensionServiciosNegocioException
   */
  public static DictamenException build( DictamenExceptionCodeEnum code, Throwable cause, Object[] args )
  {
    return build( code.getId(), cause, args );
  }

  /**
   * Genera una excepciÃ³n SolicitudPensionServiciosNegocioException con el cÃ³digo de error indicado, agrega la causa de error, agrega los
   * parÃ¡metros de
   * 
   * @param code CÃ³digo de Error
   * @param cause Causa de error
   * @param args ParÃ¡metros
   * @return ExcepciÃ³n SolicitudPensionServiciosNegocioException
   */
  public static DictamenException build( int code, Throwable cause, Object[] args )
  {
    Date date = new Date();
    DictamenException dictamenException = null;
    
    if( cause != null ) {
    	dictamenException = new DictamenException( cause.getMessage(), cause );
    }
    else{
    	String msg=PropertiesConfigUtils.getPropertyException(PREFIJO_MENSAJE_EXCEPCION+code,args);   
    	dictamenException = new DictamenException(msg);
    }

    dictamenException.setCode( code );
    dictamenException.setArgs( args );
    dictamenException.setDate( date );
    dictamenException.setId( date.getTime() );

    return dictamenException;
  }

  /**
   * Genera una excepciÃ³n SolicitudPensionServiciosNegocioException con un cÃ³digo de error 0 (desconocido)
   * 
   * @return ExcepciÃ³n SolicitudPensionServiciosNegocioException
   */
  public static DictamenException build()
  {
    return build( DictamenExceptionCodeEnum.ERROR_DESCONOCIDO );
  }


}
