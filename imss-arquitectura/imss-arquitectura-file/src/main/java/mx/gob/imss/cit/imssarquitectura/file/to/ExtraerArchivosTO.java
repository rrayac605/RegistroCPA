package mx.gob.imss.cit.imssarquitectura.file.to;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class ExtraerArchivosTO {
	private String nombreArchivo;
	private String rutaDestino;
	
	public ExtraerArchivosTO(){
		
	}
	
	public ExtraerArchivosTO(String nombreArchivo, String rutaDestino){
		this.nombreArchivo=nombreArchivo;
		this.rutaDestino=rutaDestino;
	}
	
	public String getNombreArchivo() {
		return nombreArchivo;
	}
	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}
	public String getRutaDestino() {
		return rutaDestino;
	}
	public void setRutaDestino(String rutaDestino) {
		this.rutaDestino = rutaDestino;
	}
	
	
}

