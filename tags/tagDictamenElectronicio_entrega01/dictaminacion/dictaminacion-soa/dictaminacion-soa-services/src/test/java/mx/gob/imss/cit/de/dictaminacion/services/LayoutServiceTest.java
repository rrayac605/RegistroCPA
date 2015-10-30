package mx.gob.imss.cit.de.dictaminacion.services;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import mx.gob.imss.cit.de.dictaminacion.commons.to.LayoutTO;
import mx.gob.imss.cit.de.dictaminacion.commons.to.ParentLayoutTO;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.PatronDictamenTO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.base.AbstractDBTestUnit;
import mx.gob.imss.cit.de.dictaminacion.services.AseveracionService;
import mx.gob.imss.cit.de.dictaminacion.services.impl.AseveracionServiceImpl;

public class LayoutServiceTest extends AbstractDBTestUnit {
	private Logger LOG=Logger.getLogger(LayoutServiceTest.class);		
	private AseveracionService layoutService = new AseveracionServiceImpl();
	
	@Before
	public void init() throws Exception {
		super.setUp();
		layoutService = new AseveracionServiceImpl();
		connect(layoutService);
	}	
	
	@Test
	public void testCreateList(){		
		List<ParentLayoutTO> salida = null;
		PatronDictamenTO dictamenTO=new PatronDictamenTO();
		dictamenTO.setIndPatronConstruccion((short)1);
		dictamenTO.setIndRealizoActConstruccion((short)0);
		
		try {			
			salida = layoutService.findAseveraciones(dictamenTO);
			for (ParentLayoutTO parentLayoutTO : salida) {
				LOG.info(parentLayoutTO.getName());
				System.out.println(parentLayoutTO.getName());
				for (LayoutTO lay : parentLayoutTO.getListaLayout()) {
					LOG.info(parentLayoutTO.getName());
					System.out.println("     "+lay.getName());				
				}
			}
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
		}
		Assert.assertNotNull(salida);
	}
	
}
