package mx.gob.imss.cit.dictamen.contador.services;

import java.util.Map;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.contador.commons.to.domain.NdtContadorPublicoAutTO;
@Local
public interface ContadorReporteService {
	boolean generarReportePDF(Map<String, Object> parametrosReporte, Integer tipoReporte) throws RuntimeException;
	Map<String, Object> generaParametrosActualizacionVoluntariaContador(NdtContadorPublicoAutTO ndtContadorPublicoAutDTO);
	byte[] generarReportePreliminar(Map<String, Object> parametrosReporte, Integer tipoReporte);
	String generaCadenaOriginalSolicitud(NdtContadorPublicoAutTO ndtContadorPublicoAutDTO) throws RuntimeException;
}
