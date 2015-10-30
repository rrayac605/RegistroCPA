package mx.gob.imss.cit.dictamen.ventanilla.web.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.dictamen.ventanilla.web.pages.DatosPatronalesPage;
import mx.gob.imss.cit.dictamen.ventanilla.web.pages.SolicitudPage;

@ManagedBean(name = "datosPatronalesBean")
@ViewScoped
public class SolicitudContadorBean {

	private Logger LOG=Logger.getLogger(SolicitudContadorBean.class) ;


	

	
	private static final long serialVersionUID = 2825687007915597308L;

	@ManagedProperty(value = "#{datosPatronalesPage}")
	private DatosPatronalesPage datosPatronalesPage;
	
	@ManagedProperty(value = "#{dictamenPage}")
	private SolicitudPage dictamenPage;
	
	public void init(){
		
	
	}
	
	



	/**
	 * 
	 */
	private void inicializarPatron() {
	
	}
	
	private void inicializarEjercicioFiscal() {
		
		
	}
	
	public void calcularTipoDictamen(){
	
		
	}
	
	public void calcularValuada(){
		
		
	}
	
	

	public void buscar(){			
		  
	}

	
	private String busquedaInterna(){
		return null;
	}


	/**
	 * 
	 */
	private void busquedaSat() {
		
	}
	
	public void limpiar(){						
					
	}
	

	
	private void inhabilitaOpciones(){
		dictamenPage.setBanderaOcultaTabs(true);
	}
	
	private void habilitaOpciones(){
		dictamenPage.setBanderaOcultaTabs(false);
	}
	

	public void guardar(){
		
						
	}
		
	/**
	 * @param datosPatronPage the datosPatronPage to set
	 */
	public void setDatosPatronalesPage(DatosPatronalesPage datosPatronalesPage) {
		this.datosPatronalesPage = datosPatronalesPage;
	}



	/**
	 * @return the dictamenPage
	 */
	public SolicitudPage getDictamenPage() {
		return dictamenPage;
	}



	/**
	 * @param dictamenPage the dictamenPage to set
	 */
	public void setDictamenPage(SolicitudPage dictamenPage) {
		this.dictamenPage = dictamenPage;
	}



	/**
	 * @return the datosPatronalesPage
	 */
	public DatosPatronalesPage getDatosPatronalesPage() {
		return datosPatronalesPage;
	}




}
