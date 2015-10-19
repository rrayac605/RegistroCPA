package mx.gob.imss.cit.dictamen.contador.web.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.contador.web.pages.SolicitudRegistroPage;

@ManagedBean(name = "solicitudRegistroBean")
@ViewScoped
public class SolicitudRegistroBean  implements Serializable {

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 1L;
	
	@ManagedProperty(value = "#{solicitudRegistroPage}")
	private SolicitudRegistroPage solicitudRegistroPage;

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
