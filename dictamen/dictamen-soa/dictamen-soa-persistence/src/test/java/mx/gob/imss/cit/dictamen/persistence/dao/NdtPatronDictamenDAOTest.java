package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import mx.gob.imss.cit.dictamen.model.NdtPatronDictamenDO;
import mx.gob.imss.cit.dictamen.persistence.dao.base.AbstractDBTestUnit;
import mx.gob.imss.cit.dictamen.persistence.dao.impl.NdtPatronDictamenDAOImpl;

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

public class NdtPatronDictamenDAOTest extends AbstractDBTestUnit {
	private NdtPatronDictamenDAO ndtPatronDictamenDAO = new NdtPatronDictamenDAOImpl();

	private static final Logger LOG = Logger.getLogger(NdtPatronDictamenDAOTest.class);

	/**
	 * Método para configuración de pruebas unitarias
	 */
	@Before
	public void setUp() {
		// Llamar la prueba padre para obtener el EntityManager
		super.setUp();
		// Llamar los datos de negocio
		// Conectar el EntityManager al servicio y sus daos
		connect(ndtPatronDictamenDAO);

	}

	@Test
	public void testFindAll() {
		LOG.info("prueba");
		List<NdtPatronDictamenDO> resultList = ndtPatronDictamenDAO.findAll();
		LOG.info("Lista: " + resultList.size());
		Assert.assertNotNull(resultList);
	}
	
	@Test
	public void testCreate() {
		NdtPatronDictamenDO ndtPatronDictamenDO=new NdtPatronDictamenDO();
		try{
			ndtPatronDictamenDAO.create(ndtPatronDictamenDO);
		}catch(Exception e){
			LOG.error(e.getMessage(), e);
		}
		
	}
	
	@Test
	public void testFindByRfcPatronAndIdContador() {
		List<NdtPatronDictamenDO> list=null;
		try{
			list=ndtPatronDictamenDAO.findByRfcPatronAndIdContador("CIT970206HB6", 778L);
			
			for (NdtPatronDictamenDO ndtPatronDictamenDO : list) {
				LOG.info(ndtPatronDictamenDO.getDesNombreRazonSocial());
			}
			
			Assert.assertNotNull(list);
		}catch(Exception e){
			LOG.error(e.getMessage(), e);
		}
		
	}
}

