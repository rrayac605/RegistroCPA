package mx.gob.imss.cit.dictamen.web.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.constants.NavigationConstants;
import mx.gob.imss.cit.dictamen.web.pages.BienvenidaPage;

import org.apache.log4j.Logger;

@ManagedBean(name = "bienvenidaBean")
@ViewScoped
public class BienvenidaBean extends BaseBean{

	private static final Logger LOGGER = Logger.getLogger(BienvenidaBean.class);
	
	private static final long serialVersionUID = 7107693419877419759L;
	
	
	@ManagedProperty(value = "#{bienvenidaPage}")
	private  BienvenidaPage  bienvenidaPage;

	@ManagedProperty(value = "#{configuracionCatalogoBean}")
	private  ConfiguracionCatalogoBean  configuracionCatalogoBean;
	
	@ManagedProperty(value = "#{firmaElectronicaBean}")
	private FirmaElectronicaBean firmaElectronicaBean;

	
	public void enviarRegistro(){

	}

	
	
	public String enviarVentanilla(){
		configuracionCatalogoBean.initConfiguracion();
		return NavigationConstants.VENTANILLA_CATALOGOS;
	}
	
	public String enviarFirmaElectronica(){		
		return firmaElectronicaBean.initPaginaPrueba();
	}
	
	
	public void setBienvenidaPage(BienvenidaPage bienvenidaPage) {
		this.bienvenidaPage = bienvenidaPage;
	}



	public void setConfiguracionCatalogoBean(
			ConfiguracionCatalogoBean configuracionCatalogoBean) {
		this.configuracionCatalogoBean = configuracionCatalogoBean;
	}



	/**
	 * @param firmaElectronicaBean the firmaElectronicaBean to set
	 */
	public void setFirmaElectronicaBean(FirmaElectronicaBean firmaElectronicaBean) {
		this.firmaElectronicaBean = firmaElectronicaBean;
	}

	
	
}