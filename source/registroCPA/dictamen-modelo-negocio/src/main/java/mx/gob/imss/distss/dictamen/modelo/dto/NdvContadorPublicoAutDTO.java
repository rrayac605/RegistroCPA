package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;

public class NdvContadorPublicoAutDTO implements Serializable {

	private static final long serialVersionUID = -6050508831585344699L;

	private Long numRegistroCpa;
	private String desDeleg;
	private String desEstadoCpa;
	private String desSubdelegacion;
	private String nombre;
	private String nombreComercialColegio;
	private String nombreComercialDespacho;
	private String rfc;

	public Long getNumRegistroCpa() {
		return numRegistroCpa;
	}

	public void setNumRegistroCpa(Long numRegistroCpa) {
		this.numRegistroCpa = numRegistroCpa;
	}

	public String getDesDeleg() {
		return desDeleg;
	}

	public void setDesDeleg(String desDeleg) {
		this.desDeleg = desDeleg;
	}

	public String getDesEstadoCpa() {
		return desEstadoCpa;
	}

	public void setDesEstadoCpa(String desEstadoCpa) {
		this.desEstadoCpa = desEstadoCpa;
	}

	public String getDesSubdelegacion() {
		return desSubdelegacion;
	}

	public void setDesSubdelegacion(String desSubdelegacion) {
		this.desSubdelegacion = desSubdelegacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreComercialColegio() {
		return nombreComercialColegio;
	}

	public void setNombreComercialColegio(String nombreComercialColegio) {
		this.nombreComercialColegio = nombreComercialColegio;
	}

	public String getNombreComercialDespacho() {
		return nombreComercialDespacho;
	}

	public void setNombreComercialDespacho(String nombreComercialDespacho) {
		this.nombreComercialDespacho = nombreComercialDespacho;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

}
