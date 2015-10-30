package mx.gob.imss.cit.de.dictaminacion.services;

import gob.imss.webservice.sat.rfc.cliente.EntradaSAT;
import gob.imss.webservice.sat.rfc.cliente.SalidaSAT;
import mx.gob.imss.cit.de.dictaminacion.commons.exception.DictamenException;

import javax.ejb.Local;

@Local
public interface ConsultaSatRFCService {

	SalidaSAT  getPatron(EntradaSAT rfc)throws DictamenException;
}
