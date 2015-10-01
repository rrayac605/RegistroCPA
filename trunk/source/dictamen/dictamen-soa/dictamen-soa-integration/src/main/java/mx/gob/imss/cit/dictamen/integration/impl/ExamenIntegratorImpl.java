package mx.gob.imss.cit.dictamen.integration.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.commons.to.domain.AtestiguamientoDictamenTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.AtestiguamientoTO;
import mx.gob.imss.cit.dictamen.integration.api.ExamenIntegrator;
import mx.gob.imss.cit.dictamen.integration.api.dto.AtestiguamientoDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.ExamenDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.PreguntaDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.RespuestaDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.RubroDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.TipoPreguntaDTO;
import mx.gob.imss.cit.dictamen.integration.api.exception.DictamenNegocioException;
import mx.gob.imss.cit.dictamen.integration.transformer.TransformerIntegrationUtils;
import mx.gob.imss.cit.dictamen.services.ExamenService;
import mx.gob.imss.cit.dictamen.services.transformer.TransformerServiceUtils;

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
	public List<ExamenDTO> findExamenesByIdPatronDictamen(Long cveIdPatronDictamen) throws DictamenNegocioException {
		
		List<ExamenDTO> cuestionarios = new ArrayList<ExamenDTO>();
		List<AtestiguamientoDictamenTO> atestiguamientoDictamenTOList = new ArrayList<AtestiguamientoDictamenTO>();
		
		try {
			atestiguamientoDictamenTOList = examenService.findExamenByIdPatronDictamen(cveIdPatronDictamen);			
			for( AtestiguamientoDictamenTO atestiguamientoDictamenTO:atestiguamientoDictamenTOList){
				
				ExamenDTO examen = new ExamenDTO();				
				examen.setClave(atestiguamientoDictamenTO.getCveIdAtestiguamiento().getCveIdAtestiguamiento());
				examen.setNombre(atestiguamientoDictamenTO.getCveIdAtestiguamiento().getDesAtestiguamiento());
				examen.setEstado(atestiguamientoDictamenTO.getCveIdEstadoAtestiguamiento().getDesEstadoAtestiguamiento());
				cuestionarios.add(examen);
			}
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
			throw new DictamenNegocioException(e.getMessage(),e);
		
		}

		return cuestionarios;
	}


}
