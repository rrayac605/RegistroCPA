package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class NdcRemuneracionesDTO implements Serializable {

	private static final long serialVersionUID = -4940038047170817954L;

	private Long cveIdRemuneraciones;
	private String cveIdUsuario;
	private String desRemuneraciones;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private Long indOrden;

	public Long getCveIdRemuneraciones() {
		return cveIdRemuneraciones;
	}

	public void setCveIdRemuneraciones(Long cveIdRemuneraciones) {
		this.cveIdRemuneraciones = cveIdRemuneraciones;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public String getDesRemuneraciones() {
		return desRemuneraciones;
	}

	public void setDesRemuneraciones(String desRemuneraciones) {
		this.desRemuneraciones = desRemuneraciones;
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

	public Long getIndOrden() {
		return indOrden;
	}

	public void setIndOrden(Long indOrden) {
		this.indOrden = indOrden;
	}

}
