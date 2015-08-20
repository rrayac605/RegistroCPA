package mx.gob.imss.cit.dictamen.web.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;

import org.primefaces.context.RequestContext;
import org.primefaces.event.FlowEvent;

@ManagedBean(name = "wizardRegistroMedioContactoBean")
@ViewScoped
public class WizardRegistroMedioContactoBean extends BaseBean {

	/**
	 * Serial Version UID de la clase
	 */
	private static final long serialVersionUID = 5505223514348630976L;

	public String onFlowProcess(FlowEvent flowEvent){
		if(flowEvent.getNewStep().equals("mediosContactoTab")){
			RequestContext context = RequestContext.getCurrentInstance();
			context.execute("menuMedioContactoDialog.show();");
		}
		
		return flowEvent.getNewStep();
	}

}
