package mx.gob.imss.cit.de.dictaminacion.services.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import mx.gob.imss.cit.de.dictaminacion.commons.enums.DictamenExceptionCodeEnum;
import mx.gob.imss.cit.de.dictaminacion.commons.exception.DictamenException;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.CargaDocumentoTO;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.CedulaRemuneracionesTO;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.PatronDictamenTO;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.RemuneracionesTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.CedulaRemuneracionesDTO;
import mx.gob.imss.cit.de.dictaminacion.model.NdcRemuneracionesDO;
import mx.gob.imss.cit.de.dictaminacion.model.NdtA1PercepTrabajadorDO;
import mx.gob.imss.cit.de.dictaminacion.model.NdtB1CedulaRemuneracionesDO;
import mx.gob.imss.cit.de.dictaminacion.model.NdtCargaDocumentoDO;
import mx.gob.imss.cit.de.dictaminacion.model.NdtPatronDictamenDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdcRemuneracionesDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdtA1PercepTrabajadorDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdtB1CedulaRemuneracionesDAO;
import mx.gob.imss.cit.de.dictaminacion.services.CedulaRemuneracionesService;
import mx.gob.imss.cit.de.dictaminacion.services.transformer.TransformerServiceUtils;
import mx.gob.imss.cit.de.dictaminacion.services.util.DictamenExceptionBuilder;
import mx.gob.imss.cit.de.dictaminacion.commons.enums.*;

import org.apache.log4j.Logger;

@Stateless
public class CedulaRemuneracionesServiceImpl implements CedulaRemuneracionesService{

	private static final Logger LOG=Logger.getLogger(CedulaRemuneracionesServiceImpl.class);
	
	@EJB
	private NdcRemuneracionesDAO ndcRemuneracionesDAO;
	
	@EJB
	private NdtA1PercepTrabajadorDAO ndtA1PercepTrabajadorDAO;
	
	@EJB
	private NdtB1CedulaRemuneracionesDAO ndtB1CedulaRemuneracionesDAO;
	
