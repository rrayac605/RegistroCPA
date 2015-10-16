/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.integration.api.dto.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class PrestacionesDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4041421773842734284L;
	private Long cveIdPrestaciones;
	private String desPrestaciones;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private Date fecRegistroActualizado;
	private List<CedulaPrestacionesDTO> cedulaPrestacionesList;

	public PrestacionesDTO() {
	}

	public PrestacionesDTO(Long cveIdPrestaciones) {
		this.cveIdPrestaciones = cveIdPrestaciones;
	}

	public Long getCveIdPrestaciones() {
		return cveIdPrestaciones;
	}

	public void setCveIdPrestaciones(Long cveIdPrestaciones) {
		this.cveIdPrestaciones = cveIdPrestaciones;
	}

	public String getDesPrestaciones() {
		return desPrestaciones;
	}

	public void setDesPrestaciones(String desPrestaciones) {
		this.desPrestaciones = desPrestaciones;
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

	public List<CedulaPrestacionesDTO> getCedulaPrestacionesList() {
		return cedulaPrestacionesList;
	}

	public void setCedulaPrestacionesList(
			List<CedulaPrestacionesDTO> cedulaPrestacionesList) {
		this.cedulaPrestacionesList = cedulaPrestacionesList;
	}
}
