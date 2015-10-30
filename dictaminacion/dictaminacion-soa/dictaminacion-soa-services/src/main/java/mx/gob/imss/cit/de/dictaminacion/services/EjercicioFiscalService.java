/**
 * 
 */
package mx.gob.imss.cit.de.dictaminacion.services;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.commons.exception.DictamenException;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.EjercicioFiscalTO;

/**
 * @author ajfuentes
 *
 */

@Local
public interface EjercicioFiscalService {
	
	List<EjercicioFiscalTO>  findAll() throws DictamenException;
	
	EjercicioFiscalTO obtenerEjercicioFiscalActual(List<EjercicioFiscalTO> ejercicios)throws DictamenException;
}
