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
		
		NdtPatronDictamenDO ndtPatronDictamenDO=new NdtPatronDictamenDO();
		ndtPatronDictamenDAO.create(ndtPatronDictamenDO);
		
	}

}
