/**
 * 
 */
package mx.gob.imss.cit.de.dictaminacion.services;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.commons.exception.DictamenException;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.BitacoraErroresTO;

/**
 * @author ajfuentes
 *
 */

@Local
public interface BitacoraErroresService {
	
	List<BitacoraErroresTO>  findByIdCargaDocumento(Long idCarga) throws DictamenException;
}
