package mx.gob.imss.cit.imssarquitectura.file.to;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class DividirArchivosAESTO extends DividirArchivosTO {
	private String contrasenia;
	
	public DividirArchivosAESTO(){
		
	}

	public DividirArchivosAESTO(String[] nombresOrigen, String nombreDestino, long longitudDivision, String contrasenia){
		super(nombresOrigen, nombreDestino, longitudDivision);
		this.contrasenia= contrasenia;
	}
	
	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
}

