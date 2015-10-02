package mx.gob.imss.cit.dictamen.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.commons.enums.DictamenExceptionCodeEnum;
import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.domain.AtestiguamientoDictamenTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.AtestiguamientoTO;
import mx.gob.imss.cit.dictamen.model.NdcAtestiguamientoDO;
import mx.gob.imss.cit.dictamen.model.NdtAtestiguamientoDictamenDO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdcAtestiguamientoDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtAtestiguamientoDictamenDAO;
import mx.gob.imss.cit.dictamen.services.ExamenService;
import mx.gob.imss.cit.dictamen.services.transformer.TransformerServiceUtils;
import mx.gob.imss.cit.dictamen.services.util.DictamenExceptionBuilder;

@Stateless
public class ExamenServiceImpl implements ExamenService {

	@EJB
	private NdtAtestiguamientoDictamenDAO ndtAtestiguamientoDictamenDAO;
	@EJB
	private NdcAtestiguamientoDAO ndcAtestiguamientoDAO;
	
	@Override
	public List<AtestiguamientoDictamenTO> findExamenByIdPatronDictamen(Long cveIdPatronDictamen) throws DictamenException {
		List<AtestiguamientoDictamenTO> atestiguamientosTOList = new ArrayList<AtestiguamientoDictamenTO>();
		try{	
			List<NdtAtestiguamientoDictamenDO> atestiguamientosDOList = ndtAtestiguamientoDictamenDAO.findExamenesByIdPatronDictamen(cveIdPatronDictamen);

			for(NdtAtestiguamientoDictamenDO ndtAtestiguamientoDictamenDO: atestiguamientosDOList){
				AtestiguamientoDictamenTO atestiguamientoDictamenTO = TransformerServiceUtils.transformer(ndtAtestiguamientoDictamenDO);
				atestiguamientosTOList.add(atestiguamientoDictamenTO);
			}
		}catch(Exception e){
			throw DictamenExceptionBuilder.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_CONSULTA_CUESTIONARIOS,e);
		}
				
		return atestiguamientosTOList;
	}

	@Override
	public AtestiguamientoTO getDetalleExamenByAtestiguamiento(Long cveIdAtestiguamiento)
			throws DictamenException {
		AtestiguamientoTO atestiguamientonTO = new AtestiguamientoTO();
		try {
			NdcAtestiguamientoDO ndcAtestiguamientoDO = ndcAtestiguamientoDAO.get(cveIdAtestiguamiento);
			atestiguamientonTO = TransformerServiceUtils.transformer(ndcAtestiguamientoDO);
		} catch (Exception e) {
			throw DictamenExceptionBuilder.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_CONSULTA_EXAMENES,e);
		}
		return atestiguamientonTO   ;
	}

}