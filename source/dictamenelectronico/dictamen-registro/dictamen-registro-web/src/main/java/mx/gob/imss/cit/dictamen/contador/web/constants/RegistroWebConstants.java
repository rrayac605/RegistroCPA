package mx.gob.imss.cit.dictamen.contador.web.constants;

public final class RegistroWebConstants {

	/**
	 * Instantiates a new portal constants.
	 */
	private RegistroWebConstants() {
	}
	
	/** The Constant MESSAGE_BUNDLE. */
	public static final String MESSAGE_BUNDLE = "bundles.messages";
	
	/** The Constant MESSAGE_ERROR_BUNDLE. */
	public static final String MESSAGE_NOTIFICACION_BUNDLE= "bundles.messages_notificacion";
	
	/** The Constant MESSAGE_ERROR_VALIDATION_PREFIX. */
	public static final String MESSAGE_NOTIFICACION_PREFIX = "dictamen.notiticacion.code.";
	
	/** The Constant MESSAGE_ERROR_SERVICE_PREFIX. */
    public static final String MESSAGE_EMPTY = "";
    
    public static final String EXPRESION_REGULAR_RFC_MORAL_FISICA="^([A-Z,Ñ,&]{3,4}([0-9]{2})(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])[A-Z|\\d]{3})$";
    
    public static final String EXPRESION_REGULAR_RFC_MORAL="^([A-Z,Ñ,&]{3}([0-9]{2})(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])[A-Z|\\d]{3})$";


}
