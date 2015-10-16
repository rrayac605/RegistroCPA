package mx.gob.imss.cit.dictamen.persistence.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import mx.gob.imss.cit.dictamen.model.NdcOpcionPreguntaDO;
import mx.gob.imss.cit.dictamen.model.NdtAtestigPreguntasRespuestDO;
import mx.gob.imss.cit.dictamen.model.NdtRubroAtestiguamientoDictDO;
import mx.gob.imss.cit.dictamen.persistence.dao.base.AbstractDBTestUnit;
import mx.gob.imss.cit.dictamen.persistence.dao.impl.NdtAtestigPreguntasRespuestDAOImpl;

public class NdtAtestigPreguntasRespuestDAOTest  extends AbstractDBTestUnit {
	
	private NdtAtestigPreguntasRespuestDAO localDAO = new NdtAtestigPreguntasRespuestDAOImpl();

	private static final Logger LOG = Logger.getLogger(NdtAtestigPreguntasRespuestDAO.class);

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
	public void testSaveNdtAtestigPreguntasRespuestDAO_Error() {
		Boolean error = false;
		LOG.info("prueba");
		NdtAtestigPreguntasRespuestDO ndtAtestigPreguntasRespuestDO = new NdtAtestigPreguntasRespuestDO();
		try{
		localDAO.create(ndtAtestigPreguntasRespuestDO);
		}catch(Exception e){
			LOG.error(e.getMessage(), e);
			error = true;
		}
		Assert.assertFalse(error);
	}
	
	@Test
	public void testSaveNdtAtestigPreguntasRespuestDAO_Ok() {
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
				
		NdcOpcionPreguntaDO ndcOpcionPreguntaDO = new NdcOpcionPreguntaDO(1l);
		NdtAtestigPreguntasRespuestDO ndtAtestigPreguntasRespuestDO = new NdtAtestigPreguntasRespuestDO();
		NdtRubroAtestiguamientoDictDO ndtRubroAtestiguamientoDictDO = new NdtRubroAtestiguamientoDictDO(1L);
		ndtAtestigPreguntasRespuestDO.setCveIdOpcionPregunta(ndcOpcionPreguntaDO);
		ndtAtestigPreguntasRespuestDO.setCveIdRubroAtestigDictamen(ndtRubroAtestiguamientoDictDO);
		ndtAtestigPreguntasRespuestDO.setDesObservaciones(null);
		ndtAtestigPreguntasRespuestDO.setFecRegistroActualizado(fechaFinal);
		ndtAtestigPreguntasRespuestDO.setFecRegistroAlta(fechaFinal);
		ndtAtestigPreguntasRespuestDO.setFecRegistroBaja(null);
		ndtAtestigPreguntasRespuestDO.setCveIdUsuario(null);

		try{
		localDAO.create(ndtAtestigPreguntasRespuestDO);
		}catch(Exception e){
			LOG.error(e.getMessage(), e);
			error = false;
		}
		Assert.assertTrue(error);
	}

}
