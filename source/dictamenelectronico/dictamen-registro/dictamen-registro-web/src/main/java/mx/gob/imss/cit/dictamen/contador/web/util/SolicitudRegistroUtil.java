package mx.gob.imss.cit.dictamen.contador.web.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DatosContactoDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.InfoProfesional;

/**
 * Clase que realiza validaciones de la Solicitud de Registro
 * @author ariverav
 *
 */
public class SolicitudRegistroUtil {

	/**
	 * Valida datos de contaco de un contador.
	 * @param datosContacto
	 * @return
	 */
	public static String validarDatosContacto(DatosContactoDTO datosContacto){		
		if(StringUtils.isBlank(datosContacto.getEmail1())){
			return "message.contador.validacion.contacto.email1";
		}else{
			if(!ExpresionesRegularesUtil.validaCadenaExpresion(
					datosContacto.getEmail1(), ExpresionesRegularesUtil.REGEX_CORREO)){
				return "message.contador.validacion.contacto.email1.regexp";
			}
			if(StringUtils.isBlank(datosContacto.getcEmail1()) 
					|| !datosContacto.getcEmail1().equals(datosContacto.getEmail1())){
				return "message.contador.validacion.contacto.email1.confirmar";
			}			
		}
		if(StringUtils.isNotBlank(datosContacto.getcEmail2())){
			if(!ExpresionesRegularesUtil.validaCadenaExpresion(
					datosContacto.getEmail2(), ExpresionesRegularesUtil.REGEX_CORREO)){
				return "message.contador.validacion.contacto.email2.regexp";
			}
			if(StringUtils.isBlank(datosContacto.getcEmail2()) 
					|| !datosContacto.getcEmail2().equals(datosContacto.getEmail2())){
				return "message.contador.validacion.contacto.email2.confirmar";
			}		
		}
		if(StringUtils.isBlank(datosContacto.getTelefono())){
			return "message.contador.validacion.contacto.telefono";
		}
		
		return "";
	}

	/**
	 * Método que valida los datos de informacion profesional del contador
	 * @param infoProf
	 * @return
	 */
	public static String validarInfoProfesional(InfoProfesional infoProf){

		if(StringUtils.isBlank(infoProf.getCedula())){
			return "message.contador.validacion.infoProf.cedula";
		}
		if(StringUtils.isBlank(infoProf.getInstitucion())){
			return "message.contador.validacion.infoProf.institucion";
		}
		if(infoProf.getFechaExpCedula() == null){
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

}
