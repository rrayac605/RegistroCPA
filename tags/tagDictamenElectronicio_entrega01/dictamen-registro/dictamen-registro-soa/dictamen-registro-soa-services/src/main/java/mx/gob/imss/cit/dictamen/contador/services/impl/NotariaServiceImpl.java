package mx.gob.imss.cit.dictamen.contador.services.impl;

import java.io.IOException;

import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.dictamen.contador.services.NotariaService;


import mx.gob.imss.cit.dictamen.contador.services.util.JSONUtil;
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
		
			jsonParams = JSONUtil.marshall(peticion, PeticionFirmadoSimple.class.getName());

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
				firma = (RespuestaFirmadoSimple) JSONUtil.unmarshall(
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
