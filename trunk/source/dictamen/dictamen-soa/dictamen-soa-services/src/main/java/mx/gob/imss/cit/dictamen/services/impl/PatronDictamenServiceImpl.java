/**
 * 
 */
package mx.gob.imss.cit.dictamen.services.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.commons.enums.DictamenExceptionCodeEnum;
import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.domain.PatronDictamenTO;
import mx.gob.imss.cit.dictamen.commons.util.ValidatorUtil;
import mx.gob.imss.cit.dictamen.model.NdtPatronDictamenDO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtPatronDictamenDAO;
import mx.gob.imss.cit.dictamen.services.PatronDictamenService;
import mx.gob.imss.cit.dictamen.services.transformer.TransformerServiceUtils;
import mx.gob.imss.cit.dictamen.services.util.DictamenExceptionBuilder;

import org.apache.log4j.Logger;

/**
 * @author ajfuentes
 *
 */

@Stateless
public class PatronDictamenServiceImpl implements PatronDictamenService {

	
	private static final Logger LOG=Logger.getLogger(PatronDictamenServiceImpl.class);
	
	@EJB
	private NdtPatronDictamenDAO ndtPatronDictamenDAO;
	
	@Override
	public PatronDictamenTO saveDictamen(PatronDictamenTO dictamen) throws DictamenException{
		
		PatronDictamenTO dictamenResultado=null;
		if(dictamen==null){
			LOG.error("el dictamen llego nulo");
			throw DictamenExceptionBuilder.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_DATOS_PATRONALES_PARAM_NULL);
		}
		
		try{
						
			NdtPatronDictamenDO ndtPatronDictamenDO=TransformerServiceUtils.transformer(dictamen);						
			ndtPatronDictamenDAO.create(ndtPatronDictamenDO);
			dictamenResultado=TransformerServiceUtils.transformer(ndtPatronDictamenDO);	
			
		}catch(Exception e){
			LOG.error(e.getMessage(),e);
			throw DictamenExceptionBuilder.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_DATOS_PATRONALES_GUARDAR,e);
		}
		
		return dictamenResultado;
	
		
	}

	@Override
	public PatronDictamenTO getDictamenByRfcPatronAndIdContador(String rfc,
			Long contador) throws DictamenException {
		
		PatronDictamenTO dictamenTO=null;
		if(ValidatorUtil.isAnyNull(rfc,contador)){
			
		}
		try{									
			List<NdtPatronDictamenDO> listaDO=ndtPatronDictamenDAO.findByRfcPatronAndIdContador(rfc, contador);
		
			if(listaDO!=null && !listaDO.isEmpty()){
				dictamenTO=TransformerServiceUtils.transformer(listaDO.get(0));
			}
			
		}catch(Exception e){
			LOG.error(e.getMessage(),e);
			throw DictamenExceptionBuilder.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_DATOS_PATRONALES_GUARDAR,e);
		}
		
		return dictamenTO;
	}

}
