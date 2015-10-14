package mx.gob.imss.distss.dictamen.modelo.dto;

import mx.gob.imss.distss.dictamen.model.abstr.AbstractModel;

import java.io.Serializable;
import java.util.Date;

//import mx.gob.imss.ctirss.delta.framework.base.model.AbstractModel;

public class DitPersonaDTO extends AbstractModel implements Serializable {

	private static final long serialVersionUID = -1515601554724454209L;

	private Long cveIdPersona;
	private Long cveIdPais;
	private Integer cveIdSexo;
	private Integer cveIdEstadoCivil;
	private String nomNombre;
	private String nomPrimerApellido;
	private String nomSegundoApellido;
	private String curp;
	private String rfc;
	private Date fecNacimiento;
	private String observaciones;
	private Long indPerAutorizada;
	private Integer numAnioNacReg;
	private Integer numMesNacReg;
	private Date fecDefuncion;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private Date fecRegistroActualizado;

	public Long getCveIdPersona() {
		return cveIdPersona;
	}

	public void setCveIdPersona(Long cveIdPersona) {
		this.cveIdPersona = cveIdPersona;
	}

	public Long getCveIdPais() {
		return cveIdPais;
	}

	public void setCveIdPais(Long cveIdPais) {
		this.cveIdPais = cveIdPais;
	}

	public Integer getCveIdSexo() {
		return cveIdSexo;
	}

	public void setCveIdSexo(Integer cveIdSexo) {
		this.cveIdSexo = cveIdSexo;
	}

	public Integer getCveIdEstadoCivil() {
		return cveIdEstadoCivil;
	}

	public void setCveIdEstadoCivil(Integer cveIdEstadoCivil) {
		this.cveIdEstadoCivil = cveIdEstadoCivil;
	}

	public String getNomNombre() {
		return nomNombre;
	}

	public void setNomNombre(String nomNombre) {
		this.nomNombre = nomNombre;
	}

	public String getNomPrimerApellido() {
		return nomPrimerApellido;
	}

	public void setNomPrimerApellido(String nomPrimerApellido) {
		this.nomPrimerApellido = nomPrimerApellido;
	}

	public String getNomSegundoApellido() {
		return nomSegundoApellido;
	}

	public void setNomSegundoApellido(String nomSegundoApellido) {
		this.nomSegundoApellido = nomSegundoApellido;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public Date getFecNacimiento() {
		return fecNacimiento;
	}

	public void setFecNacimiento(Date fecNacimiento) {
		this.fecNacimiento = fecNacimiento;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Long getIndPerAutorizada() {
		return indPerAutorizada;
	}

	public void setIndPerAutorizada(Long indPerAutorizada) {
		this.indPerAutorizada = indPerAutorizada;
	}

	public Integer getNumAnioNacReg() {
		return numAnioNacReg;
	}

	public void setNumAnioNacReg(Integer numAnioNacReg) {
		this.numAnioNacReg = numAnioNacReg;
	}

	public Integer getNumMesNacReg() {
		return numMesNacReg;
	}

	public void setNumMesNacReg(Integer numMesNacReg) {
		this.numMesNacReg = numMesNacReg;
	}

	public Date getFecDefuncion() {
		return fecDefuncion;
	}

	public void setFecDefuncion(Date fecDefuncion) {
		this.fecDefuncion = fecDefuncion;
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
