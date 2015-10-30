package mx.gob.imss.cit.dictamen.contador.services.impl;

import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.contador.commons.to.domain.FirmaElectronicaTO;
import mx.gob.imss.cit.dictamen.contador.services.FirmaElectronicaService;

@Stateless
public class FirmaElectronicaServiceImpl   implements FirmaElectronicaService{

	/**
	 * Metodo de servicio para la firma electronica
	 * @return
	 */
	@Override
	public FirmaElectronicaTO executeInitFirmaElectronica(){
		
		FirmaElectronicaTO  firmaElectronicaTO=new FirmaElectronicaTO();
		
			firmaElectronicaTO.setFiel("");
			firmaElectronicaTO.setFielArchive("MtsAppletFielWidget.IMSS.jar");
			firmaElectronicaTO.setFielCode("mx.com.metatrust.idtrust.mtsappletfielwidget.mtsafwidgetimss.MtsAFWidgetIMSS.class");
			firmaElectronicaTO.setFielCodebase("http://172.16.5.151:8083/firmaElectronicaWeb/applets/");
			firmaElectronicaTO.setFielParamOption("{'operacion':'autentica','salida':'rfc,curp,serie_cert'}");
			firmaElectronicaTO.setFielParamUrlWsFe("http://172.16.5.151:8083/WsFirmaElectronicaDT/FirmaElectronicaDTService");

				
		return firmaElectronicaTO;
	}
	
	
	
	

}