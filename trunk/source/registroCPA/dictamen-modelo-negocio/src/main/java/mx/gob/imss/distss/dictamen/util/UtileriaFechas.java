package mx.gob.imss.distss.dictamen.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

/**
 * UtileriaFechas es la clase con los métodos para el parseo y aplicacion del formateo 
 * de los objetos String y los objetos Date.
 */
public class UtileriaFechas {
	
	/**
     * Traza directamente referenciando a la clase que estanmos usando.
	 */
	private static final Logger logger = Logger.getLogger(UtileriaFechas.class);

	/**
	 * Método que cambia el formato de un valor Date
	 * 
	 * @param fecha Fecha que será formateada.
	 * @param formato el formato puede ser:
	 * DateFormat.SHORT -> dd/mm/yy
	 * DateFormat.MEDIUM -> dd/mm/yyyy
	 * DateFormat.LONG -> dd de mm de yyyy
	 * DateFormat.FULL -> dia dd de mes de yyy
	 * @return Fecha con el formato deseado.
	 */
	public static String cambiaFormatoFecha(Date fecha, int formato) {
		DateFormat dateFormat = DateFormat.getDateInstance(formato);
		String stringFecha = dateFormat.format(fecha);
		return stringFecha;
	}
	
	/**
	 * Método que parsea un objeto String a un objeto Date.
	 * 
	 * @param strDate cadena para ser parseada a objeto Date.
	 * @return Objeto Date resultante del parseo.
	 * @throws RuntimeException
	 */
	public static java.util.Date parseStringToDate(String strDate) throws RuntimeException {
        java.util.Date utilDate = null;
        logger.info("Convertir string fecha: "+strDate+ "a Date fecha");
        try {
        	if (!StringUtils.isEmpty(strDate)) {
        		SimpleDateFormat formater = new SimpleDateFormat("dd/mm/yyyy");
                //formater.setLenient(false);
        		utilDate = formater.parse(strDate);
        	}
        } catch (Exception ex) {
        	throw new RuntimeException("ERROR: Al convertir la cadena strDate: " + strDate + " en una utilDate.", ex);
        }
        return utilDate;
    }
	
	/**
     * Método que nos ayuda al parseo del objeto Date proporcionado en un formato especificado.
     * 
     * @param date Fecha que se desea convertir a String
     * @param formato Formato en el que sera devuleta la fecha.
     * @return String con el formato de la fecha deseado.
     */
    public static String parseDateToString(java.util.Date utilDate, String formato) throws RuntimeException {
        String strDate = "";
        logger.info("Convertir fecha: "+utilDate+ "a formato: "+formato);
        try {
        	SimpleDateFormat format = new SimpleDateFormat(formato);
            strDate = format.format(utilDate);
        } catch (Exception ex) {
            throw new RuntimeException("ERROR: Al convertir la utilDate: " + utilDate + " en un String.", ex);
        }
        return strDate;
    }

}