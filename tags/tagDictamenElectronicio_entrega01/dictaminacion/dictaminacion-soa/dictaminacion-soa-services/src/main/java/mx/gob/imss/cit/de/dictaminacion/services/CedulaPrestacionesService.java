package mx.gob.imss.cit.de.dictaminacion.services;

import java.util.List;

import mx.gob.imss.cit.de.dictaminacion.commons.exception.DictamenException;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.CedulaPrestacionesTO;

public interface CedulaPrestacionesService {
	List<CedulaPrestacionesTO> findCedulaPrestaciones(Long cveIdPatronDictamen,
			Long cveIdAtestiguamiento) throws DictamenException;
}
