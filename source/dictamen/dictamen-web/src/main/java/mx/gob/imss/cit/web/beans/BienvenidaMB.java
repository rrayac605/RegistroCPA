package mx.gob.imss.cit.web.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "inicioMB")
@ViewScoped
public class BienvenidaMB {

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
}