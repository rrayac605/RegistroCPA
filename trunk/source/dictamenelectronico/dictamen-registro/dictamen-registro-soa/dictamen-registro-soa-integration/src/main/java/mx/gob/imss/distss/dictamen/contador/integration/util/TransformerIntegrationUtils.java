package mx.gob.imss.distss.dictamen.contador.integration.util;

import gob.imss.webservice.sat.rfc.cliente.Ubicacion;

import java.util.HashMap;
import java.util.Map;

import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DomicilioDTO;

/**
 * Clase que realiza tranformaciones de objetos
 * @author ariverav
 *
 */
public class TransformerIntegrationUtils {

	private static Map<Class<?>, Class<?>> mapClass;

	static{
		mapClass = new HashMap<Class<?>, Class<?>>();
		mapClass.put(mx.gob.imss.cit.dictamen.contador.integration.api.dto.DomicilioDTO.class, gob.imss.webservice.sat.rfc.cliente.Ubicacion.class);	
	}

	public static DomicilioDTO transformer(Ubicacion ubicacion ) {
		DomicilioDTO domicilio = new DomicilioDTO();		
		domicilio.setCalle(ubicacion.getCalle());
		domicilio.setCodigoPostal(ubicacion.getCp());
		domicilio.setColonia(ubicacion.getDColonia());
		domicilio.setEmail(ubicacion.getEmail());
		domicilio.setEntidad(ubicacion.getDEntFed());
		domicilio.setEntreCalle(ubicacion.getDEntreCalle1());
		domicilio.setyCalle(ubicacion.getDEntreCalle2());		
		domicilio.setLocalidad(ubicacion.getDLocalidad());
		domicilio.setMunicipio(ubicacion.getDMunicipio());
		domicilio.setNumExterior(ubicacion.getNExterior());
		domicilio.setNumInterior(ubicacion.getNInterior());
		domicilio.setTelefono(ubicacion.getTelefono1());		
		return domicilio;
	}	

	//	PatronDictamenTO objRes= (PatronDictamenTO) TransformerHelper.get(mapClass,object, PatronDictamenTO.class,DictamenConstants.PROFUNDIDAD_MAPEO) ;
}
