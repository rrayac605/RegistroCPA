package mx.gob.imss.cit.dictamen.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.commons.enums.DictamenExceptionCodeEnum;
import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.domain.CargaDocumentoTO;
import mx.gob.imss.cit.dictamen.model.NdtCargaDocumentoDO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtCargaDocumentoDAO;
import mx.gob.imss.cit.dictamen.services.CargaArchivosService;
import mx.gob.imss.cit.dictamen.services.transformer.TransformerServiceUtils;
import mx.gob.imss.cit.dictamen.services.util.DictamenExceptionBuilder;

import org.apache.log4j.Logger;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
@Stateless
public class CargaArchivosServiceImpl implements CargaArchivosService {
	private static final Logger LOG=Logger.getLogger(CargaArchivosServiceImpl.class);
	
	@EJB
	private NdtCargaDocumentoDAO ndtCargaDocumentoDAO;	
	
	@Override
	public boolean registraCargaArchivos(CargaDocumentoTO cargaAseveracionesTO) throws DictamenException {
		if(cargaAseveracionesTO==null){			
			LOG.error("Los datos de la carga (ndtCargaAseveracionesDO) vienen en Nulo.");
			throw DictamenExceptionBuilder.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_CARGA_ARCHIVOS_PARAM_NULL);
		}
		try{
			NdtCargaDocumentoDO ndtCargaDocumentoDO=TransformerServiceUtils.transformer(cargaAseveracionesTO);	

			NdtCargaDocumentoDO ndtCargaDocumentoDOEdit = ndtCargaDocumentoDAO.findByCveIdPatronDictamen(ndtCargaDocumentoDO);
			if (ndtCargaDocumentoDOEdit != null){
				ndtCargaDocumentoDO.setCveIdBitacoraCargaAsev(ndtCargaDocumentoDOEdit.getCveIdBitacoraCargaAsev());
				ndtCargaDocumentoDAO.edit(ndtCargaDocumentoDO);	
			}else{
				ndtCargaDocumentoDAO.create(ndtCargaDocumentoDO);
			}			
			ndtCargaDocumentoDAO.flush();
			return true;
		}catch(Exception e){
			LOG.error(e.getMessage(),e);
			throw DictamenExceptionBuilder.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_CARGA_ARCHIVOS_GUARDAR,e);			
		}		
	}
	
	@Override
	public List<CargaDocumentoTO> findListadoAseveraciones(Long cveIdPatronDictamen, Long cveIdCpa, String desRfc) throws DictamenException{	
		List<CargaDocumentoTO> cargaDocumentoTOLista = new ArrayList<CargaDocumentoTO>();
		try{
			List<NdtCargaDocumentoDO> cargaDocumentoDOLista = ndtCargaDocumentoDAO.findCvePatronEstadoAseveracion(cveIdPatronDictamen, cveIdCpa, desRfc); 
			
			for(NdtCargaDocumentoDO ndtCargaDocumentoDO: cargaDocumentoDOLista){
				CargaDocumentoTO cargaAseveracionesTO = TransformerServiceUtils.transformer(ndtCargaDocumentoDO);			
				cargaDocumentoTOLista.add(cargaAseveracionesTO);
			}
		}catch(Exception e){
			LOG.error(e.getMessage(),e);
			throw DictamenExceptionBuilder.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_CARGA_ARCHIVOS_BUSCAR,e);
		}
		return cargaDocumentoTOLista;
	}

}

