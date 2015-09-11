package mx.gob.imss.cit.dictamen.commons.to;

import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class BovedaMetadataTO  extends BaseTO{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<BovedaActorTO> actores;
	private String fechaCreacion;
	private String fechaModificacion;
	private String size;
	private String version;
	public List<BovedaActorTO> getActores() {
		return actores;
	}
	public void setActores(List<BovedaActorTO> actores) {
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

