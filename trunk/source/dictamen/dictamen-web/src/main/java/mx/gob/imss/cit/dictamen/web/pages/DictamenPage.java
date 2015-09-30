package mx.gob.imss.cit.dictamen.web.pages;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.integration.api.dto.domain.ContadorPublicoAutDTO;
import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.util.annotations.Reset;
@ManagedBean(name = "dictamenPage")
@ViewScoped
public class DictamenPage extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3785316961858884439L;
	
	@Reset
	private ContadorPublicoAutDTO contadorPublicoAutDTO;
	
	private boolean banderaOcultaTabs;
	
	
	
	

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
