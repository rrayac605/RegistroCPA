package mx.gob.imss.cit.dictamen.web.util;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.component.UIViewRoot;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import mx.gob.imss.cit.dictamen.web.constants.DictamenWebConstants;

import org.primefaces.context.RequestContext;



/**
 * The Class FacesUtils.
 */
public final class FacesUtils {
	
	/**
	 * Instantiates a new faces utils.
	 */
	private FacesUtils(){
	}
		
	
	/**
	 * Regresa la Instancia de la actual Aplicacion JSF.
	 *
	 * @return La objeto <code>Application</code>
	 */
	public static Application getApplication() {
		return getFacesContext().getApplication();
	}

	/**
	 * Regresa un Map de los atributos de la aplicacion para esta aplicacion
	 * web.
	 * 
	 * @return El objeto <code>Map</code> con los atributos de la
	 *         aplicaci&oacute;n.
	 */
	public static Map<?, ?> getApplicationMap() {
		return getExternalContext().getApplicationMap();
	}

	/**
	 * Regresa la instancia del <code>ExternalContext</code> para esta peticion.
	 * 
	 * @return El objecto <code>ExternalContext</code>
	 */
	public static ExternalContext getExternalContext() {
		return getFacesContext().getExternalContext();
	}
	
	/**
	 * Gets the request context path.
	 *
	 * @return the request context path
	 */
	public static String getRequestContextPath() {
		return getExternalContext().getRequestContextPath();
	}

	/**
	 * Regresa la Instancia <code>FacesContext</code> de la actual peticion.
	 *
	 * @return el objeto <code>FacesContext</code>
	 */
	public static FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	
	/**
	 * Regresa la Instancia <code>RequestContext</code> de la actual peticion.
	 * 
	 * @returnel objeto <code>RequestContext</code>
	 */
	public static RequestContext getRequestContext() {
	    return RequestContext.getCurrentInstance();
	}
	
	/**
	 * Gets the view root.
	 *
	 * @return the view root
	 */
	public static UIViewRoot getViewRoot() {
		return FacesContext.getCurrentInstance().getViewRoot();
	}

	/**
	 * Regresa un Map de los atributos de la petici&oacute;n actual.
	 * 
	 * @return El objeto <code>Map</code> con los atributos de la
	 *         petici&oacute;n.
	 */
	public static Map<?, ?> getRequestMap() {
		return getExternalContext().getRequestMap();
	}

	/**
	 * Regresa un Map de los parametros de la petici&oacute;n actual.
	 * 
	 * @return El objeto <code>Map</code> con los parametros de la
	 *         petici&oacute;n.
	 */
	public static Map<?, ?> getParameterMap() {
		return getExternalContext().getRequestParameterMap();
	}

	/**
	 * Regresa un Map de los atributos de la session del usuario.
	 * 
	 * @return El objeto <code>Map</code> con los atributos de la session.
	 */
	public static Map<?, ?> getSessionMap() {
		return getExternalContext().getSessionMap();
	}

	/**
	 * Agrega un mensaje a un componente especifico en la vista a mostrar.
	 * 
	 * @param componentID
	 *            El ID del componente.
	 * @param messageID
	 *            El ID del mensaje que se va a mostrar, debe de encontrarse en
	 *            el archivo ResourceBundle configurado en face-config.xml
	 * @param severity
	 *            Tipo de mensaje
	 */
	public static void messageByIDComponent(String componentID,
			String messageID, Severity severity) {

		FacesMessage facesMessage = getMessage(messageID, null);
		facesMessage.setSeverity(severity);

		getFacesContext().addMessage(DictamenWebConstants.FORM_NAME + componentID,
				facesMessage);

	}

	/**
	 * Message global.
	 *
	 * @param messageID the message id
	 * @param severity the severity
	 */
	public static void messageGlobal(String messageID, Severity severity) {

		FacesMessage facesMessage = getMessage(messageID, null);
		facesMessage.setSeverity(severity);

		getFacesContext().addMessage(null, facesMessage);

	}
	
	/**
	 * Gets the message.
	 *
	 * @param messageID the message id
	 * @return the message
	 */
	public static String getMessage(String messageID) {

		FacesMessage facesMessage = getMessage(messageID, null);
	

		return facesMessage.getSummary();

	}


	/**
	 * Agrega un mensaje a un componente especifico en la vista a mostrar.
	 * 
	 * @param componentID
	 *            El ID del componente.
	 * @param severity
	 *            Tipo de mensaje
	 * @param summary
	 *            El texto que va a ser mostrado en pantalla
	 */
	public static void messageByIDComponent(String componentID,
			Severity severity, String summary) {

		getFacesContext().addMessage(DictamenWebConstants.FORM_NAME + componentID,
				new FacesMessage(severity, summary, null));

	}

