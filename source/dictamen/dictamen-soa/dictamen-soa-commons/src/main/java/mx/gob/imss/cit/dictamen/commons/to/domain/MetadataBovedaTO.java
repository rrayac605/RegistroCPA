package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.List;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class MetadataBovedaTO {
	
	private List<ActorBovedaTO> actores;
	private String fechaCreacion;
	private String fechaModificacion;
	private String size;
	private String version;
	public List<ActorBovedaTO> getActores() {
		return actores;
	}
	public void setActores(List<ActorBovedaTO> actores) {
		this.actores = actores;
	}
	public String getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public String getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(String fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}			
}

