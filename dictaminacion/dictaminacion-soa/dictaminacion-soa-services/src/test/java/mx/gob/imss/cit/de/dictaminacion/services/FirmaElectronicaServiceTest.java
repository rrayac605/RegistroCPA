/**
 * 
 */
package mx.gob.imss.cit.de.dictaminacion.services;

import mx.gob.imss.cit.de.dictaminacion.commons.exception.DictamenException;
import mx.gob.imss.cit.de.dictaminacion.commons.to.FirmaElectronicaTO;
import mx.gob.imss.cit.de.dictaminacion.services.FirmaElectronicaService;
import mx.gob.imss.cit.de.dictaminacion.services.impl.FirmaElectronicaServiceImpl;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * @author ajfuentes
 *
 */
public class FirmaElectronicaServiceTest{
	
	private Logger LOG=Logger.getLogger(FirmaElectronicaServiceTest.class);
	/**
	 * Setvicio BovedaService para pruebas unitarias
	 */	

	private FirmaElectronicaService firmaElectronicaService;
	
	/**
	 * Método de configuración para pruebas unitarias
	 * @throws Exception
	 */
	@Before
	public void init() throws Exception {	
		firmaElectronicaService=new FirmaElectronicaServiceImpl();
	}


    
	/**
	 * Prueba unitaria para crear documento en boveda.
	 */
	@Test
	public void testInitFirmaElectronica(){
		
		
		FirmaElectronicaTO firmaElectronicaTO=null;
		try {
			firmaElectronicaTO=firmaElectronicaService.executeInitFirmaElectronica();
			
			LOG.info(firmaElectronicaTO.getFielCodebase());
			LOG.info(firmaElectronicaTO.getFielParamUrlWsFe());
			LOG.info(firmaElectronicaTO.getFielParamOption());
			
		} catch (DictamenException e) {
			LOG.error(e.getMessage(),e);
		}
		
		
		Assert.assertNotNull(firmaElectronicaTO);
		
	}
	

}
