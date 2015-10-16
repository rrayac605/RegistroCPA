package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class NdtCpaAcreditacionDTO implements Serializable {

	private static final long serialVersionUID = -4260551891191168078L;

	private Long cveIdAcreditacion;
	private String cveIdUsuario;
	private Date fecAcreditacionCp;
	private Date fecDocumento1;
	private Date fecDocumento2;
	private Date fecPresentacionAcreditacion;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private Long indAcredMembresia;

	public Long getCveIdAcreditacion() {
		return cveIdAcreditacion;
	}

	public void setCveIdAcreditacion(Long cveIdAcreditacion) {
		this.cveIdAcreditacion = cveIdAcreditacion;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public Date getFecAcreditacionCp() {
		return fecAcreditacionCp;
	}

	public void setFecAcreditacionCp(Date fecAcreditacionCp) {
		this.fecAcreditacionCp = fecAcreditacionCp;
	}

	public Date getFecDocumento1() {
		return fecDocumento1;
	}

	public void setFecDocumento1(Date fecDocumento1) {
		this.fecDocumento1 = fecDocumento1;
	}

	public Date getFecDocumento2() {
		return fecDocumento2;
	}

	public void setFecDocumento2(Date fecDocumento2) {
		this.fecDocumento2 = fecDocumento2;
	}

	public Date getFecPresentacionAcreditacion() {
		return fecPresentacionAcreditacion;
	}

	public void setFecPresentacionAcreditacion(Date fecPresentacionAcreditacion) {
		this.fecPresentacionAcreditacion = fecPresentacionAcreditacion;
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

	public Long getIndAcredMembresia() {
		return indAcredMembresia;
	}

	public void setIndAcredMembresia(Long indAcredMembresia) {
		this.indAcredMembresia = indAcredMembresia;
	}

}
