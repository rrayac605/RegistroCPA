package mx.gob.imss.cit.dictamen.contador.web.pages;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mx.gob.imss.cit.dictamen.contador.integration.api.dto.CatalogoDTO;
import mx.gob.imss.cit.dictamen.contador.web.util.SolicitudRegistroUtil;

@ManagedBean(name = "registroDespachoPage")
@SessionScoped
public class RegistroDespachoPage implements Serializable {

	private static final long serialVersionUID = 2882338386217466639L;

	private List<String> opciones;
	private String opcionSeleccionada;
	private boolean despachoEncontrado;
	private boolean trabajadores;
	private List<CatalogoDTO> cargos;
	private CatalogoDTO cargoSeleccionado;
	
	public RegistroDespachoPage(){
		opciones = SolicitudRegistroUtil.llenarOpcionesDespacho();
	}

	/**
	 * @return the opciones
	 */
	public List<String> getOpciones() {
		return opciones;
	}

	/**
	 * @param opciones
	 *            the opciones to set
	 */
	public void setOpciones(List<String> opciones) {
		this.opciones = opciones;
	}

	/**
	 * @return the opcionSeleccionada
	 */
	public String getOpcionSeleccionada() {
		return opcionSeleccionada;
	}

	/**
	 * @param opcionSeleccionada
	 *            the opcionSeleccionada to set
	 */
	public void setOpcionSeleccionada(String opcionSeleccionada) {
		this.opcionSeleccionada = opcionSeleccionada;
	}

	/**
	 * @return the despachoEncontrado
	 */
	public boolean isDespachoEncontrado() {
		return despachoEncontrado;
	}

	/**
	 * @param despachoEncontrado
	 *            the despachoEncontrado to set
	 */
	public void setDespachoEncontrado(boolean despachoEncontrado) {
		this.despachoEncontrado = despachoEncontrado;
	}

	/**
	 * @return the trabajadores
	 */
	public boolean isTrabajadores() {
		return trabajadores;
	}

	/**
	 * @param trabajadores
	 *            the trabajadores to set
	 */
	public void setTrabajadores(boolean trabajadores) {
		this.trabajadores = trabajadores;
	}

	/**
	 * @return the cargos
	 */
	public List<CatalogoDTO> getCargos() {
		return cargos;
	}

	/**
	 * @param cargos
	 *            the cargos to set
	 */
	public void setCargos(List<CatalogoDTO> cargos) {
		this.cargos = cargos;
	}

	/**
	 * @return the cargoSeleccionado
	 */
	public CatalogoDTO getCargoSeleccionado() {
		return cargoSeleccionado;
	}

	/**
	 * @param cargoSeleccionado
	 *            the cargoSeleccionado to set
	 */
	public void setCargoSeleccionado(CatalogoDTO cargoSeleccionado) {
		this.cargoSeleccionado = cargoSeleccionado;
	}

}
