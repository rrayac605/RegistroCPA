package mx.gob.imss.cit.dictamen.registro.persistence.dao;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import mx.gob.imss.cit.dictamen.contador.model.DitPersonaDO;
import mx.gob.imss.cit.dictamen.contador.model.NdtContadorPublicoAutDO;
import mx.gob.imss.cit.dictamen.contador.persistence.dao.DitPersonaDAO;
import mx.gob.imss.cit.dictamen.contador.persistence.dao.NdtContadorPublicoAutDAO;
import mx.gob.imss.cit.dictamen.contador.persistence.dao.impl.DitPersonaDAOImpl;
import mx.gob.imss.cit.dictamen.contador.persistence.dao.impl.NdtContadorPublicoAutDAOImpl;
import mx.gob.imss.cit.dictamen.registro.persistence.dao.base.AbstractDBTestUnit;

public class NdtContadorPublicoAutDAOTest extends AbstractDBTestUnit{
	private static final Logger LOGGER = Logger.getLogger(DitPersonaDAOTest.class);

	private NdtContadorPublicoAutDAO localDAO = new NdtContadorPublicoAutDAOImpl();
	

	@Before
	public void setUp() {
		super.setUp();
		connect(localDAO);
	}

	
	@Test
	public void testContador() {
		LOGGER.info("prueba");
		NdtContadorPublicoAutDO ndtContadorPublicoAutDO = localDAO.selectContadorPublicoAutByIdEstado(1, 1);
		
		LOGGER.info("Lista: " + ndtContadorPublicoAutDO);
		Assert.assertNull(ndtContadorPublicoAutDO);
	}
}
