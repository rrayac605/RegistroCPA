package mx.gob.imss.cit.dictamen.contador.services.transformer;

import java.util.HashMap;
import java.util.Map;

import mx.gob.imss.cit.dictamen.contador.commons.to.domain.ContadorPublicoAutTO;
import mx.gob.imss.cit.dictamen.contador.commons.util.TransformerHelper;
import mx.gob.imss.cit.dictamen.contador.model.NdtContadorPublicoAutDO;



public class TransformerServiceUtils {
	
	private static Map<Class<?>, Class<?>> mapClass;
	
	static{
		mapClass = new HashMap<Class<?>, Class<?>>();		
		
		mapClass.put(mx.gob.imss.cit.dictamen.contador.commons.to.domain.ContadorPublicoAutTO.class	,mx.gob.imss.cit.dictamen.contador.model.NdtContadorPublicoAutDO.class);
	}
	
	private TransformerServiceUtils(){
		
	}



	public static ContadorPublicoAutTO transformer( NdtContadorPublicoAutDO object ) {
		return (ContadorPublicoAutTO) TransformerHelper.get(mapClass,object, ContadorPublicoAutTO.class,4) ;
	}

}