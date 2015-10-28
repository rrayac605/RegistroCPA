package mx.gob.imss.cit.dictamen.contador.services.impl;

import java.io.IOException;

import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.dictamen.contador.services.NotariaService;


import mx.gob.imss.ctirss.delta.model.firma.PeticionFirmadoSimple;
import mx.gob.imss.ctirss.delta.model.firma.RespuestaFirmadoSimple;
import mx.com.metatrust.doctrust.wsfirmaelectronicaseg.FirmaElectronicaSegPortType;
import mx.com.metatrust.doctrust.wsfirmaelectronicaseg.FirmaElectronicaSegService;
import mx.com.metatrust.doctrust.wsfirmaelectronicaseg.FirmaSimpleRequestType;
import mx.com.metatrust.doctrust.wsfirmaelectronicaseg.FirmaSimpleResponseType;
import mx.com.metatrust.doctrust.wsfirmaelectronicaseg.ObjectFactory;
import mx.com.metatrust.doctrust.wsfirmaelectronicaseg.ResultadoType;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

@Stateless(name  = "notariaService", mappedName = "notariaService")
public class NotariaServiceImpl implements NotariaService{

	private static final Logger LOGGER = Logger.getLogger(BdtuServiceImpl.class);


	private Object convertirAObjeto(String json, String clase) throws RuntimeException {
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
	
	private String convertirAJSON(Object object, String clase) throws RuntimeException {
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
	
	
	@Override
	public RespuestaFirmadoSimple getSelloDigital(String cadenaOriginal,
			String secuenciaNotaria, String rfc) throws RuntimeException {

		RespuestaFirmadoSimple firma = null;
		try {
			String serie = "ID-SELLOS-1";
			PeticionFirmadoSimple peticion = new PeticionFirmadoSimple();

			String jsonParams = null;

			peticion.setId_llavefirma(serie);

			if (secuenciaNotaria != null) {
				peticion.setTramite(secuenciaNotaria);
			} else {
				peticion.setAplicacion("AplPruebas");
				if (rfc == null) {
					rfc = "IMS421231I45";
				}
				peticion.setRfc(rfc);
			}
			peticion.setCadenaoriginal(cadenaOriginal);

			jsonParams = this.convertirAJSON(peticion, PeticionFirmadoSimple.class.getName());

			LOGGER.info("Los parametros para la firma son: "+ jsonParams);
			LOGGER.info("Serie: " + serie);

			ObjectFactory objf = new ObjectFactory();
			FirmaSimpleRequestType fsrt = objf.createFirmaSimpleRequestType();
			fsrt.setJsonParms(jsonParams);
			FirmaElectronicaSegService firmaElectronicaSegService = new FirmaElectronicaSegService();
			FirmaElectronicaSegPortType firmaElectronicaSegPortType = firmaElectronicaSegService.getFirmaElectronicaSegPortTypePort();

			FirmaSimpleResponseType respuestaFirmado = firmaElectronicaSegPortType.firmaSimple(fsrt);

			ResultadoType resultado = respuestaFirmado.getResultado();
			if (resultado.getCodigo() != 0) {
				System.out.println("Codigo: " + resultado.getCodigo());
				System.out.println("Descripcion: " + resultado.getTexto());
			} else {
				LOGGER.info("la respuesta del servicio es: "
						+ respuestaFirmado.getJsonSalida());
				firma = (RespuestaFirmadoSimple) this.convertirAObjeto(
						respuestaFirmado.getJsonSalida(),
						RespuestaFirmadoSimple.class.getName());

				LOGGER.info("Secuencia de notaria arrojada por la firma: "
						+ firma.getId());
				LOGGER.info("Numero de serie firmante: " + firma.getNoSerie());
				LOGGER.info("Firma: " + firma.getSello());
			}

		} catch (Exception ex) {
			LOGGER.info("Error en el servicio de notar\u00eda.", ex);
			throw new RuntimeException("Error en el servicio de notar\u00eda.", ex);
		}
		System.out.println("SelloImss "+firma.getSello());
		return firma;
	}

	@Override
	public void guardarArchivoFirmado(String secuenciaNotaria, String arch,
			String nombreArchivo) throws RuntimeException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String generaArchivoEnvioNotaria(byte[] archivo) {
		// TODO Auto-generated method stub
		return null;
	}

}
