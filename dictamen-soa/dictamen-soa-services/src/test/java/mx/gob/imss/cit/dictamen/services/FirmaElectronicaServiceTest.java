/**
 * 
 */
package mx.gob.imss.cit.dictamen.services;

import mx.gob.imss.cit.dictamen.commons.to.FirmaElectronicaTO;
import mx.gob.imss.cit.dictamen.services.base.AbstractServiceTestUnit;
import mx.gob.imss.cit.dictamen.services.impl.FirmaElectronicaServiceImpl;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * @author ajfuentes
 *
 */
public class FirmaElectronicaServiceTest extends AbstractServiceTestUnit{
	
	private Logger LOG=Logger.getLogger(FirmaElectronicaServiceTest.class);
	
	private FirmaElectronicaService electronicaService;

    public void setUp() {
    	super.setUp();    	
    	electronicaService=new  FirmaElectronicaServiceImpl();        
        connect(electronicaService);
    }
    
    @Test
    public void test_inicializarFirma(){
    	FirmaElectronicaTO firmaElectronicaTO=electronicaService.executeInitFirmaElectronica();
    	LOG.info(firmaElectronicaTO.getFielCodebase());
    }
}
