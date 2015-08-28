package mx.gob.imss.cit.imssarquitectura.security;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
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

	public static CifrarArchivoTO cifrarArchivo(CifrarArchivoTO cifrarArchivoTO) {
		CifrarArchivoTO archivoCifradoTO = new CifrarArchivoTO();
		byte[] rawkey = cifrarArchivoTO.getLlaveAsimetrica().getBytes();
		DESedeKeySpec keyspec;
		try {
			keyspec = new DESedeKeySpec(rawkey);

			SecretKeyFactory keyfactory = SecretKeyFactory
					.getInstance(cifrarArchivoTO.getAlgoritmo());
			SecretKey key = keyfactory.generateSecret(keyspec);

			Cipher cipher = Cipher.getInstance(cifrarArchivoTO.getAlgoritmo());
			cipher.init(Cipher.ENCRYPT_MODE, key);

			archivoCifradoTO.setArchivoCifrado(cipher.doFinal(cifrarArchivoTO
					.getArchivoOriginal()));

		} catch (InvalidKeyException e) {
			throw new ArquitecturaSecurityException(e.getMessage(), e);
		} catch (NoSuchAlgorithmException e) {
			throw new ArquitecturaSecurityException(e.getMessage(), e);
		} catch (InvalidKeySpecException e) {
			throw new ArquitecturaSecurityException(e.getMessage(), e);
		} catch (NoSuchPaddingException e) {
			throw new ArquitecturaSecurityException(e.getMessage(), e);
		} catch (IllegalBlockSizeException e) {
			throw new ArquitecturaSecurityException(e.getMessage(), e);
		} catch (BadPaddingException e) {
			throw new ArquitecturaSecurityException(e.getMessage(), e);
		}
		return archivoCifradoTO;
	}

	public static CifrarArchivoTO descifrarArchivo(
			CifrarArchivoTO cifrarArchivoTO) {

		CifrarArchivoTO archivoDescifradoTO = new CifrarArchivoTO();
		byte[] rawkey = cifrarArchivoTO.getLlaveAsimetrica().getBytes();
		DESedeKeySpec keyspec;
		try {
			keyspec = new DESedeKeySpec(rawkey);

			SecretKeyFactory keyfactory = SecretKeyFactory
					.getInstance(cifrarArchivoTO.getAlgoritmo());
			SecretKey key = keyfactory.generateSecret(keyspec);

			Cipher cipher = Cipher.getInstance(cifrarArchivoTO.getAlgoritmo());
			cipher.init(Cipher.DECRYPT_MODE, key);

			archivoDescifradoTO.setArchivoOriginal(cipher
					.doFinal(cifrarArchivoTO.getArchivoCifrado()));

		} catch (InvalidKeyException e) {
			throw new ArquitecturaSecurityException(e.getMessage(), e);
		} catch (NoSuchAlgorithmException e) {
			throw new ArquitecturaSecurityException(e.getMessage(), e);
		} catch (InvalidKeySpecException e) {
			throw new ArquitecturaSecurityException(e.getMessage(), e);
		} catch (NoSuchPaddingException e) {
			throw new ArquitecturaSecurityException(e.getMessage(), e);
		} catch (IllegalBlockSizeException e) {
			throw new ArquitecturaSecurityException(e.getMessage(), e);
		} catch (BadPaddingException e) {
			throw new ArquitecturaSecurityException(e.getMessage(), e);
		}
		return archivoDescifradoTO;
	}

}
