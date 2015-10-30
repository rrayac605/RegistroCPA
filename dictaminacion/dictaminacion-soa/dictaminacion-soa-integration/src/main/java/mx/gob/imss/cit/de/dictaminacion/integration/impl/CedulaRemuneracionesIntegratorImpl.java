package mx.gob.imss.cit.de.dictaminacion.integration.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import mx.gob.imss.cit.de.dictaminacion.commons.exception.DictamenException;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.CedulaRemuneracionesTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.CedulaRemuneracionesIntegrator;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.CedulaRemuneracionesDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.exception.DictamenNegocioException;
import mx.gob.imss.cit.de.dictaminacion.integration.transformer.TransformerIntegrationUtils;
import mx.gob.imss.cit.de.dictaminacion.services.CedulaRemuneracionesService;

import org.apache.log4j.Logger;

@Remote(mx.gob.imss.cit.de.dictaminacion.integration.api.CedulaRemuneracionesIntegrator.class)
@Stateless
public class CedulaRemuneracionesIntegratorImpl implements CedulaRemuneracionesIntegrator{

	private static final Logger LOG=Logger.getLogger(CedulaRemuneracionesIntegratorImpl.class);

	@EJB
	private CedulaRemuneracionesService cedulaRemuneracionesService;

	@Override
	public List<CedulaRemuneracionesDTO> obtenerCedulaRemuneraciones()
			throws DictamenNegocioException {
		
		
		List<CedulaRemuneracionesDTO> listaDTO =null;
		try {
			
			List<CedulaRemuneracionesTO> listaTO = cedulaRemuneracionesService.obtenerCedulaRemuneraciones(361L);
			
			for (CedulaRemuneracionesTO cedulaRemuneracionesTO : listaTO) {
				if (listaDTO == null) {
					listaDTO = new ArrayList<CedulaRemuneracionesDTO>();
				}
				listaDTO.add(TransformerIntegrationUtils.transformer(cedulaRemuneracionesTO));
			}
		} catch (DictamenException e) {
			LOG.error(e.getMessage(), e);
			throw new DictamenNegocioException(e.getMessage(), e);
		}
		
		return listaDTO;
	}

	@Override
	public void saveCedulaRemuneraciones(List<CedulaRemuneracionesDTO> cedulasRemuneraciones)
			throws DictamenNegocioException {
		
		
		try {
			List<CedulaRemuneracionesTO> cedulaRemuneracionesTOLista=new ArrayList<CedulaRemuneracionesTO>();
			for(int i=0;i<cedulasRemuneraciones.size();i++){
				
				
				cedulaRemuneracionesTOLista.add(TransformerIntegrationUtils.transformer(cedulasRemuneraciones.get(i)));
			}
			
			cedulaRemuneracionesService.saveCedulaRemuneraciones(cedulaRemuneracionesTOLista);
			
		} catch (DictamenException e) {
			LOG.error(e.getMessage(), e);
			throw new DictamenNegocioException(e.getMessage(), e);
		}
		
	}
	

}
