package mx.gob.imss.cit.dictamen.services;

import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.domain.CargaAseveracionesTO;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public interface CargaArchivosService {
	boolean registraCargaArchivos(CargaAseveracionesTO cargaArchivosTO) throws DictamenException;
}

