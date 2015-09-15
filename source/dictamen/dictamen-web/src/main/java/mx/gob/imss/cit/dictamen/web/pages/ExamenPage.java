package mx.gob.imss.cit.dictamen.web.pages;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mx.gob.imss.cit.dictamen.integration.api.dto.ExamenDTO;
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
	private ExamenDTO examen;
	
	
	private Integer estado;
	


	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	/**
	 * @return the examen
	 */
	public ExamenDTO getExamen() {
		return examen;
	}

	/**
	 * @param examen the examen to set
	 */
	public void setExamen(ExamenDTO examen) {
		this.examen = examen;
	}


	

}
