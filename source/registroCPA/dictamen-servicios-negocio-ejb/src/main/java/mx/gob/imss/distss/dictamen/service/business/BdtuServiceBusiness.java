package mx.gob.imss.distss.dictamen.service.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.naming.NamingException;

import mx.gob.imss.ctirss.delta.exception.individuo.PersonaFisicaNoEncontradaException;
import mx.gob.imss.ctirss.delta.exception.individuo.PersonasNoLocalizadasException;
import mx.gob.imss.ctirss.delta.framework.exceptions.ClienteWebserviceRenapoCurpException;
import mx.gob.imss.ctirss.delta.framework.exceptions.ClienteWebserviceSatRfcException;
import mx.gob.imss.ctirss.delta.gestion.individuo.service.business.CalificacionesPersonaBusinessServiceRemote;
import mx.gob.imss.ctirss.delta.gestion.individuo.service.business.IndividuoServiceBusinessRemote;
import mx.gob.imss.ctirss.delta.gestion.individuo.service.business.PersonaFisicaServiceBusinessRemote;
import mx.gob.imss.ctirss.delta.gestion.medio.contacto.service.interfaces.MediosContactoServiceBusinessRemote;
import mx.gob.imss.ctirss.delta.gestion.patronal.service.interfaces.SujetoObligadoServiceBusinessRemote;
import mx.gob.imss.ctirss.delta.gestion.solicitud.service.interfaces.SolicitudBusinessRemote;
import mx.gob.imss.ctirss.delta.model.asegurado.AsignacionNSS;
import mx.gob.imss.ctirss.delta.model.domicilio.EntidadFederativa;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.CalificacionEnum;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.EstadoCivil;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Fisica;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.ICADatosConsulta;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.ICADatosRespuesta;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Moral;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Persona;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.PersonaCalificacion;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Sexo;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.TipoPersona;
import mx.gob.imss.ctirss.delta.model.gestion.medio.contacto.CorreoElectronico;
import mx.gob.imss.ctirss.delta.model.gestion.medio.contacto.Facebook;
import mx.gob.imss.ctirss.delta.model.gestion.medio.contacto.MedioContacto;
import mx.gob.imss.ctirss.delta.model.gestion.medio.contacto.TelefonoFijo;
import mx.gob.imss.ctirss.delta.model.gestion.medio.contacto.TelefonoMovil;
import mx.gob.imss.ctirss.delta.model.gestion.medio.contacto.TipoMedioContacto;
import mx.gob.imss.ctirss.delta.model.gestion.medio.contacto.Twitter;
import mx.gob.imss.ctirss.delta.model.gestion.solicitud.Solicitud;
import mx.gob.imss.ctirss.delta.model.gestion.tramite.TipoTramite;
import mx.gob.imss.ctirss.delta.model.gestion.tramite.Tramite;
import mx.gob.imss.ctirss.delta.model.gestion.tramite.TramiteAsegurado;
import mx.gob.imss.ctirss.gestionpersonas.servicios.business.AfectarDatosPersonaBusinessRemote;
import mx.gob.imss.ctirss.gestionpersonas.servicios.business.ComponentesExternosBusinessRemote;
import mx.gob.imss.ctirss.gestionpersonas.servicios.business.PersonaBusinessRemote;
import mx.gob.imss.ctirss.gestionpersonas.servicios.business.PersonaMoralBusinessRemote;
import mx.gob.imss.ctirss.gestionpersonas.servicios.publicos.ServiciosPersonaBusinessRemote;
import mx.gob.imss.distss.dictamen.modelo.dto.DitFormaContactoDTO;
import mx.gob.imss.distss.dictamen.modelo.dto.DitPersonaDTO;
import mx.gob.imss.distss.dictamen.modelo.dto.DitPersonafContactoDTO;
import mx.gob.imss.distss.dictamen.modelo.dto.DitPersonafDomFiscalDTO;
import mx.gob.imss.distss.dictamen.modelo.dto.DitPersonamContactoDTO;
import mx.gob.imss.distss.dictamen.modelo.dto.DitPersonamDomFiscalDTO;
import mx.gob.imss.distss.dictamen.modelo.entidad.DitFormaContacto;
import mx.gob.imss.distss.dictamen.modelo.entidad.DitPersona;
import mx.gob.imss.distss.dictamen.modelo.entidad.DitPersonafContacto;
import mx.gob.imss.distss.dictamen.modelo.entidad.DitPersonafDomFiscal;
import mx.gob.imss.distss.dictamen.modelo.entidad.DitPersonamContacto;
import mx.gob.imss.distss.dictamen.modelo.entidad.DitPersonamDomFiscal;
import mx.gob.imss.distss.dictamen.service.interfaces.BdtuDomicilioFicalServiceLocal;
import mx.gob.imss.distss.dictamen.service.interfaces.BdtuMediosContactoServiceLocal;
import mx.gob.imss.distss.dictamen.service.interfaces.BdtuPersonaServiceLocal;
import mx.gob.imss.distss.dictamen.service.interfaces.BdtuServiceRemote;
import mx.gob.imss.distss.dictamen.service.util.ServiceMapper;
import mx.gob.imss.distss.dictamen.util.ConstantesDictamen;
import mx.gob.imss.distss.pensiones.bdtu.modelo.PersonaMedioContactoDTO;
import mx.gob.imss.distss.pensiones.bdtu.modelo.PersonaPensionesDTO;
import mx.gob.imss.distss.pensiones.service.interfaces.MediosContactoServiceRemote;
import mx.gob.imss.distss.pensiones.service.interfaces.PersonaServiceRemoteBDTU;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

@Stateless(name  = "bdtuServiceBusiness", mappedName = "bdtuServiceBusiness")
public class BdtuServiceBusiness extends BaseServiceBusiness implements BdtuServiceRemote {
	
	private static final Logger logger = LoggerFactory.getLogger(BdtuServiceBusiness.class);
	
	/**
     * Servicio para los BDTU
     */
	@EJB
    BdtuPersonaServiceLocal bdtuPersonaServiceLocal;
	
	/**
     * Servicio para los BDTU
     */
	@EJB
    BdtuDomicilioFicalServiceLocal bdtuDomicilioFicalServiceLocal;
	
	/**
     * Servicio para los BDTU
     */
	@EJB
    BdtuMediosContactoServiceLocal bdtuMediosContactoServiceLocal;
	
	SolicitudBusinessRemote solicitudBusinessRemote;
	
