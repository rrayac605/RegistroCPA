package mx.gob.imss.cit.dictamen.integration.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.BovedaDocumentoTO;
import mx.gob.imss.cit.dictamen.integration.api.BovedaIntegration;
import mx.gob.imss.cit.dictamen.integration.api.dto.BovedaActorDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.BovedaBaseObjectDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.BovedaDocumentoDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.BovedaHeaderDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.BovedaTramiteDTO;
import mx.gob.imss.cit.dictamen.integration.api.exception.DictamenNegocioException;
import mx.gob.imss.cit.dictamen.integration.transformer.TransformerIntegrationUtils;
import mx.gob.imss.cit.dictamen.services.BovedaService;


/**
 * 
 * 
 * @author ajfuentes
 * 
 */
@Stateless
public class BovedaIntegrationImpl implements BovedaIntegration{
	
	@EJB
	private BovedaService bovedaService;

	@Override
	public boolean createDocument(BovedaDocumentoDTO documento,
			BovedaTramiteDTO tramite, BovedaActorDTO actor,
			BovedaHeaderDTO header, String isEncripted) throws DictamenNegocioException{
		
		boolean res=false;
		try{
			res=bovedaService.createDocument(
					TransformerIntegrationUtils.transformer(documento),
					TransformerIntegrationUtils.transformer(tramite),
					TransformerIntegrationUtils.transformer(actor),
					TransformerIntegrationUtils.transformer(header),
											isEncripted);
		}catch(DictamenException e){
			throw new DictamenNegocioException(e);
		}
		return res;
	}

	@Override
	public BovedaDocumentoDTO getDocument(BovedaActorDTO actor,
			BovedaTramiteDTO tramite, BovedaHeaderDTO header,
			BovedaBaseObjectDTO baseObject) throws DictamenNegocioException{

		BovedaDocumentoDTO res=null;
		try{
			BovedaDocumentoTO to=bovedaService.getDocument(		
					TransformerIntegrationUtils.transformer(actor),
					TransformerIntegrationUtils.transformer(tramite),	
					TransformerIntegrationUtils.transformer(header),
					TransformerIntegrationUtils.transformer(baseObject)
											);
			
			res=TransformerIntegrationUtils.transformer(to);
			
		}catch(DictamenException e){
			throw new DictamenNegocioException(e);
		}
		return res;
		
	}

}

