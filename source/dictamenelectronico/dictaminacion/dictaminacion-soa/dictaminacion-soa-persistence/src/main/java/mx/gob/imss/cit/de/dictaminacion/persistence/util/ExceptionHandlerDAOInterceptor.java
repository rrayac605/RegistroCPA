package mx.gob.imss.cit.de.dictaminacion.persistence.util;


import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

import mx.gob.imss.cit.de.dictaminacion.commons.enums.DictamenExceptionCodeEnum;
import mx.gob.imss.cit.de.dictaminacion.commons.exception.DictamenException;

import org.apache.log4j.Logger;

/**
 * This method intercepts all calls from DAO classes, if exception occurs while processing the method converts it to a
 * system exception of type {@link mx.com.cinepolis.digital.booking.model.exception.DigitalBookingException}
 * 
 * @author ajfuentes
 */
public class ExceptionHandlerDAOInterceptor
{
  private static final Logger LOG = Logger.getLogger( ExceptionHandlerDAOInterceptor.class );

  /**
   * Intercepts the exceptions
   * 
   * @param invocationContext
   * @return
   * @throws Exception
   */
  @AroundInvoke
  public Object handleExceptions( final InvocationContext invocationContext ) throws Exception {

    Object result = null;

    try {
    	
      result = invocationContext.proceed();
      
    }catch( DictamenException e ){
      LOG.debug( "throwing SolicitudPensionServiciosNegocioException, code:" + e.getCode() );
      throw e;
    }catch( Exception e ){
      LOG.error( e.getMessage(), e );
      DictamenException dc= new DictamenException("Error en la capa de persistencia",e);
      dc.setCode(DictamenExceptionCodeEnum.ERROR_PERSISTENCIA.getId());
      throw dc;
    }
    
    return result;
  }
  
}