	PersonaServiceRemoteBDTU personaServiceRemoteBDTU;
	MediosContactoServiceRemote mediosContactoServiceRemote;
	
	PersonaBusinessRemote personaBusinessRemote;
	CalificacionesPersonaBusinessServiceRemote calificacionesPersonaBusinessServiceRemote;
	PersonaMoralBusinessRemote personaMoralBusinessRemote;
	ServiciosPersonaBusinessRemote serviciosPersonaBusinessRemote;
	
	IndividuoServiceBusinessRemote individuoServiceBusinessRemote;
	PersonaFisicaServiceBusinessRemote personaFisicaServiceBusinessRemote;
	AfectarDatosPersonaBusinessRemote afectarDatosPersonaBusinessRemote;
	
	ComponentesExternosBusinessRemote componentesExternosBusinessRemote;
	
	MediosContactoServiceBusinessRemote mediosContactoServiceBusinessRemote;
	
	SujetoObligadoServiceBusinessRemote sujetoObligadoServiceBusinessRemote;
	
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public Fisica buscaPersonaFisicaPorId(Long idPersona) throws RuntimeException {
    	Fisica personaFisica = null;
		try {
			initContextBDTU();
			personaServiceRemoteBDTU = (PersonaServiceRemoteBDTU) getServiceBDTU("service.interface.persona");
			PersonaPensionesDTO personaPensionesDTO = personaServiceRemoteBDTU.consultaPersonaPorId(idPersona);
			
			if (personaPensionesDTO != null) {
				personaFisica = new Fisica();
				personaFisica.setCveFisica(personaPensionesDTO.getCveFisica());
				personaFisica.setNombre(personaPensionesDTO.getNombre());
				personaFisica.setPrimerApellido(personaPensionesDTO.getPrimerApellido());
				personaFisica.setSegundoApellido(personaPensionesDTO.getSegundoApellido());
				personaFisica.setCurp(personaPensionesDTO.getCurp());
				personaFisica.getSexo().setDescripcion(personaPensionesDTO.getSexo());
				
				EstadoCivil estadoCivil = new EstadoCivil();
				estadoCivil.setDescripcion(personaPensionesDTO.getEstadoCivil());
				personaFisica.setEstadoCivil(estadoCivil);
				
				personaFisica.setFechaNacimientoFormateada(personaPensionesDTO.getFechaNacimiento());
				personaFisica.getLugarNacimiento().setNombre(personaPensionesDTO.getLugarNacimiento());
				personaFisica.setIdPersona(personaPensionesDTO.getIdPersona());
				
				TipoPersona tipoPersona = new TipoPersona();
				tipoPersona.setIdTipoPersona(personaPensionesDTO.getIdTipoPersona());
				personaFisica.setTipoPersona(tipoPersona);
				
				personaFisica.setRfc(personaPensionesDTO.getRfc());
				
				if (personaPensionesDTO.getTwitter() != null) {
					Twitter twitter = new Twitter();
					TipoMedioContacto tipoMedioContactoTwitter = new TipoMedioContacto();
					tipoMedioContactoTwitter.setIdTipoMedioContacto(personaPensionesDTO.getTwitter().getIdTipoContacto());
					twitter.setTipoMedioContacto(tipoMedioContactoTwitter);
					twitter.setCuenta(personaPensionesDTO.getTwitter().getCuenta());
					personaFisica.setTwitter(twitter);
				}
				
				if (personaPensionesDTO.getFacebook() != null) {
					Facebook facebook = new Facebook();
					TipoMedioContacto tipoMedioContactoFacebook = new TipoMedioContacto();
					tipoMedioContactoFacebook.setIdTipoMedioContacto(personaPensionesDTO.getFacebook().getIdTipoContacto());
					facebook.setTipoMedioContacto(tipoMedioContactoFacebook);
					facebook.setCuenta(personaPensionesDTO.getFacebook().getCuenta());
					personaFisica.setFacebook(facebook);
				}
				
				if (personaPensionesDTO.getCorreoElectronico() != null) {
					CorreoElectronico correoElectronico = new CorreoElectronico();
					TipoMedioContacto tipoMedioContactoCorreo = new TipoMedioContacto();
					tipoMedioContactoCorreo.setIdTipoMedioContacto(personaPensionesDTO.getCorreoElectronico().getIdTipoContacto());
					correoElectronico.setTipoMedioContacto(tipoMedioContactoCorreo);
					correoElectronico.setCorreo(personaPensionesDTO.getCorreoElectronico().getCuenta());
					personaFisica.setCorreoElectronico(correoElectronico);
				}
				
				if (personaPensionesDTO.getTelefonoFijo() != null) {
					TelefonoFijo telefonoFijo = new TelefonoFijo();
					TipoMedioContacto tipoMedioContactoTelFijo = new TipoMedioContacto();
					tipoMedioContactoTelFijo.setIdTipoMedioContacto(personaPensionesDTO.getTelefonoFijo().getIdTipoContacto());
					telefonoFijo.setTipoMedioContacto(tipoMedioContactoTelFijo);
					telefonoFijo.setNumero(personaPensionesDTO.getTelefonoFijo().getNumero());
					personaFisica.setTelefonoFijo(telefonoFijo);
				}
				
				if (personaPensionesDTO.getTelefonoMovil() != null) {
					TelefonoMovil telefonoMovil = new TelefonoMovil();
					TipoMedioContacto tipoMedioContactoTelMovil = new TipoMedioContacto();
					tipoMedioContactoTelMovil.setIdTipoMedioContacto(personaPensionesDTO.getTelefonoMovil().getIdTipoContacto());
					telefonoMovil.setTipoMedioContacto(tipoMedioContactoTelMovil);
					telefonoMovil.setNumero(personaPensionesDTO.getTelefonoMovil().getNumero());
					personaFisica.setTelefonoMovil(telefonoMovil);
				}
			}
		} catch (NamingException ex) {
			logger.info("ERROR: No se pudo inicializar el InitialContext del Servicio Componente EJB de Pensiones BDTU.", ex);
			throw new RuntimeException("ERROR: No se pudo inicializar el InitialContext del Servicio Componente EJB de Pensiones BDTU.", ex);
		} catch (Exception ex) {
			logger.info("ERROR: Al intentar obtener a una Persona Fisica del Servicio Componente EJB de Pensiones BDTU.", ex);
			throw new RuntimeException("ERROR: Al intentar obtener a una Persona Fisica del Servicio Componente EJB de Pensiones BDTU.", ex);
		} finally {
			closeContextBDTU();
		}
		return personaFisica;
	}
	
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public ArrayList<MedioContacto> obtenerListMedioContacto(Long idPersona) throws RuntimeException {
		ArrayList<MedioContacto> listMedioContactos = null;
		MedioContacto medioContacto = null;
		try {
			initContextBDTU();
			mediosContactoServiceRemote = (MediosContactoServiceRemote)getServiceBDTU("service.interface.medios.contacto");
			List<PersonaMedioContactoDTO> listPersonaMedioContactoDTOs = mediosContactoServiceRemote.buscaMediosContactoPorPersona(idPersona);
			if (listPersonaMedioContactoDTOs != null && listPersonaMedioContactoDTOs.size() > 0) {
				listMedioContactos = new ArrayList<MedioContacto>();
				for (PersonaMedioContactoDTO personaMedioContactoDTO : listPersonaMedioContactoDTOs) {
					medioContacto = new MedioContacto();
					TipoMedioContacto tipoMedioContacto = new TipoMedioContacto();
					tipoMedioContacto.setIdTipoMedioContacto(personaMedioContactoDTO.getMedioContactoDTO().getIdMedioContacto());
					if (personaMedioContactoDTO.getMedioContactoDTO().getIdMedioContacto().equals(ConstantesDictamen.ID_MEDIO_CONTACTO_EMAIL)) {
						tipoMedioContacto.setDescripcion(ConstantesDictamen.CORREO_ELECTRONICO);
					} else if (personaMedioContactoDTO.getMedioContactoDTO().getIdMedioContacto().equals(ConstantesDictamen.ID_MEDIO_CONTACTO_FACEBOOK)) {
						tipoMedioContacto.setDescripcion(ConstantesDictamen.FACEBOOK);
					} else if (personaMedioContactoDTO.getMedioContactoDTO().getIdMedioContacto().equals(ConstantesDictamen.ID_MEDIO_CONTACTO_TEL_FIJO)) {
						tipoMedioContacto.setDescripcion(ConstantesDictamen.TELEFONO_FIJO);
					} else if (personaMedioContactoDTO.getMedioContactoDTO().getIdMedioContacto().equals(ConstantesDictamen.ID_MEDIO_CONTACTO_TEL_MOVIL)) {
						tipoMedioContacto.setDescripcion(ConstantesDictamen.TELEFONO_MOVIL);
					} else if (personaMedioContactoDTO.getMedioContactoDTO().getIdMedioContacto().equals(ConstantesDictamen.ID_MEDIO_CONTACTO_TWITTER)) {
						tipoMedioContacto.setDescripcion(ConstantesDictamen.TWITTER);
					}
					medioContacto.setTipoMedioContacto(tipoMedioContacto);
					medioContacto.setDesFormaContacto(personaMedioContactoDTO.getDescripcion());
					listMedioContactos.add(medioContacto);
				}
			}
		} catch (NamingException ex) {
			logger.info("ERROR: No se pudo inicializar el InitialContext del Servicio Componente EJB de Pensiones BDTU.", ex);
			throw new RuntimeException("ERROR: No se pudo inicializar el InitialContext del Servicio Componente EJB de Pensiones BDTU.", ex);
		} catch (Exception ex) {
			logger.info("ERROR: Al obtener la lista de medios de contacto del usuario autentificado", ex);
			throw new RuntimeException("ERROR: Al obtener la lista de medios de contacto del usuario autentificado", ex);
		} finally {
			closeContextBDTU();
		}
		return listMedioContactos;
	}
	
