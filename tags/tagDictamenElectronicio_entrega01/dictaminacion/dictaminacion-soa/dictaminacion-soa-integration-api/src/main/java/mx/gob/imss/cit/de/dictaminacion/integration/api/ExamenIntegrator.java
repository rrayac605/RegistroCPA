package mx.gob.imss.cit.de.dictaminacion.integration.api;

import java.util.List;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.AtestiguamientoDictamenDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.exception.DictamenNegocioException;


public interface ExamenIntegrator {
	
	AtestiguamientoDictamenDTO getDetalleExamenByAtestiguamiento(AtestiguamientoDictamenDTO atestiguamientoDictamenDTO)throws DictamenNegocioException;
	List<AtestiguamientoDictamenDTO> findExamenesByIdPatronDictamen(Long cveIdPatronDictamen)throws DictamenNegocioException;
	void saveExamenAtestiguamiento(AtestiguamientoDictamenDTO atestiguamientoDictamenDTO)throws DictamenNegocioException;
	
}
