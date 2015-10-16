package mx.gob.imss.cit.dictamen.web.util;


import java.beans.Statement;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;

import mx.gob.imss.cit.dictamen.web.util.annotations.Reset;

import org.apache.log4j.Logger;


/**
 * The Class CleanBeanUtil.
 */
public final class CleanBeanUtil {

    /** The logger. */
    private static final Logger LOGGER = Logger.getLogger(CleanBeanUtil.class);

    /** The setter prefix. */
    private static final String SETTER_PREFIX = "set";
    
    /** The setter prefix. */
    private static final int CERO = 0;
    /** The setter prefix. */
    private static final int UNO = 1;

    /**
     * Instantiates a new clean bean util.
     */
    private CleanBeanUtil() {
    }

    /**
     * Clean fields.
     * 
     * @param beanObject
     *            the bean object
     */
    public static void cleanFields(Object beanObject) {
        Class<?> obj = beanObject.getClass();
        Field[] fields = obj.getDeclaredFields();
        for (Field field : fields) {
            eraseField(beanObject, field);
        }
    }

    /**
     * Erase field.
     * 
     * @param beanObject
     *            the bean object
     * @param field
     *            the field
     */
    private static void eraseField(Object beanObject, Field field) {
        try {
            if (field.isAnnotationPresent(Reset.class)) {
                Reset reset = field.getAnnotation(Reset.class);
                //Statement stmt = null;
                field.setAccessible(Boolean.TRUE);
                if (reset.enabled()) {
                	//List
                	if(Collection.class.isAssignableFrom(field.getType())){

            			Object[] values = new Object[UNO];                            
                        ArrayList<?> myList = (ArrayList<?>) field.get(beanObject);
                        if(myList!=null){
                        	myList.clear();
                        }
                        values[CERO] = myList;
                        
            	        Statement stmt = new Statement(beanObject, createSetter(field.getName()),values );
                        stmt.execute();
                            
                	} else if(field.getType().isPrimitive()) { 
                        // boolean
                        if(field.getType().equals(boolean.class)) {
                            field.setBoolean(beanObject, false);
                        }else if(field.getType().equals( int.class)){
                        	field.setInt(beanObject, CERO);
                        }
                    } else {
                        Object[] values = new Object[UNO];
                        values[CERO] = null;
                        Statement stmt = new Statement(beanObject, createSetter(field.getName()), values);
                        stmt.execute();
                    }
                }
            }
        } catch (Exception e) {
        	e.printStackTrace();
            LOGGER.error("Se produjo un error al borrar los campos de " + beanObject.getClass().getName() + " en el campo " + field.getName(), e);
        }
    }

    /**
     * Creates the setter.
     * 
     * @param fieldName
     *            the field name
     * @return the string
     */
    private static String createSetter(String fieldName) {
        return SETTER_PREFIX + fieldName.substring(CERO, UNO).toUpperCase() + fieldName.substring(UNO);
    }

    public static <T> T instanceOf (Class<T> clazz) throws Exception {
        return clazz.newInstance();
    }
}