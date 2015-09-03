package mx.gob.imss.cit.dictamen.services;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.commons.to.CuestionarioTO;
import mx.gob.imss.cit.solicitudPension.serviciosNegocio.ws.serviciosbdtu.ServiciosBDTU;

@Local
public interface CuestionarioService {

	void setPort(ServiciosBDTU port);

	List<CuestionarioTO> findCuestionarioById(Integer idCuestionario);
}
