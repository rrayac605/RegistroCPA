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
    ;

	private int code;

	private MensajesNotificacionesEnum(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}
}
