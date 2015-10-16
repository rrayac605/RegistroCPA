/**
 * 
 */
package mx.gob.imss.cit.dictamen.integration.api;

import java.util.List;

import mx.gob.imss.cit.dictamen.integration.api.dto.domain.TipoDictamenDTO;
import mx.gob.imss.cit.dictamen.integration.api.exception.DictamenNegocioException;

/**
 * @author ajfuentes
 *
 */


public interface TipoDictamenIntegrator {

	List<TipoDictamenDTO> findAll() throws DictamenNegocioException;
}
