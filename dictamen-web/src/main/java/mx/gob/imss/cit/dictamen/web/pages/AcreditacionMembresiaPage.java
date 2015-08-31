package mx.gob.imss.cit.dictamen.web.pages;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mx.gob.imss.cit.dictamen.web.pages.base.BasePage;

import org.primefaces.model.UploadedFile;

@ManagedBean(name = "acreditacionMembresiaPage")
@SessionScoped
public class AcreditacionMembresiaPage extends BasePage{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private UploadedFile file;

	/**
	 * @return the file
	 */
	public UploadedFile getFile() {
		return file;
	}

	/**
	 * @param file the file to set
	 */
	public void setFile(UploadedFile file) {
		this.file = file;
	}
}