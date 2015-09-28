package mx.gob.imss.cit.dictamen.integration.impl;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.commons.to.domain.ContadorPublicoAutTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.PatronDictamenTO;
import mx.gob.imss.cit.dictamen.integration.api.PatronDictamenIntegrator;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.ContadorPublicoAutDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.PatronDictamenDTO;
import mx.gob.imss.cit.dictamen.integration.api.exception.DictamenNegocioException;
import mx.gob.imss.cit.dictamen.integration.transformer.TransformerIntegrationUtils;
import mx.gob.imss.cit.dictamen.services.PatronDictamenService;

import org.apache.log4j.Logger;

@Remote({mx.gob.imss.cit.dictamen.integration.api.PatronDictamenIntegrator.class})
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
	public void executeActualizar(PatronDictamenDTO datosDTO,
			ContadorPublicoAutDTO contador) throws DictamenNegocioException {
		// TODO Auto-generated method stub
		
	}



}
