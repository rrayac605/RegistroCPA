package mx.gob.imss.cit.de.dictaminacion.batch.validation.enums;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public enum BatchMensajesEnum {
	MENSAJE_1("El campo #NOMBRE_CAMPO# debe de tener #NUMERO_CARACTERES#, línea #NUMERO_LINEA# del archivo. "),
	MENSAJE_2("El campo #NOMBRE_CAMPO# debe de tener mín.  #NUMERO_CARACTERES_MIN# y máx. #NUMERO_CARACTERES_MAX#, línea #NUMERO_LINEA# del archivo. "),
	MENSAJE_3("El campo #NOMBRE_CAMPO# debe de tener máx. #NUMERO_CARACTERES#, línea #NUMERO_LINEA# del archivo. "),
	MENSAJE_4("El campo #NOMBRE_CAMPO# es obligatorio, línea #NUMERO_LINEA#. "),
	MENSAJE_5("El campo #NOMBRE_CAMPO# contiene caracteres no válidos, línea #NUMERO_LINEA#  del archivo de carga. "),
	MENSAJE_6("El campo #NOMBRE_CAMPO# debe ser superior a 0, línea #NUMERO_LINEA# del archivo de carga. "),
	MENSAJE_7("El contenido del campo #NOMBRE_CAMPO# no es el esperado, línea #NUMERO_LINEA#  del archivo de carga. ");
	
	private String mensaje;
	
	private BatchMensajesEnum(String mensaje){
		this.mensaje = mensaje;
	}
	
	public String getMensaje(){
		return mensaje;
	}
	
}

