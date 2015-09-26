package mx.gob.imss.cit.dictamen.integration.impl;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.commons.to.domain.ContadorPublicoAutTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.PatronDictamenTO;
import mx.gob.imss.cit.dictamen.commons.util.ConverterUtils;
import mx.gob.imss.cit.dictamen.integration.api.PatronDictamenIntegrator;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.ContadorPublicoAutDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.PatronDictamenDTO;
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
	public PatronDictamenDTO getDatosPatron(String rfc) throws DictamenNegocioException{
		PatronDictamenDTO datosPatron= new	PatronDictamenDTO();
		datosPatron.setRazonSocialNombre("Fulanito de Tal SA de CV");
		datosPatron.setEjercicioDictaminar(Long.valueOf(2));
		datosPatron.setIdTipoDictamen( Long.valueOf(2));		
		
		datosPatron.setNumRegistroPatronales( Integer.valueOf(1));
		datosPatron.setNumTrabajadoresPromedio( Integer.valueOf(5));
		datosPatron.setRfc(rfc);
		return datosPatron;
	}

	@Override
	public void executeRegistrar(PatronDictamenDTO datosDTO,ContadorPublicoAutDTO contador) throws DictamenNegocioException{

		
		try {
			PatronDictamenTO patronDictamenTO=new PatronDictamenTO();
			
			patronDictamenTO.setDesNombreRazonSocial(datosDTO.getRazonSocialNombre());
			patronDictamenTO.setDesRfc(datosDTO.getRfc());
			patronDictamenTO.setNumNumeroTrabajadores(datosDTO.getNumTrabajadoresPromedio());
			patronDictamenTO.setIndPatronConstruccion(ConverterUtils.convertBooleanToShort(datosDTO.getIndustriaConstruccion()));
			patronDictamenTO.setIndPatronEmpresaValuada(ConverterUtils.convertBooleanToShort(datosDTO.getEmpresaValuada()));			
			patronDictamenTO.setIndRealizoActConstruccion(ConverterUtils.convertBooleanToShort(datosDTO.getActConstruccionOregObra()));
			patronDictamenTO.setCveIdEjerFiscalId(datosDTO.getEjercicioDictaminar());
			patronDictamenTO.setCveIdTipoDictamenId(datosDTO.getIdTipoDictamen());
			patronDictamenTO.setNumRegistroPatronales(datosDTO.getNumRegistroPatronales());			
			
			ContadorPublicoAutTO to=new ContadorPublicoAutTO();
			to.setCveIdCpa(contador.getCveIdCpa());
			patronDictamenService.saveDictamen(patronDictamenTO,to);
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
			throw new DictamenNegocioException(e.getMessage(), e);
		}

	}



}
