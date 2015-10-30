/**
 * 
 */
package mx.gob.imss.cit.de.dictaminacion.services;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.commons.exception.DictamenException;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.ContadorPublicoAutTO;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.PatronAsociadoTO;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.PatronDictamenTO;

/**
 * @author ajfuentes
 *
 */

@Local
public interface PatronDictamenService {
	
	PatronDictamenTO saveDictamen(PatronDictamenTO dictamen,ContadorPublicoAutTO contador) throws DictamenException;
	PatronDictamenTO getDictamenByRfcPatronAndIdContador(String rfc, Long contador) throws DictamenException;
	PatronDictamenTO updateDictamen(PatronDictamenTO dictamen) throws DictamenException;
	List<PatronAsociadoTO> savePatronesAsociados(List<PatronAsociadoTO> listPatronAsociadoTO) throws DictamenException;
	List<PatronAsociadoTO> findPatronesAsociados(PatronDictamenTO patronDictamenTO) throws DictamenException;

}
