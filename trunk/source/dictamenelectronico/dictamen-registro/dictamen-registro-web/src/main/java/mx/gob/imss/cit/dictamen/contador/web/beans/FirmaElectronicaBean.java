package mx.gob.imss.cit.dictamen.contador.web.beans;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.contador.integration.api.FirmaElectronicaIntegrator;
import mx.gob.imss.cit.dictamen.contador.web.pages.FirmaElectronicaPage;




@ManagedBean(name = "firmaElectronicaBean")
@ViewScoped
public class FirmaElectronicaBean implements Serializable{
	
	/**
	 * UID
	 */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private FirmaElectronicaIntegrator firmaElectronicaIntegrator;
	
	
	@ManagedProperty(value = "#{firmaElectronicaPage}")
	private FirmaElectronicaPage firmaElectronicaPage;


	
	
	public void initDialog() {



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