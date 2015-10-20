package mx.gob.imss.cit.dictamen.contador.integration.api;

import mx.gob.imss.cit.dictamen.contador.integration.api.dto.ContadorPublicoAutDTO;

public interface SolicitudRegistroIntegrator {
	
	ContadorPublicoAutDTO obtenerContadorPublicoAutDTO(String curp);

}
