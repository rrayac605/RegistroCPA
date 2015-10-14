package mx.gob.imss.cit.dictamen.web.pages;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.model.UploadedFile;

import mx.gob.imss.cit.dictamen.web.pages.base.BasePage;
@ManagedBean(name = "cargaRegistroPatronalPage")
@SessionScoped
public class CargaRegistroPatronalPage extends BasePage {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4268387060742221657L;
		
	private UploadedFile file;

	public UploadedFile getFile() {
		return file;
	}

	public void setFile(UploadedFile file) {
		this.file = file;
	}


	
}
