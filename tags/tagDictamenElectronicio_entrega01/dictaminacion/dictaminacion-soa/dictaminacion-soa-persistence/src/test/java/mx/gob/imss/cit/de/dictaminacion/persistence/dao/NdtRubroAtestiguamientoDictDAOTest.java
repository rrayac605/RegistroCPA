package mx.gob.imss.cit.de.dictaminacion.persistence.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import mx.gob.imss.cit.de.dictaminacion.model.NdcRubroDO;
import mx.gob.imss.cit.de.dictaminacion.model.NdtAtestiguamientoDictamenDO;
import mx.gob.imss.cit.de.dictaminacion.model.NdtRubroAtestiguamientoDictDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdtRubroAtestiguamientoDictDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.base.AbstractDBTestUnit;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.impl.NdtRubroAtestiguamientoDictDAOImpl;

public class NdtRubroAtestiguamientoDictDAOTest extends AbstractDBTestUnit {
	
	private NdtRubroAtestiguamientoDictDAO localDAO = new NdtRubroAtestiguamientoDictDAOImpl();

	private static final Logger LOG = Logger.getLogger(NdtRubroAtestiguamientoDictDAO.class);

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
	public void testSaveNdtRubroAtestiguamientoDictDAO_Error() {
		Boolean error = false;
		LOG.info("prueba");
		NdtRubroAtestiguamientoDictDO ndtRubroAtestiguamientoDictDO = new NdtRubroAtestiguamientoDictDO();
		try{
		localDAO.create(ndtRubroAtestiguamientoDictDO);
		}catch(Exception e){
			LOG.error(e.getMessage(), e);
			error = true;
		}
		Assert.assertFalse(error);
	}
	
	@Test
	public void testSaveNdtRubroAtestiguamientoDictDAO_Ok() {
		LOG.info("prueba");
		Boolean error = true;
		Date fecha = new Date();
		Date fechaFinal = new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy"); 
		try {
			fechaFinal = sdf.parse(sdf.format(fecha));
		} catch (ParseException e) {
			LOG.error(e.getMessage(), e);
		}
				
		NdcRubroDO ndcRubroDO = new NdcRubroDO(1l);
		NdtAtestiguamientoDictamenDO ndtAtestiguamientoDictamenDO = new NdtAtestiguamientoDictamenDO(1L);
		NdtRubroAtestiguamientoDictDO ndtRubroAtestiguamientoDictDO = new NdtRubroAtestiguamientoDictDO();
		ndtRubroAtestiguamientoDictDO.setCveIdUsuario(null);
		ndtRubroAtestiguamientoDictDO.setFecRegistroActualizado(fechaFinal);
		ndtRubroAtestiguamientoDictDO.setFecRegistroAlta(fechaFinal);
		ndtRubroAtestiguamientoDictDO.setFecRegistroBaja(null); 
		ndtRubroAtestiguamientoDictDO.setIndAplica((short) 1);
		ndtRubroAtestiguamientoDictDO.setCveIdRubro(ndcRubroDO);
		ndtRubroAtestiguamientoDictDO.setCveIdAtestigDictamen(ndtAtestiguamientoDictamenDO);

		try{
		localDAO.create(ndtRubroAtestiguamientoDictDO);
		}catch(Exception e){
			LOG.error(e.getMessage(), e);
			error = false;
		}
		Assert.assertTrue(error);
	}
	

}
