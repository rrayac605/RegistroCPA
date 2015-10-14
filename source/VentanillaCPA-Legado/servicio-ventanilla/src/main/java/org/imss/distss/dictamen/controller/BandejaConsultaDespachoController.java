package org.imss.distss.dictamen.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import mx.gob.imss.distss.dictamen.modelo.dto.NdvDespachosDTO;

import org.imss.distss.dictamen.dataModel.LazyDespachoDataModel;
import org.primefaces.model.LazyDataModel;

@ManagedBean(name = "bandejaConsultaDespachoController")
@ViewScoped
public class BandejaConsultaDespachoController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2066314578497584739L;
	
	@Inject
	private LazyDespachoDataModel lazyDespachoDataModel;
	
	private NdvDespachosDTO ndvDespachosDTOSelected;
	
	private LazyDataModel<NdvDespachosDTO> lazyDataDespacho;
	
	@PostConstruct
	public void init(){
		lazyDataDespacho = lazyDespachoDataModel;
	}

	public NdvDespachosDTO getNdvDespachosDTOSelected() {
		return ndvDespachosDTOSelected;
	}

	public void setNdvDespachosDTOSelected(NdvDespachosDTO ndvDespachosDTOSelected) {
		this.ndvDespachosDTOSelected = ndvDespachosDTOSelected;
	}

	public LazyDataModel<NdvDespachosDTO> getLazyDataDespacho() {
		return lazyDataDespacho;
	}

	public void setLazyDataDespacho(LazyDataModel<NdvDespachosDTO> lazyDataDespacho) {
		this.lazyDataDespacho = lazyDataDespacho;
	}


}
