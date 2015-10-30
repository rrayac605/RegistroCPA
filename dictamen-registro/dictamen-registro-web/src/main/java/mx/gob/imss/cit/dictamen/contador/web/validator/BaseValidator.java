package mx.gob.imss.cit.dictamen.contador.web.validator;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;

public class BaseValidator {
    /**
     * Arma el mensaje que se env&iacute;a en la excepci&oacute;n.
     * @param detalle Detalle del mensaje.
     * @param resumen Resumen del mensaje.
     * @param severidad Severidad del mensaje.
     * @return msj El mensaje que se env&iacute;a en la excepci&oacute;n.
     * */
    public FacesMessage armarMensaje(String detalle, String resumen, Severity severidad) {
        FacesMessage msj = new FacesMessage();
        msj.setDetail(detalle);
        msj.setSummary(resumen);
        msj.setSeverity(severidad);
        return msj;
    }
}
