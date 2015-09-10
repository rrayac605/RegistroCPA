package mx.gob.imss.cit.dictamen.integration.api;

import mx.gob.imss.cit.dictamen.integration.api.dto.BovedaActorDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.BovedaBaseObjectDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.BovedaDocumentoDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.BovedaHeaderDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.BovedaTramiteDTO;
import mx.gob.imss.cit.dictamen.integration.api.exception.DictamenNegocioException;

/**
 * 
 * 
 * @author ajfuentes
 * 
 */

public interface BovedaIntegration {

	boolean createDocument(BovedaDocumentoDTO documento,
			BovedaTramiteDTO tramite, BovedaActorDTO actor,
			BovedaHeaderDTO header, String isEncripted)
			throws DictamenNegocioException;

	BovedaDocumentoDTO getDocument(BovedaActorDTO actor,
			BovedaTramiteDTO tramite, BovedaHeaderDTO header,
			BovedaBaseObjectDTO baseObject)throws DictamenNegocioException;



}
