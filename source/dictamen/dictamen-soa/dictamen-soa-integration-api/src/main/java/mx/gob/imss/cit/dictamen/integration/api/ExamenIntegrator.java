package mx.gob.imss.cit.dictamen.integration.api;

import java.util.List;

import mx.gob.imss.cit.dictamen.integration.api.dto.ExamenDTO;


public interface ExamenIntegrator {
	
	ExamenDTO getDetalleExamen(ExamenDTO examen);
	List<ExamenDTO> findExamenes() ;
}
