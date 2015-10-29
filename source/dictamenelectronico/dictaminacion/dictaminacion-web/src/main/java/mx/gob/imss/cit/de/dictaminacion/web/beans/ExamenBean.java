package mx.gob.imss.cit.de.dictaminacion.web.beans;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.de.dictaminacion.integration.api.ExamenIntegrator;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.AtestigPreguntasRespuestDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.AtestiguamientoDictamenDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.OpcionPreguntaDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.PreguntaDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.RubroAtestiguamientoDictDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.RubroDTO;
import mx.gob.imss.cit.de.dictaminacion.web.beans.base.BaseBean;
import mx.gob.imss.cit.de.dictaminacion.web.constants.NavigationConstants;
import mx.gob.imss.cit.de.dictaminacion.web.enums.MensajesNotificacionesEnum;
import mx.gob.imss.cit.de.dictaminacion.web.pages.CuestionarioPage;
import mx.gob.imss.cit.de.dictaminacion.web.pages.DatosPatronalesPage;
import mx.gob.imss.cit.de.dictaminacion.web.pages.ExamenPage;
import mx.gob.imss.cit.de.dictaminacion.web.util.CleanBeanUtil;
import mx.gob.imss.cit.de.dictaminacion.web.util.FacesUtils;

@ManagedBean(name = "examenBean")
@ViewScoped
public class ExamenBean extends BaseBean {

	private Logger LOG = Logger.getLogger(ExamenBean.class);

	private static final long serialVersionUID = 8959012133116263535L;
	@EJB
	private ExamenIntegrator examenIntegration;

	@ManagedProperty(value = "#{examenPage}")
	private ExamenPage examenPage;

	@ManagedProperty(value = "#{cuestinarioPage}")
	private CuestionarioPage cuestinarioPage;

	@ManagedProperty(value = "#{datosPatronalesPage}")
	private DatosPatronalesPage datosPatronalesPage;

	@ManagedProperty(value = "#{datosPatronalesBean}")
	private DatosPatronalesBean datosPatronalesBean;

