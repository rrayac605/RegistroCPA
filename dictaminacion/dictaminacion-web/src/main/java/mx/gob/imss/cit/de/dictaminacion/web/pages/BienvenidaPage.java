package mx.gob.imss.cit.de.dictaminacion.web.pages;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mx.gob.imss.cit.de.dictaminacion.web.pages.base.BasePage;

@ManagedBean(name = "bienvenidaPage")
@SessionScoped
public class BienvenidaPage extends BasePage{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private List<String> images;
	
	@PostConstruct
	public void init() {
		images = new ArrayList<String>();

		images.add("IMSS_Banner_001.jpg");
		images.add("IMSS_Banner_002.jpg");
		images.add("IMSS_Banner_003.jpg");
		
	}

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}
}