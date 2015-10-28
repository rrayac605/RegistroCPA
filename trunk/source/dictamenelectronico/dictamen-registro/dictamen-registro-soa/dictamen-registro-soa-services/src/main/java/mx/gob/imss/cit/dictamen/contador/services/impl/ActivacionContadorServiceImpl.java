package mx.gob.imss.cit.dictamen.contador.services.impl;

import java.util.Date;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.contador.commons.constants.ConstantesEstadosCPA;
import mx.gob.imss.cit.dictamen.contador.commons.to.domain.ActivarContadorTO;
import mx.gob.imss.cit.dictamen.contador.commons.to.domain.GeneracionTramiteSolicitudTO;
import mx.gob.imss.cit.dictamen.contador.commons.to.domain.TramiteSolicitudTO;
import mx.gob.imss.cit.dictamen.contador.model.NdcEstadoCpaDO;
import mx.gob.imss.cit.dictamen.contador.model.NdtContadorPublicoAutDO;
import mx.gob.imss.cit.dictamen.contador.model.NdtCpaEstatusDO;
import mx.gob.imss.cit.dictamen.contador.model.NdtCpaTramiteDO;
import mx.gob.imss.cit.dictamen.contador.persistence.dao.NdtContadorPublicoAutDAO;
import mx.gob.imss.cit.dictamen.contador.services.ActivacionContadorService;
import mx.gob.imss.cit.dictamen.contador.services.PensionInterfaceService;

@Stateless(name  = "activacionContadorService", mappedName = "activacionContadorService")
public class ActivacionContadorServiceImpl implements ActivacionContadorService {

	@EJB
	private NdtContadorPublicoAutDAO ndtContadorPublicoAutDAO;
	
	@EJB
	private PensionInterfaceService pensionInterfaceService;
	

	@Override
	public void insertarActivacionContador(TramiteSolicitudTO tramiteSolicitudTO, ActivarContadorTO activarContadorTO) {
		Long idPersona = 0L;
		NdtContadorPublicoAutDO ndtContadorPublicoAutDO = ndtContadorPublicoAutDAO.selectContadorPublicoAutByIdPersona(idPersona);
		NdcEstadoCpaDO ndcEstadoCpa = new NdcEstadoCpaDO();
		ndcEstadoCpa.setCveIdEstadoCpa(ConstantesEstadosCPA.ACTIVO);
	
		NdtCpaEstatusDO  ndtCpaEstatusDO = new NdtCpaEstatusDO();
		
		ndtCpaEstatusDO.setCveIdUsuario(activarContadorTO.getCveIdUsuario());
		ndtCpaEstatusDO.setDesComentarios(activarContadorTO.getDesComentarios());
		ndtCpaEstatusDO.setFecBaja(new Date());
		ndtCpaEstatusDO.setCveIdCpa(ndtContadorPublicoAutDO);
		ndtCpaEstatusDO.setCveIdEstadoCpa(ndcEstadoCpa);

		GeneracionTramiteSolicitudTO generacionTramiteSolicitudTO = pensionInterfaceService.crearTramiteSolicitud(tramiteSolicitudTO);

		NdtCpaTramiteDO  ndtCpaTramiteDO  = new NdtCpaTramiteDO();

		
		ndtCpaTramiteDO.setCveIdUsuario(activarContadorTO.getCveIdUsuario());
		ndtCpaTramiteDO.setFecRegistroAlta(new Date());
		ndtCpaTramiteDO.setCveIdCpaTramite(generacionTramiteSolicitudTO.getIdTramite());
		ndtCpaTramiteDO.setFecSolicitudMovimiento(new Date());
		ndtCpaTramiteDO.setUrlAcuseNotaria(activarContadorTO.getUrlAcuseNotaria());
		ndtCpaTramiteDO.setNumTramiteNotaria(activarContadorTO.getNumTramiteNotaria());
		//ndtCpaTramiteDO.setReciboNotaria(activarContadorTO.getReciboNotaria());
		ndtCpaEstatusDO.setCveIdCpaTramite(ndtCpaTramiteDO);
		
	}

	
	public NdtContadorPublicoAutDAO getNdtContadorPublicoAutDAO() {
		return ndtContadorPublicoAutDAO;
	}

	public void setNdtContadorPublicoAutDAO(
			NdtContadorPublicoAutDAO ndtContadorPublicoAutDAO) {
		this.ndtContadorPublicoAutDAO = ndtContadorPublicoAutDAO;
	}
}
