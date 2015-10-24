package mx.gob.imss.cit.dictamen.contador.services.impl;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mx.gob.imss.cit.dictamen.contador.commons.to.domain.NdtContadorPublicoAutTO;

public class ContadorReporteUnitTest {
   
	private static final Logger LOGGER = LoggerFactory.getLogger(ContadorReporteUnitTest.class);

	
	public void test(){
		InputStream inputStream =this.getClass().getResourceAsStream("reporte/SolicitudActivacionContador.jasper");
		System.out.println("test="+inputStream.toString());

	}
	public static void main(String[] args) throws IOException {
	//	ContadorReporteUnitTest test = new ContadorReporteUnitTest();
	//	test.test();
		
		ContadorReporteServiceImpl crs = new ContadorReporteServiceImpl();
		NdtContadorPublicoAutTO to = new NdtContadorPublicoAutTO();
		to.setCadenaOriginal("abc");
		to.setCurp("abc");
		to.setFecha("test");
		to.setNombreCompleto("test");
		to.setNumeroCedulaProfesional("test");
		to.setNumRegistroCpa(1);
		to.setNumTramiteNotaria("test");
		to.setNumTramiteNotaria("twes");
		to.setRfc("test");
		to.setSelloDigitalIMSS("test");
		byte[] reporte =  crs.generarReportePreliminar(crs.generaParametrosActualizacionVoluntariaContador(to), 1);
		OutputStream out = new FileOutputStream("c://code//out.pdf");
		out.write(reporte);
		out.close();
		System.out.println("size="+reporte.length);
	}

}
