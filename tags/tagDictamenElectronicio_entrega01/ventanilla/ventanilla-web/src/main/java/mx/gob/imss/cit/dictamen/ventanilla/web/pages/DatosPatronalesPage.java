package mx.gob.imss.cit.dictamen.ventanilla.web.pages;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;




import mx.gob.imss.cit.dictamen.ventanilla.web.util.annotations.Reset;
@ManagedBean(name = "datosPatronalesPage")
@SessionScoped
public class DatosPatronalesPage  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3595076953499269235L;
	
	@Reset
	private String datosPatron;
	@Reset
	private List<String> listaTipoDictamen;
	@Reset
	private List<String> listaEjercicioFiscal;
	
	@Reset
	private Boolean habilitarEmpresaValuada;
	

	
	public Boolean getHabilitarEmpresaValuada() {
		return habilitarEmpresaValuada;
	}

	public void setHabilitarEmpresaValuada(Boolean habilitarEmpresaValuada) {
		this.habilitarEmpresaValuada = habilitarEmpresaValuada;
	}


	/**
	 * @return the listaTipoDictamen
	 */
	public List<String> getListaTipoDictamen() {
		return listaTipoDictamen;
	}

	/**
	 * @param listaTipoDictamen the listaTipoDictamen to set
	 */
	public void setListaTipoDictamen(List<String> listaTipoDictamen) {
		this.listaTipoDictamen = listaTipoDictamen;
	}

	/**
	 * @return the datosPatron
	 */
	public String getDatosPatron() {
		return datosPatron;
	}

	/**
	 * @param datosPatron the datosPatron to set
	 */
	public void setDatosPatron(String datosPatron) {
		this.datosPatron = datosPatron;
	}

	/**
	 * @return the listaEjercicioFiscal
	 */
	public List<String> getListaEjercicioFiscal() {
		return listaEjercicioFiscal;
	}

	/**
	 * @param listaEjercicioFiscal the listaEjercicioFiscal to set
	 */
	public void setListaEjercicioFiscal(
			List<String> listaEjercicioFiscal) {
		this.listaEjercicioFiscal = listaEjercicioFiscal;
	}



	
	
	
}
