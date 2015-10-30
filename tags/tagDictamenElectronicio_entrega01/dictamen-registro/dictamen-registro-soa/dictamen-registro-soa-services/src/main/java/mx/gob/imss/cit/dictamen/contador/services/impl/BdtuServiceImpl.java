package mx.gob.imss.cit.dictamen.contador.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import mx.gob.imss.cit.dictamen.contador.commons.to.domain.CedulaTO;
import mx.gob.imss.cit.dictamen.contador.commons.to.domain.ContadorPublicoTO;
import mx.gob.imss.cit.dictamen.contador.commons.to.domain.NdtContadorPublicoAutTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DatosPersonalesDTO;
import mx.gob.imss.cit.dictamen.contador.model.NdtContadorPublicoAutDO;
import mx.gob.imss.cit.dictamen.contador.model.NdtR1DatosPersonalesDO;
import mx.gob.imss.cit.dictamen.contador.persistence.dao.NdtContadorPublicoAutDAO;
import mx.gob.imss.cit.dictamen.contador.services.BdtuService;

import org.apache.log4j.Logger;


@Stateless(name  = "bdtuService", mappedName = "bdtuService")
public class BdtuServiceImpl implements BdtuService {

	private static final Logger LOGGER = Logger.getLogger(BdtuServiceImpl.class);

	
	//private ServiciosPersonaBusinessRemote serviciosPersonaBusinessRemote;


	//private AfectarDatosPersonaBusinessRemote afectarDatosPersonaBusinessRemote;

	//@EJB
	//private PersonaBdtuService personaBdtuService;
	
	@EJB
	private NdtContadorPublicoAutDAO ndtContadorPublicoAutDAO;
	
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public ContadorPublicoTO obtenerContadorPorIdPersona(Long idPersona) {
		ContadorPublicoTO contadorPublicoTO = null;
		NdtContadorPublicoAutDO  ndtContadorPublicoAutDO =ndtContadorPublicoAutDAO.selectContadorPublicoAutByIdPersona(idPersona);
		if(ndtContadorPublicoAutDO!=null){
			contadorPublicoTO = new ContadorPublicoTO();
			contadorPublicoTO.setCveIdEstadoCPA(ndtContadorPublicoAutDO.getCveIdEstadoCpa().getCveIdEstadoCpa());
			contadorPublicoTO.setNumRegistroCPA(ndtContadorPublicoAutDO.getNumRegistroCpa());
		}
		return contadorPublicoTO;
	}
	
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public ContadorPublicoTO obtenerContadorPorNumRegistro(Integer NumRegistro) {
		ContadorPublicoTO contadorPublicoTO = null;

		NdtContadorPublicoAutDO  ndtContadorPublicoAutDO =ndtContadorPublicoAutDAO.selectContadorPublicoAutByNumRegistro(NumRegistro);
		
		if(ndtContadorPublicoAutDO!=null){
			contadorPublicoTO = new ContadorPublicoTO();
			contadorPublicoTO.setCveIdEstadoCPA(ndtContadorPublicoAutDO.getCveIdEstadoCpa().getCveIdEstadoCpa());
			contadorPublicoTO.setNumRegistroCPA(ndtContadorPublicoAutDO.getNumRegistroCpa());
		}
		return contadorPublicoTO;
	}
	
