package mx.gob.imss.cit.dictamen.services;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.commons.to.FirmaElectronicaTO;

@Local
/**
 * clase de servicio para la firma electronica
 * @author ajfuentes
 *
 */
public interface FirmaElectronicaService {
	
	/**
	 * Metodo de servicio para la firma electronica
	 * @return
	 */
	FirmaElectronicaTO executeInitFirmaElectronica();

}
