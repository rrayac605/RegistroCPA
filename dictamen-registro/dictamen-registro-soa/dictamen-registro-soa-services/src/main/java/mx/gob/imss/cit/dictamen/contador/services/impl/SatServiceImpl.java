package mx.gob.imss.cit.dictamen.contador.services.impl;


import gob.imss.webservice.sat.rfc.implementacion.ClienteWebserviceRfc;

import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.contador.services.SatService;
import mx.gob.imss.ctirss.delta.framework.exceptions.ClienteWebserviceSatRfcException;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Fisica;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Moral;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Stateless(name  = "satService", mappedName = "satService")
public class SatServiceImpl implements SatService {
	
	private static final Logger logger = LoggerFactory.getLogger(SatServiceImpl.class);
	
	@Override
	public Fisica buscarPersonaFisicaPorRfc(String rfc) throws RuntimeException {
		Fisica personaFisica = null;
		ClienteWebserviceRfc clienteWebserviceRfc = new ClienteWebserviceRfc();
		try {
			personaFisica = clienteWebserviceRfc.buscarPersonaFisicaPorRfcEnSat(rfc);
		} catch (ClienteWebserviceSatRfcException ex) {
			logger.info("ERROR: Al intentar obtener a una Persona Fisica por RFC, del Servicio Web del SAT.", ex);
			throw new RuntimeException("ERROR: Al intentar obtener a una Persona Fisica por RFC, del Servicio Web del SAT.", ex);
		}
		return personaFisica;
	}
	
	@Override
	public Fisica obtenerDatosFiscalesFisicaPorRFC(String rfc) throws RuntimeException {
		Fisica personaFisica = null;
		ClienteWebserviceRfc clienteWebserviceRfc = new ClienteWebserviceRfc();
		try {
			personaFisica = clienteWebserviceRfc.obtenerDatosFiscalesFisicaPorRfc(rfc);
		} catch (ClienteWebserviceSatRfcException ex) {
			logger.info("ERROR: Al intentar obtener los Datos Fiscales de una Persona Fisica por RFC, del Servicio Web del SAT.", ex);
			throw new RuntimeException("ERROR: Al intentar obtener los Datos Fiscales de una Persona Fisica por RFC, del Servicio Web del SAT.", ex);
		}
		return personaFisica;
	}
	
	@Override
	public Moral buscarPersonaMoralPorRfc(String rfc) throws RuntimeException {
		Moral personaMoral = null;
		ClienteWebserviceRfc clienteWebserviceRfc = new ClienteWebserviceRfc();
		try {
			personaMoral = clienteWebserviceRfc.buscarPersonaMoralPorRfcEnSat(rfc);
		} catch (ClienteWebserviceSatRfcException ex) {
			logger.info("ERROR: Al intentar obtener a una Persona Moral por RFC, del Servicio Web del SAT.", ex);
			throw new RuntimeException("ERROR: Al intentar obtener a una Persona Moral por RFC, del Servicio Web del SAT.", ex);
		}
		return personaMoral;
	}
	
	@Override
	public Moral obtenerDatosFiscalesMoralPorRFC(String rfc) throws RuntimeException {
		Moral personaMoral = null;
		ClienteWebserviceRfc clienteWebserviceRfc = new ClienteWebserviceRfc();
		try {
			personaMoral = clienteWebserviceRfc.obtenerDatosFiscalesMoralPorRfc(rfc);
		} catch (ClienteWebserviceSatRfcException ex) {
			logger.info("ERROR: Al intentar obtener los Datos Fiscales de una Persona Moral por RFC, del Servicio Web del SAT.", ex);
			throw new RuntimeException("ERROR: Al intentar obtener los Datos Fiscales de una Persona Moral por RFC, del Servicio Web del SAT.", ex);
		}
		return personaMoral;
	}

}
