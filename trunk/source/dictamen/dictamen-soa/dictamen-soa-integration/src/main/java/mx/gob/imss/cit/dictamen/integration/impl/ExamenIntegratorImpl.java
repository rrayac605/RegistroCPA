package mx.gob.imss.cit.dictamen.integration.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.commons.to.domain.AtestiguamientoDictamenTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.AtestiguamientoTO;
import mx.gob.imss.cit.dictamen.integration.api.ExamenIntegrator;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.AtestiguamientoDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.AtestiguamientoDictamenDTO;
import mx.gob.imss.cit.dictamen.integration.api.exception.DictamenNegocioException;
import mx.gob.imss.cit.dictamen.integration.transformer.TransformerIntegrationUtils;
import mx.gob.imss.cit.dictamen.services.ExamenService;

import org.apache.log4j.Logger;

@Stateless
@Remote(mx.gob.imss.cit.dictamen.integration.api.ExamenIntegrator.class)
public class ExamenIntegratorImpl implements ExamenIntegrator{
	
	private Logger LOG=Logger.getLogger(ExamenIntegratorImpl.class);
	

	@EJB
	private ExamenService examenService;
	
	@Override
	public AtestiguamientoDTO getDetalleExamenByAtestiguamiento(Long examenDTO)throws DictamenNegocioException {
		AtestiguamientoDTO atestiguamientoDTO = new AtestiguamientoDTO();
		try {
			AtestiguamientoTO  atestiguamientoTO = examenService.getDetalleExamenByAtestiguamiento(examenDTO);
			atestiguamientoDTO = TransformerIntegrationUtils.transformer(atestiguamientoTO);
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
			throw new DictamenNegocioException(e.getMessage(),e);
		}
		return atestiguamientoDTO;
	}

	@Override
	public List<AtestiguamientoDictamenDTO> findExamenesByIdPatronDictamen(Long cveIdPatronDictamen) throws DictamenNegocioException {
		List<AtestiguamientoDictamenDTO> listAtestiguamientoDictamenDTO = new ArrayList<AtestiguamientoDictamenDTO>();
		List<AtestiguamientoDictamenTO> atestiguamientoDictamenTOList = new ArrayList<AtestiguamientoDictamenTO>();
		try {
			atestiguamientoDictamenTOList = examenService.findExamenByIdPatronDictamen(cveIdPatronDictamen);
			for( AtestiguamientoDictamenTO atestiguamientoDictamenTO:atestiguamientoDictamenTOList){
				AtestiguamientoDictamenDTO atestiguamientoDictamenDTO = new AtestiguamientoDictamenDTO();	
				atestiguamientoDictamenDTO = TransformerIntegrationUtils.transformer(atestiguamientoDictamenTO);
				listAtestiguamientoDictamenDTO.add(atestiguamientoDictamenDTO);
			}
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
			throw new DictamenNegocioException(e.getMessage(),e);
		}

		return listAtestiguamientoDictamenDTO;
	}


}
