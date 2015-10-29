package mx.gob.imss.distss.dictamen.contador.integration.impl;



import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.dictamen.contador.commons.to.domain.CedulaTO;
import mx.gob.imss.cit.dictamen.contador.commons.to.domain.ContadorPublicoTO;
import mx.gob.imss.cit.dictamen.contador.commons.to.domain.PersonaMedioContactoTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.ContadorPublicoIntegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.ContadorPublicoDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DatosPersonalesDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DomicilioDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DomicilioFiscalDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.MediosContactoDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.PersonaDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.PersonaMoralDTO;
import mx.gob.imss.cit.dictamen.contador.model.NdtContadorPublicoAutDO;
import mx.gob.imss.cit.dictamen.contador.model.NdtR1DatosPersonalesDO;
import mx.gob.imss.cit.dictamen.contador.services.BdtuService;
import mx.gob.imss.cit.dictamen.contador.services.MedioContadorService;
import mx.gob.imss.cit.dictamen.contador.services.SatService;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Fisica;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Moral;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Persona;
/**
 * Session Bean implementation class ContadorPublicoServiceBusiness
 */
@Stateless(name = "contadorPublicoIntegrator", mappedName = "contadorPublicoIntegrator")
@Remote({ContadorPublicoIntegrator.class})
public class ContadorPublicoIntegratorImpl implements ContadorPublicoIntegrator {
	private static final Logger LOGGER=Logger.getLogger(ContadorPublicoIntegratorImpl.class);


	@EJB(name="bdtuService", mappedName="bdtuService")
	private BdtuService bdtuService;
	
	@EJB(name="satService", mappedName="satService")
	private SatService satService;

	@EJB(name="consultaMedioContacto", mappedName="consultaMedioContacto")
	private MedioContadorService medioContadorService;


    public PersonaMoralDTO consultarPersonaMoralPorRFC(String rfc){
	PersonaMoralDTO personaMoralDTO = null;
		Moral moral  = satService.buscarPersonaMoralPorRfc(rfc);
		
		DomicilioFiscalDTO domicilioDTO = null;

		if(moral!=null && moral.getDomicilioFiscal()!=null){
			personaMoralDTO = new PersonaMoralDTO();
			domicilioDTO = new DomicilioFiscalDTO();
			domicilioDTO.setCalle(moral.getDomicilioFiscal().getCalle());
		    LOGGER.info("ContadorPublicoIntegrator.Calle="+moral.getDomicilioFiscal().getCalle());
		    domicilioDTO.setNumeroExterior(moral.getDomicilioFiscal().getNumExterior1());
		    domicilioDTO.setLetraExterior(moral.getDomicilioFiscal().getNumExteriorAlf());
		    domicilioDTO.setNumeroInterior(moral.getDomicilioFiscal().getNumInterior());
		    domicilioDTO.setLetraInterior(moral.getDomicilioFiscal().getNumInteriorAlf());

		    domicilioDTO.setEntreCalle(moral.getDomicilioFiscal().getVialidadReferenciaPrimaria().getNombre());
		    domicilioDTO.setyCalle(moral.getDomicilioFiscal().getVialidadReferenciaSecundaria().getNombre());
		    domicilioDTO.setColoniaAsentamiento(moral.getDomicilioFiscal().getColonia());
		    domicilioDTO.setLocalidad(moral.getDomicilioFiscal().getAsentamiento().getLocalidad().getNombre());
		
		    domicilioDTO.setCveEntidadFederativa(moral.getDomicilioFiscal().getAsentamiento().getLocalidad().getMunicipio().getEntidadFederativa().getClave());
		    domicilioDTO.setEntidadFederativa(moral.getDomicilioFiscal().getAsentamiento().getLocalidad().getMunicipio().getEntidadFederativa().getNombre());
		    domicilioDTO.setMunicipioDelegacion(moral.getDomicilioFiscal().getAsentamiento().getLocalidad().getMunicipio().getNombre());
		    domicilioDTO.setCodigoPostal(moral.getDomicilioFiscal().getCodigoPostal().getCodigoPostal());
		    
		    personaMoralDTO.setRfc(moral.getRfc());
		    personaMoralDTO.setRazonSocial(moral.getRazonSocial());

		    personaMoralDTO.setDomicilioFiscalDTO(domicilioDTO);  
		}
		
		return personaMoralDTO;
	}

