package mx.gob.imss.cit.de.dictaminacion.web.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.de.dictaminacion.web.constants.NavigationConstants;


@ManagedBean(name = "menuCedulasBean")
@ViewScoped
public class MenuCedulasBean {
	
	public String editarCedulaRemuneraciones(){
		
		return NavigationConstants.PAGE_CEDULA_REMUNERACIONES;
	}
	

}
