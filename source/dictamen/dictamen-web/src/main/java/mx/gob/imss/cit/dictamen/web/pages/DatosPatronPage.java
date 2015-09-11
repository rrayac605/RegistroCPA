package mx.gob.imss.cit.dictamen.web.pages;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.integration.api.dto.DatosPatronDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.ParentLayoutDTO;
import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
@ManagedBean(name = "datosPatronPage")
@ViewScoped
public class DatosPatronPage extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3595076953499269235L;
	
	private DatosPatronDTO datosPatron;

	private List<ParentLayoutDTO> listaParentLayout;
	/**
	 * @return the datosPatron
	 */
	public DatosPatronDTO getDatosPatron() {
		return datosPatron;
	}

	/**
	 * @param datosPatron the datosPatron to set
	 */
	public void setDatosPatron(DatosPatronDTO datosPatron) {
		this.datosPatron = datosPatron;
	}

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
