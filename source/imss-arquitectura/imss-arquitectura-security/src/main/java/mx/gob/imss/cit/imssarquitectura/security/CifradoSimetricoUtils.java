package mx.gob.imss.cit.imssarquitectura.security;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;

import mx.gob.imss.cit.imssarquitectura.security.exception.ArquitecturaSecurityException;
import mx.gob.imss.cit.imssarquitectura.security.to.CifrarArchivoTO;

/**
 * clase para cifrar con algoritmo simetrico
 * @author ajfuentes
 *
 */
public class CifradoSimetricoUtils {
	
	
	public static byte[] generarLlavePrivadaSimetrica(String algoritmo,int bytesSeguridad) {
	    KeyGenerator keyGen;
	    byte[] llave=null;
		try {
			keyGen = KeyGenerator.getInstance(algoritmo);			
			//keyGen.init(bytesSeguridad);
            SecretKey secKey=keyGen.generateKey();
            llave=secKey.getEncoded();
			
		} catch (Exception e) {
			throw new ArquitecturaSecurityException(e.getMessage(), e);
		}
		
		return llave;
     
	}

	public static CifrarArchivoTO cifrarArchivo(CifrarArchivoTO cifrarArchivoTO) {
		
		CifrarArchivoTO archivoCifradoTO = new CifrarArchivoTO();
		DESedeKeySpec keyspec;
		try {
			keyspec = new DESedeKeySpec(cifrarArchivoTO.getLlaveSimetrica());

			SecretKeyFactory keyfactory = SecretKeyFactory
					.getInstance(cifrarArchivoTO.getAlgoritmo());
			SecretKey key = keyfactory.generateSecret(keyspec);

			Cipher cipher = Cipher.getInstance(cifrarArchivoTO.getAlgoritmo());
			cipher.init(Cipher.ENCRYPT_MODE, key);

			archivoCifradoTO.setArchivoCifrado(cipher.doFinal(cifrarArchivoTO
					.getArchivoOriginal()));
			archivoCifradoTO.setArchivoOriginal(cifrarArchivoTO.getArchivoOriginal());
			archivoCifradoTO.setLlaveSimetrica(cifrarArchivoTO.getLlaveSimetrica());
			archivoCifradoTO.setAlgoritmo(cifrarArchivoTO.getAlgoritmo());
			
		} catch (Exception e) {
			throw new ArquitecturaSecurityException(e.getMessage(), e);
		} 
		
		return archivoCifradoTO;
	}

	public static CifrarArchivoTO descifrarArchivo(
			CifrarArchivoTO cifrarArchivoTO) {

		CifrarArchivoTO archivoDescifradoTO = new CifrarArchivoTO();
		DESedeKeySpec keyspec;
		try {
			keyspec = new DESedeKeySpec(cifrarArchivoTO.getLlaveSimetrica());

			SecretKeyFactory keyfactory = SecretKeyFactory
					.getInstance(cifrarArchivoTO.getAlgoritmo());
			SecretKey key = keyfactory.generateSecret(keyspec);

			Cipher cipher = Cipher.getInstance(cifrarArchivoTO.getAlgoritmo());
			cipher.init(Cipher.DECRYPT_MODE, key);

			archivoDescifradoTO.setArchivoOriginal(cipher
					.doFinal(cifrarArchivoTO.getArchivoCifrado()));

		} catch (Exception e) {
			throw new ArquitecturaSecurityException(e.getMessage(), e);
		}
		return archivoDescifradoTO;
	}

}
