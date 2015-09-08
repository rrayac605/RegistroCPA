package mx.gob.imss.cit.dictamen.web.pages;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.integration.api.dto.DatosPatronDTO;
import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
@ManagedBean(name = "datosPatronPage")
@ViewScoped
public class DatosPatronPage extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3595076953499269235L;
	
	DatosPatronDTO datosPatron;

	/**
	 * @return the datosPatron
	 */
	public DatosPatronDTO getDatosPatron() {
		return datosPatron;
	}

	/**
	 * @param datosPatron the datosPatron to set
	 */
	public void setDatosPatron(DatosPatronDTO datosPatron) {
		this.datosPatron = datosPatron;
	}
	
	
	
}
