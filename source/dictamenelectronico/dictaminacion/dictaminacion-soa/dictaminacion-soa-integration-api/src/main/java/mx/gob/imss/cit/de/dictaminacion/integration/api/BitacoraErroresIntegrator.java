/**
 * 
 */
package mx.gob.imss.cit.de.dictaminacion.integration.api;

import java.util.List;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.BitacoraErroresDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.exception.DictamenNegocioException;

/**
 * @author ajfuentes
 *
 */


public interface BitacoraErroresIntegrator {

	List<BitacoraErroresDTO> findByIdCargaDocumento(Long idCargaDocumento) throws DictamenNegocioException;
}
