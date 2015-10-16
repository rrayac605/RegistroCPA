package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class NdcEjercicioFiscalDTO implements Serializable {

	private static final long serialVersionUID = -3571527909697500439L;

	private Long cveIdEjerFiscal;
	private String desEjerFiscal;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;

	public Long getCveIdEjerFiscal() {
		return cveIdEjerFiscal;
	}

	public void setCveIdEjerFiscal(Long cveIdEjerFiscal) {
		this.cveIdEjerFiscal = cveIdEjerFiscal;
	}

	public String getDesEjerFiscal() {
		return desEjerFiscal;
	}

	public void setDesEjerFiscal(String desEjerFiscal) {
		this.desEjerFiscal = desEjerFiscal;
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
