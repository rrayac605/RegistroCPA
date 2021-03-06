package mx.gob.imss.cit.de.dictaminacion.services;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import mx.gob.imss.cit.de.dictaminacion.commons.to.ParentLayoutTO;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.EjercicioFiscalTO;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.PatronDictamenTO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.base.AbstractDBTestUnit;
import mx.gob.imss.cit.de.dictaminacion.services.AWSService;
import mx.gob.imss.cit.de.dictaminacion.services.AseveracionService;
import mx.gob.imss.cit.de.dictaminacion.services.KeyGeneratorService;
import mx.gob.imss.cit.de.dictaminacion.services.LayoutPatronAsociadoService;
import mx.gob.imss.cit.de.dictaminacion.services.impl.AWSServiceImpl;
import mx.gob.imss.cit.de.dictaminacion.services.impl.AseveracionServiceImpl;
import mx.gob.imss.cit.de.dictaminacion.services.impl.KeyGeneratorServiceImpl;
import mx.gob.imss.cit.de.dictaminacion.services.impl.LayoutPatronAsociadoServiceImpl;

public class LayoutPatronAsociadoServiceTest extends AbstractDBTestUnit {
	private Logger LOG=Logger.getLogger(LayoutPatronAsociadoServiceTest.class);		
	private LayoutPatronAsociadoService layoutPatronAsociadoService = new LayoutPatronAsociadoServiceImpl();
	private AseveracionService layoutService = new AseveracionServiceImpl();
	private KeyGeneratorService keyGeneratorService = new KeyGeneratorServiceImpl();
	private AWSService aWSService = new AWSServiceImpl();
	
	@Before
	public void init() throws Exception {
		super.setUp();
		layoutPatronAsociadoService = new LayoutPatronAsociadoServiceImpl();
		layoutService = new AseveracionServiceImpl();
		keyGeneratorService = new KeyGeneratorServiceImpl();
		aWSService = new AWSServiceImpl();
		layoutPatronAsociadoService.setLayoutService(layoutService);
		layoutPatronAsociadoService.setKeyGeneratorService(keyGeneratorService);
		layoutPatronAsociadoService.setAWSService(aWSService);
		connect(layoutPatronAsociadoService);
		connect(layoutService);
	}	
	
	@Test
	public void testFindLayoutAWSService(){		
		List<ParentLayoutTO> salida = null;
		String anioEjercicio = "2014";
		String rfcContador = "CIT970206HB6";
		String rfcPAtron = "MASC870401GQ8";
		try {					

			PatronDictamenTO patronDictamenTO=new PatronDictamenTO();
			patronDictamenTO.setDesRfc(rfcPAtron);
			EjercicioFiscalTO ejercicioFiscalTO=new EjercicioFiscalTO();
			ejercicioFiscalTO.setDesEjerFiscal(anioEjercicio);
			patronDictamenTO.setIndPatronConstruccion((short)1);
			patronDictamenTO.setIndRealizoActConstruccion((short)0);
			patronDictamenTO.setCveIdEjerFiscal(ejercicioFiscalTO);
			
			salida = layoutPatronAsociadoService.findLayoutAWSService(patronDictamenTO,rfcContador);
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
		}
		Assert.assertNotNull(salida);
	}
	
}
