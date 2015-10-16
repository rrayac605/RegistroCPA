package mx.gob.imss.distss.dictamen.service.interfaces.v2;

import java.util.Map;

import javax.ejb.Remote;

import mx.gob.imss.distss.dictamen.modelo.dto.NdtContadorPublicoAutDTO;

@Remote
public interface ReporteServiceRemote {
	
	public boolean generarReportePDF(Map<String, Object> parametrosReporte, Integer tipoReporte) throws RuntimeException;
	public Map<String,Object> generaParametrosRegistroContador (NdtContadorPublicoAutDTO ndtContadorPublicoAutDTO);
	byte[] generarReportePreliminar(Map<String, Object> parametrosReporte, Integer tipoReporte);
	public Map<String,Object> generaParametrosBajaVoluntariaContador(NdtContadorPublicoAutDTO ndtContadorPublicoAutDTO);

}
