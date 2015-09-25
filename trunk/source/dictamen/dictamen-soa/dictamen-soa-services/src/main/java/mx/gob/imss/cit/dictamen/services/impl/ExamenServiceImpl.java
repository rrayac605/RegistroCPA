package mx.gob.imss.cit.dictamen.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.commons.enums.DictamenExceptionCodeEnum;
import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.domain.AtestiguamientoTO;
import mx.gob.imss.cit.dictamen.model.NdcAtestiguamientoDO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdcAtestiguamientoDAO;
import mx.gob.imss.cit.dictamen.services.ExamenService;
import mx.gob.imss.cit.dictamen.services.transformer.TransformerServiceUtils;
import mx.gob.imss.cit.dictamen.services.util.DictamenExceptionBuilder;

@Stateless
public class ExamenServiceImpl implements ExamenService {

	@EJB
	private NdcAtestiguamientoDAO ndcAtestiguamientoDAO;
	
	@Override
	public List<AtestiguamientoTO> findExamenByIdPatronDictamen(Long cveIdPatronDictamen) throws DictamenException {
		List <AtestiguamientoTO> atestiguamientosTO = new ArrayList<AtestiguamientoTO>();
		List <NdcAtestiguamientoDO> atestiguamientosDO = new ArrayList<NdcAtestiguamientoDO>();

		try{	
			
		
						
		}catch(Exception e){
			throw DictamenExceptionBuilder.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_CONSULTA_EXAMENES,e);
		}
				
		return atestiguamientosTO;
	}

}
