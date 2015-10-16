package mx.gob.imss.cit.dictamen.web.pages;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mx.gob.imss.cit.dictamen.integration.api.dto.ParentLayoutDTO;
import mx.gob.imss.cit.dictamen.web.pages.base.BasePage;
@ManagedBean(name = "cargaArchivosPage")
@SessionScoped
public class CargaArchivosPage extends BasePage {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4268387060742221657L;
		
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
