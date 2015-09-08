package mx.gob.imss.cit.dictamen.integration.api;

import java.util.List;

import javax.ejb.Remote;

import mx.gob.imss.cit.dictamen.integration.api.dto.DatosPatronDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.TipoDictamenDTO;


@Remote
public interface PatronIntegracion {

	DatosPatronDTO getDatosPatron(String rfc);
	
	List<TipoDictamenDTO> findAllTipoDictamen();
	
	void executeRegistrar(DatosPatronDTO datosDTO);
	
}
