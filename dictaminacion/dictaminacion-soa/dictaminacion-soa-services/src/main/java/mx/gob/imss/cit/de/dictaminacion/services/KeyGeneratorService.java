package mx.gob.imss.cit.de.dictaminacion.services;

import mx.gob.imss.cit.de.dictaminacion.commons.exception.DictamenException;
import mx.gob.imss.cit.de.dictaminacion.commons.to.KeyTO;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public interface KeyGeneratorService {
	String getKey(KeyTO keyTO) throws DictamenException;
}

