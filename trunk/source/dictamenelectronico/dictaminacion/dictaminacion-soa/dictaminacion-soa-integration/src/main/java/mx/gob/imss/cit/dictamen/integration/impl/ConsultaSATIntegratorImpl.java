package mx.gob.imss.cit.dictamen.integration.impl;

import gob.imss.webservice.sat.rfc.cliente.EntradaSAT;
import gob.imss.webservice.sat.rfc.cliente.SalidaSAT;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.integration.api.ConsultaSATIntegrator;
import mx.gob.imss.cit.dictamen.integration.api.exception.DictamenNegocioException;
import mx.gob.imss.cit.dictamen.services.ConsultaSatRFCService;

import org.apache.log4j.Logger;

@Remote({ConsultaSATIntegrator.class})
@Stateless
public class ConsultaSATIntegratorImpl implements ConsultaSATIntegrator {
	
	

	private static final Logger LOG=Logger.getLogger(ConsultaSATIntegratorImpl.class);
	
	@EJB
	private ConsultaSatRFCService consultaSatRFCService;



	@Override
	public String getPatron(String rfc)throws DictamenNegocioException {
		String razonSocial=null;
		
		try {
			EntradaSAT entradaSAT=new EntradaSAT();
			entradaSAT.setRfc(rfc);
			SalidaSAT salidaSAT=consultaSatRFCService.getPatron(entradaSAT);
			if(!salidaSAT.getIdentificacion().isEmpty()){
				razonSocial=salidaSAT.getIdentificacion().get(0).getRazonSoc();				
			}
			
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
			throw new DictamenNegocioException(e.getMessage(), e);
		}
		return razonSocial;
	}



}
