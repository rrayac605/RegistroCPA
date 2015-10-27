package mx.gob.imss.cit.de.dictaminacion.web.pages;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.ParentLayoutDTO;
import mx.gob.imss.cit.de.dictaminacion.web.pages.base.BasePage;
import mx.gob.imss.cit.de.dictaminacion.web.util.annotations.Reset;
@ManagedBean(name = "cargaArchivosPage")
@SessionScoped
public class CargaArchivosPage extends BasePage {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4268387060742221657L;
		
	@Reset
	private List<ParentLayoutDTO> listaParentLayout;

	/**
	 * @return the listaParentLayout
	 */
	public List<ParentLayoutDTO> getListaParentLayout() {
		return listaParentLayout;
	}

	/**
	 * @param listaParentLayout the listaParentLayout to set
	 */
	public void setListaParentLayout(List<ParentLayoutDTO> listaParentLayout) {
		this.listaParentLayout = listaParentLayout;
	}	
	
}
