package mx.gob.imss.cit.de.dictaminacion.integration.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.ContadorPublicoAutTO;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.PatronAsociadoTO;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.PatronDictamenTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.PatronDictamenIntegrator;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.ContadorPublicoAutDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.PatronAsociadoDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.PatronDictamenDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.exception.DictamenNegocioException;
import mx.gob.imss.cit.de.dictaminacion.integration.transformer.TransformerIntegrationUtils;
import mx.gob.imss.cit.de.dictaminacion.services.PatronDictamenService;

@Remote({mx.gob.imss.cit.de.dictaminacion.integration.api.PatronDictamenIntegrator.class})
@Stateless
public class PatronDictamenIntegratorImpl implements PatronDictamenIntegrator {
	
	

	private static final Logger LOG=Logger.getLogger(PatronDictamenIntegratorImpl.class);
	
	@EJB
	private PatronDictamenService patronDictamenService;
	
	@Override
	public PatronDictamenDTO getDatosPatron(PatronDictamenDTO datosDTO,ContadorPublicoAutDTO contador) throws DictamenNegocioException{
		
		PatronDictamenDTO res=null;
		try {
			
			PatronDictamenTO patronDictamenTO=patronDictamenService.
					getDictamenByRfcPatronAndIdContador(datosDTO.getRfc(), contador.getCveIdCpa());
			
			if(patronDictamenTO!=null){
				res=TransformerIntegrationUtils.transformer(patronDictamenTO);
				LOG.info("tipo dictamen"+res.getCveIdTipoDictamen().getCveIdTipoDictamen());
			}
			
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
			throw new DictamenNegocioException(e.getMessage(), e);
		}
		
		return res;

	}

	@Override
	public void executeRegistrar(PatronDictamenDTO datosDTO,ContadorPublicoAutDTO contador) throws DictamenNegocioException{

		
		try {
			PatronDictamenTO patronDictamenTO=TransformerIntegrationUtils.transformer(datosDTO)	;			
			ContadorPublicoAutTO to=new ContadorPublicoAutTO();
			to.setCveIdCpa(contador.getCveIdCpa());
			
			patronDictamenService.saveDictamen(patronDictamenTO,to);
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
			throw new DictamenNegocioException(e.getMessage(), e);
		}

	}

	@Override
	public void executeActualizar(PatronDictamenDTO datosDTO) throws DictamenNegocioException {

		try {
			PatronDictamenTO patronDictamenTO=TransformerIntegrationUtils.transformer(datosDTO)	;			
			patronDictamenService.updateDictamen(patronDictamenTO);
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
			throw new DictamenNegocioException(e.getMessage(), e);
		}

	}

	@Override
	public List<PatronAsociadoDTO> savePatronesAsociados(List<PatronAsociadoDTO> listPatronAsociadoDTO)
			throws DictamenNegocioException {
		List<PatronAsociadoDTO> listaDTO=new ArrayList<PatronAsociadoDTO>();
		try {
			
			List<PatronAsociadoTO> listaTO=new ArrayList<PatronAsociadoTO>();
			for (PatronAsociadoDTO patronAsociadoDTO : listPatronAsociadoDTO) {
				PatronAsociadoTO patronAsociadoTO=TransformerIntegrationUtils.transformer(patronAsociadoDTO)	;			
				listaTO.add(patronAsociadoTO);
			}
			
			listaTO=patronDictamenService.savePatronesAsociados(listaTO);
			for (PatronAsociadoTO patronAsociadoTO : listaTO) {
				PatronAsociadoDTO patronAsociadoDTO=TransformerIntegrationUtils.transformer(patronAsociadoTO)	;			
				listaDTO.add(patronAsociadoDTO);
			}
			
			
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
			throw new DictamenNegocioException(e.getMessage(), e);
		}
		
		return listaDTO;
	}

	
	@Override
	public List<PatronAsociadoDTO> findPatronesAsociados(PatronDictamenDTO patronDictamenDTO)
			throws DictamenNegocioException {
		List<PatronAsociadoDTO> listaDTO=new ArrayList<PatronAsociadoDTO>();
		try {
			
			PatronDictamenTO patronDictamenTO=TransformerIntegrationUtils.transformer(patronDictamenDTO)	;	
			List<PatronAsociadoTO> listaTO=patronDictamenService.findPatronesAsociados(patronDictamenTO);
			for (PatronAsociadoTO asociadoTO : listaTO) {
				PatronAsociadoDTO patronAsociadoDTO=TransformerIntegrationUtils.transformer(asociadoTO)	;			
				listaDTO.add(patronAsociadoDTO);
			}
			
			
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
			throw new DictamenNegocioException(e.getMessage(), e);
		}
		
		return listaDTO;
	}



}
