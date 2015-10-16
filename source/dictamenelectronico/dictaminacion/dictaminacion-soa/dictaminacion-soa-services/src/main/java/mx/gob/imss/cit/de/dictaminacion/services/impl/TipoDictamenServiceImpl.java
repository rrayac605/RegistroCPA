/**
 * 
 */
package mx.gob.imss.cit.de.dictaminacion.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import mx.gob.imss.cit.de.dictaminacion.commons.enums.DictamenExceptionCodeEnum;
import mx.gob.imss.cit.de.dictaminacion.commons.exception.DictamenException;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.TipoDictamenTO;
import mx.gob.imss.cit.de.dictaminacion.model.NdcTipoDictamenDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdcTipoDictamenDAO;
import mx.gob.imss.cit.de.dictaminacion.services.TipoDictamenService;
import mx.gob.imss.cit.de.dictaminacion.services.transformer.TransformerServiceUtils;
import mx.gob.imss.cit.de.dictaminacion.services.util.DictamenExceptionBuilder;

import org.apache.log4j.Logger;

/**
 * @author ajfuentes
 *
 */

@Stateless
public class TipoDictamenServiceImpl implements TipoDictamenService {

	
	private static final Logger LOG=Logger.getLogger(TipoDictamenServiceImpl.class);
	
	@EJB
	private NdcTipoDictamenDAO ndcTipoDictamenDAO;

 
	@Override
	public List<TipoDictamenTO> findAll() throws DictamenException {
		
		List<NdcTipoDictamenDO> listaDO=null;
		List<TipoDictamenTO> listaTO=new ArrayList<TipoDictamenTO>();
		
		try{
			
			listaDO=ndcTipoDictamenDAO.findAll();
			
			for (NdcTipoDictamenDO ndcTipoDictamenDO : listaDO) {
				listaTO.add(TransformerServiceUtils.transformer(ndcTipoDictamenDO));
			}
			
		}catch(Exception e){
			LOG.error(e.getMessage(),e);
			throw DictamenExceptionBuilder.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_TIPO_DICTAMEN_FIND,e);
		}
		return listaTO;
	}

}
