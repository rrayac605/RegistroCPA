package mx.gob.imss.cit.dictamen.contador.services;

import mx.gob.imss.cit.dictamen.contador.integration.api.dto.ContadorPublicoDTO;
import mx.gob.imss.cit.dictamen.contador.services.impl.ContadorAutenticadoServiceImpl;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

public class ContadorAutenticadoServiceTest {
	private static final Logger LOG = Logger.getLogger(ContadorAutenticadoServiceTest.class);
	
	private ContadorAutenticadoService contadorAutenticadoService = new ContadorAutenticadoServiceImpl();
	
	@Test
	public void validaDatosSesionVacios(){
		String rfc = "";
		String curp = "";
		boolean resultado = contadorAutenticadoService.validarSesionContador(rfc, curp);
		Assert.assertFalse("Debio de llegar como false", resultado);
	}
	
	@Test
	public void validarUnDatoSesionVacio(){
		String rfc = "DUSL821218LN8";
		String curp = "";
		boolean resultado = contadorAutenticadoService.validarSesionContador(rfc, curp);
		Assert.assertFalse("Debio de llegar como false", resultado);
	}
	
	@Test
	public void validarDatosSesionNulos(){
		String rfc = null;
		String curp = null;
		boolean resultado = contadorAutenticadoService.validarSesionContador(rfc, curp);
		Assert.assertFalse("Debio de llegar como false", resultado);
	}
	
	@Test 
	public void validarDatosSesionUnNulo(){
		String rfc = "DUSL821218LN8";
		String curp = null;
		boolean resultado = contadorAutenticadoService.validarSesionContador(rfc, curp);
		Assert.assertFalse("Debio de llegar como false", resultado);
	}
	
	@Test
	public void validarDatosSesion(){
		String rfc = "DUSL821218LN8";
		String curp = "DUSL821218HDFRLC09";
		boolean resultado = contadorAutenticadoService.validarSesionContador(rfc, curp);
		Assert.assertTrue("Debio de llegar como true", resultado);
	}
	
	@Test
	public void validarContadorAutenticadoNulo(){
		ContadorPublicoDTO contadorPublico = null;
		int resultado = contadorAutenticadoService.validarContadorAutenticado(contadorPublico);
		Assert.assertEquals("Debió de llegar en uno",1L, (long)resultado);
	}
	
	@Test
	public void validarContadorAutenticadoCancelado(){
		ContadorPublicoDTO contadorPublico = new ContadorPublicoDTO();
		contadorPublico.setCveIdEstadoCPA(14L);
		int resultado = contadorAutenticadoService.validarContadorAutenticado(contadorPublico);
		Assert.assertEquals("Debió de llegar en dos", 2L, (long)resultado);
	}
	
	@Test
	public void validarContadorAutenticado(){
		ContadorPublicoDTO contadorPublico = new ContadorPublicoDTO();
		contadorPublico.setCveIdEstadoCPA(4L);
		int resultado = contadorAutenticadoService.validarContadorAutenticado(contadorPublico);
		Assert.assertEquals("Debió de llegar en cero", 0L, (long)resultado);
	}
}
