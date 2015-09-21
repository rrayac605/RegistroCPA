package mx.gob.imss.cit.dictamen.services.impl;

import javax.ejb.Stateless;

import gob.imss.webservice.sat.rfc.implementacion.ClienteWebserviceRfc;
import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.sat.individuo.to.FisicaTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.individuo.to.MoralTO;
import mx.gob.imss.cit.dictamen.services.ConsultaSatRFCService;
import mx.gob.imss.cit.dictamen.services.transformer.TransformerServiceUtils;
import mx.gob.imss.ctirss.delta.framework.exceptions.ClienteWebserviceSatRfcException;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Fisica;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Moral;

@Stateless
public class ConsultaSatRFCServiceImpl implements  ConsultaSatRFCService{
	//private ObjectFactory objectFactory= new ObjectFactory();
	@Override
	public FisicaTO buscarPersonaFisicaPorRfcEnSat(String rfc) throws DictamenException {
		
		FisicaTO fisicaTO = new FisicaTO();
		Fisica fisica = new Fisica();
		ClienteWebserviceRfc clienteWebserviceRfc= new ClienteWebserviceRfc();
		
		try {
			fisica  = clienteWebserviceRfc.buscarPersonaFisicaPorRfcEnSat(rfc);
			fisicaTO=TransformerServiceUtils.transformer(fisica);
		} catch (ClienteWebserviceSatRfcException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fisicaTO;
	}

	@Override
	public MoralTO buscarPersonaMoralRfc(String rfc) throws DictamenException {
		
		MoralTO moralTO = new MoralTO();
		Moral moral = new Moral();
		ClienteWebserviceRfc clienteWebserviceRfc= new ClienteWebserviceRfc();
		
		try {
			moral  = clienteWebserviceRfc.buscarPersonaMoralPorRfcEnSat(rfc);
			moralTO=TransformerServiceUtils.transformer(moral);
		} catch (ClienteWebserviceSatRfcException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return moralTO;
	}

	@Override
	public FisicaTO obtenerDatosFiscalesFisicaPorRfc(String rfc) throws DictamenException {
		FisicaTO fisicaTO = new FisicaTO();
		Fisica fisica = new Fisica();
		ClienteWebserviceRfc clienteWebserviceRfc= new ClienteWebserviceRfc();
		
		try {
			fisica  = clienteWebserviceRfc.obtenerDatosFiscalesFisicaPorRfc(rfc);
			fisicaTO=TransformerServiceUtils.transformer(fisica);
		} catch (ClienteWebserviceSatRfcException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fisicaTO;
	}

	@Override
	public MoralTO obtenerDatosFiscalesMoralPorRfc(String rfc) throws DictamenException {
		
		MoralTO moralTO = new MoralTO();
		Moral moral = new Moral();
		ClienteWebserviceRfc clienteWebserviceRfc= new ClienteWebserviceRfc();
		
		try {
			moral  = clienteWebserviceRfc.obtenerDatosFiscalesMoralPorRfc(rfc);
			moralTO=TransformerServiceUtils.transformer(moral);
		} catch (ClienteWebserviceSatRfcException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return moralTO;
	}

}
