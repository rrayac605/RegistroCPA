package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class NdtR2FormacontactoDTO implements Serializable {

	private static final long serialVersionUID = 5523429355368141680L;

	private Long cveIdR2Fcontacto;
	private Long cveIdPersonamContacto;
	private String cveIdUsuario;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;

	public Long getCveIdR2Fcontacto() {
		return cveIdR2Fcontacto;
	}

	public void setCveIdR2Fcontacto(Long cveIdR2Fcontacto) {
		this.cveIdR2Fcontacto = cveIdR2Fcontacto;
	}

	public Long getCveIdPersonamContacto() {
		return cveIdPersonamContacto;
	}

	public void setCveIdPersonamContacto(Long cveIdPersonamContacto) {
		this.cveIdPersonamContacto = cveIdPersonamContacto;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
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
