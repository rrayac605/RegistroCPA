package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import mx.gob.imss.cit.dictamen.model.NdtCargaDocumentoDO;
import mx.gob.imss.cit.dictamen.persistence.dao.base.AbstractDBTestUnit;
import mx.gob.imss.cit.dictamen.persistence.dao.impl.NdtCargaDocumentoDAOImpl;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NdtCargaDocumentoDAOTest extends AbstractDBTestUnit{
	
	private NdtCargaDocumentoDAO localDAO = new NdtCargaDocumentoDAOImpl();
	
	private static final Logger LOG = Logger.getLogger(NdtCargaDocumentoDAO.class);
	
	@Before
	public void setUp() {
		// Llamar la prueba padre para obtener el EntityManager
		super.setUp();
		// Llamar los datos de negocio
		// Conectar el EntityManager al servicio y sus daos
		connect(localDAO);
	}
	
	@Test
	public void testFindByCvePatronRfcCpaPatron(){
		LOG.info("prueba------------------------------------------");
		List<NdtCargaDocumentoDO> resultList = localDAO.findCvePatronEstadoAseveracion(63L, 778L, "CIT970206HB6");
		if (resultList == null){
			LOG.info("Lista:nulla " );
		}else{
		LOG.info("Lista: " + resultList.size());

		for(NdtCargaDocumentoDO ndtCargaDocumentoDO : resultList){
			//LOG.info(ndtCargaDocumentoDO.getCveIdPatronDictamen().getCveIdPatronDictamen());
			LOG.info(ndtCargaDocumentoDO.getCveIdBitacoraCargaAsev());
		}
		Assert.assertNotNull(resultList);
	}
	}
}
