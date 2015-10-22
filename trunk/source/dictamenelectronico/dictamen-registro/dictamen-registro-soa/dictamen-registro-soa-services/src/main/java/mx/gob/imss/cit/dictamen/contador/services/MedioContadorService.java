package mx.gob.imss.cit.dictamen.contador.services;

import javax.ejb.Local;

@Local
public interface MedioContadorService {
   void consultarMedioContacto(Long idPersona);
}
