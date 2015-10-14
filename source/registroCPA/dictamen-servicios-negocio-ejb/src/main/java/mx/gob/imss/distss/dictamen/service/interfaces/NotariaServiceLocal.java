package mx.gob.imss.distss.dictamen.service.interfaces;

import javax.ejb.Local;

import mx.gob.imss.ctirss.delta.model.firma.RespuestaFirmadoSimple;

/**
 * @author Cesar Isaac Sanchez Alvarez
 */
@Local
public interface NotariaServiceLocal {
	
	/**
	 * Metodo definido para la recuperacion del sellos digital de notaria, 
	 * @param CadenaOriginal  Definida por la concatenacion de valores de la forma, este parametro es requerido
	 * @param SecuenciaNotaria Si el documento ha sido firmado se envia la secuencia recuperada
	 * @param Rfc Si se conoce el RFC 
	 * @throws DenunciaException 
	 * */
	public RespuestaFirmadoSimple getSelloDigital(String cadenaOriginal,
			String secuenciaNotaria, String rfc) throws RuntimeException;
	
	/**
	 * Metodo para el envio de archivos a notaria
	 * @param SecuenciaNotaria La secuencia recuperada por la firma o por el sello digital
	 * @param Arch  Define el archivo en formato de cadena, la conversion se realiza con el metodo generaArchivoEnvioNotaria 
	 * @param nombreArchivo  Nombre con el que se enviar el archivo a notaria
	 * @throws DenunciaException 
	 * */	
	public void guardarArchivoFirmado(String secuenciaNotaria, String arch,
			String nombreArchivo) throws RuntimeException;	
	
	/**
	 * Metodo que convierte el arreglo de bytes en string 
	 * @param archivo Arreglo de bytes correspondiente al archivo
	 * */	
	public String generaArchivoEnvioNotaria(byte[] archivo);
	
}
