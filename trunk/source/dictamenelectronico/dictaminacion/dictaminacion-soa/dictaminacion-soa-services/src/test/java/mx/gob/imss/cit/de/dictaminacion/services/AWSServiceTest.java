/**
 * 
 */
package mx.gob.imss.cit.de.dictaminacion.services;

import java.text.ParseException;

import mx.gob.imss.cit.de.dictaminacion.commons.exception.DictamenException;
import mx.gob.imss.cit.de.dictaminacion.commons.to.AWSPolicyTO;
import mx.gob.imss.cit.de.dictaminacion.commons.util.FechasUtils;
import mx.gob.imss.cit.de.dictaminacion.services.AWSService;
import mx.gob.imss.cit.de.dictaminacion.services.impl.AWSServiceImpl;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * @author ajfuentes
 *
 */
public class AWSServiceTest{
	
	private Logger LOG=Logger.getLogger(AWSServiceTest.class);
	/**
	 * Setvicio BovedaService para pruebas unitarias
	 */	

	private AWSService awsService;
	
	/**
	 * Método de configuración para pruebas unitarias
	 * @throws Exception
	 */
	@Before
	public void init() throws Exception {	
		 awsService=new AWSServiceImpl();
	}


    
	/**
	 * Prueba unitaria para crear documento en boveda.
	 */
	@Test
	public void testCrearPolitica(){
		
		
		AWSPolicyTO awsPolicyTO=null;
		try {
			
//			String rfcContador="";
//			String rfcPatron="";
//			StringBuilder rutaDestino = new StringBuilder(PropertiesConfigUtils.getPropertyConfig(DictamenServicesConstants.CONFIG_KEY_AWS_RUTA_BASE));
//			rutaDestino.append(rfcContador);
//			rutaDestino.append(DictamenServicesConstants.CARACTER_SLASH);
//			rutaDestino.append(rfcPatron);
//			rutaDestino.append(DictamenServicesConstants.CARACTER_SLASH);
			
			StringBuilder rutaDestino = new StringBuilder("Dictamen/");
			
			awsPolicyTO=awsService.getAwsPoliciyEncrypted(FechasUtils.stringToDate_yyyy_MM_dd_HH_mm_ss_SSS("2015/09/30 00:00:00.000"),rutaDestino.toString());
			
		} catch (DictamenException e) {
			LOG.error(e.getMessage());
		} catch (ParseException e) {
			LOG.error(e.getMessage());
		}
		
		LOG.info(awsPolicyTO.getPolicy());
		LOG.info(awsPolicyTO.getSignature());
		
		Assert.assertNotNull(awsPolicyTO);
		
	}
	

}
