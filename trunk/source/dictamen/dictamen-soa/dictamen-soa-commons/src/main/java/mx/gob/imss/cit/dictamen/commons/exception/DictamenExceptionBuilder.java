/**
 * 
 */
package mx.gob.imss.cit.dictamen.commons.exception;

import java.util.Date;

/**
 * Clase que crea las excepciones de tipo EWalletException
 * 
 * @author gsegura
 */
public final class DictamenExceptionBuilder
{

  private static final int ERROR_DESCONOCIDO = 0;

  /* Se ofusca el constructor */
  private DictamenExceptionBuilder()
  {
  }

  /**
   * Genera una excepciÃ³n SolicitudPensionServiciosNegocioException con el cÃ³digo de error indicado
   * 
   * @param bookingExceptionCode CÃ³digo de Error
   * @return ExcepciÃ³n SolicitudPensionServiciosNegocioException
   */
  public static DictamenException build( DictamenExceptionCode code )
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
  public static DictamenException build( DictamenExceptionCode code, Object[] args )
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
  public static DictamenException build( DictamenExceptionCode code, Throwable cause )
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
  public static DictamenException build( DictamenExceptionCode code, Throwable cause, Object[] args )
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
    DictamenException SolicitudPensionServiciosNegocioException = null;
    if( cause != null )
    {
      SolicitudPensionServiciosNegocioException = new DictamenException( cause.getMessage(), cause );
    }
    else
    {
      SolicitudPensionServiciosNegocioException = new DictamenException();
    }

    SolicitudPensionServiciosNegocioException.setCode( code );
    SolicitudPensionServiciosNegocioException.setArgs( args );
    SolicitudPensionServiciosNegocioException.setDate( date );
    SolicitudPensionServiciosNegocioException.setId( date.getTime() );

    return SolicitudPensionServiciosNegocioException;
  }

  /**
   * Genera una excepciÃ³n SolicitudPensionServiciosNegocioException con un cÃ³digo de error 0 (desconocido)
   * 
   * @return ExcepciÃ³n SolicitudPensionServiciosNegocioException
   */
  public static DictamenException build()
  {
    return build( ERROR_DESCONOCIDO );
  }

  /**
   * Genera una excepciÃ³n EWalletException con un cÃ³digo de error 0 (desconocido) y agrega la causa de error
   * 
   * @param cause Causa de error
   * @return ExcepciÃ³n SolicitudPensionServiciosNegocioException
   */
  public static DictamenException build( Throwable cause )
  {
    return build( ERROR_DESCONOCIDO, cause );
  }

}
