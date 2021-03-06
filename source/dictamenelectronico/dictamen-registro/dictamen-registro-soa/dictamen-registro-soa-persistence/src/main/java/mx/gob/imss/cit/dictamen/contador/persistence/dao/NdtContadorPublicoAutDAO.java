package mx.gob.imss.cit.dictamen.contador.persistence.dao;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.contador.model.NdtContadorPublicoAutDO;

@Local
public interface NdtContadorPublicoAutDAO {
	NdtContadorPublicoAutDO selectContadorPublicoAutByIdPersona(Long idPersona);
	NdtContadorPublicoAutDO selectContadorPublicoAutByNumRegistro(Integer numRegistroCPA);
}
