/**
 * 
 */
package mx.gob.imss.cit.dictamen.integration.api;

import java.util.List;

import mx.gob.imss.cit.dictamen.integration.api.dto.domain.EjercicioFiscalDTO;
import mx.gob.imss.cit.dictamen.integration.api.exception.DictamenNegocioException;

/**
 * @author ajfuentes
 *
 */


public interface EjercicioFiscalIntegrator {

	List<EjercicioFiscalDTO> findAll() throws DictamenNegocioException;
}
