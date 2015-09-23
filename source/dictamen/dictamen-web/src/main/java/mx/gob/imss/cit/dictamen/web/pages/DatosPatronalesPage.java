package mx.gob.imss.cit.dictamen.web.pages;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.integration.api.dto.domain.EjercicioFiscalDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.PatronDictamenDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.TipoDictamenDTO;
import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.util.annotations.Reset;
@ManagedBean(name = "datosPatronalesPage")
@ViewScoped
public class DatosPatronalesPage extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3595076953499269235L;
	
	@Reset
	private PatronDictamenDTO datosPatron;
	@Reset
	private List<TipoDictamenDTO> listaTipoDictamen;
	@Reset
	private List<EjercicioFiscalDTO> listaEjercicioFiscal;

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
	public PatronDictamenDTO getDatosPatron() {
		return datosPatron;
	}

	/**
	 * @param datosPatron the datosPatron to set
	 */
	public void setDatosPatron(PatronDictamenDTO datosPatron) {
		this.datosPatron = datosPatron;
	}

	/**
	 * @return the listaEjercicioFiscal
	 */
	public List<EjercicioFiscalDTO> getListaEjercicioFiscal() {
		return listaEjercicioFiscal;
	}

	/**
	 * @param listaEjercicioFiscal the listaEjercicioFiscal to set
	 */
	public void setListaEjercicioFiscal(
			List<EjercicioFiscalDTO> listaEjercicioFiscal) {
		this.listaEjercicioFiscal = listaEjercicioFiscal;
	}
	
	
	
}
