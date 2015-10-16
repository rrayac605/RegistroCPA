package mx.gob.imss.distss.dictamen.interfaces;

import javax.ejb.Local;

import mx.gob.imss.distss.dictamen.modelo.entidad.NdvDespachos;
import mx.gob.imss.distss.dictamen.table.model.Pagina;
import mx.gob.imss.distss.dictamen.table.model.Paginacion;

@Local
public interface DespachoDAOLocal {

	Pagina<NdvDespachos> consultaDespacho(Paginacion paginacion);

}
