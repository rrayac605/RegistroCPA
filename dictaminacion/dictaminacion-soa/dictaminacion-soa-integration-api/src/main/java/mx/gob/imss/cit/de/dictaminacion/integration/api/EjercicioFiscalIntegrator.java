/**
 * 
 */
package mx.gob.imss.cit.de.dictaminacion.integration.api;

import java.util.List;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.EjercicioFiscalDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.exception.DictamenNegocioException;

/**
 * @author ajfuentes
 *
 */


public interface EjercicioFiscalIntegrator {

	List<EjercicioFiscalDTO> findAll() throws DictamenNegocioException;
	
	EjercicioFiscalDTO obtenerEjercicioFiscalActual(List<EjercicioFiscalDTO> ejercicios)throws DictamenNegocioException;
	
}
