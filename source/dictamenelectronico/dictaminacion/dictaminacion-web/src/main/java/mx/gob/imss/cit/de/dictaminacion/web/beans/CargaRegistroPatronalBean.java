package mx.gob.imss.cit.de.dictaminacion.web.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;
import org.primefaces.event.FileUploadEvent;

import mx.gob.imss.cit.de.dictaminacion.web.beans.base.BaseBean;
import mx.gob.imss.cit.de.dictaminacion.web.pages.CargaRegistroPatronalPage;

@ManagedBean(name = "cargaRegistroPatronalBean")
@ViewScoped
public class CargaRegistroPatronalBean extends BaseBean {

	private static final long serialVersionUID = 2825687007915597308L;
	
	private Logger LOG=Logger.getLogger(CargaRegistroPatronalBean.class) ;

	@ManagedProperty(value = "#{cargaRegistroPatronalPage}")
	private CargaRegistroPatronalPage cargaRegistroPatronalPage;

	


	public void init(){
	
	}
	
	 public void upload(FileUploadEvent event) {
		 byte[] archivoBytes=null;
		 cargaRegistroPatronalPage.setFile(event.getFile());
          archivoBytes=cargaRegistroPatronalPage.getFile().getContents();

	        
	        
	    }

	
	public CargaRegistroPatronalPage getCargaRegistroPatronalPage() {
		return cargaRegistroPatronalPage;
	}


	public void setCargaRegistroPatronalPage(CargaRegistroPatronalPage cargaRegistroPatronalPage) {
		this.cargaRegistroPatronalPage = cargaRegistroPatronalPage;
	}



}
