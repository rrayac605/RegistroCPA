package mx.gob.imss.cit.dictamen.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.commons.enums.DictamenExceptionCodeEnum;
import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.domain.AtestiguamientoDictamenTO;
import mx.gob.imss.cit.dictamen.model.NdtAtestiguamientoDictamenDO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtAtestiguamientoDictamenDAO;
import mx.gob.imss.cit.dictamen.services.ExamenService;
import mx.gob.imss.cit.dictamen.services.transformer.TransformerServiceUtils;
import mx.gob.imss.cit.dictamen.services.util.DictamenExceptionBuilder;

@Stateless
public class ExamenServiceImpl implements ExamenService {

	@EJB
	private NdtAtestiguamientoDictamenDAO ndtAtestiguamientoDictamenDAO;
	
	@Override
	public List<AtestiguamientoDictamenTO> findExamenByIdPatronDictamen(Long cveIdPatronDictamen) throws DictamenException {
		List<NdtAtestiguamientoDictamenDO> atestiguamientosDOList = new ArrayList<NdtAtestiguamientoDictamenDO>();
		List<AtestiguamientoDictamenTO> atestiguamientosTOList = new ArrayList<AtestiguamientoDictamenTO>();
		try{	
			atestiguamientosDOList = ndtAtestiguamientoDictamenDAO.findExamenesByIdPatronDictamen(cveIdPatronDictamen);
			for(NdtAtestiguamientoDictamenDO ndtAtestiguamientoDictamenDO: atestiguamientosDOList){
				AtestiguamientoDictamenTO atestiguamientoDictamenTO = new AtestiguamientoDictamenTO();
				atestiguamientoDictamenTO = TransformerServiceUtils.transformer(ndtAtestiguamientoDictamenDO);
				atestiguamientosTOList.add(atestiguamientoDictamenTO);
			}
		}catch(Exception e){
			throw DictamenExceptionBuilder.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_CONSULTA_EXAMENES,e);
		}
				
		return atestiguamientosTOList;
	}

}
