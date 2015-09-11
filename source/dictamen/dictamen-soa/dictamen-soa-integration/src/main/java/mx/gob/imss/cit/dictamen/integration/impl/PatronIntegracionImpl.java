package mx.gob.imss.cit.dictamen.integration.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.integration.api.PatronIntegration;
import mx.gob.imss.cit.dictamen.integration.api.dto.DatosPatronDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.TipoDictamenDTO;

@Stateless
@Remote(mx.gob.imss.cit.dictamen.integration.api.PatronIntegration.class)
public class PatronIntegracionImpl implements PatronIntegration {

	@Override
	public DatosPatronDTO getDatosPatron(String rfc) {
		DatosPatronDTO datosPatron= new	DatosPatronDTO();
		datosPatron.setRazonSocialNombre("Fulanito de Tal SA de SV");
		datosPatron.setEjercicioDictaminar("Enero 2016");
		datosPatron.setIdTipoDictamen(new Integer (2));		
		
		datosPatron.setFechaPresentacionDictamen(new Date());
		datosPatron.setNumRegistroPatronales( new Integer(1));
		datosPatron.setNumTrabajadoresPromedio(new Integer (5));
		datosPatron.setRfc(rfc);
		return datosPatron;
	}

	@Override
	public List<TipoDictamenDTO> findAllTipoDictamen() {
		List<TipoDictamenDTO> listaTipoDictamen= new ArrayList<TipoDictamenDTO> ();
		
		TipoDictamenDTO tipoDictamenDTO= new TipoDictamenDTO();
		tipoDictamenDTO.setIdDictamen(new Integer (1));
		tipoDictamenDTO.setDescTipoDictamen("Obligatorio");
		listaTipoDictamen.add(tipoDictamenDTO);
		
		
		
		
		return listaTipoDictamen;
	}

	@Override
	public void executeRegistrar(DatosPatronDTO datosDTO) {
		// TODO Auto-generated method stub

	}

}
