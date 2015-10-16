package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class NdcStatusCargaAseveracionesDTO implements Serializable {

	private static final long serialVersionUID = -728461664519290851L;

	private Long cveIdStatusCarga;
	private String desStatusCargaAseveraciones;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;

	public Long getCveIdStatusCarga() {
		return cveIdStatusCarga;
	}

	public void setCveIdStatusCarga(Long cveIdStatusCarga) {
		this.cveIdStatusCarga = cveIdStatusCarga;
	}

	public String getDesStatusCargaAseveraciones() {
		return desStatusCargaAseveraciones;
	}

	public void setDesStatusCargaAseveraciones(
			String desStatusCargaAseveraciones) {
		this.desStatusCargaAseveraciones = desStatusCargaAseveraciones;
	}

	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado;
	}

	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
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

}
