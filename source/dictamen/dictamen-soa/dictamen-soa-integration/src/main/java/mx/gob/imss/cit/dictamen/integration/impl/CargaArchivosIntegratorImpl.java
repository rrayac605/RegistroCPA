package mx.gob.imss.cit.dictamen.integration.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.dictamen.commons.enums.EstadoAtestiguamientoEnum;
import mx.gob.imss.cit.dictamen.commons.enums.EstadoCargaDocumentoEnum;
import mx.gob.imss.cit.dictamen.commons.enums.TipoDocumentoEnum;
import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.ParentLayoutTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.AseveracionesTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.AtestiguamientoDictamenTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.AtestiguamientoTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.CargaDocumentoTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.EstadoAtestiguamientoTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.EstadoCargaDocumentoTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.PatronDictamenTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.TipoDocumentoTO;
import mx.gob.imss.cit.dictamen.integration.api.CargaArchivosIntegrator;
import mx.gob.imss.cit.dictamen.integration.api.dto.AseveracionesDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.CargaDocumentoDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.EstadoCargaDocumentoDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.ParentLayoutDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.PatronDictamenDTO;
import mx.gob.imss.cit.dictamen.integration.api.exception.DictamenNegocioException;
import mx.gob.imss.cit.dictamen.integration.transformer.TransformerIntegrationUtils;
import mx.gob.imss.cit.dictamen.services.CargaArchivosService;
import mx.gob.imss.cit.dictamen.services.LayoutPatronAsociadoService;

@Remote(mx.gob.imss.cit.dictamen.integration.api.CargaArchivosIntegrator.class)
@Stateless
public class CargaArchivosIntegratorImpl implements CargaArchivosIntegrator {
	/**
	 * 
	 */
	private static final Logger LOG = Logger
			.getLogger(CargaArchivosIntegratorImpl.class);
	@EJB
	LayoutPatronAsociadoService layoutPatronAsociadoService;

	@EJB
	private CargaArchivosService cargaArchivosService;

	@Override
	public List<ParentLayoutDTO> findLayout(PatronDictamenDTO patronDictamenDTO,String rfcContador)throws DictamenNegocioException {
		List<ParentLayoutDTO> listaDTO = null;
		PatronDictamenTO patronDictamenTO=TransformerIntegrationUtils.transformer(patronDictamenDTO);
		try {
			List<ParentLayoutTO> listaTO = layoutPatronAsociadoService.findLayoutAWSService( patronDictamenTO, rfcContador);
			for (ParentLayoutTO parentLayoutTO : listaTO) {
				if (listaDTO == null) {
					listaDTO = new ArrayList<ParentLayoutDTO>();
				}
				listaDTO.add(TransformerIntegrationUtils.transformer(parentLayoutTO));
			}
		} catch (DictamenException e) {
			LOG.error(e.getMessage(), e);
			throw new DictamenNegocioException(e.getMessage(), e);
		}

		return listaDTO;
	}

