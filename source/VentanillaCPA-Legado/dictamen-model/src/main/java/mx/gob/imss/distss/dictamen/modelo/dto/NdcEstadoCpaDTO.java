package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class NdcEstadoCpaDTO implements Serializable {

	private static final long serialVersionUID = -8202494152117208801L;

	private Long cveIdEstadoCpa;
	private String desEstadoCpa;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;

	public Long getCveIdEstadoCpa() {
		return cveIdEstadoCpa;
	}

	public void setCveIdEstadoCpa(Long cveIdEstadoCpa) {
		this.cveIdEstadoCpa = cveIdEstadoCpa;
	}

	public String getDesEstadoCpa() {
		return desEstadoCpa;
	}

	public void setDesEstadoCpa(String desEstadoCpa) {
		this.desEstadoCpa = desEstadoCpa;
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
