package mx.gob.imss.cit.dictamen.contador.integration.api;

import mx.gob.imss.cit.dictamen.contador.integration.api.dto.PersonaDTO;




public interface ContadorPublicoIntegrator {
	PersonaDTO verificarContadorPublico(String curp, String rfc);
}
