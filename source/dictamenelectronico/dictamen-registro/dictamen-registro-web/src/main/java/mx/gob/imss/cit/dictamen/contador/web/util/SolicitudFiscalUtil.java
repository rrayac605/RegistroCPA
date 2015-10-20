package mx.gob.imss.cit.dictamen.contador.web.util;

import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import mx.gob.imss.cit.dictamen.contador.integration.api.dto.FolioSolicitudFiscalDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.PersonaDTO;

public final class SolicitudFiscalUtil {
	private static Logger LOGGER=Logger.getLogger(SolicitudFiscalUtil.class) ;
   public static final char[] VOCALES = {'A','E','I','O','U','Á','É','Í','Ó','Ú'}; 

   public static String generarFolioSolicitud(PersonaDTO personaDTO){
	  FolioSolicitudFiscalDTO folioSolicitudFiscalDTO = new FolioSolicitudFiscalDTO();
	 String apellidoPaterno =trim(personaDTO.getApellidoPaterno());
	 LOGGER.info("Apellido Paterno="+apellidoPaterno);
	 folioSolicitudFiscalDTO.setPlPrimerApellido(substring(apellidoPaterno,0,1));
	 int apPrimerVocal = StringUtils.indexOfAny(apellidoPaterno, VOCALES);
	 
	 if(apPrimerVocal!=-1){
		 folioSolicitudFiscalDTO.setPvPrimerApellido( String.valueOf(apellidoPaterno.charAt(apPrimerVocal)));
	 }
	 String apellidoMaterno =trim(personaDTO.getApellidoMaterno());
	 LOGGER.info("Apellido Materno="+apellidoMaterno);
	 
	 folioSolicitudFiscalDTO.setPlSegundoApellido(substring(apellidoMaterno,0,1));
     String primerNombre = trim(personaDTO.getNombre());
     folioSolicitudFiscalDTO.setPlPrimerNombre(substring(primerNombre,0,1));
     folioSolicitudFiscalDTO.setFechaNacimiento(format(personaDTO.getFechaNacimiento()));
     folioSolicitudFiscalDTO.setGenero(sexo(personaDTO.getIdSexo()));
     if(personaDTO.getContadorPublicoAutDTO()!=null){
    	  if(personaDTO.getContadorPublicoAutDTO().getDomicilioDTO()!=null){
   folioSolicitudFiscalDTO.setEntidadFederativa(trim(personaDTO.getContadorPublicoAutDTO().getDomicilioDTO().getEntidad()));
    	  }
     }
     
     int apPrimerConsonante = StringUtils.indexOfAnyBut(apellidoPaterno, VOCALES);
     int aMPrimerConsonante = StringUtils.indexOfAnyBut(apellidoMaterno, VOCALES);

     int apSegundaConsonante = StringUtils.indexOfAnyBut(apellidoPaterno.substring(apPrimerConsonante+1, apellidoPaterno.length()), VOCALES);
	 LOGGER.info("scAP="+apPrimerConsonante+"-"+apellidoPaterno.substring(apPrimerConsonante+1, apellidoPaterno.length()));
     folioSolicitudFiscalDTO.setcPrimerApellido( String.valueOf(apellidoPaterno.charAt(apPrimerConsonante)));
	 folioSolicitudFiscalDTO.setcSegundoApellido( String.valueOf(apellidoMaterno.charAt(aMPrimerConsonante)));
	 folioSolicitudFiscalDTO.setScPrimerApellido(String.valueOf(apellidoPaterno.charAt(apSegundaConsonante)));
	 
	 return folioSolicitudFiscalDTO.toString();
   }
   
   public static String sexo(Integer idSexo){
	  if(idSexo==null){
		  return StringUtils.EMPTY;
	  }
	 if(idSexo ==1){
		 return "H";
	 }else if(idSexo ==2){
		 return "M";
	 }else{
		  return StringUtils.EMPTY;

	 }
   }
   public static String format(Date fechaNacimiento){
	     DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyyMMdd");
	     if(fechaNacimiento ==  null){
			 return StringUtils.EMPTY;
	     }
	    return formatter.print(new DateTime(fechaNacimiento));
   }
   public static void main(String args[]){
	   PersonaDTO personaDTO = new PersonaDTO();
	   personaDTO.setApellidoPaterno("sanchez");
	   personaDTO.setApellidoMaterno("huerta");
	   personaDTO.setNombre("Octavio");
	   personaDTO.setFechaNacimiento(new Date());
	   LOGGER.info("generarFolioSolicitud="+SolicitudFiscalUtil.generarFolioSolicitud(personaDTO));
   }
   public static String substring( String cadena, int begin, int end){
	  if(StringUtils.isEmpty(cadena)){
		 return StringUtils.EMPTY;
	  }
	  return cadena.substring(begin,end);
   }
   public static String trim(String cadena){
	   if(StringUtils.isEmpty(cadena)){
		  return StringUtils.EMPTY;
	   }else{
		  return StringUtils.upperCase(StringUtils.trim(cadena));
	   }
   }
   
}
