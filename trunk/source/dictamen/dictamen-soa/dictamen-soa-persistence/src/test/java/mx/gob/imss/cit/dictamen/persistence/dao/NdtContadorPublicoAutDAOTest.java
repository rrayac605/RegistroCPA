package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import mx.gob.imss.cit.dictamen.model.NdtContadorPublicoAutDO;
import mx.gob.imss.cit.dictamen.persistence.dao.base.AbstractDBTestUnit;
import mx.gob.imss.cit.dictamen.persistence.dao.impl.NdtContadorPublicoAutDAOImpl;

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
@Local
public class NdtContadorPublicoAutDAOTest extends AbstractDBTestUnit {
	private NdtContadorPublicoAutDAO localDAO = new NdtContadorPublicoAutDAOImpl();

	private static final Logger LOG = Logger.getLogger(NdtContadorPublicoAutDAOTest.class);

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
	public void testFindAll() {
		LOG.info("prueba");
		List<NdtContadorPublicoAutDO> resultList = localDAO.findAll();
		LOG.info("Lista: " + resultList.size());
		Assert.assertNotNull(resultList);
	}
}

