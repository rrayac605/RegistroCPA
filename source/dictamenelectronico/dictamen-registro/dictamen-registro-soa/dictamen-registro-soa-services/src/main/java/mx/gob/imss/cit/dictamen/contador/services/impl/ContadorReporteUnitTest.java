package mx.gob.imss.cit.dictamen.contador.services.impl;

import java.io.InputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mx.gob.imss.cit.dictamen.contador.commons.to.domain.NdtContadorPublicoAutTO;

public class ContadorReporteUnitTest {
   
	private static final Logger LOGGER = LoggerFactory.getLogger(ContadorReporteUnitTest.class);

	
	public void test(){
		InputStream inputStream =this.getClass().getResourceAsStream("reporte/SolicitudActivacionContador.jasper");
		System.out.println("test="+inputStream.toString());

	}
	public static void main(String[] args) {
	//	ContadorReporteUnitTest test = new ContadorReporteUnitTest();
	//	test.test();
		
		ContadorReporteServiceImpl crs = new ContadorReporteServiceImpl();
		NdtContadorPublicoAutTO to = new NdtContadorPublicoAutTO();
		to.setCadenaOriginal("abc");
		to.setCurp("abc");
		to.setFecha("test");
		to.setNombreCompleto("test");
		to.setNumeroCedulaProfesional("test");
		to.setNumRegistroCpa("test");
		to.setNumTramiteNotaria("test");
		to.setNumTramiteNotaria("twes");
		to.setRfc("test");
		to.setSelloDigitalIMSS("test");
		byte[] reporte =  crs.generarReportePreliminar(crs.generaParametrosActualizacionVoluntariaContador(to), 1);
		System.out.println("size="+reporte.length);
	}

}
