/**
 * 
 */
package mx.gob.imss.cit.dictamen.services;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.domain.TipoDictamenTO;

/**
 * @author ajfuentes
 *
 */

@Local
public interface TipoDictamenService {
	
	List<TipoDictamenTO>  findAll() throws DictamenException;
}
