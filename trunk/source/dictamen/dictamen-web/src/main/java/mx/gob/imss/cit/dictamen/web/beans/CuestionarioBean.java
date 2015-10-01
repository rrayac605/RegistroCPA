package mx.gob.imss.cit.dictamen.web.beans;


import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.dictamen.integration.api.ExamenIntegrator;
import mx.gob.imss.cit.dictamen.integration.api.dto.ExamenDTO;
import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.constants.NavigationConstants;
import mx.gob.imss.cit.dictamen.web.enums.MensajesNotificacionesEnum;
import mx.gob.imss.cit.dictamen.web.pages.CuestionarioPage;
import mx.gob.imss.cit.dictamen.web.util.CleanBeanUtil;
import mx.gob.imss.cit.dictamen.web.util.FacesUtils;

@ManagedBean(name = "cuestionarioBean")
@ViewScoped
public class CuestionarioBean extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4837421797087101L;
	private static final Logger LOGGER = Logger.getLogger(CuestionarioBean.class);
	
	@EJB
	private ExamenIntegrator examenIntegrator;
	
	@ManagedProperty(value = "#{cuestionarioPage}")
	private CuestionarioPage  cuestionarioPage;
	
	@ManagedProperty(value = "#{examenBean}")
	private ExamenBean  examenBean;
	
	
	public String init() {
		CleanBeanUtil.cleanFields(cuestionarioPage);
		try {
			cuestionarioPage.setExamenes(examenIntegrator.findExamenesByIdPatronDictamen(63L));
		} catch (Exception e) {
			FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_OBTENER_EXAMENES.getCode());
		}
		return "";
	}
	
	
	public String editar(ExamenDTO examen){
		LOGGER.info("+++++++++++++++++++++++++++++++++++++++++++++editar CuestionarioBeann+++++++++++++++++++++++++++++++++++++++++++++"+examen.getNombre());
		examenBean.init(examen);		
		return NavigationConstants.PAGE_EXAMEN;
	}
	
	public String borrar(ExamenDTO examen){
		return "";
	}

	
	
	/**
	 * @return the cuestionarioPage
	 */
	public CuestionarioPage getCuestionarioPage() {
		return cuestionarioPage;
	}


	/**
	 * @param cuestionarioPage the cuestionarioPage to set
	 */
	public void setCuestionarioPage(CuestionarioPage cuestionarioPage) {
		this.cuestionarioPage = cuestionarioPage;
	}


	/**
	 * @param examenBean the examenBean to set
	 */
	public void setExamenBean(ExamenBean examenBean) {
		this.examenBean = examenBean;
	}

	
}
