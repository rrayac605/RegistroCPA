package mx.gob.imss.cit.de.dictaminacion.services;

import mx.gob.imss.cit.de.dictaminacion.commons.exception.DictamenException;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.CedulaRemuneracionesTO;

public interface CedulaRemuneracionesService {
	CedulaRemuneracionesTO saveCedulaRemuneraciones () throws DictamenException;
}
