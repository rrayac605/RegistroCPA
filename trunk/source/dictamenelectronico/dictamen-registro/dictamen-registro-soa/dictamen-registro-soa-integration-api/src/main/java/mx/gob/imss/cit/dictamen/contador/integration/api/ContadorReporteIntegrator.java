package mx.gob.imss.cit.dictamen.contador.integration.api;

import mx.gob.imss.cit.dictamen.contador.integration.api.dto.NdtContadorPublicoAutDTO;

public interface ContadorReporteIntegrator {
	byte[] generarReportePreliminar(NdtContadorPublicoAutDTO ndtContadorPublicoAutDTO, Integer tipoReporte);
}
