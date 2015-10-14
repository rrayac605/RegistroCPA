package org.imss.distss.dictamen.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;
import javax.inject.Inject;

import mx.gob.imss.distss.dictamen.constants.ConstantesEstadosCPA;
import mx.gob.imss.distss.dictamen.integration.sample.CatalogoService;
import mx.gob.imss.distss.dictamen.integration.sample.ContadorPublicoService;
import mx.gob.imss.distss.dictamen.modelo.dto.CatalogoDTO;
import mx.gob.imss.distss.dictamen.modelo.dto.NdcEstadoCpaDTO;
import mx.gob.imss.distss.dictamen.modelo.dto.NdvContadorPublicoAutDTO;

import org.imss.distss.dictamen.dataModel.LazyContadorDataModel;
import org.primefaces.context.RequestContext;
import org.primefaces.model.LazyDataModel;

@ManagedBean(name = "bandejaConsultaContadorController")
@ViewScoped
public class BandejaConsultaContadorController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2754344802651322551L;

	@Inject
	private ContadorPublicoService contadorPublicoService;
	
	@Inject
	private CatalogoService catalogoService;
	
	@Inject
	private LazyContadorDataModel lazyContadorDataModel;

	private NdvContadorPublicoAutDTO ndtContadorPublicoAutDTOSelected;

	private SelectItem[] itemsEstatus;

	private LazyDataModel<NdvContadorPublicoAutDTO> lazyDataContador;
	
	private List<CatalogoDTO> listaDelegacion;
	
	private List<CatalogoDTO> listaSubdelegacion;

	private String observaciones;
	private String nombre;
	private Long numRegistroCpa;

	@PostConstruct
	public void init() {
		lazyDataContador = lazyContadorDataModel;
		cargaCatalogos();
	}

	public void cargaCatalogos() {
		itemsEstatus = generaOpciones(contadorPublicoService
				.catalogoEstadoContador());
		listaDelegacion = catalogoService.consultaDelegaciones();
	}

	public void cargaSubdelegacion(){
		listaSubdelegacion = catalogoService.consultaSubdelegacionPorIdDelegacion(ndtContadorPublicoAutDTOSelected.getCveDeleg());
	}
	
	private SelectItem[] generaOpciones(List<NdcEstadoCpaDTO> listaEstados) {
		SelectItem[] options = new SelectItem[listaEstados.size() + 1];
		options[0] = new SelectItem("", "Seleccionar");

		for (int i = 0; i < listaEstados.size(); i++) {
			options[i + 1] = new SelectItem(listaEstados.get(i)
					.getDesEstadoCpa(), listaEstados.get(i).getDesEstadoCpa());
		}

		return options;
	}

	public void aceptaSolicitud(ActionEvent actionEvent) {
		nombre = ndtContadorPublicoAutDTOSelected.getNombre();
		numRegistroCpa = contadorPublicoService.actualizaContador(
				ndtContadorPublicoAutDTOSelected,
				getObservaciones(), ConstantesEstadosCPA.ACTIVO);
		setObservaciones("");
		RequestContext.getCurrentInstance().execute("PF(\'dialogoAceptacion\').hide()");
		RequestContext.getCurrentInstance().execute("PF(\'dialogoConfirm\').show()");
	}

	public void rechazaSolicitud(ActionEvent actionEvent) {
		contadorPublicoService.actualizaContador(
				ndtContadorPublicoAutDTOSelected,
				getObservaciones(), ConstantesEstadosCPA.RECHAZADO);
		setObservaciones("");
	}

	public NdvContadorPublicoAutDTO getNdtContadorPublicoAutDTOSelected() {
		return ndtContadorPublicoAutDTOSelected;
	}

	public void setNdtContadorPublicoAutDTOSelected(
			NdvContadorPublicoAutDTO ndtContadorPublicoAutDTOSelected) {
		this.ndtContadorPublicoAutDTOSelected = ndtContadorPublicoAutDTOSelected;
	}

	public SelectItem[] getItemsEstatus() {
		return itemsEstatus;
	}

	public void setItemsEstatus(SelectItem[] itemsEstatus) {
		this.itemsEstatus = itemsEstatus;
	}

	public LazyDataModel<NdvContadorPublicoAutDTO> getLazyDataContador() {
		return lazyDataContador;
	}

	public void setLazyDataContador(
			LazyDataModel<NdvContadorPublicoAutDTO> lazyDataContador) {
		this.lazyDataContador = lazyDataContador;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getNumRegistroCpa() {
		return numRegistroCpa;
	}

	public void setNumRegistroCpa(Long numRegistroCpa) {
		this.numRegistroCpa = numRegistroCpa;
	}

	public List<CatalogoDTO> getListaDelegacion() {
		return listaDelegacion;
	}

	public void setListaDelegacion(List<CatalogoDTO> listaDelegacion) {
		this.listaDelegacion = listaDelegacion;
	}

	public List<CatalogoDTO> getListaSubdelegacion() {
		return listaSubdelegacion;
	}

	public void setListaSubdelegacion(List<CatalogoDTO> listaSubdelegacion) {
		this.listaSubdelegacion = listaSubdelegacion;
	}

}
