package mx.gob.imss.cit.dictamen.contador.web.util;

import java.util.Locale;
import java.util.Map;

import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIViewRoot;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;



import mx.gob.imss.cit.dictamen.contador.web.constants.RegistroWebConstants;

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

	
	public static void messageError(Integer msgCode,Object...params) {

        getFacesContext().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_ERROR, ResourceBundleUtils.getMessageNotificacionBundle(msgCode,params), RegistroWebConstants.MESSAGE_EMPTY));
    }
	
	
	public static void messageSuccess(Integer msgCode,Object...params) {

        getFacesContext().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, ResourceBundleUtils.getMessageNotificacionBundle(msgCode,params), RegistroWebConstants.MESSAGE_EMPTY));
    }
	
	

	/**
	 * Gets the locale.
	 *
	 * @param context the context
	 * @return the locale
	 */
	public static Locale getLocale(FacesContext context) {
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
	public static ClassLoader getClassLoader() {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		if (loader == null){
			loader = ClassLoader.getSystemClassLoader();
		}
		return loader;
	}
	
	
}
