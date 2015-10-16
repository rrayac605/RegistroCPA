package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class NdtA75CePersonalDTO implements Serializable {

	private static final long serialVersionUID = 5745220758699636033L;

	private Long cveIdA75CePersonal;
	private String cveIdUsuario;
	private String desTipoOficioOcupacion;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private Long numTrabajadores;
	private String regPatronal;

	public Long getCveIdA75CePersonal() {
		return cveIdA75CePersonal;
	}

	public void setCveIdA75CePersonal(Long cveIdA75CePersonal) {
		this.cveIdA75CePersonal = cveIdA75CePersonal;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public String getDesTipoOficioOcupacion() {
		return desTipoOficioOcupacion;
	}

	public void setDesTipoOficioOcupacion(String desTipoOficioOcupacion) {
		this.desTipoOficioOcupacion = desTipoOficioOcupacion;
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

	public Long getNumTrabajadores() {
		return numTrabajadores;
	}

	public void setNumTrabajadores(Long numTrabajadores) {
		this.numTrabajadores = numTrabajadores;
	}

	public String getRegPatronal() {
		return regPatronal;
	}

	public void setRegPatronal(String regPatronal) {
		this.regPatronal = regPatronal;
	}

}
