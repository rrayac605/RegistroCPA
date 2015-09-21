/**
 * 
 */
package mx.gob.imss.cit.dictamen.services.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.domain.PatronDictamenTO;
import mx.gob.imss.cit.dictamen.model.NdtPatronDictamenDO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtPatronDictamenDAO;
import mx.gob.imss.cit.dictamen.services.PatronDictamenService;
import mx.gob.imss.cit.dictamen.services.transformer.TransformerServiceUtils;

/**
 * @author ajfuentes
 *
 */

@Stateless
public class PatronDictamenServiceImpl implements PatronDictamenService {

	@EJB
	private NdtPatronDictamenDAO ndtPatronDictamenDAO;
	
	@Override
	public void saveDictamen(PatronDictamenTO dictamen) throws DictamenException{
		
		
		NdtPatronDictamenDO ndtPatronDictamenDO=TransformerServiceUtils.transformer(dictamen);
		
		
		ndtPatronDictamenDAO.create(ndtPatronDictamenDO);
		
	}

}
