package org.imss.distss.dictamen.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import mx.gob.imss.distss.dictamen.modelo.dto.NdvColegiosDTO;

import org.imss.distss.dictamen.dataModel.LazyColegioDataModel;
import org.primefaces.model.LazyDataModel;

@ManagedBean(name = "bandejaConsultaColegioController")
@ViewScoped
public class BandejaConsultaColegioController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private LazyColegioDataModel lazyColegioDataModel;
	
	private NdvColegiosDTO colegiosDTOSelected;
	
	private LazyDataModel<NdvColegiosDTO> lazyDataColegio;
	
	@PostConstruct
	public void init(){
		lazyDataColegio = lazyColegioDataModel;
	}

	public NdvColegiosDTO getColegiosDTOSelected() {
		return colegiosDTOSelected;
	}

	public void setColegiosDTOSelected(NdvColegiosDTO colegiosDTOSelected) {
		this.colegiosDTOSelected = colegiosDTOSelected;
	}

	public LazyDataModel<NdvColegiosDTO> getLazyDataColegio() {
		return lazyDataColegio;
	}

	public void setLazyDataColegio(LazyDataModel<NdvColegiosDTO> lazyDataColegio) {
		this.lazyDataColegio = lazyDataColegio;
	}
	
	
	

}
