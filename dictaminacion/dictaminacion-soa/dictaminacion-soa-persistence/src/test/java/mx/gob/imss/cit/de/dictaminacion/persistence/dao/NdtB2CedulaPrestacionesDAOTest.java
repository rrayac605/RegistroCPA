package mx.gob.imss.cit.de.dictaminacion.persistence.dao;

import java.util.List;

import mx.gob.imss.cit.de.dictaminacion.model.NdtB2CedulaPrestacionesDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.base.AbstractDBTestUnit;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.impl.NdtB2CedulaPrestacionesDAOImpl;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NdtB2CedulaPrestacionesDAOTest extends AbstractDBTestUnit{

	private NdtB2CedulaPrestacionesDAO localDAO = new NdtB2CedulaPrestacionesDAOImpl();
	
	private static final Logger LOG = Logger.getLogger(NdtB2CedulaPrestacionesDAOTest.class);
	
	@Before
	public void setUp() {
		// Llamar la prueba padre para obtener el EntityManager
		super.setUp();
		// Llamar los datos de negocio
		// Conectar el EntityManager al servicio y sus daos
		connect(localDAO);
	}
	
	@Test
	public void addPrestacionByIdCedulaByImporteTest(){
		List<NdtB2CedulaPrestacionesDO> resultList = localDAO.findPrestacionByIdCedulaByImporte(63L, 2L);
		
		for(NdtB2CedulaPrestacionesDO ndtB2CedulaPrestacionesDO: resultList){
			LOG.info(ndtB2CedulaPrestacionesDO.getCveIdPatronDictamen().getCveIdPatronDictamen());
			LOG.info(ndtB2CedulaPrestacionesDO.getCveIdAtestiguamiento());
		}
		Assert.assertNotNull(resultList);
	}
}
