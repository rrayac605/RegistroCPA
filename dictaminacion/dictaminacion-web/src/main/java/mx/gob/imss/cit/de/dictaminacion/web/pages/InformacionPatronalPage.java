package mx.gob.imss.cit.de.dictaminacion.web.pages;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.CargaDocumentoDTO;
import mx.gob.imss.cit.de.dictaminacion.web.pages.base.BasePage;
import mx.gob.imss.cit.de.dictaminacion.web.util.annotations.Reset;


@ManagedBean(name = "informacionPatronalPage")
@SessionScoped
public class InformacionPatronalPage extends BasePage{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1090075736267777378L;
	
	@Reset
	private List<CargaDocumentoDTO> listadoAseveraciones;

	/**
	 * @return the listadoAseveraciones
	 */
	public List<CargaDocumentoDTO> getListadoAseveraciones() {
		return listadoAseveraciones;
	}

	/**
	 * @param listadoAseveraciones the listadoAseveraciones to set
	 */
	public void setListadoAseveraciones(List<CargaDocumentoDTO> listadoAseveraciones) {
		this.listadoAseveraciones = listadoAseveraciones;
	}



}
