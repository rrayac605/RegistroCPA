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
		String msg="";
		
		if(params==null){
			msg=resourceBundleConfig.getString(key);
		}else{
			msg= getString(resourceBundleConfig.getString(key),params);
		}
		return msg;
	}
	
	
	public static String getPropertyException(String key, Object... params  ){
		String msg="";
		
		if(params==null){
			msg=resourceBundleException.getString(key);
		}else{
			msg= getString(resourceBundleException.getString(key),params);
		}
		return msg;
	}
	
	
	
	private static String getString(String msg, Object... params  ) {
		String mensaje=null;
        try {
        	mensaje= MessageFormat.format(msg, params);	
        } catch (MissingResourceException e) {
        	mensaje="";
        }
        
        return mensaje;
    }

	
	
	
}
