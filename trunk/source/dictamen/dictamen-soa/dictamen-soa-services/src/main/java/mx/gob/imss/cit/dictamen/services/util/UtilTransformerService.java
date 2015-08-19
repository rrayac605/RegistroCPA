package mx.gob.imss.cit.dictamen.services.util;

import mx.gob.imss.cit.dictamen.commons.to.ContadorPublicoTO;
import mx.gob.imss.cit.dictamen.commons.to.PersonaTO;
import mx.gob.imss.cit.dictamen.model.DitPersonaDO;
import mx.gob.imss.cit.dictamen.model.NdtContadorPublicoAutDO;
import mx.gob.imss.cit.dictamen.services.constants.ServicesConstants;


public class UtilTransformerService {
	

	
	public static ContadorPublicoTO transformer( NdtContadorPublicoAutDO ContadorPublico ) {
		ContadorPublicoTO cont=  (ContadorPublicoTO) UtilTransformerServiceHelper.get (ContadorPublico, ContadorPublicoTO.class,ServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}
	
	public static PersonaTO transformer( DitPersonaDO personaDO ) {
		PersonaTO cont=  (PersonaTO) UtilTransformerServiceHelper.get (personaDO, PersonaTO.class,ServicesConstants.PROFUNDIDAD_MAPEO) ;
		return cont;
	}
	
	
}
