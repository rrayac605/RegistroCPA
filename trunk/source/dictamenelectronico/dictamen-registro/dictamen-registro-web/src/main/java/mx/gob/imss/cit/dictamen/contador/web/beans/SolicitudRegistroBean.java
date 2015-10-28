package mx.gob.imss.cit.dictamen.contador.web.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.contador.integration.api.SolicitudRegistroIntegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.CatalogoDTO;
import mx.gob.imss.cit.dictamen.contador.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.contador.web.pages.RegistroDespachoPage;
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
	@ManagedProperty(value = "#{registroDespachoPage}")
	private RegistroDespachoPage registroDespachoPage;
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
	 * Método que valida datos de guardado y redirecciona a registro despacho
	 * @return
	 */
	public void validarRedireccionToDespacho() {
		LOG.info("::: Validando datos correctos.");
		if(validarDatosContador()){
			FacesUtils.getRequestContext().execute("datosCorrectos.show();");
		}
	}
	
	/**
	 * Método que inicia las variables para el proceso de registro de despacho y
	 * redirecciona a la pantalla.
	 * 
	 */
	public String redireccionToDespacho() {
		solicitudRegistroPage.getContador().setIndependiente(false);
		solicitudRegistroPage.getContador().setPerteneceDespacho(false);
		registroDespachoPage = new RegistroDespachoPage();
		solicitudRegistroPage.getContador().setCargo(new CatalogoDTO());
		solicitudRegistroPage.setPaginaActual(EnumPantallasContador.REGISTRO_DESPACHO.getId());
		return redireccionarRegistroDespacho();
	}

	// ************************* REDIRECTS ************************//
	// ************************************************************//
	
	/**
	 * Método que regresa a la pantalla anterior
	 * 
	 * @return
	 */
	public String regresarToContadores() {
		solicitudRegistroPage = new SolicitudRegistroPage();
		return EnumPantallasContador.CONTADORES.getNombre();
	}

	/**
	 * Redirecciona a la pantalla de Solicitud de Registro
	 */
	public String redireccionarSolicitudRegistro() {
		return EnumPantallasContador.SOLICITUD_REGISTRO.getNombre();
	}

	/**
	 * Redirecciona a la pantalla de Registro del Despacho
	 */
	public String redireccionarRegistroDespacho() {
		return EnumPantallasContador.REGISTRO_DESPACHO.getNombre();
	}

	/**
	 * Redirecciona a la pantalla de Registro del Colegio
	 */
	public String redireccionarRegistroColegio() {
		return EnumPantallasContador.REGISTRO_COLEGIO.getNombre();
	}

	/**
	 * Redirecciona a la pantalla de Registro de Documentacion
	 */
	public String redireccionarRegistroDocumentacion() {
		return EnumPantallasContador.REGISTRO_DOCUMENTACION.getNombre();
	}

	/**
	 * Redirecciona a la pantalla de Registro de Vista Previa
	 */
	public String redireccionarRegistroVista() {
		return EnumPantallasContador.REGISTRO_VISTA.getNombre();
	}

	/**
	 * Redirecciona a la pantalla de Registro de Protesta
	 */
	public String redireccionarRegistroProtesta() {
		return EnumPantallasContador.REGISTRO_PROTESTA.getNombre();
	}
	
	/**
	 * Redirecciona a la pantalla de Acuse de Recibo
	 */
	public String redireccionarAcuseRecibo() {
		return EnumPantallasContador.ACUSE_RECIBO.getNombre();
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
	 * @return the registroDespachoPage
	 */
	public RegistroDespachoPage getRegistroDespachoPage() {
		return registroDespachoPage;
	}
	/**
	 * @param registroDespachoPage the registroDespachoPage to set
	 */
	public void setRegistroDespachoPage(RegistroDespachoPage registroDespachoPage) {
		this.registroDespachoPage = registroDespachoPage;
	}

}
