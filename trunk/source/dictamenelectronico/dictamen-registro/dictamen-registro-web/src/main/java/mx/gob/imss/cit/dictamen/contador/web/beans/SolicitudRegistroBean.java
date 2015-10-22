package mx.gob.imss.cit.dictamen.contador.web.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.contador.integration.api.SolicitudRegistroIntegrator;
import mx.gob.imss.cit.dictamen.contador.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.contador.web.pages.LoginPage;
import mx.gob.imss.cit.dictamen.contador.web.pages.SolicitudRegistroPage;
import mx.gob.imss.cit.dictamen.contador.web.util.EnumPantallasContador;
import mx.gob.imss.cit.dictamen.contador.web.util.FacesUtils;

import org.apache.log4j.Logger;

@ManagedBean(name = "solicitudRegistroBean")
@ViewScoped
public class SolicitudRegistroBean extends BaseBean {
	/**
	 * Serial
	 */
	private static final long serialVersionUID = -9097021822888974033L;
	private static final Logger LOG = Logger.getLogger(SolicitudRegistroBean.class);

	@ManagedProperty(value = "#{solicitudRegistroPage}")
	private SolicitudRegistroPage solicitudRegistroPage;
	@ManagedProperty(value = "#{loginPage}")
	private LoginPage loginPage;
	@EJB
	SolicitudRegistroIntegrator solicitudRegistroIntegrator;

	/**
	 * Método que inicializa las variables necesarias para la pantalla de SolicitudRegistro
	 * 
	 */

	// ************************* REDIRECTS ************************//
	// ************************************************************//

	/**
	 * 
	 * 
	 */
	public String regresarToContadores() {
		solicitudRegistroPage = new SolicitudRegistroPage();
		return EnumPantallasContador.CONTADORES.getNombre();
	}

	public String redireccionarToDespacho() {
		LOG.info("::: Validando datos correctos.");
		FacesUtils.getRequestContext().execute("datosCorrectos.show();");
		return "";
	}

	public void guardarDatos() {
		solicitudRegistroPage.setHeaderDialog("message.contador.solicitud.titulo");
		solicitudRegistroPage.setMensajeDialog("message.contador.solicitud.datosGuardados");
		FacesUtils.getRequestContext().execute("dialogGeneral.show();");
	}

	// ****************** GETTERS AND SETTERS *********************//
	// ************************************************************//

	/**
	 * @return the solicitudRegistroPage
	 */
	public SolicitudRegistroPage getSolicitudRegistroPage() {
		return solicitudRegistroPage;
	}

	/**
	 * @param solicitudRegistroPage
	 *            the solicitudRegistroPage to set
	 */
	public void setSolicitudRegistroPage(SolicitudRegistroPage solicitudRegistroPage) {
		this.solicitudRegistroPage = solicitudRegistroPage;
	}

	/**
	 * @return the loginPage
	 */
	public LoginPage getLoginPage() {
		return loginPage;
	}

	/**
	 * @param loginPage
	 *            the loginPage to set
	 */
	public void setLoginPage(LoginPage loginPage) {
		this.loginPage = loginPage;
	}


}
