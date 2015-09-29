package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import mx.gob.imss.cit.dictamen.model.NdtAtestiguamientoDictamenDO;
import mx.gob.imss.cit.dictamen.persistence.dao.base.AbstractDBTestUnit;
import mx.gob.imss.cit.dictamen.persistence.dao.impl.NdtAtestiguamientoDictamenDAOImpl;

public class NdtAtestiguamientoDictamenDAOTest extends AbstractDBTestUnit {
	
	private NdtAtestiguamientoDictamenDAO localDAO = new NdtAtestiguamientoDictamenDAOImpl();

	private static final Logger LOG = Logger.getLogger(NdtAtestiguamientoDictamenDAO.class);

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
	public void testFindByIdPatronDictamen() {
		LOG.info("prueba");
		List<NdtAtestiguamientoDictamenDO> resultList = localDAO.findExamenesByIdPatronDictamen(63L);
		LOG.info("Lista: " + resultList.size());
		for (NdtAtestiguamientoDictamenDO ndtAtestiguamientoDictamenDO : resultList) {
			LOG.info(ndtAtestiguamientoDictamenDO.getCveIdAtestiguamiento().getDesAtestiguamiento());
		}
		Assert.assertNotNull(resultList);
	}

}
