package mx.gob.imss.distss.dictamen.service.business;

import java.util.ResourceBundle;

public class DictamenProperties {
	/**
	 * Método que nos ayuda a la lectura de archivos .properties con clave/valor.
	 * 
	 * @param nomArchivo Nombre del archivo del que se leerán las propiedades.
	 * @param key Clave de la propiedad que se obtendra el valor.
	 * @return Valor de la propiedad leída del archivo properties.
	 */
	public static String getStringFromProperties(String nomArchivo, String key) {
		ResourceBundle bundle = ResourceBundle.getBundle(nomArchivo);
		return bundle.getString(key);
	}
}