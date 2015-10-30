package mx.gob.imss.cit.dictamen.contador.web.util;

import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerFactory;

/**
 * Handler factory from custom exception handling
 * 
 * @author ajfuentes
 * @since 0.0.1
 */
public class CustomExceptionHandlerFactory extends ExceptionHandlerFactory {

    private ExceptionHandlerFactory parent;

    /**
     * Constructor by {@link javax.faces.context.ExceptionHandlerFactory}
     * 
     * @param parent
     */
    public CustomExceptionHandlerFactory(ExceptionHandlerFactory parent) {
        this.parent = parent;
    }

    @Override
    public ExceptionHandler getExceptionHandler() {
return null;
}
}