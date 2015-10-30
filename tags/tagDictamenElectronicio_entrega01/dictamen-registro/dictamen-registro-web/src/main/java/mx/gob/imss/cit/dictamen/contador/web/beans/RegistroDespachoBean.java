package mx.gob.imss.cit.dictamen.contador.web.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.contador.integration.api.SolicitudRegistroIntegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.CatalogoDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.ColegioDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DespachoDTO;
import mx.gob.imss.cit.dictamen.contador.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.contador.web.pages.RegistroColegioPage;
import mx.gob.imss.cit.dictamen.contador.web.pages.RegistroDespachoPage;
import mx.gob.imss.cit.dictamen.contador.web.pages.SolicitudRegistroPage;
import mx.gob.imss.cit.dictamen.contador.web.util.ContadorConstantes;
import mx.gob.imss.cit.dictamen.contador.web.util.EnumPantallasContador;
import mx.gob.imss.cit.dictamen.contador.web.util.FacesUtils;
import mx.gob.imss.cit.dictamen.contador.web.util.SolicitudRegistroUtil;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

@ManagedBean(name = "registroDespachoBean")
@ViewScoped
public class RegistroDespachoBean extends BaseBean {

	private static final long serialVersionUID = -70662889252962586L;
	private static final Logger LOG = Logger
			.getLogger(RegistroDespachoBean.class);

	@ManagedProperty(value = "#{solicitudRegistroPage}")
	private SolicitudRegistroPage solicitudRegistroPage;
	@ManagedProperty(value = "#{solicitudRegistroBean}")
	private SolicitudRegistroBean solicitudRegistroBean;
	@ManagedProperty(value = "#{registroDespachoPage}")
	private RegistroDespachoPage registroDespachoPage;
	@ManagedProperty(value = "#{registroColegioPage}")
	private RegistroColegioPage registroColegioPage;
	
	@EJB
	SolicitudRegistroIntegrator solicitudRegistroIntegrator;

	/**
	 * Método que valida la opcion seleccionada de despacho o independiente
	 * 
	 */
	public void elegirOpcion(){
		LOG.info("::: Eligiendo opcion: "+registroDespachoPage.getOpcionSeleccionada());
		if(registroDespachoPage.getOpcionSeleccionada() == null){
			solicitudRegistroPage.getContador().setIndependiente(false);
			solicitudRegistroPage.getContador().setPerteneceDespacho(false);
		}else if(registroDespachoPage.getOpcionSeleccionada().equals(ContadorConstantes.INDEPENDIENTE)){
			solicitudRegistroPage.getContador().setIndependiente(true);
			solicitudRegistroPage.getContador().setPerteneceDespacho(false);
			solicitudRegistroPage.getContador().setTrabajadores(false);
		}else if(registroDespachoPage.getOpcionSeleccionada().equals(ContadorConstantes.DESPACHO)){
			solicitudRegistroPage.getContador().setIndependiente(false);
			solicitudRegistroPage.getContador().setPerteneceDespacho(true);
			solicitudRegistroPage.getContador().setDespacho(new DespachoDTO());
			registroDespachoPage.setRfcBusqueda(null);
		}
		registroDespachoPage.setDespachoEncontrado(false);
	}
	/**
	 * Método que activa la casilla del campo numero de trabajadores
	 *
	 */
	public void activarNumTrabajadores(){
		solicitudRegistroPage.getContador().setnTrabajadores(0);
	}
	
