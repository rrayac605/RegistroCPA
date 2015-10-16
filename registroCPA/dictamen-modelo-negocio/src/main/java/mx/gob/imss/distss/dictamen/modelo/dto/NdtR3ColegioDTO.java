package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class NdtR3ColegioDTO implements Serializable {

	private static final long serialVersionUID = 7625714528372591535L;

	private Long cveIdR3ColegioXcontador;
	private String cveIdUsuario;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private String numTramiteNotaria;
	private String urlAcuseNotaria;
	private boolean existenCambiosR3;

	public Long getCveIdR3ColegioXcontador() {
		return cveIdR3ColegioXcontador;
	}

	public void setCveIdR3ColegioXcontador(Long cveIdR3ColegioXcontador) {
		this.cveIdR3ColegioXcontador = cveIdR3ColegioXcontador;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
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

	public String getNumTramiteNotaria() {
		return numTramiteNotaria;
	}

	public void setNumTramiteNotaria(String numTramiteNotaria) {
		this.numTramiteNotaria = numTramiteNotaria;
	}

	public String getUrlAcuseNotaria() {
		return urlAcuseNotaria;
	}

	public void setUrlAcuseNotaria(String urlAcuseNotaria) {
		this.urlAcuseNotaria = urlAcuseNotaria;
	}

	public boolean isExistenCambiosR3() {
		return existenCambiosR3;
	}

	public void setExistenCambiosR3(boolean existenCambiosR3) {
		this.existenCambiosR3 = existenCambiosR3;
	}

}
