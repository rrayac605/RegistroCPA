package mx.gob.imss.cit.de.dictaminacion.web.pages;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.CedulaRemuneracionesDTO;
import mx.gob.imss.cit.de.dictaminacion.web.pages.base.BasePage;
import mx.gob.imss.cit.de.dictaminacion.web.util.annotations.Reset;

@ManagedBean(name = "cedulaRemuneracionesPage")
@SessionScoped
public class CedulaRemuneracionesPage extends BasePage{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6512390247897055893L;

	private CedulaRemuneracionesDTO cedulaRemuneracionesDTO;
	
	@Reset
	private List<CedulaRemuneracionesDTO> cedulasDTO;
	
	
	public CedulaRemuneracionesDTO getCedulaRemuneracionesDTO() {
		return cedulaRemuneracionesDTO;
	}

	public void setCedulaRemuneracionesDTO(
			CedulaRemuneracionesDTO cedulaRemuneracionesDTO) {
		this.cedulaRemuneracionesDTO = cedulaRemuneracionesDTO;
	}

	public List<CedulaRemuneracionesDTO> getCedulasDTO() {
		return cedulasDTO;
	}

	public void setCedulasDTO(List<CedulaRemuneracionesDTO> cedulasDTO) {
		this.cedulasDTO = cedulasDTO;
	}
	
	
}
