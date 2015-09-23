package mx.gob.imss.cit.dictamen.integration.api.dto;

import mx.gob.imss.cit.dictamen.integration.api.dto.base.BaseDTO;

public class InformacionPatronalDTO extends BaseDTO{
	

	private String categoria;
	private String nombreOriginalArchivo;
	private Integer carga;
	private Integer validado;
	private Integer resultado;
	private Integer acciones;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4346476260050923221L;
	
	/**
	 * @param categoria
	 * @param nombreOriginalArchivo
	 * @param carga
	 * @param validado
	 * @param resultado
	 * @param acciones
	 */
	public InformacionPatronalDTO(String categoria, String nombreOriginalArchivo, Integer carga, Integer validado, Integer resultado, Integer acciones) {
		super();
		this.categoria = categoria;
		this.nombreOriginalArchivo = nombreOriginalArchivo;
		this.carga = carga;
		this.validado = validado;
		this.resultado = resultado;
		this.acciones = acciones;
	}
	
	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}
	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	/**
	 * @return the nombreOriginalArchivo
	 */
	public String getNombreOriginalArchivo() {
		return nombreOriginalArchivo;
	}
	/**
	 * @param nombreOriginalArchivo the nombreOriginalArchivo to set
	 */
	public void setNombreOriginalArchivo(String nombreOriginalArchivo) {
		this.nombreOriginalArchivo = nombreOriginalArchivo;
	}
	/**
	 * @return the carga
	 */
	public Integer getCarga() {
		return carga;
	}
	/**
	 * @param carga the carga to set
	 */
	public void setCarga(Integer carga) {
		this.carga = carga;
	}
	/**
	 * @return the validado
	 */
	public Integer getValidado() {
		return validado;
	}
	/**
	 * @param validado the validado to set
	 */
	public void setValidado(Integer validado) {
		this.validado = validado;
	}
	/**
	 * @return the resultado
	 */
	public Integer getResultado() {
		return resultado;
	}
	/**
	 * @param resultado the resultado to set
	 */
	public void setResultado(Integer resultado) {
		this.resultado = resultado;
	}
	/**
	 * @return the acciones
	 */
	public Integer getAcciones() {
		return acciones;
	}
	/**
	 * @param acciones the acciones to set
	 */
	public void setAcciones(Integer acciones) {
		this.acciones = acciones;
	}
	

}
