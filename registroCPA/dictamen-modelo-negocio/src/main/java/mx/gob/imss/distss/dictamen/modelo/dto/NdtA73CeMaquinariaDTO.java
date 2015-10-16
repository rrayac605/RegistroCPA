package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class NdtA73CeMaquinariaDTO implements Serializable {

	private static final long serialVersionUID = -7723885201268966692L;

	private Long cveIdA73CeMaquinaria;
	private String cveIdUsuario;
	private String desCapacidadPotencia;
	private String desTipoMotor;
	private String desTipoUso;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private String nomMaquinaria;
	private Long numUnidad;
	private String regPatronal;

	public Long getCveIdA73CeMaquinaria() {
		return cveIdA73CeMaquinaria;
	}

	public void setCveIdA73CeMaquinaria(Long cveIdA73CeMaquinaria) {
		this.cveIdA73CeMaquinaria = cveIdA73CeMaquinaria;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public String getDesCapacidadPotencia() {
		return desCapacidadPotencia;
	}

	public void setDesCapacidadPotencia(String desCapacidadPotencia) {
		this.desCapacidadPotencia = desCapacidadPotencia;
	}

	public String getDesTipoMotor() {
		return desTipoMotor;
	}

	public void setDesTipoMotor(String desTipoMotor) {
		this.desTipoMotor = desTipoMotor;
	}

	public String getDesTipoUso() {
		return desTipoUso;
	}

	public void setDesTipoUso(String desTipoUso) {
		this.desTipoUso = desTipoUso;
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

	public String getNomMaquinaria() {
		return nomMaquinaria;
	}

	public void setNomMaquinaria(String nomMaquinaria) {
		this.nomMaquinaria = nomMaquinaria;
	}

	public Long getNumUnidad() {
		return numUnidad;
	}

	public void setNumUnidad(Long numUnidad) {
		this.numUnidad = numUnidad;
	}

	public String getRegPatronal() {
		return regPatronal;
	}

	public void setRegPatronal(String regPatronal) {
		this.regPatronal = regPatronal;
	}

}
