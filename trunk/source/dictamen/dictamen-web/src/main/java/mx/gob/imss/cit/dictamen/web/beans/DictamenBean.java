package mx.gob.imss.cit.dictamen.web.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.component.tabview.TabView;
import org.primefaces.event.TabChangeEvent;

import mx.gob.imss.cit.dictamen.integration.api.dto.domain.ContadorPublicoAutDTO;
import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.constants.NavigationConstants;
import mx.gob.imss.cit.dictamen.web.pages.DictamenPage;
import mx.gob.imss.cit.dictamen.web.util.FacesUtils;

@ManagedBean(name = "dictamenBean")
@ViewScoped
public class DictamenBean extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = -614637897623862471L;

	@ManagedProperty(value = "#{dictamenPage}")
	private DictamenPage dictamenPage;

	@ManagedProperty(value = "#{datosPatronalesBean}")
	private DatosPatronalesBean datosPatronalesBean;

	public void init() {

		dictamenPage.setContadorPublicoAutDTO(new ContadorPublicoAutDTO());
		dictamenPage.getContadorPublicoAutDTO().setCveIdCpa(778L);
		dictamenPage.getContadorPublicoAutDTO().setRfc("GATS4812123D7");
		dictamenPage.setIndexUltimoWizard(0);
		dictamenPage.setIndexWizard(0);
		
		datosPatronalesBean.init();
	
		dictamenPage.setBanderaOcultaTabs(true);

	    FacesUtils.getApplication().getNavigationHandler().handleNavigation(
	    		FacesUtils.getFacesContext(), null, 
	    		NavigationConstants.PAGE_DICTAMINACION);

	}
	


	public void cambiarPestania(TabChangeEvent event) {
		
		TabView tabView = (TabView) event.getComponent();	     
		dictamenPage.setIndexUltimoWizard(tabView.getChildren().indexOf(event.getTab()));

	}

	/**
	 * @param datosPatronalesBean
	 *            the datosPatronalesBean to set
	 */
	public void setDatosPatronalesBean(DatosPatronalesBean datosPatronalesBean) {
		this.datosPatronalesBean = datosPatronalesBean;
	}

	/**
	 * @param dictamenPage
	 *            the dictamenPage to set
	 */
	public void setDictamenPage(DictamenPage dictamenPage) {
		this.dictamenPage = dictamenPage;
	}


	/**
	 * @return the dictamenPage
	 */
	public DictamenPage getDictamenPage() {
		return dictamenPage;
	}

	/**
	 * @return the datosPatronalesBean
	 */
	public DatosPatronalesBean getDatosPatronalesBean() {
		return datosPatronalesBean;
	}

}
