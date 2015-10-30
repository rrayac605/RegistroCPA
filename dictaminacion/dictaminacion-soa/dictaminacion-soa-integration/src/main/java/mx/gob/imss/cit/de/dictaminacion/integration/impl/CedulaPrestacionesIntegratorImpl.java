package mx.gob.imss.cit.de.dictaminacion.integration.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.CedulaPrestacionesTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.CedulaPrestacionesIntegrator;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.CedulaPrestacionesDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.PrestacionesDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.exception.DictamenNegocioException;
import mx.gob.imss.cit.de.dictaminacion.services.CedulaPrestacionesService;

import org.apache.log4j.Logger;

@Remote(mx.gob.imss.cit.de.dictaminacion.integration.api.CedulaPrestacionesIntegrator.class)
@Stateless
public class CedulaPrestacionesIntegratorImpl implements CedulaPrestacionesIntegrator{
private static final Logger LOG = Logger.getLogger(CargaArchivosIntegratorImpl.class);
	
	@EJB
	CedulaPrestacionesService cedulaPrestacionesService;

	@Override
	public List<CedulaPrestacionesDTO> obtenerCedulaPrestaciones(Long cveIdPatronDictamen, Long cveIdAtestiguamiento) throws DictamenNegocioException {
		
		List<CedulaPrestacionesDTO> cedulaPrestacionesDTOLista = new ArrayList<CedulaPrestacionesDTO>();
		List<CedulaPrestacionesTO> cedulaPrestacionesTOLista = new ArrayList<CedulaPrestacionesTO>();
		
		try{
			cedulaPrestacionesTOLista = cedulaPrestacionesService.findCedulaPrestaciones(cveIdPatronDictamen, 2L);
			//interaccion con service 
			for(CedulaPrestacionesTO cedulaPrestacionesTO: cedulaPrestacionesTOLista){	
				
				CedulaPrestacionesDTO cedulaPrestacionesDTO = new CedulaPrestacionesDTO();
				cedulaPrestacionesDTO.setCveIdCedulaPrestaciones(cedulaPrestacionesTO.getCveIdCedulaPrestaciones());
				System.out.println("valores de setCveIdCedulaPrestaciones: "  +  cedulaPrestacionesTO.getCveIdCedulaPrestaciones());
				cedulaPrestacionesDTO.setImpImportePrestacion(cedulaPrestacionesTO.getImpImportePrestacion());
				System.out.println("valore de setImpImportePrestacion: " + cedulaPrestacionesTO.getImpImportePrestacion());

				
				PrestacionesDTO prestacionesDTO = new PrestacionesDTO();
				prestacionesDTO.setCveIdPrestaciones(cedulaPrestacionesTO.getCveIdPrestaciones().getCveIdPrestaciones());
				prestacionesDTO.setDesPrestaciones(cedulaPrestacionesTO.getCveIdPrestaciones().getDesPrestaciones());
				System.out.println("si transforma dto" + cedulaPrestacionesTO.getCveIdPrestaciones().getDesPrestaciones());

				cedulaPrestacionesDTO.setCveIdPrestaciones(prestacionesDTO);

				cedulaPrestacionesDTOLista.add(cedulaPrestacionesDTO);
			}
			
		}catch (Exception e) {
			LOG.error(e.getMessage(), e);
			throw new DictamenNegocioException(e.getMessage(),e);
		}
		return cedulaPrestacionesDTOLista;

	}

}

