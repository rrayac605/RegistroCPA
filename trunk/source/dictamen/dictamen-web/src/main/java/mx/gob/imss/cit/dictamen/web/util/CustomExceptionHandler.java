package mx.gob.imss.cit.dictamen.web.util;

import java.util.Iterator;

import javax.faces.application.ConfigurableNavigationHandler;
import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerWrapper;
import javax.faces.context.FacesContext;
import javax.faces.event.ExceptionQueuedEvent;
import javax.faces.event.ExceptionQueuedEventContext;



import mx.gob.imss.cit.dictamen.integration.api.exception.DictamenNegocioException;

import org.primefaces.context.RequestContext;
import org.apache.log4j.Logger;

/**
 * Handler class for exceptions
 */
public class CustomExceptionHandler extends ExceptionHandlerWrapper
{

  private static final int N_10 = 10;
  private static final Logger LOG = Logger.getLogger( CustomExceptionHandler.class );
  private ExceptionHandler wrapped;

  /**
   * Constructor by {@link javax.faces.context.ExceptionHandler}
   * 
   * @param wrapped
   */
  public CustomExceptionHandler( ExceptionHandler wrapped )
  {
    this.wrapped = wrapped;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public ExceptionHandler getWrapped()
  {
    return wrapped;
  }

  /**
   * {@inheritDoc}
   */
  @SuppressWarnings("rawtypes")
  @Override
  public void handle()
  {
    Iterator iterator = getUnhandledExceptionQueuedEvents().iterator();
    // LOG.info("CustomExceptionHandler.handle");
    while( iterator.hasNext() )
    {
      ExceptionQueuedEvent event = (ExceptionQueuedEvent) iterator.next();
      ExceptionQueuedEventContext context = (ExceptionQueuedEventContext) event.getSource();

      Throwable throwable = context.getException();

      try
      {
        RequestContext.getCurrentInstance().addCallbackParam( "notValid", true );

        if( throwable instanceof javax.faces.application.ViewExpiredException )
        {
          FacesContext ctx = FacesContext.getCurrentInstance();
          ConfigurableNavigationHandler nav = (ConfigurableNavigationHandler) ctx.getApplication()
              .getNavigationHandler();
          nav.performNavigation( "/views/home/home.do" );
        }

        DictamenNegocioException se = extractDictamenException( throwable );

        
        if(se!=null){
        	
        	 if(se.getArgs()==null){
           	  FacesUtils.messageServiceError( se.getCode() );
             }else{
           	  FacesUtils.messageServiceErrorParam( se.getCode() ,se.getArgs());
             }

        }
        else
        {
          LOG.error( throwable.getMessage(), throwable );
          LOG.info( "CustomExceptionHandler.handle  EXCEPTION INESPERADA!!!!!!" );

          throwable.printStackTrace();
          FacesContext ctx = FacesContext.getCurrentInstance();
          ConfigurableNavigationHandler nav = (ConfigurableNavigationHandler) ctx.getApplication()
              .getNavigationHandler();
          nav.performNavigation( "error" );

        }

      }
      finally
      {
        iterator.remove();
      }
    }

    // Let the parent handle the rest
    getWrapped().handle();
  }

  private DictamenNegocioException extractDictamenException( Throwable throwable )
  {
	DictamenNegocioException dbe = null;
    Throwable cause = throwable;
    int n = 0;
    while( n < N_10 )
    {
      if( cause == null )
      {
        break;
      }
      if( cause instanceof DictamenNegocioException )
      {
        dbe = (DictamenNegocioException) cause;
        break;
      }
      cause = cause.getCause();
      n++;
    }
    return dbe;
  }

}