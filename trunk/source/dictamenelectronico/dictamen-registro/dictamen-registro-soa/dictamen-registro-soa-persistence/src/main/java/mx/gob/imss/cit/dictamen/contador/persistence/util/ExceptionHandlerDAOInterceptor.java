package mx.gob.imss.cit.dictamen.contador.persistence.util;


import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;




import org.apache.log4j.Logger;

import mx.gob.imss.cit.dictamen.contador.commons.enums.ContadorExceptionCodeEnum;
import mx.gob.imss.cit.dictamen.contador.commons.exception.DictamenContadorException;
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
      
    }catch( DictamenContadorException e ){
      LOG.debug( "throwing SolicitudPensionServiciosNegocioException, code:" + e.getCode() );
      throw e;
    }catch( Exception e ){
      LOG.error( e.getMessage(), e );
      DictamenContadorException dc= new DictamenContadorException("Error en la capa de persistencia",e);
      dc.setCode(ContadorExceptionCodeEnum.ERROR_PERSISTENCIA.getId());
      throw dc;
    }
    
    return result;
  }
  
}
