package mx.gob.imss.cit.dictamen.commons.util;

import java.beans.Statement;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;


public class TransformerHelper {
	
	
    private static final String SETTER_PREFIX = "set";
    
    private static final int CERO=0;
    private static final int UNO=1;

	private TransformerHelper(){
		
	}
	

	 public static Object get (Map<Class<?>, Class<?>> mapClass,Object origenObject, Class clazz, Integer profundidadMax) {
		  Object objectNew = null;
		  if(origenObject!=null){
			  
			try {
				objectNew = clazz.newInstance();
			
		        Class<?> obj = origenObject.getClass();
		        Field[] fields = obj.getDeclaredFields();
		        for (Field field : fields) {

		            eraseField(mapClass,origenObject, field,objectNew,profundidadMax);
		        	
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
	    private static void eraseField(Map<Class<?>, Class<?>> mapClass,Object origenObject, Field field,Object objectNew,Integer profundidad) {
	        try {

	                //Statement stmt = null;
	                
	                Field fieldNew=getField(field,objectNew);
	                field.setAccessible(Boolean.TRUE);
	                Object valueFlied=field.get(origenObject);
	                
	                if(fieldNew!=null && valueFlied!=null){	
	                	Object[] values = new Object[UNO];
	                	
	                	//List
	                	if(Collection.class.isAssignableFrom(field.getType())){

	                		ArrayList<?> myList = (ArrayList<?>) valueFlied;
	                			                        
	                         //get the type as generic
	                        ParameterizedType fieldGenericType =(ParameterizedType)field.getGenericType();
	                        //get it's first type parameter
	                        Class<?> fieldTypeParameterType =(Class<?>)fieldGenericType.getActualTypeArguments()[CERO];			                        
	                        
	                        if(mapClass.containsKey(fieldTypeParameterType)){
	                        	Class<?> newClassField=mapClass.get(fieldTypeParameterType);
	                        	
	                        	List newList=getListWithNulls(newClassField, myList.size());
	                        	
	                        	Integer restaProfundidad= profundidad.intValue() - UNO;
	                        	
	                        	for(int i=CERO;i<myList.size();i++){
	                        	      Object obj=get (mapClass,myList.get(i), newClassField,restaProfundidad) ;
	                        	      newList.set(i, obj);
	                        	}
	                        
		                        values[CERO] = newList;
		                        Statement stmt = new Statement(objectNew, createSetter(fieldNew.getName()), values);
		                        stmt.execute();
	                        
	                        }    
	                	} else if(field.getType().isPrimitive()) { 
	                		
	                        values[CERO] = valueFlied;
	                        Statement stmt = new Statement(objectNew, createSetter(fieldNew.getName()), values);
	                        stmt.execute();
	                        
	                    } else if(mapClass.containsKey(field.getType()) ){
	                    	if(profundidad.intValue()>CERO){
		                    	Integer restaProfundidad= profundidad.intValue() - UNO;
		                    	
		                    	values[CERO] = get (mapClass,valueFlied, mapClass.get(field.getType()),restaProfundidad) ;
		                        Statement stmt = new Statement(objectNew, createSetter(fieldNew.getName()), values);
		                        stmt.execute();
	                    	}   
	                    }else {
	                        
	                        values[CERO] = valueFlied;
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
           return SETTER_PREFIX + fieldName.substring(CERO, UNO).toUpperCase() + fieldName.substring(UNO);
       }


       
       
       public static <T> List<T> getListWithNulls(Class<T> componentType, int length) {
    	   T[] array = (T[])Array.newInstance(componentType, length);
    	   return new ArrayList<T>(Arrays.asList(array));
    	}       
}
