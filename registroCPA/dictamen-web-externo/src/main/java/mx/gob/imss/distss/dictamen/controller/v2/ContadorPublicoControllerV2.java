package mx.gob.imss.distss.dictamen.controller.v2;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import mx.gob.imss.ctirss.delta.model.gestion.individuo.Fisica;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Moral;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Persona;
import mx.gob.imss.ctirss.delta.model.gestion.medio.contacto.CorreoElectronico;
import mx.gob.imss.ctirss.delta.model.gestion.medio.contacto.MedioContacto;
import mx.gob.imss.ctirss.delta.model.gestion.medio.contacto.TelefonoFijo;
import mx.gob.imss.distss.dictamen.modelo.dto.NdtContadorPublicoAutDTO;
import mx.gob.imss.distss.dictamen.modelo.dto.NdtCpaTramiteDTO;
import mx.gob.imss.distss.dictamen.modelo.dto.NdtR1DatosPersonalesDTO;
import mx.gob.imss.distss.dictamen.modelo.dto.NdtR2DespachoDTO;
import mx.gob.imss.distss.dictamen.modelo.dto.NdtR3ColegioDTO;
import mx.gob.imss.distss.dictamen.service.interfaces.BdtuServiceRemote;
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
public class ContadorPublicoControllerV2 {

	private static final Logger logger = LoggerFactory.getLogger(ContadorPublicoControllerV2.class);

	@Autowired
    private ContadorPublicoServiceRemoteV2 contadorPublicoServiceRemoteV2;
	
	@Autowired
    private BdtuServiceRemote bdtuServiceRemote;
	
	@Autowired
    private ReporteServiceRemote reporteServiceRemote;
	
	@RequestMapping(value="/registro/validaRegistroContador")
    public @ResponseBody NdtContadorPublicoAutDTO validaRegistroContador(HttpServletRequest request, HttpSession session) {
		NdtContadorPublicoAutDTO ndtContadorPublicoAutDTO = new NdtContadorPublicoAutDTO();
		try {
			Fisica usuarioSesion = (Fisica) session.getAttribute("usuarioSesion");
			if (usuarioSesion != null && usuarioSesion.getIdPersona() != null) {
				ndtContadorPublicoAutDTO = contadorPublicoServiceRemoteV2.obtenerContadorPorIdPersona(usuarioSesion.getIdPersona());
			}
		} catch (Exception ex) {
			logger.info("ERROR: Al intentar obtener el registro de un contador publico por clave de persona.", ex);
			ndtContadorPublicoAutDTO.setErrorFormGeneral("Por el momento el servicio no se encuentra disponible int\u00e9ntelo m\u00e1s tarde.");
			return ndtContadorPublicoAutDTO;
		}
		return ndtContadorPublicoAutDTO;
    }

	@RequestMapping(value="/registro/init")
	public String registroInit(Model model, HttpSession session, HttpServletRequest request) {		
		NdtContadorPublicoAutDTO ndtContadorPublicoAutDTO = new NdtContadorPublicoAutDTO();
		CorreoElectronico medioContactoEmail = null;
		TelefonoFijo medioCOntactoTelFijo = null;
		try {
			Fisica usuarioSesion = (Fisica) session.getAttribute("usuarioSesion");
			// Se obtienen los medios de contacto fiscales del usuario autentificado, para mostrarlos en pantalla
			for (MedioContacto medioContactoFiscal : usuarioSesion.getMediosContactoFiscales()) {
				if (medioContactoFiscal.getTipoMedioContacto().getIdTipoMedioContacto().equals(ConstantesDictamen.ID_MEDIO_CONTACTO_EMAIL)) {
					medioContactoEmail = (CorreoElectronico) medioContactoFiscal;
				} else if (medioContactoFiscal.getTipoMedioContacto().getIdTipoMedioContacto().equals(ConstantesDictamen.ID_MEDIO_CONTACTO_TEL_FIJO)) {
					medioCOntactoTelFijo = (TelefonoFijo) medioContactoFiscal;
				}
			}
			ndtContadorPublicoAutDTO.setUsuarioSesion(usuarioSesion);
			ndtContadorPublicoAutDTO.setPersonaFiscal(usuarioSesion);
			
			// Se inicializan las listas para poder obtener la estructura de un objeto NdtContadorPublicoAutDTO en pantalla
			ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().add(new NdtR1DatosPersonalesDTO());
			ndtContadorPublicoAutDTO.getListNdtR2Despachos().add(new NdtR2DespachoDTO());
			ndtContadorPublicoAutDTO.getListNdtR3Colegios().add(new NdtR3ColegioDTO());
			ndtContadorPublicoAutDTO.getListNdtCpaTramites().add(new NdtCpaTramiteDTO());
			
			model.addAttribute("medioContactoEmail", medioContactoEmail != null ? medioContactoEmail.getDesFormaContacto() : "");
			model.addAttribute("medioContactoTelFijo", medioCOntactoTelFijo != null ? "01"+medioCOntactoTelFijo.getClaveLada().replace("-", "") : "");
			model.addAttribute("ndtContadorPublicoAutDTO", ndtContadorPublicoAutDTO);
			model.addAttribute("personaFisica", new Fisica());
			model.addAttribute("personaMoral", new Moral());
		} catch (Exception ex) {
			logger.info("ERROR: Al iniciar la solicitud de registro de un contador publico autorizado.", ex);
			return "error";
		}
		return "registroContador";
	}
	
