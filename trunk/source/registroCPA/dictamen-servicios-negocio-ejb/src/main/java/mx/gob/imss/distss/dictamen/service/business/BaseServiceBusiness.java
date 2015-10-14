package mx.gob.imss.distss.dictamen.service.business;

import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;

public class BaseServiceBusiness {
	
private static final Logger logger = LoggerFactory.getLogger(BaseServiceBusiness.class);
	
	InitialContext initialContextBDTU = null;
	
	protected void initContextBDTU() throws NamingException {
		Hashtable<String, String> hashtable = new Hashtable<String, String>(7);
		hashtable.put(Context.INITIAL_CONTEXT_FACTORY, getPropiedad("service.bdtu.provider.context"));
		hashtable.put(Context.PROVIDER_URL, getPropiedad("service.bdtu.provider.url"));
		hashtable.put(Context.SECURITY_PRINCIPAL, getPropiedad("service.bdtu.security.principal"));
		hashtable.put(Context.SECURITY_CREDENTIALS, getPropiedad("service.bdtu.security.credentials"));
		initialContextBDTU = new InitialContext(hashtable);
	}
	
	protected Object getServiceBDTU(String nombreService) {
		Object object = null;
		try {
			logger.info("Inicializando InitialContext con el servicio: "+ getPropiedad(nombreService));
			object = initialContextBDTU.lookup(getPropiedad(nombreService));
		} catch(Exception ex) {
			ex.printStackTrace();
			logger.info("ERROR: No se pudo inicializar el InitialContext con el servicio: ." +getPropiedad(nombreService), ex);
		}		
		return object;
	}
	
	protected void closeContextBDTU() {
		try {
			if (initialContextBDTU != null) {
				initialContextBDTU.close();
			}
		} catch (NamingException ex) {
			ex.printStackTrace();
			logger.info("ERROR: No se pudo cerrar el InitialContext de la BDTU.", ex);
		}
	}
	
	/**
	 * Método para obtener el valor de una propiedad definida en el archivo config.properties
	 * 
	 * @param propiedad
	 * @return String
	 * @throws RuntimeException
	 */
	private String getPropiedad(String propiedad) throws RuntimeException {
		String propertie = null;
		Properties properties = new Properties();

		try {
			InputStream inputStream = new ClassPathResource("config.properties").getInputStream();
			properties.load(inputStream);
			inputStream.close();
			propertie = properties.getProperty(propiedad);
		} catch (IOException ex) {
			throw new RuntimeException("ERROR: No se pudo leer el archivo de propiedades config.properties.", ex);
		} catch (Exception ex) {
			throw new RuntimeException("ERROR: No se pudo obtener el valor de las propiedades del archivo config.properties.", ex);
		}
		return propertie;
	}

}
