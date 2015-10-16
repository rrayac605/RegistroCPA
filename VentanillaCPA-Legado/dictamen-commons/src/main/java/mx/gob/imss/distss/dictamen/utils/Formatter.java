package mx.gob.imss.distss.dictamen.utils;

import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 * <p>
 *     Clase para aplicar formato a campos
 * </p>
 * @author Hector Lorenzo Lopez
 * */
public class Formatter {

    /**
     * <p>
     *     Aplica el formato especificado al valor
     *     proporcionado
     * </p>
     * @param format formato a aplicar
     * @param value valor al que se desea aplicar formato
     * */
    public String format(String format,Object value){
        if (value==null)return "";
        format=format.toLowerCase();
        if ((value instanceof Date) || (value instanceof java.util.Date)) {
            return new SimpleDateFormat(format).format(value);
        }
        return String.format(format,value);
    }
}
