package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class NdtDocumentoProbatorioDTO implements Serializable {

	private static final long serialVersionUID = 8086817765125519679L;

	private Long cveIdDoctoProbatorio;
	private Long cveIdDoctoProbPorTipo;
	private String cveIdUsuario;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private String urlDocumentoProb;

	public Long getCveIdDoctoProbatorio() {
		return cveIdDoctoProbatorio;
	}

	public void setCveIdDoctoProbatorio(Long cveIdDoctoProbatorio) {
		this.cveIdDoctoProbatorio = cveIdDoctoProbatorio;
	}

	public Long getCveIdDoctoProbPorTipo() {
		return cveIdDoctoProbPorTipo;
	}

	public void setCveIdDoctoProbPorTipo(Long cveIdDoctoProbPorTipo) {
		this.cveIdDoctoProbPorTipo = cveIdDoctoProbPorTipo;
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

	public String getUrlDocumentoProb() {
		return urlDocumentoProb;
	}

	public void setUrlDocumentoProb(String urlDocumentoProb) {
		this.urlDocumentoProb = urlDocumentoProb;
	}

}
