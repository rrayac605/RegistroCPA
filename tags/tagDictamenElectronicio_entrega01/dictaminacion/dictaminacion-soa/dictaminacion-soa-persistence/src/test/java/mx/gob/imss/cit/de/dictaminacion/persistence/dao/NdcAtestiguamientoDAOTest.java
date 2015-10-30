package mx.gob.imss.cit.de.dictaminacion.persistence.dao;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import mx.gob.imss.cit.de.dictaminacion.model.NdcAtestiguamientoDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdcAtestiguamientoDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.base.AbstractDBTestUnit;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.impl.NdcAtestiguamientoDAOImpl;

public class NdcAtestiguamientoDAOTest extends AbstractDBTestUnit {
	
	private NdcAtestiguamientoDAO localDAO = new NdcAtestiguamientoDAOImpl();

	private static final Logger LOG = Logger.getLogger(NdcAtestiguamientoDAO.class);
	
	
	@Before
	public void setUp() {
		super.setUp();
		connect(localDAO);
	}
	
	@Test
	public void testgetByIdAtestiguamiento() {
		LOG.info("prueba");
		NdcAtestiguamientoDO ndtAtestiguamientoDO = localDAO.get(1l);
		LOG.info(ndtAtestiguamientoDO.getCveIdAtestiguamiento());
		Assert.assertNotNull(ndtAtestiguamientoDO);
	}
	
}
