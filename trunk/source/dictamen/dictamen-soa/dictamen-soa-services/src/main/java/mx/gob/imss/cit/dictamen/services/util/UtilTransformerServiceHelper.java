package mx.gob.imss.cit.dictamen.services.util;

import java.beans.Statement;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import mx.gob.imss.cit.dictamen.services.constants.ServicesConstants;


public class UtilTransformerServiceHelper {
	
	private static Map<Class<?>, Class<?>> mapClass;
    private static final String SETTER_PREFIX = "set";

	private UtilTransformerServiceHelper(){
		
	}
	
	static{
		mapClass = new HashMap<Class<?>, Class<?>>();		
		mapClass.put(mx.gob.imss.cit.dictamen.model.NdtContadorPublicoAutDO.class,mx.gob.imss.cit.dictamen.commons.to.ContadorPublicoTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.model.DitPersonaDO.class,mx.gob.imss.cit.dictamen.commons.to.PersonaTO.class);
		
		mapClass.put(mx.gob.imss.cit.dictamen.model.DitPersonaDO.class,mx.gob.imss.cit.dictamen.commons.to.AsentamientoTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.model.DgCatLocalidadDO.class,mx.gob.imss.cit.dictamen.commons.to.CatLocalidadTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.model.DgCatEstadoDO.class,mx.gob.imss.cit.dictamen.commons.to.CatEstadoTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.model.DitPersonaDO.class,mx.gob.imss.cit.dictamen.commons.to.ActaConstitutivaTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.model.DitPersonaDO.class,mx.gob.imss.cit.dictamen.commons.to.PersonaDefuncionTO.class);
		
		mapClass.put(mx.gob.imss.cit.dictamen.model.DicPaisDO.class,mx.gob.imss.cit.dictamen.commons.to.PaisTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.model.DgCatEstadoCpDO.class,mx.gob.imss.cit.dictamen.commons.to.CatEstadoCpTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.model.DgCatMunicipioDO.class,mx.gob.imss.cit.dictamen.commons.to.CatMunicipioTO.class);
		mapClass.put(mx.gob.imss.cit.dictamen.model.DitSocioDO.class,mx.gob.imss.cit.dictamen.commons.to.SocioTO.class);

		
	
	}
	

	
	  public static Object get (Object origenObject, Class clazz, Integer profundidadMax) {
		  Object objectNew = null;
		  if(origenObject!=null){
			  
			try {
				objectNew = clazz.newInstance();
			
		        Class<?> obj = origenObject.getClass();
		        Field[] fields = obj.getDeclaredFields();
		        for (Field field : fields) {

		            eraseField(origenObject, field,objectNew,profundidadMax);
		        	
		        }
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		  } 
		  return objectNew;
	    }
	  
	  
	  
	  
	    /**
	     * Erase field.
	     * 
	     * @param origenObject
	     *            the bean object
	     * @param field
	     *            the field
	     */
	    private static void eraseField(Object origenObject, Field field,Object objectNew,Integer profundidad) {
	        try {

	                //Statement stmt = null;
	                
	                Field fieldNew=getField(field,objectNew);
	                field.setAccessible(Boolean.TRUE);
	                Object valueFlied=field.get(origenObject);
	                
	                if(fieldNew!=null && valueFlied!=null){	
	                	Object[] values = new Object[ServicesConstants.UNO];
	                	
	                	//List
	                	if(Collection.class.isAssignableFrom(field.getType())){

//	            			Object[] values = new Object[ServicesConstants.UNO];                            
//	                        ArrayList<?> myList = (ArrayList<?>) field.get(origenObject);
//	                        if(myList!=null){
//	                        	myList.clear();
//	                        }
//	                        values[ServicesConstants.CERO] = myList;
//	                        
//	            	        Statement stmt = new Statement(origenObject, createSetter(field.getName()),values );
//	                        stmt.execute();
	                            
	                	} else if(field.getType().isPrimitive()) { 
	                		
	                        values[ServicesConstants.CERO] = valueFlied;
	                        Statement stmt = new Statement(objectNew, createSetter(fieldNew.getName()), values);
	                        stmt.execute();
	                        
	                    } else if(mapClass.containsKey(field.getType()) ){
	                    	if(profundidad.intValue()>ServicesConstants.CERO){
		                    	Integer restaProfundidad= new Integer(profundidad.intValue() - ServicesConstants.UNO);
		                    	
		                    	values[ServicesConstants.CERO] = get (valueFlied, mapClass.get(field.getType()),restaProfundidad) ;
		                        Statement stmt = new Statement(objectNew, createSetter(fieldNew.getName()), values);
		                        stmt.execute();
	                    	}   
	                    }else {
	                        
	                        values[ServicesConstants.CERO] = valueFlied;
	                        Statement stmt = new Statement(objectNew, createSetter(fieldNew.getName()), values);
	                        stmt.execute();
	                    }
	                }	
	        } catch (Exception e) {
	        	e.printStackTrace();
	            //LOGGER.error("Se produjo un error al borrar los campos de " + beanObject.getClass().getName() + " en el campo " + field.getName(), e);
	        }	  
	    }
	    
	    
	  private static Field getField(Field input,Object object)  {
	    	 Class<?> clazz = object.getClass();
	    	 Field fieldR=null;
	    	 if(!Modifier.isFinal(input.getModifiers())){
	    		for (Field field : clazz.getDeclaredFields()) {
					if (field.getName().equals(input.getName())) {
						fieldR=field;
						break;
					}
				}
	    	 }
	    	 return fieldR;
	    }
	    
        private static String createSetter(String fieldName) {
            return SETTER_PREFIX + fieldName.substring(ServicesConstants.CERO, ServicesConstants.UNO).toUpperCase() + fieldName.substring(ServicesConstants.UNO);
        }

        
}