	@Override
	public boolean registrarCargaAseveracion(
			CargaDocumentoDTO cargaAseveracionesDTO)
			throws DictamenNegocioException {
		EstadoCargaDocumentoTO estatus = new EstadoCargaDocumentoTO();
		AseveracionesTO aseveracionTO = new AseveracionesTO();
		TipoDocumentoTO cveIdTipoDocumento = new TipoDocumentoTO();
		PatronDictamenTO patronDictamenTO = new PatronDictamenTO();

		aseveracionTO.setCveIdAseveracion(cargaAseveracionesDTO.getCveIdAseveracion().getCveIdAseveracion());
		cveIdTipoDocumento.setCveIdTipoDocumento(TipoDocumentoEnum.TIPO_DOCUMENTO_ASEVERACIONES.getId());
		patronDictamenTO.setCveIdPatronDictamen(cargaAseveracionesDTO.getCveIdPatronDictamen());

		estatus.setCveIdEstadoCargoDoc(EstadoCargaDocumentoEnum.ESTATUS_CARGADO.getId());
		CargaDocumentoTO cargaAseveracionesTO = new CargaDocumentoTO();
		cargaAseveracionesTO.setCveIdEstadoCargoDoc(estatus);
		cargaAseveracionesTO.setCveIdUsuario(cargaAseveracionesDTO.getCveIdUsuario());
		cargaAseveracionesTO.setFecFechaCarga(new Date());
		cargaAseveracionesTO.setFecRegistroActualizado(new Date());
		cargaAseveracionesTO.setFecRegistroAlta(new Date());
		cargaAseveracionesTO.setCveIdAseveracion(aseveracionTO);
		cargaAseveracionesTO.setCveIdTipoDocumento(cveIdTipoDocumento);
		cargaAseveracionesTO.setCveIdPatronDictamen(patronDictamenTO);
		
		AtestiguamientoDictamenTO atestiguamientoTO = new AtestiguamientoDictamenTO();
		EstadoAtestiguamientoTO cveIdEstadoAtestiguamiento = new EstadoAtestiguamientoTO();	
		
		cveIdEstadoAtestiguamiento.setCveIdEstadoAtestiguamiento(EstadoAtestiguamientoEnum.INICIADO);		
		atestiguamientoTO.setCveIdEstadoAtestiguamiento(cveIdEstadoAtestiguamiento);
		atestiguamientoTO.setCveIdPatronDictamen(patronDictamenTO);
		atestiguamientoTO.setCveIdUsuario(cargaAseveracionesDTO
				.getCveIdUsuario());
		atestiguamientoTO.setFecRegistroActualizado(new Date());
		atestiguamientoTO.setFecRegistroAlta(new Date());
		
		
		try {
			AtestiguamientoTO cveIdAtestiguamiento = cargaArchivosService.getAtestiguamientoByIdAseveracion(aseveracionTO.getCveIdAseveracion());
			atestiguamientoTO.setCveIdAtestiguamiento(cveIdAtestiguamiento);
			
			cargaArchivosService.registraCargaArchivos(cargaAseveracionesTO);			
			cargaArchivosService.registraAtestiguamientoDictamen(atestiguamientoTO);
		} catch (DictamenException e) {
			LOG.error(e.getMessage(), e);
			throw new DictamenNegocioException(e.getMessage(), e);
		}

		return false;
	}
	
	@Override
	public List<CargaDocumentoDTO> findCvePatronEstadoAseveracion(Long cveIdPatronDictamen, Long cveIdCpa, String desRfc) throws DictamenNegocioException {
		List<CargaDocumentoDTO> cargaDocumentoDTOList = new ArrayList<CargaDocumentoDTO>();
		List<CargaDocumentoTO> cargaDocumentoTOList = new ArrayList<CargaDocumentoTO>();
		
		try{
			cargaDocumentoTOList = cargaArchivosService.findListadoAseveraciones(cveIdPatronDictamen, cveIdCpa, desRfc);

			for(CargaDocumentoTO cargaDocumentoTO:cargaDocumentoTOList){
				CargaDocumentoDTO cargaDocumentoDTO = new CargaDocumentoDTO();

				EstadoCargaDocumentoDTO estadoCargaDocumentoDTO = new EstadoCargaDocumentoDTO();
				estadoCargaDocumentoDTO.setCveIdEstadoCargoDoc(cargaDocumentoTO.getCveIdEstadoCargoDoc().getCveIdEstadoCargoDoc());
				estadoCargaDocumentoDTO.setDesStatusCargaAseveraciones(cargaDocumentoTO.getCveIdEstadoCargoDoc().getDesStatusCargaAseveraciones());
				cargaDocumentoDTO.setCveIdEstadoCargoDoc(estadoCargaDocumentoDTO);
				
				AseveracionesDTO aseveracionesDTO =new AseveracionesDTO();
				aseveracionesDTO.setCveIdAseveracion(cargaDocumentoTO.getCveIdAseveracion().getCveIdAseveracion());
				aseveracionesDTO.setDesTipoAseveracion(cargaDocumentoTO.getCveIdAseveracion().getDesTipoAseveracion());
				cargaDocumentoDTO.setCveIdAseveracion(aseveracionesDTO);
				
				cargaDocumentoDTOList.add(cargaDocumentoDTO);
			}
					
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			throw new DictamenNegocioException(e.getMessage(),e);
		
		}

		return cargaDocumentoDTOList;
		}
}
