package mx.gob.imss.cit.dictamen.web.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.integration.api.FirmaElectronicaIntegrator;
import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.constants.NavigationConstants;
import mx.gob.imss.cit.dictamen.web.pages.FirmaElectronicaPage;

/**
 * Clase bean para la firma electronica
 * @author ajfuentes
 *
 */
@ManagedBean(name = "firmaElectronicaBean")
@ViewScoped
public class FirmaElectronicaBean extends BaseBean{
	
	/**
	 * UID
	 */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private FirmaElectronicaIntegrator firmaElectronicaIntegrator;
	
	
	@ManagedProperty(value = "#{firmaElectronicaPage}")
	private FirmaElectronicaPage firmaElectronicaPage;

	
	public String initPaginaPrueba() {

		return NavigationConstants.PAG_PRUEBA_FIRMA_ELECT;
	
	}
	
	
	
	public void initDialog() {

		firmaElectronicaPage.setFirmaElectronicaDTO(firmaElectronicaIntegrator.executeInitFirmaElectronica());
		
		firmaElectronicaPage.setMostrarDialogFirma(true);
	
	}
	
	public void cerrarDialog(){
		firmaElectronicaPage.setMostrarDialogFirma(false);
	}



	/**
	 * @return the firmaElectronicaPage
	 */
	public FirmaElectronicaPage getFirmaElectronicaPage() {
		return firmaElectronicaPage;
	}



	/**
	 * @param firmaElectronicaPage the firmaElectronicaPage to set
	 */
	public void setFirmaElectronicaPage(FirmaElectronicaPage firmaElectronicaPage) {
		this.firmaElectronicaPage = firmaElectronicaPage;
	}

	

}