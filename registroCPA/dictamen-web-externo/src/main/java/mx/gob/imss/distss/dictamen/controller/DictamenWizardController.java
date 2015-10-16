package mx.gob.imss.distss.dictamen.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import mx.gob.imss.distss.dictamen.modelo.dto.Usuario;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/wizard/dictamen")
public class DictamenWizardController extends WebServiceCallerController {

	private static final Logger logger = LoggerFactory.getLogger(DictamenWizardController.class);

	@RequestMapping(value = "/initWizardDictamen", method = RequestMethod.GET)
	public String initWizardDictamen(Model model, HttpSession session, HttpServletRequest request) {
		logger.info("Me encuentro en el controller DictamenWizardController, en el metodo initWizardDictamen");

		Usuario usuarioSesion = (Usuario) session.getAttribute("usuarioSesion");
		model.addAttribute("usuario", usuarioSesion);
		Long idPersona = Long.parseLong(usuarioSesion.getIdPersona() != null ? usuarioSesion.getIdPersona() : "0");
		session.setAttribute("idPersona", idPersona);

		return "wizardDictamenInit";
	}
}
