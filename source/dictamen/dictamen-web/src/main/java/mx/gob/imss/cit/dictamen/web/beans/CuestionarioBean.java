package mx.gob.imss.cit.dictamen.web.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.integration.api.CuestionarioIntegration;
import mx.gob.imss.cit.dictamen.integration.api.dto.CuestionarioDTO;
import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.pages.CuestionarioPage;
import mx.gob.imss.cit.dictamen.web.util.CleanBeanUtil;

@ManagedBean(name = "cuestionarioBean")
@ViewScoped
public class CuestionarioBean extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4837421797087101L;
	@EJB
	private CuestionarioIntegration cuestionarioIntegration;
	
	@ManagedProperty(value = "#{cuestionarioPage}")
	private CuestionarioPage  cuestionarioPage;
	
	
	public String init() {
		CleanBeanUtil.cleanFields(cuestionarioPage);
		cuestionarioPage.setCuestionarios(cuestionarioIntegration.findCuestionarios());
		return "";
	}

	
	
	/**
	 * @return the cuestionarioPage
	 */
	public CuestionarioPage getcuestionarioPage() {
		return cuestionarioPage;
	}


	/**
	 * @param cuestionarioPage the cuestionarioPage to set
	 */
	public void setcuestionarioPage(CuestionarioPage cuestionarioPage) {
		this.cuestionarioPage = cuestionarioPage;
	}

	
	
}
