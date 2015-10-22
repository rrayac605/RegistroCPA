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
		return NavigationConstants.PAGE_EXAMEN_REGRESAR;
	}

	public void guardar() {
		AtestiguamientoDictamenDTO atestiguamientoDictamenDTO = examenPage.getAtestiguamientoDictamenDTOSeleccionado();
		atestiguamientoDictamenDTO = convertirRubros(atestiguamientoDictamenDTO);
		try {
			examenIntegration.saveExamenAtestiguamiento(atestiguamientoDictamenDTO);
			
			FacesUtils.messageSuccess(MensajesNotificacionesEnum.MSG_EXITO_GUARDAR_EL_ATESTIGUAMIENTO.getCode(),atestiguamientoDictamenDTO.getCveIdAtestiguamiento().getDesAtestiguamiento());
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_GUARDAR_EL_ATESTIGUAMIENTO.getCode());
		}
	}

	private AtestiguamientoDictamenDTO convertirRubros(AtestiguamientoDictamenDTO atestiguamientoDictamenDTO) {
		if (atestiguamientoDictamenDTO.getNdtRubrosAtestiguamiento().size() == 0) {
			System.out.println(
					"+++++++++++++++++++++++++++++++++++++++++++++++++++++Inicio Guardar++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("Patron Atestiguamiento: "
					+ atestiguamientoDictamenDTO.getCveIdPatronDictamen().getCveIdPatronDictamen());
			System.out.println("Estado Atetsiguamiento: "
					+ atestiguamientoDictamenDTO.getCveIdEstadoAtestiguamiento().getDesEstadoAtestiguamiento());
			System.out.println("Atetsiguamiento id : "
					+ atestiguamientoDictamenDTO.getCveIdAtestiguamiento().getCveIdAtestiguamiento());
			System.out.println("Atetsiguamiento  : "
					+ atestiguamientoDictamenDTO.getCveIdAtestiguamiento().getDesAtestiguamiento());
			List<RubroAtestiguamientoDictDTO> rubroAtestiguamientoDictDTOList = new ArrayList<RubroAtestiguamientoDictDTO>();
			for (RubroDTO rubro : atestiguamientoDictamenDTO.getCveIdAtestiguamiento().getNdcRubros()) {
				System.out.println("Rubro id : " + rubro.getCveIdRubro());
				System.out.println("Rubro  : " + rubro.getDesRubro());
				List<AtestigPreguntasRespuestDTO> atestigPreguntasRespuestDTOList = new ArrayList<AtestigPreguntasRespuestDTO>();
				RubroAtestiguamientoDictDTO rubroAtestiguamientoDictDTO = new RubroAtestiguamientoDictDTO();
				rubroAtestiguamientoDictDTO.setCveIdAtestigDictamen(atestiguamientoDictamenDTO);
				rubroAtestiguamientoDictDTO.setCveIdRubro(rubro);
				for (PreguntaDTO preguntaDTO : rubro.getNdcPreguntas()) {
					System.out.println("Pregunta id : " + preguntaDTO.getCveIdPregunta());
					System.out.println("pregunta  : " + preguntaDTO.getDesPregunta());
					for (OpcionPreguntaDTO opcionPreguntaDTO : preguntaDTO.getNdcOpcionesPregunta()) {
						System.out
								.println("Respuesta id : " + opcionPreguntaDTO.getCveIdRespuesta().getCveIdRespuesta());
						System.out
								.println("Respuesta  : " + opcionPreguntaDTO.getCveIdRespuesta().getDesTipoRespuesta());
						if (opcionPreguntaDTO.getCveIdRespuesta().getCveIdRespuesta()
								.equals(preguntaDTO.getOpcionSeleccionada())) {
							System.out.println("Opcion Seleccionada: " + preguntaDTO.getOpcionSeleccionada());
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
		} else {
			System.out.println(
					"+++++++++++++++++++++++++++++++++++++++++++++++++++++Inicio Guardar existente++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("Patron Atestiguamiento: "
					+ atestiguamientoDictamenDTO.getCveIdPatronDictamen().getCveIdPatronDictamen());
			System.out.println("Estado Atetsiguamiento: "
					+ atestiguamientoDictamenDTO.getCveIdEstadoAtestiguamiento().getDesEstadoAtestiguamiento());
			System.out.println("Atetsiguamiento id : "
					+ atestiguamientoDictamenDTO.getCveIdAtestiguamiento().getCveIdAtestiguamiento());
			System.out.println("Atetsiguamiento  : "
					+ atestiguamientoDictamenDTO.getCveIdAtestiguamiento().getDesAtestiguamiento());
			List <RubroAtestiguamientoDictDTO> rubroAtestiguamientoDictDTOList = new ArrayList <RubroAtestiguamientoDictDTO>();
			for (RubroDTO rubro : atestiguamientoDictamenDTO.getCveIdAtestiguamiento().getNdcRubros()) {
				System.out.println("Rubro id : " + rubro.getCveIdRubro());
				System.out.println("Rubro  : " + rubro.getDesRubro());
				RubroAtestiguamientoDictDTO rubroAtestiguamientoDictDTO1 = new RubroAtestiguamientoDictDTO();
				for (RubroAtestiguamientoDictDTO rubroAtestiguamientoDictDTO : rubro.getNdtRubrosAtestiguamientoDict()) {
					rubroAtestiguamientoDictDTO1 = rubroAtestiguamientoDictDTO;
					rubroAtestiguamientoDictDTO1.setCveIdRubro(rubro);
					rubroAtestiguamientoDictDTO1.setCveIdAtestigDictamen(atestiguamientoDictamenDTO);
					List<AtestigPreguntasRespuestDTO> atestigPreguntasRespuestDTOList = new ArrayList<AtestigPreguntasRespuestDTO>();
					System.out.println("Rubro Atestiguamiento id : " + rubroAtestiguamientoDictDTO.getCveIdRubroAtestigDictamen());
					for (AtestigPreguntasRespuestDTO atestigPreguntasRespuestDTO : rubroAtestiguamientoDictDTO.getNdtAtestigPreguntasRespuesta()) {
						Boolean salta= false;
						for (PreguntaDTO preguntaDTO : rubro.getNdcPreguntas()) {
							System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++Pregunta+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" );
							System.out.println("Pregunta id : " + preguntaDTO.getCveIdPregunta());
							System.out.println("pregunta  : " + preguntaDTO.getDesPregunta());
							System.out.println("Clave atestiguamientos principal: "+atestigPreguntasRespuestDTO.getCveIdAtestiguamientos());
							for (OpcionPreguntaDTO opcionPreguntaDTO : preguntaDTO.getNdcOpcionesPregunta()) {
								AtestigPreguntasRespuestDTO atestigPreguntasRespuestDTO2 = new AtestigPreguntasRespuestDTO();
								for (AtestigPreguntasRespuestDTO atestigPreguntasRespuestDTO1 : opcionPreguntaDTO.getNdtAtestigPreguntasRespuestas()) {
									System.out.println("+++++++++++++++++++++++respuestasLista+++++++++++++++++++++++++" );
									System.out.println("Clave atestiguamientos Secundario: "+atestigPreguntasRespuestDTO1.getCveIdAtestiguamientos());
								
									if (atestigPreguntasRespuestDTO.getCveIdAtestiguamientos().equals(atestigPreguntasRespuestDTO1.getCveIdAtestiguamientos())) {
										atestigPreguntasRespuestDTO2.setCveIdAtestiguamientos(atestigPreguntasRespuestDTO.getCveIdAtestiguamientos());
										atestigPreguntasRespuestDTO = null;
										for (OpcionPreguntaDTO opcionPreguntaDTO2 : preguntaDTO.getNdcOpcionesPregunta()) {
											System.out.println("+++++++++++++++++++++++OpcionPregunta+++++++++++++++++++++++++" );
											if (opcionPreguntaDTO2.getCveIdRespuesta().getCveIdRespuesta().equals(preguntaDTO.getOpcionSeleccionada()) && !salta ) {
												atestigPreguntasRespuestDTO2.setCveIdOpcionPregunta(opcionPreguntaDTO2);
												atestigPreguntasRespuestDTO2.setCveIdRubroAtestigDictamen(rubroAtestiguamientoDictDTO);
												atestigPreguntasRespuestDTO2.setDesObservaciones(preguntaDTO.getObservaciones());
												atestigPreguntasRespuestDTOList.add(atestigPreguntasRespuestDTO2);
												System.out.println("clave id atestiguamientos: "+ atestigPreguntasRespuestDTO2.getCveIdAtestiguamientos());
												System.out.println("clave id rubro atestiguamiento: "+ atestigPreguntasRespuestDTO2.getCveIdRubroAtestigDictamen().getCveIdRubroAtestigDictamen());
												System.out.println("clave id opcion pregunta: "+ atestigPreguntasRespuestDTO2.getCveIdOpcionPregunta().getCveIdOpcionPregunta());
												System.out.println("Opcion Seleccionada: " + preguntaDTO.getOpcionSeleccionada());
												System.out.println("Respuesta id : "+ opcionPreguntaDTO2.getCveIdRespuesta().getCveIdRespuesta());
												System.out.println("Respuesta  : "+ opcionPreguntaDTO2.getCveIdRespuesta().getDesTipoRespuesta());
												salta = true;
											}
											if(salta)
												break;
										}
									}
									if(salta)
										break;
								}
								if(salta)
									break;
							}
							if(salta)
								break;
						}
						System.out.println("++++++++++++++++++++++++++++++++++++++++FinPregunta++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" );
					}
					System.out.println(" lista tamanio guardar: "+ atestigPreguntasRespuestDTOList.size());
					rubroAtestiguamientoDictDTO = null;
					rubroAtestiguamientoDictDTO1.setNdtAtestigPreguntasRespuesta(atestigPreguntasRespuestDTOList);
				}
				rubroAtestiguamientoDictDTOList.add(rubroAtestiguamientoDictDTO1);
				atestiguamientoDictamenDTO.setNdtRubrosAtestiguamiento(rubroAtestiguamientoDictDTOList);
			}
		}
		System.out.println(
				"+++++++++++++++++++++++++++++++++++++++++++++++++++++Fin Guardar++++++++++++++++++++++++++++++++++++++++++++++++++");
		return atestiguamientoDictamenDTO;
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

}
