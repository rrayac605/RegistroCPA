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
import mx.gob.imss.cit.dictamen.commons.enums.EstadoDictamenEnum;
import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.domain.ContadorPublicoAutTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.PatronAsociadoTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.PatronDictamenTO;
import mx.gob.imss.cit.dictamen.commons.util.ValidatorUtil;
import mx.gob.imss.cit.dictamen.model.NdcEstadoDictamenDO;
import mx.gob.imss.cit.dictamen.model.NdtContadorPublicoAutDO;
import mx.gob.imss.cit.dictamen.model.NdtPatronAsociadoDO;
import mx.gob.imss.cit.dictamen.model.NdtPatronDictamenCpaDO;
import mx.gob.imss.cit.dictamen.model.NdtPatronDictamenDO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtPatronAsociadoDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtPatronDictamenCpaDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtPatronDictamenDAO;
import mx.gob.imss.cit.dictamen.services.PatronDictamenService;
import mx.gob.imss.cit.dictamen.services.transformer.TransformerServiceUtils;
import mx.gob.imss.cit.dictamen.services.util.DictamenExceptionBuilder;

/**
 * @author ajfuentes
 * 
 */

@Stateless
public class PatronDictamenServiceImpl implements PatronDictamenService {

	private static final Logger LOG = Logger
			.getLogger(PatronDictamenServiceImpl.class);

	@EJB
	private NdtPatronDictamenDAO ndtPatronDictamenDAO;

	@EJB
	private NdtPatronDictamenCpaDAO ndtPatronDictamenCpaDAO;
	
	@EJB
	private NdtPatronAsociadoDAO ndtPatronAsociadoDAO;

	@Override
	public PatronDictamenTO saveDictamen(PatronDictamenTO dictamen,
			ContadorPublicoAutTO contador) throws DictamenException {

		PatronDictamenTO dictamenResultado = null;
		if (dictamen == null) {
			LOG.error("el dictamen llego nulo");
			throw DictamenExceptionBuilder
					.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_DATOS_PATRONALES_PARAM_NULL);
		}

