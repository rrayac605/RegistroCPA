/**
 * 
 */
package mx.gob.imss.cit.dictamen.services;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.domain.EjercicioFiscalTO;

/**
 * @author ajfuentes
 *
 */

@Local
public interface EjercicioFiscalService {
	
	List<EjercicioFiscalTO>  findAll() throws DictamenException;
	
	EjercicioFiscalTO obtenerEjercicioFiscalActual(List<EjercicioFiscalTO> ejercicios)throws DictamenException;
}
