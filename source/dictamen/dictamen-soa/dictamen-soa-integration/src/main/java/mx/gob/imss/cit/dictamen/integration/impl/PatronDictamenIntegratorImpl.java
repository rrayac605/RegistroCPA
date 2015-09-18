package mx.gob.imss.cit.dictamen.integration.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.domain.PatronDictamenTO;
import mx.gob.imss.cit.dictamen.integration.api.PatronDictamenIntegrator;
import mx.gob.imss.cit.dictamen.integration.api.dto.DatosPatronDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.TipoDictamenDTO;
import mx.gob.imss.cit.dictamen.integration.api.exception.DictamenNegocioException;
import mx.gob.imss.cit.dictamen.services.PatronDictamenService;

@Remote({mx.gob.imss.cit.dictamen.integration.api.PatronDictamenIntegrator.class})
@Stateless
public class PatronDictamenIntegratorImpl implements PatronDictamenIntegrator {

	@EJB
	private PatronDictamenService patronDictamenService;
	
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
	public void executeRegistrar(DatosPatronDTO datosDTO) throws DictamenNegocioException{

		PatronDictamenTO patronDictamenTO=new PatronDictamenTO();
		try {
			patronDictamenService.saveDictamen(patronDictamenTO);
		} catch (DictamenException e) {
			throw new DictamenNegocioException(e.getMessage(), e);
		}

	}

}
