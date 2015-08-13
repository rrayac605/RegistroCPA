package mx.gob.imss.cit.dictamen.web.util;

import javax.servlet.http.HttpSession;

import mx.gob.imss.cit.dictamen.integration.api.dto.SesionDTO;
import mx.gob.imss.cit.dictamen.web.constants.WebConstants;

public final class SessionUtils {
    
    private SessionUtils() {
    }
    
    public static final SesionDTO getSesionTO() {
    	SesionDTO sesion = null;
        HttpSession session = (HttpSession) FacesUtils.getExternalContext().getSession(true);
        sesion = (SesionDTO) session.getAttribute(WebConstants.USUARIO_WEBOBJECT);
        return sesion;
    }
}