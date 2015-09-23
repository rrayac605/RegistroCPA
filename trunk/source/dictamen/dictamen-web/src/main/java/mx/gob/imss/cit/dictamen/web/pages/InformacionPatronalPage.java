package mx.gob.imss.cit.dictamen.web.pages;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mx.gob.imss.cit.dictamen.integration.api.dto.InformacionPatronalDTO;
import mx.gob.imss.cit.dictamen.web.pages.base.BasePage;
import mx.gob.imss.cit.dictamen.web.util.annotations.Reset;


@ManagedBean(name = "informacionPatronalPage")
@SessionScoped
public class InformacionPatronalPage extends BasePage{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1090075736267777378L;
	
	@Reset
	private List<InformacionPatronalDTO> listadoAseveraciones;

	/**
	 * @return the listadoAseveraciones
	 */
	public List<InformacionPatronalDTO> getListadoAseveraciones() {
		return listadoAseveraciones;
	}

	/**
	 * @param listadoAseveraciones the listadoAseveraciones to set
	 */
	public void setListadoAseveraciones(List<InformacionPatronalDTO> listadoAseveraciones) {
		this.listadoAseveraciones = listadoAseveraciones;
	}



}
