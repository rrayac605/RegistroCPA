package mx.gob.imss.cit.de.dictaminacion.services;

import java.util.List;
import java.util.Map;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.commons.exception.DictamenException;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.CedulaRemuneracionesTO;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.PatronDictamenTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.CedulaRemuneracionesDTO;

@Local
public interface CedulaRemuneracionesService {
	
	/**
	 * 
	 * @param idPatronDictamen
	 * @return
	 */
	Map<CedulaRemuneracionesTO, List<CedulaRemuneracionesTO>> obtenerCedulaRemuneraciones(PatronDictamenTO patronDictamenTO)throws DictamenException;
	
	/**
	 * 
	 * @param patronDictamenTO
	 * @return
	 */
	Map<CedulaRemuneracionesTO, List<CedulaRemuneracionesTO>> generarCedulaRemuneraciones(PatronDictamenTO patronDictamenTO)throws DictamenException;

	/**
	 * 
	 * @param cedulasRemuneraciones
	 * @return
	 * @throws DictamenException
	 */
	void saveCedulaRemuneraciones(Map<CedulaRemuneracionesTO, List<CedulaRemuneracionesTO>> cedulasRemuneraciones)throws DictamenException;
}
