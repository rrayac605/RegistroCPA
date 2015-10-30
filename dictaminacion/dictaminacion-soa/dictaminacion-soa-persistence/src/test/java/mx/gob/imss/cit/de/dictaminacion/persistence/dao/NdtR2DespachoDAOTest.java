package mx.gob.imss.cit.de.dictaminacion.persistence.dao;

import java.util.List;

import mx.gob.imss.cit.de.dictaminacion.model.NdtR2DespachoDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdtR2DespachoDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.base.AbstractDBTestUnit;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.impl.NdtR2DespachoDAOImpl;

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

public class NdtR2DespachoDAOTest extends AbstractDBTestUnit {
	private NdtR2DespachoDAO localDAO = new NdtR2DespachoDAOImpl();

	private static final Logger LOG = Logger.getLogger(NdtR2DespachoDAOTest.class);

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
		List<NdtR2DespachoDO> resultList = localDAO.findAll();
		LOG.info("Lista: " + resultList.size());
		Assert.assertNotNull(resultList);
	}
}

