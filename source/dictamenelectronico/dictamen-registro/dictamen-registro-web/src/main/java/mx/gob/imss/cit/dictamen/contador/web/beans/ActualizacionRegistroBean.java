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

import mx.gob.imss.cit.dictamen.contador.integration.api.ContadorAutenticadoIntegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.ContadorPublicoIntegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.ContadorPublicoDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DomicilioFiscalDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.MediosContactoDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.PersonaDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.PersonaMoralDTO;
import mx.gob.imss.cit.dictamen.contador.web.pages.ActualizacionRegistroPage;
import mx.gob.imss.cit.dictamen.contador.web.util.FacesUtils;
import mx.gob.imss.cit.dictamen.contador.web.validator.CorreoElectronicoValidator;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.primefaces.context.RequestContext;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.event.TabChangeEvent;

@ManagedBean(name = "actualizacionRegistroBean")
@ViewScoped
public class ActualizacionRegistroBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -640194701499340530L;
	private static final Logger LOGGER = Logger
			.getLogger(ActualizacionRegistroBean.class);

	private static final String MENSAJE_ERROR_REGISTRO = "#{msg['message.actualizacion.registroinvalido']}";
	private static final String MENSAJE_ERROR_NO_DATOS = "#{msg['message.actualizacion.no.datos']}";
	private static final String MENSAJE_INICIO_SESION = "Debe Iniciar Sesion";
	private static final String MENSAJE_ERROR_GENERICO = "Ocurri&oacute; un error, intentelo de nuevo m&aacute;s tarde, por favor";
	private static final String MENSAJE_ERROR_DATOS_INVALIDOS = "#{msg['message.actualizacion.datoscontador.nocorrectos']}";
	private static final String MENSAJE_ERROR_RFC_DESPACHO = "#{msg['message.actualizacion.despacho.error.norfc']}";
	private static final String MENSAJE_ERROR_RFC_COLEGIO = "#{msg['message.actualizacion.colegio.error.norfc']}";
	private static final String MENSAJE_ERROR_CORREO = "#{msg['message.actualizacion.error.ingresar.correo']}";
	private static final String MENSAJE_ERROR_CORREO_INVALIDO = "#{msg['message.actualizacion.error.valido.correo']}";
	private static final String MENSAJE_ERROR_CORREO_IGUAL = "#{msg['message.actualizacion.error.igual.correo']}";
	private static final String MENSAJE_ERROR_REGISTRO_CANCELADO = "#{msg['message.actualizacion.error.usuario.cancelado']}";
	private static final String MODAL_MENSAJE_ABIERTO = "dialogMensajes.show();";
	private static final String MODAL_DATOS_CERRADO = "iniData.hide();";
	private static final String MODAL_DATOS_ABIERTO = "iniData.show();";
	private static final String MODAL_MENSAJEG_ABIERTO = "dialogMensajesAct.show()";

	@ManagedProperty(value = "#{actualizacionRegistroPage}")
	private ActualizacionRegistroPage actualizacionRegistroPage;

	@EJB(mappedName = "contadorPublicoIntegrator", name = "contadorPublicoIntegrator")
	private ContadorPublicoIntegrator contadorPublicoIntegrator;
	
	@EJB(mappedName = "contadorAutenticadoIntegrator", name = "contadorAutenticadoIntegrator")
	private ContadorAutenticadoIntegrator contadorAutenticadoIntegrator;

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
		
		if (!contadorAutenticadoIntegrator.validarSesionContador(personaDTO.getRfc(), personaDTO.getCurp())) {
			FacesUtils.messageError(1, MENSAJE_INICIO_SESION);
		} else {
			LOGGER.info("Actualización de registro: se va a buscar el registro con el id de persona");
			ContadorPublicoDTO contadorAut = contadorPublicoIntegrator.consultarContadorPublicAut(personaDTO.getIdPersona());
			int respuesta = contadorAutenticadoIntegrator.validarContadorAutenticado(contadorAut);
			switch(respuesta){
			case 0:
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
				if (!this.actualizacionRegistroPage.isTieneRegistro()) {
					RequestContext.getCurrentInstance().execute(
							MODAL_DATOS_ABIERTO);
				}
				List<MediosContactoDTO> contactos = contadorPublicoIntegrator
						.obtenerMediosContactoPorIdPersona(personaDTO
								.getIdPersona());
				int index = 0;
				for (MediosContactoDTO contacto : contactos) {
					if (contacto.getMedioContacto() == 1L) {
						if(index == 0){
							this.actualizacionRegistroPage.setEmail1(contacto.getDescripcion());
						} else if(index == 1){
							this.actualizacionRegistroPage.setEmail2(contacto.getDescripcion());
						}
						index++;
					}
					if (index == 2) {
						break;
					}
				}
				this.actualizacionRegistroPage.setTieneRegistro(Boolean.TRUE);
				break;
			case 1: // Registro nulo
				generarModalMensaje(MODAL_DATOS_CERRADO, MODAL_MENSAJE_ABIERTO,
						MENSAJE_ERROR_NO_DATOS);
				break;
			case 2: // Registro cancelado
				generarModalMensaje(MODAL_MENSAJE_ABIERTO, MENSAJE_ERROR_REGISTRO_CANCELADO);
				break;
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

	public void habilitaPanelColegio() {
		LOGGER.info("Habilitando panel de colegio");
		this.actualizacionRegistroPage.setHabilitaDatosColegio(Boolean.TRUE);
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
		generarModalMensaje(MODAL_MENSAJEG_ABIERTO,
				MENSAJE_ERROR_DATOS_INVALIDOS);
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
		} else if (indiceTab == 2
				&& !this.actualizacionRegistroPage.isHabilitaDatosColegio()) {
			this.actualizacionRegistroPage.setHabilitaDatosColegio(true);
		}

	}

	public void buscarDespacho() {
		String rfcDespacho = this.actualizacionRegistroPage.getDespacho().getRfc();
		LOGGER.info("Se va a realizar la búsqueda del despaho, por rfc, al sat: "
				+ rfcDespacho);
		buscarPersonaMoral(rfcDespacho, MENSAJE_ERROR_RFC_DESPACHO,
				MODAL_MENSAJE_ABIERTO, 0);
	}

	public void buscarColegio() {
		String rfcColegio = this.actualizacionRegistroPage.getColegio().getRfc();
		LOGGER.info("Se va a realizar la búsqueda de colegio, por rfc, al sat: "
				+ rfcColegio);
		buscarPersonaMoral(rfcColegio, MENSAJE_ERROR_RFC_COLEGIO,
				MODAL_MENSAJEG_ABIERTO, 1);
	}

	public void cargandoMembresia(FileUploadEvent event) {
		// TODO requiere evaluar archivo
		event.getFile();
	}

	public void validarCambios() {
		LOGGER.info("Se validarán los cambios antes de guardar la información");
		boolean isDatosPersonalesValido = validarDatosPersonales();
		// TODO validar campos de despacho y colegio
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
	 * Método que realiza una b&uacute;squeda de persona moral de acuerdo a su
	 * RFC, si no encuentra datos, desplegara un dialog con el mensaje dado
	 * 
	 * @param rfc
	 *            El rfc de la persona moral
	 * @param mensaje
	 *            El mensaje a mostrar en caso de que no encuentre datos
	 *            correspondientes al rfc
	 * @param modal
	 *            El modal donde va a mostrar dicho mensaje
	 */
	private void buscarPersonaMoral(String rfc, String mensaje, String modal,
			int busqueda) {
		if (StringUtils.isNotBlank(rfc) && rfc.length() == 12) {
			// Buscando via SAT
			PersonaMoralDTO personaMoralSAT = contadorPublicoIntegrator
					.consultarPersonaMoralPorRFC(rfc);
			if (personaMoralSAT != null) {
				if (busqueda == 0) {
					this.actualizacionRegistroPage
							.setDespacho(personaMoralSAT);
				} else if (busqueda == 1) {
					this.actualizacionRegistroPage
							.setColegio(personaMoralSAT);
				}
			} else {
				generarModalMensaje(modal, mensaje);
			}

		}
	}

	private boolean validarDatosPersonales() {
		boolean isValido = Boolean.TRUE;
		if (this.actualizacionRegistroPage.isHabilitaDatosPersonales()) {
			// Comprobando que exista un dato en el correo opcional 2
			String correoObligatorio = this.actualizacionRegistroPage
					.getEmail1();
			String confCorreoObl = this.actualizacionRegistroPage
					.getEmailConf1();
			String correoSecundario = this.actualizacionRegistroPage
					.getEmail2();
			String confCorreoSec = this.actualizacionRegistroPage
					.getEmail2();
			if (StringUtils.isBlank(correoObligatorio)) {
				generarModalMensaje(MODAL_MENSAJEG_ABIERTO,
						MENSAJE_ERROR_CORREO);
				isValido = Boolean.FALSE;
			} else if (!CorreoElectronicoValidator
					.validarCorreo(correoObligatorio)) {
				generarModalMensaje(MODAL_MENSAJEG_ABIERTO,
						MENSAJE_ERROR_CORREO_INVALIDO);
				isValido = Boolean.FALSE;
			} else if (!StringUtils.trimToEmpty(correoObligatorio).equals(
					StringUtils.trimToEmpty(confCorreoObl))) {
				generarModalMensaje(MODAL_MENSAJEG_ABIERTO,
						MENSAJE_ERROR_CORREO_IGUAL);
				isValido = Boolean.FALSE;
			} else if (StringUtils.isNotBlank(correoSecundario)) {
				if (!StringUtils.trimToEmpty(correoSecundario).equals(
						StringUtils.trimToEmpty(confCorreoSec))) {
					generarModalMensaje(MODAL_MENSAJEG_ABIERTO,
							MENSAJE_ERROR_CORREO_IGUAL);
					isValido = Boolean.FALSE;
				}
			}
			correoObligatorio = null;
			confCorreoObl = null;
			correoSecundario = null;
			confCorreoSec = null;
		}
		return isValido;
	}
	
	private boolean validarDatosDespacho(){
		boolean isValido = Boolean.TRUE;
		// TODO validar campos de despacho
		return isValido;
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
