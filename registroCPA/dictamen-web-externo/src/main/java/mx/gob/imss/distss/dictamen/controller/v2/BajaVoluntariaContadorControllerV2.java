package mx.gob.imss.distss.dictamen.controller.v2;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import mx.gob.imss.ctirss.delta.model.gestion.individuo.Fisica;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Moral;
import mx.gob.imss.distss.dictamen.modelo.dto.NdtContadorPublicoAutDTO;
import mx.gob.imss.distss.dictamen.service.interfaces.v2.BajaVoluntariaContadorServiceRemoteV2;
import mx.gob.imss.distss.dictamen.service.interfaces.v2.ContadorPublicoServiceRemoteV2;
import mx.gob.imss.distss.dictamen.service.interfaces.v2.ReporteServiceRemote;
import mx.gob.imss.distss.dictamen.util.ConstantesDictamen;

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
public class BajaVoluntariaContadorControllerV2 {
	
	private static final Logger logger = LoggerFactory.getLogger(BajaVoluntariaContadorControllerV2.class);
	
	@Autowired
    ContadorPublicoServiceRemoteV2 contadorPublicoServiceRemoteV2;
	
	@Autowired
    private ReporteServiceRemote reporteServiceRemote;
	
	@Autowired
    BajaVoluntariaContadorServiceRemoteV2 bajaVoluntariaContadorServiceRemoteV2;
	
	@RequestMapping(value="/bajaVoluntaria/init")
	public String actualizacionInit(Model model, HttpSession session, HttpServletRequest request) {
		
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
			logger.info("ERROR: Al iniciar la baja de un contador publico autorizado.", ex);
			return "error";
		}
		return "bajaVoluntariaContador";
	}
	
	@RequestMapping(value="/bajaVoluntaria/generaParametrosPreliminaresBajaVoluntaria")
    public @ResponseBody NdtContadorPublicoAutDTO generaParametrosPreliminaresBajaVoluntaria(Model model, HttpServletRequest request, HttpSession session, 
    		@RequestBody NdtContadorPublicoAutDTO ndtContadorPublicoAutDTO) {
		Map<String,Object> iReportParameterBajaVoluntaria = null;
		try {
			Fisica usuarioSesion = (Fisica) session.getAttribute("usuarioSesion");
			ndtContadorPublicoAutDTO.setUsuarioSesion(usuarioSesion);
			ndtContadorPublicoAutDTO.setPersonaFiscal(usuarioSesion);
			iReportParameterBajaVoluntaria = reporteServiceRemote.generaParametrosBajaVoluntariaContador(ndtContadorPublicoAutDTO);
			if (iReportParameterBajaVoluntaria == null) {
				ndtContadorPublicoAutDTO.setErrorFormGeneral("No se pudo generar los par\u00E1metros del reporte preliminar de la baja voluntaria de un Contador P\u00FAblico.");
			}
			session.setAttribute("iReportParameterBajaVoluntaria", iReportParameterBajaVoluntaria);
		} catch (Exception ex) {
			logger.info("ERROR: Al generar los parametros del reporte preliminar de la baja voluntaria de un Contador Publico.", ex);
			ndtContadorPublicoAutDTO.setErrorFormGeneral("No se pudo generar los par\u00E1metros del reporte preliminar de la baja voluntaria de un Contador P\u00FAblico");
		}
		return ndtContadorPublicoAutDTO;
    }
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/bajaVoluntaria/visualizarPDF")
    public String visualizarPDF(Model model, HttpServletRequest request, HttpSession session) {
		Map<String,Object> iReportParameterBajaVoluntaria = null;
		byte[] byteArray = null;
		try {
			iReportParameterBajaVoluntaria = (Map<String, Object>) session.getAttribute("iReportParameterBajaVoluntaria");
			byteArray = reporteServiceRemote.generarReportePreliminar(iReportParameterBajaVoluntaria, ConstantesDictamen.TIPO_REPORTE_SOLICITUD_BAJA_VOLUNTARIA);
			session.setAttribute("byteArray", byteArray);
		} catch (Exception ex) {
			logger.info("ERROR: Al generar el reporte de la baja voluntaria de un contador publico.", ex);
		}
		return "visualizadorPDF";
    }
	
	@RequestMapping(value="/bajaVoluntaria/guardarBajaVoluntariaContador")
	public @ResponseBody NdtContadorPublicoAutDTO registroContador(Model model, HttpSession session, HttpServletRequest request,
			@RequestBody NdtContadorPublicoAutDTO ndtContadorPublicoAutDTO) {
		try {
			logger.info("Registrando la baja a un contador publico autorizado.");
			Fisica usuarioSesion = (Fisica) session.getAttribute("usuarioSesion");
			ndtContadorPublicoAutDTO = bajaVoluntariaContadorServiceRemoteV2.guardarBajaVoluntariaContador(ndtContadorPublicoAutDTO);
			ndtContadorPublicoAutDTO.setUsuarioSesion(usuarioSesion);
		} catch (Exception ex) {
			logger.info("ERROR: Al dar de baja a un contador publico autorizado.", ex);
			ndtContadorPublicoAutDTO.setErrorFormGeneral("No se pudo realizar la baja voluntaria del Contador P\u00fablico, Int\u00e9ntelo m\u00e1s tarde.");
			return ndtContadorPublicoAutDTO;
		}
		return ndtContadorPublicoAutDTO;
	}

}
