package mx.gob.imss.cit.de.dictaminacion.commons.util;



import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Clase que contiene metodos para validar si un objeto es nulo o vacio.
 * 
 * @author Admin
 */
public final class ValidatorUtil {

    public static final String CADENA_VACIA = "";


    /**
     * COntructor privado.
     */
    private ValidatorUtil() {

    }

    /**
     * Metodo que regresa True si algun objeto recibido como parametro es nulo.
     * 
     * @param objects
     *            the objects
     * @return Boolean
     */
    public static Boolean isAnyNull(Object... objects) {
        Boolean flag = false;
        for (Object object : objects) {
            if (object == null) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    /**
     * Metodo que regresa True si algun objeto recibido como parametro es nulo.
     * 
     * @param objects
     *            the objects
     * @return Boolean
     */
    public static Boolean isAllNull(Object... objects) {
        Boolean flag = true;
        for (Object object : objects) {
            if (object != null) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    /**
     * Metodo que regresa True si todos los objetos recibidos como parametro son
     * nulo.
     * 
     * @param objects
     *            the objects
     * @return Boolean
     */
    public static Boolean isAllEmpty(Object... objects) {
        Boolean flag = true;
        for (Object object : objects) {
            if (!(object == null || (object instanceof String && CADENA_VACIA.equals(object)))) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    /**
     * Metodo que regresa True si algun objeto recibido como parametro es nulo.
     * 
     * @param objects
     *            the objects
     * @return Boolean
     */
    public static Boolean isAnyEmpty(Object... objects) {
        Boolean flag = false;
        for (Object object : objects) {
            if (object == null || (object instanceof String && CADENA_VACIA.equals(object))) {
                flag = true;
                break;
            }
        }
        return flag;
    }


    /**
     * Lista vacia.
     * 
     * @param <T>
     *            the generic type
     * @param args
     *            the args
     * @return true, if successful
     */
    public static <T> boolean listaVacia(List<T>... args) {
        for (List<T> list : args) {
            if (list == null || list.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    /**
     * <br>
     * *************************** DESCRIPCION ***************************** <br>
     * <br>
     * M�todo que valida que el atributo recibido tenga el formato que indica la <br>
     * expresion regular <br>
     * <br>
     * <br>
     * ************************* LISTA DE ERRORES ************************** <br>
     * <br>
     * PARAMETROS_INCORRECTOS. En caso de que el par�metro de entrada no
     * coincida con el formato <br>
     * de la expresion regular introducida. <br>
     * <br>
     * ************************** DISENO TECNICO *************************** <br>
     * <br>
     * Validaciones <br>
     * --------------------------------------------------------------------- <br>
     * <br>
     * Validar que el par�metro recibido coincida con el formato <br>
     * de la expresion regular introducida <br>
     * <br>
     * Acciones <br>
     * --------------------------------------------------------------------- <br>
     * <br>
     * 1. Si el atributo No coincide con el formato de la expresion regular
     * recibida <br>
     * 1.1 Crear la excepci�n con los atributos: c�digo de la excepci�n = 102,
     * el par�metro de entrada. <br>
     * <br>
     * Control de Errores <br>
     * --------------------------------------------------------------------- <br>
     * <br>
     * 1. En caso de que el atributo No coincide con el formato de la expresion
     * regular recibida. <br>
     * <br>
     * ********************************************************************
     * 
     * @param atributo
     *            the atributo
     * @param valor
     *            the valor
     * @param expRegular
     *            the exp regular
     */
    public static void validateFormato(String valor, String expRegular) {
        validateFormato(valor, expRegular, null);
    }



    /**
     * <br>
     * *************************** DESCRIPCION ***************************** <br>
     * <br>
     * M�todo que valida que el atributo recibido tenga el formato que indica la <br>
     * expresion regular o la expresi�n regular 2 <br>
     * <br>
     * <br>
     * ************************* LISTA DE ERRORES ************************** <br>
     * <br>
     * PARAMETROS_INCORRECTOS. En caso de que el par�metro de entrada no
     * coincida con el formato <br>
     * de la expresion regular introducida. <br>
     * <br>
     * ************************** DISENO TECNICO *************************** <br>
     * <br>
     * Validaciones <br>
     * --------------------------------------------------------------------- <br>
     * <br>
     * Validar que el par�metro recibido coincida con el formato <br>
     * de la expresion regular introducida <br>
     * <br>
     * Acciones <br>
     * --------------------------------------------------------------------- <br>
     * <br>
     * 1. Si la expresi�n regular 2 es diferente de vacia <br>
     * 1.1 Valida si el atributo No coincide con el formato de la expresion
     * regular recibida <br>
     * 1.2 Crear la excepci�n con los atributos: c�digo de la excepci�n = 102,
     * el par�metro de entrada. <br>
     * 2. De lo contrario <br>
     * 2.2 Valida si el atributo No coincide con el formato de alguna de las dos
     * expresiones regulares recibidas <br>
     * 2.3 Crear la excepci�n con los atributos: c�digo de la excepci�n = 102,
     * el par�metro de entrada. <br>
     * <br>
     * Control de Errores <br>
     * --------------------------------------------------------------------- <br>
     * <br>
     * 1. En caso de que el atributo No coincide con el formato de la expresion
     * regular recibida. <br>
     * <br>
     * ********************************************************************
     * 
     * @param atributo
     *            the atributo
     * @param valor
     *            the valor
     * @param expRegular
     *            the exp regular
     * @param expRegular2
     *            the exp regular2
     */
    public static boolean validateFormato(String valor, String expRegular, String expRegular2) {
    	
    	boolean res=true;
    	
        if (ValidatorUtil.isAnyEmpty(expRegular2)) {
            if (!valor.matches(expRegular)) {
            	res=false;
            }
        } else {
            if (!valor.matches(expRegular) && !valor.matches(expRegular2)) {
            	res=false;
            }
        }
        return res;
    }

    
  

    /**
     * <br>
     * *************************** DESCRIPCION ***************************** <br>
     * <br>
     * M�todo que valida que los par�metros del mapa recibido no sean nulos o
     * vac�os <br>
     * <br>
     * Detalle del mapa recibido: <br>
     * Map<String, Objeto> <br>
     * La llave del mapa (String) ser� el nombre del atributo. <br>
     * Los elementos (Objecto) son los valores a validar. <br>
     * <br>
     * <br>
     * ************************* LISTA DE ERRORES ************************** <br>
     * <br>
     * PARAMETROS_INEXISTENTES. En caso de que el prerrequisito reciba
     * par�metros inv�lidos o nulos con c�digo de rechazo 101 <br>
     * <br>
     * ************************** DISENO TECNICO *************************** <br>
     * <br>
     * Validaciones <br>
     * --------------------------------------------------------------------- <br>
     * <br>
     * Validar que la lista de par�metros PARAMETROS recibidos no sean nulos o
     * vac�os. <br>
     * <br>
     * Acciones <br>
     * --------------------------------------------------------------------- <br>
     * <br>
     * 1. Recorrer el mapa recibido como par�metro 'PARAMETROS' y verifica que
     * no sean nulos o vacios los par�metros <br>
     * <br>
     * Iterar PARAMETROS{ <br>
     * Que cada par�metro recibido de la lista no sea nulo o vac�o. <br>
     * <br>
     * <br>
     * Control de Errores <br>
     * --------------------------------------------------------------------- <br>
     * <br>
     * 1. En caso de que se reciban par�metros nulos o vac�os se lanza una
     * excepci�n indicando el atributo vacio: <br>
     * <br>
     * Iterar PARAMETROS{ <br>
     * Si (PARAMETRO = NULL){ <br>
     * lanzar excepci�n PARAMETROS_INEXISTENTES: 101 <br>
     * <br>
     * Si (PARAMETRO es tipo String && PARAMETRO = "" /cadenavac�a){ <br>
     * lanzar excepci�n PARAMETROS_INEXISTENTES: 101 <br>
     * <br>
     * <br>
     * <br>
     * ********************************************************************
     * 
     * @param parametros
     *            the parametros
     */
    public static boolean validateParametros(Map<String, Object> parametros) {
    	
    	boolean res=false;
        for (Entry<String, Object> entry : parametros.entrySet()) {

            if (ValidatorUtil.isAnyNull(entry.getValue()) || ValidatorUtil.isAnyEmpty(entry.getValue())) {
            	res=true;
            }
        }
        return res;
    }

 

}