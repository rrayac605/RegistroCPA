package mx.gob.imss.distss.dictamen.service.interfaces.v2;

import javax.ejb.Local;

import mx.gob.imss.distss.dictamen.modelo.entidad.NdtContadorPublicoAut;
import mx.gob.imss.distss.dictamen.service.interfaces.GenericDao;

@Local
public interface ContadorPublicoServiceLocalV2 extends GenericDao<NdtContadorPublicoAut, Long> {
	
	NdtContadorPublicoAut obtenerContadorPorIdPersona(Long idPersona);

}
