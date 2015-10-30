package mx.gob.imss.cit.dictamen.contador.services;

import mx.gob.imss.cit.dictamen.contador.commons.to.domain.GeneracionTramiteSolicitudTO;
import mx.gob.imss.cit.dictamen.contador.commons.to.domain.TramiteSolicitudTO;

public interface PensionInterfaceService {
	GeneracionTramiteSolicitudTO crearTramiteSolicitud(TramiteSolicitudTO tramiteSolicitudTO);
}
