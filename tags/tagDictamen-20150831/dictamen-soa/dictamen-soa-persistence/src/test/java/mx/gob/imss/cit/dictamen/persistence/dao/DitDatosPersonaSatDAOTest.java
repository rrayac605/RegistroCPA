package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import mx.gob.imss.cit.dictamen.model.DitDatosPersonaSatDO;
import mx.gob.imss.cit.dictamen.persistence.dao.base.AbstractDBTestUnit;
import mx.gob.imss.cit.dictamen.persistence.dao.impl.DitDatosPersonaSatDAOImpl;

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
public class DitDatosPersonaSatDAOTest extends AbstractDBTestUnit {
	private DitDatosPersonaSatDAO localDAO = new DitDatosPersonaSatDAOImpl();

	private static final Logger LOG = Logger.getLogger(DitDatosPersonaSatDAOTest.class);

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
		List<DitDatosPersonaSatDO> resultList = localDAO.findAll();
		LOG.info("Lista: " + resultList.size());
		Assert.assertNotNull(resultList);
	}
}