	@RequestMapping(value="/registro/obtenerPersonaMoral")
	public @ResponseBody Persona obtenerPersonaMoral(HttpSession session, HttpServletRequest request, @RequestBody Moral personaMoral) {
		try {
			personaMoral = (Moral) bdtuServiceRemote.obtenerRegistroPersonaMoralPorRFC(personaMoral);
		} catch (Exception ex) {
			logger.info("ERROR: Al obtener el registro de una persona moral por rfc.", ex);
			personaMoral.setErrorFormGeneral("Por el momento el servicio no se encuentra disponible int\u00e9ntelo m\u00e1s tarde.");
		}
		return personaMoral;
	}
	
	@RequestMapping(value="/registro/generaParametrosPreliminares")
    public @ResponseBody NdtContadorPublicoAutDTO generaParametrosPreliminares(Model model, HttpServletRequest request, HttpSession session, 
    		@RequestBody NdtContadorPublicoAutDTO ndtContadorPublicoAutDTO) {
		Map<String,Object> iReportParameter = null;
		try {
			Fisica usuarioSesion = (Fisica) session.getAttribute("usuarioSesion");
			ndtContadorPublicoAutDTO.setUsuarioSesion(usuarioSesion);
			ndtContadorPublicoAutDTO.setPersonaFiscal(usuarioSesion);
			iReportParameter = reporteServiceRemote.generaParametrosRegistroContador(ndtContadorPublicoAutDTO);
			if (iReportParameter == null) {
				ndtContadorPublicoAutDTO.setErrorFormGeneral("No se pudo generar los par\u00E1metros del reporte preliminar del registro de Contador P\u00FAblico.");
			}
			session.setAttribute("iReportParameter", iReportParameter);
		} catch (Exception ex) {
			logger.info("ERROR: Al generar los parametros del reporte preliminar del registro de Contador Publico.", ex);
			ndtContadorPublicoAutDTO.setErrorFormGeneral("No se pudo generar los par\u00E1metros del reporte preliminar del registro de Contador P\u00FAblico");
		}
		return ndtContadorPublicoAutDTO;
    }
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/registro/visualizarPDF")
    public String visualizarPDF(Model model, HttpServletRequest request, HttpSession session) {
		Map<String,Object> iReportParameter = null;
		byte[] byteArray = null;
		try {
			iReportParameter = (Map<String, Object>) session.getAttribute("iReportParameter");
			byteArray = reporteServiceRemote.generarReportePreliminar(iReportParameter, ConstantesDictamen.TIPO_REPORTE_SOLICITUD_REGISTRO_CONTADOR);
			session.setAttribute("byteArray", byteArray);
		} catch (Exception ex) {
			logger.info("ERROR: Al generar el reporte del registro de un contador publico.", ex);
		}
		return "visualizadorPDF";
    }
	
	@RequestMapping(value="/registro/registroContador")
	public @ResponseBody NdtContadorPublicoAutDTO registroContador(Model model, HttpSession session, HttpServletRequest request,
			@RequestBody NdtContadorPublicoAutDTO ndtContadorPublicoAutDTO) {
		try {
			Fisica usuarioSesion = (Fisica) session.getAttribute("usuarioSesion");
			ndtContadorPublicoAutDTO.setUsuarioSesion(usuarioSesion);
			ndtContadorPublicoAutDTO.setPersonaFiscal(usuarioSesion);
			// Indicamos true para que sea un registro de contador y no una actualizacion de rubros.
			ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).setExistenCambiosCorreo(true);
			ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).setExistenCambiosTelefono(true);
			ndtContadorPublicoAutDTO.getListNdtR2Despachos().get(0).setExisteCambiosTelefono(true);
			ndtContadorPublicoAutDTO.getListNdtR1DatosPersonales().get(0).setExistenCambiosR1(true);
			ndtContadorPublicoAutDTO.getListNdtR2Despachos().get(0).setExistenCambiosR2(true);
			ndtContadorPublicoAutDTO.getListNdtR3Colegios().get(0).setExistenCambiosR3(true);
			ndtContadorPublicoAutDTO = contadorPublicoServiceRemoteV2.registroContadorPublicoAutorizado(ndtContadorPublicoAutDTO);
			ndtContadorPublicoAutDTO.setUsuarioSesion(usuarioSesion);
		} catch (Exception ex) {
			logger.info("ERROR: Al registrar a un contador publico.", ex);
			ndtContadorPublicoAutDTO.setErrorFormGeneral("No se pudo realizar el registro del Contador P\u00fablico, Int\u00e9ntelo m\u00e1s tarde.");
			return ndtContadorPublicoAutDTO;
		}
		return ndtContadorPublicoAutDTO;
	}
}
