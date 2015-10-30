package mx.gob.imss.cit.dictamen.contador.services;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.apache.log4j.Logger;
import mx.gob.imss.cit.dictamen.contador.services.util.PropertiesConfigUtils;


public class BaseBdtuService {
	private static final Logger LOGGER = Logger.getLogger(BaseBdtuService.class);

	private InitialContext initialContextBDTU = null;
     
	public void init() throws NamingException{
		
		Hashtable<String, String> hashtable = new Hashtable<String, String>(7);
		hashtable.put(Context.INITIAL_CONTEXT_FACTORY, PropertiesConfigUtils.getPropertyConfig("service.bdtu.provider.context"));
		hashtable.put(Context.PROVIDER_URL, PropertiesConfigUtils.getPropertyConfig("service.bdtu.provider.url"));
		hashtable.put(Context.SECURITY_PRINCIPAL, PropertiesConfigUtils.getPropertyConfig("service.bdtu.security.principal"));
		hashtable.put(Context.SECURITY_CREDENTIALS, PropertiesConfigUtils.getPropertyConfig("service.bdtu.security.credentials"));
		initialContextBDTU = new InitialContext(hashtable);
	}
	
	
	protected Object locate(String nombreService) {
		Object object = null;
		String nombrePropService= PropertiesConfigUtils.getPropertyConfig(nombreService);

		try {
			LOGGER.info("Inicializando InitialContext con el servicio: "+ nombrePropService);
			object = initialContextBDTU.lookup(nombrePropService);
		} catch(Exception ex) {
			ex.printStackTrace();
			LOGGER.info("ERROR: No se pudo inicializar el InitialContext con el servicio: ." + nombrePropService, ex);
		}		
		return object;
	}
	
	protected void close() {
		try {
			if (initialContextBDTU != null) {
				initialContextBDTU.close();
			}
		} catch (NamingException namingException) {
			LOGGER.error("ERROR: No se pudo cerrar el InitialContext de la BDTU:"+namingException.getMessage(), 
					     namingException);
		}
	}
	public InitialContext getInitialContextBDTU() {
		return initialContextBDTU;
	}

	public void setInitialContextBDTU(InitialContext initialContextBDTU) {
		this.initialContextBDTU = initialContextBDTU;
	}
     
}
