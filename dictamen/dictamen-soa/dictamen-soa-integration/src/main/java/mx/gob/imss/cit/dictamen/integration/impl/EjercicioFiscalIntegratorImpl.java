package mx.gob.imss.cit.dictamen.integration.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.domain.EjercicioFiscalTO;
import mx.gob.imss.cit.dictamen.integration.api.EjercicioFiscalIntegrator;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.EjercicioFiscalDTO;
import mx.gob.imss.cit.dictamen.integration.api.exception.DictamenNegocioException;
import mx.gob.imss.cit.dictamen.integration.transformer.TransformerIntegrationUtils;
import mx.gob.imss.cit.dictamen.services.EjercicioFiscalService;

import org.apache.log4j.Logger;

@Remote({ EjercicioFiscalIntegrator.class })
@Stateless
public class EjercicioFiscalIntegratorImpl implements EjercicioFiscalIntegrator {

	private static final Logger LOG = Logger.getLogger(EjercicioFiscalIntegratorImpl.class);

	@EJB
	private EjercicioFiscalService ejercicioFiscalService;

	@Override
	public List<EjercicioFiscalDTO> findAll() throws DictamenNegocioException {

		List<EjercicioFiscalDTO> listaTO = new ArrayList<EjercicioFiscalDTO>();
		try {

			List<EjercicioFiscalTO> ejercicioFiscalTOs = ejercicioFiscalService.findAll();

			for (EjercicioFiscalTO ejercicioFiscalTO : ejercicioFiscalTOs) {
				listaTO.add(TransformerIntegrationUtils.transformer(ejercicioFiscalTO));
			}

		} catch (DictamenException e) {
			LOG.error(e.getMessage(), e);
			throw new DictamenNegocioException(e.getMessage(), e);
		}

		return listaTO;

	}

	@Override
	public EjercicioFiscalDTO obtenerEjercicioFiscalActual(List<EjercicioFiscalDTO> ejercicios)
			throws DictamenNegocioException {

		EjercicioFiscalTO resTO = null;
		EjercicioFiscalDTO resDTO = null;
		try {

			List<EjercicioFiscalTO> ejercicioFiscalTOs = new ArrayList<EjercicioFiscalTO>();

			for (EjercicioFiscalDTO ejercicioFiscalDTO : ejercicios) {
				ejercicioFiscalTOs.add(TransformerIntegrationUtils.transformer(ejercicioFiscalDTO));
			}
			resTO = ejercicioFiscalService.obtenerEjercicioFiscalActual(ejercicioFiscalTOs);
			
			if (resTO != null) {
				resDTO = TransformerIntegrationUtils.transformer(resTO);
			}

		} catch (DictamenException e) {
			LOG.error(e.getMessage(), e);
			throw new DictamenNegocioException(e.getMessage(), e);
		}

		return resDTO;

	}

}
