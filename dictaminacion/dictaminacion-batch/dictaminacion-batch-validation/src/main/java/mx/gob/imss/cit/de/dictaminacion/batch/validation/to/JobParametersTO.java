package mx.gob.imss.cit.de.dictaminacion.batch.validation.to;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class JobParametersTO {
	private String origen;
	private String destino;
	private String delay;
	private String fields;
	private String prototype;
	private Long idAseveracion;
	private Long cveIdBitacoraCargaAsev;
	private Long cveIdPatronDictamen;
	
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getDelay() {
		return delay;
	}
	public void setDelay(String delay) {
		this.delay = delay;
	}
	public String getFields() {
		return fields;
	}
	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getPrototype() {
		return prototype;
	}
	public void setPrototype(String prototype) {
		this.prototype = prototype;
	}
	public Long getIdAseveracion() {
		return idAseveracion;
	}
	public void setIdAseveracion(Long idAseveracion) {
		this.idAseveracion = idAseveracion;
	}
	public Long getCveIdBitacoraCargaAsev() {
		return cveIdBitacoraCargaAsev;
	}
	public void setCveIdBitacoraCargaAsev(Long cveIdBitacoraCargaAsev) {
		this.cveIdBitacoraCargaAsev = cveIdBitacoraCargaAsev;
	}
	public Long getCveIdPatronDictamen() {
		return cveIdPatronDictamen;
	}
	public void setCveIdPatronDictamen(Long cveIdPatronDictamen) {
		this.cveIdPatronDictamen = cveIdPatronDictamen;
	}

}

