package mx.gob.imss.cit.dictamen.contador.integration.api;

import java.util.List;

import mx.gob.imss.cit.dictamen.contador.integration.api.dto.ContadorPublicoDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DatosPersonalesDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DomicilioFiscalDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.PersonaDTO;


public interface ContadorPublicoIntegrator {
	ContadorPublicoDTO consultarContadorPublicAut(Long idPersona);
	PersonaDTO consultarFisicaPorRFC(String rfc);
	PersonaDTO verificarContadorPublico(String curp, String rfc);
	DomicilioFiscalDTO consultarDomicilioPorRFC(String rfc);
	List<DatosPersonalesDTO> consultarDatosPersonales(Long idPersona);
}
