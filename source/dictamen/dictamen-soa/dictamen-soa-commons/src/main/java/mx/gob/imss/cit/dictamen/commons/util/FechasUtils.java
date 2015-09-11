package mx.gob.imss.cit.dictamen.commons.util;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * The Class DateUtil.
 */
public final class FechasUtils {
	/**
	 * Formato de fecha.
	 */
	private static final String FECHA_FORMATO_dd_MM_yyyy = "dd/MM/yyyy";
	
	private static final String FECHA_FORMATO_dd_MM_yyyy_HH_mm_ss_SSS = "dd/MM/yyyy HH:mm:ss.SSS";
	
	private static final String FECHA_FORMATO_HH_mm_ss = "HH:mm:ss";
	
	private static final String FECHA_FORMATO_yyyy_MM_dd_T_HH_mm_ss_Z = "yyyy-MM-dd'T'HH:mm:ssZ";

	/**
	 * Constantes privadas para calculos
	 */
	private static final int N_1000 = 1000;
	private static final int N_86400 = 86400;
	private static final int N_3600 = 3600;
	private static final int N_60 = 60;
	private static final int N_24 = 24;
	private static final int N_10 = 10;
	
	/**
	 * Contructor privado.
	 */
	private FechasUtils(){
		
	}	
	
	public static Date stringToDate_yyyy_MM_dd_T_HH_mm_ss_Z(String date) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat(FECHA_FORMATO_yyyy_MM_dd_T_HH_mm_ss_Z);
		return sdf.parse(date);
	}	
	

	public static String dateToString_yyyy_MM_dd_T_HH_mm_ss_Z(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat(FECHA_FORMATO_yyyy_MM_dd_T_HH_mm_ss_Z);		
		return sdf.format(date);
	}
	
	
	
	public static Date stringToDate_dd_MM_yyyy(String dateS) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat(FECHA_FORMATO_dd_MM_yyyy);
		return sdf.parse(dateS);
	}	
	

	public static String dateToString_dd_MM_yyyy(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat(FECHA_FORMATO_dd_MM_yyyy);		
		return sdf.format(date);
	}
	

	public static String  dateToString_dd_MM_yyyy_HH_mm_ss_SSS(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat(FECHA_FORMATO_dd_MM_yyyy_HH_mm_ss_SSS);		
		return sdf.format(date);
	}



	public static String dateToString_HH_mm_ss_SSS(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat(FECHA_FORMATO_HH_mm_ss);		
		return sdf.format(date);
	}


	public static String diferenciaEnHorasEntreFechas(Date ini, Date fin){
	    if(ini == null || fin == null) {
	        return null;
	    }
        long seconds =   (fin.getTime()-ini.getTime()) /N_1000;
        int numDays =(int) Math.floor(seconds / N_86400*N_24);
        int numHours = (int)Math.floor((seconds % N_86400) / N_3600);
        int numMinutes = (int)Math.floor(((seconds % N_86400) % N_3600) / N_60);
        int numSeconds = (int)Math.floor((seconds % N_86400) % N_3600) % N_60;
     
        return getNumero2Digitos(numHours+numDays) + ":" + getNumero2Digitos(numMinutes) + ":" + getNumero2Digitos(numSeconds) ;
	}
	
	
	public static String diferenciaEnHorasYMinutosEntreFechas(Date ini, Date fin) {
		if(ini == null || fin == null) {
	        return null;
	    }
        long seconds =   (fin.getTime()-ini.getTime()) /N_1000;
        int numDays =(int) Math.floor(seconds / N_86400*N_24);
        int numHours = (int)Math.floor((seconds % N_86400) / N_3600);
        int numMinutes = (int)Math.floor(((seconds % N_86400) % N_3600) / N_60);
     
        return getNumero2Digitos(numHours+numDays) + ":" + getNumero2Digitos(numMinutes);
	}
	
	private static String getNumero2Digitos( int num ){
		if( Math.abs(num) < N_10 ) {
			return "0" + Math.abs(num);
		} else {
			return "" + num;
		}
	}
	

	/**
	 * Devuelve la hora a partir de un Date
	 * 
	 * @param fechaCompleta
	 * 
	 * @return
	 */
	public static String getHoraFromDate(Date fechaCompleta){

		SimpleDateFormat dateFormat=new SimpleDateFormat("hh:mm");		

		return dateFormat.format(fechaCompleta);
    }

   public static Date getFechaMasMenosDias(Date fechaActual, Integer dias) {
        Calendar c1 = Calendar.getInstance();
        c1.setTime(fechaActual);
        c1.add(Calendar.DAY_OF_MONTH, dias);
        return c1.getTime();
    }

   public static Date getFechaMasMenosMeses(Date fechaActual, Integer meses) {
	    Calendar c1 = Calendar.getInstance();
	    c1.setTime(fechaActual);
	    c1.add(Calendar.MONTH, meses);
	    return c1.getTime();
	}
   
   /** Obtiene el primer dia del mes **/
   public static Date getPrimerDiaDelMes() {
       Calendar cal = Calendar.getInstance();
       cal.set(cal.get(Calendar.YEAR),
               cal.get(Calendar.MONTH),
               cal.getActualMinimum(Calendar.DAY_OF_MONTH),
               cal.getMinimum(Calendar.HOUR_OF_DAY),
               cal.getMinimum(Calendar.MINUTE),
               cal.getMinimum(Calendar.SECOND));
       cal.set(Calendar.MILLISECOND, cal.getMinimum(Calendar.MILLISECOND));
       return cal.getTime();
   }

   /** Obtiene el ultimo dia del mes **/
   public static Date getUltimoDiaDelMes() {
       Calendar cal = Calendar.getInstance();
       cal.set(cal.get(Calendar.YEAR),
               cal.get(Calendar.MONTH),
               cal.getActualMaximum(Calendar.DAY_OF_MONTH),
               cal.getMaximum(Calendar.HOUR_OF_DAY),
               cal.getMaximum(Calendar.MINUTE),
               cal.getMaximum(Calendar.SECOND));
       cal.set(Calendar.MILLISECOND, cal.getMaximum(Calendar.MILLISECOND));
       return cal.getTime();
   }
   
   /** Suma dias a la fecha recibida **/
   public static Date agregaDias(Date fecha, int numDias){
       Calendar cal = Calendar.getInstance();
       cal.setTime(fecha);
       cal.add(Calendar.DATE, numDias);
       return cal.getTime();
   }
   
   /**
    * Regresa la fecha proporcionada pero con 
    * hora, minutos, segundos y milisegundos a 0
    *  Nov 01 00:00:00:000
    * @param fecha a cambiar horario
    * @return fecha con horario inicial del dia
    */
   public static Date getFechaInicioBusqueda(Date fecha) {
       final Calendar fechaNueva = Calendar.getInstance();
       fechaNueva.setTime(fecha);
       FechasUtils.clearCalendaHMS(fechaNueva);
       return fechaNueva.getTime();
   }
   
   /**
    * establece a cero los valores de hora, minutos, segundos y milisegundos
    * de un Calendar proporcionado
    * @param calendario
    */
   public static void clearCalendaHMS(final Calendar calendario) {
	   calendario.set(Calendar.HOUR_OF_DAY, 0);
	   calendario.set(Calendar.MINUTE, 0);
	   calendario.set(Calendar.SECOND, 0);
	   calendario.set(Calendar.MILLISECOND, 0);
   }
   

   /**
    * establece al maximo valor posibles los campos de hora, minuto
    * , segundos y milisegundos de un calendario
    * @param calendario
    */
   public static void setMaxHMS(final Calendar calendario){
	   calendario.set(Calendar.HOUR_OF_DAY, calendario.getMaximum(Calendar.HOUR_OF_DAY));
       calendario.set(Calendar.MINUTE, calendario.getMaximum(Calendar.MINUTE));
       calendario.set(Calendar.SECOND, calendario.getMaximum(Calendar.SECOND));
       calendario.set(Calendar.MILLISECOND, calendario.getMaximum(Calendar.MILLISECOND));
   }
   
   /**
    * Regresa una fecha en formato texto.
    * @param timemill fecha en formato milisegundos
    * @param formato de la fecha solicitada
    * @return fecha en formato texto
    * @throws ParseException
    */
   public static String datetoText(final long timemill, final String formato) throws ParseException{
		final SimpleDateFormat simdaf = new SimpleDateFormat(formato);
		return simdaf.format(new Date(timemill));
	}




}