/**
 * 
 */
package mx.gob.imss.cit.de.dictaminacion.web.enums;

/**
 * @author ajfuentes
 *
 */
public enum MensajesNotificacionesEnum {

	MSG_EXITO_EJEMPLO(1),
	MSG_ERROR_EJEMPLO2(2),
	MSG_EXITO_EJEMPLO3(3),
	MSG_ERROR_EJEMPLO4(4),
	MSG_ERROR_FIRMA_ELECTRONICA(5),
	MSG_EXITO_DATOS_PATRONALES(6),
	MSG_ERROR_DATOS_PATRONALES(7),
	MSG_ERROR_OBTENER_LAYOUTS(8),
	MSG_ERROR_OBTENER_EXAMENES(9),
	MSG_ERROR_OBTENER_DET_EXAMEN(10),
	MSG_ERROR_SAT_EXCEPCION(11),
	MSG_ERROR_SAT_NO_ENCONTRADO(12),
	MSG_ERROR_DATOS_PATRONALES_GET(13),
	MSG_ERROR_GUARDAR_ASEVERACION(14),
	MSG_ERROR_GUARDAR_EL_ATESTIGUAMIENTO(15),
	MSG_EXITO_SAT(16),
	MSG_EXITO_REGISTROS_PATRONALES(17),
	MSG_ERROR_REGISTROS_PATRONALES(18),
    ;

	private int code;

	private MensajesNotificacionesEnum(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}
}
