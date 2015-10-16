package mx.gob.imss.cit.dictamen.web.beans;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.dictamen.integration.api.ExamenIntegrator;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.AtestigPreguntasRespuestDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.AtestiguamientoDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.AtestiguamientoDictamenDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.OpcionPreguntaDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.PreguntaDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.RubroAtestiguamientoDictDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.RubroDTO;
import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.constants.NavigationConstants;
import mx.gob.imss.cit.dictamen.web.enums.MensajesNotificacionesEnum;
import mx.gob.imss.cit.dictamen.web.pages.CuestionarioPage;
import mx.gob.imss.cit.dictamen.web.pages.DatosPatronalesPage;
import mx.gob.imss.cit.dictamen.web.pages.ExamenPage;
import mx.gob.imss.cit.dictamen.web.util.CleanBeanUtil;
import mx.gob.imss.cit.dictamen.web.util.FacesUtils;


@ManagedBean(name = "examenBean")
@ViewScoped
public class ExamenBean extends BaseBean {
	

	private Logger LOG=Logger.getLogger(ExamenBean.class) ;

	private static final long serialVersionUID = 8959012133116263535L;
	@EJB
	private ExamenIntegrator examenIntegration;
	
	@ManagedProperty(value = "#{examenPage}")
	private ExamenPage  examenPage;
	
	@ManagedProperty(value = "#{cuestinarioPage}")
	private CuestionarioPage  cuestinarioPage;
	
	@ManagedProperty(value = "#{datosPatronalesPage}")
	private DatosPatronalesPage datosPatronalesPage;
	
	
	public	String init(AtestiguamientoDictamenDTO examenDTO) {
		CleanBeanUtil.cleanFields(examenPage);
		examenPage.setAtestiguamientoDictamenDTOSeleccionado(examenDTO);
		try {
			examenPage.setAtestiguamientoDTO(examenIntegration.getDetalleExamenByAtestiguamiento(examenDTO.getCveIdEstadoAtestiguamiento().getCveIdEstadoAtestiguamiento(),
					examenDTO.getCveIdAtestiguamiento().getCveIdAtestiguamiento()));
		} catch (Exception e) {
			FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_OBTENER_DET_EXAMEN.getCode());
		}
		return "";
	}

	public String regresar(){	
		return NavigationConstants.PAGE_EXAMEN_REGRESAR;
	}
	
	public void guardar(){	
		AtestiguamientoDictamenDTO atestiguamientoDictamenDTO = examenPage.getAtestiguamientoDictamenDTOSeleccionado();
		System.out.println("Rubro TAMANIO: "+atestiguamientoDictamenDTO.getCveIdAtestiguamiento().getNdcRubros().size());
		atestiguamientoDictamenDTO = convertirRubros(examenPage.getAtestiguamientoDTO(), atestiguamientoDictamenDTO);
		System.out.println("Rubro Atestiguamiento TAMANIO: "+atestiguamientoDictamenDTO.getNdtRubrosAtestiguamiento().size());
		try {
			examenIntegration.saveExamenAtestiguamiento(atestiguamientoDictamenDTO);
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_GUARDAR_EL_ATESTIGUAMIENTO.getCode());
		}
	}

	private AtestiguamientoDictamenDTO convertirRubros(AtestiguamientoDTO atestiguamientoDTO, AtestiguamientoDictamenDTO atestiguamientoDictamenDTO) {
		if( atestiguamientoDictamenDTO.getNdtRubrosAtestiguamiento().size() == 0){
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++aqui++++++++++++++++++++++++++++++++++++++++++++++++++");
			List<RubroAtestiguamientoDictDTO> rubroAtestiguamientoDictDTOList = new ArrayList<RubroAtestiguamientoDictDTO>();
			System.out.println("Inicio for rubro");
			for(RubroDTO rubro: atestiguamientoDTO.getNdcRubros()){
				RubroAtestiguamientoDictDTO rubroAtestiguamientoDictDTO = new RubroAtestiguamientoDictDTO();
				rubroAtestiguamientoDictDTO.setCveIdAtestigDictamen(atestiguamientoDictamenDTO);
				rubroAtestiguamientoDictDTO.setCveIdRubro(rubro);
				System.out.println("Rubro id: "+rubroAtestiguamientoDictDTO.getCveIdRubro().getCveIdRubro());
				System.out.println("Inicio for pregunta");
				for(PreguntaDTO preguntaDTO: rubro.getNdcPreguntas()){
					List<AtestigPreguntasRespuestDTO> atestigPreguntasRespuestDTOList = new ArrayList<AtestigPreguntasRespuestDTO>();
					System.out.println("Pregunta id: "+preguntaDTO.getCveIdPregunta());
					System.out.println("Inicio for opcion pregunta");
					for(OpcionPreguntaDTO opcionPreguntaDTO: preguntaDTO.getNdcOpcionesPregunta() ){
						System.out.println("Inicio if comparativo respuesta");
						if (opcionPreguntaDTO.getCveIdRespuesta().getCveIdRespuesta().equals(preguntaDTO.getOpcionSeleccionada())){
							System.out.println("Respuesta seleccionada id: "+preguntaDTO.getOpcionSeleccionada());
							System.out.println("Respuesta id: "+opcionPreguntaDTO.getCveIdRespuesta().getCveIdRespuesta());
							AtestigPreguntasRespuestDTO atestigPreguntasRespuestDTO = new AtestigPreguntasRespuestDTO();
							atestigPreguntasRespuestDTO.setCveIdOpcionPregunta(opcionPreguntaDTO);
							atestigPreguntasRespuestDTO.setCveIdRubroAtestigDictamen(rubroAtestiguamientoDictDTO);
							atestigPreguntasRespuestDTO.setDesObservaciones(preguntaDTO.getObservaciones());
							atestigPreguntasRespuestDTOList.add(atestigPreguntasRespuestDTO);
						}
						System.out.println("Fin if comparativo respuesta");
					}
					rubroAtestiguamientoDictDTO.setNdtAtestigPreguntasRespuesta(atestigPreguntasRespuestDTOList);
					System.out.println("Fin for opcion pregunta");
				}
				System.out.println("Fin for  pregunta");
				rubroAtestiguamientoDictDTOList.add(rubroAtestiguamientoDictDTO);
			}
			System.out.println("Fin for rubro");
			atestiguamientoDictamenDTO.setNdtRubrosAtestiguamiento(rubroAtestiguamientoDictDTOList);
		}else{
			
		}
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
