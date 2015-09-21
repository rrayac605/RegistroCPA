package mx.gob.imss.cit.dictamen.services;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.sat.individuo.FisicaTO;
import mx.gob.imss.cit.dictamen.services.impl.ConsultaSatRFCServiceImpl;

public class ConsultaSatRFCServiceTest {
	private Logger LOG=Logger.getLogger(ConsultaSatRFCServiceTest.class);
	
	
	@InjectMocks
	private ConsultaSatRFCService consultaSatRFCService = new ConsultaSatRFCServiceImpl();
	
	private String rfc= "MAHL881210A24";
	
	
	@Before
	public void init() throws Exception {	
		consultaSatRFCService=new ConsultaSatRFCServiceImpl();
	}
	
	@Test
	public void testbBuscarPersonaFisicaPorRfcEnSat(){
		FisicaTO fisicaTO = null;
		
		try {
			fisicaTO = consultaSatRFCService.buscarPersonaFisicaPorRfcEnSat(rfc);
		} catch (DictamenException e) {
			LOG.error(e.getMessage(),e);
		}
		Assert.assertNotNull(fisicaTO);
	}
	
}
