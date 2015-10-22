package mx.gob.imss.cit.de.dictaminacion.services.impl;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import mx.gob.imss.cit.de.dictaminacion.commons.enums.DictamenExceptionCodeEnum;
import mx.gob.imss.cit.de.dictaminacion.commons.enums.EstadoAtestiguamientoEnum;
import mx.gob.imss.cit.de.dictaminacion.commons.exception.DictamenException;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.AtestiguamientoDictamenTO;
import mx.gob.imss.cit.de.dictaminacion.model.NdcEstadoAtestiguamientoDO;
import mx.gob.imss.cit.de.dictaminacion.model.NdtAtestigPreguntasRespuestDO;
import mx.gob.imss.cit.de.dictaminacion.model.NdtAtestiguamientoDictamenDO;
import mx.gob.imss.cit.de.dictaminacion.model.NdtRubroAtestiguamientoDictDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdcAtestiguamientoDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdtAtestigPreguntasRespuestDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdtAtestiguamientoDictamenDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdtRubroAtestiguamientoDictDAO;
import mx.gob.imss.cit.de.dictaminacion.services.ExamenService;
import mx.gob.imss.cit.de.dictaminacion.services.transformer.TransformerServiceUtils;
import mx.gob.imss.cit.de.dictaminacion.services.util.DictamenExceptionBuilder;

@Stateless
public class ExamenServiceImpl implements ExamenService {

	@EJB
	private NdtAtestiguamientoDictamenDAO ndtAtestiguamientoDictamenDAO;
	@EJB
	private NdcAtestiguamientoDAO ndcAtestiguamientoDAO;
	@EJB
	private NdtRubroAtestiguamientoDictDAO ndtRubroAtestiguamientoDictDAO;
	@EJB
	private NdtAtestigPreguntasRespuestDAO ndtAtestigPreguntasRespuestDAO;
	
	
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
	public AtestiguamientoDictamenTO getDetalleExamenByAtestiguamiento(AtestiguamientoDictamenTO atestiguamientoDictamenTO)
			throws DictamenException {
		try {
			NdtAtestiguamientoDictamenDO ndtAtestiguamientoDictamenDO = TransformerServiceUtils.transformer(atestiguamientoDictamenTO);
			ndtAtestiguamientoDictamenDO = ndtAtestiguamientoDictamenDAO.getDetalleExamenByAtestiguamiento(ndtAtestiguamientoDictamenDO);
			atestiguamientoDictamenTO = TransformerServiceUtils.transformer(ndtAtestiguamientoDictamenDO);
		} catch (Exception e) {
			throw DictamenExceptionBuilder.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_CONSULTA_EXAMENES,e);
		}
		return atestiguamientoDictamenTO;
	}

	@Override
	public void saveExamenAtestiguamiento(AtestiguamientoDictamenTO atestiguamientoDictamenTO) 
			throws DictamenException {
		Date fecha = new Date();
		Date fechaFinal = new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		try {
			fechaFinal = sdf.parse(sdf.format(fecha));
			NdcEstadoAtestiguamientoDO ndcEstadoAtestiguamientoDO = new NdcEstadoAtestiguamientoDO();
			ndcEstadoAtestiguamientoDO.setCveIdEstadoAtestiguamiento(EstadoAtestiguamientoEnum.VALIDADO.getId());
			NdtAtestiguamientoDictamenDO atestiguamientoDictamenDO = TransformerServiceUtils.transformer(atestiguamientoDictamenTO);
			atestiguamientoDictamenDO.setCveIdEstadoAtestiguamiento(ndcEstadoAtestiguamientoDO);
			atestiguamientoDictamenDO.setFecRegistroActualizado(fechaFinal);
			for(NdtRubroAtestiguamientoDictDO ndtRubroAtestiguamientoDictDO: atestiguamientoDictamenDO.getNdtRubrosAtestiguamiento()){
				ndtRubroAtestiguamientoDictDO.setCveIdAtestigDictamen(atestiguamientoDictamenDO);
				ndtRubroAtestiguamientoDictDO.setFecRegistroAlta(fechaFinal);
				ndtRubroAtestiguamientoDictDO.setFecRegistroActualizado(fechaFinal);
				for(NdtAtestigPreguntasRespuestDO ndtAtestigPreguntasRespuestDO:  ndtRubroAtestiguamientoDictDO.getNdtAtestigPreguntasRespuesta()){
					ndtAtestigPreguntasRespuestDO.setCveIdRubroAtestigDictamen(ndtRubroAtestiguamientoDictDO);
					ndtAtestigPreguntasRespuestDO.setFecRegistroAlta(fechaFinal);
					ndtAtestigPreguntasRespuestDO.setFecRegistroActualizado(fechaFinal);
				}
			}
			ndtAtestiguamientoDictamenDAO.edit(atestiguamientoDictamenDO);
			ndtAtestiguamientoDictamenDAO.flush();
		} catch (Exception e) {
			System.out.println("error al guardar"+e);
			throw DictamenExceptionBuilder.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_GUARDAR_EXAMEN_ATESTIGUAMIENTO,e);			
		}	
		
	}

}
