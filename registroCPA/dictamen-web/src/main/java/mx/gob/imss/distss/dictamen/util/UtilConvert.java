package mx.gob.imss.distss.dictamen.util;
import org.apache.commons.logging.Log;

import java.io.IOException;
import java.lang.reflect.Field;

import mx.gob.imss.distss.dictamen.web.form.base.FormField;
import mx.gob.imss.distss.dictamen.web.form.base.InputForm;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/** 
 * The Class UtilConvert.
 * 
 * @author Cesar Isaac Sanchez Alavarez
 */
public class UtilConvert {
	
	/**
	 * Covert to java object. 
	 *
	 * @param opcion the opcion
	 * @param json the json
	 * @param log the log
	 * @return the string
	 */
    public String covertToJavaObject(int opcion, String json, Log log) {
    	ObjectMapper mapper = new ObjectMapper();
    	StringBuilder sb  = new  StringBuilder();
    	sb.append("{");
    	try {
    		log.info("Regresa json formado \n" +json);
    		InputForm formBase = mapper.readValue(json, InputForm.class);		
    		@SuppressWarnings("rawtypes")
			Class classForm = formBase.getClass();
    		Field[] fields = classForm.getDeclaredFields();
    		for (Field field : fields) {
    			log.info(" campo form , nombre:" + field.getName());
    			if (field.getName().equals("campos")) {
    				field.setAccessible(true);
    				FormField[] attribs = (FormField[]) field.get(formBase);
    				for( FormField  attrib:attribs) {
    					@SuppressWarnings("rawtypes")
						Class classAttrib = attrib.getClass();
    					Field campo = classAttrib.getDeclaredField("name");
    					Field valor = classAttrib.getDeclaredField("value");
    					campo.setAccessible(true);
    					valor.setAccessible(true);
    					String nombreAttrib = (String) campo.get(attrib);
    					String valorAttrib = (String) valor.get(attrib);				     
    					sb.append("\""+nombreAttrib+"\"" +":" +"\""+valorAttrib+"\",");
    				}
    				sb.delete(sb.length()-1, sb.length()).append("}");
    				log.info(" Valor de sb  :" +sb.toString());
    			}
    		}    	
    		log.info("Json String convert to java object successs");
    	} catch (JsonParseException e) {
    		log.error(" JsonParseException al convert JSON String to Java Object, causa:" + e.getMessage());
    	} catch (JsonMappingException e) {
    		log.error(" JsonParseException al convert JSON String to Java Object, causa:" + e.getMessage());
    	} catch (IOException e) {
    		log.error(" IOException al convert JSON String to Java Object, causa:" + e.getMessage());
    	} catch (IllegalArgumentException e) {
    		log.error(" IllegalArgumentException reflection process al convert JSON String to Java Object, causa:" + e.getMessage());
    	} catch (IllegalAccessException e) {
    		log.error(" IllegalAccessException reflection process al convert JSON String to Java Object, causa:" + e.getMessage());
    	} catch (SecurityException e) {
    		log.error(" SecurityException reflection process al convert JSON String to Java Object, causa:" + e.getMessage());
    	} catch (NoSuchFieldException e) {
    		log.error(" NoSuchFieldException reflection process al convert JSON String to Java Object, causa:" + e.getMessage());
    	}
    	return sb.toString();
    }
}
	
