package mx.gob.imss.cit.de.dictaminacion.commons.util;

import mx.gob.imss.cit.de.dictaminacion.commons.constants.DictamenConstants;


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

	
	public static Boolean convertShortToBoolean(Short valor) {
		return Short.valueOf(DictamenConstants.ESTADO_ACTIVO).equals(valor)?Boolean.TRUE : Boolean.FALSE;
	}

}