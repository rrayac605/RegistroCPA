package mx.gob.imss.distss.dictamen.contador.integration.impl;



import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.dictamen.contador.integration.api.ContadorPublicoIntegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.ContadorPublicoDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DomicilioDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.PersonaDTO;
import mx.gob.imss.cit.dictamen.contador.model.NdtContadorPublicoAutDO;
import mx.gob.imss.cit.dictamen.contador.services.BdtuService;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Fisica;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Persona;
/**
 * Session Bean implementation class ContadorPublicoServiceBusiness
 */
@Stateless(name = "contadorPublicoIntegrator", mappedName = "contadorPublicoIntegrator")
@Remote(ContadorPublicoIntegrator.class)
public class ContadorPublicoIntegratorImpl implements ContadorPublicoIntegrator {
	private static final Logger LOGGER=Logger.getLogger(ContadorPublicoIntegratorImpl.class);


	@EJB
	private BdtuService bdtuService;
	

 
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
				
				DomicilioDTO domicilioDTO = new DomicilioDTO();
				if(fisica.getDomicilioFiscal()!=null){
				domicilioDTO.setCalle(fisica.getDomicilioFiscal().getCalle());
				LOGGER.info("ContadorPublicoIntegrator.Calle="+fisica.getDomicilioFiscal().getCalle());
				domicilioDTO.setNumExterior(fisica.getDomicilioFiscal().getNumExterior1().toString());
				domicilioDTO.setLetraExterior(fisica.getDomicilioFiscal().getNumExteriorAlf());
				domicilioDTO.setNumInterior(fisica.getDomicilioFiscal().getNumInterior().toString());
				domicilioDTO.setLetraInterior(fisica.getDomicilioFiscal().getNumInteriorAlf());

				domicilioDTO.setEntreCalle(fisica.getDomicilioFiscal().getVialidadReferenciaPrimaria().getNombre());
				domicilioDTO.setyCalle(fisica.getDomicilioFiscal().getVialidadReferenciaSecundaria().getNombre());
				domicilioDTO.setColonia(fisica.getDomicilioFiscal().getColonia());
				domicilioDTO.setLocalidad(fisica.getDomicilioFiscal().getAsentamiento().getLocalidad().getNombre());
				
				domicilioDTO.setEntidad(fisica.getDomicilioFiscal().getAsentamiento().getLocalidad().getMunicipio().getEntidadFederativa().getNombre());
				domicilioDTO.setMunicipio(fisica.getDomicilioFiscal().getAsentamiento().getLocalidad().getMunicipio().getNombre());
				domicilioDTO.setCodigoPostal(fisica.getDomicilioFiscal().getCodigoPostal().getCodigoPostal());
				}
				contadorPublicoAutDTO.setDomicilioDTO(domicilioDTO);
				personaDTO.setContadorPublicoAutDTO(contadorPublicoAutDTO);
			}
		}
		return personaDTO;
	}

	@Override
	public ContadorPublicoDTO consultarContadorPublicAut(Long idPersona) {
		ContadorPublicoDTO contadorPublicoAutDTO = null;
		LOGGER.info("consultarContadorPublicAut="+idPersona);
		NdtContadorPublicoAutDO ndtContadorPublicoAutDO = bdtuService.obtenerContadorPorIdPersona(idPersona);
		if(ndtContadorPublicoAutDO!=null){
			contadorPublicoAutDTO = new ContadorPublicoDTO();
			contadorPublicoAutDTO.setNumRegistroCPA(ndtContadorPublicoAutDO.getNumRegistroCpa());
			contadorPublicoAutDTO.setCveIdEstadoCPA(ndtContadorPublicoAutDO.getCveIdEstadoCpa().getCveIdEstadoCpa());	
		}
		return contadorPublicoAutDTO;
	}


	public ContadorPublicoIntegratorImpl() {
	}
	
	


}
