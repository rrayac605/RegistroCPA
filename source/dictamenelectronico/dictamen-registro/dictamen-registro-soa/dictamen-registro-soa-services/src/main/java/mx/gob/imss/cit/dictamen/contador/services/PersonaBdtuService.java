package mx.gob.imss.cit.dictamen.contador.services;

import java.util.List;

import mx.gob.imss.ctirss.delta.model.gestion.individuo.ICADatosConsulta;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.ICADatosRespuesta;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Persona;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.PersonaCalificacion;

public interface PersonaBdtuService {
	Persona consultarPersonaFisicaIMSSPorRFC(Persona persona);
	List<PersonaCalificacion> obtenerPersonaCalificaciones(Persona persona) throws RuntimeException;
	Persona registroPersona(Persona persona, boolean crearSolicitud) throws RuntimeException;
	
	ICADatosRespuesta identificarCambiosFisica(ICADatosConsulta icaDatosConsulta);
}
