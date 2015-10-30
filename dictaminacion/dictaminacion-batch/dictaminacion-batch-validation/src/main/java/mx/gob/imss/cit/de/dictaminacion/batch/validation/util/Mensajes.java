package mx.gob.imss.cit.de.dictaminacion.batch.validation.util;

import mx.gob.imss.cit.de.dictaminacion.batch.validation.enums.BatchMensajesEnum;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.enums.BatchParametrosMensajesEnum;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class Mensajes {
	public static String getMensaje(BatchMensajesEnum mensaje, int lineNumber, String field){				
		String respuesta = mensaje.getMensaje().replaceAll(BatchParametrosMensajesEnum.NOMBRE_CAMPO.getCampo(), field);
			respuesta = respuesta.replaceAll(BatchParametrosMensajesEnum.NUMERO_LINEA.getCampo(), String.valueOf(lineNumber));
		return respuesta;
	}
	
	public static String getMensaje(BatchMensajesEnum mensaje, int lineNumber, String field, int numeroCaracteres){
		System.out.println(mensaje);
		String respuesta = mensaje.getMensaje().replaceAll(BatchParametrosMensajesEnum.NOMBRE_CAMPO.getCampo(), field)
				.replaceAll(BatchParametrosMensajesEnum.NUMERO_LINEA.getCampo(), String.valueOf(lineNumber));
		System.out.println(respuesta);				
		respuesta = respuesta
				.replaceAll(BatchParametrosMensajesEnum.NUMERO_CARACTERES.getCampo(),String.valueOf(numeroCaracteres));
		System.out.println(respuesta);				
		return 	respuesta;
	}
	
	public static String getMensaje(BatchMensajesEnum mensaje, int lineNumber, String field, int numeroCaracteresMin, int numeroCaracteresMax){
		System.out.println(mensaje);
		String respuesta = mensaje.getMensaje().replaceAll(BatchParametrosMensajesEnum.NOMBRE_CAMPO.getCampo(), field)
				.replaceAll(BatchParametrosMensajesEnum.NUMERO_LINEA.getCampo(), String.valueOf(lineNumber));
		System.out.println(respuesta);				
		respuesta = respuesta
				.replaceAll(BatchParametrosMensajesEnum.NUMERO_CARACTERES_MIN.getCampo(),String.valueOf(numeroCaracteresMin));
		respuesta = respuesta
				.replaceAll(BatchParametrosMensajesEnum.NUMERO_CARACTERES_MAX.getCampo(),String.valueOf(numeroCaracteresMax));
		
		System.out.println(respuesta);				
		return 	respuesta;
	}	
}

