package mx.gob.imss.cit.dictamen.registro.persistence.dao;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import mx.gob.imss.cit.dictamen.contador.model.NdtContadorPublicoAutDO;
import mx.gob.imss.cit.dictamen.contador.persistence.dao.NdtContadorPublicoAutDAO;
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
		NdtContadorPublicoAutDO ndtContadorPublicoAutDO = localDAO.selectContadorPublicoAutByIdPersona(37472955L);
		
		LOGGER.info("Lista: " + ndtContadorPublicoAutDO);
		LOGGER.info("Lista.size: " + ndtContadorPublicoAutDO.getNdtR3ColegioDOList().size());
	}
}
