package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import mx.gob.imss.cit.dictamen.model.DgAsentamientoDO;
import mx.gob.imss.cit.dictamen.persistence.dao.base.AbstractDBTestUnit;
import mx.gob.imss.cit.dictamen.persistence.dao.impl.DgAsentamientoDAOImpl;


public class DgAsentamientoDAOTest extends AbstractDBTestUnit {
	private DgAsentamientoDAO dgAsentamientoDAO = new DgAsentamientoDAOImpl();

	private static final Logger LOG = Logger.getLogger(DgAsentamientoDAOTest.class);

	/**
	 * Método para configuración de pruebas unitarias
	 */
	@Before
	public void setUp() {
		// Llamar la prueba padre para obtener el EntityManager
		super.setUp();
		// Llamar los datos de negocio
		// Conectar el EntityManager al servicio y sus daos
		connect(dgAsentamientoDAO);

	}

	@Test
	public void testFindAll() {
		LOG.info("prueba");
		List<DgAsentamientoDO> resultList = dgAsentamientoDAO.findAll();
		LOG.info("Lista: " + resultList.size());
		Assert.assertNotNull(resultList);
	}

}

