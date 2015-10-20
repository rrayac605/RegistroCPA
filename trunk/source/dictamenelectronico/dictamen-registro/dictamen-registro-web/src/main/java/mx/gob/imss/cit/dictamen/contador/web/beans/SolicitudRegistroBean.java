package mx.gob.imss.cit.dictamen.contador.web.beans;

import java.util.Date;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.contador.integration.api.SolicitudRegistroIntegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.ContadorPublicoAutDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DomicilioDTO;
import mx.gob.imss.cit.dictamen.contador.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.contador.web.pages.LoginPage;
import mx.gob.imss.cit.dictamen.contador.web.pages.SolicitudRegistroPage;
import mx.gob.imss.cit.dictamen.contador.web.util.EnumPantallasContador;

import org.apache.log4j.Logger;
import org.primefaces.context.RequestContext;

@ManagedBean(name = "solicitudRegistroBean")
@ViewScoped
public class SolicitudRegistroBean extends BaseBean {

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger LOG = Logger
			.getLogger(SolicitudRegistroBean.class);

	@ManagedProperty(value = "#{solicitudRegistroPage}")
	private SolicitudRegistroPage solicitudRegistroPage;
	@ManagedProperty(value = "#{loginPage}")
	private LoginPage loginPage;


	public void init() {
		LOG.info("::: Inicializando variables.");
		solicitudRegistroPage.setFechaActual(new Date());
		ContadorPublicoAutDTO contador = new ContadorPublicoAutDTO();
		contador.setCurp(loginPage.getCurp());
		contador.setNombre("Ascencion Rivera Velasquez");
		contador.setRfc("RIVA890228RN4");
		contador.setDomicilio(new DomicilioDTO());
		contador.getDomicilio().setCalle("REFORMA");
		contador.getDomicilio().setCodigoPostal("90109");
		contador.getDomicilio().setColonia("Colonia Test");
		contador.getDomicilio().setEmail("email@test.com");
		contador.getDomicilio().setEntidad("Veracruz");
		contador.getDomicilio().setEntreCalle("Test 1");
		contador.getDomicilio().setLocalidad("Localidad Test");
		contador.getDomicilio().setMunicipio("Municipio Test");
		contador.getDomicilio().setNumExterior("24");
		contador.getDomicilio().setNumInterior("8");
		contador.getDomicilio().setTelefono("9876543210");
		contador.getDomicilio().setyCalle("Test 2");
		solicitudRegistroPage.setContador(contador);
	}

	// ************************* REDIRECTS ************************//
	// ************************************************************//

	public String redirectContadores() {
		return EnumPantallasContador.CONTADORES.getNombre();
	}

	public String redirectDespacho() {
		RequestContext.getCurrentInstance().execute("datosCorrectos.show();");
		return "";
	}

	public void guardarDatos() {
		solicitudRegistroPage
				.setHeaderDialog("message.contador.solicitud.titulo");
		solicitudRegistroPage
				.setMensajeDialog("message.contador.solicitud.datosGuardados");
		RequestContext.getCurrentInstance().execute("dialogGeneral.show();");
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

}
