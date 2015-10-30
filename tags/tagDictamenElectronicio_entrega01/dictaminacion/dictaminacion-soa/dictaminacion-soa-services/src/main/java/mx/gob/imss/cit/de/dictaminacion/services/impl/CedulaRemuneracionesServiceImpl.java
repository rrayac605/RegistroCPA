package mx.gob.imss.cit.de.dictaminacion.services.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
	
	@Override
	public void saveCedulaRemuneraciones(List<CedulaRemuneracionesTO> cedulasRemuneraciones)
			throws DictamenException {
		
		System.out.println("GuardarCedulas ServiceImpl: "+cedulasRemuneraciones.size());
		NdtB1CedulaRemuneracionesDO entity;
		Date fecha = new Date();		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		try{
			for(int i=0;i<cedulasRemuneraciones.size();i++){
				Date fechaActual = new Date();
				fechaActual = sdf.parse(sdf.format(fecha));
				entity = TransformerServiceUtils
					.transformer(cedulasRemuneraciones.get(i));
				
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

	@Override
	public List<CedulaRemuneracionesTO> obtenerCedulaRemuneraciones(Long idPatronDictamen) {
		
		long totalSueldosYsalarios = 0;
		long totalGratificacion = 0;
		long totalTiempoExtra = 0;
		long totalPrimaVacacional = 0;
		long totalPrimaDominical = 0;
		long totalPTU = 0;
		long totalFondoAhorro = 0;
		long totalValesDespensa = 0;
		
		
		PatronDictamenTO patronDictamenTO = new PatronDictamenTO();
		patronDictamenTO.setCveIdPatronDictamen(idPatronDictamen);
		
		List<CedulaRemuneracionesTO> cedulaRemuneracionesTOLista = new ArrayList<CedulaRemuneracionesTO>();
		try{
			NdtPatronDictamenDO ndtPatronDictamenDO= TransformerServiceUtils.transformer(patronDictamenTO);
			List<NdtA1PercepTrabajadorDO> ndtA1PercepTrabajadorDAOLista = ndtA1PercepTrabajadorDAO.findByCveIdPatronDictamen(ndtPatronDictamenDO);
			
			for(int i=0;i<ndtA1PercepTrabajadorDAOLista.size();i++){
				
				totalSueldosYsalarios += ndtA1PercepTrabajadorDAOLista.get(i).getImpSueldosSalarios();
				totalGratificacion += ndtA1PercepTrabajadorDAOLista.get(i).getImpGratificaciones();
				totalTiempoExtra += ndtA1PercepTrabajadorDAOLista.get(i).getImpTiempoExtra();
				totalPrimaVacacional += ndtA1PercepTrabajadorDAOLista.get(i).getImpPrimaVacacional();
				totalPrimaDominical += ndtA1PercepTrabajadorDAOLista.get(i).getImpPrimaDominical();
				totalPTU += ndtA1PercepTrabajadorDAOLista.get(i).getImpPtu();
				totalFondoAhorro += ndtA1PercepTrabajadorDAOLista.get(i).getImpFondoAhorro();
				totalValesDespensa += ndtA1PercepTrabajadorDAOLista.get(i).getImpValesDespensa();
			}
			
			List<NdcRemuneracionesDO> ndcRemuneracionesDAOLista= ndcRemuneracionesDAO.findAllOrder();
			
			for(int i=0;i<ndcRemuneracionesDAOLista.size();i++){
				RemuneracionesTO remuneracionesTO = new RemuneracionesTO();
				remuneracionesTO=TransformerServiceUtils.transformer(ndcRemuneracionesDAOLista.get(i));
				
				if(remuneracionesTO.getIndOrden().equals(1)){
					if(remuneracionesTO.getCveIdRemuneraciones().equals(1L)){
						cedulaRemuneracionesTOLista.add(construyeCedulaRemuneracionesTO(patronDictamenTO, totalSueldosYsalarios,remuneracionesTO));
					}
					if(remuneracionesTO.getCveIdRemuneraciones().equals(2L)){
						cedulaRemuneracionesTOLista.add(construyeCedulaRemuneracionesTO(patronDictamenTO, totalGratificacion,remuneracionesTO));
					}
					if(remuneracionesTO.getCveIdRemuneraciones().equals(3L)){
						cedulaRemuneracionesTOLista.add(construyeCedulaRemuneracionesTO(patronDictamenTO, totalTiempoExtra,remuneracionesTO));
					}
					if(remuneracionesTO.getCveIdRemuneraciones().equals(6L)){
						cedulaRemuneracionesTOLista.add(construyeCedulaRemuneracionesTO(patronDictamenTO, totalPrimaVacacional,remuneracionesTO));
					}
					if(remuneracionesTO.getCveIdRemuneraciones().equals(7L)){
						cedulaRemuneracionesTOLista.add(construyeCedulaRemuneracionesTO(patronDictamenTO, totalPrimaDominical,remuneracionesTO));
					}
					if(remuneracionesTO.getCveIdRemuneraciones().equals(8L)){
						cedulaRemuneracionesTOLista.add(construyeCedulaRemuneracionesTO(patronDictamenTO, totalPTU,remuneracionesTO));
					}
					if(remuneracionesTO.getCveIdRemuneraciones().equals(11L)){
						cedulaRemuneracionesTOLista.add(construyeCedulaRemuneracionesTO(patronDictamenTO, totalFondoAhorro,remuneracionesTO));
					}
					if(remuneracionesTO.getCveIdRemuneraciones().equals(14L)){
						cedulaRemuneracionesTOLista.add(construyeCedulaRemuneracionesTO(patronDictamenTO, totalValesDespensa,remuneracionesTO));
					}
				}else{
					
					cedulaRemuneracionesTOLista.add(construyeCedulaRemuneracionesTO(patronDictamenTO,0L,remuneracionesTO));
				}
				
			}

		}catch(Exception e){
			LOG.error(e.getMessage(),e);
			//throw DictamenExceptionBuilder.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_CARGA_ARCHIVOS_BUSCAR,e);
		}
		
		return cedulaRemuneracionesTOLista;
	}
	
	public CedulaRemuneracionesTO construyeCedulaRemuneracionesTO(PatronDictamenTO patronDictamenTO,Long total,RemuneracionesTO remuneracionesTO){
		
		
		CedulaRemuneracionesTO cedulaRemuneracionesTO = new CedulaRemuneracionesTO();
		cedulaRemuneracionesTO.setImpImportePagado(total);
		cedulaRemuneracionesTO.setCveIdPatronDictamen(patronDictamenTO);
		cedulaRemuneracionesTO.setCveIdRemuneraciones(remuneracionesTO);
		
		return cedulaRemuneracionesTO; 
	}


}
