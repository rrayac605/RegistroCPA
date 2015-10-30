package mx.gob.imss.cit.de.dictaminacion.integration.api;

import mx.gob.imss.cit.de.dictaminacion.integration.api.exception.DictamenNegocioException;

public interface ConsultaSATIntegrator {

	String getPatron(String rfc) throws DictamenNegocioException;
}
