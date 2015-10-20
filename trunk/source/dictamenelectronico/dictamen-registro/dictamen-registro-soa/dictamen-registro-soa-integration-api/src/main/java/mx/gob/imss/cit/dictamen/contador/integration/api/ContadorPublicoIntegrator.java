package mx.gob.imss.cit.dictamen.contador.integration.api;

import mx.gob.imss.cit.dictamen.contador.integration.api.dto.ContadorPublicoAutDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.PersonaDTO;


public interface ContadorPublicoIntegrator {
	ContadorPublicoAutDTO consultarContadorPublicAut(Long idPersona);
	PersonaDTO verificarContadorPublico(String curp, String rfc);
}
