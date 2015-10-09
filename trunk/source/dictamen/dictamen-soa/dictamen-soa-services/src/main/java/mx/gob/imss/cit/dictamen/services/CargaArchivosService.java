package mx.gob.imss.cit.dictamen.services;

import java.util.List;

import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.domain.CargaDocumentoTO;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public interface CargaArchivosService {
	boolean registraCargaArchivos(CargaDocumentoTO cargaArchivosTO) throws DictamenException;

	List<CargaDocumentoTO> findListadoAseveraciones(Long cveIdPatronDictamen, Long cveIdCpa, String desRfc)
			throws DictamenException;
}

