package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class NdtA76CeActCompDTO implements Serializable {

	private static final long serialVersionUID = -3599911544499492803L;

	private Long cveIdA76CeActComp;
	private String cveIdUsuario;
	private String desTipoDistribucion;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private String indAcServAlmacenaje;
	private String indAcServInstalacion;
	private String indOtorgaSgmm;
	private String indPresentoEscrito;
	private String regPatronal;

	public Long getCveIdA76CeActComp() {
		return cveIdA76CeActComp;
	}

	public void setCveIdA76CeActComp(Long cveIdA76CeActComp) {
		this.cveIdA76CeActComp = cveIdA76CeActComp;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public String getDesTipoDistribucion() {
		return desTipoDistribucion;
	}

	public void setDesTipoDistribucion(String desTipoDistribucion) {
		this.desTipoDistribucion = desTipoDistribucion;
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

	public String getIndAcServAlmacenaje() {
		return indAcServAlmacenaje;
	}

	public void setIndAcServAlmacenaje(String indAcServAlmacenaje) {
		this.indAcServAlmacenaje = indAcServAlmacenaje;
	}

	public String getIndAcServInstalacion() {
		return indAcServInstalacion;
	}

	public void setIndAcServInstalacion(String indAcServInstalacion) {
		this.indAcServInstalacion = indAcServInstalacion;
	}

	public String getIndOtorgaSgmm() {
		return indOtorgaSgmm;
	}

	public void setIndOtorgaSgmm(String indOtorgaSgmm) {
		this.indOtorgaSgmm = indOtorgaSgmm;
	}

	public String getIndPresentoEscrito() {
		return indPresentoEscrito;
	}

	public void setIndPresentoEscrito(String indPresentoEscrito) {
		this.indPresentoEscrito = indPresentoEscrito;
	}

	public String getRegPatronal() {
		return regPatronal;
	}

	public void setRegPatronal(String regPatronal) {
		this.regPatronal = regPatronal;
	}

}
