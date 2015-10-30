package mx.gob.imss.cit.de.dictaminacion.services;

import java.util.ArrayList;
import java.util.List;

import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.CedulaPrestacionesTO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.base.AbstractDBTestUnit;
import mx.gob.imss.cit.de.dictaminacion.services.impl.CedulaPrestacionesServiceImpl;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CedulaPrestacionesServiceTest extends AbstractDBTestUnit{
	private Logger LOG=Logger.getLogger(CedulaPrestacionesServiceTest.class);
	
	private CedulaPrestacionesService cedulaPrestacionesService = new CedulaPrestacionesServiceImpl();
	
	@Before
	public void init() throws Exception{
		super.setUp();
		cedulaPrestacionesService = new CedulaPrestacionesServiceImpl();
		connect(cedulaPrestacionesService);
	}
	
	@Test
	public void addCedulaPrestacionesTest(){

		List<CedulaPrestacionesTO> cedulaPrestacionesTOList = new ArrayList<CedulaPrestacionesTO>();
		try{
			cedulaPrestacionesTOList = cedulaPrestacionesService.findCedulaPrestaciones(63L, 2L);
			
			for(CedulaPrestacionesTO cedulaPrestacionesTO: cedulaPrestacionesTOList){
				LOG.info(cedulaPrestacionesTO.getCveIdCedulaPrestaciones());
				//System.out.println("-----------CveIdPatronDictamen-------------" + cedulaPrestacionesTO.getCveIdPatronDictamen().getCveIdPatronDictamen());
				System.out.println("----------CveIdPrestaciones--------------" + cedulaPrestacionesTO.getCveIdPrestaciones().getCveIdPrestaciones() + "-"+cedulaPrestacionesTO.getCveIdPrestaciones().getDesPrestaciones());
			}
		}catch (Exception e) {
			LOG.error(e.getMessage());
		}
		Assert.assertNotNull(cedulaPrestacionesTOList);
	}
}
