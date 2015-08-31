package mx.gob.imss.cit.dictamen.services.impl;

import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.commons.constants.FirmaElectronicaConstans;
import mx.gob.imss.cit.dictamen.commons.to.FirmaElectronicaTO;
import mx.gob.imss.cit.dictamen.commons.util.FirmaElectronicaUtil;
import mx.gob.imss.cit.dictamen.services.FirmaElectronicaService;

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
	public FirmaElectronicaTO executeInitFirmaElectronica() {
		FirmaElectronicaTO  firmaElectronicaTO=new FirmaElectronicaTO();
		
		
		firmaElectronicaTO.setFiel("");
		firmaElectronicaTO.setFielArchive(FirmaElectronicaUtil.getPropiedadFirmaElectronica(FirmaElectronicaConstans.KEY_FIEL_ARCHIVE));
		firmaElectronicaTO.setFielCode(FirmaElectronicaUtil.getPropiedadFirmaElectronica(FirmaElectronicaConstans.KEY_FIEL_CODE));
		firmaElectronicaTO.setFielCodebase(FirmaElectronicaUtil.getPropiedadFirmaElectronica(FirmaElectronicaConstans.KEY_FIEL_CODEBASE));
		firmaElectronicaTO.setFielParamOption(FirmaElectronicaUtil.getPropiedadFirmaElectronica(FirmaElectronicaConstans.KEY_FIEL_PARAM_OPTION));
		firmaElectronicaTO.setFielParamUrlWsFe(FirmaElectronicaUtil.getPropiedadFirmaElectronica(FirmaElectronicaConstans.KEY_FIEL_PARAM_URL_WS_FE));
		
		return firmaElectronicaTO;
	}
	
	

}
