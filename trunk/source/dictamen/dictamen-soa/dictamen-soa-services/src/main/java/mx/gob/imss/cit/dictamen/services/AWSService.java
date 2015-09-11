/**
 * 
 */
package mx.gob.imss.cit.dictamen.services;

import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.AWSPolicyTO;

/**
 * @author ajfuentes
 *
 */

public interface AWSService {
	
	AWSPolicyTO getAwsPoliciyEncrypted(String rfcContador,String rfcPatron) throws DictamenException;
	
}
