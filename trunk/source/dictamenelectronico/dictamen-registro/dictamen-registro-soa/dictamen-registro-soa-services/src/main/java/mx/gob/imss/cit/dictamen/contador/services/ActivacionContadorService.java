package mx.gob.imss.cit.dictamen.contador.services;

import mx.gob.imss.cit.dictamen.contador.commons.to.domain.ActivarContadorTO;
import mx.gob.imss.cit.dictamen.contador.commons.to.domain.TramiteSolicitudTO;

public interface ActivacionContadorService {
      void insertarActivacionContador(TramiteSolicitudTO tramiteSolicitudTO, ActivarContadorTO activarContadorTO);
}
