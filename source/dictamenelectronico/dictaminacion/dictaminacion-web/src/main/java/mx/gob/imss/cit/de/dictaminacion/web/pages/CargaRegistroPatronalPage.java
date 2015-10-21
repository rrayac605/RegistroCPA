package mx.gob.imss.cit.de.dictaminacion.web.pages;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.PatronAsociadoDTO;
import mx.gob.imss.cit.de.dictaminacion.web.pages.base.BasePage;
@ManagedBean(name = "cargaRegistroPatronalPage")
@SessionScoped
public class CargaRegistroPatronalPage extends BasePage {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4268387060742221657L;
		
	
	private List<PatronAsociadoDTO> listaRegistrosPatronales;

	public List<PatronAsociadoDTO> getListaRegistrosPatronales() {
		return listaRegistrosPatronales;
	}

	public void setListaRegistrosPatronales(List<PatronAsociadoDTO> listaRegistrosPatronales) {
		this.listaRegistrosPatronales = listaRegistrosPatronales;
	}


	
}