	@Override
	public DitPersonaDTO obtenerPersonaPorCurp(String curp) {
		DitPersonaDTO ditPersonaDTO = null;
		DitPersona ditPersona = null;
		try {
			ditPersona = bdtuPersonaServiceLocal.obtenerPersonaPorCurp(curp);
			if (ditPersona != null) {
				ditPersonaDTO = ServiceMapper.map(ditPersona, DitPersonaDTO.class);
			}
		} catch (Exception ex) {
			logger.info("ERROR: Al obtener a un a Persona en el servicio EJB personaBusinessRemote.", ex);
			throw new RuntimeException("ERROR: Al obtener a un a Persona en el servicio EJB personaBusinessRemote.", ex);
		}
		return ditPersonaDTO;
	}
	
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public Persona consultarPersonaFisicaIMSSPorRFC(Persona persona) {
		try {
			initContextBDTU();
			individuoServiceBusinessRemote = (IndividuoServiceBusinessRemote)getServiceBDTU("service.interface.individuo");
			persona = individuoServiceBusinessRemote.consultarPersonaFisicaIMSSPorRFC(persona);
		} catch (NamingException ex) {
			logger.info("ERROR: No se pudo inicializar el InitialContext del Servicio Componente EJB de Pensiones BDTU.", ex);
		} catch (ClienteWebserviceRenapoCurpException ex) {
			logger.info("ERROR: En el servicio webservice Renapo.", ex);
		} catch (ClienteWebserviceSatRfcException ex) {
			logger.info("ERROR: En el servicio webservice SAT.", ex);
		} catch (PersonasNoLocalizadasException ex) {
			logger.info("No se localizo a ningun registro de personas con los datos proporcionados.", ex);
		} catch (Exception ex) {
			logger.info("ERROR: En el servicio de consulta persona fisica imss por rfc.", ex);
		} finally {
			closeContextBDTU();
		}
		return persona;
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public Persona consultarPersonaMoralIMSSPorRFC(Persona persona) {
		try {
			initContextBDTU();
			individuoServiceBusinessRemote = (IndividuoServiceBusinessRemote)getServiceBDTU("service.interface.individuo");
			persona = individuoServiceBusinessRemote.consultarPersonaMoralIMSSPorRFC(persona);
		} catch (NamingException ex) {
			logger.info("ERROR: No se pudo inicializar el InitialContext del Servicio Componente EJB de individuoServiceBusinessRemote.", ex);
		} catch (PersonasNoLocalizadasException ex) {
			logger.info("No se localizo a ningun registro de personas con los datos proporcionados.", ex);
		} catch (Exception ex) {
			logger.info("ERROR: En el servicio de consulta persona moral imss por rfc.", ex);
		} finally {
			closeContextBDTU();
		}
		return persona;
	}
	
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public Moral consultarDatosBasicosPersonaMoral(Moral personaMoral) {
		try {
			initContextBDTU();
			individuoServiceBusinessRemote = (IndividuoServiceBusinessRemote)getServiceBDTU("service.interface.individuo");
			personaMoral = individuoServiceBusinessRemote.consultarDatosBasicosPersonaMoral(personaMoral);
		} catch (NamingException ex) {
			logger.info("ERROR: No se pudo inicializar el InitialContext del Servicio Componente EJB de individuoServiceBusinessRemote.", ex);
		} catch (Exception ex) {
			logger.info("ERROR: En el servicio de consulta datos basicos de una persona moral.", ex);
		} finally {
			closeContextBDTU();
		}
		return personaMoral;
	}
	
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public Moral buscaPersonaMoralPorId(Long idPersonaMoral) {
		Moral personaMoral = null;
		try {
			initContextBDTU();
			personaMoralBusinessRemote = (PersonaMoralBusinessRemote)getServiceBDTU("service.interface.buscar.persona.moral");
			personaMoral = personaMoralBusinessRemote.getPersonaMoral(idPersonaMoral);
		} catch (NamingException ex) {
			logger.info("ERROR: No se pudo inicializar el InitialContext del Servicio Componente EJB de personaMoralBusinessRemote.", ex);
		} catch (Exception ex) {
			logger.info("ERROR: En el servicio de consulta persona moral imss por clave persona moral.", ex);
		} finally {
			closeContextBDTU();
		}
		return personaMoral;
	}
	
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public ICADatosRespuesta identificarCambiosFisica(ICADatosConsulta icaDatosConsulta) {
		ICADatosRespuesta icaDatosRespuesta = null;
		try {
			initContextBDTU();
			personaFisicaServiceBusinessRemote = (PersonaFisicaServiceBusinessRemote)getServiceBDTU("service.interface.persona.fisica");
			icaDatosRespuesta = personaFisicaServiceBusinessRemote.identificarCambios(icaDatosConsulta);
		} catch (NamingException ex) {
			logger.info("ERROR: No se pudo inicializar el InitialContext del Servicio Componente EJB de Pensiones BDTU.", ex);
			throw new RuntimeException("ERROR: No se pudo inicializar el InitialContext del Servicio Componente EJB de Pensiones BDTU.", ex);
		} catch (Exception ex) {
			logger.info("ERROR: Al obtener la lista de medios de contacto del usuario autentificado", ex);
			throw new RuntimeException("ERROR: Al obtener la lista de medios de contacto del usuario autentificado", ex);
		} finally {
			closeContextBDTU();
		}
		return icaDatosRespuesta;
	}
	
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public ICADatosRespuesta identificarCambiosMoral(ICADatosConsulta icaDatosConsulta) {
		ICADatosRespuesta icaDatosRespuesta = null;
		try {
			initContextBDTU();
			personaMoralBusinessRemote = (PersonaMoralBusinessRemote)getServiceBDTU("service.interface.buscar.persona.moral");
			icaDatosRespuesta = personaMoralBusinessRemote.identificarCambios(icaDatosConsulta);
		} catch (NamingException ex) {
			logger.info("ERROR: No se pudo inicializar el InitialContext del Servicio Componente EJB de Pensiones BDTU.", ex);
			throw new RuntimeException("ERROR: No se pudo inicializar el InitialContext del Servicio Componente EJB de Pensiones BDTU.", ex);
		} catch (Exception ex) {
			logger.info("ERROR: Al obtener la lista de medios de contacto del usuario autentificado", ex);
			throw new RuntimeException("ERROR: Al obtener la lista de medios de contacto del usuario autentificado", ex);
		} finally {
			closeContextBDTU();
		}
		return icaDatosRespuesta;
	}
	
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public Persona registroPersona(Persona persona, boolean crearSolicitud) throws RuntimeException {
		try {
			initContextBDTU();
			personaBusinessRemote = (PersonaBusinessRemote)getServiceBDTU("service.interface.registro.persona");
			persona = personaBusinessRemote.registrarPersonaConEntidadesExternas(persona, crearSolicitud);
		} catch (NamingException ex) {
			logger.info("ERROR: No se pudo inicializar el InitialContext del Servicio Componente EJB personaBusinessRemote de delta packing.", ex);
			throw new RuntimeException("ERROR: No se pudo inicializar el InitialContext del Servicio Componente EJB personaBusinessRemote de delta packing.", ex);
		} catch (Exception ex) {
			logger.info("ERROR: Al registrar a un a Persona en el Servicio Componente EJB personaBusinessRemote de delta packing.", ex);
			throw new RuntimeException("ERROR: Al registrar a un a Persona en el Servicio Componente EJB personaBusinessRemote de delta packing.", ex);
		} finally {
			closeContextBDTU();
		}
		return persona;
	}
	
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<PersonaCalificacion> obtenerPersonaCalificaciones(Persona persona) throws RuntimeException {
		
		List<PersonaCalificacion> calificaciones = null;
		
		try {
			initContextBDTU();
			calificacionesPersonaBusinessServiceRemote = (CalificacionesPersonaBusinessServiceRemote)getServiceBDTU("service.interface.calificacion.persona");
						
			if (persona instanceof Fisica) {
				calificaciones = calificacionesPersonaBusinessServiceRemote.obtenerCalificacionesVigentes((Fisica) persona);
			} else if (persona instanceof Moral) {
				calificaciones = calificacionesPersonaBusinessServiceRemote.obtenerCalificacionesVigentes((Moral) persona);
			}
			
		} catch (NamingException ex) {
			logger.info("ERROR: No se pudo inicializar el InitialContext del Servicio Componente EJB calificacionesPersonaBusinessServiceRemote.", ex);
		} catch (Exception ex) {
			logger.info("ERROR: Obtener las calificaciones de la persona.", ex);
		} finally {
			closeContextBDTU();
		}
		return calificaciones;
	}
	
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<Fisica> obtenerListaPersonaFisica(String sCurp, String sRfc, String sNombre, String sPrimerApellido, 
			String sSegundoApellido, Date fechaNacimiento, EntidadFederativa lugarNacimiento, Sexo sexo) throws RuntimeException {
		List<Fisica> listFisicas = new ArrayList<Fisica>();
		try {
			initContextBDTU();
			serviciosPersonaBusinessRemote = (ServiciosPersonaBusinessRemote)getServiceBDTU("service.interface.buscar.persona.fisica");
			listFisicas = serviciosPersonaBusinessRemote.localizarPersonaFisica(sCurp, sRfc, sNombre, sPrimerApellido, sSegundoApellido, fechaNacimiento, lugarNacimiento, sexo);
		} catch (NamingException ex) {
			logger.info("ERROR: No se pudo inicializar el InitialContext del Servicio Componente EJB personaBusinessRemote de delta packing.", ex);
			throw new RuntimeException("ERROR: No se pudo inicializar el InitialContext del Servicio Componente EJB personaBusinessRemote de delta packing.", ex);
		} catch (Exception ex) {
			logger.info("ERROR: Al registrar a un a Persona en el Servicio Componente EJB personaBusinessRemote de delta packing.", ex);
			throw new RuntimeException("ERROR: Al registrar a un a Persona en el Servicio Componente EJB personaBusinessRemote de delta packing.", ex);
		} finally {
			closeContextBDTU();
		}
		return listFisicas;
	}
	
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<Moral> obtenerListaPersonaMoral(String sRfc) throws RuntimeException {
		List<Moral> listMorals = new ArrayList<Moral>();
		try {
			initContextBDTU();
			personaMoralBusinessRemote = (PersonaMoralBusinessRemote)getServiceBDTU("service.interface.buscar.persona.moral");
			listMorals = personaMoralBusinessRemote.buscarPersonaMoralPorRfcEnImss(sRfc);
		} catch (NamingException ex) {
			logger.info("ERROR: No se pudo inicializar el InitialContext del Servicio Componente EJB personaBusinessRemote de delta packing.", ex);
			throw new RuntimeException("ERROR: No se pudo inicializar el InitialContext del Servicio Componente EJB personaBusinessRemote de delta packing.", ex);
		} catch (Exception ex) {
			logger.info("ERROR: Al obtemer a un a Persona moral en el Servicio Componente EJB personaBusinessRemote de delta packing.", ex);
			throw new RuntimeException("ERROR: Al obtemer a un a Persona moral en el Servicio Componente EJB personaBusinessRemote de delta packing.", ex);
		} finally {
			closeContextBDTU();
		}
		return listMorals;
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public Persona obtenerRegistroPersonaFisicaPorRFC(Persona persona) {
		Fisica fisica = null;
		boolean personaCalificadaPorRenapo = false;
		boolean personaCalificadaPorSat = false;
		try {
			initContextBDTU();
			serviciosPersonaBusinessRemote = (ServiciosPersonaBusinessRemote)getServiceBDTU("service.interface.buscar.persona.fisica");
			afectarDatosPersonaBusinessRemote = (AfectarDatosPersonaBusinessRemote)getServiceBDTU("service.interface.afectar.datos.personales");
			
			// Buscar Registro Persona Fisica
			fisica = (Fisica) consultarPersonaFisicaIMSSPorRFC(persona);
			
			if (fisica.getIdPersona() != null && fisica.getCveFisica() != null) {
				List<PersonaCalificacion> calificaciones = this.obtenerPersonaCalificaciones(fisica);				
				if(!CollectionUtils.isEmpty(calificaciones)) {
					fisica.setPersonaCalificaciones(calificaciones);
				}
			} else {
				fisica = (Fisica) registroPersona(persona, false);
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
				ICADatosRespuesta icaDatosRespuesta = identificarCambiosFisica(icaDatosConsulta);
				afectarDatosPersonaBusinessRemote.crearSolicitudICA(icaDatosRespuesta);
				fisica = icaDatosRespuesta.getPersonaFisicaIMSS();
				fisica = serviciosPersonaBusinessRemote.complementaPersonaFisicaDPyDyMCEnIMSS(fisica);
			}
		} catch (NamingException ex) {
			logger.info("ERROR: No se pudo inicializar el InitialContext del Servicio Componente EJB obtenerPersonaFisicaPorRFC.", ex);
		} catch (PersonaFisicaNoEncontradaException ex) {
			logger.info("No se encontraron los complementos de la persona fisica.", ex);
		} catch (Exception ex) {
			logger.info("ERROR: En el servicio BdtuServiceBusiness al tratar de obtener una persona fisica por rfc.", ex);
		} finally {
			closeContextBDTU();
		}
		return fisica;
	}
	
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public Persona obtenerRegistroPersonaMoralPorRFC(Persona persona) {
		Moral moral = null;
		boolean personaCalificadaPorSat = false;
		try {
			initContextBDTU();
			afectarDatosPersonaBusinessRemote = (AfectarDatosPersonaBusinessRemote)getServiceBDTU("service.interface.afectar.datos.personales");
			
			// Buscar Registro Persona Fisica
			moral = (Moral) consultarPersonaMoralIMSSPorRFC(persona);
			
			if (moral.getCveMoral() != null) {
				List<PersonaCalificacion> calificaciones = this.obtenerPersonaCalificaciones(moral);
				if(!CollectionUtils.isEmpty(calificaciones)) {
					moral.setPersonaCalificaciones(calificaciones);
				}
			} else {
				moral = (Moral) registroPersona(persona, false);
			}
			
			// Se verifica la calificacion que trae la persona
			if (moral != null && moral.getPersonaCalificaciones() != null && !moral.getPersonaCalificaciones().isEmpty()) {
				for (PersonaCalificacion personaCalificacion : moral.getPersonaCalificaciones()) {
					if (personaCalificacion.getCalificacion().getIdCalificacion().intValue() == CalificacionEnum.VALIDADO_SAT.getCodigo()) {
						personaCalificadaPorSat = true;
					}
				}
			}
			// Si la persona fisica no esta calificada por el SAT, se realiza el procedimiento de ICA para actualizar a la persona fisica
			if (moral != null && !personaCalificadaPorSat) {
				ICADatosConsulta icaDatosConsulta = new ICADatosConsulta();
				persona.setIdPersona(moral.getIdPersona());
				icaDatosConsulta.setPersonaMoral(moral);
				icaDatosConsulta.setIndicadorConsultaSAT(!personaCalificadaPorSat);
				icaDatosConsulta.setIndicadorConsultaRENAPO(false);
				icaDatosConsulta.setIndicadorMostrarPantalla(false);
				icaDatosConsulta.setIsUsuarioExterno(false);
				ICADatosRespuesta icaDatosRespuesta = identificarCambiosMoral(icaDatosConsulta);
				afectarDatosPersonaBusinessRemote.crearSolicitudICA(icaDatosRespuesta);
				moral = icaDatosRespuesta.getPersonaMoralIMSS();
			}
		} catch (NamingException ex) {
			logger.info("ERROR: No se pudo inicializar el InitialContext del Servicio Componente EJB obtenerRegistroPersonaMoralPorRFC.", ex);
			throw new RuntimeException("ERROR: No se pudo inicializar el InitialContext del Servicio Componente EJB obtenerRegistroPersonaMoralPorRFC.", ex);
		} catch (Exception ex) {
			logger.info("ERROR: En el servicio BdtuServiceBusiness al tratar de obtener una persona moral por rfc.", ex);
			throw new RuntimeException("ERROR: En el servicio BdtuServiceBusiness al tratar de obtener una persona moral por rfc.", ex);
		} finally {
			closeContextBDTU();
		}
		return moral;
	}
	
//	@Override
//	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
//	public Persona obtenerDomicilioFiscalPersona(Persona persona) {
//		try {
//			initContextBDTU();
//			componentesExternosBusinessRemote = (ComponentesExternosBusinessRemote)getServiceBDTU("service.interface.componentes.externos");
//			componentesExternosBusinessRemote.getDomicilioFiscalPersona(persona);
//		} catch (NamingException ex) {
//			logger.info("ERROR: No se pudo inicializar el InitialContext del Servicio Componente EJB componentesExternosBusinessRemote.", ex);
//		} catch (Exception ex) {
//			logger.info("ERROR: En el servicio componentesExternosBusinessRemote al intentar obtener domicilio fiscal de una persona.", ex);
//		} finally {
//			closeContextBDTU();
//		}
//		return persona;
//	}
//
//	@Override
//	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
//	public Persona obtenerMediosContactoFiscalesPersona(Persona persona) {
//		try {
//			initContextBDTU();
//			componentesExternosBusinessRemote = (ComponentesExternosBusinessRemote)getServiceBDTU("service.interface.componentes.externos");
//			componentesExternosBusinessRemote.getMediosContactoFiscalesPersona(persona);
//		} catch (NamingException ex) {
//			logger.info("ERROR: No se pudo inicializar el InitialContext del Servicio Componente EJB componentesExternosBusinessRemote.", ex);
//		} catch (Exception ex) {
//			logger.info("ERROR: En el servicio componentesExternosBusinessRemote al intentar obtener domicilio fiscal de una persona.", ex);
//		} finally {
//			closeContextBDTU();
//		}
//		return persona;
//	}
	
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public Solicitud generarSolicitudTramiteBdtu(Persona persona) throws RuntimeException {
		Solicitud gestionSolicitud = new Solicitud();
//		AsignacionNssDTO assiAsignacionNssDTO = null;
		try {
			initContextBDTU();
			solicitudBusinessRemote = (SolicitudBusinessRemote)getServiceBDTU("service.interface.solicitudBusinessRemote");
			personaServiceRemoteBDTU = (PersonaServiceRemoteBDTU) getServiceBDTU("service.interface.persona");

	        TipoTramite tipoTramite = new TipoTramite();
	        tipoTramite.setIdTipoTramite(105);
	        mx.gob.imss.ctirss.delta.model.gestion.solicitud.TipoSolicitud tipoSolicitud = new mx.gob.imss.ctirss.delta.model.gestion.solicitud.TipoSolicitud();
			tipoSolicitud.setIdTipoSolicitud((long) 1);
//	        AsignacionNSS asignacionNSS = new AsignacionNSS();
//	        assiAsignacionNssDTO = personaServiceRemoteBDTU.obtenerAsignacionNSS(null, persona.getIdPersona());
//	        asignacionNSS.setIdAsignacionNSS(assiAsignacionNssDTO.getCveIdAsignacionNss());
	        
	        AsignacionNSS asignacionNSS = new AsignacionNSS();
            asignacionNSS.setNss("01001100039");
            asignacionNSS.setIdAsignacionNSS((long) 5);

			gestionSolicitud.setTipoSolicitud(tipoSolicitud);
			TramiteAsegurado tramite = new TramiteAsegurado();
			tramite.setTipoTramite(tipoTramite);
			List<Tramite> lisTramites = new ArrayList<Tramite>();
			
			tramite.setFisica(asignacionNSS);
			lisTramites.add(tramite);
			gestionSolicitud.setTramites(lisTramites);
			gestionSolicitud = solicitudBusinessRemote.crear(gestionSolicitud);
		} catch (NamingException ex) {
			logger.info("ERROR: No se pudo inicializar el InitialContext del Servicio Componente EJB generarSolicitudTramiteBdtu.", ex);
		} catch (Exception ex) {
			logger.info("ERROR: En el servicio generarSolicitudTramiteBdtu al intentar generar una solicitud de tramite.", ex);
		} finally {
			closeContextBDTU();
		}
		return gestionSolicitud;
	}
	
	@Override
	public DitPersonafDomFiscalDTO obtenerPersonaFDomFiscalPorIdDom(Long cveIdDomicilio) throws RuntimeException {
		DitPersonafDomFiscalDTO ditPersonafDomFiscalDTO = new DitPersonafDomFiscalDTO();
		try {
			DitPersonafDomFiscal ditPersonafDomFiscal = bdtuDomicilioFicalServiceLocal.obtenerPersonaFDomFiscalPorIdDom(cveIdDomicilio);
			ditPersonafDomFiscalDTO = ServiceMapper.map(ditPersonafDomFiscal, DitPersonafDomFiscalDTO.class);
		} catch (Exception ex) {
			logger.info("ERROR: Al obtener el domicilio de una persona fisica en el servicio EJB bdtuDomicilioFicalServiceLocal.", ex);
			ditPersonafDomFiscalDTO = null;
			throw new RuntimeException("ERROR: Al obtener el domicilio de una persona fisica en el servicio EJB bdtuDomicilioFicalServiceLocal.", ex);
		}
		return ditPersonafDomFiscalDTO;
	}
	
	@Override
	public DitPersonafDomFiscalDTO obtenerPersonaFDomFiscalPorId(Long cveIdPfdomFiscal) throws RuntimeException {
		DitPersonafDomFiscalDTO ditPersonafDomFiscalDTO = null;
		try {
			DitPersonafDomFiscal ditPersonafDomFiscal = bdtuDomicilioFicalServiceLocal.obtenerPersonaFDomFiscalPorId(cveIdPfdomFiscal);
			ditPersonafDomFiscalDTO = ServiceMapper.map(ditPersonafDomFiscal, DitPersonafDomFiscalDTO.class);
		} catch (Exception ex) {
			logger.info("ERROR: Al obtener PersonaFDomFiscal de una persona fisica en el servicio EJB bdtuDomicilioFicalServiceLocal.", ex);
			ditPersonafDomFiscalDTO = null;
			throw new RuntimeException("ERROR: Al obtener PersonaFDomFiscal de una persona fisica en el servicio EJB bdtuDomicilioFicalServiceLocal.", ex);
		}
		return ditPersonafDomFiscalDTO;
	}
	
	@Override
	public DitPersonafContactoDTO obtenerPersonafContacto(DitFormaContactoDTO ditFormaContactoDTO) {
		DitPersonafContactoDTO ditPersonafContactoDTO = null;
		try {
			DitPersonafContacto ditPersonafContacto = bdtuMediosContactoServiceLocal.obtenerPersonafContacto(ditFormaContactoDTO.getCveIdFormaContacto());
			ditPersonafContactoDTO = ServiceMapper.map(ditPersonafContacto, DitPersonafContactoDTO.class);
		} catch (Exception ex) {
			logger.info("ERROR: Al obtener el PersonafContacto de una persona fisica en el servicio EJB bdtuDomicilioFicalServiceLocal.", ex);
			throw new RuntimeException("ERROR: Al obtener el PersonafContacto de una persona fisica en el servicio EJB bdtuDomicilioFicalServiceLocal.", ex);
		}
		return ditPersonafContactoDTO;
	}
	
	@Override
	public DitPersonamContactoDTO obtenerPersonamContacto(DitFormaContactoDTO ditFormaContactoDTO) {
		DitPersonamContactoDTO ditPersonamContactoDTO = null;
		try {
			DitPersonamContacto ditPersonamContacto = bdtuMediosContactoServiceLocal.obtenerPersonamContacto(ditFormaContactoDTO.getCveIdFormaContacto());
			ditPersonamContactoDTO = ServiceMapper.map(ditPersonamContacto, DitPersonamContactoDTO.class);
		} catch (Exception ex) {
			logger.info("ERROR: Al obtener el PersonamContacto de una persona moral en el servicio EJB bdtuDomicilioFicalServiceLocal.", ex);
			throw new RuntimeException("ERROR: Al obtener el PersonamContacto de una persona moral en el servicio EJB bdtuDomicilioFicalServiceLocal.", ex);
		}
		return ditPersonamContactoDTO;
	}
	
	@Override
	public DitPersonafContactoDTO obtenerPersonafContactoPorId(Long cveIdPersonafContacto) {
		DitPersonafContactoDTO ditPersonafContactoDTO = null;
		try {
			DitPersonafContacto ditPersonafContacto = bdtuMediosContactoServiceLocal.obtenerPersonafContactoPorId(cveIdPersonafContacto);
			ditPersonafContactoDTO = ServiceMapper.map(ditPersonafContacto, DitPersonafContactoDTO.class);
		} catch (Exception ex) {
			logger.info("ERROR: Al obtener el PersonafContacto de una persona fisica en el servicio EJB bdtuDomicilioFicalServiceLocal.", ex);
			throw new RuntimeException("ERROR: Al obtener el PersonafContacto de una persona fisica en el servicio EJB bdtuDomicilioFicalServiceLocal.", ex);
		}
		return ditPersonafContactoDTO;
	}
	
	@Override
	public DitPersonamContactoDTO obtenerPersonamContactoPorId(Long cveIdPersonamContacto) {
		DitPersonamContactoDTO ditPersonamContactoDTO = null;
		try {
			DitPersonamContacto ditPersonamContacto = bdtuMediosContactoServiceLocal.obtenerPersonamContactoPorId(cveIdPersonamContacto);
			ditPersonamContactoDTO = ServiceMapper.map(ditPersonamContacto, DitPersonamContactoDTO.class);
		} catch (Exception ex) {
			logger.info("ERROR: Al obtener el PersonafContacto de una persona moral en el servicio EJB bdtuDomicilioFicalServiceLocal.", ex);
			throw new RuntimeException("ERROR: Al obtener el PersonafContacto de una persona moral en el servicio EJB bdtuDomicilioFicalServiceLocal.", ex);
		}
		return ditPersonamContactoDTO;
	}
	
	@Override
	public DitFormaContactoDTO obtenerFormaContactoPorId(Long cveIdFormaContacto) {
		DitFormaContactoDTO ditFormaContactoDTO = null;
		try {
			DitFormaContacto ditFormaContacto = bdtuMediosContactoServiceLocal.obtenerFormaContactoPorId(cveIdFormaContacto);
			ditFormaContactoDTO = ServiceMapper.map(ditFormaContacto, DitFormaContactoDTO.class);
		} catch (Exception ex) {
			logger.info("ERROR: Al obtener FormaContacto en el servicio EJB bdtuDomicilioFicalServiceLocal.", ex);
			throw new RuntimeException("ERROR: Al obtener FormaContacto en el servicio EJB bdtuDomicilioFicalServiceLocal.", ex);
		}
		return ditFormaContactoDTO;
	}
	
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public DitFormaContactoDTO actualizaMedioContacto(DitFormaContactoDTO ditFormaContactoDTO) {
		try {
			
			DitFormaContacto ditFormaContacto = ServiceMapper.map(ditFormaContactoDTO, DitFormaContacto.class);
			System.out.println("paso 2");
			bdtuMediosContactoServiceLocal.actualizaMedioContacto(ditFormaContacto);
			System.out.println("paso 3");
			ditFormaContactoDTO = ServiceMapper.map(ditFormaContacto, DitFormaContactoDTO.class);
		} catch (Exception ex) {
			logger.info("ERROR: Al obtener FormaContacto en el servicio EJB bdtuDomicilioFicalServiceLocal.", ex);
			throw new RuntimeException("ERROR: Al obtener FormaContacto en el servicio EJB bdtuDomicilioFicalServiceLocal.", ex);
		}
		return ditFormaContactoDTO;
	}
	
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public Persona guardarYAsociarMediosContactoPersona(Persona persona) {
		try {
			initContextBDTU();
			componentesExternosBusinessRemote = (ComponentesExternosBusinessRemote)getServiceBDTU("service.interface.componentes.externos");
			componentesExternosBusinessRemote.guardarYAsociarMediosContactoPersona(persona);
		} catch (NamingException ex) {
			logger.info("ERROR: No se pudo inicializar el InitialContext del Servicio Componente EJB componentesExternosBusinessRemote.", ex);
		} catch (Exception ex) {
			logger.info("ERROR: En el servicio componentesExternosBusinessRemote al intentar registrar medios de contacto de una persona.", ex);
		} finally {
			closeContextBDTU();
		}
		return persona;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<MedioContacto> consultarMedioDeContactoPersona(Persona persona) {
		List<MedioContacto> listMedioContactos = null;
		List<MedioContacto> listMedioContactosOrdenada = null;
		try {
			initContextBDTU();
			mediosContactoServiceBusinessRemote = (MediosContactoServiceBusinessRemote)getServiceBDTU("service.interface.medios.contacto.bdtu");
			listMedioContactos = mediosContactoServiceBusinessRemote.consultarMedioDeContactoPersona(persona);
			if (listMedioContactos != null && !listMedioContactos.isEmpty()) {
				listMedioContactosOrdenada = new ArrayList<MedioContacto>();
				TreeMap treeMap = new TreeMap();
				for (MedioContacto medioContacto : listMedioContactos) {
					treeMap.put(medioContacto.getClave(), medioContacto);
				}
				Iterator iterator = treeMap.keySet().iterator();
				while(iterator.hasNext()) {
				  Long key = (Long) iterator.next();
				  listMedioContactosOrdenada.add((MedioContacto) treeMap.get(key));
//				  System.out.println("Clave: " + key + " -> Valor: " + treeMap.get(key));
				}
			}
		} catch (NamingException ex) {
			logger.info("ERROR: No se pudo inicializar el InitialContext del Servicio Componente EJB mediosContactoServiceBusinessRemote.", ex);
		} catch (Exception ex) {
			logger.info("ERROR: En el servicio mediosContactoServiceBusinessRemote al intentar obtener los medios de contacto de una persona.", ex);
		} finally {
			closeContextBDTU();
		}
		return listMedioContactosOrdenada;
	}
	
	public static void main(String[] args) {
		try {
			BdtuServiceBusiness bdtuServiceBusiness = new BdtuServiceBusiness();
			
//			Fisica fisica = new Fisica();
//			fisica.setCurp("DUSL821218HDFRLC09");
//			fisica.setRfc("DUSL821218LN8");
			
//			fisica.setIdPersona(37472955L);
//			fisica.setCveFisica(4346775L);
			
//			fisica.setCurp("SAAC820312HDFNLS06");
//			fisica.setRfc("SAAC820312S96");
			
//			fisica.setCurp("AUSL880322MDFGNS01");
//			fisica.setRfc("AUSL8803221Z9");
			
//			fisica.setCurp("RORC841201HDFMZR01");
//			fisica.setRfc("RORC841201CS7");
			
//			fisica = (Fisica) bdtuServiceBusiness.consultarPersonaFisicaIMSSPorRFC(fisica);
//			System.out.println(fisica.getIdPersona());
			
//			fisica = (Fisica) bdtuServiceBusiness.obtenerRegistroPersonaFisicaPorRFC(fisica);
//			if (fisica.getIdPersona() != null && fisica.getCveFisica() != null) {
//				System.out.println(fisica.getIdPersona());
//			}
			
			//DOMICILIO FISCAL
//			bdtuServiceBusiness.obtenerDomicilioFiscalPersona(fisica);
//			System.out.println(fisica);
			
			// MEDIOS CONTACTO
//			bdtuServiceBusiness.obtenerMediosContactoFiscalesPersona(fisica);
//			System.out.println(fisica);
			
			// MEDIOS CONTACTO DE DIT_FORMA_CONTACTO
//			Fisica fisica = new Fisica();
//			fisica.setIdPersona(37472955L);
//			TipoPersona tipoPersona = new TipoPersona();
//			tipoPersona.setIdTipoPersona(TipoPersonaEnum.FISICA.getId());
//			fisica.setTipoPersona(tipoPersona);
//			
//			List<MedioContacto> listMedioContactosContador = bdtuServiceBusiness.consultarMedioDeContactoPersona(fisica);
			
			
			
			
//			DitDomicilioSatDTO ditDomicilioSatDTO = new DitDomicilioSatDTO();
//			ditDomicilioSatDTO.setCveIdDomicilio(93100L);
//			DitPersonafDomFiscalDTO ditPersonafDomFiscalDTO = bdtuServiceBusiness.obtenerPersonaFDomFiscal(ditDomicilioSatDTO, 4346775L);
//			System.out.println(ditPersonafDomFiscalDTO.getCveIdPfdomFiscal());
			
			Moral moral = new Moral();
			
//			moral.setRfc("GKX050526CV4");
//			moral.setRfc("BCE9603142G9");
//			moral.setRfc("AEA040812CN4");
			moral.setCveMoral(3827106L);
			
//			moral = bdtuServiceBusiness.consultarDatosBasicosPersonaMoral(moral);
//			if (moral.getCveMoral() != null) {
//				System.out.println(moral.getCveMoral());
//				System.out.println(moral.getRfc());
//				System.out.println(moral.getRazonSocial());
//			}
			
//			moral = (Moral) bdtuServiceBusiness.obtenerRegistroPersonaMoralPorRFC(moral);
//			if (moral.getCveMoral() != null) {
//				System.out.println(moral.getCveMoral());
//				System.out.println(moral.getRazonSocial());
//			}
			
			moral = bdtuServiceBusiness.buscaPersonaMoralPorId(3801325L);
			System.out.println(moral.getCveMoral());
			System.out.println(moral.getRfc());
			System.out.println(moral.getRazonSocial());
			
		} catch (Exception ex) {
			logger.info("ERROR: en el main.", ex);
		}
	}

	@Override
	public DitPersonamDomFiscalDTO obtenerPersonamDomFiscalPorIdDom(Long cveIdDomicilio) {
		DitPersonamDomFiscalDTO ditPersonamDomFiscalDTO = null;
		try {
			DitPersonamDomFiscal ditPersonamDomFiscal = bdtuDomicilioFicalServiceLocal.obtenerPersonamDomFiscalPorIdDom(cveIdDomicilio);
			ditPersonamDomFiscalDTO = ServiceMapper.map(ditPersonamDomFiscal, DitPersonamDomFiscalDTO.class);
		} catch (Exception ex) {
			logger.info("ERROR: Al obtener PersonaFDomFiscal de una persona fisica en el servicio EJB bdtuDomicilioFicalServiceLocal.", ex);
			ditPersonamDomFiscalDTO = null;
			throw new RuntimeException("ERROR: Al obtener PersonaFDomFiscal de una persona fisica en el servicio EJB bdtuDomicilioFicalServiceLocal.", ex);
		}
		return ditPersonamDomFiscalDTO;
	}
	
}
