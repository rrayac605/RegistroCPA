package mx.gob.imss.cit.dictamen.services;

import gob.imss.webservice.sat.rfc.cliente.EntradaSAT;
import gob.imss.webservice.sat.rfc.cliente.SalidaSAT;
import mx.gob.imss.cit.dictamen.services.impl.ConsultaSatRFCServiceImpl;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConsultaSatRFCServiceTest {
	private Logger LOG=Logger.getLogger(ConsultaSatRFCServiceTest.class);
	
	
	
	private ConsultaSatRFCService consultaSatRFCService = new ConsultaSatRFCServiceImpl();

	
	@Before
	public void init() throws Exception {	
		consultaSatRFCService=new ConsultaSatRFCServiceImpl();
	}
	

	
	@Test
	public void testGetPatron(){
		EntradaSAT entradaSAT = new EntradaSAT();
		entradaSAT.setRfc("CIT970206HB6");
		SalidaSAT salidaSAT =null;
		try {
			salidaSAT = consultaSatRFCService.getPatron(entradaSAT);
			System.out.println(salidaSAT.getRFCOriginal());
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
		}
		Assert.assertNotNull(salidaSAT);
	}
	
}
