package mx.gob.imss.distss.dictamen.contador.integration.impl;

import gob.imss.webservice.sat.rfc.cliente.EntradaSAT;
import gob.imss.webservice.sat.rfc.cliente.SalidaSAT;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.dictamen.contador.commons.exception.DictamenContadorException;
import mx.gob.imss.cit.dictamen.contador.integration.api.SolicitudRegistroIntegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.ContadorPublicoAutDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DatosContactoDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.InfoProfesional;
import mx.gob.imss.cit.dictamen.contador.integration.api.exception.DictamenContadorNegocioException;
import mx.gob.imss.cit.dictamen.contador.services.ConsultaSATService;
import mx.gob.imss.distss.dictamen.contador.integration.util.TransformerIntegrationUtils;


@Remote({mx.gob.imss.cit.dictamen.contador.integration.api.SolicitudRegistroIntegrator.class})
@Stateless
public class SolicitudRegistroServiceIntegrator implements SolicitudRegistroIntegrator {

	private static final Logger LOG=Logger.getLogger(SolicitudRegistroServiceIntegrator.class);

	@EJB
	ConsultaSATService consultaSATService;

	@Override
	public ContadorPublicoAutDTO obtenerContadorPublicoAutDTO(String curp, String rfc) throws DictamenContadorNegocioException {
		EntradaSAT entrada = new EntradaSAT();
		entrada.setRfc(rfc);
		ContadorPublicoAutDTO contador = null;
		try {
			SalidaSAT salida = consultaSATService.obtenerDomicilioFiscal(entrada);
			if(salida != null && !salida.getUbicacion().isEmpty()){
				contador = new ContadorPublicoAutDTO();
				contador.setContacto(new DatosContactoDTO());
				contador.setInfoProf(new InfoProfesional());
				contador.setCurp(salida.getIdentificacion().get(0).getCURP());
				contador.setRfc(salida.getRFCOriginal());
				contador.setNombre(salida.getIdentificacion().get(0).getNomComercial());
				contador.setDomicilio(TransformerIntegrationUtils.transformer(salida.getUbicacion().get(0)));
			}

		} catch (DictamenContadorException e) {
			LOG.error(e.getMessage(),e);
			throw new DictamenContadorNegocioException(e.getMessage(), e);
		}
		return contador;
	}

}
