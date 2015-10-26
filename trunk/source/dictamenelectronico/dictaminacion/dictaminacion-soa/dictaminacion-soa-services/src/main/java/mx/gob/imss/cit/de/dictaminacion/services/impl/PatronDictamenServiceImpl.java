/**
 * 
 */
package mx.gob.imss.cit.de.dictaminacion.services.impl;

import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.xml.namespace.QName;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.de.dictaminacion.commons.constants.DictamenConstants;
import mx.gob.imss.cit.de.dictaminacion.commons.enums.DictamenExceptionCodeEnum;
import mx.gob.imss.cit.de.dictaminacion.commons.enums.EstadoDictamenEnum;
import mx.gob.imss.cit.de.dictaminacion.commons.enums.EstadoPatronAsociadoEnum;
import mx.gob.imss.cit.de.dictaminacion.commons.enums.TipoTramiteEnum;
import mx.gob.imss.cit.de.dictaminacion.commons.exception.DictamenException;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.ContadorPublicoAutTO;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.PatronAsociadoTO;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.PatronDictamenTO;
import mx.gob.imss.cit.de.dictaminacion.commons.util.ValidatorUtil;
import mx.gob.imss.cit.de.dictaminacion.model.NdcEstadoDictamenDO;
import mx.gob.imss.cit.de.dictaminacion.model.NdtContadorPublicoAutDO;
import mx.gob.imss.cit.de.dictaminacion.model.NdtPatronAsociadoDO;
import mx.gob.imss.cit.de.dictaminacion.model.NdtPatronDictamenCpaDO;
import mx.gob.imss.cit.de.dictaminacion.model.NdtPatronDictamenDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdtPatronAsociadoDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdtPatronDictamenCpaDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdtPatronDictamenDAO;
import mx.gob.imss.cit.de.dictaminacion.services.PatronDictamenService;
import mx.gob.imss.cit.de.dictaminacion.services.transformer.TransformerServiceUtils;
import mx.gob.imss.cit.de.dictaminacion.services.util.DictamenExceptionBuilder;
import mx.gob.imss.cit.dictamen.servicios.ws.serviciosbdtu.ConsultaPersonaMoral;
import mx.gob.imss.cit.dictamen.servicios.ws.serviciosbdtu.ConsultaPersonaMoralInput;
import mx.gob.imss.cit.dictamen.servicios.ws.serviciosbdtu.ConsultaPersonaMoralOutput;
import mx.gob.imss.cit.dictamen.servicios.ws.serviciosbdtu.ConsultaPersonaMoralResponse;
import mx.gob.imss.cit.dictamen.servicios.ws.serviciosbdtu.GovernanceHeaderRequest;
import mx.gob.imss.cit.dictamen.servicios.ws.serviciosbdtu.ServiciosBDTU;
import mx.gob.imss.cit.dictamen.servicios.ws.serviciosbdtu.ServiciosBDTU_Service;

/**
 * @author ajfuentes
 * 
 */

@Stateless
public class PatronDictamenServiceImpl implements PatronDictamenService {

	private static final Logger LOG = Logger
			.getLogger(PatronDictamenServiceImpl.class);

	@EJB
	private NdtPatronDictamenDAO ndtPatronDictamenDAO;

	@EJB
	private NdtPatronDictamenCpaDAO ndtPatronDictamenCpaDAO;
	
	@EJB
	private NdtPatronAsociadoDAO ndtPatronAsociadoDAO;

	@Override
	public PatronDictamenTO saveDictamen(PatronDictamenTO dictamen,
			ContadorPublicoAutTO contador) throws DictamenException {

		PatronDictamenTO dictamenResultado = null;
		if (dictamen == null) {
			LOG.error("el dictamen llego nulo");
			throw DictamenExceptionBuilder
					.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_DATOS_PATRONALES_PARAM_NULL);
		}

