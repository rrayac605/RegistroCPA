package mx.gob.imss.cit.dictamen.contador.web.pages;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



import mx.gob.imss.cit.dictamen.contador.web.util.annotations.Reset;


/**
 * Clase bean para la firma electronica
 * @author ajfuentes
 *
 */
@ManagedBean(name = "firmaElectronicaPage")
@SessionScoped
public class FirmaElectronicaPage {

	/**
	 * UID
	 */
	private static final long serialVersionUID = 1L;
	
	@Reset
	private String firmaElectronicaDTO;
	
	@Reset
	private boolean mostrarDialogFirma;
	

	/**
	 * @return the firmaElectronicaDTO
	 */
	public String getFirmaElectronicaDTO() {
		return firmaElectronicaDTO;
	}

	/**
	 * @param firmaElectronicaDTO the firmaElectronicaDTO to set
	 */
	public void setFirmaElectronicaDTO(String firmaElectronicaDTO) {
		this.firmaElectronicaDTO = firmaElectronicaDTO;
	}

	/**
	 * @return the mostrarDialogFirma
	 */
	public boolean isMostrarDialogFirma() {
		return mostrarDialogFirma;
	}

	/**
	 * @param mostrarDialogFirma the mostrarDialogFirma to set
	 */
	public void setMostrarDialogFirma(boolean mostrarDialogFirma) {
		this.mostrarDialogFirma = mostrarDialogFirma;
	}

	
}