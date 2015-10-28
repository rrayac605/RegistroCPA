package mx.gob.imss.cit.dictamen.contador.web.util;

import java.util.regex.Pattern;

/**
 * Clase con validaciones de Cadenas mediante Expresiones regulares.
 * 
 * @author anavarrete
 *
 */
public class ExpresionesRegularesUtil {

	/** Expresi&oacute;n regular de CURP de acuerdo a las reglas de RENAPO:
	 * 
	 * <ul>
	 * <li>Primer car&aacute;cter alfab&eacute;tico del primer apellido</li>
	 * <li>Primer vocal no inicial del primer apellido</li>
	 * <li>Primer car&aacute;cter alfab&eacute;tico del segundo apellido</li>
	 * <li>Primer car&aacute;cter alfab&eacute;tico del primer nombre, en caso de Jos&eacute; o Mar&iacute;a
	 * se empleara el segundo nombre si lo hubiera</li>
	 * <li>Dos &uacute;ltimos d&iacute;gitos del año de nacimiento</li>
	 * <li>Dos d&iacute;gitos del mes de nacimiento</li>
	 * <li>Dos d&iacute;gitos del d&iacute;a de nacimiento</li>
	 * <li>Car&aacute;cter H o M para indecar el g&eacute;nero Hombre o Mujer segun
	 * corresponda</li>
	 * <li>Dos caracteres alfabeticos correspondiente a la clave de la entidad
	 * federativa de nacimiento, ver Cat&aacute;logo de entidades federativas de
	 * nacimiento</li>
	 * <li>Primer consonante no inicial del primer apellido</li>
	 * <li>Primer consonante no inicial del segundo apellido</li>
	 * <li>Primer consonante no inicial del nombre</li>
	 * <li>Dos d&iacute;gitos para evitar duplicidades</li>
	 * </ul>
	 */
	public static final String REGEX_CURP = "[A-Z]{1}[AEIOU]{1}[A-Z]{2}[0-9]{2}" + "(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])" + "[HM]{1}"
			+ "(AS|BC|BS|CC|CS|CH|CL|CM|DF|DG|GT|GR|HG|JC|MC|MN|MS|NT|NL|OC|PL|QT|QR|SP|SL|SR|TC|TS|TL|VZ|YN|ZS|NE)"
			+ "[B-DF-HJ-NP-TV-Z]{3}" + "[0-9A-Z]{1}[0-9]{1}$";
	/** expresi&oacute;n regular para validar tel&eacute;fono de casa  */
	public static final String REGEX_TELEFONO ="^([0-9]{10,11}$)";
	/** expresi&oacute;n regular para validar correos electr&oacute;nicos  */
	public static final String REGEX_CORREO ="^([_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})){0,1}$";

	public static final String REGEX_NUMERICO ="^[0-9]+$";

	/**
	 * Valida la composici&oacute;n de una cadena de acuerdo a una expresi&oacute;n regular
	 * @param cadena secuencia de caracteres que se van a validar
	 * @param expresion, cadena de expresi&oacute;n regular
	 * @return true si la cadena cumple con la expresi&oacute;n regular
	 */
	public static boolean validaCadenaExpresion(String cadena, String expresion) {
		boolean result = false;

		Pattern patron = Pattern.compile(expresion);
		if (!patron.matcher(cadena).matches()) {
			return result;
		} else {
			result = true ;

			return result;
		}
	}

	/**
	 * M&eacute;todo que valida que los elementos de una cadena sean d&iacute;gitos num&eacute;ricos
	 * @param cadena,  secuencia de caracteres que se van a validar
	 * @return true si todos los caracteres son num&eacute;ricos
	 */
	public static boolean isNumber(String cadena){
		for(int i=0; i<cadena.length(); i++){
			if(!Character.isDigit(cadena.charAt(i))){
				return false;
			}
		}
		return true;
	}
}