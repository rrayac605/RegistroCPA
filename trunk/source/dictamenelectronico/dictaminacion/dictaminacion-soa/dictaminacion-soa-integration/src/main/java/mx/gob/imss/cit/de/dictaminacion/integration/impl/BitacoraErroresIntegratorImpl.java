package mx.gob.imss.cit.de.dictaminacion.integration.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.de.dictaminacion.commons.exception.DictamenException;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.BitacoraErroresTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.BitacoraErroresIntegrator;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.BitacoraErroresDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.exception.DictamenNegocioException;
import mx.gob.imss.cit.de.dictaminacion.integration.transformer.TransformerIntegrationUtils;
import mx.gob.imss.cit.de.dictaminacion.services.BitacoraErroresService;

@Remote({BitacoraErroresIntegrator.class})
@Stateless
public class BitacoraErroresIntegratorImpl implements BitacoraErroresIntegrator {
	
	

	private static final Logger LOG=Logger.getLogger(BitacoraErroresIntegratorImpl.class);
	
	@EJB
	private BitacoraErroresService bitacoraErroresService;

	@Override
	public List<BitacoraErroresDTO> findByIdCargaDocumento(Long idCarga) throws DictamenNegocioException{

		List<BitacoraErroresDTO> listaDTO=new ArrayList<BitacoraErroresDTO>();
		try {
			
			List<BitacoraErroresTO> tos=bitacoraErroresService.findByIdCargaDocumento(idCarga);
			
			for (BitacoraErroresTO to : tos) {
				listaDTO.add(TransformerIntegrationUtils.transformer(to));
			}
			
		} catch (DictamenException e) {
			LOG.error(e.getMessage(),e);
			throw new DictamenNegocioException(e.getMessage(), e);
		}
		
		return listaDTO;

	}

}
