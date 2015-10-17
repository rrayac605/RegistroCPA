package mx.gob.imss.cit.de.dictaminacion.batch.validation.util;

import java.util.regex.Pattern;

import mx.gob.imss.cit.de.dictaminacion.batch.validation.enums.BatchValidationsEnum;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class Validator {
	
	private Validator(){
		
	}
	
	public static boolean validate(BatchValidationsEnum tipoValidacion, String cadenaAEvaluar){		
		switch(tipoValidacion){
		case ALFANUMERICO_SIN_ESPACIOS_NI_CARACTERES_ESPECIALES:
			return Pattern.matches(BatchValidationsEnum.ALFANUMERICO_SIN_ESPACIOS_NI_CARACTERES_ESPECIALES.getRegExp(), cadenaAEvaluar);
		case ALFANUMERICO_CON_ACENTO_Y_ENIE:
			return Pattern.matches(BatchValidationsEnum.ALFANUMERICO_CON_ACENTO_Y_ENIE.getRegExp(), cadenaAEvaluar);
		case LONGITUD_10_11:
			return (validateLengt(10, cadenaAEvaluar) || validateLengt(11, cadenaAEvaluar) ? true:false);
		case LONGITUD_11:
			return validateLengt(11, cadenaAEvaluar);
		case LONGITUD_13:
			return validateLengt(13, cadenaAEvaluar);
		case NUMERICO:
			return Pattern.matches(BatchValidationsEnum.NUMERICO.getRegExp(), cadenaAEvaluar);
		case OBLIGATORIO:
			return isNotEmpty(cadenaAEvaluar);
		case RFC:
			return Pattern.matches(BatchValidationsEnum.RFC.getRegExp(), cadenaAEvaluar);
		default:
			return false;
		}			
	}
	
	public static boolean isNotEmpty(String cadenaAEvaluar){
		if(cadenaAEvaluar == null){
			return false;
		}else if(cadenaAEvaluar.isEmpty()){
			return false;
		}else if(cadenaAEvaluar.trim().isEmpty()){
			return false;
		}else{
			return true;
		}
	}
	
	public static boolean validateLengt(int length, String cadenaAEvaluar){
		if(cadenaAEvaluar.length() == length){
			return true;
		}else{
			return false;
		}		
	}
}

