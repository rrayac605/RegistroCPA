package mx.gob.imss.cit.dictamen.contador.services;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.contador.commons.to.domain.PersonaMedioContactoTO;

@Local
public interface MedioContadorService {
	List<PersonaMedioContactoTO> consultarMedioContacto(Long idPersona);
	void insertarMedioContacto(PersonaMedioContactoTO personaMedioContactoTO);

}
