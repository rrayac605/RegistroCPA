package mx.gob.imss.cit.dictamen.contador.web.beans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import mx.gob.imss.cit.dictamen.contador.integration.api.ContadorPublicoIntegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DomicilioFiscalDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.MediosContactoDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.PersonaDTO;
import mx.gob.imss.cit.dictamen.contador.web.pages.ActualizacionRegistroPage;
import mx.gob.imss.cit.dictamen.contador.web.util.FacesUtils;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.primefaces.context.RequestContext;
import org.primefaces.event.TabChangeEvent;


@ManagedBean(name = "actualizacionRegistroBean")
@ViewScoped
public class ActualizacionRegistroBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -640194701499340530L;
	private static final Logger LOGGER = Logger.getLogger(ActualizacionRegistroBean.class);

	private static final String MENSAJE_ERROR_REGISTRO = "#{msg['message.actualizacion.registroinvalido']}";
	private static final String MENSAJE_ERROR_NO_DATOS = "#{msg['message.actualizacion.no.datos']}";
	private static final String MENSAJE_INICIO_SESION = "Debe Iniciar Sesion";
	private static final String MENSAJE_ERROR_GENERICO = "Ocurri&oacute; un error, intentelo de nuevo m&aacute;s tarde, por favor";
	private static final String MENSAJE_ERROR_DATOS_INVALIDOS = "#{msg['message.actualizacion.datoscontador.nocorrectos']}";
	private static final String MODAL_BUSQUEDA_ABIERTO = "dialogBusqueda.show();";
	private static final String MODAL_MENSAJE_ABIERTO = "dialogMensajes.show();";
	private static final String MODAL_DATOS_CERRADO = "iniData.hide();";
	private static final String MODAL_DATOS_ABIERTO = "iniData.show();";
	private static final String MODAL_MENSAJEG_ABIERTO = "dialogMensajesAct.show()";

	@ManagedProperty(value = "#{actualizacionRegistroPage}")
	private ActualizacionRegistroPage actualizacionRegistroPage;

	@EJB(mappedName = "contadorPublicoIntegrator", name = "contadorPublicoIntegrator")
	private ContadorPublicoIntegrator contadorPublicoIntegrator;

	@PostConstruct
	public void init() {
		// Datos de sesion
		PersonaDTO personaDTO = new PersonaDTO();
		personaDTO.setNombre("LUCIO");
		personaDTO.setApellidoMaterno("DURAN");
		personaDTO.setApellidoPaterno("SILVA");
		personaDTO.setRfc("DUSL821218LN8");
		personaDTO.setCurp("DUSL821218HDFRLC09");
		personaDTO.setIdPersona(37472955L);
		personaDTO.setNombreCompleto("LUCIO SILVA DURAN");
		personaDTO.setFolioSolicitud("123456789123456789123");
		personaDTO.setCorreoElectronico("test@test.com");
		personaDTO.setTelefono("55984634");
		if (StringUtils.isBlank(personaDTO.getCurp())
				&& StringUtils.isBlank(personaDTO.getRfc())) {
			FacesUtils.messageError(1, MENSAJE_INICIO_SESION);
		} else {
			LOGGER.info("Actualización de registro: se va a buscar el registro con los siguientes datos: curp->"
					+ personaDTO.getCurp() + ", rfc->" + personaDTO.getRfc());
			if (personaDTO != null) {
				// ContadorPublicoDTO contadorAutorizado =
				// contadorPublicoIntegrator.consultarContadorPublicAut(personaDTO.getIdPersona());
				this.actualizacionRegistroPage.setApellidoMaterno(personaDTO
						.getApellidoMaterno());
				this.actualizacionRegistroPage.setApellidoPaterno(personaDTO
						.getApellidoPaterno());
				this.actualizacionRegistroPage
						.setNombre(personaDTO.getNombre());
				this.actualizacionRegistroPage.setCurp(personaDTO.getCurp());
				this.actualizacionRegistroPage.setRegistroImss("12345654");
				this.actualizacionRegistroPage.setEmail(personaDTO
						.getCorreoElectronico());
				this.actualizacionRegistroPage.setTelefono(personaDTO
						.getTelefono());
				DomicilioFiscalDTO domicilioFiscal = contadorPublicoIntegrator
						.consultarDomicilioPorRFC(personaDTO.getRfc());
				this.actualizacionRegistroPage
						.setDomicilioFiscal(domicilioFiscal);
				RequestContext.getCurrentInstance()
						.execute(MODAL_DATOS_ABIERTO);
				List<MediosContactoDTO> contactos = contadorPublicoIntegrator
						.obtenerMediosContactoPorIdPersona(null);
				int index = 0;
				for (MediosContactoDTO contacto : contactos) {
					if (contacto.getMedioContacto() == 1L) {
						this.actualizacionRegistroPage.getEmailsOp()[index] = contacto
								.getDescripcion();
						index++;
					}
					if (index == 2) {
						break;
					}
				}
				this.actualizacionRegistroPage.setTieneRegistro(Boolean.TRUE);
			} else {
				generarModalMensaje(MODAL_DATOS_CERRADO, MODAL_MENSAJE_ABIERTO,
						MENSAJE_ERROR_NO_DATOS);
			}
		}
	}

	public void habilitaPanelPersonales() {
		LOGGER.info("Entrando al  método habilitar panel");
		actualizacionRegistroPage.setHabilitaDatosPersonales(Boolean.TRUE);
	}

	public void habilitaPanelDespacho() {
		LOGGER.info("Habilitando el panel de datos del despacho");
		this.actualizacionRegistroPage.setHabilitaDatosDespacho(Boolean.TRUE);
	}

	public void habilitaEdicionDatos() {
		LOGGER.info("Entrando al método de habilitar botones de accion");
		this.actualizacionRegistroPage.setHabiliatrBotonesAccion(Boolean.TRUE);
	}

	public void salirEdicionDatos() {
		LOGGER.info("Entrando al método de cancelación de edición de datos");
		this.actualizacionRegistroPage.setHabiliatrBotonesAccion(Boolean.FALSE);
	}

	public void busquedaRegistroImss(ActionEvent event) {
		LOGGER.info("Entrando a la búsqueda del registro IMSS");
		// TODO realizar busqueda del registro
		boolean registro = StringUtils
				.isNotEmpty(this.actualizacionRegistroPage.getRegImssBusqueda());
		this.actualizacionRegistroPage.setExisteRegistroImss(registro);
		if (!registro) {
			RequestContext.getCurrentInstance().execute(
					"dialogBusqueda.show();dialogMensajes.show();");
			FacesContext context = FacesContext.getCurrentInstance();
			this.actualizacionRegistroPage.setMensajesPrevios(context
					.getApplication().evaluateExpressionGet(context,
							MENSAJE_ERROR_REGISTRO, String.class));
		}
	}

	public void habilitarNumeroTrabajadores() {
		LOGGER.info("Entrando a habilitar el campo de texto de número de trabajadores");
		String cuentaTrabajadores = this.actualizacionRegistroPage
				.getCuentaConTrabajadores();
		this.actualizacionRegistroPage
				.setHabilitaNumeroTrabajadores((StringUtils
						.isNotBlank(cuentaTrabajadores) && cuentaTrabajadores
						.equals("SI")));
	}

	public void seleccionTipoDespacho() {
		String tipoDespacho = this.actualizacionRegistroPage.getTipoDespacho();
		this.actualizacionRegistroPage
				.setHabilitarTrabajadoresDespacho(tipoDespacho.equals("I"));
	}

	public void mostrarMensajeError() {
		generarModalMensaje(MENSAJE_ERROR_DATOS_INVALIDOS,
				MODAL_MENSAJEG_ABIERTO);
	}

	public void onTabChange(TabChangeEvent event) {
		int indiceTab = this.actualizacionRegistroPage.getIndiceTabActivo();
		if (indiceTab == 0
				&& !this.actualizacionRegistroPage.isHabilitaDatosPersonales()) {
			this.actualizacionRegistroPage
					.setHabilitaDatosPersonales(Boolean.TRUE);
		} else if (indiceTab == 1
				&& !this.actualizacionRegistroPage.isHabilitaDatosDespacho()) {
			this.actualizacionRegistroPage
					.setHabilitaDatosDespacho(Boolean.TRUE);
		}

	}

	/**
	 * M&eacute;todo que genera el modal de mensaje para la pantalla inicial de
	 * la actualizaci&oacute;n de registros. Recibe un arreglo de strings en la
	 * cuela debe de ser de más de una longitud, siendo los primeros registros
	 * los comandos que ejecutará el contexto de primefaces, mientras el
	 * &uacute;ltimo elemento de la lista De no ser as&iacute;, se
	 * mostrar&aacute; un error gen&eacute;ricos
	 * 
	 * @param datos
	 *            Es un arreglo de strings el cual contiene los comandos a
	 *            ejecutar del contexto de primefaces y el mensaje a mostrar
	 */
	private void generarModalMensaje(String... datos) {
		StringBuilder comandos = new StringBuilder();
		String mensaje;
		if (datos.length > 1) {
			for (int i = 0; i < datos.length - 1; i++) {
				comandos.append(datos[i]);
			}
			mensaje = datos[datos.length - 1];
		} else {
			comandos.append(MODAL_MENSAJE_ABIERTO);
			mensaje = MENSAJE_ERROR_GENERICO;
		}
		RequestContext.getCurrentInstance().execute(comandos.toString());
		FacesContext context = FacesContext.getCurrentInstance();
		this.actualizacionRegistroPage.setMensajesPrevios(context
				.getApplication().evaluateExpressionGet(context, mensaje,
						String.class));
	}

	/**
	 * @return the actualizacionRegistroPage
	 */
	public ActualizacionRegistroPage getActualizacionRegistroPage() {
		return actualizacionRegistroPage;
	}

	/**
	 * @param actualizacionRegistroPage
	 *            the actualizacionRegistroPage to set
	 */
	public void setActualizacionRegistroPage(
			ActualizacionRegistroPage actualizacionRegistroPage) {
		this.actualizacionRegistroPage = actualizacionRegistroPage;
	}
}
