package mx.gob.imss.cit.dictamen.integration.impl;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.integration.api.FirmaElectronicaIntegrator;
import mx.gob.imss.cit.dictamen.integration.api.dto.FirmaElectronicaDTO;
import mx.gob.imss.cit.dictamen.integration.api.exception.DictamenNegocioException;
import mx.gob.imss.cit.dictamen.integration.transformer.TransformerIntegrationUtils;
import mx.gob.imss.cit.dictamen.services.FirmaElectronicaService;



/**
 * Clase de integracion para la firma electronica
 * @author ajfuentes
 *
 */
@Remote({mx.gob.imss.cit.dictamen.integration.api.FirmaElectronicaIntegrator.class})
@Stateless
public class FirmaElectronicaIntegratorImpl implements FirmaElectronicaIntegrator {

	@EJB
	private FirmaElectronicaService firmaElectronicaService;
	
	/**
	 * metodo de integracion para la firma electronica
	 */
	@Override
	public FirmaElectronicaDTO executeInitFirmaElectronica() throws DictamenNegocioException {
		FirmaElectronicaDTO dto=null;
			
		 try {
			dto= TransformerIntegrationUtils.transformer(firmaElectronicaService.executeInitFirmaElectronica());
		} catch (DictamenException e) {
			throw new DictamenNegocioException(e.getMessage(), e);
		}
		 
		 return dto;
	}

}
