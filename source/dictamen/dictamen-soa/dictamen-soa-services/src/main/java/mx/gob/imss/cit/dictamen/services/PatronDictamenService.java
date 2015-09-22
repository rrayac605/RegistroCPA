/**
 * 
 */
package mx.gob.imss.cit.dictamen.services;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.domain.PatronDictamenTO;

/**
 * @author ajfuentes
 *
 */

@Local
public interface PatronDictamenService {
	
	PatronDictamenTO saveDictamen(PatronDictamenTO dictamen) throws DictamenException;

}
