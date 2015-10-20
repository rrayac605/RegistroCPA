package mx.gob.imss.cit.dictamen.contador.services;


import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.contador.model.NdtContadorPublicoAutDO;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Fisica;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Persona;


@Local
public interface BdtuService {
    Persona obtenerRegistroPersonaFisicaPorRFC(Persona persona);
    Fisica obtenerFisicaPorPersona(Persona persona);
    NdtContadorPublicoAutDO obtenerContadorPorIdPersona(Long idPersona);
	
}