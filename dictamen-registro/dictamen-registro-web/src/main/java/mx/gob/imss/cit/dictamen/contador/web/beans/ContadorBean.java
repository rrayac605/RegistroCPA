package mx.gob.imss.cit.dictamen.contador.web.beans;

import java.util.Date;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.contador.integration.api.SolicitudRegistroIntegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.ContadorPublicoAutDTO;
import mx.gob.imss.cit.dictamen.contador.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.contador.web.pages.LoginPage;
import mx.gob.imss.cit.dictamen.contador.web.pages.SolicitudRegistroPage;
import mx.gob.imss.cit.dictamen.contador.web.util.EnumPantallasContador;
import mx.gob.imss.cit.dictamen.contador.web.util.FacesUtils;

@ManagedBean(name = "contadorBean")
@ViewScoped
public class ContadorBean extends BaseBean {

	/**
	 * Serial
	 */
	private static final long serialVersionUID = -917860651049653638L;
	@ManagedProperty(value = "#{solicitudRegistroPage}")
	private SolicitudRegistroPage solicitudRegistroPage;
	@ManagedProperty(value = "#{loginPage}")
	private LoginPage loginPage;
	@EJB
	SolicitudRegistroIntegrator solicitudRegistroIntegrator;

	/**
	 * Método que consulta los datos del contador.
	 * Si no hay datos se le envía un mensaje al usuario y no continua.
	 */
	public String enviarToSolicitud(){
		try{
			solicitudRegistroPage.setFechaActual(new Date());
			solicitudRegistroPage.setFolio(1234567890987234124L);
			ContadorPublicoAutDTO contador = solicitudRegistroIntegrator.obtenerContadorPublicoAutDTO(loginPage.getCurp(),loginPage.getRfc());			
			if(contador == null){
				solicitudRegistroPage.setHeaderDialog("message.contador.titulo");
				solicitudRegistroPage.setMensajeDialog("message.contador.sinDatos");
				FacesUtils.getRequestContext().execute("dialogGeneral.show();");
				return "";
			}
			solicitudRegistroPage.setContador(contador);
			solicitudRegistroPage.setPaginaActual(EnumPantallasContador.SOLICITUD_REGISTRO.getId());
		}catch(Exception e){
			solicitudRegistroPage.setHeaderDialog("message.label.error");
			solicitudRegistroPage.setMensajeDialog("message.label.errorInesperado");
			FacesUtils.getRequestContext().execute("dialogGeneral.show();");
			return "";
		}

		return redireccionarToSolicitud();
	}


	// ************************* REDIRECTS ************************//
	// ************************************************************//

	/**
	 * Método que redirecciona a SolicitudRegistro
	 * 
	 */
	public String redireccionarToSolicitud() {
		return EnumPantallasContador.SOLICITUD_REGISTRO.getNombre();
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
	public void setSolicitudRegistroPage(
			SolicitudRegistroPage solicitudRegistroPage) {
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

	/**
	 * @return the solicitudRegistroIntegrator
	 */
	public SolicitudRegistroIntegrator getSolicitudRegistroIntegrator() {
		return solicitudRegistroIntegrator;
	}

	/**
	 * @param solicitudRegistroIntegrator
	 *            the solicitudRegistroIntegrator to set
	 */
	public void setSolicitudRegistroIntegrator(
			SolicitudRegistroIntegrator solicitudRegistroIntegrator) {
		this.solicitudRegistroIntegrator = solicitudRegistroIntegrator;
	}

}
