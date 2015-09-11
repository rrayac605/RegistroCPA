package mx.gob.imss.cit.dictamen.integration.api;

import mx.gob.imss.cit.dictamen.integration.api.dto.FirmaElectronicaDTO;
import mx.gob.imss.cit.dictamen.integration.api.exception.DictamenNegocioException;

/**
 * Interface de integracion para la firma electronica
 * @author ajfuentes
 *
 */
public interface FirmaElectronicaIntegrator {
	

	/**
	 * metodo de integracion para la firma electronica
	 * @return
	 */
	FirmaElectronicaDTO executeInitFirmaElectronica() throws DictamenNegocioException;

}
