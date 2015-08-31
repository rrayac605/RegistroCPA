package mx.gob.imss.cit.dictamen.web.util;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import mx.gob.imss.cit.dictamen.web.constants.WebConstants;

import org.apache.log4j.Logger;

/**
 * Utileria para obtener los mensajes definidos en el bundle.
 */
public final class ResourceBundleUtils {
	
	/**
	 * 
	 */
	private ResourceBundleUtils() {
		super();
	}


	/** The Constant logger. */
	private static final Logger LOGGER = Logger.getLogger(ResourceBundleUtils.class);
	

	/**
	 * Obtiene el mensaje a partir de su definicion en el bundle.
	 *
	 * @param message the message
	 * @return the message form bundle
	 */
	public static String getMessageFormBundle(String message) {
		
		ResourceBundle msg = getResourceBundle(WebConstants.MESSAGE_BUNDLE);
		String description = msg.getString(message);
		LOGGER.info( "Message  : " + description);
		return description;
	}
	
	
	/**
	 * Gets the message error.
	 *
	 * @param idError the id error
	 * @return the message error
	 */
	public static String getMessageError(Integer idError){
		
		ResourceBundle rb = getResourceBundle(WebConstants.MESSAGE_NOTIFICACION_BUNDLE);
		String message = rb.getString(WebConstants.MESSAGE_ERROR_SERVICE_PREFIX + idError);
		
		LOGGER.info("Message error : " + message);
		return message;
		
	}
	
	/**
     * Gets the service error message.
     *
     * @param idMsg the id success
     * @return the success message
     */
    public static String getMessageServiceError(Integer idMessage){
        
        ResourceBundle rb = getResourceBundle(WebConstants.MESSAGE_NOTIFICACION_BUNDLE);
        String message = rb.getString(WebConstants.MESSAGE_ERROR_SERVICE_PREFIX + idMessage);
        
        LOGGER.info("Message success : " + message);
        return message;
        
    }
	
    
    
    
    
    /**
     * Gets the validation error message.
     *
     * @param idMsg the id success
     * @return the success message
     */
    public static String getMessageValidationError(Integer idMessage){
        
        ResourceBundle rb = getResourceBundle(WebConstants.MESSAGE_NOTIFICACION_BUNDLE);
        String message = rb.getString(WebConstants.MESSAGE_ERROR_VALIDATION_PREFIX + idMessage);
        
        LOGGER.info("Message success : " + message);
        return message;
        
    }

    
    
    
	/**
     * Gets the success message.
     *
     * @param idMsg the id success
     * @return the success message
     */
    public static String getMessageSuccess(Integer idMessage){
        
        ResourceBundle rb = getResourceBundle(WebConstants.MESSAGE_NOTIFICACION_BUNDLE);
        String message = rb.getString(WebConstants.MESSAGE_SUCCESS_PREFIX + idMessage);
        
        LOGGER.info("Message success : " + message);
        return message;
        
    }
	

   public static String getMessageValidationErrorParam(Integer idMessage,Object... params){
        
        ResourceBundle rb = getResourceBundle(WebConstants.MESSAGE_NOTIFICACION_BUNDLE);
        String message = rb.getString(WebConstants.MESSAGE_ERROR_VALIDATION_PREFIX + idMessage);
        
        message=getString(message,params);
		LOGGER.info("Message error : " + message);
		return message;
        
    }

    
	public static String getMessageServiceErrorParam(Integer idError,Object... params){
		
		ResourceBundle rb = getResourceBundle(WebConstants.MESSAGE_NOTIFICACION_BUNDLE);
		String message = rb.getString(WebConstants.MESSAGE_ERROR_SERVICE_PREFIX + idError);
		
		message=getString(message,params);
		LOGGER.info("Message error : " + message);
		return message;
		
	}
	
	  public static String getMessageSuccessParam(Integer idMessage,Object... params){
	        
	        ResourceBundle rb = getResourceBundle(WebConstants.MESSAGE_NOTIFICACION_BUNDLE);
	        String message = rb.getString(WebConstants.MESSAGE_SUCCESS_PREFIX + idMessage);
	        
	    	message=getString(message,params);
			LOGGER.info("Message error : " + message);
			return message;
	        
	    }
		
	  
	/**
	 * Gets the message error.
	 *
	 * @param idError the id error
	 * @return the message error
	 */
	public static String getMessageError(Integer idError, String prefix){
		
		ResourceBundle rb = getResourceBundle(WebConstants.MESSAGE_NOTIFICACION_BUNDLE);
		String message = rb.getString(prefix + idError);		
		LOGGER.info("Message error : " + message);
		return message;
		
	}
	
	
	/**
	 * Gets the resource bundle.
	 *
	 * @param messageType the message type
	 * @return the resource bundle
	 */
	private static ResourceBundle getResourceBundle(String messageType) {
		
		StringBuilder bundle = new StringBuilder();
		bundle
			.append(messageType)
			.append(FacesUtils.getViewRoot().getLocale().toString());
		
		LOGGER.info(" messageBundle: " +bundle);		
		return ResourceBundle.getBundle(bundle.toString());
	}
	
	
	private static String getString(String msg, Object... params  ) {
		String mensaje=null;
        try {
        	mensaje= MessageFormat.format(msg, params);
        	LOGGER.info(" mensaje excepcion " +mensaje);		
        } catch (MissingResourceException e) {
        	LOGGER.error(e.getMessage(), e);
        }
        
        return mensaje;
    }

}
