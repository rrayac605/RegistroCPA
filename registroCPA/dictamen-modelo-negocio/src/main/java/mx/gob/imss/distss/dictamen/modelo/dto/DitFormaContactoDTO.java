package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class DitFormaContactoDTO implements Serializable {

	private static final long serialVersionUID = 2973688744603806691L;

	private Long cveIdFormaContacto;
	private Long cveIdTipoContacto;
	private String desFormaContacto;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private Date fecRegistroActualizado;

	public Long getCveIdFormaContacto() {
		return cveIdFormaContacto;
	}

	public void setCveIdFormaContacto(Long cveIdFormaContacto) {
		this.cveIdFormaContacto = cveIdFormaContacto;
	}

	public Long getCveIdTipoContacto() {
		return cveIdTipoContacto;
	}

	public void setCveIdTipoContacto(Long cveIdTipoContacto) {
		this.cveIdTipoContacto = cveIdTipoContacto;
	}

	public String getDesFormaContacto() {
		return desFormaContacto;
	}

	public void setDesFormaContacto(String desFormaContacto) {
		this.desFormaContacto = desFormaContacto;
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

}
