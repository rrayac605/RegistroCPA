package mx.gob.imss.cit.de.dictaminacion.web.pages;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.CedulaPrestacionesDTO;
import mx.gob.imss.cit.de.dictaminacion.web.pages.base.BasePage;
import mx.gob.imss.cit.de.dictaminacion.web.util.annotations.Reset;

@ManagedBean(name = "cedulaPrestacionesPage")
@ViewScoped
public class CedulaPrestacionesPage extends BasePage {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6768483374106093356L;

	@Reset
	private List<CedulaPrestacionesDTO> cedulaPrestacionesList;

	public List<CedulaPrestacionesDTO> getCedulaPrestacionesList() {
		return cedulaPrestacionesList;
	}

	public void setCedulaPrestacionesList(List<CedulaPrestacionesDTO> cedulaPrestacionesList) {
		this.cedulaPrestacionesList = cedulaPrestacionesList;
	}


}