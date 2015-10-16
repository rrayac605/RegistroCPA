package mx.gob.imss.cit.de.dictaminacion.services;

import mx.gob.imss.cit.de.dictaminacion.commons.exception.DictamenException;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.CedulaPrestacionesTO;

public interface CedulaPrestacionesService {
	CedulaPrestacionesTO saveCedulaPrestaciones() throws DictamenException;
}
