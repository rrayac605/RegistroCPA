package mx.gob.imss.cit.dictamen.contador.services;

import mx.gob.imss.cit.dictamen.contador.services.impl.PatronDictamenServiceImpl;
import mx.gob.imss.cit.dictamen.registro.persistence.dao.base.AbstractDBTestUnit;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PatronDictamenServiceTest {
	private Logger LOG=Logger.getLogger(PatronDictamenServiceTest.class);
	
	
	
	private PatronDictamenService patronDictamenService ;
	
//	@Before
	/*
	public void init() throws Exception {	
		super.setUp();
		
		patronDictamenService=new PatronDictamenServiceImpl();
		connect(patronDictamenService);
	}
	

	
//	@Test
	public void testGetPatronDictamen(){
		 boolean to=false;
		try {
		     to = patronDictamenService.getDictamenByRfcPatronAndIdContador("CIT970206HB6");
		 	 Assert.assertNotNull(to);
			LOG.info("razon: "+to);
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
		}
	
	}
	*/
}
