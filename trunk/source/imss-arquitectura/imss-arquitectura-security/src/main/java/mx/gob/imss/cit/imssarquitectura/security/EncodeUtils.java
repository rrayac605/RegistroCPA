package mx.gob.imss.cit.imssarquitectura.security;

import java.io.UnsupportedEncodingException;

import mx.gob.imss.cit.imssarquitectura.security.constants.SecurityConstants;
import mx.gob.imss.cit.imssarquitectura.security.exception.ArquitecturaSecurityException;

import org.bouncycastle.util.encoders.Base64;

/**
 * Clase para encode a base64 
 * @author gsegura
 *
 */
public class EncodeUtils {

	public static String encodeBytesBase64(byte[] bytes)throws ArquitecturaSecurityException {

		String encode = null;
		try {
			encode = new String(Base64.encode(bytes),SecurityConstants.ENCODE_UTF8);
		} catch (UnsupportedEncodingException e) {
			throw new ArquitecturaSecurityException(e.getMessage(), e);
		}

		return encode;
	}
	
	public static byte[] decodeBytesBase64(String base64)throws ArquitecturaSecurityException {

		return Base64.decode(base64);
	}
}
