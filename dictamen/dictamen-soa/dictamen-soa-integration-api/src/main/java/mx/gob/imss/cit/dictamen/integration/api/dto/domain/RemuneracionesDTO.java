/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.dictamen.integration.api.dto.domain;

import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.dictamen.integration.api.dto.base.BaseDTO;

public class RemuneracionesDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4553910965309963259L;
	private Long cveIdRemuneraciones;
	private String desRemuneraciones;
	private Integer indOrden;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private Date fecRegistroActualizado;
	private String cveIdUsuario;
	private List<CedulaRemuneracionesDTO> cedulaRemuneracionesList;

	public RemuneracionesDTO() {
	}

	public RemuneracionesDTO(Long cveIdRemuneraciones) {
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

	public List<CedulaRemuneracionesDTO> getCedulaRemuneracionesList() {
		return cedulaRemuneracionesList;
	}

	public void setCedulaRemuneracionesList(
			List<CedulaRemuneracionesDTO> cedulaRemuneracionesList) {
		this.cedulaRemuneracionesList = cedulaRemuneracionesList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (cveIdRemuneraciones != null ? cveIdRemuneraciones.hashCode()
				: 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof RemuneracionesDTO)) {
			return false;
		}
		RemuneracionesDTO other = (RemuneracionesDTO) object;
		if ((this.cveIdRemuneraciones == null && other.cveIdRemuneraciones != null)
				|| (this.cveIdRemuneraciones != null && !this.cveIdRemuneraciones
						.equals(other.cveIdRemuneraciones))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "mx.gob.imss.cit.dictamen.model.NdcRemuneracionesDO[ cveIdRemuneraciones="
				+ cveIdRemuneraciones + " ]";
	}
}
