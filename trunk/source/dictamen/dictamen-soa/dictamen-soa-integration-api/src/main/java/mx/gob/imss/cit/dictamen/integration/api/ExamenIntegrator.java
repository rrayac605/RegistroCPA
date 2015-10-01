package mx.gob.imss.cit.dictamen.integration.api;

import java.util.List;

import mx.gob.imss.cit.dictamen.integration.api.dto.AtestiguamientoDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.ExamenDTO;
import mx.gob.imss.cit.dictamen.integration.api.exception.DictamenNegocioException;


public interface ExamenIntegrator {
	
	AtestiguamientoDTO getDetalleExamenByAtestiguamiento(Long examenDTO)throws DictamenNegocioException;
	List<ExamenDTO> findExamenesByIdPatronDictamen(Long cveIdPatronDictamen)throws DictamenNegocioException ;
}
