package mx.gob.imss.cit.dictamen.contador.web.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import mx.gob.imss.cit.dictamen.contador.integration.api.SolicitudRegistroIntegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.ColegioDTO;
import mx.gob.imss.cit.dictamen.contador.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.contador.web.pages.RegistroColegioPage;
import mx.gob.imss.cit.dictamen.contador.web.pages.SolicitudRegistroPage;
import mx.gob.imss.cit.dictamen.contador.web.util.EnumPantallasContador;
import mx.gob.imss.cit.dictamen.contador.web.util.ExpresionesRegularesUtil;
import mx.gob.imss.cit.dictamen.contador.web.util.FacesUtils;
import mx.gob.imss.cit.dictamen.contador.web.util.SolicitudRegistroUtil;

/**
 * 
 * @author ariverav
 *
 */

@ManagedBean(name = "registroColegioBean")
@ViewScoped
public class RegistroColegioBean extends BaseBean {

	private static final long serialVersionUID = -3346701592842732279L;
	private static final Logger LOG = Logger
			.getLogger(RegistroColegioBean.class);

	@ManagedProperty(value = "#{solicitudRegistroPage}")
	private SolicitudRegistroPage solicitudRegistroPage;
	@ManagedProperty(value = "#{solicitudRegistroBean}")
	private SolicitudRegistroBean solicitudRegistroBean;
	@ManagedProperty(value = "#{registroColegioPage}")
	private RegistroColegioPage registroColegioPage;

	@EJB
	SolicitudRegistroIntegrator solicitudRegistroIntegrator;

	/**
	 * Método que busca un colegio a partir de su rfc.
	 * 
	 */
	public void buscarColegio() {
		LOG.info("::: Buscando despacho: " + registroColegioPage.getRfcBusqueda());
		if(StringUtils.isNotBlank(registroColegioPage.getRfcBusqueda())){
			try {
				ColegioDTO colegio = solicitudRegistroIntegrator.obtenerColegioDTO(registroColegioPage.getRfcBusqueda());
				if(colegio!= null){
					solicitudRegistroPage.getContador().setColegio(colegio);
					LOG.info("::: Colegio encontrado: " + registroColegioPage.getRfcBusqueda());
				}else{
					solicitudRegistroPage.getContador().setColegio(new ColegioDTO());
					solicitudRegistroPage.setHeaderDialog("message.contador.titulo");
					solicitudRegistroPage.setMensajeDialog("message.contador.colegio.sinDatos");
					FacesUtils.getRequestContext().execute("dialogGeneral.show();");
				}
			}catch(Exception e){
				solicitudRegistroPage.setHeaderDialog("message.label.error");
				solicitudRegistroPage.setMensajeDialog("message.label.errorInesperado");
				FacesUtils.getRequestContext().execute("dialogGeneral.show();");
			}
		}else{
			solicitudRegistroPage.setHeaderDialog("message.contador.validacion");
			solicitudRegistroPage.setMensajeDialog("message.contador.validacion.sinrfc");
			FacesUtils.getRequestContext().execute("dialogGeneral.show();");
		}
	}

	/**
	 * Método que valida los datos necesarios del colegio.
	 * 
	 * @return
	 */
	private boolean validarDatosColegio() {
		solicitudRegistroPage.setMensajeDialog(SolicitudRegistroUtil
				.validarDatosColegio(solicitudRegistroPage.getContador(),registroColegioPage.getRfcBusqueda()));
		if (StringUtils.isNotBlank(solicitudRegistroPage.getMensajeDialog())) {
			solicitudRegistroPage.setHeaderDialog("message.contador.validacion");
			FacesUtils.getRequestContext().execute("dialogGeneral.show();");
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
	
	public void validarRedireccionToRegistroDocumentacion(){
		if(validarDatosColegio()){
			FacesUtils.getRequestContext().execute("datosCorrectos.show();");
		}
	}
	
	/**
	 * Método que inicia las variables para el proceso de registro de despacho y
	 * redirecciona a la pantalla.
	 * 
	 */
	public String redireccionarToRegistroDocumentacion(){
		solicitudRegistroPage.setPaginaActual(EnumPantallasContador.REGISTRO_DOCUMENTACION.getId());
		return solicitudRegistroBean.redireccionarRegistroDocumentacion();
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
