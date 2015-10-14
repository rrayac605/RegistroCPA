package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class NdcTipoModeloOpinionDTO implements Serializable {

	private static final long serialVersionUID = -6558136320563452809L;

	private Long cveIdTipoOpinion;
	private String desModeloOpinion;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;

	public Long getCveIdTipoOpinion() {
		return cveIdTipoOpinion;
	}

	public void setCveIdTipoOpinion(Long cveIdTipoOpinion) {
		this.cveIdTipoOpinion = cveIdTipoOpinion;
	}

	public String getDesModeloOpinion() {
		return desModeloOpinion;
	}

	public void setDesModeloOpinion(String desModeloOpinion) {
		this.desModeloOpinion = desModeloOpinion;
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
