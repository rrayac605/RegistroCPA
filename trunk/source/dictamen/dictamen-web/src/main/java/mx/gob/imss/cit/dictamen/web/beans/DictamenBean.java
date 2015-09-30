package mx.gob.imss.cit.dictamen.web.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.integration.api.dto.domain.ContadorPublicoAutDTO;
import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.pages.DictamenPage;

@ManagedBean(name = "dictamenBean")
@ViewScoped
public class DictamenBean extends BaseBean {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -614637897623862471L;

	@ManagedProperty(value = "#{dictamenPage}")
	private DictamenPage dictamenPage;
	
	@ManagedProperty(value = "#{datosPatronalesBean}")
	private DatosPatronalesBean datosPatronalesBean;

	@ManagedProperty(value = "#{cargaArchivosBean}")
	private CargaArchivosBean cargaArchivosBean;

	
	public String init(){
		
		
		dictamenPage.setContadorPublicoAutDTO(new ContadorPublicoAutDTO());
		dictamenPage.getContadorPublicoAutDTO().setCveIdCpa(778L);
		dictamenPage.getContadorPublicoAutDTO().setRfc("GATS4812123D7");

		datosPatronalesBean.init();		
		cargaArchivosBean.init();
		
		dictamenPage.setBanderaOcultaTabs(true);
		return "";
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
	 * @return the cargaArchivosBean
	 */
	public CargaArchivosBean getCargaArchivosBean() {
		return cargaArchivosBean;
	}



	/**
	 * @param cargaArchivosBean the cargaArchivosBean to set
	 */
	public void setCargaArchivosBean(CargaArchivosBean cargaArchivosBean) {
		this.cargaArchivosBean = cargaArchivosBean;
	}



	/**
	 * @return the dictamenPage
	 */
	public DictamenPage getDictamenPage() {
		return dictamenPage;
	}



	/**
	 * @return the datosPatronalesBean
	 */
	public DatosPatronalesBean getDatosPatronalesBean() {
		return datosPatronalesBean;
	}


	
	
}
