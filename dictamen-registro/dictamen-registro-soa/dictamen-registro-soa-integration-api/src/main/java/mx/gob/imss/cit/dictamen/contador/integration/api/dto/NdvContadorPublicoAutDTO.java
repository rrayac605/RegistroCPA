package mx.gob.imss.cit.dictamen.contador.integration.api.dto;

import java.io.Serializable;

public class NdvContadorPublicoAutDTO implements Serializable {
	
	private static final long serialVersionUID = -6050508831585344699L;
	
	private Long cveIdCpa;
	
	private Long cveDeleg;
	
	private Long cveSubdelegacion;
	
	private String desDeleg;

	private String desEstadoCpa;

	private String desSubdelegacion;

	private String nombre;

	private String nombreComercialColegio;

	private String nombreComercialDespacho;

	private Long numRegistroCpa;

	private String rfc;

	public Long getCveIdCpa() {
		return cveIdCpa;
	}

	public void setCveIdCpa(Long cveIdCpa) {
		this.cveIdCpa = cveIdCpa;
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

	public Long getNumRegistroCpa() {
		return numRegistroCpa;
	}

	public void setNumRegistroCpa(Long numRegistroCpa) {
		this.numRegistroCpa = numRegistroCpa;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public Long getCveDeleg() {
		return cveDeleg;
	}

	public void setCveDeleg(Long cveDeleg) {
		this.cveDeleg = cveDeleg;
	}

	public Long getCveSubdelegacion() {
		return cveSubdelegacion;
	}

	public void setCveSubdelegacion(Long cveSubdelegacion) {
		this.cveSubdelegacion = cveSubdelegacion;
	}
	
}
