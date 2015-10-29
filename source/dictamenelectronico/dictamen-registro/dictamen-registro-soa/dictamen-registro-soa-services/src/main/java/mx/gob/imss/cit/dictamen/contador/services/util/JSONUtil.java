package mx.gob.imss.cit.dictamen.contador.services.util;

import java.io.IOException;

import mx.gob.imss.cit.dictamen.contador.services.impl.BdtuServiceImpl;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public final class JSONUtil {
	private static final Logger LOGGER = Logger.getLogger(BdtuServiceImpl.class);

	public static Object unmarshall(String json, String clase) throws RuntimeException {
		ObjectMapper mapper = new ObjectMapper();
		Object object = null;
		LOGGER.warn("El string del json a convertir es : " + json + " y se convertira a : " + clase);
		try {
			
			object = mapper.readValue(json, Class.forName(clase));
		} catch (JsonParseException ex) {
			LOGGER.error("Error en el parseo a JSON", ex);
			throw new RuntimeException("Error en el parseo a JSON al obtener el sello digital.", ex);
		} catch (JsonMappingException ex) {
			LOGGER.error("Error en el parseo a JSON", ex);
			throw new RuntimeException("Error al generar el JSON al obtener el sello digital.", ex);
		} catch (IOException ex) {
			LOGGER.error("Error al obtener el sello digital.", ex);
			throw new RuntimeException("Error al obtener el sello digital.", ex);
		} catch (ClassNotFoundException ex) {
			LOGGER.error("Error al obtener el sello digital, no se encontro la clase.", ex);
			throw new RuntimeException("Error al obtener el sello digital, no se encontr\u00f3 la clase.", ex);
		}
		
		LOGGER.warn("Se ha generado correctamente el objeto a partir de un string json");
		try {
			return Class.forName(clase).cast(object);
		} catch (ClassNotFoundException ex) {
			LOGGER.error("Error al obtener el sello digital, no se encontro la clase.", ex);
			throw new RuntimeException("Error al obtener el sello digital, no se encontr\u00f3 la clase.", ex);
		}
	}
	
	public static String marshall(Object object, String clase) throws RuntimeException {
		ObjectMapper mapper = new ObjectMapper();
		String jsonParams = null;
		try {
			jsonParams = mapper.writeValueAsString((Class.forName(clase).cast(object)));
		} catch (JsonGenerationException ex) {
			LOGGER.error("Error al generar el JSON.", ex);
			throw new RuntimeException("Error al generar el JSON.", ex);
		} catch (JsonMappingException ex) {
			LOGGER.error("Error en el mapeo del JSON.", ex);
			throw new RuntimeException("Error en el mapeo del JSON.", ex);
		} catch (IOException ex) {
			LOGGER.error("Error en el parseo a JSON", ex);
			throw new RuntimeException("Error en el parseo de JSON", ex);
		} catch (ClassNotFoundException ex) {
			LOGGER.error("Error al convertir el JSON, no se encontro la clase.", ex);
			throw new RuntimeException("Error al convertir el JSON, no se encontr\u00f3 la clase.", ex);
		}
		return jsonParams;
	}
}
