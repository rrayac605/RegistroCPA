package mx.gob.imss.cit.dictamen.services;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import mx.gob.imss.cit.dictamen.commons.to.KeyTO;
import mx.gob.imss.cit.dictamen.services.impl.KeyGeneratorServiceImpl;

public class KeyGeneratorServiceTest{
	private Logger LOG=Logger.getLogger(KeyGeneratorServiceTest.class);		
	private KeyGeneratorService keyGeneratorService = new KeyGeneratorServiceImpl();
	
	@Before
	public void init() throws Exception {
		keyGeneratorService = new KeyGeneratorServiceImpl();
	}	
	
	@Test
	public void testGetKey(){
		KeyTO keyTO = new KeyTO();		
		String salida = null;
		keyTO.setAnioEjercicio("2015");
		keyTO.setLayoutName("Mi Layout");
		keyTO.setRfcPatron("MASC870401GQ8");
		keyTO.setRfcUsuario("CIT970206HB6");
		try {								
			salida = keyGeneratorService.getKey(keyTO);
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
		}
		Assert.assertNotNull(salida);
	}
	
}
