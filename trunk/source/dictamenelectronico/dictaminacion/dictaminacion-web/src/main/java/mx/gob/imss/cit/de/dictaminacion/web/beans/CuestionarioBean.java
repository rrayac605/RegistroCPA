package mx.gob.imss.cit.de.dictaminacion.web.beans;


import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.de.dictaminacion.integration.api.ExamenIntegrator;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.AtestiguamientoDictamenDTO;
import mx.gob.imss.cit.de.dictaminacion.web.beans.base.BaseBean;
import mx.gob.imss.cit.de.dictaminacion.web.constants.NavigationConstants;
import mx.gob.imss.cit.de.dictaminacion.web.enums.MensajesNotificacionesEnum;
import mx.gob.imss.cit.de.dictaminacion.web.pages.CuestionarioPage;
import mx.gob.imss.cit.de.dictaminacion.web.pages.DatosPatronalesPage;
import mx.gob.imss.cit.de.dictaminacion.web.pages.DictamenPage;
import mx.gob.imss.cit.de.dictaminacion.web.util.CleanBeanUtil;
import mx.gob.imss.cit.de.dictaminacion.web.util.FacesUtils;

@ManagedBean(name = "cuestionarioBean")
@ViewScoped
public class CuestionarioBean extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4837421797087101L;
	
	@EJB
	private ExamenIntegrator examenIntegrator;
	
	@ManagedProperty(value = "#{cuestionarioPage}")
	private CuestionarioPage  cuestionarioPage;
	
	@ManagedProperty(value = "#{examenBean}")
	private ExamenBean  examenBean;
	
	@ManagedProperty(value = "#{datosPatronalesPage}")
	private DatosPatronalesPage  datosPatronalesPage;
	
	
	@ManagedProperty(value = "#{dictamenPage}")
	private DictamenPage  dictamenPage;
	
	
	public String init() {
		CleanBeanUtil.cleanFields(cuestionarioPage);
		try {
			cuestionarioPage.setExamenes(examenIntegrator.findExamenesByIdPatronDictamen(datosPatronalesPage.getDatosPatron().getCveIdPatronDictamen()));
		} catch (Exception e) {
			FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_OBTENER_EXAMENES.getCode());
		}
		return "";
	}
	
	
	public String editar(AtestiguamientoDictamenDTO atestiguamientoDictamenDTO){
		examenBean.init(atestiguamientoDictamenDTO);	
		return NavigationConstants.PAGE_EXAMEN;
	}
	
	public String borrar(AtestiguamientoDictamenDTO atestiguamientoDictamenDTO){
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


	public DatosPatronalesPage getDatosPatronalesPage() {
		return datosPatronalesPage;
	}


	public void setDatosPatronalesPage(DatosPatronalesPage datosPatronalesPage) {
		this.datosPatronalesPage = datosPatronalesPage;
	}


	public DictamenPage getDictamenPage() {
		return dictamenPage;
	}


	public void setDictamenPage(DictamenPage dictamenPage) {
		this.dictamenPage = dictamenPage;
	}
	
}
