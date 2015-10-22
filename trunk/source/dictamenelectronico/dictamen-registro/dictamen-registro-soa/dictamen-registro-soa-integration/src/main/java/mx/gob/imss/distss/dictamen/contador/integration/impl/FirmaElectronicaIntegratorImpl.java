package mx.gob.imss.distss.dictamen.contador.integration.impl;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.contador.integration.api.FirmaElectronicaIntegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.FirmaElectronicaDTO;
import mx.gob.imss.cit.dictamen.contador.services.FirmaElectronicaService;



@Remote({FirmaElectronicaIntegrator.class})
@Stateless
public class FirmaElectronicaIntegratorImpl implements FirmaElectronicaIntegrator {

	@EJB
	private FirmaElectronicaService firmaElectronicaService;
	
	/**
	 * metodo de integracion para la firma electronica
	 */
	@Override
	public FirmaElectronicaDTO executeInitFirmaElectronica()  {
		FirmaElectronicaDTO dto=new FirmaElectronicaDTO();
		firmaElectronicaService.executeInitFirmaElectronica();

		return dto;
	}
}