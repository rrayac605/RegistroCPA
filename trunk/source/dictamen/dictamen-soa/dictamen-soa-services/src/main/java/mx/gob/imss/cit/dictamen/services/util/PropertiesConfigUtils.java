package mx.gob.imss.cit.dictamen.services.util;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import mx.gob.imss.cit.dictamen.services.constants.DictamenServicesConstants;



public class PropertiesConfigUtils {
	
	private static final  ResourceBundle resourceBundleConfig = ResourceBundle.getBundle(DictamenServicesConstants.CONFIG_FILE);
		
	private static final  ResourceBundle resourceBundleException = ResourceBundle.getBundle(DictamenServicesConstants.EXCEPTION_FILE);
	
	
	private PropertiesConfigUtils(){
		
	}
	

	public static String getPropertyConfig(String key, Object... params  ){

		return getString(resourceBundleConfig.getString(key),params);
	}
	
	
	public static String getPropertyException(String key, Object... params  ){

		return getString(resourceBundleException.getString(key),params);
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
        	mensaje="";
        }
        
        return mensaje;
    }

	
	
	
}
