package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class NdcTipoDictamenDTO implements Serializable {

	private static final long serialVersionUID = 6695458494202333263L;

	private Long cveIdTipoDictamen;
	private String desTipoDictamen;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;

	public Long getCveIdTipoDictamen() {
		return cveIdTipoDictamen;
	}

	public void setCveIdTipoDictamen(Long cveIdTipoDictamen) {
		this.cveIdTipoDictamen = cveIdTipoDictamen;
	}

	public String getDesTipoDictamen() {
		return desTipoDictamen;
	}

	public void setDesTipoDictamen(String desTipoDictamen) {
		this.desTipoDictamen = desTipoDictamen;
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