		try {

			NdtContadorPublicoAutDO ndtContadorPublicoAutDO = TransformerServiceUtils
					.transformer(contador);
			
			
			//se llama al webservice de bdtu
			URL wsdl=new URL("http://11.254.20.226:8011/DictamenEJB/Proxies/ServiciosBDTU_Dictamen?wsdl");
			QName name=new QName("http://servicios.dictamen.cit.imss.gob.mx/ws/ServiciosBDTU/","ServiciosBDTU");
			ServiciosBDTU_Service serviciosBDTUService=new  ServiciosBDTU_Service(wsdl,name);
			ServiciosBDTU serviciosBDTU=serviciosBDTUService.getServiciosBDTUPort();			
			GovernanceHeaderRequest governanceHeaderRequest=new GovernanceHeaderRequest();
			ConsultaPersonaMoralInput input=new ConsultaPersonaMoralInput();
			input.setRfc(dictamen.getDesRfc());
			ConsultaPersonaMoral consultaPersonaMoral=new ConsultaPersonaMoral();
			consultaPersonaMoral.setGovernanceHeaderRequest(governanceHeaderRequest);
			consultaPersonaMoral.setArg0(input);
			ConsultaPersonaMoralResponse response=serviciosBDTU.consultaPersonaMoral(consultaPersonaMoral);			
			ConsultaPersonaMoralOutput output=response.getReturn();
			
			dictamen.setCveIdPersonaMoral(output.getPersonaMoral().getCveMoral());
		
			NdtPatronDictamenDO ndtPatronDictamenDO = TransformerServiceUtils
					.transformer(dictamen);
			ndtPatronDictamenDO.setFecRegistroAlta(new Date());			
			NdcEstadoDictamenDO ndcEstadoDictamenDO = new NdcEstadoDictamenDO();
			ndcEstadoDictamenDO.setCveIdEstadoDictamen(EstadoDictamenEnum.EN_PROCESO.getId());
			ndtPatronDictamenDO.setCveIdEstadoDictamen(ndcEstadoDictamenDO);
			ndtPatronDictamenDO.setCveIdTramite(TipoTramiteEnum.TRAMITE_DICTAMEN.getId());
			// se inserta en patron dictamen
			ndtPatronDictamenDAO.create(ndtPatronDictamenDO);
			ndtPatronDictamenDAO.flush();

			NdtPatronDictamenCpaDO patronDictamenCpaDO = new NdtPatronDictamenCpaDO();
			patronDictamenCpaDO.setCveIdPatronDictamen(ndtPatronDictamenDO);
			patronDictamenCpaDO.setCveIdCpa(ndtContadorPublicoAutDO);
			patronDictamenCpaDO.setFecRegistroAlta(new Date());
			patronDictamenCpaDO.setFecRegistroActualizado(new Date());
			// se inserta en patron dictamen cpa
			ndtPatronDictamenCpaDAO.create(patronDictamenCpaDO);
			dictamenResultado = TransformerServiceUtils
					.transformer(ndtPatronDictamenDO);

		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			throw DictamenExceptionBuilder
					.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_DATOS_PATRONALES_GUARDAR,
							e);
		}

		return dictamenResultado;

	}

	@Override
	public PatronDictamenTO getDictamenByRfcPatronAndIdContador(String rfc,
			Long contador) throws DictamenException {

		PatronDictamenTO dictamenTO = null;
		if (ValidatorUtil.isAnyNull(rfc, contador)) {

		}
		try {
			List<NdtPatronDictamenDO> listaDO = ndtPatronDictamenDAO
					.findByRfcPatronAndIdContador(rfc, contador);

			if (listaDO != null && !listaDO.isEmpty()) {
				dictamenTO = TransformerServiceUtils
						.transformer(listaDO.get(0));
			}

		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			throw DictamenExceptionBuilder
					.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_DATOS_PATRONALES_OBTENER,
							e);
		}

		return dictamenTO;
	}

	@Override
	public PatronDictamenTO updateDictamen(PatronDictamenTO dictamen)
			throws DictamenException {
		
		PatronDictamenTO dictamenResultado = null;
		if (dictamen == null || dictamen.getCveIdPatronDictamen()==null) {
			LOG.error("el dictamen llego nulo");
			throw DictamenExceptionBuilder
					.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_DATOS_PATRONALES_PARAM_NULL);
		}

		try {
			NdtPatronDictamenDO patronBD=new NdtPatronDictamenDO();
			patronBD.setCveIdPatronDictamen(dictamen.getCveIdPatronDictamen());
			LOG.info("el id a buscar es el "+dictamen.getCveIdPatronDictamen());
			patronBD=ndtPatronDictamenDAO.get(patronBD.getCveIdPatronDictamen());
			
			
			NdtPatronDictamenDO patronActualiza = TransformerServiceUtils.transformer(dictamen);
	
			patronBD.setNumNumeroTrabajadores(patronActualiza.getNumNumeroTrabajadores());
			patronBD.setNumRegistroPatronales(patronActualiza.getNumRegistroPatronales());
			patronBD.setCveIdTipoDictamen(patronActualiza.getCveIdTipoDictamen());
			patronBD.setIndPatronConstruccion(patronActualiza.getIndPatronConstruccion());
			patronBD.setIndPatronEmpresaValuada(patronActualiza.getIndPatronEmpresaValuada());
			patronBD.setIndRealizoActConstruccion(patronActualiza.getIndRealizoActConstruccion());
			patronBD.setCveIdEjerFiscal(patronActualiza.getCveIdEjerFiscal());
			patronBD.setCveIdTipoDictamen(patronActualiza.getCveIdTipoDictamen());

			// se inserta en patron dictamen
			ndtPatronDictamenDAO.edit(patronBD);
			
			
			dictamenResultado = TransformerServiceUtils.transformer(patronBD);

		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			throw DictamenExceptionBuilder
					.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_DATOS_PATRONALES_ACTUALIZAR,
							e);
		}

		return dictamenResultado;

	}

	@Override
	public List<PatronAsociadoTO> savePatronesAsociados(List<PatronAsociadoTO> listPatronAsociadoTO)
			throws DictamenException {
		
		List<PatronAsociadoTO> res=new ArrayList<PatronAsociadoTO>();
		PatronDictamenTO patron=null;
		try{
             if(listPatronAsociadoTO!=null && !listPatronAsociadoTO.isEmpty()){
	            	patron=listPatronAsociadoTO.get(0).getCveIdPatronDictamen();
	            	ndtPatronAsociadoDAO.removeByPatronDictamen(patron.getCveIdPatronDictamen());
            	
					for (PatronAsociadoTO patronAsociadoTO : listPatronAsociadoTO) {
						NdtPatronAsociadoDO patronAsociadoDO=TransformerServiceUtils.transformer(patronAsociadoTO);
						patronAsociadoDO.setFecRegistroAlta(new Date());
						patronAsociadoDO.setFecRegistroActualizado(new Date());
														
						boolean val = Pattern.matches(DictamenConstants.EXPRESION_REGULAR_REGISTRO_PATRONAL,patronAsociadoTO.getRegPatronAsociado());
						if(val){
							ndtPatronAsociadoDAO.create(patronAsociadoDO);
							PatronAsociadoTO to=TransformerServiceUtils.transformer(patronAsociadoDO);
							to.setEstadoValidacion(EstadoPatronAsociadoEnum.CORRECTO.getDescripcion());
							res.add(to);
						}else{
							PatronAsociadoTO to=TransformerServiceUtils.transformer(patronAsociadoDO);
							to.setEstadoValidacion(EstadoPatronAsociadoEnum.FORMATO_INCORRECTO.getDescripcion());
							res.add(to);
						}
				
					}
			}
		
		}catch (Exception e) {
			LOG.error(e.getMessage(), e);
			throw DictamenExceptionBuilder
					.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_PATRON_ASOCIADO_GUARDAR,
							e);
		}
		return res;
	}

	@Override
	public List<PatronAsociadoTO> findPatronesAsociados(PatronDictamenTO patronDictamenTO) throws DictamenException {
		List<PatronAsociadoTO> res=new ArrayList<PatronAsociadoTO>();
		try{
			
			List<NdtPatronAsociadoDO> ndtPatronAsociadoDOs=ndtPatronAsociadoDAO.findByIdPatronDictamen(patronDictamenTO.getCveIdPatronDictamen());
			
			for (NdtPatronAsociadoDO ndtPatronAsociadoDO : ndtPatronAsociadoDOs) {
				PatronAsociadoTO to=TransformerServiceUtils.transformer(ndtPatronAsociadoDO);
				to.setEstadoValidacion(EstadoPatronAsociadoEnum.CORRECTO.getDescripcion());
				res.add(to);
			}
		
		}catch (Exception e) {
			LOG.error(e.getMessage(), e);
			throw DictamenExceptionBuilder
					.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_PATRON_ASOCIADO_GUARDAR,
							e);
		}
		return res;
	}

}
