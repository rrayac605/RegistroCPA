package mx.gob.imss.cit.dictamen.contador.web.pages;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;



import mx.gob.imss.cit.dictamen.contador.web.util.annotations.Reset;
@ManagedBean(name = "dictamenPage")
@ViewScoped
public class SolicitudPage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3785316961858884439L;
	
	@Reset
	private String contadorPublicoAutDTO;
	
	public String getContadorPublicoAutDTO() {
		return contadorPublicoAutDTO;
	}

	public void setContadorPublicoAutDTO(String contadorPublicoAutDTO) {
		this.contadorPublicoAutDTO = contadorPublicoAutDTO;
	}

	private boolean banderaOcultaTabs;
	
	
	
	


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
