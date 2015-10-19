package mx.gob.imss.cit.dictamen.contador.services;


import javax.ejb.Local;

import mx.gob.imss.ctirss.delta.model.gestion.individuo.ICADatosConsulta;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.ICADatosRespuesta;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Persona;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.PersonaCalificacion;


@Local
public interface BdtuService {
    Persona obtenerRegistroPersonaFisicaPorRFC(Persona persona);

	
	
}
