package mx.gob.imss.cit.dictamen.appcarga.services.impl;

import mx.gob.imss.cit.dictamen.appcarga.services.CargarService;
import mx.gob.imss.cit.dictamen.appcarga.services.CifrarService;



public class CargarServiceImpl implements CargarService{

	private CifrarService cifrarService;
	
	@Override
	public void executeCargarArchivo() {
		cifrarService.cifrarArchivo();
		
	}

}