	public DomicilioFiscalDTO consultarDomicilioPorRFC(String rfc){
		
		Fisica fisica  = satService.buscarPersonaFisicaPorRfc(rfc);
		
		DomicilioFiscalDTO domicilioDTO = null;

		if(fisica!=null && fisica.getDomicilioFiscal()!=null){
			domicilioDTO = new DomicilioFiscalDTO();
			domicilioDTO.setCalle(fisica.getDomicilioFiscal().getCalle());
		    LOGGER.info("ContadorPublicoIntegrator.Calle="+fisica.getDomicilioFiscal().getCalle());
		    domicilioDTO.setNumeroExterior(fisica.getDomicilioFiscal().getNumExterior1());
		    domicilioDTO.setLetraExterior(fisica.getDomicilioFiscal().getNumExteriorAlf());
		    domicilioDTO.setNumeroInterior(fisica.getDomicilioFiscal().getNumInterior());
		    domicilioDTO.setLetraInterior(fisica.getDomicilioFiscal().getNumInteriorAlf());

		    domicilioDTO.setEntreCalle(fisica.getDomicilioFiscal().getVialidadReferenciaPrimaria().getNombre());
		    domicilioDTO.setyCalle(fisica.getDomicilioFiscal().getVialidadReferenciaSecundaria().getNombre());
		    domicilioDTO.setColoniaAsentamiento(fisica.getDomicilioFiscal().getColonia());
		    domicilioDTO.setLocalidad(fisica.getDomicilioFiscal().getAsentamiento().getLocalidad().getNombre());
		
		    domicilioDTO.setCveEntidadFederativa(fisica.getDomicilioFiscal().getAsentamiento().getLocalidad().getMunicipio().getEntidadFederativa().getClave());
		    domicilioDTO.setEntidadFederativa(fisica.getDomicilioFiscal().getAsentamiento().getLocalidad().getMunicipio().getEntidadFederativa().getNombre());
		    domicilioDTO.setMunicipioDelegacion(fisica.getDomicilioFiscal().getAsentamiento().getLocalidad().getMunicipio().getNombre());
		    domicilioDTO.setCodigoPostal(fisica.getDomicilioFiscal().getCodigoPostal().getCodigoPostal());
		}
		
		return domicilioDTO;
	}
	
	@Override
	public ContadorPublicoDTO consultarContadorPublicAut(Long idPersona) {
		ContadorPublicoDTO contadorPublicoAutDTO = null;
		LOGGER.info("consultarContadorPublicAut="+idPersona);
		ContadorPublicoTO contadorPublicoTO = bdtuService.obtenerContadorPorIdPersona(idPersona);
		if(contadorPublicoTO!=null){
			contadorPublicoAutDTO = new ContadorPublicoDTO();
			contadorPublicoAutDTO.setNumRegistroCPA(contadorPublicoTO.getNumRegistroCPA());
			contadorPublicoAutDTO.setCveIdEstadoCPA(contadorPublicoTO.getCveIdEstadoCPA());	
		
		}
		return contadorPublicoAutDTO;
	}
	@Override
	public List<DatosPersonalesDTO> consultarCedulaPorIdPersona(Long idPersona){
		List<DatosPersonalesDTO> lstNdtContadorPublicoAutDO = new ArrayList<DatosPersonalesDTO>();
		List<CedulaTO> lstCedulaTO=  bdtuService.obtenerCedulaPorIdPersona(idPersona);
		
		LOGGER.info("Integrator.ndtContadorPublicoAutDO="+lstCedulaTO.size());
		
		for(CedulaTO cedulaTO : lstCedulaTO){
			DatosPersonalesDTO datosPersonalesDTO = new DatosPersonalesDTO();
			datosPersonalesDTO.setFechaExpedicionCedula(cedulaTO.getFechaExpedicionCedula());
			datosPersonalesDTO.setInstitucionCedula(cedulaTO.getInstitucionCedula());
			datosPersonalesDTO.setNumeroCedula(cedulaTO.getNumeroCedula());
			lstNdtContadorPublicoAutDO.add(datosPersonalesDTO);
		}
		
        return lstNdtContadorPublicoAutDO;
	}

	
	public ContadorPublicoIntegratorImpl() {
	}


	

	public BdtuService getBdtuService() {
		return bdtuService;
	}

	public void setBdtuService(BdtuService bdtuService) {
		this.bdtuService = bdtuService;
	}


	public SatService getSatService() {
		return satService;
	}

	public void setSatService(SatService satService) {
		this.satService = satService;
	}

@Override
	public List<MediosContactoDTO> obtenerMediosContactoPorIdPersona(
			Long idPersona) {
		List<PersonaMedioContactoTO> contactos = medioContadorService.consultarMedioContacto(idPersona);
		List<MediosContactoDTO> mediosContacto = new ArrayList<MediosContactoDTO>();
		if(contactos != null && !contactos.isEmpty()){
			for(PersonaMedioContactoTO contacto:contactos){
				MediosContactoDTO medioContacto = new MediosContactoDTO();
				medioContacto.setDescripcion(contacto.getDescripcion());
				medioContacto.setFechaAlta(contacto.getFechaAlta());
				medioContacto.setIdPersonaFContacto(contacto.getIdPersonafContacto());
				medioContacto.setMedioContacto(contacto.getIdMedioContacto());
				mediosContacto.add(medioContacto);
				medioContacto = null;
			}
		}
		return mediosContacto;
	}
	
