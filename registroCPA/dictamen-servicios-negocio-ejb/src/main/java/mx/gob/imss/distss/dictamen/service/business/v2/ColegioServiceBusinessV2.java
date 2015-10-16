package mx.gob.imss.distss.dictamen.service.business.v2;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import mx.gob.imss.distss.dictamen.modelo.dto.NdtColegioDTO;
import mx.gob.imss.distss.dictamen.modelo.entidad.NdtColegio;
import mx.gob.imss.distss.dictamen.service.business.BaseServiceBusiness;
import mx.gob.imss.distss.dictamen.service.interfaces.SatServiceRemote;
import mx.gob.imss.distss.dictamen.service.interfaces.v2.ColegioServiceLocalV2;
import mx.gob.imss.distss.dictamen.service.interfaces.v2.ColegioServiceRemoteV2;
import mx.gob.imss.distss.dictamen.service.util.ServiceMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

@Stateless(name  = "colegioServiceBusinessV2", mappedName = "colegioServiceBusinessV2")
public class ColegioServiceBusinessV2 extends BaseServiceBusiness implements ColegioServiceRemoteV2 {
	
	private static final Logger logger = LoggerFactory.getLogger(ColegioServiceBusinessV2.class);
	
	@EJB
    ColegioServiceLocalV2 colegioServiceLocalV2;
	
	@EJB
    SatServiceRemote satServiceRemote;
	
	@Override
	@Transactional
	public NdtColegioDTO registroColegio(NdtColegioDTO ndtColegioDTO) throws RuntimeException {
		try {
			NdtColegio ndtColegio = ServiceMapper.map(ndtColegioDTO, NdtColegio.class);
			colegioServiceLocalV2.saveOrUpdate(ndtColegio);
			ndtColegioDTO = ServiceMapper.map(ndtColegio, NdtColegioDTO.class);
		} catch (Exception ex) {
			logger.info("ERROR: En el Servicio de DespachoServiceBusinessV2, al intentar registrar un Colegio.", ex);
			throw new RuntimeException("ERROR: En el Servicio de DespachoServiceBusinessV2, al intentar registrar un Colegio.", ex);
		}
		return ndtColegioDTO;
	}
	
	@Override
	public NdtColegioDTO obtenerColegioPorId(Long cveIdDespacho) throws RuntimeException {
		NdtColegioDTO ndtColegioDTO = null;
		try {
			NdtColegio ndtColegio = colegioServiceLocalV2.findById(cveIdDespacho);
			ndtColegioDTO = ServiceMapper.map(ndtColegio, NdtColegioDTO.class);
		} catch (Exception ex) {
			logger.info("ERROR: En el Servicio de ColegioServiceBusinessV2, al intentar obtener por clave un Colegio.", ex);
			throw new RuntimeException("ERROR: En el Servicio de ColegioServiceBusinessV2, al intentar obtener por clave un Colegio.", ex);
		}
		return ndtColegioDTO;
	}

}
