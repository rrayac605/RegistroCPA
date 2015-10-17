package mx.gob.imss.cit.dictamen.batch.validation.enums;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public enum BatchValidationsEnum {
	OBLIGATORIO("1"),
	LONGITUD_10_11("2"),
	LONGITUD_11("3"),
	LONGITUD_13("4"),
	ALFANUMERICO_SIN_ESPACIOS_NI_CARACTERES_ESPECIALES("[A-Za-z0-9]+"),
	ALFANUMERICO_CON_ACENTO_Y_ENIE("[A-Z,ÑÁÉÍÓÚ]+"),
	NUMERICO("[0-9]+"),
	RFC("[A-Za-z,Ññ,&]{3,4}[0-9]{2}[0-1][0-9][0-3][0-9][A-Za-z,0-9]?[A-Za-z,0-9]?[0-9,A-Za-z]?");
	
	private String regExp;

	private BatchValidationsEnum(String regExp) {
		this.regExp = regExp;
	}

	public String getRegExp() {
		return regExp;
	}
	
}

