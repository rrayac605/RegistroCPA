package mx.gob.imss.cit.dictamen.contador.web.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import org.apache.commons.lang.StringUtils;

public class CorreoElectronicoValidator extends BaseValidator implements Validator {
     

	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\." +
			"[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*" +
			"(\\.[A-Za-z]{2,})$";
	
	@Override
	public void validate(FacesContext arg0, UIComponent arg1, Object cadena)
			throws ValidatorException {
		String correo = (String)cadena;
		String tCorreo = StringUtils.trimToEmpty(correo);
		if(!tCorreo.isEmpty()){
		//	FacesMessage facesMsg = armarMensaje("Correo Electronico es requerido", "INFO", FacesMessage.SEVERITY_ERROR);
		//	throw new ValidatorException(facesMsg);
	        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
	        Matcher matcher = pattern.matcher(correo);
	        if ( !matcher.matches() ) {
				FacesMessage facesMsg = armarMensaje("Favor de ingresar una dirección electrónica valido.", "INFO", FacesMessage.SEVERITY_ERROR);
				throw new ValidatorException(facesMsg);
	        }
		}

	}

}
