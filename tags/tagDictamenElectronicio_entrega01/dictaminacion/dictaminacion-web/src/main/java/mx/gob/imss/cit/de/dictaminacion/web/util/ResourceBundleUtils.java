package mx.gob.imss.cit.de.dictaminacion.web.util;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.de.dictaminacion.web.constants.DictamenWebConstants;

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
	public static String getMessageBundle(String message) {
		
		ResourceBundle msg = getResourceBundle(DictamenWebConstants.MESSAGE_BUNDLE);
		String description = msg.getString(message);
		LOGGER.info( "Message  : " + description);
		
		return description;
	}
	

  public static String getMessageNotificacionBundle(Integer idMessage,Object... params){
        
        ResourceBundle rb = getResourceBundle(DictamenWebConstants.MESSAGE_NOTIFICACION_BUNDLE);
        String message = rb.getString(DictamenWebConstants.MESSAGE_NOTIFICACION_PREFIX + idMessage);
        
        if(message.isEmpty()){
        	LOGGER.info("no se encontro el mensaje: " + DictamenWebConstants.MESSAGE_NOTIFICACION_PREFIX + idMessage);
        	message=DictamenWebConstants.MESSAGE_NOTIFICACION_PREFIX + idMessage;
        }else{
        	message=getString(message,params);
        }
        
    
		LOGGER.info("Message : " + message);
		return message;
        
    }

	
	/**
	 * Gets the resource bundle.
	 *
	 * @param messageType the message type
	 * @return the resource bundle
	 */
	private static ResourceBundle getResourceBundle(String messageType) {
		
		LOGGER.info(" messageBundle: " +messageType);		
		return ResourceBundle.getBundle(messageType);
	}
	
	
	
	private static String getString(String msg, Object... params  ) {
		String mensaje=null;
        try {
        	if(params==null|| params.length==0){
        		mensaje=msg;
        	}else{
        		mensaje= MessageFormat.format(msg, params);
        	}
        	        	
        } catch (MissingResourceException e) {
        	LOGGER.error(e.getMessage(), e);
        }
        
        return mensaje;
    }

}
