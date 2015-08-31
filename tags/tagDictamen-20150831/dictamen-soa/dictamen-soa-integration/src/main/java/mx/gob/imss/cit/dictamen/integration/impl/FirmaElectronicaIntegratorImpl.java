package mx.gob.imss.cit.dictamen.integration.impl;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.commons.to.FirmaElectronicaTO;
import mx.gob.imss.cit.dictamen.integration.api.FirmaElectronicaIntegrator;
import mx.gob.imss.cit.dictamen.integration.api.dto.FirmaElectronicaDTO;
import mx.gob.imss.cit.dictamen.services.FirmaElectronicaService;


@Remote({FirmaElectronicaIntegrator.class})
@Stateless
/**
 * Clase de integracion para la firma electronica
 * @author ajfuentes
 *
 */
public class FirmaElectronicaIntegratorImpl implements FirmaElectronicaIntegrator {

	@EJB
	private FirmaElectronicaService firmaElectronicaService;
	
	/**
	 * metodo de integracion para la firma electronica
	 */
	@Override
	public FirmaElectronicaDTO executeInitFirmaElectronica() {
		FirmaElectronicaDTO dto=new FirmaElectronicaDTO();
		
		FirmaElectronicaTO to=firmaElectronicaService.executeInitFirmaElectronica();
		
		dto.setFiel(to.getFiel());
		dto.setFielArchive(to.getFielArchive());
		dto.setFielCode(to.getFielCode());
		dto.setFielCodebase(to.getFielCodebase());
		dto.setFielParamOption(to.getFielParamOption());
		dto.setFielParamUrlWsFe(to.getFielParamUrlWsFe());
		
		return dto;
	}

}
