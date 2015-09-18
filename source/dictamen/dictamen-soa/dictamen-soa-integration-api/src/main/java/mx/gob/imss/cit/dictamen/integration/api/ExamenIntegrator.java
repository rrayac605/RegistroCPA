package mx.gob.imss.cit.dictamen.integration.api;

import java.util.List;

import mx.gob.imss.cit.dictamen.integration.api.dto.ExamenDTO;
import mx.gob.imss.cit.dictamen.integration.api.exception.DictamenNegocioException;


public interface ExamenIntegrator {
	
	ExamenDTO getDetalleExamen(ExamenDTO examen)throws DictamenNegocioException;
	List<ExamenDTO> findExamenes()throws DictamenNegocioException ;
}
