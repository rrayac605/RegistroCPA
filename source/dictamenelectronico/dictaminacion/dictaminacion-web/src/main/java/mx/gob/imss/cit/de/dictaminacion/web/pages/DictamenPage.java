package mx.gob.imss.cit.de.dictaminacion.web.pages;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.ContadorPublicoAutDTO;
import mx.gob.imss.cit.de.dictaminacion.web.pages.base.BasePage;
import mx.gob.imss.cit.de.dictaminacion.web.util.annotations.Reset;
@ManagedBean(name = "dictamenPage")
@SessionScoped
public class DictamenPage extends BasePage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3785316961858884439L;
	
	@Reset
	private ContadorPublicoAutDTO contadorPublicoAutDTO;
	
	private boolean banderaOcultaTabs;
	
	private int indexWizard;
	
	private int indexUltimoWizard;
	

	public int getIndexUltimoWizard() {
		return indexUltimoWizard;
	}

	public void setIndexUltimoWizard(int indexUltimoWizard) {
		this.indexUltimoWizard = indexUltimoWizard;
	}

	public int getIndexWizard() {
		return indexWizard;
	}

	public void setIndexWizard(int indexWizard) {
		this.indexWizard = indexWizard;
	}

	/**
	 * @return the contadorPublicoAutDTO
	 */
	public ContadorPublicoAutDTO getContadorPublicoAutDTO() {
		return contadorPublicoAutDTO;
	}

	/**
	 * @param contadorPublicoAutDTO the contadorPublicoAutDTO to set
	 */
	public void setContadorPublicoAutDTO(ContadorPublicoAutDTO contadorPublicoAutDTO) {
		this.contadorPublicoAutDTO = contadorPublicoAutDTO;
	}


	/**
	 * @return the banderaOcultaTabs
	 */
	public boolean isBanderaOcultaTabs() {
		return banderaOcultaTabs;
	}

	/**
	 * @param banderaOcultaTabs the banderaOcultaTabs to set
	 */
	public void setBanderaOcultaTabs(boolean banderaOcultaTabs) {
		this.banderaOcultaTabs = banderaOcultaTabs;
	}
	
}
