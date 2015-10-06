package mx.gob.imss.cit.dictamen.integration.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.domain.TipoDictamenTO;
import mx.gob.imss.cit.dictamen.integration.api.TipoDictamenIntegrator;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.TipoDictamenDTO;
import mx.gob.imss.cit.dictamen.integration.api.exception.DictamenNegocioException;
import mx.gob.imss.cit.dictamen.integration.transformer.TransformerIntegrationUtils;
import mx.gob.imss.cit.dictamen.services.TipoDictamenService;

import org.apache.log4j.Logger;

@Remote({TipoDictamenIntegrator.class})
@Stateless
public class TipoDictamenIntegratorImpl implements TipoDictamenIntegrator {
	
	

	private static final Logger LOG=Logger.getLogger(TipoDictamenIntegratorImpl.class);
	
	@EJB
	private TipoDictamenService tipoDictamenService;

	@Override
	public List<TipoDictamenDTO> findAll() throws DictamenNegocioException{

		List<TipoDictamenDTO> listaDTO=new ArrayList<TipoDictamenDTO>();
		try {
			
			List<TipoDictamenTO> ejercicioFiscalTOs=tipoDictamenService.findAll();
			
			for (TipoDictamenTO to : ejercicioFiscalTOs) {
				listaDTO.add(TransformerIntegrationUtils.transformer(to));
			}
			
		} catch (DictamenException e) {
			LOG.error(e.getMessage(),e);
			throw new DictamenNegocioException(e.getMessage(), e);
		}
		
		return listaDTO;

	}

}
