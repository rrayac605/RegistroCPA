package mx.gob.imss.cit.dictamen.integration.api;

import java.util.List;

import mx.gob.imss.cit.dictamen.integration.api.dto.domain.AtestiguamientoDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.AtestiguamientoDictamenDTO;
import mx.gob.imss.cit.dictamen.integration.api.exception.DictamenNegocioException;


public interface ExamenIntegrator {
	
	AtestiguamientoDTO getDetalleExamenByAtestiguamiento(Long examenDTO)throws DictamenNegocioException;
	List<AtestiguamientoDictamenDTO> findExamenesByIdPatronDictamen(Long cveIdPatronDictamen)throws DictamenNegocioException ;
}