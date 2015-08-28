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
	
	private String llaveAsimetrica;
	
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
	public String getLlaveAsimetrica() {
		return llaveAsimetrica;
	}
	/**
	 * @param llaveAsimetrica the llaveAsimetrica to set
	 */
	public void setLlaveAsimetrica(String llaveAsimetrica) {
		this.llaveAsimetrica = llaveAsimetrica;
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
