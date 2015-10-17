package mx.gob.imss.cit.de.dictaminacion.integration.api;

import java.util.List;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.AtestiguamientoDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.AtestiguamientoDictamenDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.exception.DictamenNegocioException;


public interface ExamenIntegrator {
	
	AtestiguamientoDTO getDetalleExamenByAtestiguamiento(Long cveIdEstadoAtestiguamiento,  Long veIdAtestiguamiento)throws DictamenNegocioException;
	List<AtestiguamientoDictamenDTO> findExamenesByIdPatronDictamen(Long cveIdPatronDictamen)throws DictamenNegocioException;
	void saveExamenAtestiguamiento(AtestiguamientoDictamenDTO atestiguamientoDictamenDTO)throws DictamenNegocioException;
	
}