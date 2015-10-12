package mx.gob.imss.cit.dictamen.services;

import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.domain.CedulaRemuneracionesTO;

public interface CedulaRemuneracionesService {
	CedulaRemuneracionesTO saveCedulaRemuneraciones () throws DictamenException;
}
