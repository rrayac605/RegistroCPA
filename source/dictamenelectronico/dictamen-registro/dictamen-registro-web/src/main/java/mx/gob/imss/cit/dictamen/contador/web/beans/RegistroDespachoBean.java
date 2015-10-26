package mx.gob.imss.cit.dictamen.contador.web.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import mx.gob.imss.cit.dictamen.contador.integration.api.SolicitudRegistroIntegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DespachoDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.exception.DictamenContadorNegocioException;
import mx.gob.imss.cit.dictamen.contador.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.contador.web.pages.LoginPage;
import mx.gob.imss.cit.dictamen.contador.web.pages.RegistroDespachoPage;
import mx.gob.imss.cit.dictamen.contador.web.pages.SolicitudRegistroPage;
import mx.gob.imss.cit.dictamen.contador.web.util.ContadorConstantes;
import mx.gob.imss.cit.dictamen.contador.web.util.FacesUtils;

@ManagedBean(name = "registroDespachoBean")
@ViewScoped
public class RegistroDespachoBean extends BaseBean {

	private static final long serialVersionUID = -70662889252962586L;
	private static final Logger LOG = Logger
			.getLogger(RegistroDespachoBean.class);

	@ManagedProperty(value = "#{solicitudRegistroPage}")
	private SolicitudRegistroPage solicitudRegistroPage;
	@ManagedProperty(value = "#{registroDespachoPage}")
	private RegistroDespachoPage registroDespachoPage;
	@EJB
	SolicitudRegistroIntegrator solicitudRegistroIntegrator;

	/**
	 * Método que valida la opcion seleccionada de despacho o independiente
	 * 
	 */
	public void elegirOpcion(){
		if(registroDespachoPage.getOpcionSeleccionada() == null){
			solicitudRegistroPage.getContador().setIndependiente(false);
			solicitudRegistroPage.getContador().setPertenceDespacho(false);
		}else if(registroDespachoPage.getOpcionSeleccionada().equals(ContadorConstantes.INDEPENDIENTE)){
			solicitudRegistroPage.getContador().setIndependiente(true);
			solicitudRegistroPage.getContador().setPertenceDespacho(false);
		}else if(registroDespachoPage.getOpcionSeleccionada().equals(ContadorConstantes.DESPACHO)){
			solicitudRegistroPage.getContador().setIndependiente(false);
			solicitudRegistroPage.getContador().setPertenceDespacho(true);
			solicitudRegistroPage.getContador().setDespacho(new DespachoDTO());
		}
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
		String rfcBusqueda = solicitudRegistroPage.getContador().getDespacho().getRfc();
		if(StringUtils.isNotBlank(rfcBusqueda)){
			try {
				DespachoDTO despacho = solicitudRegistroIntegrator.obtenerDespachoDTO(rfcBusqueda);
				if(despacho!= null){
					solicitudRegistroPage.getContador().setDespacho(despacho);
					registroDespachoPage.setDespachoEncontrado(true);
					registroDespachoPage.setCargos(solicitudRegistroIntegrator.obtenerCatalogoCargos());
				}else{
					solicitudRegistroPage.getContador().setDespacho(new DespachoDTO());
					solicitudRegistroPage.getContador().getDespacho().setRfc(rfcBusqueda);
					registroDespachoPage.setDespachoEncontrado(false);
					solicitudRegistroPage.setHeaderDialog("message.contador.titulo");
					solicitudRegistroPage.setMensajeDialog("message.contador.sinDatos");
					FacesUtils.getRequestContext().execute("dialogGeneral.show();");
				}
			}catch(Exception e){
				registroDespachoPage.setDespachoEncontrado(false);
				solicitudRegistroPage.setHeaderDialog("message.label.error");
				solicitudRegistroPage.setMensajeDialog("message.label.errorInesperado");
				FacesUtils.getRequestContext().execute("dialogGeneral.show();");
			}
		}
	}
	
	public String redireccionarToRegistroColegio(){
		return "";
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
	 * @param registroDespachoPage the registroDespachoPage to set
	 */
	public void setRegistroDespachoPage(RegistroDespachoPage registroDespachoPage) {
		this.registroDespachoPage = registroDespachoPage;
	}

}
