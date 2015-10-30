package mx.gob.imss.cit.dictamen.contador.web.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import org.apache.log4j.Logger;

public class CurpValidator extends BaseValidator  implements Validator {
    
    public static final String CURP_PATTERN_INICIO =
            "^([A-ZÑ&amp;]{4}\\d{2}(((0[1-9&&[^2]]|1[012])(0[1-9]|[12]\\d|3[01]))|02(0[1-9]|1\\d|2[0-9]))[HM]";
        public static final String CURP_ENTIDADES =
            "(AS|BC|BS|CC|CL|CM|CS|CH|DF|DG|GT|GR|HG|JC|MC|MN|MS|NT|NL|OC|PL|QT|QR|SP|SL|SR|TC|TS|TL|VZ|YN|ZS|SM|NE|NI)";
        public static final String CURP_PATTERN_FIN = "[A-Z&&[^AEIOU]]{3}[A-Z[0-9]]{1}[\\d])?$";
        public static final String CURP_PATTERN_1BLOQUE = "^[A-ZÑ&amp;]{4}.*$";
        public static final String CURP_PATTERN_2BLOQUE =
            "^.{4}\\d{2}(((0[1-9&&[^2]]|1[012])(0[1-9]|[12]\\d|3[01]))|02(0[1-9]|1\\d|2[0-9])).*$";
        public static final String CURP_PATTERN_3BLOQUE = "^.{10}[HM]{1}.*$";
        public static final String CURP_PATTERN_4BLOQUE =
            "^.{11}(AS|BC|BS|CC|CL|CM|CS|CH|DF|DG|GT|GR|HG|JC|MC|MN|MS|NT|NL|OC|PL|QT|QR|SP|SL|SR|TC|TS|TL|VZ|YN|ZS|SM|NE|NI).*$";
        public static final String CURP_PATTERN_5BLOQUE = "^.{13}[A-Z&&[^AEIOU]]{3}.*$";
        public static final String CURP_PATTERN_6BLOQUE = "^.{16}[A-Z[0-9]]{1}.*$";
        public static final String CURP_PATTERN_7BLOQUE = "^.{17}[\\d]{1}$";

        
    /**Log de la clase.*/
	private static final Logger LOG = Logger.getLogger(BaseValidator.class);
    
    /**Leyenda que indica que el mensaje es informativo.*/
    private static final String INFO = "INFO";
    
    /**Indica la longitud de caracteres de la CURP.*/
    private static final int TAM_CURP = 18;
    
    /**Objeto para representar una expresi&oacute;n regular.*/
    private Pattern pattern;
    
    /**Objeto para comparar las cadenas con las expresiones regulares.*/
    private Matcher matcher;
    
    /**{@inheritDoc}*/
    @Override
    public void validate(FacesContext ctx, UIComponent uic, Object val) throws ValidatorException {

        String sCurp  = (String) val;

        if ( sCurp != null && !"".equals(sCurp) ) {
            sCurp = sCurp.toUpperCase();
            this.validarTamanioCURP(sCurp);
            this.validarBloque1(sCurp);
            this.validarBloque2(sCurp);
            this.validarBloque3(sCurp);
            this.validarBloque4(sCurp);
            this.validarBloque5(sCurp);
            this.validarBloque6(sCurp);
            this.validarBloque7(sCurp);
        } else {
            LOG.info("El CURP no es obligatorio no se valida.");
        }
    }
    
    /**
     * Valida el tama&ntilde;o de la CURP.
     * @param curp CURP a validar.
     * */
    private void validarTamanioCURP(String curp) {
        if (curp.length() != CurpValidator.TAM_CURP) {
            throw new ValidatorException(this.armarMensaje("El CURP debe ser de 18 posiciones", CurpValidator.INFO, FacesMessage.SEVERITY_ERROR));
        }
    }
    
    /**
     * Valida el primer bloque de la CURP.
     * @param sCurp CURP a validar.
     * */
    private void validarBloque1(String sCurp) {
        pattern = Pattern.compile(CurpValidator.CURP_PATTERN_1BLOQUE);
        matcher = pattern.matcher(sCurp);
        
        if (!matcher.matches()) {
            throw new ValidatorException(this.armarMensaje("Las primeras 4 posiciones deben ser letras o el carácter &", CurpValidator.INFO, FacesMessage.SEVERITY_ERROR));
        } 
    }
    
    /**
     * Valida el segundo bloque de la CURP.
     * @param sCurp CURP a validar.
     * */
    private void validarBloque2(String sCurp) {
        pattern = Pattern.compile(CurpValidator.CURP_PATTERN_2BLOQUE);
        matcher = pattern.matcher(sCurp);

        if (!matcher.matches()) {
            throw new ValidatorException(this.armarMensaje("Año-Mes-Dia deben ser válidos y numéricos", CurpValidator.INFO, FacesMessage.SEVERITY_ERROR));
        }
    }
    
    /**
     * Valida el tercer bloque de la CURP.
     * @param sCurp CURP a validar.
     * */
    private void validarBloque3(String sCurp) {
        pattern = Pattern.compile(CurpValidator.CURP_PATTERN_3BLOQUE);
        matcher = pattern.matcher(sCurp);

        if (!matcher.matches()) {
            throw new ValidatorException(this.armarMensaje("La posición 11 debe ser H(Hombre) o M(Mujer).", CurpValidator.INFO, FacesMessage.SEVERITY_ERROR));
        }
    }
    
    /**
     * Valida el cuarto bloque de la CURP.
     * @param sCurp CURP a validar.
     * */
    private void validarBloque4(String sCurp) {
        pattern = Pattern.compile(CurpValidator.CURP_PATTERN_4BLOQUE);
        matcher = pattern.matcher(sCurp);

        if (!matcher.matches()) {
            throw new ValidatorException(this.armarMensaje("Verifica. No es válida la entidad federativa de nacimiento.", CurpValidator.INFO, FacesMessage.SEVERITY_ERROR));
        }
    }
    
    /**
     * Valida el quinto bloque de la CURP.
     * @param sCurp CURP a validar.
     * */
    private void validarBloque5(String sCurp) {
        pattern = Pattern.compile(CurpValidator.CURP_PATTERN_5BLOQUE);
        matcher = pattern.matcher(sCurp);
        
        if (!matcher.matches()) {
            throw new ValidatorException(this.armarMensaje("La posicion 14,15 y 16 deben ser consonantes", CurpValidator.INFO, FacesMessage.SEVERITY_ERROR));
        }
    }
    
    /**
     * Valida el sexto bloque de la CURP.
     * @param sCurp CURP a validar.
     * */
    private void validarBloque6(String sCurp) {
        pattern = Pattern.compile(CurpValidator.CURP_PATTERN_6BLOQUE);
        matcher = pattern.matcher(sCurp);

        if (!matcher.matches()) {
            throw new ValidatorException(this.armarMensaje("El CURP no debe contener caracteres especiales", CurpValidator.INFO, FacesMessage.SEVERITY_ERROR));
        } 
    }
    
    /**
     * Valida el septimo bloque de la CURP.
     * @param sCurp CURP a validar.
     * */
    private void validarBloque7(String sCurp) {
        pattern = Pattern.compile(CurpValidator.CURP_PATTERN_7BLOQUE);
        matcher = pattern.matcher(sCurp);

        if (!matcher.matches()) {
            throw new ValidatorException(this.armarMensaje("La última posición debe ser numérica.", CurpValidator.INFO, FacesMessage.SEVERITY_ERROR));
        }
    }
    

}
