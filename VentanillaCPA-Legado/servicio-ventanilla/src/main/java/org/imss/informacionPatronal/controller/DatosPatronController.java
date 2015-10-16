package org.imss.informacionPatronal.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.distss.dictamen.modelo.dto.CatalogoDTO;

@ManagedBean
@ViewScoped
public class DatosPatronController {
	
	private List<CatalogoDTO> listaTipoDictamen;
	
	private List<CatalogoDTO> listaSiNo;
	
	private List<CatalogoDTO> listaEjercicio;
	
	@PostConstruct
	public void init(){
		cargaListas();
	}
	
	public void cargaListas(){
		listaTipoDictamen = new ArrayList<CatalogoDTO>();
		
		listaTipoDictamen.add(new CatalogoDTO("1","Obligatorio"));
		listaTipoDictamen.add(new CatalogoDTO("2", "Voluntario"));
		
		listaSiNo = new ArrayList<CatalogoDTO>();
		
		listaSiNo.add(new CatalogoDTO("1", "Si"));
		listaSiNo.add(new CatalogoDTO("2", "No"));
		
		listaEjercicio = new ArrayList<CatalogoDTO>();
		
		listaEjercicio.add(new CatalogoDTO("2007", "2007"));
		listaEjercicio.add(new CatalogoDTO("2008", "2008"));
		listaEjercicio.add(new CatalogoDTO("2009", "2009"));
		listaEjercicio.add(new CatalogoDTO("2010", "2010"));
	}

	public List<CatalogoDTO> getListaTipoDictamen() {
		return listaTipoDictamen;
	}

	public void setListaTipoDictamen(List<CatalogoDTO> listaTipoDictamen) {
		this.listaTipoDictamen = listaTipoDictamen;
	}

	public List<CatalogoDTO> getListaSiNo() {
		return listaSiNo;
	}

	public void setListaSiNo(List<CatalogoDTO> listaSiNo) {
		this.listaSiNo = listaSiNo;
	}

	public List<CatalogoDTO> getListaEjercicio() {
		return listaEjercicio;
	}

	public void setListaEjercicio(List<CatalogoDTO> listaEjercicio) {
		this.listaEjercicio = listaEjercicio;
	}
	
}
