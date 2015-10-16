package mx.gob.imss.distss.dictamen.web.controller;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.gob.imss.distss.dictamen.modelo.dto.Usuario;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/loginByRequestOpenAM")
public class LoginByRequestOpenAM {
	
	/**
     * Logger de la clase
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginByRequestOpenAM.class);
    
    @RequestMapping(value = "/loginSession")
	public String loginSession(Model model, HttpServletResponse response, HttpServletRequest request) {
		LOGGER.info("Recuperando Usuario de la Sesion del OpenAM");
		
		Enumeration<?> elementos = request.getAttributeNames();
		String element = "";
		
		Usuario usuarioOpenAM = new Usuario();
	
		while(elementos.hasMoreElements()) {
			element = elementos.nextElement().toString();
			LOGGER.info("ELEMENTO ------------------------------------------------------------------  ->"+  element);
			if(element.contains("SSO")) {
				LOGGER.info(element + " : " + request.getAttribute(element).toString());

				if(!quitaCorchetesString(request.getAttribute("SSO_SUBDELEGACION").toString()).equals("")) {
					usuarioOpenAM.setSubDeleg(""+Integer.parseInt(quitaCorchetesString(request.getAttribute("SSO_SUBDELEGACION").toString())));
				}
				usuarioOpenAM.setNombre(quitaCorchetesString(request.getAttribute("SSO_CN").toString()));
				usuarioOpenAM.setaPaterno(quitaCorchetesString(request.getAttribute("SSO_SN").toString()));
				usuarioOpenAM.setaMaterno(quitaCorchetesString(request.getAttribute("SSO_GIVENNAME").toString()));
				usuarioOpenAM.setCurp(quitaCorchetesString(request.getAttribute("SSO_UID").toString()));
				usuarioOpenAM.setCorreo(quitaCorchetesString(request.getAttribute("SSO_MAIL").toString()));
				usuarioOpenAM.setSubDeleg(quitaCorchetesString(request.getAttribute("SSO_SUBDELEGACION").toString()));
				usuarioOpenAM.setDeleg(quitaCorchetesString(request.getAttribute("SSO_DELEGACION").toString()));
				usuarioOpenAM.setPerfil(quitaCorchetesString(request.getAttribute("SSO_PERFIL").toString()));
			}
		}
		request.getSession().setAttribute("usuarioSesion", usuarioOpenAM);
		model.addAttribute("usuarioSesion", usuarioOpenAM);
		
		Usuario usuarioSesion = (Usuario) request.getSession().getAttribute("usuarioSesion");
		StringBuilder nombreCompleto = new StringBuilder();
		nombreCompleto.append(usuarioSesion.getNombre()+" ");
		nombreCompleto.append(usuarioSesion.getaPaterno()+" ");
		nombreCompleto.append(usuarioSesion.getaMaterno());
		LOGGER.info("Se recupera de la session el usuario: "+nombreCompleto.toString());
		
		return "home";
	}
    
    private String quitaCorchetesString(String cadena) {
		cadena = cadena.replace("[", "");
		cadena = cadena.replace("]", "");
		return cadena;
	}

}