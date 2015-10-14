package mx.gob.imss.distss.dictamen.controller.v2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import mx.gob.imss.ctirss.delta.model.gestion.individuo.Fisica;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Moral;
import mx.gob.imss.distss.dictamen.modelo.dto.NdtContadorPublicoAutDTO;
import mx.gob.imss.distss.dictamen.service.interfaces.v2.ActualizacionContadorServiceRemoteV2;
import mx.gob.imss.distss.dictamen.service.interfaces.v2.ContadorPublicoServiceRemoteV2;
import mx.gob.imss.distss.dictamen.service.interfaces.v2.ReporteServiceRemote;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/dictamenV2/contador")
public class ActualizacionContadorPublicoControllerV2 {
	
	private static final Logger logger = LoggerFactory.getLogger(ActualizacionContadorPublicoControllerV2.class);
	
	@Autowired
    ContadorPublicoServiceRemoteV2 contadorPublicoServiceRemoteV2;
	
	@Autowired
    ActualizacionContadorServiceRemoteV2 actualizacionContadorServiceRemoteV2;
	
	@Autowired
    private ReporteServiceRemote reporteServiceRemote;
	
	@RequestMapping(value="/actualizacion/init")
	public String actualizacionInit(Model model, HttpSession session, HttpServletRequest request) {
		logger.info("Me encuentro en el controller ActualizacionContadorPublicoControllerV2, en el metodo actualizacionInit.");
		
		NdtContadorPublicoAutDTO ndtContadorPublicoAutDTO = new NdtContadorPublicoAutDTO();
		try {
			Fisica usuarioSesion = (Fisica) session.getAttribute("usuarioSesion");
			
			if (usuarioSesion != null && usuarioSesion.getIdPersona() != null) {
				ndtContadorPublicoAutDTO = contadorPublicoServiceRemoteV2.obtenerContadorCompletoPorIdPersona(usuarioSesion.getIdPersona());
			}
			ndtContadorPublicoAutDTO.setUsuarioSesion(usuarioSesion);
			ndtContadorPublicoAutDTO.setPersonaFiscal(usuarioSesion);
			
			session.setAttribute("ndtContadorPublicoAutDTO", ndtContadorPublicoAutDTO);
			
			model.addAttribute("medioContactoEmail", ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).getCorreoElectronico());
			model.addAttribute("medioContactoTelFijo", ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).getTelefonoFijo());
			model.addAttribute("ndtContadorPublicoAutDTO", ndtContadorPublicoAutDTO);
			model.addAttribute("personaFisica", new Fisica());
			model.addAttribute("personaMoral", new Moral());
		} catch (Exception ex) {
			logger.info("ERROR: Al iniciar la actualizacion de un contador publico autorizado.", ex);
			return "error";
		}
		return "actualizacionContador";
	}
	
	@RequestMapping(value="/actualizacion/actualizarContador")
	public @ResponseBody NdtContadorPublicoAutDTO actualizarContador(Model model, HttpSession session, HttpServletRequest request,
			@RequestBody NdtContadorPublicoAutDTO ndtContadorPublicoAutDTO) {
		logger.info("Me encuentro en el controller ActualizacionContadorPublicoControllerV2, en el metodo actualizarContador.");
		try {
			Fisica usuarioSesion = (Fisica) session.getAttribute("usuarioSesion");
			NdtContadorPublicoAutDTO ndtContadorPublicoAutSession = (NdtContadorPublicoAutDTO) session.getAttribute("ndtContadorPublicoAutDTO");
			ndtContadorPublicoAutDTO = actualizacionContadorServiceRemoteV2.actualizarContador(ndtContadorPublicoAutSession, ndtContadorPublicoAutDTO);
						
			ndtContadorPublicoAutDTO.setUsuarioSesion(usuarioSesion);
		} catch (Exception ex) {
			logger.info(ex.getMessage(), ex);
			ndtContadorPublicoAutDTO.setErrorFormGeneral("No se pudo realizar la actualizaci\u00F3n del Contador P\u00fablico, Int\u00e9ntelo m\u00e1s tarde.");
			return ndtContadorPublicoAutDTO;
		}
		return ndtContadorPublicoAutDTO;
	}

}
