/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.de.dictaminacion.commons.to.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class RemuneracionesTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -263054222254554352L;
	private Long cveIdRemuneraciones;
	private String desRemuneraciones;
	private Integer indOrden;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private Date fecRegistroActualizado;
	private String cveIdUsuario;
	private List<CedulaRemuneracionesTO> cedulaRemuneracionesList;

	public RemuneracionesTO() {
	}

	public RemuneracionesTO(Long cveIdRemuneraciones) {
		this.cveIdRemuneraciones = cveIdRemuneraciones;
	}

	public Long getCveIdRemuneraciones() {
		return cveIdRemuneraciones;
	}

	public void setCveIdRemuneraciones(Long cveIdRemuneraciones) {
		this.cveIdRemuneraciones = cveIdRemuneraciones;
	}

	public String getDesRemuneraciones() {
		return desRemuneraciones;
	}

	public void setDesRemuneraciones(String desRemuneraciones) {
		this.desRemuneraciones = desRemuneraciones;
	}

	public Integer getIndOrden() {
		return indOrden;
	}

	public void setIndOrden(Integer indOrden) {
		this.indOrden = indOrden;
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

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public List<CedulaRemuneracionesTO> getCedulaRemuneracionesList() {
		return cedulaRemuneracionesList;
	}

	public void setCedulaRemuneracionesList(
			List<CedulaRemuneracionesTO> cedulaRemuneracionesList) {
		this.cedulaRemuneracionesList = cedulaRemuneracionesList;
	}
}
