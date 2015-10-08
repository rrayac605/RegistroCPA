package mx.gob.imss.cit.dictamen.services;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import mx.gob.imss.cit.dictamen.commons.to.ParentLayoutTO;
import mx.gob.imss.cit.dictamen.persistence.dao.base.AbstractDBTestUnit;
import mx.gob.imss.cit.dictamen.services.impl.LayoutServiceImpl;

public class LayoutServiceTest extends AbstractDBTestUnit {
	private Logger LOG=Logger.getLogger(LayoutServiceTest.class);		
	private LayoutService layoutService = new LayoutServiceImpl();
	
	@Before
	public void init() throws Exception {
		super.setUp();
		layoutService = new LayoutServiceImpl();
		connect(layoutService);
	}	
	
	@Test
	public void testCreateList(){		
		List<ParentLayoutTO> salida = null;
		try {			
			salida = layoutService.createList();
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
		}
		Assert.assertNotNull(salida);
	}
	
}
