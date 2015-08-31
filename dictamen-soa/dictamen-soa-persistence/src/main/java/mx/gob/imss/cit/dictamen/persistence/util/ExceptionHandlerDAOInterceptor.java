package mx.gob.imss.cit.dictamen.persistence.util;


import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;
import javax.persistence.PersistenceException;

import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.exception.DictamenExceptionBuilder;
import mx.gob.imss.cit.dictamen.commons.exception.DictamenExceptionCode;

import org.apache.log4j.Logger;
import org.eclipse.persistence.exceptions.DatabaseException;

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
  public Object handleExceptions( final InvocationContext invocationContext ) throws Exception
  {

    Object result = null;

    try
    {
      result = invocationContext.proceed();
    }
    catch( DictamenException e )
    {
      LOG.debug( "throwing SolicitudPensionServiciosNegocioException, code:" + e.getCode() );
      throw e;
    }
    catch( IllegalStateException e )
    {
      LOG.error( e.getMessage(), e );
      throw DictamenExceptionBuilder.build(
    		  DictamenExceptionCode.PERSISTENCE_ERROR_NEW_OBJECT_FOUND_DURING_COMMIT, e );
    }
    catch( PersistenceException e )
    {
      LOG.error( e.getMessage(), e );
      throw DictamenExceptionBuilder.build( DictamenExceptionCode.PERSISTENCE_ERROR_GENERIC, e );
    }
    catch( DatabaseException e )
    {
      LOG.error( e.getMessage(), e );
      throw DictamenExceptionBuilder.build(
    		  DictamenExceptionCode.PERSISTENCE_ERROR_NEW_OBJECT_FOUND_DURING_COMMIT, e );
    }
    catch( Throwable t )
    {
      LOG.error( t.getMessage(), t );
      throw DictamenExceptionBuilder.build( DictamenExceptionCode.GENERIC_UNKNOWN_ERROR, t );
    }
    return result;

  }
}
