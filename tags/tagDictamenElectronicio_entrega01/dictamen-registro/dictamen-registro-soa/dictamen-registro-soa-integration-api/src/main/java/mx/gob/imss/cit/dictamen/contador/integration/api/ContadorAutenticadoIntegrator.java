package mx.gob.imss.cit.dictamen.contador.integration.api;

import mx.gob.imss.cit.dictamen.contador.integration.api.dto.ContadorPublicoDTO;

/**
 * Interface que integra el servicio de {@link ContadorAutenticadoService}
 * @author lramirez
 *
 */
public interface ContadorAutenticadoIntegrator {
	boolean validarSesionContador(String rfc, String curp);
	int validarContadorAutenticado(ContadorPublicoDTO contadorAut);
}
