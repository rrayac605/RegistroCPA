package mx.gob.imss.cit.dictamen.web.util;

import java.util.Iterator;

import javax.faces.application.ConfigurableNavigationHandler;
import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerWrapper;
import javax.faces.context.FacesContext;
import javax.faces.event.ExceptionQueuedEvent;
import javax.faces.event.ExceptionQueuedEventContext;

import mx.gob.imss.cit.dictamen.web.constants.NavigationConstants;

import org.apache.log4j.Logger;

/**
 * Handler class for exceptions
 */
public class CustomExceptionHandler extends ExceptionHandlerWrapper{

  private static final Logger LOG = Logger.getLogger( CustomExceptionHandler.class );
  private ExceptionHandler wrapped;

  /**
   * Constructor by {@link javax.faces.context.ExceptionHandler}
   * 
   * @param wrapped
   */
  public CustomExceptionHandler( ExceptionHandler wrapped ){
    this.wrapped = wrapped;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public ExceptionHandler getWrapped(){
    return wrapped;
  }

  /**
   * {@inheritDoc}
   */
  @SuppressWarnings("rawtypes")
  @Override
  public void handle(){
    Iterator iterator = getUnhandledExceptionQueuedEvents().iterator();
    while( iterator.hasNext() ){
      ExceptionQueuedEvent event = (ExceptionQueuedEvent) iterator.next();
      ExceptionQueuedEventContext context = (ExceptionQueuedEventContext) event.getSource();

      Throwable throwable = context.getException();

      try{
     //   RequestContext.getCurrentInstance().addCallbackParam( "notValid", true );

	      LOG.error( throwable.getMessage(), throwable );
	      LOG.info( "CustomExceptionHandler.handle  EXCEPTION NO CONTROLADA!!!!!!" );
	
	      throwable.printStackTrace();
	      FacesContext ctx = FacesContext.getCurrentInstance();
	      ConfigurableNavigationHandler nav = (ConfigurableNavigationHandler) ctx.getApplication().getNavigationHandler();
	      nav.performNavigation(NavigationConstants.PAGE_ERROR );
        

      }finally {
        iterator.remove();
      }
    }
    getWrapped().handle();
  }

}