package mx.gob.imss.cit.dictamen.contador.web.pages;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;






import mx.gob.imss.cit.dictamen.contador.integration.api.dto.FirmaElectronicaDTO;
import mx.gob.imss.cit.dictamen.contador.web.util.annotations.Reset;


/**
 * Clase bean para la firma electronica
 * @author ajfuentes
 *
 */
@ManagedBean(name = "firmaElectronicaPage")
@SessionScoped
public class FirmaElectronicaPage implements Serializable{

	/**
	 * UID
	 */
	private static final long serialVersionUID = 1L;
	
	@Reset
	private FirmaElectronicaDTO firmaElectronicaDTO;
	
	@Reset
	private boolean mostrarDialogFirma =true;
	

	/**
	 * @return the firmaElectronicaDTO
	 */
	public FirmaElectronicaDTO getFirmaElectronicaDTO() {
		return firmaElectronicaDTO;
	}

	/**
	 * @param firmaElectronicaDTO the firmaElectronicaDTO to set
	 */
	public void setFirmaElectronicaDTO(FirmaElectronicaDTO firmaElectronicaDTO) {
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