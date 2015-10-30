package mx.gob.imss.cit.dictamen.contador.web.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;


public class RFCPersonaMoralValidator extends BaseValidator implements Validator {

    public static final String PM_RFC_PATTERN =
            "^([A-ZÑ&amp;]{3}\\d{2}(((0[1-9&&[^2]]|1[012])(0[1-9]|[12]\\d|3[01]))|02(0[1-9]|1\\d|2[0-9]))[A-Z[0-9]]{2}[\\dA])?$";
        public static final String PM_RFC_PATTERN_1BLOQUE = "^[A-ZÑ&amp;]{3}.*$";
        public static final String PM_RFC_PATTERN_2BLOQUE =
            "^.{3}\\d{2}(((0[1-9&&[^2]]|1[012])(0[1-9]|[12]\\d|3[01]))|02(0[1-9]|1\\d|2[0-9])).*$";
        public static final String PM_RFC_PATTERN_3BLOQUE = "^.{9}[A-Z[0-9]]{2}.*$";
        public static final String PM_RFC_PATTERN_4BLOQUE = "^.{11}[\\dA]$";
        
    /**Cadena para la leyenda de información*/
    private static final String INFO = "INFO";
    
    /**Indica la longitud de caracteres del RFC.*/
    private static final int TAM_RFC = 12;
    
    /**Objeto para representar una expresi&oacute;n regular.*/
    private Pattern pattern;
    
    /**Objeto para comparar las cadenas con las expresiones regulares.*/
    private Matcher matcher;

    /**{@inheritDoc}*/
    @Override
    public void validate(FacesContext context, UIComponent toValidate, Object value) throws ValidatorException {

        String sRFC = (String)value;
        sRFC = sRFC.toUpperCase();

        this.validarTamanioRFC(sRFC);
        this.validarBloque1(sRFC);
        this.validarBloque2(sRFC);
        this.validarBloque3(sRFC);
        this.validarBloque4(sRFC);
    }
    
    /**
     * Valida el tama&ntilde;o del RFC
     * @param rfc RFC a validar.
     * */
    private void validarTamanioRFC(String rfc) {
        if ( rfc.length() != RFCPersonaMoralValidator.TAM_RFC ) {
            throw new ValidatorException(this.armarMensaje("El RFC debe ser de 12 posiciones", "INFO", FacesMessage.SEVERITY_ERROR));
        }
    }
    
    /**
     * Valida el primer bloque del rfc
     * @param sRFC RFC a validar
     * */
    private void validarBloque1(String sRFC) {
        pattern = Pattern.compile(RFCPersonaMoralValidator.PM_RFC_PATTERN_1BLOQUE);
        matcher = pattern.matcher(sRFC);
        
        if ( !matcher.matches() ) {
            throw new ValidatorException(this.armarMensaje("Las primeras 3 posiciones deben ser letras o el carácter &", RFCPersonaMoralValidator.INFO, FacesMessage.SEVERITY_ERROR));
        } 
    }
    
    /**
     * Valida el segundo bloque del rfc
     * @param sRFC RFC a validar
     * */
    private void validarBloque2(String sRFC) {
        pattern = Pattern.compile(RFCPersonaMoralValidator.PM_RFC_PATTERN_2BLOQUE);
        matcher = pattern.matcher(sRFC);
            
        if ( !matcher.matches() ) {
            throw new ValidatorException(this.armarMensaje("Año-Mes-Dia deben ser válidos y numéricos", RFCPersonaMoralValidator.INFO, FacesMessage.SEVERITY_ERROR));
        }
    }
    
    /**
     * Valida el tercer bloque del rfc
     * @param sRFC RFC a validar
     * */
    private void validarBloque3(String sRFC) {
        pattern = Pattern.compile(RFCPersonaMoralValidator.PM_RFC_PATTERN_3BLOQUE);
        matcher = pattern.matcher(sRFC);
        
        if ( !matcher.matches() ) {
            throw new ValidatorException(this.armarMensaje("El RFC no debe contener caracteres especiales excepto el &", RFCPersonaMoralValidator.INFO, FacesMessage.SEVERITY_ERROR));
        } 
    }
    
    /**
     * Valida el cuarto bloque del rfc
     * @param sRFC RFC a validar
     * */
    private void validarBloque4(String sRFC) {
        pattern = Pattern.compile(RFCPersonaMoralValidator.PM_RFC_PATTERN_4BLOQUE);
        matcher = pattern.matcher(sRFC);
                    
        if ( !matcher.matches() ) {
            throw new ValidatorException(this.armarMensaje("El último dígito debe ser numérico o la letra A.", RFCPersonaMoralValidator.INFO, FacesMessage.SEVERITY_ERROR));
        }
    }

}
