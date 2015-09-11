/**
 * 
 */
package mx.gob.imss.cit.imssarquitectura.security.to;

import java.io.Serializable;

/**
 * @author ajfuentes
 *
 */
public class CifrarArchivoTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2832721646356645710L;
	
	private byte[] archivoOriginal;
	
	private byte[] llaveSimetrica;
	
	private String algoritmo;
	
	private byte[] archivoCifrado;
	
	
	
	/**
	 * @return the archivoOriginal
	 */
	public byte[] getArchivoOriginal() {
		return archivoOriginal;
	}
	/**
	 * @param archivoOriginal the archivoOriginal to set
	 */
	public void setArchivoOriginal(byte[] archivoOriginal) {
		this.archivoOriginal = archivoOriginal;
	}
	/**
	 * @return the llaveAsimetrica
	 */
	public byte[] getLlaveSimetrica() {
		return llaveSimetrica;
	}
	/**
	 * @param llaveAsimetrica the llaveAsimetrica to set
	 */
	public void setLlaveSimetrica(byte[] llaveSimetrica) {
		this.llaveSimetrica = llaveSimetrica;
	}
	/**
	 * @return the algoritmo
	 */
	public String getAlgoritmo() {
		return algoritmo;
	}
	/**
	 * @param algoritmo the algoritmo to set
	 */
	public void setAlgoritmo(String algoritmo) {
		this.algoritmo = algoritmo;
	}
	/**
	 * @return the archivoCifrado
	 */
	public byte[] getArchivoCifrado() {
		return archivoCifrado;
	}
	/**
	 * @param archivoCifrado the archivoCifrado to set
	 */
	public void setArchivoCifrado(byte[] archivoCifrado) {
		this.archivoCifrado = archivoCifrado;
	}

	

}
