package mx.gob.imss.cit.dictamen.services;


import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.domain.AtestiguamientoDictamenTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.AtestiguamientoTO;

@Local
public interface ExamenService {
	
	public List<AtestiguamientoDictamenTO> findExamenByIdPatronDictamen(Long cveIdPatronDictamen)throws DictamenException;
	public AtestiguamientoTO getDetalleExamenByAtestiguamiento(Long cveIdAtestiguamiento)throws DictamenException;
	
}
