package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class NdtA74CeTransporteDTO implements Serializable {

	private static final long serialVersionUID = 1931489914897250597L;

	private Long cveIdA74CeTransporte;
	private String cveIdUsuario;
	private String desCapacidadPotencia;
	private String desTipoCombustible;
	private String desTipoUso;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private String nomTransporte;
	private Long numUnidad;
	private String regPatronal;

	public Long getCveIdA74CeTransporte() {
		return cveIdA74CeTransporte;
	}

	public void setCveIdA74CeTransporte(Long cveIdA74CeTransporte) {
		this.cveIdA74CeTransporte = cveIdA74CeTransporte;
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

	public String getDesTipoCombustible() {
		return desTipoCombustible;
	}

	public void setDesTipoCombustible(String desTipoCombustible) {
		this.desTipoCombustible = desTipoCombustible;
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

	public String getNomTransporte() {
		return nomTransporte;
	}

	public void setNomTransporte(String nomTransporte) {
		this.nomTransporte = nomTransporte;
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
