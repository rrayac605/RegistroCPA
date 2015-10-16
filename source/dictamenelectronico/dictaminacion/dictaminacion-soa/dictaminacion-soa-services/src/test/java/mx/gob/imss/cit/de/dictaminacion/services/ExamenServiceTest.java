package mx.gob.imss.cit.de.dictaminacion.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import mx.gob.imss.cit.de.dictaminacion.commons.exception.DictamenException;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.AtestigPreguntasRespuestTO;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.AtestiguamientoDictamenTO;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.AtestiguamientoTO;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.EstadoAtestiguamientoTO;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.OpcionPreguntaTO;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.PatronDictamenTO;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.RubroAtestiguamientoDictTO;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.RubroTO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.base.AbstractDBTestUnit;
import mx.gob.imss.cit.de.dictaminacion.services.ExamenService;
import mx.gob.imss.cit.de.dictaminacion.services.impl.ExamenServiceImpl;

public class ExamenServiceTest extends AbstractDBTestUnit {
private Logger LOG=Logger.getLogger(ExamenServiceTest.class);
	
	
	
	private ExamenService examenService;

	
	@Before
	public void init() throws Exception {	
		super.setUp();
		examenService=new ExamenServiceImpl();
		connect(examenService);
	}
	
	
	@Test
	public void testFindExamenByIdPatronDictamen(){
		List<AtestiguamientoDictamenTO> atestiguamientosTOList = new ArrayList<AtestiguamientoDictamenTO>();
		try {
			atestiguamientosTOList = examenService.findExamenByIdPatronDictamen(63L);
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
		}
		Assert.assertNotNull(atestiguamientosTOList);
	}
	
	@Test
	public void testGetDetalleExamenByAtestiguamiento(){
		AtestiguamientoTO atestiguamientoTO  = null;
		try {
		 atestiguamientoTO = examenService.getDetalleExamenByAtestiguamiento(2L, 10L);
				
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
		}
		Assert.assertNotNull(atestiguamientoTO);
	}
	
	
	@Test
	public void testSaveByExamenAtestiguamiento_Error(){
		AtestiguamientoDictamenTO atestiguamientoDictamenTO = new AtestiguamientoDictamenTO();
		Boolean error = false;
		try {
			examenService.saveExamenAtestiguamiento(atestiguamientoDictamenTO);
		} catch(DictamenException de){
			error = true;
			LOG.error(de.getMessage(),de);
		}catch (Exception e) {
			error = true;
			LOG.error(e.getMessage(),e);
		}
		Assert.assertTrue(error);
	}
	
	@Test
	public void testSaveByExamenAtestiguamiento_Ok(){
		Boolean error = false;
		Date fecha = new Date();
		Date fechaFinal = new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy"); 
		try {
			fechaFinal = sdf.parse(sdf.format(fecha));
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		PatronDictamenTO patronDictamenTO = new PatronDictamenTO();
		patronDictamenTO.setCveIdPatronDictamen(63L);
		AtestiguamientoTO atestiguamientoTO = new AtestiguamientoTO();
		atestiguamientoTO.setCveIdAtestiguamiento(1L);
		EstadoAtestiguamientoTO estadoAtestiguamientoTO = new EstadoAtestiguamientoTO();
		estadoAtestiguamientoTO.setCveIdEstadoAtestiguamiento(2L);
		AtestiguamientoDictamenTO atestiguamientoDictamenTO = new AtestiguamientoDictamenTO();
		atestiguamientoDictamenTO.setCveIdAtestigDictamen(10L);
		atestiguamientoDictamenTO.setCveIdPatronDictamen(patronDictamenTO);
		atestiguamientoDictamenTO.setCveIdAtestiguamiento(atestiguamientoTO);
		atestiguamientoDictamenTO.setCveIdEstadoAtestiguamiento(estadoAtestiguamientoTO);
		atestiguamientoDictamenTO.setFecRegistroActualizado(fechaFinal);
		atestiguamientoDictamenTO.setFecRegistroAlta(fechaFinal);
		atestiguamientoDictamenTO.setFecRegistroBaja(null);
		atestiguamientoDictamenTO.setCveIdUsuario(null);
		
		RubroTO rubroTO = new RubroTO();
		rubroTO.setCveIdRubro(1l);
		RubroAtestiguamientoDictTO rubroAtestiguamientoDictTO = new RubroAtestiguamientoDictTO();
		rubroAtestiguamientoDictTO.setCveIdUsuario(null);
		rubroAtestiguamientoDictTO.setFecRegistroActualizado(fechaFinal);
		rubroAtestiguamientoDictTO.setFecRegistroAlta(fechaFinal);
		rubroAtestiguamientoDictTO.setFecRegistroBaja(null); 
		rubroAtestiguamientoDictTO.setIndAplica((short) 1);
		rubroAtestiguamientoDictTO.setCveIdRubro(rubroTO);
		rubroAtestiguamientoDictTO.setCveIdAtestigDictamen(atestiguamientoDictamenTO);
		
		OpcionPreguntaTO opcionPreguntaTO = new OpcionPreguntaTO();
		opcionPreguntaTO.setCveIdOpcionPregunta(1l);
		AtestigPreguntasRespuestTO atestigPreguntasRespuestTO = new AtestigPreguntasRespuestTO();
		atestigPreguntasRespuestTO.setCveIdOpcionPregunta(opcionPreguntaTO);
		atestigPreguntasRespuestTO.setCveIdRubroAtestigDictamen(rubroAtestiguamientoDictTO);
		atestigPreguntasRespuestTO.setDesObservaciones(null);
		atestigPreguntasRespuestTO.setFecRegistroActualizado(fechaFinal);
		atestigPreguntasRespuestTO.setFecRegistroAlta(fechaFinal);
		atestigPreguntasRespuestTO.setFecRegistroBaja(null);
		atestigPreguntasRespuestTO.setCveIdUsuario(null);
		
		List<AtestigPreguntasRespuestTO> atestigPreguntasRespuestTOList = new ArrayList<AtestigPreguntasRespuestTO>();
		atestigPreguntasRespuestTOList.add(atestigPreguntasRespuestTO);
		rubroAtestiguamientoDictTO.setNdtAtestigPreguntasRespuesta(atestigPreguntasRespuestTOList);
		List<RubroAtestiguamientoDictTO> rubroAtestiguamientoDictTOList = new ArrayList<RubroAtestiguamientoDictTO>();
		rubroAtestiguamientoDictTOList.add(rubroAtestiguamientoDictTO);
		atestiguamientoDictamenTO.setNdtRubrosAtestiguamiento(rubroAtestiguamientoDictTOList);
		
		try {
			examenService.saveExamenAtestiguamiento(atestiguamientoDictamenTO);
		} catch (Exception e) {
			error = true;
			LOG.error(e.getMessage(),e);
		}
		Assert.assertFalse(error);
	}

}
