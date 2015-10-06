package mx.gob.imss.cit.dictamen.web.pages;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mx.gob.imss.cit.dictamen.integration.api.dto.domain.AtestiguamientoDTO;
import mx.gob.imss.cit.dictamen.web.pages.base.BasePage;
import mx.gob.imss.cit.dictamen.web.util.annotations.Reset;

@ManagedBean(name = "examenPage")
@SessionScoped
public class ExamenPage extends BasePage{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4532952060079534807L;
	
	@Reset
	private AtestiguamientoDTO atestiguamientoDTO;
	
	
	private Integer estado;
	


	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public AtestiguamientoDTO getAtestiguamientoDTO() {
		return atestiguamientoDTO;
	}

	public void setAtestiguamientoDTO(AtestiguamientoDTO atestiguamientoDTO) {
		this.atestiguamientoDTO = atestiguamientoDTO;
	}


}
