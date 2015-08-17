package mx.gob.imss.cit.dictamen.commons.util;

import java.io.Serializable;
import java.util.ResourceBundle;

import mx.gob.imss.cit.dictamen.commons.constants.FirmaElectronicaConstans;

import org.apache.log4j.Logger;

/**
 * Clase con diversas utilerias para el proyecto.
 */
public final class FirmaElectronicaUtil implements Serializable {
	
	/**
	 * UID
	 */
	private static final long serialVersionUID = 1L;



	private FirmaElectronicaUtil() {

	}


	private static final  Logger log = Logger.getLogger(FirmaElectronicaUtil.class);
	/**
	 * Constante para cargar el properties 
	 */

	private static final ResourceBundle FIRMA_ELECTRONICA_BUNDLE =ResourceBundle.getBundle(FirmaElectronicaConstans.FIRMA_ELECTRONICA_FILE_PROPERTIES);



	public static String getPropiedadFirmaElectronica(String key){	
		String mensaje="";
		try{
			mensaje=FIRMA_ELECTRONICA_BUNDLE.getString(key);
		}catch(Exception e){
			log.info("No se encontro la propiedad con el key "+key);
			mensaje="";
		}
		return mensaje;
	}

}
