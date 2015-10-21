package mx.gob.imss.cit.de.dictaminacion.services;


import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.commons.exception.DictamenException;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.AtestiguamientoDictamenTO;

@Local
public interface ExamenService {
	
	public List<AtestiguamientoDictamenTO> findExamenByIdPatronDictamen(Long cveIdPatronDictamen)throws DictamenException;
	public AtestiguamientoDictamenTO getDetalleExamenByAtestiguamiento(AtestiguamientoDictamenTO atestiguamientoDictamenTO)throws DictamenException;
	public void saveExamenAtestiguamiento(AtestiguamientoDictamenTO atestiguamientoDictamenTO)throws DictamenException;
}
