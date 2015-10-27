package mx.gob.imss.cit.de.dictaminacion.services;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.commons.exception.DictamenException;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.CedulaRemuneracionesTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.CedulaRemuneracionesDTO;

@Local
public interface CedulaRemuneracionesService {
	
	/**
	 * 
	 * @param idPatronDictamen
	 * @return
	 */
	List<CedulaRemuneracionesTO> obtenerCedulaRemuneraciones(Long idPatronDictamen);

	/**
	 * 
	 * @param cedulasRemuneraciones
	 * @return
	 * @throws DictamenException
	 */
	void saveCedulaRemuneraciones(List<CedulaRemuneracionesTO> cedulasRemuneraciones)throws DictamenException;
}
