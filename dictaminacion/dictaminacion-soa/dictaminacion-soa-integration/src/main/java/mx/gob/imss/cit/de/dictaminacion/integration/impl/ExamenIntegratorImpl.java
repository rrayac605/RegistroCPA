package mx.gob.imss.cit.de.dictaminacion.integration.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.AtestiguamientoDictamenTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.ExamenIntegrator;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.AtestigPreguntasRespuestDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.AtestiguamientoDictamenDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.OpcionPreguntaDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.PreguntaDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.RubroAtestiguamientoDictDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.RubroDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.exception.DictamenNegocioException;
import mx.gob.imss.cit.de.dictaminacion.integration.transformer.TransformerIntegrationUtils;
import mx.gob.imss.cit.de.dictaminacion.services.ExamenService;

@Stateless
@Remote(mx.gob.imss.cit.de.dictaminacion.integration.api.ExamenIntegrator.class)
public class ExamenIntegratorImpl implements ExamenIntegrator {

	private Logger LOG = Logger.getLogger(ExamenIntegratorImpl.class);

	@EJB
	private ExamenService examenService;

	@Override
	public AtestiguamientoDictamenDTO getDetalleExamenByAtestiguamiento(
			AtestiguamientoDictamenDTO atestiguamientoDictamenDTO) throws DictamenNegocioException {
		try {
			AtestiguamientoDictamenTO atestiguamientoDictamenTO = TransformerIntegrationUtils
					.transformer(atestiguamientoDictamenDTO);
			atestiguamientoDictamenTO = examenService.getDetalleExamenByAtestiguamiento(atestiguamientoDictamenTO);
			atestiguamientoDictamenDTO = TransformerIntegrationUtils.transformer(atestiguamientoDictamenTO);		
			if (atestiguamientoDictamenDTO.getCveIdEstadoAtestiguamiento().getCveIdEstadoAtestiguamiento()==2l) {
				for (RubroDTO rubro : atestiguamientoDictamenDTO.getCveIdAtestiguamiento().getNdcRubros()) {
					for (PreguntaDTO pregunta : rubro.getNdcPreguntas()) {
						for (OpcionPreguntaDTO opcionPreguntaDTO : pregunta.getNdcOpcionesPregunta()) {
							for (AtestigPreguntasRespuestDTO atestigPreguntasRespuestDTO : opcionPreguntaDTO.getNdtAtestigPreguntasRespuestas()) {
								for (RubroAtestiguamientoDictDTO rubroAtestiguamientoDictDTO : rubro.getNdtRubrosAtestiguamientoDict()) {
									Boolean r = rubroAtestiguamientoDictDTO.getIndAplica()== null||rubroAtestiguamientoDictDTO.getIndAplica() ==0;
									rubro.setHabilitaRubro((r  ? false: true));
									for(AtestigPreguntasRespuestDTO atestigPreguntasRespuestDTO1 : rubroAtestiguamientoDictDTO.getNdtAtestigPreguntasRespuesta()){
										if(atestigPreguntasRespuestDTO1.getCveIdAtestiguamientos().equals(atestigPreguntasRespuestDTO.getCveIdAtestiguamientos())){
											pregunta.setOpcionSeleccionada( opcionPreguntaDTO.getCveIdRespuesta().getCveIdRespuesta());
											pregunta.setObservaciones(atestigPreguntasRespuestDTO.getDesObservaciones());
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			throw new DictamenNegocioException(e.getMessage(), e);
		}
		return atestiguamientoDictamenDTO;
	}

	@Override
	public List<AtestiguamientoDictamenDTO> findExamenesByIdPatronDictamen(Long cveIdPatronDictamen)
			throws DictamenNegocioException {
		List<AtestiguamientoDictamenDTO> atestiguamientoDictamenDTOList = new ArrayList<AtestiguamientoDictamenDTO>();
		List<AtestiguamientoDictamenTO> atestiguamientoDictamenTOList = new ArrayList<AtestiguamientoDictamenTO>();
		try {
			atestiguamientoDictamenTOList = examenService.findExamenByIdPatronDictamen(cveIdPatronDictamen);
			for (AtestiguamientoDictamenTO atestiguamientoDictamenTO : atestiguamientoDictamenTOList) {
				AtestiguamientoDictamenDTO atestiguamientoDictamenDTO = new AtestiguamientoDictamenDTO();
				atestiguamientoDictamenDTO = TransformerIntegrationUtils.transformer(atestiguamientoDictamenTO);
				atestiguamientoDictamenDTOList.add(atestiguamientoDictamenDTO);
			}
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			throw new DictamenNegocioException(e.getMessage(), e);
		}

		return atestiguamientoDictamenDTOList;
	}

	@Override
	public void saveExamenAtestiguamiento(AtestiguamientoDictamenDTO atestiguamientoDictamenDTO)
			throws DictamenNegocioException {
		try {
			AtestiguamientoDictamenTO atestiguamientoDictamenTO = TransformerIntegrationUtils
					.transformer(atestiguamientoDictamenDTO);
			examenService.saveExamenAtestiguamiento(atestiguamientoDictamenTO);
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			throw new DictamenNegocioException(e.getMessage(), e);
		}
	}

}
