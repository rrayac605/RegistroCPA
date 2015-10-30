package mx.gob.imss.cit.de.dictaminacion.services;

import java.util.List;

import mx.gob.imss.cit.de.dictaminacion.commons.exception.DictamenException;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.AtestiguamientoDictamenTO;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.AtestiguamientoTO;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.CargaDocumentoTO;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public interface CargaArchivosService {
	boolean registraCargaArchivos(CargaDocumentoTO cargaArchivosTO) throws DictamenException;
	boolean registraAtestiguamientoDictamen(AtestiguamientoDictamenTO atestiguamientoTO) throws DictamenException;
	AtestiguamientoTO getAtestiguamientoByIdAseveracion(Long idAseveracion) throws DictamenException;

	List<CargaDocumentoTO> findListadoAseveraciones(Long cveIdPatronDictamen, Long cveIdCpa, String desRfc)
			throws DictamenException;
}

