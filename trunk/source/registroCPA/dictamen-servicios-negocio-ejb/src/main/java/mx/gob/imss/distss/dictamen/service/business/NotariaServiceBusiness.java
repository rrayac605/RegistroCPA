package mx.gob.imss.distss.dictamen.service.business;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.ejb.Stateless;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;

import mx.com.metatrust.doctrust.wsfirmaelectronicaseg.FirmaElectronicaSegPortType;
import mx.com.metatrust.doctrust.wsfirmaelectronicaseg.FirmaElectronicaSegService;
import mx.com.metatrust.doctrust.wsfirmaelectronicaseg.FirmaSimpleRequestType;
import mx.com.metatrust.doctrust.wsfirmaelectronicaseg.FirmaSimpleResponseType;
import mx.com.metatrust.doctrust.wsfirmaelectronicaseg.ObjectFactory;
import mx.com.metatrust.doctrust.wsfirmaelectronicaseg.RegistroSeguimientoRequestType;
import mx.com.metatrust.doctrust.wsfirmaelectronicaseg.RegistroSeguimientoResponseType;
import mx.com.metatrust.doctrust.wsfirmaelectronicaseg.ResultadoType;
import mx.gob.imss.ctirss.delta.model.firma.Archivo;
import mx.gob.imss.ctirss.delta.model.firma.PeticionFirmadoSimple;
import mx.gob.imss.ctirss.delta.model.firma.PeticionGuardadoArchivosFirma;
import mx.gob.imss.ctirss.delta.model.firma.RespuestaFirmadoSimple;
import mx.gob.imss.ctirss.delta.model.firma.RespuestaGuardadoArchivosFirma;
import mx.gob.imss.distss.dictamen.service.interfaces.NotariaServiceLocal;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

@Stateless(name = "notariaServiceBean", mappedName = "notariaServiceBean")
public class NotariaServiceBusiness implements NotariaServiceLocal {

	
	private static final Logger logger = LoggerFactory.getLogger(NotariaServiceBusiness.class); 
	
