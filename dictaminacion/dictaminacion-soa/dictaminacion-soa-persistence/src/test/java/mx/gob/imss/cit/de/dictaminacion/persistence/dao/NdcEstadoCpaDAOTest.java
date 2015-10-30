package mx.gob.imss.cit.de.dictaminacion.persistence.dao;

import java.util.List;

import mx.gob.imss.cit.de.dictaminacion.model.NdcEstadoCpaDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdcEstadoCpaDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.base.AbstractDBTestUnit;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.impl.NdcEstadoCpaDAOImpl;

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

public class NdcEstadoCpaDAOTest extends AbstractDBTestUnit {
	private NdcEstadoCpaDAO localDAO = new NdcEstadoCpaDAOImpl();

	private static final Logger LOG = Logger.getLogger(NdcEstadoCpaDAOTest.class);

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
		List<NdcEstadoCpaDO> resultList = localDAO.findAll();
		LOG.info("Lista: " + resultList.size());
		for (NdcEstadoCpaDO ndcEstadoCpaDO : resultList) {
			LOG.info(ndcEstadoCpaDO.getDesEstadoCpa());
		}
		Assert.assertNotNull(resultList);
	}
}

