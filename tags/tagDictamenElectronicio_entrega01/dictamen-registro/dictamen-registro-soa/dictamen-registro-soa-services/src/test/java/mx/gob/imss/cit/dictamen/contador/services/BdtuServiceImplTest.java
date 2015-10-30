package mx.gob.imss.cit.dictamen.contador.services;

import mx.gob.imss.cit.dictamen.contador.services.impl.BdtuServiceImpl;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Fisica;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Persona;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.log4j.BasicConfigurator;
import org.junit.Before;

public class BdtuServiceImplTest  {
    private static final Logger LOGGER = LoggerFactory.getLogger(BdtuServiceImplTest.class);


    @Before
    public void init() throws Exception
    {
        // Log4J junit configuration.
        BasicConfigurator.configure();
    }
    
	@Test
	public void testGetPatronDictamen(){
		Assert.assertTrue(true);

		 boolean to=false;
		 
		LOGGER.debug("tst");
		LOGGER.debug("cargando1");

		try {
			LOGGER.debug("cargando");
			BdtuServiceImpl bdtuServiceImpl = new BdtuServiceImpl();
			Fisica fisica = new Fisica();
		//	  LOGGER.debug("HEGM701104LB6");
			//fisica.setRfc("HEGM701104MDFRNR00");
			
		//	fisica.setCurp("HEGM701104MDFRNR00");
		 //   fisica.setRfc("HEGM701104LB6");
		    
			fisica.setCurp("SAAC820312HDFNLS06");
			fisica.setRfc("SAAC820312S96");
		    
			//Persona persona = bdtuServiceImpl.obtenerRegistroPersonaFisicaPorRFC(fisica);
			//LOGGER.debug("persona.curp="+persona.getRfc());
			//LOGGER.debug("persona.curp="+persona.getIdPersona());

			LOGGER.debug("razon: "+to);
		} catch (Exception e) {
			LOGGER.debug(e.getMessage(),e);
		}
	
	}
}
