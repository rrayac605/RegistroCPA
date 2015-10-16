package mx.gob.imss.cit.de.dictaminacion.integration.impl;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import mx.gob.imss.cit.de.dictaminacion.commons.exception.DictamenException;
import mx.gob.imss.cit.de.dictaminacion.commons.to.BovedaDocumentoTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.BovedaIntegrator;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.BovedaActorDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.BovedaBaseObjectDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.BovedaDocumentoDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.BovedaHeaderDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.BovedaTramiteDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.exception.DictamenNegocioException;
import mx.gob.imss.cit.de.dictaminacion.integration.transformer.TransformerIntegrationUtils;
import mx.gob.imss.cit.de.dictaminacion.services.BovedaService;

/**
 * 
 * 
 * @author ajfuentes
 * 
 */
@Stateless
@Remote(mx.gob.imss.cit.de.dictaminacion.integration.api.BovedaIntegrator.class)
public class BovedaIntegratorImpl implements BovedaIntegrator{
	
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

