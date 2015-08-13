package mx.gob.imss.cit.dictamen.web.util;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

/**
 * The Class Messages.
 */
public final class Messages {
	
	/**
	 * Instantiates a new messages.
	 */
	private Messages(){
		
	}
	
	/**
	 * Gets the message.
	 *
	 * @param resourceId the resource id
	 * @param params the params
	 * @return the message
	 */
	public static FacesMessage getMessage(String resourceId, Object[] params) {
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
	 * @param resourceId the resource id
	 * @param params the params
	 * @return the string
	 */
	public static String getString(String resourceId, Object[] params) {
		FacesContext context = FacesContext.getCurrentInstance();
		Application app = context.getApplication();
		String appBundle = app.getMessageBundle();
		Locale locale = getLocale(context);
		ClassLoader loader = getClassLoader();
		return getString(appBundle, null, resourceId, locale, loader, params);
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
	public static String getString(String bundle1, String bundle2, String resourceId, Locale locale,
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
