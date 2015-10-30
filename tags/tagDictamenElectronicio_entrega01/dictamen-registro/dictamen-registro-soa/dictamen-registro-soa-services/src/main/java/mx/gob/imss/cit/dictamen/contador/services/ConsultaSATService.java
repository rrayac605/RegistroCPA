package mx.gob.imss.cit.dictamen.contador.services;

import mx.gob.imss.cit.dictamen.contador.commons.exception.DictamenContadorException;
import gob.imss.webservice.sat.rfc.cliente.EntradaSAT;
import gob.imss.webservice.sat.rfc.cliente.SalidaSAT;

/**
 * Interface que consulta los servicios web del SAT
 * 
 * @author arivera
 *
 */
public interface ConsultaSATService {
	/**
	 * Método que retorna datos del SAT
	 * 
	 * @param entradaSAT
	 * @return
	 */
	SalidaSAT obtenerDomicilioFiscal(EntradaSAT entradaSAT)
			throws DictamenContadorException;

}
