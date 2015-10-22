package mx.gob.imss.cit.dictamen.contador.web.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RFCPersonaFisicaValidator extends BaseValidator implements Validator  {

    /**Log de la clase.*/
	private static final Logger LOG = LoggerFactory.getLogger(RFCPersonaFisicaValidator.class);
    
    /**Cadena para la leyenda de información*/
    private static final String INFO = "INFO";
    
    /**Indica la longitud de caracteres del RFC.*/
    private static final int TAM_RFC = 13;
    
    /**Objeto para representar una expresi&oacute;n regular.*/
    private Pattern pattern;
    
    /**Objeto para comparar las cadenas con las expresiones regulares.*/
    private Matcher matcher;

    
    public static final String RFC_PATTERN =
            "^([A-ZÑ&amp;]{4}\\d{2}(((0[1-9&&[^2]]|1[012])(0[1-9]|[12]\\d|3[01]))|02(0[1-9]|1\\d|2[0-9]))[A-Z[0-9]]{2}[\\dA])?$";
    public static final String RFC_PATTERN_1BLOQUE = "^[A-ZÑ&amp;]{4}.*$";
    public static final String RFC_PATTERN_2BLOQUE =
            "^.{4}\\d{2}(((0[1-9&&[^2]]|1[012])(0[1-9]|[12]\\d|3[01]))|02(0[1-9]|1\\d|2[0-9])).*$";
    public static final String RFC_PATTERN_3BLOQUE = "^.{10}[A-Z[0-9]]{2}.*$";
    public static final String RFC_PATTERN_4BLOQUE = "^.{12}[\\dA]$";
        
    /**{@inheritDoc}*/
    @Override
    public void validate(FacesContext context, UIComponent toValidate, Object value) throws ValidatorException {
        
        String sRFC     = (String)value;

        if ( sRFC != null && !"".equals(sRFC) ) {
            sRFC = sRFC.toUpperCase();
            this.validarTamanioRFC(sRFC);
            this.validarBloque1(sRFC);
            this.validarBloque2(sRFC);
            this.validarBloque3(sRFC);
            this.validarBloque4(sRFC);
        } else {
            LOG.info("El RFC no es obligatorio no se valida.");
        }
    }
    
    /**
     * Valida el tama&ntilde;o del RFC
     * @param rfc RFC a validar.
     * */
    private void validarTamanioRFC(String rfc) {
        if ( rfc.length() != RFCPersonaFisicaValidator.TAM_RFC ) {
            throw new ValidatorException(this.armarMensaje("El RFC debe ser de 13 posiciones", RFCPersonaFisicaValidator.INFO, FacesMessage.SEVERITY_ERROR));
        }
    }
    
    /**
     * Valida el primer bloque del rfc
     * @param sRFC RFC a validar
     * */
    private void validarBloque1(String sRFC) {
        pattern = Pattern.compile(RFCPersonaFisicaValidator.RFC_PATTERN_1BLOQUE);
        matcher = pattern.matcher(sRFC);
        
        if ( !matcher.matches() ) {
            throw new ValidatorException(this.armarMensaje("Las primeras 4 posiciones deben ser letras o el carácter &", RFCPersonaFisicaValidator.INFO, FacesMessage.SEVERITY_ERROR));
        } 
    }
    
    /**
     * Valida el segundo bloque del rfc
     * @param sRFC RFC a validar
     * */
    private void validarBloque2(String sRFC) {
        pattern = Pattern.compile(RFCPersonaFisicaValidator.RFC_PATTERN_2BLOQUE);
        matcher = pattern.matcher(sRFC);
            
        if ( !matcher.matches() ) {
            throw new ValidatorException(this.armarMensaje("Año-Mes-Dia deben ser válidos y numéricos", RFCPersonaFisicaValidator.INFO, FacesMessage.SEVERITY_ERROR));
        }
    }
    
    /**
     * Valida el tercer bloque del rfc
     * @param sRFC RFC a validar
     * */
    private void validarBloque3(String sRFC) {
        pattern = Pattern.compile(RFCPersonaFisicaValidator.RFC_PATTERN_3BLOQUE);
        matcher = pattern.matcher(sRFC);
        
        if ( !matcher.matches() ) {
            throw new ValidatorException(this.armarMensaje("El RFC no debe contener caracteres especiales excepto el &", RFCPersonaFisicaValidator.INFO, FacesMessage.SEVERITY_ERROR));
        } 
    }
    
    /**
     * Valida el cuarto bloque del rfc
     * @param sRFC RFC a validar
     * */
    private void validarBloque4(String sRFC) {
        pattern = Pattern.compile(RFCPersonaFisicaValidator.RFC_PATTERN_4BLOQUE);
        matcher = pattern.matcher(sRFC);
                    
        if ( !matcher.matches() ) {
            throw new ValidatorException(this.armarMensaje("El último dígito debe ser numérico o la letra A.", RFCPersonaFisicaValidator.INFO, FacesMessage.SEVERITY_ERROR));
        }
    }
    


}
