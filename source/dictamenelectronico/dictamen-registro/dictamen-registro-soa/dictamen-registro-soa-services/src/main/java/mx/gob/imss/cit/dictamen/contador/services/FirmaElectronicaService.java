package mx.gob.imss.cit.dictamen.contador.services;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.contador.commons.to.domain.FirmaElectronicaTO;



@Local
public interface FirmaElectronicaService {
	
	/**
	 * Metodo de servicio para la firma electronica
	 * @return
	 */
	FirmaElectronicaTO executeInitFirmaElectronica();

}
