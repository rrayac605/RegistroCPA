/**
 * 
 */
package mx.gob.imss.cit.de.dictaminacion.services;

import java.util.Date;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.commons.exception.DictamenException;
import mx.gob.imss.cit.de.dictaminacion.commons.to.AWSPolicyTO;

/**
 * @author ajfuentes
 *
 */

@Local
public interface AWSService {
	
	AWSPolicyTO getAwsPoliciyEncrypted(Date fechaFirma,String rutaDestino) throws DictamenException;
	
}