	@Override
	public List<CedulaTO> obtenerCedulaPorIdPersona(Long idPersona) {
		
		List<CedulaTO> lstCedula = new ArrayList<CedulaTO>(0);
		NdtContadorPublicoAutDO  ndtContadorPublicoAutDO =ndtContadorPublicoAutDAO.selectContadorPublicoAutByIdPersona(idPersona);
		List<NdtR1DatosPersonalesDO> lstDatosPersonales = ndtContadorPublicoAutDO.getNdtR1DatosPersonalesDOList();
		
		LOGGER.info("Integrator.ndtContadorPublicoAutDO="+ndtContadorPublicoAutDO.getNdtR1DatosPersonalesDOList().size());
		
		for(NdtR1DatosPersonalesDO ndtR1DatosPersonalesDO : lstDatosPersonales){
			CedulaTO cedulaTO = new CedulaTO();
			cedulaTO.setFechaExpedicionCedula(ndtR1DatosPersonalesDO.getFecExpedicionCedprof());
			cedulaTO.setInstitucionCedula(ndtR1DatosPersonalesDO.getDesTituloExpedidoPor());
			cedulaTO.setNumeroCedula(ndtR1DatosPersonalesDO.getCedulaProfesional());
			lstCedula.add(cedulaTO);
		}
		
		return lstCedula;
	}

	
	/*

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public Fisica obtenerFisicaPorPersona(Persona persona){
		Fisica personaFisica = null;

		Persona personaService = personaBdtuService.consultarPersonaFisicaIMSSPorRFC(persona);
		LOGGER.info("BdtuServiceImpl.personaService="+personaService.toString());
		if (personaService.getIdPersona() != null) {
			personaFisica = (Fisica)  personaService;
			if(personaFisica.getCveFisica() != null){
				return personaFisica;

			}
		}
		return null;
	}
	*/
	/*
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
	*/
/*

	@Override
	public Persona obtenerRegistroPersonaFisicaPorRFC(Persona persona) {
		
		Fisica fisica = null;
		boolean personaCalificadaPorRenapo = false;
		boolean personaCalificadaPorSat = false;
		try {
			init();
			serviciosPersonaBusinessRemote = (ServiciosPersonaBusinessRemote)locate("service.interface.buscar.persona.fisica");
			afectarDatosPersonaBusinessRemote = (AfectarDatosPersonaBusinessRemote)locate("service.interface.afectar.datos.personales");
			
			// Buscar Registro Persona Fisica
			fisica = (Fisica) personaBdtuService.consultarPersonaFisicaIMSSPorRFC(persona);
			
			if (fisica.getIdPersona() != null && fisica.getCveFisica() != null) {
				List<PersonaCalificacion> calificaciones = personaBdtuService.obtenerPersonaCalificaciones(fisica);		
				
				if(calificaciones != null && !calificaciones.isEmpty()) {
					fisica.setPersonaCalificaciones(calificaciones);
				}
			} else {
				fisica = (Fisica) personaBdtuService.registroPersona(persona, false);
			}
			// Se verifica la calificacion que trae la persona
			if (fisica != null && fisica.getPersonaCalificaciones() != null && !fisica.getPersonaCalificaciones().isEmpty()) {
				for (PersonaCalificacion personaCalificacion : fisica.getPersonaCalificaciones()) {
					if (personaCalificacion.getCalificacion().getIdCalificacion().intValue() == CalificacionEnum.VALIDADO_SAT.getCodigo()) {
						personaCalificadaPorSat = true;
					} else if (personaCalificacion.getCalificacion().getIdCalificacion().intValue() == CalificacionEnum.VALIDADO_RENAPO.getCodigo()) {
						personaCalificadaPorRenapo = true;
					}
				}
				fisica = serviciosPersonaBusinessRemote.complementaPersonaFisicaDPyDyMCEnIMSS(fisica);
			}
			// Si la persona fisica no esta calificada por el SAT, se realiza el procedimiento de ICA para actualizar a la persona fisica
			if (fisica != null && (!personaCalificadaPorSat || !personaCalificadaPorRenapo)) {
				ICADatosConsulta icaDatosConsulta = new ICADatosConsulta();
				persona.setIdPersona(fisica.getIdPersona());
				icaDatosConsulta.setPersonaFisica(fisica);
				icaDatosConsulta.setIndicadorConsultaRENAPO(!personaCalificadaPorRenapo);
				icaDatosConsulta.setIndicadorConsultaSAT(!personaCalificadaPorSat);				
				icaDatosConsulta.setIndicadorMostrarPantalla(false);
				icaDatosConsulta.setIsUsuarioExterno(false);
				ICADatosRespuesta icaDatosRespuesta = personaBdtuService.identificarCambiosFisica(icaDatosConsulta);
				afectarDatosPersonaBusinessRemote.crearSolicitudICA(icaDatosRespuesta);
				fisica = icaDatosRespuesta.getPersonaFisicaIMSS();
				fisica = serviciosPersonaBusinessRemote.complementaPersonaFisicaDPyDyMCEnIMSS(fisica);
			}
		} catch (NamingException ex) {
			LOGGER.info("ERROR: No se pudo inicializar el InitialContext del Servicio Componente EJB obtenerPersonaFisicaPorRFC.", ex);
		} catch (PersonaFisicaNoEncontradaException ex) {
			LOGGER.info("No se encontraron los complementos de la persona fisica.", ex);
		} catch (Exception ex) {
			LOGGER.info("ERROR: En el servicio BdtuServiceBusiness al tratar de obtener una persona fisica por rfc.", ex);
		} finally {
			close();
		}
		return fisica;
		
	}


	public AfectarDatosPersonaBusinessRemote getAfectarDatosPersonaBusinessRemote() {
		return afectarDatosPersonaBusinessRemote;
	}

	public void setAfectarDatosPersonaBusinessRemote(
			AfectarDatosPersonaBusinessRemote afectarDatosPersonaBusinessRemote) {
		this.afectarDatosPersonaBusinessRemote = afectarDatosPersonaBusinessRemote;
	}

	public PersonaBdtuService getPersonaBdtuService() {
		return personaBdtuService;
	}


	public void setPersonaBdtuService(PersonaBdtuService personaBdtuService) {
		this.personaBdtuService = personaBdtuService;
	}

*/





}
