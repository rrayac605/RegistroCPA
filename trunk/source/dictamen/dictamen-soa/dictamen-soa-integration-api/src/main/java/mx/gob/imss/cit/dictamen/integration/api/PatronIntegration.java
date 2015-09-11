package mx.gob.imss.cit.dictamen.integration.api;

import java.util.List;

import mx.gob.imss.cit.dictamen.integration.api.dto.DatosPatronDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.TipoDictamenDTO;


public interface PatronIntegration {

	DatosPatronDTO getDatosPatron(String rfc);
	
	List<TipoDictamenDTO> findAllTipoDictamen();
	
	void executeRegistrar(DatosPatronDTO datosDTO);
	
}
