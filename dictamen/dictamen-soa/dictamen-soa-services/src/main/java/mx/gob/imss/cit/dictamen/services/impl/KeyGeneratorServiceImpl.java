package mx.gob.imss.cit.dictamen.services.impl;

import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.commons.enums.DictamenExceptionCodeEnum;
import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.KeyTO;
import mx.gob.imss.cit.dictamen.services.KeyGeneratorService;
import mx.gob.imss.cit.dictamen.services.util.DictamenExceptionBuilder;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
@Stateless
public class KeyGeneratorServiceImpl implements KeyGeneratorService  {

	@Override
	public String getKey(KeyTO keyTO) throws DictamenException{
		String key = null;
		if(isNull(keyTO.getAnioEjercicio()) || isNull(keyTO.getLayoutName()) || isNull(keyTO.getRfcPatron()) || isNull(keyTO.getRfcUsuario())){
			throw DictamenExceptionBuilder.build(DictamenExceptionCodeEnum.ERROR_KEY_GENERATOR_GET_KEY);
		}else{
			key = keyTO.getAnioEjercicio() + "/" + keyTO.getRfcUsuario() + "/" + keyTO.getRfcPatron() + "/"
					+ keyTO.getLayoutId()+"."+keyTO.getLayoutName() + ".txt";
			return key;
		}
	}
	
	public boolean isNull(String cadena){	
		if(cadena == null){
			return true;
		}else if(cadena.isEmpty()){
			return true;
		}else if(cadena.replace(" ", "").isEmpty()){
			return true;
		}else{
			return false;
		}
	}

}
