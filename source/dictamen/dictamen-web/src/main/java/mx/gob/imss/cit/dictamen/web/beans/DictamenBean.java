package mx.gob.imss.cit.dictamen.web.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.pages.DictamenPage;

@ManagedBean(name = "dictamenBean")
@ViewScoped
public class DictamenBean extends BaseBean {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -614637897623862471L;
	
	
	@ManagedProperty(value = "#{datosPatronalesBean}")
	private DatosPatronalesBean datosPatronalesBean;
	
	@ManagedProperty(value = "#{dictamenPage}")
	private DictamenPage dictamenPage;

	@ManagedProperty(value = "#{cargaArchivosBean}")
	private CargaArchivosBean cargaArchivosBean;
	
	
	
	public String init(){
		datosPatronalesBean.init(778L);
		cargaArchivosBean.init("2015","MASC870401GQ8","EEAC900408B17");
		return null;
	}



	/**
	 * @param datosPatronalesBean the datosPatronalesBean to set
	 */
	public void setDatosPatronalesBean(DatosPatronalesBean datosPatronalesBean) {
		this.datosPatronalesBean = datosPatronalesBean;
	}



	/**
	 * @param dictamenPage the dictamenPage to set
	 */
	public void setDictamenPage(DictamenPage dictamenPage) {
		this.dictamenPage = dictamenPage;
	}



	/**
	 * @param cargaArchivosBean the cargaArchivosBean to set
	 */
	public void setCargaArchivosBean(CargaArchivosBean cargaArchivosBean) {
		this.cargaArchivosBean = cargaArchivosBean;
	}
	

	
	
	
	
}
