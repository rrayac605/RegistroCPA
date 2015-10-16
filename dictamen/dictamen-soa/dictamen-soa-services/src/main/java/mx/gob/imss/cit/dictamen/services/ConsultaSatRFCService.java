package mx.gob.imss.cit.dictamen.services;

import gob.imss.webservice.sat.rfc.cliente.EntradaSAT;
import gob.imss.webservice.sat.rfc.cliente.SalidaSAT;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;

@Local
public interface ConsultaSatRFCService {

	SalidaSAT  getPatron(EntradaSAT rfc)throws DictamenException;
}
