package mx.gob.imss.cit.dictamen.services.util;

import java.util.ResourceBundle;

import mx.gob.imss.cit.dictamen.services.constants.DictamenServicesConstants;



public class PropertiesConfigUtils {
	
	private static final  ResourceBundle resourceBundle = ResourceBundle.getBundle(DictamenServicesConstants.CONFIG_FILE);
	
	
	private PropertiesConfigUtils(){
		
	}
	
	public static String getProperty(String key){
		return resourceBundle.getString(key);
	}
	
	
	
}