	/**
	 * Guarda el mapa de cedulas 
	 */
	@Override
	public void saveCedulaRemuneraciones(Map<CedulaRemuneracionesTO, List<CedulaRemuneracionesTO>> cedulasRemuneracionesMap)
			throws DictamenException {
		
		System.out.println("GuardandoCedulas ServiceImpl: "+cedulasRemuneracionesMap.size());
		List<CedulaRemuneracionesTO> cedulaRemuneracionesTOLista = new ArrayList<CedulaRemuneracionesTO>();
		
		cedulaRemuneracionesTOLista=convertMapToArray(cedulasRemuneracionesMap);	
		
		NdtB1CedulaRemuneracionesDO entity;
		Date fecha = new Date();		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		try{
			for(int i=0;i<cedulaRemuneracionesTOLista.size();i++){
				Date fechaActual = new Date();
				fechaActual = sdf.parse(sdf.format(fecha));
				entity = TransformerServiceUtils.transformer(cedulaRemuneracionesTOLista.get(i));
				
				entity.setFecRegistroAlta(fechaActual);
				ndtB1CedulaRemuneracionesDAO.create(entity);
				ndtB1CedulaRemuneracionesDAO.flush();
			}
			
		}catch (Exception e) {
			LOG.error("error al guardar"+e);
			throw DictamenExceptionBuilder
				.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_GUARDAR_CEDULA_REMUNERACION,e);
		}
		
	}

	/**
	 * Genera las cedulas por primera ves
	 * @throws DictamenException 
	 */
	@Override
	public Map<CedulaRemuneracionesTO, List<CedulaRemuneracionesTO>> generarCedulaRemuneraciones(PatronDictamenTO patronDictamenTO) throws DictamenException {
		
		System.out.println("Generando Cedulas Remuneracion::ServiceImpl: ");
				
		List<CedulaRemuneracionesTO> cedulaRemuneracionesTOLista = new ArrayList<CedulaRemuneracionesTO>();
		Map<CedulaRemuneracionesTO, List<CedulaRemuneracionesTO>> cedulaRemuneracionesTOMap = new HashMap<CedulaRemuneracionesTO, List<CedulaRemuneracionesTO>>();
		try{
			NdtPatronDictamenDO ndtPatronDictamenDO= TransformerServiceUtils.transformer(patronDictamenTO);

			List<NdcRemuneracionesDO> ndcRemuneracionesDAOLista= ndcRemuneracionesDAO.findAllOrder();
			
			for(int i=0;i<ndcRemuneracionesDAOLista.size();i++)	{	
				
				RemuneracionesTO remuneracionesTO = new RemuneracionesTO();
				remuneracionesTO=TransformerServiceUtils.transformer(ndcRemuneracionesDAOLista.get(i));
				CedulaRemuneracionesTO cedulaRemuneracionesPadreTO=null;
								
				if(remuneracionesTO.getCveIdRemuneracionPadre() == null && remuneracionesTO.getNombreCampoAseveracion()!=null){
//					System.out.println("ES una remuneracion padre, Nombre campo: "+remuneracionesTO.getNombreCampoAseveracion());
					cedulaRemuneracionesPadreTO=new CedulaRemuneracionesTO();
					cedulaRemuneracionesPadreTO.setCveIdRemuneraciones(remuneracionesTO);					
					cedulaRemuneracionesPadreTO.setImpImportePagado(obtieneTotalImporte(ndtPatronDictamenDO,remuneracionesTO));
					
					cedulaRemuneracionesTOLista=obtieneHijosCedula(ndcRemuneracionesDAOLista,remuneracionesTO.getCveIdRemuneraciones());
					
					cedulaRemuneracionesTOMap.put(cedulaRemuneracionesPadreTO, cedulaRemuneracionesTOLista);			
				}
				
			}	
			
			System.out.println("Tamaño del mapa: "+cedulaRemuneracionesTOMap.size());
		}catch(Exception e){
			LOG.error(e.getMessage(),e);
			throw DictamenExceptionBuilder
				.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_GENERAR_CEDULA_REMUNERACIONES,e);
		}
		
		return cedulaRemuneracionesTOMap;
	}
	
	@Override
	public Map<CedulaRemuneracionesTO, List<CedulaRemuneracionesTO>> obtenerCedulaRemuneraciones(
			PatronDictamenTO patronDictamenTO) throws DictamenException {

		try{
			
		}catch (Exception e) {
			throw DictamenExceptionBuilder
				.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_CARGAR_CEDULA_REMUNERACIONES,e);
		}
		return null;
	}
	
	/**
	 * Método auxiliar que obiene las remuneraciones hijas de una Remuneracion
	 * @param ndcRemuneracionesDAOLista
	 * @param idPadre
	 * @return
	 * @throws DictamenException
	 */
	public List<CedulaRemuneracionesTO> obtieneHijosCedula(List<NdcRemuneracionesDO> ndcRemuneracionesDAOLista, Long idPadre) throws DictamenException{
		
		CedulaRemuneracionesTO cedulaRemuneracionesTO=null;
		List<CedulaRemuneracionesTO> listaRemuneraciones = new ArrayList<CedulaRemuneracionesTO>();
		
		for(int i=0;i<ndcRemuneracionesDAOLista.size();i++)	{
			RemuneracionesTO remuneracionesTO = new RemuneracionesTO();
			remuneracionesTO=TransformerServiceUtils.transformer(ndcRemuneracionesDAOLista.get(i));
			
			if(remuneracionesTO.getCveIdRemuneracionPadre() != null && remuneracionesTO.getNombreCampoAseveracion()==null){
				if(remuneracionesTO.getCveIdRemuneracionPadre().getCveIdRemuneraciones().equals(idPadre)){
					cedulaRemuneracionesTO=new CedulaRemuneracionesTO();
					cedulaRemuneracionesTO=new CedulaRemuneracionesTO();
					cedulaRemuneracionesTO.setCveIdRemuneraciones(remuneracionesTO);
					cedulaRemuneracionesTO.setImpImportePagado(0L);
					
					listaRemuneraciones.add(cedulaRemuneracionesTO);
				}				
			}
		}
		
		return listaRemuneraciones;	
		
	}
	
	/**
	 * Metodo auxiliar que obtiene el total de importe pagado, por idPratronDictamen y concepto de remuneracion
	 * @param ndtPatronDictamenDO
	 * @param remuneracionesTO
	 * @return
	 */
	public Long obtieneTotalImporte(NdtPatronDictamenDO ndtPatronDictamenDO,RemuneracionesTO remuneracionesTO){
		Long totalImporte = null;
		
		totalImporte=ndtA1PercepTrabajadorDAO.findTotalImporte(ndtPatronDictamenDO,remuneracionesTO.getNombreCampoAseveracion());
		
		return totalImporte;
	}
	
	public List<CedulaRemuneracionesTO> convertMapToArray(Map<CedulaRemuneracionesTO, List<CedulaRemuneracionesTO>> cedulaRemuneracionesTOMap ){
		
		List<CedulaRemuneracionesTO> cedulaRemuneracionesTOs = new ArrayList<CedulaRemuneracionesTO>();
		List<CedulaRemuneracionesTO> cedulaRemuneracionesTmp = null;
		Iterator it = cedulaRemuneracionesTOMap.entrySet().iterator();
		while (it.hasNext()) {
			cedulaRemuneracionesTmp=new ArrayList<CedulaRemuneracionesTO>();
			
		    Map.Entry e = (Map.Entry)it.next();
		    cedulaRemuneracionesTOs.add((CedulaRemuneracionesTO) e.getKey());
		    cedulaRemuneracionesTmp= (List<CedulaRemuneracionesTO>) e.getValue();
		    
		    if(cedulaRemuneracionesTmp.size()>0){
		    	for(int i=0;i<cedulaRemuneracionesTmp.size();i++){
		    		cedulaRemuneracionesTOs.add(cedulaRemuneracionesTmp.get(i));
		    	}
		    }
		}
		
		
		System.out.println("Tamaño Arreglo creado de map: "+cedulaRemuneracionesTOs.size());
		return cedulaRemuneracionesTOs;
	}

}
