package mx.gob.imss.distss.dictamen.interfaces;

import javax.ejb.Local;

import mx.gob.imss.distss.dictamen.modelo.entidad.NdvColegios;
import mx.gob.imss.distss.dictamen.table.model.Pagina;
import mx.gob.imss.distss.dictamen.table.model.Paginacion;

@Local
public interface ColegioDAOLocal {
	
	Pagina<NdvColegios> consultaColegio(Paginacion paginacion);

}
