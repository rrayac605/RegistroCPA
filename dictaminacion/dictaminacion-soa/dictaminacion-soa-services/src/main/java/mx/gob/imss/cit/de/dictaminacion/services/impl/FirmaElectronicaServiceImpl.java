package mx.gob.imss.cit.de.dictaminacion.services.impl;

import javax.ejb.Stateless;

import mx.gob.imss.cit.de.dictaminacion.commons.constants.DictamenConstants;
import mx.gob.imss.cit.de.dictaminacion.commons.enums.DictamenExceptionCodeEnum;
import mx.gob.imss.cit.de.dictaminacion.commons.exception.DictamenException;
import mx.gob.imss.cit.de.dictaminacion.commons.to.FirmaElectronicaTO;
import mx.gob.imss.cit.de.dictaminacion.services.FirmaElectronicaService;
import mx.gob.imss.cit.de.dictaminacion.services.util.DictamenExceptionBuilder;
import mx.gob.imss.cit.de.dictaminacion.services.util.PropertiesConfigUtils;

@Stateless
/**
 * Clase de servicio para la firma electronica
 * @author ajfuentes
 *
 */
public class FirmaElectronicaServiceImpl implements FirmaElectronicaService{

	/**
	 * Metodo de servicio para la firma electronica
	 * @return
	 */
	@Override
	public FirmaElectronicaTO executeInitFirmaElectronica() throws DictamenException{
		
		FirmaElectronicaTO  firmaElectronicaTO=new FirmaElectronicaTO();
		try{	
			firmaElectronicaTO.setFiel(DictamenConstants.CARACTER_VACIO);
			firmaElectronicaTO.setFielArchive(PropertiesConfigUtils.getPropertyConfig(DictamenConstants.CONFIG_KEY_FIEL_ARCHIVE));
			firmaElectronicaTO.setFielCode(PropertiesConfigUtils.getPropertyConfig(DictamenConstants.CONFIG_KEY_FIEL_CODE));
			firmaElectronicaTO.setFielCodebase(PropertiesConfigUtils.getPropertyConfig(DictamenConstants.CONFIG_KEY_FIEL_CODEBASE));
			firmaElectronicaTO.setFielParamOption(PropertiesConfigUtils.getPropertyConfig(DictamenConstants.CONFIG_KEY_FIEL_PARAM_OPTION));
			firmaElectronicaTO.setFielParamUrlWsFe(PropertiesConfigUtils.getPropertyConfig(DictamenConstants.CONFIG_KEY_FIEL_PARAM_URL_WS_FE));
		}catch(Exception e){
			throw DictamenExceptionBuilder.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_FIRMA_ELECTRONICA,e);
		}
				
		return firmaElectronicaTO;
	}
	
	

}
