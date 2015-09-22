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

import org.apache.log4j.Logger;

@Remote({mx.gob.imss.cit.dictamen.integration.api.PatronDictamenIntegrator.class})
@Stateless
public class PatronDictamenIntegratorImpl implements PatronDictamenIntegrator {
	
	

	private static final Logger LOG=Logger.getLogger(PatronDictamenIntegratorImpl.class);
	
	@EJB
	private PatronDictamenService patronDictamenService;
	
	@Override
	public DatosPatronDTO getDatosPatron(String rfc) throws DictamenNegocioException{
		DatosPatronDTO datosPatron= new	DatosPatronDTO();
		datosPatron.setRazonSocialNombre("Fulanito de Tal SA de SV");
		datosPatron.setEjercicioDictaminar("Enero 2016");
		datosPatron.setIdTipoDictamen( Integer.valueOf(2));		
		
		datosPatron.setFechaPresentacionDictamen(new Date());
		datosPatron.setNumRegistroPatronales( Integer.valueOf(1));
		datosPatron.setNumTrabajadoresPromedio( Integer.valueOf(5));
		datosPatron.setRfc(rfc);
		return datosPatron;
	}

	@Override
	public List<TipoDictamenDTO> findAllTipoDictamen()throws DictamenNegocioException {
		List<TipoDictamenDTO> listaTipoDictamen= new ArrayList<TipoDictamenDTO> ();
		
		TipoDictamenDTO tipoDictamenDTO= new TipoDictamenDTO();
		tipoDictamenDTO.setIdDictamen( Integer.valueOf(1));
		tipoDictamenDTO.setDescTipoDictamen("Obligatorio");
		listaTipoDictamen.add(tipoDictamenDTO);
		
		
		
		
		return listaTipoDictamen;
	}

	@Override
	public void executeRegistrar(DatosPatronDTO datosDTO) throws DictamenNegocioException{

		
		try {
			PatronDictamenTO patronDictamenTO=new PatronDictamenTO();
			
			patronDictamenTO.setDesNombreRazonSocial(datosDTO.getRazonSocialNombre());
			patronDictamenTO.setDesRfc(datosDTO.getRfc());
			patronDictamenTO.setNumNumeroTrabajadores(datosDTO.getNumTrabajadoresPromedio());
			patronDictamenTO.setIndPatronConstruccion(datosDTO.getIndustriaConstruccion()?Short.valueOf("1"):Short.valueOf("0"));
			patronDictamenTO.setIndPatronEmpresaValuada(datosDTO.getEmpresaValuada()?Short.valueOf("1"):Short.valueOf("0"));			
			patronDictamenTO.setIndRealizoActConstruccion(datosDTO.getActConstruccionOregObra()?Short.valueOf("1"):Short.valueOf("0"));
			patronDictamenTO.setCveIdEjerFiscalId(Long.valueOf(datosDTO.getEjercicioDictaminar()));
			patronDictamenTO.setCveIdTipoDictamenId(Long.valueOf(datosDTO.getIdTipoDictamen()));
			patronDictamenTO.setNumRegistroPatronales(datosDTO.getNumRegistroPatronales());			
			
			patronDictamenService.saveDictamen(patronDictamenTO);
		} catch (DictamenException e) {
			LOG.error(e.getMessage(),e);
			throw new DictamenNegocioException(e.getMessage(), e);
		}

	}

}
