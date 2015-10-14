package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class NdtBitacoraErroresDTO implements Serializable {

	private static final long serialVersionUID = -1230669799309844622L;

	private Long cveIdBitErrores;
	private String desErrores;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;

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
