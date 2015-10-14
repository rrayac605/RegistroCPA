package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class NdtR1FormacontactoDTO implements Serializable {

	private static final long serialVersionUID = -6227726335516816704L;

	private Long cveIdR1Formacontacto;
	private Long cveIdPersonafContacto;
	private String cveIdUsuario;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;

	public Long getCveIdR1Formacontacto() {
		return cveIdR1Formacontacto;
	}

	public void setCveIdR1Formacontacto(Long cveIdR1Formacontacto) {
		this.cveIdR1Formacontacto = cveIdR1Formacontacto;
	}

	public Long getCveIdPersonafContacto() {
		return cveIdPersonafContacto;
	}

	public void setCveIdPersonafContacto(Long cveIdPersonafContacto) {
		this.cveIdPersonafContacto = cveIdPersonafContacto;
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
