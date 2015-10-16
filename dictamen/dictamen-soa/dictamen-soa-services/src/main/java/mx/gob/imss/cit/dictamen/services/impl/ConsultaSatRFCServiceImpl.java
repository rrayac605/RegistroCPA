package mx.gob.imss.cit.dictamen.services.impl;

import gob.imss.webservice.sat.rfc.cliente.EntradaSAT;
import gob.imss.webservice.sat.rfc.cliente.SATPatrones;
import gob.imss.webservice.sat.rfc.cliente.SATPatronesService;
import gob.imss.webservice.sat.rfc.cliente.SalidaSAT;

import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.services.ConsultaSatRFCService;

@Stateless
public class ConsultaSatRFCServiceImpl implements  ConsultaSatRFCService{


	@Override
	public SalidaSAT getPatron(EntradaSAT entradaSAT) throws DictamenException {
		
		SATPatronesService port=new SATPatronesService();
		SATPatrones satPatrones=port.getSATPatronesSoapPort();
		SalidaSAT salidaSAT=satPatrones.getPatron(entradaSAT);
		
	
		return salidaSAT;
	}

}
