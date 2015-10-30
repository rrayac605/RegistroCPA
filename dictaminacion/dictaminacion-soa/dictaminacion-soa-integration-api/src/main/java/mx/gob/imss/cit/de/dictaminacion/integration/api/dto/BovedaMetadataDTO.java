package mx.gob.imss.cit.de.dictaminacion.integration.api.dto;

import java.util.List;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.base.BaseDTO;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class BovedaMetadataDTO extends BaseDTO{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<BovedaActorDTO> actores;
	private String fechaCreacion;
	private String fechaModificacion;
	private String size;
	private String version;
	public List<BovedaActorDTO> getActores() {
		return actores;
	}
	public void setActores(List<BovedaActorDTO> actores) {
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

