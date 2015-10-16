package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class DitPersonamContactoDTO implements Serializable {

	private static final long serialVersionUID = -3286977592949281128L;

	private Long cveIdPersonamContacto;
	private Long cveIdPersonaMoral;
	private Long cveIdFormaContacto;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private Date fecRegistroActualizado;

	public Long getCveIdPersonamContacto() {
		return cveIdPersonamContacto;
	}

	public void setCveIdPersonamContacto(Long cveIdPersonamContacto) {
		this.cveIdPersonamContacto = cveIdPersonamContacto;
	}

	public Long getCveIdPersonaMoral() {
		return cveIdPersonaMoral;
	}

	public void setCveIdPersonaMoral(Long cveIdPersonaMoral) {
		this.cveIdPersonaMoral = cveIdPersonaMoral;
	}

	public Long getCveIdFormaContacto() {
		return cveIdFormaContacto;
	}

	public void setCveIdFormaContacto(Long cveIdFormaContacto) {
		this.cveIdFormaContacto = cveIdFormaContacto;
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
