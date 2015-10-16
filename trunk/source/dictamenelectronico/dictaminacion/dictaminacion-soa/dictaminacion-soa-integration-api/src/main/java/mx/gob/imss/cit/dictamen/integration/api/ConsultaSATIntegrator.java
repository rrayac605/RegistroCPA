package mx.gob.imss.cit.dictamen.integration.api;

import mx.gob.imss.cit.dictamen.integration.api.exception.DictamenNegocioException;

public interface ConsultaSATIntegrator {

	String getPatron(String rfc) throws DictamenNegocioException;
}
