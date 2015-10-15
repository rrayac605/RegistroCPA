package mx.gob.imss.cit.dictamen.services.impl;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.commons.enums.DictamenExceptionCodeEnum;
import mx.gob.imss.cit.dictamen.commons.enums.EstadoAtestiguamientoEnum;
import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.domain.AtestiguamientoDictamenTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.AtestiguamientoTO;
import mx.gob.imss.cit.dictamen.model.NdcAtestiguamientoDO;
import mx.gob.imss.cit.dictamen.model.NdcEstadoAtestiguamientoDO;
import mx.gob.imss.cit.dictamen.model.NdtAtestigPreguntasRespuestDO;
import mx.gob.imss.cit.dictamen.model.NdtAtestiguamientoDictamenDO;
import mx.gob.imss.cit.dictamen.model.NdtRubroAtestiguamientoDictDO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdcAtestiguamientoDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtAtestigPreguntasRespuestDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtAtestiguamientoDictamenDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtRubroAtestiguamientoDictDAO;
import mx.gob.imss.cit.dictamen.services.ExamenService;
import mx.gob.imss.cit.dictamen.services.transformer.TransformerServiceUtils;
import mx.gob.imss.cit.dictamen.services.util.DictamenExceptionBuilder;

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
	public AtestiguamientoTO getDetalleExamenByAtestiguamiento(Long cveIdEstadoAtestiguamiento, Long cveIdAtestiguamiento)
			throws DictamenException {
		AtestiguamientoTO atestiguamientoTO = new AtestiguamientoTO();
		try {
			NdcAtestiguamientoDO ndcAtestiguamientoDO = ndtAtestiguamientoDictamenDAO.getDetalleExamenByAtestiguamiento(cveIdEstadoAtestiguamiento, cveIdAtestiguamiento);
			atestiguamientoTO = TransformerServiceUtils.transformer(ndcAtestiguamientoDO);
		} catch (Exception e) {
			throw DictamenExceptionBuilder.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_CONSULTA_EXAMENES,e);
		}
		return atestiguamientoTO;
	}

	@Override
	public void saveExamenAtestiguamiento(AtestiguamientoDictamenTO atestiguamientoDictamenTO) 
			throws DictamenException {
		Date fecha = new Date();
		Date fechaFinal = new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		System.out.println("Service TO \n atestiguamiento Dictamen:" + atestiguamientoDictamenTO.getCveIdAtestigDictamen()+
				" patron ditactamen: "+atestiguamientoDictamenTO.getCveIdPatronDictamen().getCveIdPatronDictamen()+
				" tamanio: "+atestiguamientoDictamenTO.getNdtRubrosAtestiguamiento().size());
		try {
			fechaFinal = sdf.parse(sdf.format(fecha));
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			NdcEstadoAtestiguamientoDO ndcEstadoAtestiguamientoDO = new NdcEstadoAtestiguamientoDO();
			ndcEstadoAtestiguamientoDO.setCveIdEstadoAtestiguamiento(EstadoAtestiguamientoEnum.VALIDADO.getId());
			NdtAtestiguamientoDictamenDO atestiguamientoDictamenDO = TransformerServiceUtils.transformer(atestiguamientoDictamenTO);
			System.out.println("Service DO\n atestiguamiento Dictamen:" + atestiguamientoDictamenDO.getCveIdAtestigDictamen()+
					" patron ditactamen: "+atestiguamientoDictamenDO.getCveIdPatronDictamen().getCveIdPatronDictamen()+
					" tamanio: "+atestiguamientoDictamenDO.getNdtRubrosAtestiguamiento().size());
			
			atestiguamientoDictamenDO.setCveIdEstadoAtestiguamiento(ndcEstadoAtestiguamientoDO);
			atestiguamientoDictamenDO.setFecRegistroActualizado(fechaFinal);
		
			System.out.println("lista rubro dictamen: "+atestiguamientoDictamenDO.getNdtRubrosAtestiguamiento());
			System.out.println("tamanio lista rubro dictamen: "+atestiguamientoDictamenDO.getNdtRubrosAtestiguamiento().size());
			for(NdtRubroAtestiguamientoDictDO ndtRubroAtestiguamientoDictDO: atestiguamientoDictamenDO.getNdtRubrosAtestiguamiento()){
				System.out.println("clave Atestiguamiento Dictamen "+ndtRubroAtestiguamientoDictDO.getCveIdAtestigDictamen().getCveIdAtestigDictamen());
				System.out.println("clave rubros atestiguamiento "+ndtRubroAtestiguamientoDictDO.getCveIdAtestigDictamen().getNdtRubrosAtestiguamiento());
				System.out.println("lista rubros "+ndtRubroAtestiguamientoDictDO.getNdtAtestigPreguntasRespuesta());
				ndtRubroAtestiguamientoDictDO.setCveIdAtestigDictamen(atestiguamientoDictamenDO);
				ndtRubroAtestiguamientoDictDO.setFecRegistroAlta(fechaFinal);
				ndtRubroAtestiguamientoDictDO.setFecRegistroActualizado(fechaFinal);
				System.out.println("lista respuestas: "+ndtRubroAtestiguamientoDictDO.getNdtAtestigPreguntasRespuesta());
				System.out.println("tamanio lista respuestas: "+ndtRubroAtestiguamientoDictDO.getNdtAtestigPreguntasRespuesta().size());
				for(NdtAtestigPreguntasRespuestDO ndtAtestigPreguntasRespuestDO:  ndtRubroAtestiguamientoDictDO.getNdtAtestigPreguntasRespuesta()){
					System.out.println("clave atestiguamiento dentro de segundo for: "+ndtAtestigPreguntasRespuestDO.getCveIdAtestiguamientos());
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
