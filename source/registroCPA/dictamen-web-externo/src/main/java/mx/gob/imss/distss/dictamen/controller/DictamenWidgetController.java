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
@RequestMapping(value = "/widget/dictamen")
public class DictamenWidgetController extends AbstractController {
	
	private static final Logger logger = LoggerFactory.getLogger(DictamenWidgetController.class);
	
	@RequestMapping(value = "/initWidgetDictamen/{idPersona}", method = RequestMethod.GET)
	public String initWidgetDictamen(Model model, HttpSession session, HttpServletRequest request, @PathVariable String idPersona) {
		logger.info("Me encuentro en el controller: DictamenWidgetController y en el metodo: initWidgetDictamen");
		model.addAttribute("idPersona", idPersona);
		return "widgetDictamenInit";
	}

	@RequestMapping(value = "/detalleWidgetDictamen/{idPersona}", method = RequestMethod.GET)
	public String detalleWidgetDictamen(Model model, HttpSession session, HttpServletRequest request, @PathVariable String idPersona) {
		logger.info("Me encuentro en el controller: DictamenWidgetController y en el metodo: detalleWidgetDictamen");
		model.addAttribute("idPersona", idPersona);
		return "widgetDictamenDetalle";
	}

}
