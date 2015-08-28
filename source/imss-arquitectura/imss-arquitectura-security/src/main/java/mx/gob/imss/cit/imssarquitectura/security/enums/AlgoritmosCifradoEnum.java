/**
 * 
 */
package mx.gob.imss.cit.imssarquitectura.security.enums;

/**
 * @author ajfuentes
 *
 */
public enum AlgoritmosCifradoEnum {
	

	DES3("3DES","DESede"),
	AES("AES","")
	;
	
	private String nombre;
	private String clave;

	private AlgoritmosCifradoEnum(String nombre,String clave){
		this.nombre=nombre;
		this.clave=clave;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the clave
	 */
	public String getClave() {
		return clave;
	}

	/**
	 * @param clave the clave to set
	 */
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	
}
