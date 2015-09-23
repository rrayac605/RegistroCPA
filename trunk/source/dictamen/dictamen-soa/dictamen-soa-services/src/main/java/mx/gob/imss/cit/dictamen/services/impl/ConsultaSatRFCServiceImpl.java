package mx.gob.imss.cit.dictamen.services.impl;

import gob.imss.webservice.sat.rfc.cliente.EntradaSAT;
import gob.imss.webservice.sat.rfc.cliente.GetPatron;
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
		GetPatron getPatron=new GetPatron();
		getPatron.setDatosEntrada(entradaSAT);
		
		SATPatrones satPatronesService=port.getSATPatronesSoapPort();
		SalidaSAT salidaSAT=satPatronesService.getPatron(entradaSAT);
		
	
		return salidaSAT;
	}

}
