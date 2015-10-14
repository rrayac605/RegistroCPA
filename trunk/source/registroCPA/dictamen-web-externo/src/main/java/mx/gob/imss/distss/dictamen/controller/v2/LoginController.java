package mx.gob.imss.distss.dictamen.controller.v2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.gob.imss.ctirss.delta.model.gestion.individuo.Fisica;
import mx.gob.imss.distss.dictamen.service.interfaces.BdtuServiceRemote;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/login/dictamenV2")
public class LoginController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
    private BdtuServiceRemote bdtuServiceRemote;
	
	@RequestMapping(value = "/init/loginSession")
	public String initLoginSession(Model model, HttpServletResponse response, HttpServletRequest request) {
		LOGGER.info("Redireccionando a la pantalla de login");
		return "loginSession";
	}
	
	@RequestMapping(value = "/loginSession")
	public String loginSession(Model model, HttpServletResponse response, HttpServletRequest request, 
			@RequestParam("txtCurpLogin") String txtCurpLogin, @RequestParam("txtRfcLogin") String txtRfcLogin) {
		LOGGER.info("Recuperando Usuario de la Sesion de la BDTU");
		boolean personaRegistrada = false;
		Fisica usuarioSesion = null;
		try {
			Fisica personaFisica = new Fisica();
			personaFisica.setRfc(txtRfcLogin);
			personaFisica.setCurp(txtCurpLogin);
			
			personaFisica = (Fisica) bdtuServiceRemote.obtenerRegistroPersonaFisicaPorRFC(personaFisica);
			
			if (personaFisica.getIdPersona() != null && personaFisica.getCveFisica() != null) {
				usuarioSesion = new Fisica();
				usuarioSesion.setIdPersona(personaFisica.getIdPersona());
				usuarioSesion.setCveFisica(personaFisica.getCveFisica());
				usuarioSesion.setRfc(personaFisica.getRfc());
				usuarioSesion.setCurp(personaFisica.getCurp());
				usuarioSesion.setNss(personaFisica.getNss());
				usuarioSesion.setNombre(personaFisica.getNombre());
				usuarioSesion.setPrimerApellido(personaFisica.getPrimerApellido());
				usuarioSesion.setSegundoApellido(personaFisica.getSegundoApellido());
				usuarioSesion.setNombreCompleto(personaFisica.getNombreCompleto());
				usuarioSesion.setDomicilioFiscal(personaFisica.getDomicilioFiscal());
				usuarioSesion.setMediosContactoFiscales(personaFisica.getMediosContactoFiscales());
				usuarioSesion.setDomicilios(personaFisica.getDomicilios());
				request.getSession().setAttribute("usuarioSesion", usuarioSesion);
				model.addAttribute("usuarioSesion", personaFisica);
				personaRegistrada = true;
			}
		} catch (Exception ex) {
			LOGGER.info("ERROR: Excepcion ocurrida al intentar obtener al usuario en sesion.", ex);
		}
		if (personaRegistrada) {
			return "menuServicios";
		} else {
			return "loginSession";
		}
	}

}
