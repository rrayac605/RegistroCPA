package mx.gob.imss.cit.de.dictaminacion.batch.validation.enums;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public enum BatchParametrosMensajesEnum {
	NOMBRE_CAMPO("#NOMBRE_CAMPO#"),
	NUMERO_CARACTERES("#NUMERO_CARACTERES#"),
	NUMERO_LINEA("#NUMERO_LINEA#"),
	NUMERO_CARACTERES_MIN("#NUMERO_CARACTERES_MIN#"),
	NUMERO_CARACTERES_MAX("#NUMERO_CARACTERES_MAX#");
	
	private String campo;
	
	private BatchParametrosMensajesEnum(String campo){
		this.campo = campo;
	}
	
	public String getCampo(){
		return campo;
	}
}

