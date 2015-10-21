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
			System.out.println(
					"++++++++++++++++++++++++++++++++++++++++++++++++++++++Inicio contenido examen+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("Patron Atestiguamiento: "
					+ atestiguamientoDictamenDTO.getCveIdPatronDictamen().getCveIdPatronDictamen());
			System.out.println("Estado Atetsiguamiento: "
					+ atestiguamientoDictamenDTO.getCveIdEstadoAtestiguamiento().getDesEstadoAtestiguamiento());
			System.out.println("Atetsiguamiento id : "
					+ atestiguamientoDictamenDTO.getCveIdAtestiguamiento().getCveIdAtestiguamiento());
			System.out.println("Atetsiguamiento  : "
					+ atestiguamientoDictamenDTO.getCveIdAtestiguamiento().getDesAtestiguamiento());
			for (RubroDTO rubro : atestiguamientoDictamenDTO.getCveIdAtestiguamiento().getNdcRubros()) {
				System.out.println("Rubro id : " + rubro.getCveIdRubro());
				System.out.println("Rubro  : " + rubro.getDesRubro());
				for (PreguntaDTO pregunta : rubro.getNdcPreguntas()) {
					System.out.println("Pregunta id : " + pregunta.getCveIdPregunta());
					System.out.println("pregunta  : " + pregunta.getDesPregunta());
					for (OpcionPreguntaDTO opcionPregunta : pregunta.getNdcOpcionesPregunta()) {
						System.out.println("Respuesta id : " + opcionPregunta.getCveIdRespuesta().getCveIdRespuesta());
						System.out.println("Respuesta  : " + opcionPregunta.getCveIdRespuesta().getDesTipoRespuesta());
					}
				}
			}
			System.out.println(
					"++++++++++++++++++++++++++++++++++++++++++++++++++++++Fin Prueba examen+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			if (atestiguamientoDictamenDTO.getCveIdEstadoAtestiguamiento().getCveIdEstadoAtestiguamiento()==2l) {
				System.out.println(
						"++++++++++++++++++++++++++++++++++++++++++++++++++++++Inicio Prueba respuesta y Observaciones+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				System.out.println("Atestiguamiento id : " + atestiguamientoDictamenDTO.getCveIdAtestiguamiento().getCveIdAtestiguamiento());
				System.out.println("Atestiguamiento : " + atestiguamientoDictamenDTO.getCveIdAtestiguamiento().getDesAtestiguamiento());
				for (RubroDTO rubro : atestiguamientoDictamenDTO.getCveIdAtestiguamiento().getNdcRubros()) {
					System.out.println("Rubro id : " + rubro.getCveIdRubro());
					System.out.println("Rubro  : " + rubro.getDesRubro());
					for (PreguntaDTO pregunta : rubro.getNdcPreguntas()) {
						System.out.println("Pregunta id : " + pregunta.getCveIdPregunta());
						System.out.println("pregunta  : " + pregunta.getDesPregunta());
						for (OpcionPreguntaDTO opcionPreguntaDTO : pregunta.getNdcOpcionesPregunta()) {
							System.out.println("Opcion Pregunta id : " + opcionPreguntaDTO.getCveIdOpcionPregunta());
							for (AtestigPreguntasRespuestDTO atestigPreguntasRespuestDTO : opcionPreguntaDTO
									.getNdtAtestigPreguntasRespuestas()) {
								System.out.println("clave id Atestiguamientos  : " +atestigPreguntasRespuestDTO.getCveIdAtestiguamientos());
									System.out.println("Opcion respuesta: "
											+ opcionPreguntaDTO.getCveIdRespuesta().getCveIdRespuesta());
									pregunta.setOpcionSeleccionada(
											opcionPreguntaDTO.getCveIdRespuesta().getCveIdRespuesta());
									pregunta.setObservaciones(atestigPreguntasRespuestDTO.getDesObservaciones());
							}
						}
					}
				}
				System.out.println(
						"++++++++++++++++++++++++++++++++++++++++++++++++++++++Fin Prueba respuesta y Observaciones+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
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
