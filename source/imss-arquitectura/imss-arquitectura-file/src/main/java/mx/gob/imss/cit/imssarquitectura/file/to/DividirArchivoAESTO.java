package mx.gob.imss.cit.imssarquitectura.file.to;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class DividirArchivoAESTO extends DividirArchivoTO {
	private String contrasenia;
	
	public DividirArchivoAESTO(){
		
	}
	
	public DividirArchivoAESTO(String  nombreOrigen, String nombreDestino, long longitudDivision, String contrasenia){
		super(nombreOrigen,nombreDestino,longitudDivision);
		this.setContrasenia(contrasenia);
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}	
}