	@Override
	public RespuestaFirmadoSimple getSelloDigital(String cadenaOriginal, String secuenciaNotaria, String rfc) throws RuntimeException {

		RespuestaFirmadoSimple firma = null;
		try {
			String serie = this.getPropiedadDeProperties("serie");
			PeticionFirmadoSimple peticion = new PeticionFirmadoSimple();

			String jsonParams = null;

			peticion.setId_llavefirma(serie);

			if (secuenciaNotaria != null) {
				peticion.setTramite(secuenciaNotaria);
			} else {
				peticion.setAplicacion(this.getPropiedadDeProperties("aplicacion"));
				if (rfc == null) {
					rfc = this.getPropiedadDeProperties("rfc.imss");
				}
				peticion.setRfc(rfc);
			}
			peticion.setCadenaoriginal(cadenaOriginal);

			jsonParams = this.convertirAJSON(peticion, PeticionFirmadoSimple.class.getName());

			System.out.println("Los parametros para la firma son: "+ jsonParams);
			System.out.println("Serie: " + serie);

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
				logger.warn("la respuesta del servicio es: "
						+ respuestaFirmado.getJsonSalida());
				firma = (RespuestaFirmadoSimple) this.convertirAObjeto(
						respuestaFirmado.getJsonSalida(),
						RespuestaFirmadoSimple.class.getName());

				logger.warn("Secuencia de notaria arrojada por la firma: "
						+ firma.getId());
				logger.warn("Numero de serie firmante: " + firma.getNoSerie());
				logger.warn("Firma: " + firma.getSello());
			}

		} catch (Exception ex) {
			logger.info("Error en el servicio de notar\u00eda.", ex);
			throw new RuntimeException("Error en el servicio de notar\u00eda.", ex);
		}
		System.out.println("SelloImss "+firma.getSello());
		return firma;
	}
	
	private Object convertirAObjeto(String json, String clase) throws RuntimeException {
		ObjectMapper mapper = new ObjectMapper();
		Object object = null;
		logger.warn("El string del json a convertir es : " + json + " y se convertira a : " + clase);
		try {
			object = mapper.readValue(json, Class.forName(clase));
		} catch (JsonParseException ex) {
			logger.error("Error en el parseo a JSON", ex);
			throw new RuntimeException("Error en el parseo a JSON al obtener el sello digital.", ex);
		} catch (JsonMappingException ex) {
			logger.error("Error en el parseo a JSON", ex);
			throw new RuntimeException("Error al generar el JSON al obtener el sello digital.", ex);
		} catch (IOException ex) {
			logger.error("Error al obtener el sello digital.", ex);
			throw new RuntimeException("Error al obtener el sello digital.", ex);
		} catch (ClassNotFoundException ex) {
			logger.error("Error al obtener el sello digital, no se encontro la clase.", ex);
			throw new RuntimeException("Error al obtener el sello digital, no se encontr\u00f3 la clase.", ex);
		}
		logger.warn("Se ha generado correctamente el objeto a partir de un string json");
		try {
			return Class.forName(clase).cast(object);
		} catch (ClassNotFoundException ex) {
			logger.error("Error al obtener el sello digital, no se encontro la clase.", ex);
			throw new RuntimeException("Error al obtener el sello digital, no se encontr\u00f3 la clase.", ex);
		}
	}
	
	private String getPropiedadDeProperties(String propiedad) throws RuntimeException {
		String propertie = null;
		Properties properties = new Properties();
		try {
			InputStream is = new ClassPathResource("firmaDigital.properties").getInputStream();
			properties.load(is);
			is.close();
			propertie = properties.getProperty(propiedad);
		} catch (IOException ex) {
			ex.printStackTrace();
			throw new RuntimeException("Error al obtener las propiedades de la firma digital.", ex);
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException("Error al obtener las propiedades de la firma digital.", ex);
		}
		return propertie;
	}
	
	private String convertirAJSON(Object object, String clase) throws RuntimeException {
		ObjectMapper mapper = new ObjectMapper();
		String jsonParams = null;
		try {
			jsonParams = mapper.writeValueAsString((Class.forName(clase).cast(object)));
		} catch (JsonGenerationException ex) {
			logger.error("Error al generar el JSON.", ex);
			throw new RuntimeException("Error al generar el JSON.", ex);
		} catch (JsonMappingException ex) {
			logger.error("Error en el mapeo del JSON.", ex);
			throw new RuntimeException("Error en el mapeo del JSON.", ex);
		} catch (IOException ex) {
			logger.error("Error en el parseo a JSON", ex);
			throw new RuntimeException("Error en el parseo de JSON", ex);
		} catch (ClassNotFoundException ex) {
			logger.error("Error al convertir el JSON, no se encontro la clase.", ex);
			throw new RuntimeException("Error al convertir el JSON, no se encontr\u00f3 la clase.", ex);
		}
		return jsonParams;
	}
	
	public void guardarArchivoFirmado(String secuenciaNotaria, String arch, String nombreArchivo) throws RuntimeException {
		String jsonParams = "";
		ObjectMapper mapper = new ObjectMapper();
		Archivo archivo = new Archivo();
		archivo.setNombre(nombreArchivo);
		archivo.setBuffer(arch);

		PeticionGuardadoArchivosFirma peticion = new PeticionGuardadoArchivosFirma();

		List<Archivo> archivos = new ArrayList<Archivo>();
		archivos.add(archivo);

		peticion.setTramite(secuenciaNotaria);
		peticion.setArchivos(archivos);

		try {
			jsonParams = mapper.writeValueAsString(peticion);
		} catch (JsonGenerationException ex) {
			logger.error("Error al generar el JSON.", ex);
			throw new RuntimeException("Error al generar el JSON.", ex);
		} catch (JsonMappingException ex) {
			logger.error("Error en el mapeo del JSON.", ex);
			throw new RuntimeException("Error en el mapeo del JSON.", ex);
		} catch (IOException ex) {
			logger.error("Error en el parseo a JSON", ex);
			throw new RuntimeException("Error en el parseo de JSON", ex);
		}

		logger.warn("Asi quedo el archivo objeto JSON: " + jsonParams);

		ObjectFactory of = new ObjectFactory();
		RegistroSeguimientoRequestType peticionSeguimiento = of.createRegistroSeguimientoRequestType();
		peticionSeguimiento.setJsonParms(jsonParams);

		FirmaElectronicaSegService firmaElectronicaSegService = new FirmaElectronicaSegService();
		FirmaElectronicaSegPortType firmaElectronicaSegPortType = firmaElectronicaSegService.getFirmaElectronicaSegPortTypePort();

		RegistroSeguimientoResponseType respuestaPeticion = firmaElectronicaSegPortType.registroSeguimiento(peticionSeguimiento);

		ResultadoType resultado = respuestaPeticion.getResultado();

		logger.info("Resultado " + resultado.getCodigo());
		logger.info("Codigo " + resultado.getTexto());
		logger.info("Json " + respuestaPeticion.getJsonSalida());
		logger.info("Salida");
		if (resultado.getCodigo() == 0) {
			try {
				RespuestaGuardadoArchivosFirma respuestaGuardado = mapper.readValue(respuestaPeticion.getJsonSalida(),RespuestaGuardadoArchivosFirma.class);
				logger.info("Archivo Enviado exitosamente");
				logger.info("Id del documento: " + respuestaGuardado.getArchivos().get(0).getId());
				logger.info("Nombre del archivo: " + respuestaGuardado.getArchivos().get(0).getNombre());
			} catch (JsonParseException ex) {
				logger.error("Error en el parseo a JSON", ex);
				throw new RuntimeException("Error en el parseo de JSON", ex);
			} catch (JsonMappingException ex) {
				logger.error("Error en el mapeo a JSON", ex);
				throw new RuntimeException("Error en el mapeo de JSON", ex);
			} catch (IOException ex) {
				logger.error("Error en el parseo a JSON", ex);
				throw new RuntimeException("Error en el parseo de JSON", ex);
			}
			logger.warn("El archivo ha sido guardado correctamente");
		} else {
			logger.error("Codigo: " + resultado.getCodigo());
			logger.error("Descripcion: " + resultado.getTexto());
		}
	}
	
	@Override
	public String generaArchivoEnvioNotaria(byte[] archivo) throws RuntimeException {
		final String acusePdf;
		try {
			acusePdf = org.apache.soap.encoding.soapenc.Base64.encode(archivo);
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException("Error generar el Arreglo de bytes para la generaci\u00f3n del reporte.", ex);
		}
		return acusePdf;
	}
	
}