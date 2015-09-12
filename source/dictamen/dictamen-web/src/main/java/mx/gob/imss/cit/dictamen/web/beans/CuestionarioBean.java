package mx.gob.imss.cit.dictamen.web.beans;


import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.integration.api.CuestionarioIntegrator;
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
	private CuestionarioIntegrator cuestionarioIntegration;
	
	@ManagedProperty(value = "#{cuestionarioPage}")
	private CuestionarioPage  cuestionarioPage;
	
	
	public String init() {
		CleanBeanUtil.cleanFields(cuestionarioPage);
		cuestionarioPage.setCuestionarios(cuestionarioIntegration.findCuestionarios());
		return "";
	}
	
	
	public void editar(CuestionarioDTO cuestionario){}
	
	
	public void borrar(CuestionarioDTO cuestionario){}

	
	
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

	
}