	/**
	 * Message global.
	 *
	 * @param severity the severity
	 * @param summary the summary
	 */
	public static void messageGlobal(String ambito,Severity severity, String summary,String prefijo) {

		getFacesContext().addMessage(null,
				new FacesMessage(severity, summary, null));

	}
	
	
	
	public static void messageError(Integer msgCode,Object...params) {

        getFacesContext().addMessage(DictamenWebConstants.MESSAGE_GENERAL,
                new FacesMessage(FacesMessage.SEVERITY_ERROR, ResourceBundleUtils.getMessageNotificacionBundle(msgCode,params), DictamenWebConstants.MESSAGE_EMPTY));
        getRequestContext().execute("showMessagesTop();");
    }
	
	
	public static void messageSuccess(Integer msgCode,Object...params) {

        getFacesContext().addMessage(DictamenWebConstants.MESSAGE_GENERAL,
                new FacesMessage(FacesMessage.SEVERITY_INFO, ResourceBundleUtils.getMessageNotificacionBundle(msgCode,params), DictamenWebConstants.MESSAGE_EMPTY));
        getRequestContext().execute("showMessagesTop();");
    }
	
	
	

	/**
	 * Agrega un mensaje a un componente especifico en la vista a mostrar.
	 * 
	 * @param componentID
	 *            El ID del componente.
	 * @param messageID
	 *            El ID del mensaje que se va a mostrar.
	 * @param params
	 *            Parametros para construir el mensaje.
	 * @param severity
	 *            Tipo de mensaje
	 */
	public static void messageByIDComponent(String componentID,
			String messageID, Object[] params, Severity severity) {

		FacesMessage facesMessage = getMessage(messageID, params);
		facesMessage.setSeverity(severity);

		getFacesContext().addMessage(DictamenWebConstants.FORM_NAME + componentID,
				facesMessage);

	}

	/**
	 * Message global.
	 *
	 * @param messageID the message id
	 * @param params the params
	 * @param severity the severity
	 */
	public static void messageGlobal(String messageID, Object[] params,
			Severity severity) {

		FacesMessage facesMessage = getMessage(messageID, params);
		facesMessage.setSeverity(severity);

		getFacesContext().addMessage(null, facesMessage);

	}
	
	/**
	 * Gets the message.
	 *
	 * @param resourceId the resource id
	 * @param params the params
	 * @return the message
	 */
	private static FacesMessage getMessage(String resourceId, Object[] params) {
		FacesContext context = FacesContext.getCurrentInstance();
		Application app = context.getApplication();
		String appBundle = app.getMessageBundle();
		Locale locale = getLocale(context);
		ClassLoader loader = getClassLoader();
		String summary = getString(appBundle, null, resourceId, locale, loader, params);
		if (summary == null){
			summary = "???" + resourceId + "???";
		}
		String detail = getString(appBundle, null, resourceId + "_detail", locale, loader, params);
		return new FacesMessage(summary, detail);
	}

	/**
	 * Gets the string.
	 *
	 * @param bundle1 the bundle1
	 * @param bundle2 the bundle2
	 * @param resourceId the resource id
	 * @param locale the locale
	 * @param loader the loader
	 * @param params the params
	 * @return the string
	 */
	private static String getString(String bundle1, String bundle2, String resourceId, Locale locale,
			ClassLoader loader, Object[] params) {
		String resource = null;
		ResourceBundle bundle;

		if (bundle1 != null) {
			bundle = ResourceBundle.getBundle(bundle1, locale, loader);
			if (bundle != null){
				try {
					resource = bundle.getString(resourceId);
				} catch (MissingResourceException ex) {
					resource=null;
				}
			}
		}

		if (resource == null){
			return null; // no match
		}
		if (params == null){
			return resource;
		}

		MessageFormat formatter = new MessageFormat(resource, locale);
		return formatter.format(params);
	}

	/**
	 * Gets the locale.
	 *
	 * @param context the context
	 * @return the locale
	 */
	private static Locale getLocale(FacesContext context) {
		Locale locale = null;
		UIViewRoot viewRoot = context.getViewRoot();
		if (viewRoot != null){
			locale = viewRoot.getLocale();
		}
		if (locale == null){
			locale = Locale.getDefault();
		}
		return locale;
	}

	/**
	 * Gets the class loader.
	 *
	 * @return the class loader
	 */
	private static ClassLoader getClassLoader() {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		if (loader == null){
			loader = ClassLoader.getSystemClassLoader();
		}
		return loader;
	}
	
	
}
