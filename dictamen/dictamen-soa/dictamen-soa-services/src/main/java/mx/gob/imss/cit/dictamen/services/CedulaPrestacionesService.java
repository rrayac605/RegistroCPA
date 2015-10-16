package mx.gob.imss.cit.dictamen.services;

import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.domain.CedulaPrestacionesTO;

public interface CedulaPrestacionesService {
	CedulaPrestacionesTO saveCedulaPrestaciones() throws DictamenException;
}
