package mx.gob.imss.cit.dictamen.web.pages;


import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mx.gob.imss.cit.dictamen.integration.api.dto.domain.AtestiguamientoDictamenDTO;
import mx.gob.imss.cit.dictamen.web.pages.base.BasePage;
import mx.gob.imss.cit.dictamen.web.util.annotations.Reset;

@ManagedBean(name = "cuestionarioPage")
@SessionScoped
public class CuestionarioPage extends BasePage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7120485390259765026L;
	
	@Reset
	private List<AtestiguamientoDictamenDTO> examenes;

	/**
	 * @return the examenes
	 */
	public List<AtestiguamientoDictamenDTO> getExamenes() {
		return examenes;
	}

	/**
	 * @param examenes the examenes to set
	 */
	public void setExamenes(List<AtestiguamientoDictamenDTO> examenes) {
		this.examenes = examenes;
	}
	

	
}
