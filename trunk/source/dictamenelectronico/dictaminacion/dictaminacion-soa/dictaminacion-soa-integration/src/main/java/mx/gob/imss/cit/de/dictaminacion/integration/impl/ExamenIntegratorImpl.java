package mx.gob.imss.cit.de.dictaminacion.integration.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.AtestiguamientoDictamenTO;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.AtestiguamientoTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.ExamenIntegrator;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.AtestiguamientoDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.AtestiguamientoDictamenDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.exception.DictamenNegocioException;
import mx.gob.imss.cit.de.dictaminacion.integration.transformer.TransformerIntegrationUtils;
import mx.gob.imss.cit.de.dictaminacion.services.ExamenService;

@Stateless
@Remote(mx.gob.imss.cit.de.dictaminacion.integration.api.ExamenIntegrator.class)
public class ExamenIntegratorImpl implements ExamenIntegrator{
	
	private Logger LOG=Logger.getLogger(ExamenIntegratorImpl.class);
	

	@EJB
	private ExamenService examenService;
	
	@Override
	public AtestiguamientoDTO getDetalleExamenByAtestiguamiento(Long cveIdEstadoAtestiguamiento, Long cveIdAtestiguamiento)throws DictamenNegocioException {
		AtestiguamientoDTO  atestiguamientoDTO = new AtestiguamientoDTO();
		AtestiguamientoTO atestiguamientoTO = new AtestiguamientoTO();
		try {
		    atestiguamientoTO = examenService.getDetalleExamenByAtestiguamiento(cveIdEstadoAtestiguamiento, cveIdAtestiguamiento);
			atestiguamientoDTO = TransformerIntegrationUtils.transformer(atestiguamientoTO);
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
			throw new DictamenNegocioException(e.getMessage(),e);
		}
		return atestiguamientoDTO;
	}

	@Override
	public List<AtestiguamientoDictamenDTO> findExamenesByIdPatronDictamen(Long cveIdPatronDictamen) throws DictamenNegocioException {
		List<AtestiguamientoDictamenDTO> atestiguamientoDictamenDTOList = new ArrayList<AtestiguamientoDictamenDTO>();
		List<AtestiguamientoDictamenTO> atestiguamientoDictamenTOList = new ArrayList<AtestiguamientoDictamenTO>();
		try {
			atestiguamientoDictamenTOList = examenService.findExamenByIdPatronDictamen(cveIdPatronDictamen);
			for( AtestiguamientoDictamenTO atestiguamientoDictamenTO:atestiguamientoDictamenTOList){
				AtestiguamientoDictamenDTO atestiguamientoDictamenDTO = new AtestiguamientoDictamenDTO();	
				atestiguamientoDictamenDTO = TransformerIntegrationUtils.transformer(atestiguamientoDictamenTO);
				atestiguamientoDictamenDTOList.add(atestiguamientoDictamenDTO);
			}
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
			throw new DictamenNegocioException(e.getMessage(),e);
		}

		return atestiguamientoDictamenDTOList;
	}

	@Override
	public void saveExamenAtestiguamiento(AtestiguamientoDictamenDTO atestiguamientoDictamenDTO) 
			throws DictamenNegocioException {
			System.out.println("Examen Integrator DTO\n atestiguamiento Dictamen:" + atestiguamientoDictamenDTO.getCveIdAtestigDictamen()+
			   " patron ditactamen: "+atestiguamientoDictamenDTO.getCveIdPatronDictamen().getCveIdPatronDictamen()+
			   " tamanio: "+atestiguamientoDictamenDTO.getNdtRubrosAtestiguamiento().size() );
		try {
			AtestiguamientoDictamenTO atestiguamientoDictamenTO = TransformerIntegrationUtils.transformer(atestiguamientoDictamenDTO);
			System.out.println("Examen Integrator TO \n atestiguamiento Dictamen:" + atestiguamientoDictamenTO.getCveIdAtestigDictamen()+
					   " patron ditactamen: "+atestiguamientoDictamenTO.getCveIdPatronDictamen().getCveIdPatronDictamen()+
					   " tamanio: "+atestiguamientoDictamenTO.getNdtRubrosAtestiguamiento().size());
			examenService.saveExamenAtestiguamiento(atestiguamientoDictamenTO);
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
			throw new DictamenNegocioException(e.getMessage(),e);
		}
	}

}
