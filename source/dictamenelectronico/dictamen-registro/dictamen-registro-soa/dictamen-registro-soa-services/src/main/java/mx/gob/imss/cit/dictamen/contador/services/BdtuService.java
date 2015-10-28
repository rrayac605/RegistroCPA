package mx.gob.imss.cit.dictamen.contador.services;



import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;

import mx.gob.imss.cit.dictamen.contador.commons.to.domain.CedulaTO;
import mx.gob.imss.cit.dictamen.contador.commons.to.domain.ContadorPublicoTO;
import mx.gob.imss.cit.dictamen.contador.model.NdtContadorPublicoAutDO;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Fisica;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Persona;

@Remote
public interface BdtuService {
   // Persona obtenerRegistroPersonaFisicaPorRFC(Persona persona);
  //  Fisica obtenerFisicaPorPersona(Persona persona);
	List<CedulaTO> obtenerCedulaPorIdPersona(Long idPersona);
	ContadorPublicoTO obtenerContadorPorIdPersona(Long idPersona);
	ContadorPublicoTO obtenerContadorPorNumRegistro(Integer NumRegistro);
}
