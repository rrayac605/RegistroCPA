/**
 * 
 */
package mx.gob.imss.cit.de.dictaminacion.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.de.dictaminacion.commons.enums.DictamenExceptionCodeEnum;
import mx.gob.imss.cit.de.dictaminacion.commons.exception.DictamenException;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.BitacoraErroresTO;
import mx.gob.imss.cit.de.dictaminacion.model.NdtBitacoraErroresDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdtBitacoraErroresDAO;
import mx.gob.imss.cit.de.dictaminacion.services.BitacoraErroresService;
import mx.gob.imss.cit.de.dictaminacion.services.transformer.TransformerServiceUtils;
import mx.gob.imss.cit.de.dictaminacion.services.util.DictamenExceptionBuilder;

/**
 * @author ajfuentes
 *
 */

@Stateless
public class BitacoraErroresServiceImpl implements BitacoraErroresService {

	
	private static final Logger LOG=Logger.getLogger(BitacoraErroresServiceImpl.class);
	
	@EJB
	private NdtBitacoraErroresDAO ndtBitacoraErroresDAO ;

 
	@Override
	public List<BitacoraErroresTO> findByIdCargaDocumento(Long idCargaDocumento) throws DictamenException {
		
		List<NdtBitacoraErroresDO> listaDO=null;
		List<BitacoraErroresTO> listaTO=new ArrayList<BitacoraErroresTO>();
		
		try{
			
			listaDO=ndtBitacoraErroresDAO.findByIdCargaDocumento(idCargaDocumento);
			
			for (NdtBitacoraErroresDO ndtBitacoraErroresDO : listaDO) {
				listaTO.add(TransformerServiceUtils.transformer(ndtBitacoraErroresDO));
			}
			
		}catch(Exception e){
			LOG.error(e.getMessage(),e);
			throw DictamenExceptionBuilder.build(DictamenExceptionCodeEnum.ERROR_SERVICIO_CONSULTA_BITACORA,e);
		}
		return listaTO;
	}

}
