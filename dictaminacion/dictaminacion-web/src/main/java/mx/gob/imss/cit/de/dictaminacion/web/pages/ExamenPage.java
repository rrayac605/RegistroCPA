package mx.gob.imss.cit.de.dictaminacion.web.pages;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.AtestiguamientoDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.AtestiguamientoDictamenDTO;
import mx.gob.imss.cit.de.dictaminacion.web.pages.base.BasePage;

@ManagedBean(name = "examenPage")
@SessionScoped
public class ExamenPage extends BasePage{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4532952060079534807L;
	

	private AtestiguamientoDictamenDTO atestiguamientoDictamenDTOSeleccionado;
	
	private AtestiguamientoDTO atestiguamientoDTO;
	

	private Boolean habilitarObservacion;

	public AtestiguamientoDTO getAtestiguamientoDTO() {
		return atestiguamientoDTO;
	}

	public void setAtestiguamientoDTO(AtestiguamientoDTO atestiguamientoDTO) {
		this.atestiguamientoDTO = atestiguamientoDTO;
	}

	public AtestiguamientoDictamenDTO getAtestiguamientoDictamenDTOSeleccionado() {
		return atestiguamientoDictamenDTOSeleccionado;
	}

	public void setAtestiguamientoDictamenDTOSeleccionado(
			AtestiguamientoDictamenDTO atestiguamientoDictamenDTOSeleccionado) {
		this.atestiguamientoDictamenDTOSeleccionado = atestiguamientoDictamenDTOSeleccionado;
	}


	public Boolean getHabilitarObservacion() {
		return habilitarObservacion;
	}

	public void setHabilitarObservacion(Boolean habilitarObservacion) {
		this.habilitarObservacion = habilitarObservacion;
	}
}
