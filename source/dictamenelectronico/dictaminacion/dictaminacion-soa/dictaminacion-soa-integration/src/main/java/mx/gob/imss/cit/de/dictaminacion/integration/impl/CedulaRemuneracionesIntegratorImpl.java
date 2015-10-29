package mx.gob.imss.cit.de.dictaminacion.integration.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import mx.gob.imss.cit.de.dictaminacion.commons.exception.DictamenException;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.CedulaRemuneracionesTO;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.PatronDictamenTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.CedulaRemuneracionesIntegrator;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.CedulaRemuneracionesDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.PatronDictamenDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.exception.DictamenNegocioException;
import mx.gob.imss.cit.de.dictaminacion.integration.transformer.TransformerIntegrationUtils;
import mx.gob.imss.cit.de.dictaminacion.services.CedulaRemuneracionesService;
import mx.gob.imss.cit.de.dictaminacion.services.transformer.TransformerServiceUtils;

import org.apache.log4j.Logger;

@Remote(mx.gob.imss.cit.de.dictaminacion.integration.api.CedulaRemuneracionesIntegrator.class)
@Stateless
public class CedulaRemuneracionesIntegratorImpl implements CedulaRemuneracionesIntegrator{

	private static final Logger LOG=Logger.getLogger(CedulaRemuneracionesIntegratorImpl.class);

	@EJB
	private CedulaRemuneracionesService cedulaRemuneracionesService;

	@Override
	public Map<CedulaRemuneracionesDTO, List<CedulaRemuneracionesDTO>> generarCedulaRemuneraciones(PatronDictamenDTO patronDictamenDTO)
			throws DictamenNegocioException {
		
		Map<CedulaRemuneracionesDTO, List<CedulaRemuneracionesDTO>> mapaCedulasDTO=new HashMap<CedulaRemuneracionesDTO, List<CedulaRemuneracionesDTO>>();
		List<CedulaRemuneracionesDTO> listaDTO =null;
		try {
			PatronDictamenTO patronDictamenTO=TransformerIntegrationUtils.transformer(patronDictamenDTO);
			
			Map<CedulaRemuneracionesTO, List<CedulaRemuneracionesTO>> mapaTO = cedulaRemuneracionesService.generarCedulaRemuneraciones(patronDictamenTO);
			
//			for (CedulaRemuneracionesTO cedulaRemuneracionesTO : mapaTO) {
//				if (listaDTO == null) {
//					listaDTO = new ArrayList<CedulaRemuneracionesDTO>();
//				}
//				
//				
//				
//				listaDTO.add(TransformerIntegrationUtils.transformer(cedulaRemuneracionesTO));
//			}
		} catch (DictamenException e) {
			LOG.error(e.getMessage(), e);
			throw new DictamenNegocioException(e.getMessage(), e);
		}
		
		return mapaCedulasDTO;
	}

	@Override
	public void saveCedulaRemuneraciones(Map<CedulaRemuneracionesDTO, List<CedulaRemuneracionesDTO>> cedulasRemuneraciones)
			throws DictamenNegocioException {

		
		try {
			List<CedulaRemuneracionesTO> cedulaRemuneracionesTOLista=new ArrayList<CedulaRemuneracionesTO>();
			Map<CedulaRemuneracionesTO, List<CedulaRemuneracionesTO>> cedulasRemuneracionesMap=new HashMap<CedulaRemuneracionesTO, List<CedulaRemuneracionesTO>>();
			for(int i=0;i<cedulasRemuneraciones.size();i++){
				
				
				//cedulaRemuneracionesTOLista.add(TransformerIntegrationUtils.transformer(cedulasRemuneraciones.get(i)));
			}
			
			cedulaRemuneracionesService.saveCedulaRemuneraciones(cedulasRemuneracionesMap);
			
		} catch (DictamenException e) {
			LOG.error(e.getMessage(), e);
			throw new DictamenNegocioException(e.getMessage(), e);
		}
		
	}

	@Override
	public Map<CedulaRemuneracionesDTO, List<CedulaRemuneracionesDTO>> obtenerCedulaRemuneraciones(
			PatronDictamenDTO patronDictamenDTO) throws DictamenNegocioException {
		Map<CedulaRemuneracionesDTO, List<CedulaRemuneracionesDTO>> cedulasRemuneneraciones;
		
		try{
			PatronDictamenTO patronDictamenTO=TransformerIntegrationUtils.transformer(patronDictamenDTO);
			Map<CedulaRemuneracionesTO, List<CedulaRemuneracionesTO>> mapaTO = cedulaRemuneracionesService.obtenerCedulaRemuneraciones(patronDictamenTO);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}


	
	

}