	public String init(AtestiguamientoDictamenDTO atestiguamientoDictamenDTO) {
		CleanBeanUtil.cleanFields(examenPage);
		examenPage.setAtestiguamientoDictamenDTOSeleccionado(atestiguamientoDictamenDTO);
		try {
			examenPage.setAtestiguamientoDictamenDTOSeleccionado(
					examenIntegration.getDetalleExamenByAtestiguamiento(atestiguamientoDictamenDTO));
		} catch (Exception e) {
			FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_OBTENER_DET_EXAMEN.getCode());
		}
		return "";
	}

	public String regresar() {
		datosPatronalesBean.initExamen();
		return NavigationConstants.PAGE_EXAMEN_REGRESAR;
	}

	public void guardar() {
		AtestiguamientoDictamenDTO atestiguamientoDictamenDTO = examenPage.getAtestiguamientoDictamenDTOSeleccionado();
		atestiguamientoDictamenDTO = convertirRubros(atestiguamientoDictamenDTO);
		try {
			examenIntegration.saveExamenAtestiguamiento(atestiguamientoDictamenDTO);

			FacesUtils.messageSuccess(MensajesNotificacionesEnum.MSG_EXITO_GUARDAR_EL_ATESTIGUAMIENTO.getCode(),
					atestiguamientoDictamenDTO.getCveIdAtestiguamiento().getDesAtestiguamiento());
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_GUARDAR_EL_ATESTIGUAMIENTO.getCode());
		}
	}

	private AtestiguamientoDictamenDTO convertirRubros(AtestiguamientoDictamenDTO atestiguamientoDictamenDTO) {
		if (atestiguamientoDictamenDTO.getNdtRubrosAtestiguamiento().isEmpty()) {
			guardaNuevo(atestiguamientoDictamenDTO);
		} else {
			guardaExistente(atestiguamientoDictamenDTO);
		}
		return atestiguamientoDictamenDTO;
	}

	private void guardaExistente(AtestiguamientoDictamenDTO atestiguamientoDictamenDTO) {
		List <RubroAtestiguamientoDictDTO> rubroAtestiguamientoDictDTOList = new ArrayList <RubroAtestiguamientoDictDTO>();
		for (RubroDTO rubro : atestiguamientoDictamenDTO.getCveIdAtestiguamiento().getNdcRubros()) {
			for (RubroAtestiguamientoDictDTO rubroAtestiguamientoDictDTO : rubro.getNdtRubrosAtestiguamientoDict()) {
				rubroAtestiguamientoDictDTO.setCveIdRubro(rubro);
				rubroAtestiguamientoDictDTO.setCveIdAtestigDictamen(atestiguamientoDictamenDTO);
				rubroAtestiguamientoDictDTO.setIndAplica((short) (rubro.getIndAplica() == false ?  0 : 1));
				List<AtestigPreguntasRespuestDTO> atestigPreguntasRespuestDTOList = new ArrayList<AtestigPreguntasRespuestDTO>();
				for (AtestigPreguntasRespuestDTO atestigPreguntasRespuestDTO : rubroAtestiguamientoDictDTO.getNdtAtestigPreguntasRespuesta()) {
					for (PreguntaDTO preguntaDTO : rubro.getNdcPreguntas()) {
						for (OpcionPreguntaDTO opcionPreguntaDTO : preguntaDTO.getNdcOpcionesPregunta()) {
							for (AtestigPreguntasRespuestDTO atestigPreguntasRespuestDTO1 : opcionPreguntaDTO.getNdtAtestigPreguntasRespuestas()) {
								if (atestigPreguntasRespuestDTO.getCveIdAtestiguamientos().equals(atestigPreguntasRespuestDTO1.getCveIdAtestiguamientos())) {
									atestigPreguntasRespuestDTO.setCveIdAtestiguamientos(atestigPreguntasRespuestDTO.getCveIdAtestiguamientos());
									for (OpcionPreguntaDTO opcionPreguntaDTO2 : preguntaDTO.getNdcOpcionesPregunta()) {
										if (opcionPreguntaDTO2.getCveIdRespuesta().getCveIdRespuesta().equals(preguntaDTO.getOpcionSeleccionada())) {
											atestigPreguntasRespuestDTO.setCveIdOpcionPregunta(opcionPreguntaDTO2);
											atestigPreguntasRespuestDTO.setCveIdRubroAtestigDictamen(rubroAtestiguamientoDictDTO);
											atestigPreguntasRespuestDTO.setDesObservaciones(preguntaDTO.getObservaciones());
											atestigPreguntasRespuestDTOList.add(atestigPreguntasRespuestDTO);
										}
									}
								}
							}
						}
					}
				}
				rubroAtestiguamientoDictDTO.setNdtAtestigPreguntasRespuesta(atestigPreguntasRespuestDTOList);
				rubroAtestiguamientoDictDTOList.add(rubroAtestiguamientoDictDTO);
			}
			atestiguamientoDictamenDTO.setNdtRubrosAtestiguamiento(rubroAtestiguamientoDictDTOList);
		}

	}

	private void guardaNuevo(AtestiguamientoDictamenDTO atestiguamientoDictamenDTO) {
		List<RubroAtestiguamientoDictDTO> rubroAtestiguamientoDictDTOList = new ArrayList<RubroAtestiguamientoDictDTO>();
		for (RubroDTO rubro : atestiguamientoDictamenDTO.getCveIdAtestiguamiento().getNdcRubros()) {
			List<AtestigPreguntasRespuestDTO> atestigPreguntasRespuestDTOList = new ArrayList<AtestigPreguntasRespuestDTO>();
			RubroAtestiguamientoDictDTO rubroAtestiguamientoDictDTO = new RubroAtestiguamientoDictDTO();
			rubroAtestiguamientoDictDTO.setCveIdAtestigDictamen(atestiguamientoDictamenDTO);
			rubroAtestiguamientoDictDTO.setCveIdRubro(rubro);
			rubroAtestiguamientoDictDTO.setIndAplica((short) (rubro.getIndAplica() == false ?  0 : 1));
			for (PreguntaDTO preguntaDTO : rubro.getNdcPreguntas()) {
				for (OpcionPreguntaDTO opcionPreguntaDTO : preguntaDTO.getNdcOpcionesPregunta()) {
					if (opcionPreguntaDTO.getCveIdRespuesta().getCveIdRespuesta()
							.equals(preguntaDTO.getOpcionSeleccionada())) {
						AtestigPreguntasRespuestDTO atestigPreguntasRespuestDTO = new AtestigPreguntasRespuestDTO();
						atestigPreguntasRespuestDTO.setCveIdOpcionPregunta(opcionPreguntaDTO);
						atestigPreguntasRespuestDTO.setCveIdRubroAtestigDictamen(rubroAtestiguamientoDictDTO);
						atestigPreguntasRespuestDTO.setDesObservaciones(preguntaDTO.getObservaciones());
						atestigPreguntasRespuestDTOList.add(atestigPreguntasRespuestDTO);
					}
				}
				rubroAtestiguamientoDictDTO.setNdtAtestigPreguntasRespuesta(atestigPreguntasRespuestDTOList);
			}
			rubroAtestiguamientoDictDTOList.add(rubroAtestiguamientoDictDTO);
		}
		atestiguamientoDictamenDTO.setNdtRubrosAtestiguamiento(rubroAtestiguamientoDictDTOList);
	}
	
	public void preguntaVisible(RubroDTO rubro){
		Boolean preguntaVisible =rubro.getHabilitaRubro();
		for(PreguntaDTO pregunta: rubro.getNdcPreguntas()){
			if (preguntaVisible==null || !preguntaVisible){
				pregunta.setHabilitaPregunta(false);
			}else{
				pregunta.setHabilitaPregunta(true);
			}
		}
		
	}
	
	public void observacionVisible(PreguntaDTO pregunta){
		Long opcionSelecionada = pregunta.getOpcionSeleccionada();
		
			if (!opcionSelecionada.equals(2l) || opcionSelecionada==null ) {
				pregunta.setHabilitaObservacion(false);
			} else {
				pregunta.setHabilitaObservacion(true);
			}
		
	}
	
	public ExamenPage getExamenPage() {
		return examenPage;
	}

	public void setExamenPage(ExamenPage examenPage) {
		this.examenPage = examenPage;
	}

	public DatosPatronalesPage getDatosPatronalesPage() {
		return datosPatronalesPage;
	}

	public void setDatosPatronalesPage(DatosPatronalesPage datosPatronalesPage) {
		this.datosPatronalesPage = datosPatronalesPage;
	}
	
	public CuestionarioPage getCuestinarioPage() {
		return cuestinarioPage;
	}

	public void setCuestinarioPage(CuestionarioPage cuestinarioPage) {
		this.cuestinarioPage = cuestinarioPage;
	}

	public void setDatosPatronalesBean(DatosPatronalesBean datosPatronalesBean) {
		this.datosPatronalesBean = datosPatronalesBean;
	}

}
