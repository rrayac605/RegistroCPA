package mx.gob.imss.cit.dictamen.integration.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.dictamen.commons.to.domain.AtestiguamientoDictamenTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.AtestiguamientoTO;
import mx.gob.imss.cit.dictamen.integration.api.ExamenIntegrator;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.AtestiguamientoDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.AtestiguamientoDictamenDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.EstadoAtestiguamientoDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.PatronDictamenDTO;
import mx.gob.imss.cit.dictamen.integration.api.exception.DictamenNegocioException;
import mx.gob.imss.cit.dictamen.integration.transformer.TransformerIntegrationUtils;
import mx.gob.imss.cit.dictamen.services.ExamenService;

@Stateless
@Remote(mx.gob.imss.cit.dictamen.integration.api.ExamenIntegrator.class)
public class ExamenIntegratorImpl implements ExamenIntegrator{
	
	private Logger LOG=Logger.getLogger(ExamenIntegratorImpl.class);
	

	@EJB
	private ExamenService examenService;
	
	@Override
	public AtestiguamientoDTO getDetalleExamenByAtestiguamiento(Long atestiguamiento)throws DictamenNegocioException {
		AtestiguamientoDTO atestiguamientoDTO = null;
		try {
			AtestiguamientoTO  atestiguamientoTO = examenService.getDetalleExamenByAtestiguamiento(atestiguamiento);
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
	public void getSaveExamenAtestiguamiento(AtestiguamientoDTO atestiguamientoDTO, PatronDictamenDTO patronDictamenDTO ) 
			throws DictamenNegocioException {
		EstadoAtestiguamientoDTO estadoAtestiguamientoDTO = null;
		try {
			AtestiguamientoDictamenDTO atestiguamientoDictamenDTO= new AtestiguamientoDictamenDTO();
			atestiguamientoDictamenDTO.setCveIdAtestiguamiento(atestiguamientoDTO);
			atestiguamientoDictamenDTO.setCveIdPatronDictamen(patronDictamenDTO);
			atestiguamientoDictamenDTO.setCveIdEstadoAtestiguamiento(estadoAtestiguamientoDTO);
			AtestiguamientoDictamenTO atestiguamientoDictamenTO = TransformerIntegrationUtils.transformer(atestiguamientoDictamenDTO);
			examenService.saveExamenAtestiguamiento(atestiguamientoDictamenTO);
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
			throw new DictamenNegocioException(e.getMessage(),e);
		}
	}

}