		/**
	 * @return the medioContadorService
	 */
	public MedioContadorService getMedioContadorService() {
		return medioContadorService;
	}

	/**
	 * @param medioContadorService the medioContadorService to set
	 */
	public void setMedioContadorService(MedioContadorService medioContadorService) {
		this.medioContadorService = medioContadorService;
	}
}

/*

	@Override
	public PersonaDTO verificarContadorPublico(String curp, String rfc) {
		
		LOGGER.info("Integrator.curp="+curp);
		LOGGER.info("Integrator.rfc="+rfc);

		PersonaDTO personaDTO = null;
		Fisica personaFisica = new Fisica();
		personaFisica.setRfc(rfc);
		personaFisica.setCurp(curp);
		Persona persona  = bdtuService.obtenerFisicaPorPersona(personaFisica);
		if (persona.getIdPersona() != null) {
			Fisica fisica = (Fisica)persona;
			if( fisica.getCveFisica() != null){
				
				personaDTO = new PersonaDTO();
				personaDTO.setCurp(fisica.getCurp());
				personaDTO.setNombre(fisica.getNombre());
				personaDTO.setApellidoPaterno(fisica.getPrimerApellido());
				personaDTO.setApellidoMaterno(fisica.getSegundoApellido());
				personaDTO.setNombreCompleto(fisica.getNombreCompleto());
				personaDTO.setFechaNacimiento(fisica.getFechaNacimiento());
				personaDTO.setIdSexo(fisica.getSexo().getIdSexo());
				personaDTO.setRfc(fisica.getRfc());
				
				LOGGER.info("fisica.toString="+fisica.toString());
				if(fisica.getCorreoElectronico()!=null){
				  personaDTO.setCorreoElectronico(fisica.getCorreoElectronico().getCorreo());
				}
				if(fisica.getTelefonoFijo()!=null){
				  personaDTO.setTelefono(fisica.getTelefonoFijo().getNumero());
				}
				LOGGER.info("ContadorPublicoIntegrator.antes.idPersona="+fisica.getIdPersona());
				personaDTO.setIdPersona(fisica.getIdPersona());
				ContadorPublicoDTO contadorPublicoAutDTO = new ContadorPublicoDTO();
				
				DomicilioFiscalDTO domicilioDTO = new DomicilioFiscalDTO();
				if(fisica.getDomicilioFiscal()!=null){
				domicilioDTO.setCalle(fisica.getDomicilioFiscal().getCalle());
				LOGGER.info("ContadorPublicoIntegrator.Calle="+fisica.getDomicilioFiscal().getCalle());
				domicilioDTO.setNumeroExterior(fisica.getDomicilioFiscal().getNumExterior1());
				domicilioDTO.setLetraExterior(fisica.getDomicilioFiscal().getNumExteriorAlf());
				domicilioDTO.setNumeroInterior(fisica.getDomicilioFiscal().getNumInterior());
				domicilioDTO.setLetraInterior(fisica.getDomicilioFiscal().getNumInteriorAlf());

				domicilioDTO.setEntreCalle(fisica.getDomicilioFiscal().getVialidadReferenciaPrimaria().getNombre());
				domicilioDTO.setyCalle(fisica.getDomicilioFiscal().getVialidadReferenciaSecundaria().getNombre());
				domicilioDTO.setColoniaAsentamiento(fisica.getDomicilioFiscal().getColonia());
				domicilioDTO.setLocalidad(fisica.getDomicilioFiscal().getAsentamiento().getLocalidad().getNombre());
				
				domicilioDTO.setEntidadFederativa(fisica.getDomicilioFiscal().getAsentamiento().getLocalidad().getMunicipio().getEntidadFederativa().getNombre());
				domicilioDTO.setMunicipioDelegacion(fisica.getDomicilioFiscal().getAsentamiento().getLocalidad().getMunicipio().getNombre());
				domicilioDTO.setCodigoPostal(fisica.getDomicilioFiscal().getCodigoPostal().getCodigoPostal());
				}
				contadorPublicoAutDTO.setDomicilioFiscalDTO(domicilioDTO);
				personaDTO.setContadorPublicoAutDTO(contadorPublicoAutDTO);
			}
		}
		return personaDTO;
	}
	*/
