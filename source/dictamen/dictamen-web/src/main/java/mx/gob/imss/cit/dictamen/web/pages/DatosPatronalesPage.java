package mx.gob.imss.cit.dictamen.web.pages;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.integration.api.dto.DatosPatronDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.TipoDictamenDTO;
import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
@ManagedBean(name = "datosPatronalesPage")
@ViewScoped
public class DatosPatronalesPage extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3595076953499269235L;
	
	private DatosPatronDTO datosPatron;
	
	private Integer opcion;
	private Boolean radioTrue= Boolean.TRUE;
	private Boolean radioFalse= Boolean.FALSE;
	private List<TipoDictamenDTO> listaTipoDictamen;

	/**
	 * @return the listaTipoDictamen
	 */
	public List<TipoDictamenDTO> getListaTipoDictamen() {
		return listaTipoDictamen;
	}

	/**
	 * @param listaTipoDictamen the listaTipoDictamen to set
	 */
	public void setListaTipoDictamen(List<TipoDictamenDTO> listaTipoDictamen) {
		this.listaTipoDictamen = listaTipoDictamen;
	}

	/**
	 * @return the datosPatron
	 */
	public DatosPatronDTO getDatosPatron() {
		return datosPatron;
	}

	/**
	 * @return the opcion
	 */
	public Integer getOpcion() {
		return opcion;
	}

	/**
	 * @param opcion the opcion to set
	 */
	public void setOpcion(Integer opcion) {
		this.opcion = opcion;
	}

	/**
	 * @return the radioTrue
	 */
	public Boolean getRadioTrue() {
		return radioTrue;
	}

	/**
	 * @param radioTrue the radioTrue to set
	 */
	public void setRadioTrue(Boolean radioTrue) {
		this.radioTrue = radioTrue;
	}

	/**
	 * @return the radioFalse
	 */
	public Boolean getRadioFalse() {
		return radioFalse;
	}

	/**
	 * @param radioFalse the radioFalse to set
	 */
	public void setRadioFalse(Boolean radioFalse) {
		this.radioFalse = radioFalse;
	}


	/**
	 * @param datosPatron the datosPatron to set
	 */
	public void setDatosPatron(DatosPatronDTO datosPatron) {
		this.datosPatron = datosPatron;
	}
	
	
	
}
