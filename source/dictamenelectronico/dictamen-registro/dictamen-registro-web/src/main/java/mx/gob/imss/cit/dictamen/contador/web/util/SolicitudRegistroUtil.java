package mx.gob.imss.cit.dictamen.contador.web.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import mx.gob.imss.cit.dictamen.contador.integration.api.dto.ContadorPublicoAutDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DatosContactoDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.InfoProfesional;

/**
 * Clase que realiza validaciones de la Solicitud de Registro
 * 
 * @author ariverav
 *
 */
public class SolicitudRegistroUtil {

	/**
	 * Valida datos de contaco de un contador.
	 * 
	 * @param datosContacto
	 * @return
	 */
	public static String validarDatosContacto(DatosContactoDTO datosContacto) {
		if (StringUtils.isBlank(datosContacto.getEmail1())) {
			return "message.contador.validacion.contacto.email1";
		} else {
			if (!ExpresionesRegularesUtil.validaCadenaExpresion(
					datosContacto.getEmail1(),
					ExpresionesRegularesUtil.REGEX_CORREO)) {
				return "message.contador.validacion.contacto.email1.regexp";
			}
			if (StringUtils.isBlank(datosContacto.getcEmail1())
					|| !datosContacto.getcEmail1().equals(
							datosContacto.getEmail1())) {
				return "message.contador.validacion.contacto.email1.confirmar";
			}
		}
		if (StringUtils.isNotBlank(datosContacto.getcEmail2())) {
			if (!ExpresionesRegularesUtil.validaCadenaExpresion(
					datosContacto.getEmail2(),
					ExpresionesRegularesUtil.REGEX_CORREO)) {
				return "message.contador.validacion.contacto.email2.regexp";
			}
			if (StringUtils.isBlank(datosContacto.getcEmail2())
					|| !datosContacto.getcEmail2().equals(
							datosContacto.getEmail2())) {
				return "message.contador.validacion.contacto.email2.confirmar";
			}
		}
		if (StringUtils.isBlank(datosContacto.getTelefono())
				|| (StringUtils.isNotBlank(datosContacto.getTelefono()) && datosContacto
						.getTelefono().length() < 10)) {
			return "message.contador.validacion.contacto.telefono";
		}

		return "";
	}

	/**
	 * Método que valida los datos de informacion profesional del contador
	 * 
	 * @param infoProf
	 * @return
	 */
	public static String validarInfoProfesional(InfoProfesional infoProf) {

		if (StringUtils.isBlank(infoProf.getCedula())) {
			return "message.contador.validacion.infoProf.cedula";
		}
		if (StringUtils.isBlank(infoProf.getInstitucion())) {
			return "message.contador.validacion.infoProf.institucion";
		}
		if (infoProf.getFechaExpCedula() == null) {
			return "message.contador.validacion.infoProf.fecha";
		}

		return "";
	}

	/**
	 * Método que llena la lista para las opciones de la pregunta sobre
	 * despachos.
	 * 
	 * @return
	 */
	public static List<String> llenarOpcionesDespacho() {
		List<String> opciones = new ArrayList<String>();
		opciones.add(ContadorConstantes.INDEPENDIENTE);
		opciones.add(ContadorConstantes.DESPACHO);
		return opciones;
	}

	/**
	 * Método que valida los datos necesarios si un contador pertenece a un
	 * despacho.
	 * 
	 * @param contador
	 * @return
	 */
	public static String validarDatosDespacho(ContadorPublicoAutDTO contador,
			String rfc) {
		if (contador.getDespacho() == null
				|| contador.getDespacho().getRfc() == null
				|| contador.getDespacho().getDomicilio() == null
				|| contador.getDespacho().getRfc().compareToIgnoreCase(rfc) != 0) {
			return "message.contador.validacion.despacho.busquedarfc";
		}
		if (contador.getCargo() == null
				|| (contador.getCargo() != null && (contador.getCargo().getId() == null || contador
						.getCargo().getId() <= 0))) {
			return "message.contador.validacion.despacho.cargo";
		}
		if (StringUtils.isBlank(contador.getDespacho().getTelefonoFijo())
				|| (StringUtils.isNotBlank(contador.getDespacho()
						.getTelefonoFijo()) && contador.getDespacho()
						.getTelefonoFijo().length() < 10)) {
			return "message.contador.validacion.despacho.telefonofijo";
		}
		return "";
	}

	/**
	 * Método que valida los datos necesarios si un contador es independiente
	 * 
	 * @param contador
	 * @return
	 */
	public static String validarDatosIndependiente(
			ContadorPublicoAutDTO contador) {
		if (contador.isTrabajadores() && contador.getnTrabajadores() <= 0) {
			return "message.contador.validacion.nTrabajadores";
		}
		return "";
	}

	public static String validarDatosColegio(ContadorPublicoAutDTO contador,
			String rfc) {
		if (contador.getColegio() == null
				|| contador.getColegio().getRfc() == null
				|| contador.getColegio().getDomicilio() == null
				|| contador.getColegio().getRfc().compareToIgnoreCase(rfc) != 0) {
			return "message.contador.validacion.colegio.busquedarfc";
		}
		return "";
	}

}
