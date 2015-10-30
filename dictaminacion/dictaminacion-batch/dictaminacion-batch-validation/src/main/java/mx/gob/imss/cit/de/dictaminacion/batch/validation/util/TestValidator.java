package mx.gob.imss.cit.de.dictaminacion.batch.validation.util;

import mx.gob.imss.cit.de.dictaminacion.batch.validation.enums.BatchValidationsEnum;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class TestValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ALFANUMERICO_SIN_ESPACIOS_NI_CARACTERES_ESPECIALES");
		System.out.println(Validator.validate(BatchValidationsEnum.ALFANUMERICO_SIN_ESPACIOS_NI_CARACTERES_ESPECIALES, "MASC"));
		System.out.println(Validator.validate(BatchValidationsEnum.ALFANUMERICO_SIN_ESPACIOS_NI_CARACTERES_ESPECIALES, "MASC123"));
		System.out.println(Validator.validate(BatchValidationsEnum.ALFANUMERICO_SIN_ESPACIOS_NI_CARACTERES_ESPECIALES, "MASC 124"));
		System.out.println(Validator.validate(BatchValidationsEnum.ALFANUMERICO_SIN_ESPACIOS_NI_CARACTERES_ESPECIALES, "MASC-124"));
		System.out.println(Validator.validate(BatchValidationsEnum.ALFANUMERICO_SIN_ESPACIOS_NI_CARACTERES_ESPECIALES, "masc870401gq8"));
		System.out.println(Validator.validate(BatchValidationsEnum.ALFANUMERICO_SIN_ESPACIOS_NI_CARACTERES_ESPECIALES, "12312dafs8"));
		System.out.println("ALFANUMERICO_CON_ACENTO_Y_ENIE");
		System.out.println(Validator.validate(BatchValidationsEnum.ALFANUMERICO_CON_ACENTO_Y_ENIE, "RAÚL"));
		System.out.println(Validator.validate(BatchValidationsEnum.ALFANUMERICO_CON_ACENTO_Y_ENIE, "RAUL"));
		System.out.println(Validator.validate(BatchValidationsEnum.ALFANUMERICO_CON_ACENTO_Y_ENIE, "RAÚL123"));
		System.out.println(Validator.validate(BatchValidationsEnum.ALFANUMERICO_CON_ACENTO_Y_ENIE, "123RAÚL"));
		System.out.println(Validator.validate(BatchValidationsEnum.ALFANUMERICO_CON_ACENTO_Y_ENIE, "123 RAÚL"));
		System.out.println(Validator.validate(BatchValidationsEnum.ALFANUMERICO_CON_ACENTO_Y_ENIE, "123-RAÚL"));
		System.out.println("RFC");
		System.out.println(Validator.validate(BatchValidationsEnum.RFC, "masc870401gq8"));
		System.out.println(Validator.validate(BatchValidationsEnum.RFC, "MASC870401GQ8"));
		System.out.println(Validator.validate(BatchValidationsEnum.RFC, "1234567890123"));
		System.out.println(Validator.validate(BatchValidationsEnum.RFC, "AAAA999999ZZZ"));
		System.out.println(Validator.validate(BatchValidationsEnum.RFC, "ÑÑÑÑ871401123"));
	}

}

