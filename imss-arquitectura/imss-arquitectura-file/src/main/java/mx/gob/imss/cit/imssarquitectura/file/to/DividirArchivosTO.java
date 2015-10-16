package mx.gob.imss.cit.imssarquitectura.file.to;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class DividirArchivosTO extends DividirArchivoTO {
	private String[] nombresOrigen;
	
	public DividirArchivosTO(){
		
	}
	
	public DividirArchivosTO(String[] nombresOrigen, String nombreDestino, long longitudDivision){
		super(nombreDestino, longitudDivision);
		this.nombresOrigen=nombresOrigen;
	}

	public String[] getNombresOrigen() {
		return nombresOrigen;
	}

	public void setNombresOrigen(String[] nombresOrigen) {
		this.nombresOrigen = nombresOrigen;
	}	
}

