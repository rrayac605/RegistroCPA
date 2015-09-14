package mx.gob.imss.cit.dictamen.web.beans;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.integration.api.ExamenIntegration;
import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.pages.ExamenPage;
import mx.gob.imss.cit.dictamen.web.util.CleanBeanUtil;

@ManagedBean(name = "examenBean")
@ViewScoped
public class ExamenBean extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8959012133116263535L;

	@EJB
	private ExamenIntegration examenIntegration;
	
	@ManagedProperty(value = "#{examenPage}")
	private ExamenPage  examenPage;
	
	public 	String init() {
		CleanBeanUtil.cleanFields(examenPage);
		examenPage.setExamenes(examenIntegration.findExamen());
		return "";
	}

	public ExamenPage getExamenPage() {
		return examenPage;
	}

	public void setExamenPage(ExamenPage examenPage) {
		this.examenPage = examenPage;
	}
	
	
}
