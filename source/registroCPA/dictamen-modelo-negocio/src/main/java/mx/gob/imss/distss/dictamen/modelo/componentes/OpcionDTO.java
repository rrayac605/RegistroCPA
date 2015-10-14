package mx.gob.imss.distss.dictamen.modelo.componentes;

import java.io.Serializable;

public class OpcionDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String claveOpcion;
	private String descOpcion;
	
	public OpcionDTO(String clave,String descripcion){
		this.claveOpcion=clave;
		this.descOpcion=descripcion;
	}

	public String getClaveOpcion() {
		return claveOpcion;
	}

	public void setClaveOpcion(String claveOpcion) {
		this.claveOpcion = claveOpcion;
	}

	public String getDescOpcion() {
		return descOpcion;
	}

	public void setDescOpcion(String descOpcion) {
		this.descOpcion = descOpcion;
	}
	

	
	
	
}
