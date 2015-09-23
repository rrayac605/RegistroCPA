package mx.gob.imss.cit.dictamen.commons.util;

import mx.gob.imss.cit.dictamen.commons.constants.DictamenConstants;


/**
 * The Class DateUtil.
 */
public final class ConverterUtils {

	private ConverterUtils() {

	}

	/**
	 * @param datosDTO
	 * @return
	 */
	public static Short convertBooleanToShort(Boolean valor) {
		return valor ? Short.valueOf(DictamenConstants.ESTADO_ACTIVO) : Short.valueOf(DictamenConstants.ESTADO_INACTIVO);
	}

}