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
		return mensaje.getMensaje().replaceAll(BatchParametrosMensajesEnum.NOMBRE_CAMPO.getCampo(), field)
				.replaceAll(BatchParametrosMensajesEnum.NUMERO_LINEA.getCampo(), String.valueOf(lineNumber));		
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
}

