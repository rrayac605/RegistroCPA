package mx.gob.imss.cit.imssarquitectura.file.to;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class ExtraerArchivosAESTO extends ExtraerArchivosTO {
	private String contrasenia;
	
	public ExtraerArchivosAESTO(){
		
	}
	
	public ExtraerArchivosAESTO(String nombreArchivo, String rutaDestino, String contrasenia){
		super(nombreArchivo, rutaDestino);
		this.contrasenia=contrasenia;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}	
}

