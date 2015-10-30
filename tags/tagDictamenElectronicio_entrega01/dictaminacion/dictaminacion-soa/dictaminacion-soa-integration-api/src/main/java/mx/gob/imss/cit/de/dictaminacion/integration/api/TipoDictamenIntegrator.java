/**
 * 
 */
package mx.gob.imss.cit.de.dictaminacion.integration.api;

import java.util.List;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.TipoDictamenDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.exception.DictamenNegocioException;

/**
 * @author ajfuentes
 *
 */


public interface TipoDictamenIntegrator {

	List<TipoDictamenDTO> findAll() throws DictamenNegocioException;
}
