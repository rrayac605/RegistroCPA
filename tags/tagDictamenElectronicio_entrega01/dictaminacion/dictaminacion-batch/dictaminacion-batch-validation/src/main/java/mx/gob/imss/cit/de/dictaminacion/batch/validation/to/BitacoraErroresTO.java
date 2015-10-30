package mx.gob.imss.cit.de.dictaminacion.batch.validation.to;

import java.util.Date;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class BitacoraErroresTO {
	private Long cveIdBitErrores;
    private String desErrores;
    private Date fecRegistroAlta;
    private Date fecRegistroBaja;
    private Date fecRegistroActualizado;
    private Long cveIdBitacoraCargaAsev;
    
	public Long getCveIdBitErrores() {
		return cveIdBitErrores;
	}
	public void setCveIdBitErrores(Long cveIdBitErrores) {
		this.cveIdBitErrores = cveIdBitErrores;
	}
	public String getDesErrores() {
		return desErrores;
	}
	public void setDesErrores(String desErrores) {
		this.desErrores = desErrores;
	}
	public Date getFecRegistroAlta() {
		return fecRegistroAlta;
	}
	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}
	public Date getFecRegistroBaja() {
		return fecRegistroBaja;
	}
	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}
	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado;
	}
	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}
	public Long getCveIdBitacoraCargaAsev() {
		return cveIdBitacoraCargaAsev;
	}
	public void setCveIdBitacoraCargaAsev(Long cveIdBitacoraCargaAsev) {
		this.cveIdBitacoraCargaAsev = cveIdBitacoraCargaAsev;
	}    
}

