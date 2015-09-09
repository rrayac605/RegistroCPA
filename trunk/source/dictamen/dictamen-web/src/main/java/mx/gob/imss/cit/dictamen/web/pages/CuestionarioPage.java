package mx.gob.imss.cit.dictamen.web.pages;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mx.gob.imss.cit.dictamen.integration.api.dto.CuestionarioDTO;
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
	private List<CuestionarioDTO> cuestionarios;
	
	
	public List<CuestionarioDTO> getCuestionarios() {
		return cuestionarios;
	}

	public void setCuestionarios(List<CuestionarioDTO> cuestionarios) {
		this.cuestionarios = cuestionarios;
	}
	
	
}
