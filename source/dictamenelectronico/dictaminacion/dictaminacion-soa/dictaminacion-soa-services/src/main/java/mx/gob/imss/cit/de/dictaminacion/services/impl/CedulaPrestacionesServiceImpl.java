package mx.gob.imss.cit.de.dictaminacion.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import mx.gob.imss.cit.de.dictaminacion.commons.enums.DictamenExceptionCodeEnum;
import mx.gob.imss.cit.de.dictaminacion.commons.exception.DictamenException;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.CedulaPrestacionesTO;
import mx.gob.imss.cit.de.dictaminacion.model.NdtB2CedulaPrestacionesDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdtB2CedulaPrestacionesDAO;
import mx.gob.imss.cit.de.dictaminacion.services.CedulaPrestacionesService;
import mx.gob.imss.cit.de.dictaminacion.services.transformer.TransformerServiceUtils;
import mx.gob.imss.cit.de.dictaminacion.services.util.DictamenExceptionBuilder;

import org.apache.log4j.Logger;

@Stateless
public class CedulaPrestacionesServiceImpl implements CedulaPrestacionesService {
	private static final Logger LOG=Logger.getLogger(CargaArchivosServiceImpl.class);

	@EJB
	NdtB2CedulaPrestacionesDAO ndtB2CedulaPrestacionesDAO;

	@Override
	public List<CedulaPrestacionesTO> findCedulaPrestaciones(Long cveIdPatronDictamen, Long cveIdAtestiguamiento) throws DictamenException {
	//---metodo con parametros  para acceder a TO de tipo List<CedulaPrestacionesTO>	
		
		List<CedulaPrestacionesTO> cedulaPrestacionesTOList = new ArrayList<CedulaPrestacionesTO>();
		//---crear objeto de List<CedulaPrestacionesTO>
		
		try{
			List<NdtB2CedulaPrestacionesDO> cedulaPrestacionesDOList = ndtB2CedulaPrestacionesDAO.findPrestacionByIdCedulaByImporte(cveIdPatronDictamen, 2L);
			//---interaccion con dao

			for(NdtB2CedulaPrestacionesDO ndtB2CedulaPrestacionesDO: cedulaPrestacionesDOList){ //iteramos la lista
				System.out.println("lo trae sin tranformar" + ndtB2CedulaPrestacionesDO.getCveIdPrestaciones().getDesPrestaciones());

				CedulaPrestacionesTO cedulaPrestacionesTO = TransformerServiceUtils.transformer(ndtB2CedulaPrestacionesDO);
				System.out.println("si transformaDO" + ndtB2CedulaPrestacionesDO.getCveIdPrestaciones().getDesPrestaciones());
				System.out.println("si transformaTO" + cedulaPrestacionesTO.getCveIdPrestaciones().getDesPrestaciones());
				cedulaPrestacionesTOList.add(cedulaPrestacionesTO);
			}
		}catch (Exception e) {
			LOG.error(e.getMessage(),e);
			throw DictamenExceptionBuilder.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_CARGAR_CEDULA_PRESTACIONES,e);
		
		}
		
		return cedulaPrestacionesTOList;
	}
}

