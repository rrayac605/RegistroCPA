package mx.gob.imss.cit.dictamen.services;

import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.KeyTO;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public interface KeyGeneratorService {
	String getKey(KeyTO keyTO) throws DictamenException;
}

