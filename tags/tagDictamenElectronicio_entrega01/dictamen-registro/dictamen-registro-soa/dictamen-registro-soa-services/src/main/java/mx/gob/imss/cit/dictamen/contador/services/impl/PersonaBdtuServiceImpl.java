package mx.gob.imss.cit.dictamen.contador.services.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.naming.NamingException;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.dictamen.contador.services.BaseBdtuService;
import mx.gob.imss.cit.dictamen.contador.services.PersonaBdtuService;
import mx.gob.imss.ctirss.delta.gestion.individuo.service.business.CalificacionesPersonaBusinessServiceRemote;
import mx.gob.imss.ctirss.delta.gestion.individuo.service.business.IndividuoServiceBusinessRemote;
import mx.gob.imss.ctirss.delta.gestion.individuo.service.business.PersonaFisicaServiceBusinessRemote;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.ICADatosConsulta;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.ICADatosRespuesta;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Persona;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.PersonaCalificacion;
import mx.gob.imss.ctirss.gestionpersonas.servicios.business.PersonaBusinessRemote;


@Stateless(name  = "personaBdtuService", mappedName = "personaBdtuService")
public class PersonaBdtuServiceImpl  extends BaseBdtuService implements PersonaBdtuService{

	private static final Logger LOGGER = Logger.getLogger(BdtuServiceImpl.class);

	private CalificacionesPersonaBusinessServiceRemote calificacionesPersonaBusinessServiceRemote;
	
	private IndividuoServiceBusinessRemote individuoServiceBusinessRemote;
	
    private PersonaBusinessRemote personaBusinessRemote;

