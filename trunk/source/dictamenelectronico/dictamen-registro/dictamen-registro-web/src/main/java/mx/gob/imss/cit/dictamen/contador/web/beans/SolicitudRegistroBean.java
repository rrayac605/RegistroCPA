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
import mx.gob.imss.cit.dictamen.contador.web.util.SolicitudRegistroUtil;

import org.apache.commons.lang.StringUtils;
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
	 * Método que valida los datos de un contador, obligatorios asi como
	 * expresiones regulares.
	 * 
	 */
	public boolean validarDatosContador(){
		solicitudRegistroPage.setMensajeDialog(SolicitudRegistroUtil.validarDatosContacto(
				solicitudRegistroPage.getContador().getContacto()));
		if(!StringUtils.isBlank(solicitudRegistroPage.getMensajeDialog())){
			solicitudRegistroPage.setHeaderDialog("message.contador.validacion");
			FacesUtils.getRequestContext().execute("dialogGeneral.show();");
			return Boolean.FALSE;
		}		
		solicitudRegistroPage.setMensajeDialog(SolicitudRegistroUtil.validarInfoProfesional(
				solicitudRegistroPage.getContador().getInfoProf()));
		if(!StringUtils.isBlank(solicitudRegistroPage.getMensajeDialog())){
			solicitudRegistroPage.setHeaderDialog("message.contador.validacion");
			FacesUtils.getRequestContext().execute("dialogGeneral.show();");
			return Boolean.FALSE;
		}		
		return Boolean.TRUE;
	}
	/**
	 * Método que valida y envia a guardar los datos de contador.
	 */
	public void guardarDatos() {
		if(validarDatosContador() && guardarDatosContador()){
			solicitudRegistroPage.setHeaderDialog("message.contador.solicitud.titulo");
			solicitudRegistroPage.setMensajeDialog("message.contador.solicitud.datosGuardados");
			FacesUtils.getRequestContext().execute("dialogGeneral.show();");
		}
	}

	private boolean guardarDatosContador() {
		try{			
			return solicitudRegistroIntegrator.guardarDatosContador(solicitudRegistroPage.getContador());			
		}catch(Exception e){
			solicitudRegistroPage.setHeaderDialog("message.label.error");
			solicitudRegistroPage.setMensajeDialog("message.label.errorInesperado");
			FacesUtils.getRequestContext().execute("dialogGeneral.show();");
			return Boolean.FALSE;
		}
	}

	// ************************* REDIRECTS ************************//
	// ************************************************************//
	
	/**
	 * Método que regresa a la pantalla anterior
	 * @return
	 */
	public String regresarToContadores() {
		solicitudRegistroPage = new SolicitudRegistroPage();
		return EnumPantallasContador.CONTADORES.getNombre();
	}

	/**
	 * Método que valida datos de guardado y redirecciona a registro despacho
	 * @return
	 */
	public String redireccionarToDespacho() {
		LOG.info("::: Validando datos correctos.");
		if(validarDatosContador()){
			solicitudRegistroPage.getContador().setIndependiente(false);
			solicitudRegistroPage.getContador().setPertenceDespacho(false);
			FacesUtils.getRequestContext().execute("datosCorrectos.show();");
		}
		return "";
	}

	/**
	 * Redirecciona a la pantalla de Solicitud de Registro
	 */
	public String redireccionarSolicitudRegistro(){
		return EnumPantallasContador.SOLICITUD_REGISTRO.getNombre();
	}
	/**
	 * Redirecciona a la pantalla de Registro del Despacho
	 */
	public String redireccionarRegistroDespacho(){
		return EnumPantallasContador.REGISTRO_DESPACHO.getNombre();
	}
	/**
	 * Redirecciona a la pantalla de Registro del Colegio
	 */
	public String redireccionarRegistroColegio(){
		return EnumPantallasContador.REGISTRO_COLEGIO.getNombre();
	}
	/**
	 * Redirecciona a la pantalla de Registro de Documentacion
	 */
	public String redireccionarRegistroDocumentacion(){
		return EnumPantallasContador.REGISTRO_DOCUMENTACION.getNombre();
	}
	/**
	 * Redirecciona a la pantalla de Registro de Vista Previa
	 */
	public String redireccionarRegistroVista(){
		return EnumPantallasContador.REGISTRO_VISTA.getNombre();
	}
	/**
	 * Redirecciona a la pantalla de Registro de Protesta
	 */
	public String redireccionarRegistroProtesta(){
		return EnumPantallasContador.REGISTRO_PROTESTA.getNombre();
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