	/**
	 * Método que busca un despacho a partir de su rfc.
	 * 
	 */
	public void buscarDespacho(){
		
		LOG.info("::: Buscando despacho: " + registroDespachoPage.getRfcBusqueda());
		if(StringUtils.isNotBlank(registroDespachoPage.getRfcBusqueda())){
			try {
				DespachoDTO despacho = solicitudRegistroIntegrator.obtenerDespachoDTO(registroDespachoPage.getRfcBusqueda());
				if(despacho != null){
					solicitudRegistroPage.getContador().setDespacho(despacho);
					registroDespachoPage.setDespachoEncontrado(true);
					LOG.info("::: Despacho encontrado: " + registroDespachoPage.getRfcBusqueda());
					registroDespachoPage.setCargos(solicitudRegistroIntegrator.obtenerCatalogoCargos());
					solicitudRegistroPage.getContador().setCargo(new CatalogoDTO());
				}else{
					solicitudRegistroPage.getContador().setDespacho(new DespachoDTO());
					registroDespachoPage.setDespachoEncontrado(false);
					solicitudRegistroPage.setHeaderDialog("message.contador.titulo");
					solicitudRegistroPage.setMensajeDialog("message.contador.despacho.sinDatos");
					FacesUtils.getRequestContext().execute("dialogGeneral.show();");
				}
			}catch(Exception e){
				registroDespachoPage.setDespachoEncontrado(false);
				solicitudRegistroPage.setHeaderDialog("message.label.error");
				solicitudRegistroPage.setMensajeDialog("message.label.errorInesperado");
				FacesUtils.getRequestContext().execute("dialogGeneral.show();");
			}
		}else{
			registroDespachoPage.setDespachoEncontrado(false);
			solicitudRegistroPage.setHeaderDialog("message.contador.validacion");
			solicitudRegistroPage.setMensajeDialog("message.contador.validacion.sinrfc");
			FacesUtils.getRequestContext().execute("dialogGeneral.show();");
		}
	}
	
	/**
	 * Método que valida que los datos del despacho sean los correctos y necesarios.
	 * 
	 */
	private boolean validarDatosDespacho() {		
		if(solicitudRegistroPage.getContador().isIndependiente()){
			solicitudRegistroPage.setMensajeDialog(SolicitudRegistroUtil.validarDatosIndependiente(solicitudRegistroPage.getContador()));
		}else if(solicitudRegistroPage.getContador().isPerteneceDespacho()){
			solicitudRegistroPage.setMensajeDialog(SolicitudRegistroUtil.validarDatosDespacho(solicitudRegistroPage.getContador(),registroDespachoPage.getRfcBusqueda()));
		}else{
			solicitudRegistroPage.setHeaderDialog("message.contador.validacion");
			solicitudRegistroPage.setMensajeDialog("message.contador.validacion.opcion");
			FacesUtils.getRequestContext().execute("dialogGeneral.show();");
			return Boolean.FALSE;
		}
		if(!StringUtils.isBlank(solicitudRegistroPage.getMensajeDialog())){
			solicitudRegistroPage.setHeaderDialog("message.contador.validacion");
			FacesUtils.getRequestContext().execute("dialogGeneral.show();");
			return Boolean.FALSE;
		}	
		return Boolean.TRUE;
	}
	
	public void validarRedireccionToRegistroColegio() {
		if (validarDatosDespacho()) {
			FacesUtils.getRequestContext().execute("datosCorrectos.show();");
		}
	}
	
	/**
	 * Método que inicia las variables para el proceso de registro de colegio y
	 * redirecciona a la pantalla.
	 * 
	 */
	public String redireccionarToRegistroColegio(){
		solicitudRegistroPage.setPaginaActual(EnumPantallasContador.REGISTRO_COLEGIO.getId());
		solicitudRegistroPage.getContador().setColegio(new ColegioDTO());
		registroColegioPage.setRfcBusqueda("");
		return solicitudRegistroBean.redireccionarRegistroColegio();
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
	 * @return the registroDespachoPage
	 */
	public RegistroDespachoPage getRegistroDespachoPage() {
		return registroDespachoPage;
	}

	/**
	 * @param registroDespachoPage
	 *            the registroDespachoPage to set
	 */
	public void setRegistroDespachoPage(
			RegistroDespachoPage registroDespachoPage) {
		this.registroDespachoPage = registroDespachoPage;
	}

	/**
	 * @return the solicitudRegistroBean
	 */
	public SolicitudRegistroBean getSolicitudRegistroBean() {
		return solicitudRegistroBean;
	}

	/**
	 * @param solicitudRegistroBean
	 *            the solicitudRegistroBean to set
	 */
	public void setSolicitudRegistroBean(
			SolicitudRegistroBean solicitudRegistroBean) {
		this.solicitudRegistroBean = solicitudRegistroBean;
	}

	/**
	 * @return the registroColegioPage
	 */
	public RegistroColegioPage getRegistroColegioPage() {
		return registroColegioPage;
	}

	/**
	 * @param registroColegioPage
	 *            the registroColegioPage to set
	 */
	public void setRegistroColegioPage(RegistroColegioPage registroColegioPage) {
		this.registroColegioPage = registroColegioPage;
	}
}
