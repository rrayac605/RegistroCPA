package mx.gob.imss.cit.imssarquitectura.security;

import mx.gob.imss.cit.imssarquitectura.security.constants.SecurityConstants;
import mx.gob.imss.cit.imssarquitectura.security.enums.AlgoritmoCifradoEnum;
import mx.gob.imss.cit.imssarquitectura.security.to.CifrarArchivoTO;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * clase para cifrar con algoritmo simetrico
 * 
 * @author ajfuentes
 * 
 */
public class CifradoSimetricoUtilsTest {

	private Logger LOG = Logger.getLogger(CifradoSimetricoUtilsTest.class);

	@Test
	public void test_cifradoAES() {
		String algoritmo=AlgoritmoCifradoEnum.DES3.getClave();
		String archivoOriginal="Hola Mundo";
		byte[] llave = CifradoSimetricoUtils.generarLlavePrivadaSimetrica(
				algoritmo,
				SecurityConstants.ALGORTMO_BYTES_256);

	
		LOG.info("llave privada base 64 "+EncodeUtils.encodeBytesBase64(llave));
		
		
		LOG.info("archivo original base64 "+archivoOriginal);
		CifrarArchivoTO cifrarArchivoTO=new CifrarArchivoTO();
		cifrarArchivoTO.setAlgoritmo(algoritmo);
		cifrarArchivoTO.setLlaveSimetrica(llave);
		cifrarArchivoTO.setArchivoOriginal(archivoOriginal.getBytes());

		cifrarArchivoTO=CifradoSimetricoUtils.cifrarArchivo(cifrarArchivoTO);
		LOG.info("archivo cifrado base64 "+EncodeUtils.encodeBytesBase64(cifrarArchivoTO.getArchivoCifrado()));
		
	}
}
