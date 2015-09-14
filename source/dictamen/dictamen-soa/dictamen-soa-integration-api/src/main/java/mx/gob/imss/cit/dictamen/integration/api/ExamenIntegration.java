package mx.gob.imss.cit.dictamen.integration.api;

import java.util.List;

import javax.ejb.Remote;

import mx.gob.imss.cit.dictamen.integration.api.dto.ExamenDTO;


public interface ExamenIntegration {
	public List<ExamenDTO> findExamen();
}
