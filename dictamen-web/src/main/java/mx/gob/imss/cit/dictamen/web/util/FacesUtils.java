package mx.gob.imss.cit.dictamen.web.util;

import java.util.Map;

import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.component.UIViewRoot;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import mx.gob.imss.cit.dictamen.web.constants.WebConstants;

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
		
//	public static String getUsuarioSessionID() {
//		return ((UsuarioFirmadoTO) getSessionMap().get(
//				WConstants.USUARIO_WEBOBJECT)).getSessionID();
//	}
//
	/**
 * Gets the web user.
 *
 * @return the web user
 */
public static Object getWebUser() {
		return getSessionMap().get(WebConstants.USUARIO_WEBOBJECT);
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

		FacesMessage facesMessage = Messages.getMessage(messageID, null);
		facesMessage.setSeverity(severity);

		getFacesContext().addMessage(WebConstants.FORM_NAME + componentID,
				facesMessage);

	}

	/**
	 * Message global.
	 *
	 * @param messageID the message id
	 * @param severity the severity
	 */
	public static void messageGlobal(String messageID, Severity severity) {

		FacesMessage facesMessage = Messages.getMessage(messageID, null);
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

		FacesMessage facesMessage = Messages.getMessage(messageID, null);
	

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

		getFacesContext().addMessage(WebConstants.FORM_NAME + componentID,
				new FacesMessage(severity, summary, null));

	}

	/**
	 * Message global.
	 *
	 * @param severity the severity
	 * @param summary the summary
	 */
	public static void messageGlobal(Severity severity, String summary) {

		getFacesContext().addMessage(null,
				new FacesMessage(severity, summary, null));

	}
	
	/**
	 * Genera los mensajes de error de servicios por el codigo del mensaje
	 * 
	 * @param msgCode
	 */
	public static void messageServiceError(Integer msgCode) {

        getFacesContext().addMessage(WebConstants.GENERAL,
                new FacesMessage(FacesMessage.SEVERITY_ERROR, ResourceBundleUtils.getMessageServiceError(msgCode), WebConstants.EMPTY));
        getRequestContext().execute("showMessagesTop();");
    }
	
	/**
	 * Genera los mensajes de error de validacion por el codigo del mensaje
	 * 
	 * @param msgCode
	 */
	public static void messageValidationError(Integer msgCode) {

        getFacesContext().addMessage(WebConstants.GENERAL,
                new FacesMessage(FacesMessage.SEVERITY_ERROR, ResourceBundleUtils.getMessageValidationError(msgCode), WebConstants.EMPTY));
        getRequestContext().execute("showMessagesTop();");
    }
	
	/**
     * Genera los mensajes de error de validacion por el codigo del mensaje
     * para las ventanas modales, asignando false a la variable global 
     * @param msgCode
     */
    public static void messageValidationErrorModal(Integer msgCode) {

        getFacesContext().addMessage(WebConstants.MODAL,
                new FacesMessage(FacesMessage.SEVERITY_ERROR, ResourceBundleUtils.getMessageValidationError(msgCode), WebConstants.EMPTY));
        FacesContext.getCurrentInstance().validationFailed();
    }
	
	/**
	 * Genera los mensajes de exito por el codigo del mensaje
	 * 
	 * @param msgCode
	 */
	public static void messageSuccess(Integer msgCode) {

        getFacesContext().addMessage(WebConstants.GENERAL,
                new FacesMessage(FacesMessage.SEVERITY_INFO, ResourceBundleUtils.getMessageSuccess(msgCode), WebConstants.EMPTY));
        getRequestContext().execute("showMessagesTop();");
    }
	
	public static void messageServiceErrorParam(Integer msgCode,Object...params) {

        getFacesContext().addMessage(WebConstants.GENERAL,
                new FacesMessage(FacesMessage.SEVERITY_ERROR, ResourceBundleUtils.getMessageServiceErrorParam(msgCode,params), WebConstants.EMPTY));
        getRequestContext().execute("showMessagesTop();");
    }
	
	public static void messageValidationErrorParam(Integer msgCode,Object...params) {

        getFacesContext().addMessage(WebConstants.GENERAL,
                new FacesMessage(FacesMessage.SEVERITY_ERROR, ResourceBundleUtils.getMessageValidationErrorParam(msgCode,params), WebConstants.EMPTY));
        getRequestContext().execute("showMessagesTop();");
    }
	public static void messageSuccessParam(Integer msgCode,Object...params) {

        getFacesContext().addMessage(WebConstants.GENERAL,
                new FacesMessage(FacesMessage.SEVERITY_INFO, ResourceBundleUtils.getMessageSuccessParam(msgCode,params), WebConstants.EMPTY));
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

		FacesMessage facesMessage = Messages.getMessage(messageID, params);
		facesMessage.setSeverity(severity);

		getFacesContext().addMessage(WebConstants.FORM_NAME + componentID,
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

		FacesMessage facesMessage = Messages.getMessage(messageID, params);
		facesMessage.setSeverity(severity);

		getFacesContext().addMessage(null, facesMessage);

	}

	
}
