package mx.gob.imss.cit.imssarquitectura.file.to;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class DividirArchivoTO {
	String nombreOrigen;
	String nombreDestino;
	long longitudDivision;
	
	public DividirArchivoTO(){
		
	}
	
	public DividirArchivoTO(String  nombreOrigen, String nombreDestino, long longitudDivision){
		this.nombreOrigen=nombreOrigen;
		this.nombreDestino=nombreDestino;
		this.longitudDivision=longitudDivision;
	}
	
	public DividirArchivoTO(String nombreDestino, long longitudDivision){
		this.nombreDestino=nombreDestino;
		this.longitudDivision=longitudDivision;
	}
	
	public String getNombreOrigen() {
		return nombreOrigen;
	}
	public void setNombreOrigen(String nombreOrigen) {
		this.nombreOrigen = nombreOrigen;
	}
	public String getNombreDestino() {
		return nombreDestino;
	}
	public void setNombreDestino(String nombreDestino) {
		this.nombreDestino = nombreDestino;
	}
	public long getLongitudDivision() {
		return longitudDivision;
	}
	public void setLongitudDivision(long longitudDivision) {
		this.longitudDivision = longitudDivision;
	}		
}

