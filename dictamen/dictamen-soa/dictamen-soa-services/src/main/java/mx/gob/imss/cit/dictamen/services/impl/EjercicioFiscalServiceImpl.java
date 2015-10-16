/**
 * 
 */
package mx.gob.imss.cit.dictamen.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.dictamen.commons.enums.DictamenExceptionCodeEnum;
import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.domain.EjercicioFiscalTO;
import mx.gob.imss.cit.dictamen.commons.util.FechasUtils;
import mx.gob.imss.cit.dictamen.model.NdcEjercicioFiscalDO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdcEjercicioFiscalDAO;
import mx.gob.imss.cit.dictamen.services.EjercicioFiscalService;
import mx.gob.imss.cit.dictamen.services.transformer.TransformerServiceUtils;
import mx.gob.imss.cit.dictamen.services.util.DictamenExceptionBuilder;

/**
 * @author ajfuentes
 *
 */

@Stateless
public class EjercicioFiscalServiceImpl implements EjercicioFiscalService {

	private static final Logger LOG = Logger.getLogger(EjercicioFiscalServiceImpl.class);

	@EJB
	private NdcEjercicioFiscalDAO ndcEjercicioFiscalDAO;

	@Override
	public List<EjercicioFiscalTO> findAll() throws DictamenException {

		List<NdcEjercicioFiscalDO> listaDO = null;
		List<EjercicioFiscalTO> listaTO = new ArrayList<EjercicioFiscalTO>();

		try {

			listaDO = ndcEjercicioFiscalDAO.findAll();

			for (NdcEjercicioFiscalDO ndcEjercicioFiscalDO : listaDO) {
				listaTO.add(TransformerServiceUtils.transformer(ndcEjercicioFiscalDO));
			}

		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			throw DictamenExceptionBuilder.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_EJERCICIO_FISCAL_FIND, e);
		}
		return listaTO;
	}

	@Override
	public EjercicioFiscalTO obtenerEjercicioFiscalActual(List<EjercicioFiscalTO> ejercicios) throws DictamenException {
		EjercicioFiscalTO res = null;

		try {
			String anioFiscal = FechasUtils.getAnioFromDate(FechasUtils.restarAnios(new Date(), 1));
			for (EjercicioFiscalTO ejercicioFiscalTO : ejercicios) {
				if (ejercicioFiscalTO.getDesEjerFiscal().equals(anioFiscal)) {
					res = ejercicioFiscalTO;
					break;
				}
			}
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			throw DictamenExceptionBuilder.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_EJERCICIO_FISCAL_FIND, e);
		}
		return res;

	}

}
