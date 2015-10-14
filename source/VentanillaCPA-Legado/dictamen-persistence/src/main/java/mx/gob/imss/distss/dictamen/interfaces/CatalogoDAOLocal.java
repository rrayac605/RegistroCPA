package mx.gob.imss.distss.dictamen.interfaces;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.distss.dictamen.modelo.entidad.DicDelegacion;
import mx.gob.imss.distss.dictamen.modelo.entidad.DicSubdelegacion;

@Local
public interface CatalogoDAOLocal {
	
	List<DicDelegacion> consultaDelegaciones();
	
	List<DicSubdelegacion> consultaSubdelegacionPorIdDelegacion(Long idDelegacion);

}
