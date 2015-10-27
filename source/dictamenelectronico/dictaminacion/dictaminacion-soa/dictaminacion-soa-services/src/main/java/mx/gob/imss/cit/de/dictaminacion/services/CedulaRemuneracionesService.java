package mx.gob.imss.cit.de.dictaminacion.services;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.commons.exception.DictamenException;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.CedulaRemuneracionesTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.CedulaRemuneracionesDTO;

@Local
public interface CedulaRemuneracionesService {
	CedulaRemuneracionesTO saveCedulaRemuneraciones () throws DictamenException;
	


	List<CedulaRemuneracionesTO> obtenerCedulaRemuneraciones(Long idPatronDictamen);
}
