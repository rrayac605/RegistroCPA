package mx.gob.imss.distss.dictamen.contador.integration.impl;

import java.util.Map;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.contador.commons.to.domain.NdtContadorPublicoAutTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.ContadorReporteIntegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.NdtContadorPublicoAutDTO;
import mx.gob.imss.cit.dictamen.contador.services.ContadorReporteService;

@Stateless(name = "contadorReporteIntegrator", mappedName = "contadorReporteIntegrator")
@Remote({ContadorReporteIntegrator.class})
public class ContadorReporteIntegratorImpl implements ContadorReporteIntegrator {

	@EJB(name="contadorReporteService", mappedName="contadorReporteService")
	private ContadorReporteService contadorReporteService;


	@Override
	public byte[] generarReportePreliminar(
			NdtContadorPublicoAutDTO ndtContadorPublicoAutDTO, Integer tipoReporte) {
		
		NdtContadorPublicoAutTO ndtContadorPublicoAutTO = new NdtContadorPublicoAutTO();
		Map<String, Object> mapParam =  contadorReporteService.generaParametrosActualizacionVoluntariaContador(ndtContadorPublicoAutTO);
		
		byte[] reporte = contadorReporteService.generarReportePreliminar(mapParam, tipoReporte);
		
		return reporte;
	}
	
	

	public ContadorReporteService getContadorReporteService() {
		return contadorReporteService;
	}


	public void setContadorReporteService(
			ContadorReporteService contadorReporteService) {
		this.contadorReporteService = contadorReporteService;
	}

}
