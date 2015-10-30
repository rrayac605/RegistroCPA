package mx.gob.imss.cit.dictamen.contador.services;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.contador.commons.exception.DictamenContadorWebServiceException;
import mx.gob.imss.cit.dictamen.servicios.ws.serviciosbdtu.ConsultaPersonaMoralResponse;

@Local
public interface DictamenInterfaceService {
	ConsultaPersonaMoralResponse consultarPersonalMoral(String rfc) throws DictamenContadorWebServiceException;
}
