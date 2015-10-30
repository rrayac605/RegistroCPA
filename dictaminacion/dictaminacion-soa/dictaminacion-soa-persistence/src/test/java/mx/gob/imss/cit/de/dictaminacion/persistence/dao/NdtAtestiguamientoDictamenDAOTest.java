package mx.gob.imss.cit.de.dictaminacion.persistence.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import mx.gob.imss.cit.de.dictaminacion.model.NdcAtestiguamientoDO;
import mx.gob.imss.cit.de.dictaminacion.model.NdcEstadoAtestiguamientoDO;
import mx.gob.imss.cit.de.dictaminacion.model.NdtAtestiguamientoDictamenDO;
import mx.gob.imss.cit.de.dictaminacion.model.NdtPatronDictamenDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.base.AbstractDBTestUnit;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.impl.NdtAtestiguamientoDictamenDAOImpl;

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
	
	@Test
	public void testSaveAtestiguamientoDictamenDAO_Error() {
		LOG.info("prueba");
		Boolean error= false;
		NdtAtestiguamientoDictamenDO ndtAtestiguamientoDictamenDO = new NdtAtestiguamientoDictamenDO();
		try{
		localDAO.create(ndtAtestiguamientoDictamenDO);
		}catch(Exception e){
		//	LOG.error(e.getMessage(), e);
			error = true;
		}
		Assert.assertFalse(error);
	}
	
	@Test
	public void testSaveAtestiguamientoDictamenDAO_Ok() {
		LOG.info("prueba");
		Boolean error = true;
		Date fecha = new Date();
		Date fechaFinal = new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy"); 
		try {
			fechaFinal = sdf.parse(sdf.format(fecha));
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		NdtPatronDictamenDO ndtPatronDictamenDO = new NdtPatronDictamenDO(63L);
		NdcAtestiguamientoDO ndcAtestiguamientoDO= new NdcAtestiguamientoDO(1L);
		NdcEstadoAtestiguamientoDO ndcEstadoAtestiguamientoDO = new NdcEstadoAtestiguamientoDO(2L);
		NdtAtestiguamientoDictamenDO ndtAtestiguamientoDictamenDO = new NdtAtestiguamientoDictamenDO();
		ndtAtestiguamientoDictamenDO.setCveIdPatronDictamen(ndtPatronDictamenDO);
		ndtAtestiguamientoDictamenDO.setCveIdAtestiguamiento(ndcAtestiguamientoDO);
		ndtAtestiguamientoDictamenDO.setCveIdEstadoAtestiguamiento(ndcEstadoAtestiguamientoDO);
		ndtAtestiguamientoDictamenDO.setFecRegistroActualizado(fechaFinal);
		ndtAtestiguamientoDictamenDO.setFecRegistroAlta(fechaFinal);
		ndtAtestiguamientoDictamenDO.setFecRegistroBaja(null);
		ndtAtestiguamientoDictamenDO.setCveIdUsuario(null);
		
		
		try{
		localDAO.create(ndtAtestiguamientoDictamenDO);
		}catch(Exception e){
			LOG.error(e.getMessage(), e);
			error = false;
		}
		Assert.assertTrue(error);
	}
	
	@Test
	public void testGetDetalleExamenByAtestiguamiento() {
		LOG.info("prueba");
		NdtAtestiguamientoDictamenDO ndtAtestiguamientoDictamenDO = new NdtAtestiguamientoDictamenDO();
		NdcAtestiguamientoDO ndcAtestiguamientoDAO = new NdcAtestiguamientoDO();
		NdcEstadoAtestiguamientoDO ndcEstadoAtestiguamientoDO = new NdcEstadoAtestiguamientoDO();
		NdtPatronDictamenDO ndtPatronDictamenDO = new NdtPatronDictamenDO();
		ndcAtestiguamientoDAO.setCveIdAtestiguamiento(10L);
		ndcEstadoAtestiguamientoDO.setCveIdEstadoAtestiguamiento(2L);
		ndtPatronDictamenDO.setCveIdPatronDictamen(63L);	
		ndtAtestiguamientoDictamenDO.setCveIdAtestiguamiento(ndcAtestiguamientoDAO);
		ndtAtestiguamientoDictamenDO.setCveIdEstadoAtestiguamiento(ndcEstadoAtestiguamientoDO);
		ndtAtestiguamientoDictamenDO.setCveIdPatronDictamen(ndtPatronDictamenDO);
		ndtAtestiguamientoDictamenDO  = localDAO.getDetalleExamenByAtestiguamiento(ndtAtestiguamientoDictamenDO);
		LOG.info(ndtAtestiguamientoDictamenDO.getCveIdAtestiguamiento().getDesAtestiguamiento());
		Assert.assertNotNull(ndtAtestiguamientoDictamenDO);
	}

}
