package mx.gob.imss.cit.de.dictaminacion.services;

import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.PatronDictamenTO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.base.AbstractDBTestUnit;
import mx.gob.imss.cit.de.dictaminacion.services.PatronDictamenService;
import mx.gob.imss.cit.de.dictaminacion.services.impl.PatronDictamenServiceImpl;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PatronDictamenServiceTest  extends AbstractDBTestUnit{
	private Logger LOG=Logger.getLogger(PatronDictamenServiceTest.class);
	
	
	
	private PatronDictamenService patronDictamenService ;
	
	@Before
	public void init() throws Exception {	
		super.setUp();
		
		patronDictamenService=new PatronDictamenServiceImpl();
		connect(patronDictamenService);
	}
	

	
	@Test
	public void testGetPatronDictamen(){
		 PatronDictamenTO to=null;
		try {
		     to = patronDictamenService.getDictamenByRfcPatronAndIdContador("CIT970206HB6", 778L);
		 	 Assert.assertNotNull(to);
			LOG.info("razon: "+to.getDesNombreRazonSocial());
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
		}
	
	}
	
}
