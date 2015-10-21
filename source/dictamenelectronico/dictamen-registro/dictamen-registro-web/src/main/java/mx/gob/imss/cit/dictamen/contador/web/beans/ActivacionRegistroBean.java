package mx.gob.imss.cit.dictamen.contador.web.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import mx.gob.imss.cit.dictamen.contador.web.beans.base.BaseBean;

import org.primefaces.event.ToggleEvent;


@ManagedBean(name = "activacionRegistroBean")
@ViewScoped
public class ActivacionRegistroBean extends BaseBean {
   
   
	private static final long serialVersionUID = -4461977360943388198L;

	public void handleToggle(ToggleEvent event) {
		
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Toggled", "Visibility:" + event.getVisibility());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
	
	public String initActivacionDespacho(){
	  return "activacionRegistroDespacho";
	}
	
}
