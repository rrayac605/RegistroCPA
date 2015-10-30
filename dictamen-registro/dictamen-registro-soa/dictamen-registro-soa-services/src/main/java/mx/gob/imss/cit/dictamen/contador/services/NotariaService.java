package mx.gob.imss.cit.dictamen.contador.services;

import mx.gob.imss.ctirss.delta.model.firma.RespuestaFirmadoSimple;

public interface NotariaService {
	RespuestaFirmadoSimple getSelloDigital(String cadenaOriginal,String secuenciaNotaria, String rfc) throws RuntimeException;
	void guardarArchivoFirmado(String secuenciaNotaria, String arch,
			String nombreArchivo) throws RuntimeException;	
	String generaArchivoEnvioNotaria(byte[] archivo);
}
