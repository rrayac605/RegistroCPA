package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import mx.gob.imss.cit.dictamen.model.DicPaisDO;
import mx.gob.imss.cit.dictamen.persistence.dao.base.AbstractDBEJBTestUnit;
import mx.gob.imss.cit.dictamen.persistence.dao.impl.DicPaisDAOImpl;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test para DAO SBT BENFICIARIO SOLICITUD
 * 
 * @author emartinezo
 * 
 */
public class DicPaisDAOTest extends AbstractDBEJBTestUnit {
	
	private DicPaisDAO dicPaisDAO = new DicPaisDAOImpl();

	private static final Logger LOG = Logger.getLogger(DicPaisDAOTest.class);

	/**
	 * Método para configuración de pruebas unitarias
	 */
	@Before
	public void setUp() {
		// Llamar la prueba padre para obtener el EntityManager
		super.setUp();
		// Llamar los datos de negocio
	//	this.initializeData("dataset/business/pollServiceTest.sql");
		// Conectar el EntityManager al servicio y sus daos
		connect(dicPaisDAO);

	}

	@Test
	public void testFindAll() {
		List<DicPaisDO> resultList = dicPaisDAO.findAll();
		LOG.info("Lista: " + resultList.size());
		Assert.assertNotNull(resultList);
	}


}