		try {

			NdtContadorPublicoAutDO ndtContadorPublicoAutDO = TransformerServiceUtils
					.transformer(contador);
			NdtPatronDictamenDO ndtPatronDictamenDO = TransformerServiceUtils
					.transformer(dictamen);
			ndtPatronDictamenDO.setFecRegistroAlta(new Date());			
			NdcEstadoDictamenDO ndcEstadoDictamenDO = new NdcEstadoDictamenDO();
			ndcEstadoDictamenDO.setCveIdEstadoDictamen(EstadoDictamenEnum.EN_PROCESO.getId());
			ndtPatronDictamenDO.setCveIdEstadoDictamen(ndcEstadoDictamenDO);
			// se inserta en patron dictamen
			ndtPatronDictamenDAO.create(ndtPatronDictamenDO);
			ndtPatronDictamenDAO.flush();

			NdtPatronDictamenCpaDO patronDictamenCpaDO = new NdtPatronDictamenCpaDO();
			patronDictamenCpaDO.setCveIdPatronDictamen(ndtPatronDictamenDO);
			patronDictamenCpaDO.setCveIdCpa(ndtContadorPublicoAutDO);
			patronDictamenCpaDO.setFecRegistroAlta(new Date());
			patronDictamenCpaDO.setFecRegistroActualizado(new Date());
			// se inserta en patron dictamen cpa
			ndtPatronDictamenCpaDAO.create(patronDictamenCpaDO);
			dictamenResultado = TransformerServiceUtils
					.transformer(ndtPatronDictamenDO);

		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			throw DictamenExceptionBuilder
					.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_DATOS_PATRONALES_GUARDAR,
							e);
		}

		return dictamenResultado;

	}

	@Override
	public PatronDictamenTO getDictamenByRfcPatronAndIdContador(String rfc,
			Long contador) throws DictamenException {

		PatronDictamenTO dictamenTO = null;
		if (ValidatorUtil.isAnyNull(rfc, contador)) {

		}
		try {
			List<NdtPatronDictamenDO> listaDO = ndtPatronDictamenDAO
					.findByRfcPatronAndIdContador(rfc, contador);

			if (listaDO != null && !listaDO.isEmpty()) {
				dictamenTO = TransformerServiceUtils
						.transformer(listaDO.get(0));
			}

		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			throw DictamenExceptionBuilder
					.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_DATOS_PATRONALES_OBTENER,
							e);
		}

		return dictamenTO;
	}

	@Override
	public PatronDictamenTO updateDictamen(PatronDictamenTO dictamen)
			throws DictamenException {
		
		PatronDictamenTO dictamenResultado = null;
		if (dictamen == null || dictamen.getCveIdPatronDictamen()==null) {
			LOG.error("el dictamen llego nulo");
			throw DictamenExceptionBuilder
					.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_DATOS_PATRONALES_PARAM_NULL);
		}

		try {
			NdtPatronDictamenDO patronBD=new NdtPatronDictamenDO();
			patronBD.setCveIdPatronDictamen(dictamen.getCveIdPatronDictamen());
			LOG.info("el id a buscar es el "+dictamen.getCveIdPatronDictamen());
			patronBD=ndtPatronDictamenDAO.get(patronBD.getCveIdPatronDictamen());
			
			
			NdtPatronDictamenDO patronActualiza = TransformerServiceUtils.transformer(dictamen);
	
			patronBD.setNumNumeroTrabajadores(patronActualiza.getNumNumeroTrabajadores());
			patronBD.setNumRegistroPatronales(patronActualiza.getNumRegistroPatronales());
			patronBD.setCveIdTipoDictamen(patronActualiza.getCveIdTipoDictamen());
			patronBD.setIndPatronConstruccion(patronActualiza.getIndPatronConstruccion());
			patronBD.setIndPatronEmpresaValuada(patronActualiza.getIndPatronEmpresaValuada());
			patronBD.setIndRealizoActConstruccion(patronActualiza.getIndRealizoActConstruccion());
			patronBD.setCveIdEjerFiscal(patronActualiza.getCveIdEjerFiscal());
			patronBD.setCveIdTipoDictamen(patronActualiza.getCveIdTipoDictamen());

			// se inserta en patron dictamen
			ndtPatronDictamenDAO.edit(patronBD);
			
			
			dictamenResultado = TransformerServiceUtils.transformer(patronBD);

		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			throw DictamenExceptionBuilder
					.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_DATOS_PATRONALES_ACTUALIZAR,
							e);
		}

		return dictamenResultado;

	}

	@Override
	public List<PatronAsociadoTO> savePatronesAsociados(List<PatronAsociadoTO> listPatronAsociadoTO)
			throws DictamenException {
		
		List<PatronAsociadoTO> res=new ArrayList<PatronAsociadoTO>();
		try{
			
			for (PatronAsociadoTO patronAsociadoTO : listPatronAsociadoTO) {
				NdtPatronAsociadoDO patronAsociadoDO=TransformerServiceUtils.transformer(patronAsociadoTO);
				patronAsociadoDO.setFecRegistroAlta(new Date());
				patronAsociadoDO.setFecRegistroActualizado(new Date());
				ndtPatronAsociadoDAO.create(patronAsociadoDO);
				
				res.add(TransformerServiceUtils.transformer(patronAsociadoDO));
			}
		
		}catch (Exception e) {
			LOG.error(e.getMessage(), e);
			throw DictamenExceptionBuilder
					.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_PATRON_ASOCIADO_GUARDAR,
							e);
		}
		return res;
	}

	@Override
	public List<PatronAsociadoTO> findPatronesAsociados(PatronDictamenTO patronDictamenTO) throws DictamenException {
		List<PatronAsociadoTO> res=new ArrayList<PatronAsociadoTO>();
		try{
			
			List<NdtPatronAsociadoDO> ndtPatronAsociadoDOs=ndtPatronAsociadoDAO.findByIdPatronDictamen(patronDictamenTO.getCveIdPatronDictamen());
			
			for (NdtPatronAsociadoDO ndtPatronAsociadoDO : ndtPatronAsociadoDOs) {
				res.add(TransformerServiceUtils.transformer(ndtPatronAsociadoDO));
			}
		
		}catch (Exception e) {
			LOG.error(e.getMessage(), e);
			throw DictamenExceptionBuilder
					.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_PATRON_ASOCIADO_GUARDAR,
							e);
		}
		return res;
	}

}
