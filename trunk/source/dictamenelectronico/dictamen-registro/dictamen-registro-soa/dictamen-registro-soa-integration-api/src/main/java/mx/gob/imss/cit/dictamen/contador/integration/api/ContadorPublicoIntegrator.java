package mx.gob.imss.cit.dictamen.contador.integration.api;

import mx.gob.imss.cit.dictamen.contador.integration.api.dto.ContadorPublicoDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.PersonaDTO;


public interface ContadorPublicoIntegrator {
	ContadorPublicoDTO consultarContadorPublicAut(Long idPersona);
	PersonaDTO verificarContadorPublico(String curp, String rfc);
}
