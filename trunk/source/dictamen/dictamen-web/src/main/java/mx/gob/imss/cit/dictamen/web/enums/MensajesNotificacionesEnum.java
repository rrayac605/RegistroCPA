/**
 * 
 */
package mx.gob.imss.cit.dictamen.web.enums;

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
    ;

	private int code;

	private MensajesNotificacionesEnum(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}
}
