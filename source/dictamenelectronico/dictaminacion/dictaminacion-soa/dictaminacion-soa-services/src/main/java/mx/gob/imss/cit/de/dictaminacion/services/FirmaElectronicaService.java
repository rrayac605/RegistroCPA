package mx.gob.imss.cit.de.dictaminacion.services;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.commons.exception.DictamenException;
import mx.gob.imss.cit.de.dictaminacion.commons.to.FirmaElectronicaTO;


/**
 * clase de servicio para la firma electronica
 * @author ajfuentes
 *
 */
@Local
public interface FirmaElectronicaService {
	
	/**
	 * Metodo de servicio para la firma electronica
	 * @return
	 */
	FirmaElectronicaTO executeInitFirmaElectronica() throws DictamenException;

}
