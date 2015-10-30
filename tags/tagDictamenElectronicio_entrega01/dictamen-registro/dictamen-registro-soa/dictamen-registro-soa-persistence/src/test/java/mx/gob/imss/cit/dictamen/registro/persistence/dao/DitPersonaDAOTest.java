package mx.gob.imss.cit.dictamen.registro.persistence.dao;

import java.util.List;

import mx.gob.imss.cit.dictamen.contador.model.DitPersonaDO;
import mx.gob.imss.cit.dictamen.contador.model.NdtContadorPublicoAutDO;
import mx.gob.imss.cit.dictamen.contador.persistence.dao.DitPersonaDAO;
import mx.gob.imss.cit.dictamen.contador.persistence.dao.impl.DitPersonaDAOImpl;
import mx.gob.imss.cit.dictamen.registro.persistence.dao.base.AbstractDBTestUnit;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test para DAO
 * 
 * @author cmarmolejo
 * 
 */

public class DitPersonaDAOTest extends AbstractDBTestUnit {
	private DitPersonaDAO localDAO = new DitPersonaDAOImpl();

	private static final Logger LOG = Logger.getLogger(DitPersonaDAOTest.class);

	/**
	 * Método para configuración de pruebas unitarias
	 */
	@Before
	public void setUp() {
		// Llamar la prueba padre para obtener el EntityManager
		super.setUp();
		// Llamar los datos de negocio
		// Conectar el EntityManager al servicio y sus daos
		connect(localDAO);

	}

	@Test
	public void testContador() {
		LOG.info("prueba");
		DitPersonaDO ndtContadorPublicoAutDO = localDAO.selectContadorPublicoByCurp("RE");
		
		LOG.info("Lista: " + ndtContadorPublicoAutDO);
		Assert.assertNull(ndtContadorPublicoAutDO);
	}
	
	//@Test
	/*
	public void testFindAll() {
		LOG.info("prueba");
		List<NdtContadorPublicoAutDO> resultList = localDAO.findAll();
		LOG.info("Lista: " + resultList.size());
		Assert.assertNotNull(resultList);
	}*/
}

