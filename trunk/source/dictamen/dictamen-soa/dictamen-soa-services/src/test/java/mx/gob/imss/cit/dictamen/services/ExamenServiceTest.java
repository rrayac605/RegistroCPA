package mx.gob.imss.cit.dictamen.services;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import mx.gob.imss.cit.dictamen.commons.to.domain.AtestiguamientoDictamenTO;
import mx.gob.imss.cit.dictamen.persistence.dao.base.AbstractDBTestUnit;
import mx.gob.imss.cit.dictamen.services.impl.ExamenServiceImpl;

public class ExamenServiceTest extends AbstractDBTestUnit {
private Logger LOG=Logger.getLogger(ExamenServiceTest.class);
	
	
	
	private ExamenService examenService;

	
	@Before
	public void init() throws Exception {	
		super.setUp();
		examenService=new ExamenServiceImpl();
		connect(examenService);
	}
	
	
	@Test
	public void findExamenByIdPatronDictameTest(){
		List<AtestiguamientoDictamenTO> atestiguamientosTOList = new ArrayList<AtestiguamientoDictamenTO>();
		try {
			atestiguamientosTOList = examenService.findExamenByIdPatronDictamen(63L);
			for (AtestiguamientoDictamenTO atestiguamientoDictamenTO : atestiguamientosTOList) {
				System.out.println(atestiguamientoDictamenTO.getCveIdAtestiguamiento().getCveIdAtestiguamiento());
			}
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
		}
		Assert.assertNotNull(atestiguamientosTOList);
	}


}
