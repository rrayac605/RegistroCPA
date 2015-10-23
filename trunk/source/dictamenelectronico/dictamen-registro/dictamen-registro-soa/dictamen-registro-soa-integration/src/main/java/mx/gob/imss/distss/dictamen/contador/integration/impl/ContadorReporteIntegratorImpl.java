package mx.gob.imss.distss.dictamen.contador.integration.impl;

import java.util.Map;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.contador.commons.to.domain.DomicilioTO;
import mx.gob.imss.cit.dictamen.contador.commons.to.domain.NdtContadorPublicoAutTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.ContadorReporteIntegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DomicilioFiscalDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.NdtContadorPublicoAutDTO;
import mx.gob.imss.cit.dictamen.contador.services.ContadorReporteService;

@Stateless(name = "contadorReporteIntegrator", mappedName = "contadorReporteIntegrator")
@Remote({ContadorReporteIntegrator.class})
public class ContadorReporteIntegratorImpl implements ContadorReporteIntegrator {

	@EJB(name="contadorReporteService", mappedName="contadorReporteService")
	private ContadorReporteService contadorReporteService;


	@Override
	public byte[] generarReportePreliminar( NdtContadorPublicoAutDTO ndtContadorPublicoAutDTO, Integer tipoReporte) {
		
		NdtContadorPublicoAutTO ndtContadorPublicoAutTO = new NdtContadorPublicoAutTO();
	
		ndtContadorPublicoAutTO.setCadenaOriginal(ndtContadorPublicoAutDTO.getCadenaOriginal());
		ndtContadorPublicoAutTO.setCurp(ndtContadorPublicoAutDTO.getCurp());
		ndtContadorPublicoAutTO.setFecha(ndtContadorPublicoAutDTO.getFecha());
		ndtContadorPublicoAutTO.setNombreCompleto(ndtContadorPublicoAutDTO.getNombreCompleto());
		ndtContadorPublicoAutTO.setNumeroCedulaProfesional(ndtContadorPublicoAutDTO.getNumeroCedulaProfesional());
		ndtContadorPublicoAutTO.setNumRegistroCpa(ndtContadorPublicoAutDTO.getNumRegistroCpa());
		ndtContadorPublicoAutTO.setNumTramiteNotaria(ndtContadorPublicoAutDTO.getNumTramiteNotaria());
		ndtContadorPublicoAutTO.setRfc(ndtContadorPublicoAutDTO.getRfc());
		ndtContadorPublicoAutTO.setCadenaOriginal(ndtContadorPublicoAutDTO.getCadenaOriginal());
		ndtContadorPublicoAutTO.setSelloDigitalIMSS(ndtContadorPublicoAutDTO.getSelloDigitalIMSS());
		DomicilioFiscalDTO domicilio = ndtContadorPublicoAutDTO.getDomicilioFiscalDTO();
		if(domicilio!=null){
		   DomicilioTO domicilioTO = new DomicilioTO();
		   domicilioTO.setCalle(domicilio.getCalle());
		   domicilioTO.setCodigoPostal(domicilio.getCodigoPostal());
		   domicilioTO.setColoniaAsentamiento(domicilio.getColoniaAsentamiento());
		   domicilioTO.setCveEntidadFederativa(domicilio.getCveEntidadFederativa());
		   domicilioTO.setEntidadFederativa(domicilio.getEntidadFederativa());
		   domicilioTO.setEntreCalle(domicilio.getEntreCalle());
		   domicilioTO.setLetraExterior(domicilio.getLetraExterior());
		   domicilioTO.setLetraInterior(domicilio.getLetraInterior());
		   domicilioTO.setLocalidad(domicilio.getLocalidad());
		   domicilioTO.setMunicipioDelegacion(domicilio.getMunicipioDelegacion());
		   domicilioTO.setyCalle(domicilio.getyCalle());
		   domicilioTO.setLocalidad(domicilio.getLocalidad());
		   domicilioTO.setNumeroExterior(domicilio.getNumeroExterior());
		   domicilioTO.setNumeroInterior(domicilio.getNumeroInterior());

		   ndtContadorPublicoAutTO.setDomicilioTO(domicilioTO);
		}
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