	private PersonaFisicaServiceBusinessRemote personaFisicaServiceBusinessRemote;

	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public Persona consultarPersonaFisicaIMSSPorRFC(Persona persona) {
		/*
		try {
			init();
			individuoServiceBusinessRemote = (IndividuoServiceBusinessRemote)locate("service.interface.individuo");
			persona = individuoServiceBusinessRemote.consultarPersonaFisicaIMSSPorRFC(persona);
			LOGGER.info("PersonaBdtuServiceImpl.persona="+persona.toString());
		} catch (NamingException ex) {
			LOGGER.error("ERROR: No se pudo inicializar el InitialContext del Servicio Componente EJB de Pensiones BDTU.", ex);
		} catch (ClienteWebserviceRenapoCurpException ex) {
			LOGGER.error("ERROR: En el servicio webservice Renapo.", ex);
		} catch (ClienteWebserviceSatRfcException ex) {
			LOGGER.error("ERROR: En el servicio webservice SAT.", ex);
		} catch (PersonasNoLocalizadasException ex) {
			LOGGER.error("No se localizo a ningun registro de personas con los datos proporcionados.", ex);
		} catch (Exception ex) {
			LOGGER.error("ERROR: En el servicio de consulta persona fisica imss por rfc.", ex);
		} finally {
			close();
		}
		return persona;
		*/
		return null;
	}
	
	


	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<PersonaCalificacion> obtenerPersonaCalificaciones(Persona persona) throws RuntimeException {
		/*
		List<PersonaCalificacion> calificaciones = null;
		
		try {
			init();
			calificacionesPersonaBusinessServiceRemote = (CalificacionesPersonaBusinessServiceRemote)locate("service.interface.calificacion.persona");
						
			if (persona instanceof Fisica) {
				calificaciones = calificacionesPersonaBusinessServiceRemote.obtenerCalificacionesVigentes((Fisica) persona);
			} else if (persona instanceof Moral) {
				calificaciones = calificacionesPersonaBusinessServiceRemote.obtenerCalificacionesVigentes((Moral) persona);
			}
			
		} catch (NamingException ex) {
			LOGGER.info("ERROR: No se pudo inicializar el InitialContext del Servicio Componente EJB calificacionesPersonaBusinessServiceRemote.", ex);
		} catch (Exception ex) {
			LOGGER.info("ERROR: Obtener las calificaciones de la persona.", ex);
		} finally {
			close();
		}
		return calificaciones;
		*/
		return null;
	}
	
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public Persona registroPersona(Persona persona, boolean crearSolicitud) throws RuntimeException {
		/*
		try {
			init();
			personaBusinessRemote = (PersonaBusinessRemote)locate("service.interface.registro.persona");
			persona = personaBusinessRemote.registrarPersonaConEntidadesExternas(persona, crearSolicitud);
		} catch (NamingException ex) {
			LOGGER.info("ERROR: No se pudo inicializar el InitialContext del Servicio Componente EJB personaBusinessRemote de delta packing.", ex);
			throw new RuntimeException("ERROR: No se pudo inicializar el InitialContext del Servicio Componente EJB personaBusinessRemote de delta packing.", ex);
		} catch (Exception ex) {
			LOGGER.info("ERROR: Al registrar a un a Persona en el Servicio Componente EJB personaBusinessRemote de delta packing.", ex);
			throw new RuntimeException("ERROR: Al registrar a un a Persona en el Servicio Componente EJB personaBusinessRemote de delta packing.", ex);
		} finally {
			close();
		}
		return persona;
		*/
		return null;
	}
	
	
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public ICADatosRespuesta identificarCambiosFisica(ICADatosConsulta icaDatosConsulta) {
		/*
		ICADatosRespuesta icaDatosRespuesta = null;
		try {
			init();
			personaFisicaServiceBusinessRemote = (PersonaFisicaServiceBusinessRemote)locate("service.interface.persona.fisica");
			icaDatosRespuesta = personaFisicaServiceBusinessRemote.identificarCambios(icaDatosConsulta);
		} catch (NamingException ex) {
			LOGGER.info("ERROR: No se pudo inicializar el InitialContext del Servicio Componente EJB de Pensiones BDTU.", ex);
			throw new RuntimeException("ERROR: No se pudo inicializar el InitialContext del Servicio Componente EJB de Pensiones BDTU.", ex);
		} catch (Exception ex) {
			LOGGER.info("ERROR: Al obtener la lista de medios de contacto del usuario autentificado", ex);
			throw new RuntimeException("ERROR: Al obtener la lista de medios de contacto del usuario autentificado", ex);
		} finally {
			close();
		}
		return icaDatosRespuesta;
		*/
		return null;
	}
	
	
	public CalificacionesPersonaBusinessServiceRemote getCalificacionesPersonaBusinessServiceRemote() {
		return calificacionesPersonaBusinessServiceRemote;
	}




	public void setCalificacionesPersonaBusinessServiceRemote(
			CalificacionesPersonaBusinessServiceRemote calificacionesPersonaBusinessServiceRemote) {
		this.calificacionesPersonaBusinessServiceRemote = calificacionesPersonaBusinessServiceRemote;
	}




	public IndividuoServiceBusinessRemote getIndividuoServiceBusinessRemote() {
		return individuoServiceBusinessRemote;
	}




	public void setIndividuoServiceBusinessRemote(
			IndividuoServiceBusinessRemote individuoServiceBusinessRemote) {
		this.individuoServiceBusinessRemote = individuoServiceBusinessRemote;
	}




	public PersonaBusinessRemote getPersonaBusinessRemote() {
		return personaBusinessRemote;
	}
	
	

	
	public PersonaFisicaServiceBusinessRemote getPersonaFisicaServiceBusinessRemote() {
		return personaFisicaServiceBusinessRemote;
	}


	public void setPersonaBusinessRemote(PersonaBusinessRemote personaBusinessRemote) {
		this.personaBusinessRemote = personaBusinessRemote;
	}

	public void setPersonaFisicaServiceBusinessRemote(
			PersonaFisicaServiceBusinessRemote personaFisicaServiceBusinessRemote) {
		this.personaFisicaServiceBusinessRemote = personaFisicaServiceBusinessRemote;
	}


}
