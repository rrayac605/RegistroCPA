/**
 * 
 */
package mx.gob.imss.cit.dictamen.services;

import java.util.Date;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.AWSPolicyTO;

/**
 * @author ajfuentes
 *
 */

@Local
public interface AWSService {
	
	AWSPolicyTO getAwsPoliciyEncrypted(Date fechaFirma,String rutaDestino) throws DictamenException;
	
}
