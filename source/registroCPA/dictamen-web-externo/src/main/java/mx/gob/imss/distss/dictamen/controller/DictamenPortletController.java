package mx.gob.imss.distss.dictamen.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import mx.gob.imss.ctirss.delta.framework.base.controller.AbstractController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/portlet/dictamen")
public class DictamenPortletController extends AbstractController {
	
	private static final Logger logger = LoggerFactory.getLogger(DictamenWidgetController.class);
	
	@RequestMapping(value = "/initPortletDictamen/{idPersona}", method = RequestMethod.GET)
	public String initPortletDictamen(Model model, HttpSession session, HttpServletRequest request, @PathVariable String idPersona) {
		logger.info("Me encuentro en el controller: DictamenPortletController y en el metodo: initPortletDictamen");
		model.addAttribute("idPersona", idPersona);
		return "portletDictamenInit";
	}
	
	@RequestMapping(value = "/detallePortletDictamen/{idPersona}")
	public String detallePortletDictamen(Model model, HttpSession session, HttpServletRequest request, @PathVariable String idPersona) {
		logger.info("Me encuentro en el controller: DictamenPortletController y en el metodo: detallePortletDictamen");
		model.addAttribute("idPersona", idPersona);
		return "portletDictamenDetalle";
	}

}
