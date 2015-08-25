package mx.gob.imss.cit.dictamen.web.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.constants.NavigationConstants;
import mx.gob.imss.cit.dictamen.web.pages.SolicitudRegistroPage;

@ManagedBean(name = "solicitudRegistroBean")
@ViewScoped
public class SolicitudRegistroBean extends BaseBean{

	private static final long serialVersionUID = 7107693419877419759L;
	
	
	@ManagedProperty(value = "#{solicitudRegistroPage}")
	private  SolicitudRegistroPage  solicitudRegistroPage;

	public String initSolicitudRegistro(){
		
		
		return NavigationConstants.PAG_SOLICITUD_REGISTRO;
	}

	/**
	 * @return the solicitudRegistroPage
	 */
	public SolicitudRegistroPage getSolicitudRegistroPage() {
		return solicitudRegistroPage;
	}

	/**
	 * @param solicitudRegistroPage the solicitudRegistroPage to set
	 */
	public void setSolicitudRegistroPage(SolicitudRegistroPage solicitudRegistroPage) {
		this.solicitudRegistroPage = solicitudRegistroPage;
	}

}