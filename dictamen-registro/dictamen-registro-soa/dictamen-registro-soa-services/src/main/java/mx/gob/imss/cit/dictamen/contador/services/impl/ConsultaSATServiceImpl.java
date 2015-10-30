package mx.gob.imss.cit.dictamen.contador.services.impl;

import javax.ejb.Stateless;

import gob.imss.webservice.sat.rfc.cliente.EntradaSAT;
import gob.imss.webservice.sat.rfc.cliente.SATPatrones;
import gob.imss.webservice.sat.rfc.cliente.SATPatronesService;
import gob.imss.webservice.sat.rfc.cliente.SalidaSAT;
import mx.gob.imss.cit.dictamen.contador.commons.exception.DictamenContadorException;
import mx.gob.imss.cit.dictamen.contador.services.ConsultaSATService;

/**
 * Clase que implementa la interface ConsultaSATService
 * 
 * @author ariverav
 *
 */
@Stateless
public class ConsultaSATServiceImpl implements ConsultaSATService {

	/**
	 * Método que implementa el consumo de un webservice para consultar datos de
	 * un contribuyente de SAT.
	 */
	@Override
	public SalidaSAT obtenerDomicilioFiscal(EntradaSAT entradaSAT)
			throws DictamenContadorException {
		SATPatronesService port = new SATPatronesService();
		SATPatrones satPatrones = port.getSATPatronesSoapPort();
		SalidaSAT salidaSAT = satPatrones.getPatron(entradaSAT);
		return salidaSAT;
	}
}
