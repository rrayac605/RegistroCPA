package mx.gob.imss.cit.dictamen.contador.integration.api;

import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DocumentoBovedaDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.exception.DictamenContadorNegocioException;

public interface BovedaIntegrator {
	void guardarDocumento(DocumentoBovedaDTO documentoBovedaDTO) throws DictamenContadorNegocioException ;
	DocumentoBovedaDTO obtenerDocumento(DocumentoBovedaDTO documentoBovedaDTO) throws DictamenContadorNegocioException ;

}
