package mx.gob.imss.distss.dictamen.contador.integration.impl;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mx.gob.imss.cit.dictamen.contador.commons.exception.DictamenContadorWebServiceException;
import mx.gob.imss.cit.dictamen.contador.integration.api.ContadorReporteIntegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.DictamenIntegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.PersonaMoralBDTUDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.exception.DictamenContadorNegocioException;
import mx.gob.imss.cit.dictamen.contador.services.ContadorReporteService;
import mx.gob.imss.cit.dictamen.contador.services.DictamenInterfaceService;
import mx.gob.imss.cit.dictamen.contador.services.impl.ContadorReporteServiceImpl;
import mx.gob.imss.cit.dictamen.servicios.ws.serviciosbdtu.ConsultaPersonaMoralResponse;


@Stateless(name = "dictamenIntegrator", mappedName = "dictamenIntegrator")
@Remote({DictamenIntegrator.class})
public class DictamenIntegratorImpl implements DictamenIntegrator {
	private static final Logger LOGGER = LoggerFactory.getLogger(DictamenIntegratorImpl.class);


	@EJB(name="dictamenInterfaceService", mappedName="dictamenInterfaceService")
	private DictamenInterfaceService dictamenInterfaceService;
	

	@Override
	public PersonaMoralBDTUDTO consultarPersonaMoralPorRFC(String rfc)
			throws DictamenContadorNegocioException {
		ConsultaPersonaMoralResponse consultaPersonaMoralResponse = null;
		PersonaMoralBDTUDTO personaMoralBDTUDTO = null;
		try {
			LOGGER.info("dictamenInterfaceService="+rfc);
			consultaPersonaMoralResponse =dictamenInterfaceService.consultarPersonalMoral(rfc);
			if(consultaPersonaMoralResponse.getReturn()!=null&&consultaPersonaMoralResponse.getReturn().getPersonaMoral()!=null){
				
				personaMoralBDTUDTO = new PersonaMoralBDTUDTO();
				personaMoralBDTUDTO.setRfc(consultaPersonaMoralResponse.getReturn().getPersonaMoral().getRfc());
				personaMoralBDTUDTO.setRazonSocial(consultaPersonaMoralResponse.getReturn().getPersonaMoral().getRfc());
				personaMoralBDTUDTO.setIdPersona(consultaPersonaMoralResponse.getReturn().getPersonaMoral().getIdPersona());
			}else{
			  LOGGER.info("dictamenInterfaceService.consultaPersonaMoralResponse.ISNULL");
			}
		
		} catch (DictamenContadorWebServiceException e) {
			LOGGER.info(e.getMessage(),e);
   throw new DictamenContadorNegocioException(e.getMessage(),e);
   
		}
		return personaMoralBDTUDTO;
	}
	
	public DictamenInterfaceService getDictamenInterfaceService() {
		return dictamenInterfaceService;
	}

	public void setDictamenInterfaceService(
			DictamenInterfaceService dictamenInterfaceService) {
		this.dictamenInterfaceService = dictamenInterfaceService;
	}


}
