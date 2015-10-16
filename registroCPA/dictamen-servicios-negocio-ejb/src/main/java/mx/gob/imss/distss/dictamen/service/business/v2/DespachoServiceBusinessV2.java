package mx.gob.imss.distss.dictamen.service.business.v2;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import mx.gob.imss.distss.dictamen.modelo.dto.NdtDespachosDTO;
import mx.gob.imss.distss.dictamen.modelo.entidad.NdtDespachos;
import mx.gob.imss.distss.dictamen.service.business.BaseServiceBusiness;
import mx.gob.imss.distss.dictamen.service.interfaces.v2.DespachoServiceLocalV2;
import mx.gob.imss.distss.dictamen.service.interfaces.v2.DespachoServiceRemoteV2;
import mx.gob.imss.distss.dictamen.service.util.ServiceMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

@Stateless(name  = "despachoServiceBusinessV2", mappedName = "despachoServiceBusinessV2")
public class DespachoServiceBusinessV2 extends BaseServiceBusiness implements DespachoServiceRemoteV2 {
	
	private static final Logger logger = LoggerFactory.getLogger(DespachoServiceBusinessV2.class);
	
	@EJB
    DespachoServiceLocalV2 despachoServiceLocalV2;
	
	@Override
	@Transactional
	public NdtDespachosDTO registroDespacho(NdtDespachosDTO ndtDespachosDTO) throws RuntimeException {
		try {
			NdtDespachos ndtDespachos = ServiceMapper.map(ndtDespachosDTO, NdtDespachos.class);
			despachoServiceLocalV2.saveOrUpdate(ndtDespachos);
			ndtDespachosDTO = ServiceMapper.map(ndtDespachos, NdtDespachosDTO.class);
		} catch (Exception ex) {
			logger.info("ERROR: En el Servicio de DespachoServiceBusinessV2, al registrar un Despacho.", ex);
			throw new RuntimeException("ERROR: En el Servicio de DespachoServiceBusinessV2, al registrar un Despacho.", ex);
		}
		return ndtDespachosDTO;
	}
	
	@Override
	public NdtDespachosDTO obtenerDespachoPorId(Long cveIdDespacho) throws RuntimeException {
		NdtDespachosDTO ndtDespachosDTO = null;
		try {
			NdtDespachos ndtDespachos = despachoServiceLocalV2.findById(cveIdDespacho);
			ndtDespachosDTO = ServiceMapper.map(ndtDespachos, NdtDespachosDTO.class);
		} catch (Exception ex) {
			logger.info("ERROR: En el Servicio de DespachoServiceBusinessV2, al intentar obtener por clave un Despacho.", ex);
			throw new RuntimeException("ERROR: En el Servicio de DespachoServiceBusinessV2, al intentar obtener por clave un Despacho.", ex);
		}
		return ndtDespachosDTO;
	}

}
